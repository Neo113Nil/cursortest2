package com.adjust.sdk.sig;

import android.content.Context;
import android.util.Base64;
import com.adjust.sdk.AdjustConfig;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.UnrecoverableKeyException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class d {
    public static boolean a = false;

    public static void a(Context context, c cVar, a aVar, Map map, String str, String str2) {
        byte[] bArr;
        if (a || map == null || map.isEmpty() || str == null || str2 == null) {
            return;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);
        boolean equals = AdjustConfig.ENVIRONMENT_SANDBOX.equals(map.get("environment"));
        if (equals) {
            simpleDateFormat.format(new Date(System.currentTimeMillis()));
        }
        map.put("activity_kind", str);
        map.put("client_sdk", str2);
        int i = 2;
        while (true) {
            bArr = null;
            if (i <= 0) {
                break;
            }
            try {
                cVar.a(context);
                bArr = cVar.a(context, map.toString().getBytes(StandardCharsets.UTF_8));
                break;
            } catch (b e) {
                a = true;
                map.remove("activity_kind");
                map.remove("client_sdk");
                throw e;
            } catch (InvalidKeyException e2) {
                e = e2;
            } catch (UnrecoverableKeyException e3) {
                e = e3;
            } catch (Exception e4) {
                e4.getMessage();
                map.remove("activity_kind");
                map.remove("client_sdk");
                throw e4;
            }
            e.getMessage();
            i--;
            cVar.getClass();
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            keyStore.deleteEntry("key2");
            context.getSharedPreferences("adjust_keys", 0).edit().remove("encrypted_key").apply();
        }
        if (i == 0) {
            a = true;
            map.remove("activity_kind");
            map.remove("client_sdk");
            return;
        }
        if (equals) {
            simpleDateFormat.format(new Date(System.currentTimeMillis()));
        }
        byte[] WinterFlowHookDataSource = ((NativeLibHelper) aVar).WinterFlowHookDataSource(context, map, bArr, cVar.a);
        if (equals) {
            simpleDateFormat.format(new Date(System.currentTimeMillis()));
        }
        if (WinterFlowHookDataSource == null) {
            map.remove("activity_kind");
            map.remove("client_sdk");
            return;
        }
        map.put("signature", Base64.encodeToString(WinterFlowHookDataSource, 2));
        map.remove("activity_kind");
        map.remove("client_sdk");
        if (equals) {
            simpleDateFormat.format(new Date(System.currentTimeMillis()));
        }
    }

    public static void a(Set set, Map map, Map map2) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (map.containsKey(str)) {
                map2.put(str, (String) map.get(str));
            }
        }
    }
}
