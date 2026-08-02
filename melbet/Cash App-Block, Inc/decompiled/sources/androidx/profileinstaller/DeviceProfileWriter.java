package androidx.profileinstaller;

import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.os.Build;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.view.PreviewView;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.media3.common.util.ListenerSet$$ExternalSyntheticLambda1;
import androidx.profileinstaller.ProfileInstaller;
import app.cash.arcade.protocol.host.ArcadeHostProtocol;
import app.cash.redwood.leaks.NoOpLeakDetector;
import app.cash.redwood.protocol.Id;
import app.cash.redwood.protocol.host.ProtocolNode;
import app.cash.redwood.protocol.host.RootProtocolNode;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.request.OneShotDisposable;
import com.caverock.androidsvg.SVG;
import com.fillr.browsersdk.model.FillrMappedField;
import com.fillr.browsersdk.model.FillrMappingProcessor;
import com.fillr.core.utilities.AppPreferenceStore;
import com.fillr.core.validator.CreditcardTypeValidator;
import com.fillr.featuretoggle.UnleashContext;
import com.fillr.service.CaptureFieldsMappingService;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.collections.ArrayDeque;
import kotlin.text.MatchResult;
import net.idrnd.face.iad.capture.internal.o0;
import net.oneformapp.ProfileStore_;
import net.oneformapp.helper.CalendarConverter;
import net.oneformapp.schema.Element;
import net.oneformapp.schema.Schema_;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class DeviceProfileWriter {
    public Object mApkName;
    public final Object mAssetManager;
    public final Object mCurProfile;
    public final Object mDesiredVersion;
    public boolean mDeviceSupportsAotProfile;
    public final Object mDiagnostics;
    public final Object mExecutor;
    public Object mProfile;
    public Object mTranscodedProfile;

    public DeviceProfileWriter(String str, UnleashContext unleashContext, ArcadeHostProtocol arcadeHostProtocol, SVG svg, SVG svg2, NoOpLeakDetector noOpLeakDetector) {
        str.getClass();
        unleashContext.getClass();
        arcadeHostProtocol.getClass();
        svg.getClass();
        svg2.getClass();
        this.mAssetManager = svg2;
        this.mExecutor = noOpLeakDetector;
        this.mDiagnostics = arcadeHostProtocol;
        Id.Companion.getClass();
        RootProtocolNode rootProtocolNode = new RootProtocolNode(unleashContext);
        MutableIntObjectMap mutableIntObjectMap = IntObjectMapKt.EmptyIntObjectMap;
        MutableIntObjectMap mutableIntObjectMap2 = new MutableIntObjectMap();
        mutableIntObjectMap2.set(0, rootProtocolNode);
        this.mDesiredVersion = mutableIntObjectMap2;
        this.mTranscodedProfile = new PreviewView.AnonymousClass1(this, false);
        MutableScatterSet mutableScatterSet = ScatterSetKt.EmptyScatterSet;
        this.mCurProfile = new MutableScatterSet();
        this.mApkName = new ArrayDeque();
        this.mProfile = svg;
    }

    public static Element findProfileElement(String str, ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (str.equals(((Element) arrayList.get(i)).actingElement().pathKey)) {
                return (Element) arrayList.get(i);
            }
        }
        return null;
    }

    public static String getFormFieldKey(String str, Element element, Element element2) {
        String str2 = element2.actingElement().pathKey;
        return Toolbar.AnonymousClass1.extractIndex(str) != -1 ? str2.replace(element.actingElement().pathKey, str) : str2;
    }

    public boolean containsValidAddressData(String str, Element element) {
        boolean z = false;
        boolean z2 = false;
        for (Element element2 : element.actingElement().children) {
            String valueForField = getValueForField(getFormFieldKey(str, element, element2));
            if (valueForField != null && valueForField.trim().length() > 0) {
                String str2 = element2.actingElement().pathKey;
                if (str2 == null || !str2.endsWith("StreetNumber")) {
                    String str3 = element2.actingElement().pathKey;
                    if (str3 != null && str3.endsWith("StreetName")) {
                        z2 = true;
                    }
                } else {
                    z = true;
                }
            }
        }
        return z && z2;
    }

    public void createNewArrayForFieldMapping(HashMap hashMap, String str, Element element, Element element2, Element element3) {
        OneShotDisposable oneShotDisposable;
        AppPreferenceStore appPreferenceStore = (AppPreferenceStore) this.mAssetManager;
        FillrMappingProcessor fillrMappingProcessor = (FillrMappingProcessor) this.mExecutor;
        Toolbar.AnonymousClass1 anonymousClass1 = (Toolbar.AnonymousClass1) this.mCurProfile;
        if (element.isAddress()) {
            if (!containsValidAddressData(str, element)) {
                return;
            }
        } else if (element.isCreditcard()) {
            Iterator it = element.actingElement().children.iterator();
            while (it.hasNext()) {
                String valueForField = getValueForField(getFormFieldKey(str, element, (Element) it.next()));
                if (valueForField == null || valueForField.trim().length() <= 0 || valueForField.trim().length() <= 13) {
                }
            }
            return;
        }
        anonymousClass1.addNamespaceToProfile(element3, true);
        ArrayList readAllArrayElemetsForNameSpace = anonymousClass1.readAllArrayElemetsForNameSpace(element2);
        int size = readAllArrayElemetsForNameSpace.size() - 1;
        Element element4 = (Element) readAllArrayElemetsForNameSpace.get(size);
        String str2 = element4.actingElement().pathKey;
        if (element.isAddress()) {
            StringBuilder sb = new StringBuilder();
            Iterator it2 = element.actingElement().children.iterator();
            while (it2.hasNext()) {
                String valueForField2 = getValueForField(getFormFieldKey(str, element, (Element) it2.next()));
                if (valueForField2 != null && valueForField2.trim().length() > 0 && !sb.toString().contains(valueForField2)) {
                    if (sb.length() != 0) {
                        sb.append(" ");
                    }
                    sb.append(valueForField2);
                }
            }
            if (!element4.isAddress() || (oneShotDisposable = (OneShotDisposable) this.mApkName) == null) {
                return;
            }
            oneShotDisposable.convertQueryToAddress(str, sb.toString(), fillrMappingProcessor.getDomain(), element4);
            return;
        }
        Iterator it3 = element4.actingElement().children.iterator();
        while (it3.hasNext()) {
            updateProfileArrayElement(hashMap, str, element, (Element) it3.next());
        }
        try {
            appPreferenceStore.setSelectedArrayIndex(size, fillrMappingProcessor.getDomain(), str);
            SharedPreferences sharedPreferences = appPreferenceStore.mPreferences;
            if (sharedPreferences != null) {
                Set<String> stringSet = sharedPreferences != null ? sharedPreferences.getStringSet("F_LAST_CREATED_ARRAYS", null) : null;
                if (stringSet == null) {
                    stringSet = new HashSet<>();
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(str, str2);
                stringSet.add(jSONObject.toString());
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putStringSet("F_LAST_CREATED_ARRAYS", stringSet);
                edit.apply();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public boolean deviceAllowsProfileInstallerAotWrites() {
        File file = (File) this.mCurProfile;
        if (((byte[]) this.mDesiredVersion) == null) {
            result(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!file.exists()) {
            try {
                if (!file.createNewFile()) {
                    result(4, null);
                    return false;
                }
            } catch (IOException unused) {
                result(4, null);
                return false;
            }
        } else if (!file.canWrite()) {
            result(4, null);
            return false;
        }
        this.mDeviceSupportsAotProfile = true;
        return true;
    }

    public String getProfilePathIfExists(String str) {
        if (str != null) {
            try {
                SharedPreferences sharedPreferences = ((AppPreferenceStore) this.mAssetManager).mPreferences;
                Set<String> stringSet = sharedPreferences != null ? sharedPreferences.getStringSet("F_LAST_CREATED_ARRAYS", null) : null;
                if (stringSet != null) {
                    for (String str2 : stringSet) {
                        if (str2.contains(str)) {
                            JSONObject jSONObject = new JSONObject(str2);
                            if (jSONObject.has(str)) {
                                return jSONObject.getString(str);
                            }
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public String getValueForField(String str) {
        FillrMappingProcessor fillrMappingProcessor = (FillrMappingProcessor) this.mExecutor;
        HashMap hashMap = fillrMappingProcessor.fieldNamespaces;
        HashMap hashMap2 = fillrMappingProcessor.mFieldValues;
        FillrMappedField fillrMappedField = (FillrMappedField) hashMap.get(str);
        return fillrMappedField != null ? (String) hashMap2.get(Integer.toString(fillrMappedField.popId)) : "";
    }

    /* renamed from: node-ou3jOuA$redwood_protocol_host, reason: not valid java name */
    public ProtocolNode m1160nodeou3jOuA$redwood_protocol_host(int i) {
        Object obj = ((MutableIntObjectMap) this.mDesiredVersion).get(i);
        if (obj != null) {
            return (ProtocolNode) obj;
        }
        Path$$ExternalSyntheticBUOutline0.m((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Unknown widget ID "));
        return null;
    }

    public FileInputStream openStreamFromAssets(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((ProfileInstaller.DiagnosticsCallback) this.mDiagnostics).onDiagnosticReceived();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DeviceProfileWriter read() {
        FileInputStream fileInputStream;
        DexProfileData[] dexProfileDataArr;
        DexProfileData[] dexProfileDataArr2;
        FileInputStream openStreamFromAssets;
        AssetManager assetManager = (AssetManager) this.mAssetManager;
        ProfileInstaller.DiagnosticsCallback diagnosticsCallback = (ProfileInstaller.DiagnosticsCallback) this.mDiagnostics;
        DeviceProfileWriter deviceProfileWriter = null;
        if (!this.mDeviceSupportsAotProfile) {
            a$$ExternalSyntheticBUOutline0.m$1("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
            return null;
        }
        byte[] bArr = (byte[]) this.mDesiredVersion;
        if (bArr != null) {
            try {
                try {
                    fileInputStream = openStreamFromAssets(assetManager, "dexopt/baseline.prof");
                } catch (FileNotFoundException e) {
                    diagnosticsCallback.onResultReceived(6, e);
                    fileInputStream = null;
                    if (fileInputStream != null) {
                    }
                    dexProfileDataArr2 = (DexProfileData[]) this.mProfile;
                    if (dexProfileDataArr2 != null) {
                        try {
                            openStreamFromAssets = openStreamFromAssets(assetManager, "dexopt/baseline.profm");
                            if (openStreamFromAssets == null) {
                            }
                        } catch (FileNotFoundException e2) {
                            diagnosticsCallback.onResultReceived(9, e2);
                        } catch (IOException e3) {
                            diagnosticsCallback.onResultReceived(7, e3);
                        } catch (IllegalStateException e4) {
                            this.mProfile = null;
                            diagnosticsCallback.onResultReceived(8, e4);
                        }
                        if (deviceProfileWriter == null) {
                        }
                    }
                    return this;
                } catch (IOException e5) {
                    diagnosticsCallback.onResultReceived(7, e5);
                    fileInputStream = null;
                    if (fileInputStream != null) {
                    }
                    dexProfileDataArr2 = (DexProfileData[]) this.mProfile;
                    if (dexProfileDataArr2 != null) {
                    }
                    return this;
                }
                if (fileInputStream != null) {
                    try {
                    } catch (IOException e6) {
                        diagnosticsCallback.onResultReceived(7, e6);
                        try {
                            fileInputStream.close();
                        } catch (IOException e7) {
                            diagnosticsCallback.onResultReceived(7, e7);
                        }
                        dexProfileDataArr = null;
                        this.mProfile = dexProfileDataArr;
                        dexProfileDataArr2 = (DexProfileData[]) this.mProfile;
                        if (dexProfileDataArr2 != null) {
                        }
                        return this;
                    } catch (IllegalStateException e8) {
                        diagnosticsCallback.onResultReceived(8, e8);
                        fileInputStream.close();
                        dexProfileDataArr = null;
                        this.mProfile = dexProfileDataArr;
                        dexProfileDataArr2 = (DexProfileData[]) this.mProfile;
                        if (dexProfileDataArr2 != null) {
                        }
                        return this;
                    }
                    if (!Arrays.equals(Encoding.MAGIC_PROF, Encoding.read(fileInputStream, 4))) {
                        throw new IllegalStateException("Invalid magic");
                    }
                    dexProfileDataArr = Encoding.readProfile(fileInputStream, Encoding.read(fileInputStream, 4), (String) this.mApkName);
                    this.mProfile = dexProfileDataArr;
                }
                dexProfileDataArr2 = (DexProfileData[]) this.mProfile;
                if (dexProfileDataArr2 != null && Build.VERSION.SDK_INT >= 31) {
                    openStreamFromAssets = openStreamFromAssets(assetManager, "dexopt/baseline.profm");
                    if (openStreamFromAssets == null) {
                        try {
                            if (!Arrays.equals(Encoding.MAGIC_PROFM, Encoding.read(openStreamFromAssets, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            this.mProfile = Encoding.readMeta(openStreamFromAssets, Encoding.read(openStreamFromAssets, 4), bArr, dexProfileDataArr2);
                            openStreamFromAssets.close();
                            deviceProfileWriter = this;
                        } finally {
                        }
                    } else if (openStreamFromAssets != null) {
                        openStreamFromAssets.close();
                    }
                    if (deviceProfileWriter == null) {
                        return deviceProfileWriter;
                    }
                }
            } finally {
                try {
                    fileInputStream.close();
                } catch (IOException e9) {
                    diagnosticsCallback.onResultReceived(7, e9);
                }
            }
        }
        return this;
    }

    public void result(int i, Serializable serializable) {
        ((Executor) this.mExecutor).execute(new ListenerSet$$ExternalSyntheticLambda1(this, i, serializable, 4));
    }

    public void transcodeIfNeeded() {
        ByteArrayOutputStream byteArrayOutputStream;
        ProfileInstaller.DiagnosticsCallback diagnosticsCallback = (ProfileInstaller.DiagnosticsCallback) this.mDiagnostics;
        DexProfileData[] dexProfileDataArr = (DexProfileData[]) this.mProfile;
        byte[] bArr = (byte[]) this.mDesiredVersion;
        if (dexProfileDataArr == null || bArr == null) {
            return;
        }
        if (!this.mDeviceSupportsAotProfile) {
            a$$ExternalSyntheticBUOutline0.m$1("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
            return;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(Encoding.MAGIC_PROF);
                byteArrayOutputStream.write(bArr);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            diagnosticsCallback.onResultReceived(7, e);
        } catch (IllegalStateException e2) {
            diagnosticsCallback.onResultReceived(8, e2);
        }
        if (Encoding.transcodeAndWriteBody(byteArrayOutputStream, bArr, dexProfileDataArr)) {
            this.mTranscodedProfile = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.mProfile = null;
        } else {
            diagnosticsCallback.onResultReceived(5, null);
            this.mProfile = null;
            byteArrayOutputStream.close();
        }
    }

    public void updateProfileArrayElement(HashMap hashMap, String str, Element element, Element element2) {
        String creditcardType;
        String validMonthYearOrDateElementValue;
        String str2 = element2.actingElement().pathKey;
        String formattedPathKey = element2.getFormattedPathKey();
        ((Toolbar.AnonymousClass1) this.mCurProfile).getClass();
        Element findChildElementRecursively = Toolbar.AnonymousClass1.findChildElementRecursively(formattedPathKey, element);
        String str3 = null;
        String formFieldKey = findChildElementRecursively != null ? getFormFieldKey(str, element, findChildElementRecursively) : null;
        ProfileStore_ profileStore_ = (ProfileStore_) this.mDiagnostics;
        String data = profileStore_.getData(str2);
        Element element3 = ((Schema_) this.mTranscodedProfile).getElement(element2.getFormattedPathKey());
        if (!element3.hasChildElements()) {
            String valueForField = getValueForField(formFieldKey);
            if (!element2.isCreditcardNumber() || valueForField.matches("^[0-9]+$")) {
                if (valueForField != null && valueForField.length() > 0 && !valueForField.equals(data)) {
                    hashMap.put(str2, valueForField);
                }
                if (!element2.isCreditcardNumber() || (creditcardType = CreditcardTypeValidator.getCreditcardType(valueForField)) == null || element2.actingElement().parentPathKey == null) {
                    return;
                }
                String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), element2.actingElement().parentPathKey, ".Type");
                if (creditcardType.equals(profileStore_.getData(m))) {
                    return;
                }
                hashMap.put(m, creditcardType);
                return;
            }
            return;
        }
        if (element3.actingElement().elementTypeName.equals("MonthYearType") || element3.actingElement().elementTypeName.equals("DateType")) {
            List<Element> list = element3.actingElement().children;
            HashMap hashMap2 = new HashMap();
            String str4 = null;
            String str5 = null;
            for (Element element4 : list) {
                StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m(str2, ".");
                List list2 = list;
                m108m.append(element4.actingElement().elementName);
                String sb = m108m.toString();
                StringBuilder m108m2 = Recorder$$ExternalSyntheticOutline2.m108m(formFieldKey, ".");
                m108m2.append(element4.actingElement().elementName);
                String valueForField2 = getValueForField(m108m2.toString());
                String data2 = profileStore_.getData(sb);
                if (valueForField2 != null && valueForField2.length() > 0 && !valueForField2.equals(data2)) {
                    hashMap2.put(sb, valueForField2);
                    if (element4.actingElement().elementName.contains("Day")) {
                        list = list2;
                        str3 = valueForField2;
                    } else if (element4.actingElement().elementName.contains("Month")) {
                        list = list2;
                        str4 = valueForField2;
                    } else if (element4.actingElement().elementName.contains("Year")) {
                        list = list2;
                        str5 = valueForField2;
                    }
                }
                list = list2;
            }
            if (hashMap2.size() != list.size() || (validMonthYearOrDateElementValue = validMonthYearOrDateElementValue(str3, str4, str5, element3)) == null || validMonthYearOrDateElementValue.equals(data)) {
                return;
            }
            hashMap2.put(str2, validMonthYearOrDateElementValue);
            hashMap.putAll(hashMap2);
        }
    }

    public String validMonthYearOrDateElementValue(String str, String str2, String str3, Element element) {
        int i = ((Schema_) this.mTranscodedProfile).getElementType(element).f1544type;
        if (i == 3) {
            Calendar fromString = CalendarConverter.fromString(str + "-" + str2 + "-" + str3);
            if (fromString == null) {
                return null;
            }
            return new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).format(fromString.getTime());
        }
        if (i != 4) {
            return null;
        }
        Calendar fromMonthYearString = CalendarConverter.fromMonthYearString(str2 + "-" + str3);
        if (fromMonthYearString == null) {
            return null;
        }
        return new SimpleDateFormat("MM-yyyy", Locale.ENGLISH).format(fromMonthYearString.getTime());
    }

    public void watchForLeaksAndDetach(ProtocolNode protocolNode, String str) {
        NoOpLeakDetector noOpLeakDetector = (NoOpLeakDetector) this.mExecutor;
        noOpLeakDetector.watchReference(protocolNode.getWidget().getValue(), str);
        noOpLeakDetector.watchReference(protocolNode.getWidget(), str);
        noOpLeakDetector.watchReference(protocolNode, str);
        protocolNode.detach();
    }

    public boolean write() {
        byte[] bArr = (byte[]) this.mTranscodedProfile;
        if (bArr != null) {
            if (!this.mDeviceSupportsAotProfile) {
                a$$ExternalSyntheticBUOutline0.m$1("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                return false;
            }
            try {
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream((File) this.mCurProfile);
                        try {
                            FileChannel channel = fileOutputStream.getChannel();
                            try {
                                FileLock tryLock = channel.tryLock();
                                if (tryLock != null) {
                                    try {
                                        if (tryLock.isValid()) {
                                            byte[] bArr2 = new byte[512];
                                            while (true) {
                                                int read = byteArrayInputStream.read(bArr2);
                                                if (read <= 0) {
                                                    result(1, null);
                                                    tryLock.close();
                                                    channel.close();
                                                    fileOutputStream.close();
                                                    byteArrayInputStream.close();
                                                    return true;
                                                }
                                                fileOutputStream.write(bArr2, 0, read);
                                            }
                                        }
                                    } finally {
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            byteArrayInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (FileNotFoundException e) {
                    result(6, e);
                    return false;
                } catch (IOException e2) {
                    result(7, e2);
                    return false;
                }
            } finally {
                this.mTranscodedProfile = null;
                this.mProfile = null;
            }
        }
        return false;
    }

    public DeviceProfileWriter(CaptureFieldsMappingService captureFieldsMappingService, FillrMappingProcessor fillrMappingProcessor) {
        this.mDeviceSupportsAotProfile = false;
        this.mProfile = captureFieldsMappingService;
        this.mExecutor = fillrMappingProcessor;
        ProfileStore_ instance_ = ProfileStore_.getInstance_(captureFieldsMappingService);
        this.mDiagnostics = instance_;
        MatchResult.Destructured destructured = new MatchResult.Destructured();
        this.mDesiredVersion = destructured;
        o0 o0Var = new o0(19);
        o0Var.a = captureFieldsMappingService;
        destructured.match = o0Var;
        this.mTranscodedProfile = Schema_.getInstance_(captureFieldsMappingService);
        this.mCurProfile = new Toolbar.AnonymousClass1(instance_);
        this.mAssetManager = new AppPreferenceStore(captureFieldsMappingService);
    }

    public DeviceProfileWriter(AssetManager assetManager, Executor executor, ProfileInstaller.DiagnosticsCallback diagnosticsCallback, String str, File file) {
        byte[] bArr;
        this.mDeviceSupportsAotProfile = false;
        this.mAssetManager = assetManager;
        this.mExecutor = executor;
        this.mDiagnostics = diagnosticsCallback;
        this.mApkName = str;
        this.mCurProfile = file;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            bArr = Encoding.V015_S;
        } else {
            bArr = (i == 29 || i == 30) ? Encoding.V010_P : null;
        }
        this.mDesiredVersion = bArr;
    }
}
