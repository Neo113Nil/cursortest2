package defpackage;

import android.content.res.AssetManager;
import android.os.Trace;
import com.google.android.gms.internal.mlkit_vision_subject_segmentation.zzav;
import com.google.android.gms.internal.mlkit_vision_subject_segmentation.zznh;
import com.google.android.gms.internal.mlkit_vision_subject_segmentation.zznz;
import com.google.android.gms.internal.mlkit_vision_subject_segmentation.zzoa;
import com.google.android.gms.internal.mlkit_vision_subject_segmentation.zzuf;
import com.google.android.gms.internal.mlkit_vision_subject_segmentation.zzuh;
import com.google.android.play.core.splitinstall.zzo;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes4.dex */
public final class ufg implements tt5, mrb1, br91 {
    public final long a;
    public boolean b;
    public final Object c;
    public final Object w;
    public final Object x;
    public final Object y;

    public ufg(FlutterJNI flutterJNI, AssetManager assetManager, long j) {
        this.b = false;
        m501 m501Var = new m501(17, this);
        this.c = flutterJNI;
        this.w = assetManager;
        this.a = j;
        bgg bggVar = new bgg(flutterJNI);
        this.x = bggVar;
        bggVar.h("flutter/isolate", m501Var, null);
        this.y = new gyc(bggVar);
        if (flutterJNI.isAttached()) {
            this.b = true;
        }
    }

    public void a(tfg tfgVar, List list) {
        if (this.b) {
            return;
        }
        ozz0.c("DartExecutor#executeDartEntrypoint");
        try {
            Objects.toString(tfgVar);
            ((FlutterJNI) this.c).runBundleAndSnapshotFromLibrary(tfgVar.a, tfgVar.c, tfgVar.b, (AssetManager) this.w, list, this.a);
            this.b = true;
            Trace.endSection();
        } finally {
        }
    }

    public void b() {
        ((FlutterJNI) this.c).setPlatformMessageHandler((bgg) this.x);
    }

    @Override // defpackage.mrb1
    public o3 c() {
        bga1 bga1Var = (bga1) this.c;
        zzoa zzoaVar = (zzoa) this.w;
        boolean z = this.b;
        xzv xzvVar = (xzv) this.x;
        zzuh zzuhVar = (zzuh) this.y;
        xjb1 xjb1Var = new xjb1();
        r5b1 r5b1Var = new r5b1();
        r5b1Var.a = Long.valueOf(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED & this.a);
        r5b1Var.b = zzoaVar;
        r5b1Var.c = Boolean.valueOf(z);
        xjb1Var.a = new y5b1(r5b1Var);
        int i = xzvVar.g;
        bga1.l.getClass();
        int j = dab1.j(xzvVar);
        n4b1 n4b1Var = new n4b1();
        n4b1Var.a = i != -1 ? i != 35 ? i != 842094169 ? i != 16 ? i != 17 ? zznh.UNKNOWN_FORMAT : zznh.NV21 : zznh.NV16 : zznh.YV12 : zznh.YUV_420_888 : zznh.BITMAP;
        n4b1Var.b = Integer.valueOf(j & Integer.MAX_VALUE);
        xjb1Var.b = new z4b1(n4b1Var);
        xjb1Var.c = bga1Var.e.a();
        if (zzuhVar != null) {
            List zzb = zzuhVar.zzb();
            i791 i791Var = zzav.b;
            Object[] array = zzb.toArray();
            int length = array.length;
            wwg.e0(length, array);
            xjb1Var.e = zzav.i(length, array);
            List<zzuf> zzc = zzuhVar.zzc();
            if (!zzc.isEmpty()) {
                c791 c791Var = new c791();
                for (zzuf zzufVar : zzc) {
                    jmb1 jmb1Var = new jmb1();
                    jmb1Var.a = Integer.valueOf(zzufVar.zzd() & Integer.MAX_VALUE);
                    jmb1Var.b = Integer.valueOf(zzufVar.zza() & Integer.MAX_VALUE);
                    jmb1Var.c = Integer.valueOf(zzufVar.zzb() & Integer.MAX_VALUE);
                    jmb1Var.d = Integer.valueOf(zzufVar.zzc() & Integer.MAX_VALUE);
                    c791Var.a(new nmb1(jmb1Var));
                }
                c791Var.c = true;
                xjb1Var.d = zzav.i(c791Var.b, c791Var.a);
            }
        }
        l8b1 l8b1Var = new l8b1();
        l8b1Var.c = zznz.TYPE_THIN;
        l8b1Var.f = new dkb1(xjb1Var);
        return new o3(l8b1Var, 0);
    }

    @Override // defpackage.tt5
    public o501 d(st5 st5Var) {
        return ((bgg) ((gyc) this.y).a).d(st5Var);
    }

    public void e() {
        ((FlutterJNI) this.c).setPlatformMessageHandler(null);
    }

    @Override // defpackage.tt5
    public void h(String str, qt5 qt5Var, o501 o501Var) {
        ((gyc) this.y).h(str, qt5Var, o501Var);
    }

    @Override // defpackage.tt5
    public void j(String str, qt5 qt5Var) {
        ((gyc) this.y).j(str, qt5Var);
    }

    @Override // defpackage.tt5
    public void l(String str, ByteBuffer byteBuffer) {
        ((gyc) this.y).l(str, byteBuffer);
    }

    @Override // defpackage.tt5
    public void m(String str, ByteBuffer byteBuffer, rt5 rt5Var) {
        ((gyc) this.y).m(str, byteBuffer, rt5Var);
    }

    @Override // defpackage.br91
    /* renamed from: zza */
    public void mo479zza() {
        g9p g9pVar = (g9p) this.y;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.w;
        g9pVar.l.addAll(arrayList);
        g9pVar.m.addAll(arrayList2);
        Long valueOf = Long.valueOf(this.a);
        g9pVar.k(5, 0, valueOf, valueOf, null, null, null);
    }

    @Override // defpackage.br91
    public void zzb(int i) {
        ((g9p) this.y).k(6, i, null, null, null, null, null);
    }

    @Override // defpackage.br91
    public void zzc() {
        if (this.b) {
            return;
        }
        g9p g9pVar = (g9p) this.y;
        ArrayList arrayList = (ArrayList) this.x;
        ArrayList arrayList2 = (ArrayList) this.c;
        ArrayList arrayList3 = (ArrayList) this.w;
        g9pVar.i.getClass();
        f691 a = zzo.a();
        ufg ufgVar = new ufg(g9pVar, arrayList2, arrayList3, this.a, true, arrayList);
        a.getClass();
        if (kst0.e.get() == null) {
            ny61.r("Ingestion should only be called in SplitCompat mode.");
        } else {
            a.d.execute(new ju61(a, arrayList, ufgVar, false, 2));
        }
    }

    public /* synthetic */ ufg(bga1 bga1Var, long j, zzoa zzoaVar, boolean z, xzv xzvVar, zzuh zzuhVar) {
        this.c = bga1Var;
        this.a = j;
        this.w = zzoaVar;
        this.b = z;
        this.x = xzvVar;
        this.y = zzuhVar;
    }

    public ufg(g9p g9pVar, ArrayList arrayList, ArrayList arrayList2, long j, boolean z, ArrayList arrayList3) {
        this.y = g9pVar;
        this.c = arrayList;
        this.w = arrayList2;
        this.a = j;
        this.b = z;
        this.x = arrayList3;
    }
}
