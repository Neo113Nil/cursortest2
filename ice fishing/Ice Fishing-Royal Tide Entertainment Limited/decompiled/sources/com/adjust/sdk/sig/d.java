package com.adjust.sdk.sig;

import android.content.Context;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.Constants;
import java.security.InvalidKeyException;
import java.security.UnrecoverableKeyException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class d {
    public static boolean a = false;

    public static void a(Set set, Map map, Map map2) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (map.containsKey(str)) {
                map2.put(str, (String) map.get(str));
            }
        }
    }

    public static void a(Context context, c cVar, a aVar, Map map, String str, String str2) {
        byte[] bArr;
        if (a || map == null || map.size() == 0 || str == null || str2 == null) {
            return;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        boolean equals = AdjustConfig.ENVIRONMENT_SANDBOX.equals(map.get("environment"));
        if (equals) {
            simpleDateFormat.format(new Date(System.currentTimeMillis()));
        }
        map.put("activity_kind", str);
        map.put("client_sdk", str2);
        int i = 2;
        while (true) {
            if (i <= 0) {
                bArr = null;
                break;
            }
            try {
                cVar.b(context);
                bArr = cVar.a(context, map.toString().getBytes(Constants.ENCODING));
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
            cVar.a(context);
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
        byte[] CatchingFishSnackbar = ((NativeLibHelper) aVar).CatchingFishSnackbar(context, map, bArr, cVar.a);
        if (equals) {
            simpleDateFormat.format(new Date(System.currentTimeMillis()));
        }
        if (CatchingFishSnackbar == null) {
            map.remove("activity_kind");
            map.remove("client_sdk");
            return;
        }
        int length = CatchingFishSnackbar.length;
        char[] cArr = e.a;
        char[] cArr2 = new char[length * 2];
        for (int i2 = 0; i2 < length; i2++) {
            byte b = CatchingFishSnackbar[i2];
            int i3 = i2 * 2;
            char[] cArr3 = e.a;
            cArr2[i3] = cArr3[(b & 255) >>> 4];
            cArr2[i3 + 1] = cArr3[b & 15];
        }
        map.put("signature", new String(cArr2));
        map.remove("activity_kind");
        map.remove("client_sdk");
        if (equals) {
            simpleDateFormat.format(new Date(System.currentTimeMillis()));
        }
    }
}
