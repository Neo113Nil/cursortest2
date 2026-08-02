package ru.yandex.common.clid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import defpackage.aez;
import defpackage.g8e;
import defpackage.ny61;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes9.dex */
public class ClidManager {
    public static final int ACTIVE_APP_CHANGED = 2;
    public static final int ACTIVE_CLID_CHANGED = 1;
    public static final String CLID_APPLICATION;
    public static final String CLID_BAR;
    public static final String CLID_DELIMETER = "-";
    public static final String CLID_LABEL;
    public static final String CLID_PREFS = "clid";
    public static final String CLID_STARTUP;
    public static final String[] CLID_TYPE;
    public static final String CLID_WIDGET;
    public static final String EXTRA_CLID_TYPE = "clid_type";
    public static final String EXTRA_SHELL_CLID = "shell.clid";
    public static final String KEY_CLID = ".clid";
    public static final String[] KEY_CLID_TYPE = {"A", "B", CA20Status.STATUS_REQUEST_C, CA20Status.STATUS_REQUEST_D, "E"};
    public static final String KEY_FORMAT = "%s_%s";
    public static final int MAX_VERSION_APP_CHANGED = 3;
    private static final String SHARED_CLID_PREFERENCE_NAME = "__CLID_%s";
    private static final String SHARED_PREFERENCES_NAME = "clid_%s";
    public static final String TAG = "[YSearch:ClidManager]";
    private Set<OnActiveApplicationChangedListener> activeApplicationChangedListeners;
    private HashMap<String, String> activeApps;
    private HashMap<String, ClidItem> activeClids;
    private Set<OnActiveClidChangedListener> clidChangedListeners;
    private HashMap<String, ClidItem> localClids;
    private Set<OnMaxVersionApplicationChangedListener> maxVersionApplicationChangedListeners;
    private HashMap<String, String> maxVersionApps;
    private Set<OnReadyStateListener> readyStateListeners;
    private Context sContext;

    public static class ClidManagerHolder {
        private static final ClidManager INSTANCE = new ClidManager();

        private ClidManagerHolder() {
        }
    }

    /* loaded from: classes4.dex */
    public interface OnActiveApplicationChangedListener {
        void onActiveApplicationChanged(String str, String str2, String str3);
    }

    /* loaded from: classes4.dex */
    public interface OnActiveClidChangedListener {
        void onActiveClidChanged(String str, String str2, ClidItem clidItem);
    }

    /* loaded from: classes4.dex */
    public interface OnMaxVersionApplicationChangedListener {
        void onMaxVersionApplicationChanged(String str, String str2, String str3);
    }

    public interface OnReadyStateListener {
        void onReadyState();
    }

    static {
        String[] strArr = {"startup", "bar", "widget", "label", ClidProvider.APPLICATION};
        CLID_TYPE = strArr;
        CLID_STARTUP = strArr[0];
        CLID_BAR = strArr[1];
        CLID_WIDGET = strArr[2];
        CLID_LABEL = strArr[3];
        CLID_APPLICATION = strArr[4];
    }

    private ClidManager() {
        this.localClids = new HashMap<>();
        this.activeClids = new HashMap<>();
        this.activeApps = new HashMap<>();
        this.maxVersionApps = new HashMap<>();
        this.clidChangedListeners = new HashSet();
        this.activeApplicationChangedListeners = new HashSet();
        this.maxVersionApplicationChangedListeners = new HashSet();
        this.readyStateListeners = new HashSet();
    }

    private void firstStartAction() {
        SharedPreferences sharedPreferences = this.sContext.getSharedPreferences("clid", 0);
        if (sharedPreferences.contains(RemoteBioParameters.TIME)) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        long installationTime = ClidProvider.getInstallationTime(this.sContext.getPackageManager(), this.sContext.getPackageName());
        if (installationTime == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
            installationTime = System.currentTimeMillis();
        }
        edit.putLong(RemoteBioParameters.TIME, installationTime);
        edit.commit();
    }

    public static String getActiveClid() {
        return EXTRA_SHELL_CLID.equals(ClidType.getType()) ? ClidType.getClid() : getInstance().getClid(getInstance().sContext.getPackageName(), ClidType.getType());
    }

    public static ClidManager getInstance() {
        return ClidManagerHolder.INSTANCE;
    }

    private String getKey(String str, String str2) {
        return g8e.p(str, "_", str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getLocalInstallationTime() {
        long installationTime = ClidProvider.getInstallationTime(this.sContext.getPackageManager(), this.sContext.getPackageName());
        if (installationTime < ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
            return installationTime;
        }
        long j = this.sContext.getSharedPreferences("clid", 0).getLong(RemoteBioParameters.TIME, ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
        return j < ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED ? j : System.currentTimeMillis();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x004a, code lost:
    
        if ("215389".equals(r1) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String getOldClid(String str) {
        SharedPreferences sharedPreferences = this.sContext.getSharedPreferences("clid_" + str, 0);
        String str2 = null;
        String string = sharedPreferences.getString("__CLID_" + str, null);
        if (str.equals("ru.yandex.searchplugin")) {
            if (TextUtils.isEmpty(string)) {
                string = this.sContext.getSharedPreferences("settings", 0).getString("clid", null);
            }
        }
        str2 = string;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.remove("__CLID_".concat(str));
        edit.commit();
        return str2;
    }

    private int getVersionCode() {
        try {
            return this.sContext.getPackageManager().getPackageInfo(this.sContext.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            aez.c();
            return 0;
        }
    }

    public static boolean isInReadyState() {
        ClidProvider.getInstance().logDatabase();
        return true;
    }

    private void loadClidsFromDatabase() {
        try {
            Iterator<ClidItem> it = ClidProvider.getInstance().getApplicationClids(getInstance().sContext.getPackageName()).iterator();
            while (it.hasNext()) {
                setLocalClid(it.next());
            }
        } catch (Exception unused) {
            aez.c();
        }
    }

    private void notifyActiveApplicationChanged(String str, String str2, String str3) {
        this.sContext.getPackageName();
        aez.c();
        Iterator<OnActiveApplicationChangedListener> it = this.activeApplicationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().onActiveApplicationChanged(str, str2, str3);
        }
    }

    private void notifyClidChanged(String str, String str2, ClidItem clidItem) {
        this.sContext.getPackageName();
        clidItem.getClid();
        aez.c();
        for (OnActiveClidChangedListener onActiveClidChangedListener : (OnActiveClidChangedListener[]) this.clidChangedListeners.toArray(new OnActiveClidChangedListener[this.clidChangedListeners.size()])) {
            onActiveClidChangedListener.onActiveClidChanged(str, str2, clidItem);
        }
    }

    private void notifyMaxVersionApplicationChanged(String str, String str2, String str3) {
        this.sContext.getPackageName();
        aez.c();
        Iterator<OnMaxVersionApplicationChangedListener> it = this.maxVersionApplicationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().onMaxVersionApplicationChanged(str, str2, str3);
        }
    }

    private void notifyReadyState() {
        this.sContext.getPackageName();
        aez.c();
        for (OnReadyStateListener onReadyStateListener : (OnReadyStateListener[]) this.readyStateListeners.toArray(new OnReadyStateListener[this.readyStateListeners.size()])) {
            onReadyStateListener.onReadyState();
        }
    }

    private List<ClidItem> parseManifest(String str) {
        try {
            Bundle bundle = this.sContext.getPackageManager().getApplicationInfo(this.sContext.getPackageName(), 128).metaData;
            if (bundle != null) {
                String string = bundle.getString(str + KEY_CLID);
                if (string != null) {
                    return parseString(str, string);
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            aez.a(TAG, "Clids aren't found in AndroidManifest!", e);
        }
        return new ArrayList();
    }

    private List<ClidItem> parseRawResources(String str) {
        try {
            return parseXml(str);
        } catch (Resources.NotFoundException e) {
            aez.a(TAG, "Clids aren't found in raw resources!", e);
            return new ArrayList();
        }
    }

    private List<ClidItem> parseResources(String str) {
        try {
            Context context = this.sContext;
            return parseString(str, context.getString(context.getResources().getIdentifier((str + KEY_CLID).replace(Extension.DOT_CHAR, "_"), "string", this.sContext.getPackageName())));
        } catch (Resources.NotFoundException e) {
            aez.a(TAG, "Clids aren't found in Resources!", e);
            return new ArrayList();
        }
    }

    private List<ClidItem> parseString(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (str2 != null) {
            String[] split = str2.split("-");
            int versionCode = getVersionCode();
            for (String str3 : split) {
                if (str3.contains(":")) {
                    String[] split2 = str3.split(":");
                    if (split2.length == 2) {
                        arrayList.add(new ClidItem(str, split2[0], this.sContext.getPackageName(), versionCode, getLocalInstallationTime(), split2[1]));
                    }
                } else {
                    int i = 0;
                    while (true) {
                        String[] strArr = KEY_CLID_TYPE;
                        if (i < strArr.length) {
                            if (str3.startsWith(strArr[i])) {
                                arrayList.add(new ClidItem(str, CLID_TYPE[i], this.sContext.getPackageName(), versionCode, getLocalInstallationTime(), str3.replace(strArr[i], "")));
                            }
                            i++;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private List<ClidItem> parseXml(final String str) {
        final ArrayList arrayList = new ArrayList();
        InputStream openRawResource = this.sContext.getResources().openRawResource(this.sContext.getResources().getIdentifier("raw/clids", null, this.sContext.getPackageName()));
        final int versionCode = getVersionCode();
        try {
            SAXParserFactory.newInstance().newSAXParser().parse(openRawResource, new DefaultHandler() { // from class: ru.yandex.common.clid.ClidManager.1
                private StringBuffer accumulator = new StringBuffer();

                @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
                public void characters(char[] cArr, int i, int i2) throws SAXException {
                    super.characters(cArr, i, i2);
                    this.accumulator.append(cArr, i, i2);
                }

                @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
                public void endElement(String str2, String str3, String str4) throws SAXException {
                    super.endElement(str2, str3, str4);
                    if (str3.startsWith("clid")) {
                        arrayList.add(new ClidItem(str, str3, ClidManager.this.sContext.getPackageName(), versionCode, ClidManager.this.getLocalInstallationTime(), this.accumulator.toString().trim()));
                    }
                }

                @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
                public void startElement(String str2, String str3, String str4, Attributes attributes) throws SAXException {
                    super.startElement(str2, str3, str4, attributes);
                    this.accumulator.setLength(0);
                }
            });
        } catch (Exception unused) {
        }
        return arrayList;
    }

    private static void registerClidsInDatabase() {
        getInstance().sContext.getPackageName();
        aez.c();
        Iterator<ClidItem> it = getInstance().getLocalClids().iterator();
        while (it.hasNext()) {
            ClidProvider.getInstance().addOrUpdateClid(it.next());
        }
        ClidProvider.getInstance().setApplicationState(getInstance().sContext.getPackageName(), ClidProvider.APP_ACTIVE);
    }

    public void activeApplicationChanged(String str, String str2, String str3) {
        String key = getKey(str, str2);
        if (str3 == null && this.activeApps.containsKey(key)) {
            this.activeApps.remove(key);
            notifyActiveApplicationChanged(str, str2, str3);
        } else {
            if (str3.equals(this.activeApps.get(key))) {
                return;
            }
            this.activeApps.put(key, str3);
            notifyActiveApplicationChanged(str, str2, str3);
        }
    }

    public void activeClidChanged(String str, String str2, ClidItem clidItem) {
        String key = getKey(str, str2);
        if (clidItem == null && this.activeClids.containsKey(key)) {
            this.activeClids.remove(key);
            notifyClidChanged(str, str2, clidItem);
        } else {
            if (clidItem.equals(this.activeClids.get(key))) {
                return;
            }
            this.activeClids.put(key, clidItem);
            notifyClidChanged(str, str2, clidItem);
        }
    }

    public void addActiveApplicationChangedListener(OnActiveApplicationChangedListener onActiveApplicationChangedListener) {
        this.activeApplicationChangedListeners.add(onActiveApplicationChangedListener);
    }

    public void addActiveClidChangedListener(OnActiveClidChangedListener onActiveClidChangedListener) {
        this.clidChangedListeners.add(onActiveClidChangedListener);
    }

    public void addMaxVersionApplicationChangedListener(OnMaxVersionApplicationChangedListener onMaxVersionApplicationChangedListener) {
        this.maxVersionApplicationChangedListeners.add(onMaxVersionApplicationChangedListener);
    }

    public void addOnReadyStateListener(OnReadyStateListener onReadyStateListener) {
        this.readyStateListeners.add(onReadyStateListener);
    }

    public String getActiveClidApplication(String str, String str2) {
        return this.activeApps.get(getKey(str, str2));
    }

    public String getClid(String str, String str2) {
        return getClidItem(str, str2).getClid();
    }

    public ClidItem getClidItem(String str, String str2) {
        ClidItem clidItem = this.activeClids.get(getKey(str, str2));
        if (clidItem != null) {
            return clidItem;
        }
        ny61.f("Error: Clid information not found! Make sure you have added meta-data with clid information in AndroidManifest.xml");
        return null;
    }

    public String getLocalClid(String str, String str2) {
        return getLocalClidItem(str, str2).getClid();
    }

    public ClidItem getLocalClidItem(String str, String str2) {
        ClidItem clidItem = this.localClids.get(getKey(str, str2));
        if (clidItem != null) {
            return clidItem;
        }
        ny61.f("Error: Clid information not found! Make sure you have added meta-data with clid information in AndroidManifest.xml");
        return null;
    }

    public ArrayList<ClidItem> getLocalClids() {
        return new ArrayList<>(this.localClids.values());
    }

    public String getMaxVersionApplication(String str, String str2) {
        return this.maxVersionApps.get(getKey(str, str2));
    }

    public void initContext(Context context) {
        this.sContext = context;
        ClidProvider.getInstance().initContext(context);
        firstStartAction();
    }

    public void maxVersionApplicationChanged(String str, String str2, String str3) {
        String key = getKey(str, str2);
        this.sContext.getPackageName();
        aez.c();
        ClidItem clid = ClidProvider.getInstance().getClid(str, str2, str);
        List<String> applications = ClidProvider.getInstance().getApplications();
        if (clid != null && applications.contains(str)) {
            str3 = str;
        }
        if (str3 == null && this.maxVersionApps.containsKey(key)) {
            this.maxVersionApps.remove(key);
            notifyMaxVersionApplicationChanged(str, str2, str3);
        } else {
            if (str3.equals(this.maxVersionApps.get(key))) {
                return;
            }
            this.maxVersionApps.put(key, str3);
            notifyMaxVersionApplicationChanged(str, str2, str3);
        }
    }

    public void registerManifestClids(String str) {
        String[] split = str.split(":");
        ArrayList arrayList = new ArrayList(split.length + 1);
        arrayList.addAll(Arrays.asList(split));
        arrayList.add(this.sContext.getPackageName());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            List<ClidItem> parseManifest = parseManifest(str2);
            if (parseManifest == null || parseManifest.size() == 0) {
                parseManifest = parseResources(str2);
            }
            if (parseManifest == null || parseManifest.size() == 0) {
                parseManifest = parseRawResources(str2);
            }
            String oldClid = getOldClid(str2);
            aez.c();
            for (ClidItem clidItem : parseManifest) {
                if (oldClid != null) {
                    try {
                        String[] split2 = oldClid.split("\\|");
                        if (split2.length == 2) {
                            clidItem.clid = split2[1];
                            clidItem.time = Long.parseLong(split2[0]);
                            aez.c();
                        } else if (split2.length == 1) {
                            clidItem.clid = oldClid;
                            clidItem.time = System.currentTimeMillis();
                            aez.c();
                        }
                    } catch (NumberFormatException unused) {
                        if (aez.c()) {
                            Log.e(TAG, "Can't parse time of old clid");
                        }
                    }
                }
                setLocalClid(clidItem);
            }
        }
        loadClidsFromDatabase();
        registerClidsInDatabase();
        update();
    }

    public void removeActiveApplicationChangedListener(OnActiveApplicationChangedListener onActiveApplicationChangedListener) {
        this.activeApplicationChangedListeners.remove(onActiveApplicationChangedListener);
    }

    public void removeActiveClidChangedListener(OnActiveClidChangedListener onActiveClidChangedListener) {
        this.clidChangedListeners.remove(onActiveClidChangedListener);
    }

    public void removeMaxVersionApplicationChangedListener(OnMaxVersionApplicationChangedListener onMaxVersionApplicationChangedListener) {
        this.maxVersionApplicationChangedListeners.remove(onMaxVersionApplicationChangedListener);
    }

    public void removeOnReadyStateListener(OnReadyStateListener onReadyStateListener) {
        this.readyStateListeners.remove(onReadyStateListener);
    }

    public void setLocalClid(ClidItem clidItem) {
        String key = getKey(clidItem.identity, clidItem.type);
        this.localClids.put(key, clidItem);
        if (this.activeClids.containsKey(key)) {
            return;
        }
        this.activeClids.put(key, clidItem);
    }

    public void update() {
        this.sContext.getPackageName();
        aez.c();
        for (ClidItem clidItem : this.localClids.values()) {
            activeClidChanged(clidItem.identity, clidItem.type, ClidProvider.getInstance().getActiveClid(clidItem.identity, clidItem.type));
            activeApplicationChanged(clidItem.identity, clidItem.type, ClidProvider.getInstance().getActiveClidApplication(clidItem.identity, clidItem.type));
            maxVersionApplicationChanged(clidItem.identity, clidItem.type, ClidProvider.getInstance().getMaxVersionApplication(clidItem.identity, clidItem.type));
        }
        if (isInReadyState()) {
            notifyReadyState();
        }
    }
}
