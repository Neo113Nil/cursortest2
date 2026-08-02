package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.yandex.video.m3.player.utils.network.NetworkType;

/* loaded from: classes6.dex */
public interface al2 {
    yk2 create(Context context);

    default yk2 q(Context context, zle zleVar) {
        int i;
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        HashMap hashMap = new HashMap(8);
        hashMap.put(0, 1000000L);
        hashMap.put(2, -9223372036854775807L);
        hashMap.put(3, -9223372036854775807L);
        hashMap.put(4, -9223372036854775807L);
        hashMap.put(5, -9223372036854775807L);
        hashMap.put(10, -9223372036854775807L);
        hashMap.put(9, -9223372036854775807L);
        hashMap.put(7, -9223372036854775807L);
        String A = dvt.A(context);
        A.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (NetworkType networkType : NetworkType.values()) {
            linkedHashMap.put(networkType, Long.valueOf(zleVar.a(context, networkType, A)));
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            NetworkType networkType2 = (NetworkType) entry.getKey();
            long longValue = ((Number) entry.getValue()).longValue();
            switch (zk2.a[networkType2.ordinal()]) {
                case 1:
                    i = 2;
                    break;
                case 2:
                    i = 3;
                    break;
                case 3:
                    i = 4;
                    break;
                case 4:
                    i = 5;
                    break;
                case 5:
                    i = 9;
                    break;
                case 6:
                    i = 10;
                    break;
                case 7:
                    i = 6;
                    break;
                case 8:
                    i = 7;
                    break;
                case 9:
                    i = 0;
                    break;
                case 10:
                    i = 1;
                    break;
                default:
                    i = 8;
                    break;
            }
            hashMap.put(Integer.valueOf(i), Long.valueOf(longValue));
        }
        return new jk7(applicationContext, hashMap);
    }
}
