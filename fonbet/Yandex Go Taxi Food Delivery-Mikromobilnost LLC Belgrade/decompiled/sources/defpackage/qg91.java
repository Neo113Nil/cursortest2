package defpackage;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.e;
import com.google.android.gms.internal.measurement.zzco;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* loaded from: classes11.dex */
public final class qg91 implements kua1 {
    public final /* synthetic */ e a;

    public qg91(e eVar) {
        this.a = eVar;
    }

    @Override // defpackage.kua1
    public final void a(String str, String str2, Bundle bundle) {
        e eVar = this.a;
        eVar.a(new bp91(eVar, str, str2, bundle, true));
    }

    @Override // defpackage.kua1
    public final void b(String str) {
        e eVar = this.a;
        eVar.a(new fk91(eVar, str, 1));
    }

    @Override // defpackage.kua1
    public final void c(String str) {
        e eVar = this.a;
        eVar.a(new fk91(eVar, str, 0));
    }

    @Override // defpackage.kua1
    public final int d(String str) {
        zzco zzcoVar = new zzco();
        e eVar = this.a;
        eVar.a(new vm91(eVar, str, zzcoVar));
        Integer num = (Integer) zzco.zzf(zzcoVar.zze(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    @Override // defpackage.kua1
    public final void e(Bundle bundle) {
        e eVar = this.a;
        eVar.a(new ji91(eVar, bundle, 1));
    }

    @Override // defpackage.kua1
    public final Map f(String str, String str2, boolean z) {
        zzco zzcoVar = new zzco();
        e eVar = this.a;
        eVar.a(new pm91(eVar, str, str2, z, zzcoVar));
        Bundle zze = zzcoVar.zze(5000L);
        if (zze == null || zze.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap(zze.size());
        for (String str3 : zze.keySet()) {
            Object obj = zze.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    @Override // defpackage.kua1
    public final void g(String str, String str2, Bundle bundle) {
        e eVar = this.a;
        eVar.a(new yi91(eVar, str, str2, bundle, 0));
    }

    @Override // defpackage.kua1
    public final List h(String str, String str2) {
        zzco zzcoVar = new zzco();
        e eVar = this.a;
        eVar.a(new yi91(eVar, str, str2, zzcoVar, 1));
        List list = (List) zzco.zzf(zzcoVar.zze(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    @Override // defpackage.kua1
    public final String zzh() {
        zzco zzcoVar = new zzco();
        e eVar = this.a;
        eVar.a(new vk91(eVar, zzcoVar, 3));
        return zzcoVar.zzc(500L);
    }

    @Override // defpackage.kua1
    public final String zzi() {
        zzco zzcoVar = new zzco();
        e eVar = this.a;
        eVar.a(new vk91(eVar, zzcoVar, 4));
        return zzcoVar.zzc(500L);
    }

    @Override // defpackage.kua1
    public final String zzj() {
        zzco zzcoVar = new zzco();
        e eVar = this.a;
        eVar.a(new vk91(eVar, zzcoVar, 1));
        return zzcoVar.zzc(50L);
    }

    @Override // defpackage.kua1
    public final String zzk() {
        zzco zzcoVar = new zzco();
        e eVar = this.a;
        eVar.a(new vk91(eVar, zzcoVar, 0));
        return zzcoVar.zzc(500L);
    }

    @Override // defpackage.kua1
    public final long zzl() {
        zzco zzcoVar = new zzco();
        e eVar = this.a;
        eVar.a(new vk91(eVar, zzcoVar, 2));
        Long zzd = zzcoVar.zzd(500L);
        if (zzd != null) {
            return zzd.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i = eVar.d + 1;
        eVar.d = i;
        return nextLong + i;
    }
}
