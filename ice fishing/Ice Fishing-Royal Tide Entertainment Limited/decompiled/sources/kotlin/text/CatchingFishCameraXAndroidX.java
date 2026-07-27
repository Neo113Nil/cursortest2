package kotlin.text;

import android.content.Context;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class CatchingFishCameraXAndroidX {
    public final CatchingFishFluxMVI CatchingFishParcelableFAB;
    public static final CatchingFishXMLLayoutRedux CatchingFishSnackbar = new CatchingFishXMLLayoutRedux("fire-global");
    public static final CatchingFishXMLLayoutRedux CatchingFishCoroutine = new CatchingFishXMLLayoutRedux("fire-count");
    public static final CatchingFishXMLLayoutRedux CatchingFishReduxKtor = new CatchingFishXMLLayoutRedux("last-used-date");

    public CatchingFishCameraXAndroidX(Context context, String str) {
        this.CatchingFishParcelableFAB = new CatchingFishFluxMVI(context, "FirebaseHeartBeat" + str);
    }

    public final synchronized CatchingFishXMLLayoutRedux CatchingFishCoroutine(CatchingFishDaggerHiltMVI catchingFishDaggerHiltMVI, String str) {
        for (Map.Entry entry : catchingFishDaggerHiltMVI.CatchingFishParcelableFAB().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return CatchingFishOkHttpFAB.CatchingFishJUnitRealm(((CatchingFishXMLLayoutRedux) entry.getKey()).CatchingFishParcelableFAB);
                    }
                }
            }
        }
        return null;
    }

    public final synchronized boolean CatchingFishDaggerWebsocket(CatchingFishXMLLayoutRedux catchingFishXMLLayoutRedux, long j) {
        CatchingFishPayPalDataStore catchingFishPayPalDataStore;
        long longValue;
        CatchingFishFluxMVI catchingFishFluxMVI = this.CatchingFishParcelableFAB;
        catchingFishFluxMVI.getClass();
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishXMLLayoutRedux, "key");
        CatchingFishPayPalDagger catchingFishPayPalDagger = new CatchingFishPayPalDagger(catchingFishFluxMVI, catchingFishXMLLayoutRedux, null);
        catchingFishPayPalDataStore = CatchingFishPayPalDataStore.CatchingFishReduxKtor;
        longValue = ((Long) CatchingFishXMLLayoutGlide.CatchingFishSensorManager(catchingFishPayPalDataStore, catchingFishPayPalDagger)).longValue();
        synchronized (this) {
        }
        if (CatchingFishSnackbar(longValue).equals(CatchingFishSnackbar(j))) {
            return false;
        }
        CatchingFishFluxMVI catchingFishFluxMVI2 = this.CatchingFishParcelableFAB;
        Long valueOf = Long.valueOf(j);
        catchingFishFluxMVI2.getClass();
        return true;
    }

    public final synchronized ArrayList CatchingFishParcelableFAB() {
        try {
            ArrayList arrayList = new ArrayList();
            String CatchingFishSnackbar2 = CatchingFishSnackbar(System.currentTimeMillis());
            CatchingFishFluxMVI catchingFishFluxMVI = this.CatchingFishParcelableFAB;
            catchingFishFluxMVI.getClass();
            for (Map.Entry entry : ((Map) CatchingFishXMLLayoutGlide.CatchingFishSensorManager(CatchingFishPayPalDataStore.CatchingFishReduxKtor, new CatchingFishManifestHandler(catchingFishFluxMVI, null))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(CatchingFishSnackbar2);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new CatchingFishStateFlowAdMob(((CatchingFishXMLLayoutRedux) entry.getKey()).CatchingFishParcelableFAB, new ArrayList(hashSet)));
                    }
                }
            }
            final long currentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.CatchingFishParcelableFAB.CatchingFishParcelableFAB(new CatchingFishServiceHandler() { // from class: kotlin.text.CatchingFishGlidePicasso
                    @Override // kotlin.text.CatchingFishServiceHandler
                    public final Object CatchingFishFragmentHandler(Object obj) {
                        ((CatchingFishDaggerHiltMVI) obj).CatchingFishReduxKtor(CatchingFishCameraXAndroidX.CatchingFishSnackbar, Long.valueOf(currentTimeMillis));
                        return null;
                    }
                });
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized void CatchingFishReduxKtor(CatchingFishDaggerHiltMVI catchingFishDaggerHiltMVI, String str) {
        try {
            CatchingFishXMLLayoutRedux CatchingFishCoroutine2 = CatchingFishCoroutine(catchingFishDaggerHiltMVI, str);
            if (CatchingFishCoroutine2 == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) CatchingFishFirebaseDagger.CatchingFishCustomView(catchingFishDaggerHiltMVI, CatchingFishCoroutine2, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                catchingFishDaggerHiltMVI.CatchingFishCoroutine(CatchingFishCoroutine2);
            } else {
                catchingFishDaggerHiltMVI.CatchingFishDaggerWebsocket(CatchingFishCoroutine2, hashSet);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized String CatchingFishSnackbar(long j) {
        Instant instant;
        OffsetDateTime atOffset;
        LocalDateTime localDateTime;
        String format;
        ZoneOffset unused;
        DateTimeFormatter unused2;
        if (Build.VERSION.SDK_INT < 26) {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
        }
        instant = new Date(j).toInstant();
        unused = ZoneOffset.UTC;
        atOffset = instant.atOffset(ZoneOffset.UTC);
        localDateTime = atOffset.toLocalDateTime();
        unused2 = DateTimeFormatter.ISO_LOCAL_DATE;
        format = localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);
        return format;
    }
}
