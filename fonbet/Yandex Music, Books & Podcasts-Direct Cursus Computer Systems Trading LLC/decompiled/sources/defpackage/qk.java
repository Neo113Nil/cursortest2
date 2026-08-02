package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.music.core.job.JobService;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class qk extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk(d8t d8tVar, boolean z, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.j = 1;
        this.l = d8tVar;
        this.k = z;
        this.m = function0;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new qk((rk) this.l, (xxq) this.m, this.k, continuation, 0);
            case 1:
                return new qk((d8t) this.l, this.k, (Function0) this.m, continuation);
            case 2:
                qk qkVar = new qk((List) this.l, (qj1) this.m, continuation, 2);
                qkVar.k = ((Boolean) obj).booleanValue();
                return qkVar;
            case 3:
                return new qk((xf2) this.l, (xxq) this.m, this.k, continuation, 3);
            case 4:
                return new qk((tu6) this.l, (xxq) this.m, this.k, continuation, 4);
            case 5:
                return new qk((u2f) this.l, (v2f) this.m, this.k, continuation, 5);
            case 6:
                qk qkVar2 = new qk((Context) this.m, continuation, this.k);
                qkVar2.l = obj;
                return qkVar2;
            case 7:
                return new qk(this.k, (ayn) this.l, this.m, continuation);
            case 8:
                qk qkVar3 = new qk((vp5) this.l, (mxo) this.m, continuation, 8);
                qkVar3.k = ((Boolean) obj).booleanValue();
                return qkVar3;
            default:
                qk qkVar4 = new qk((dzv) this.l, (rxv) this.m, continuation, 9);
                qkVar4.k = ((Boolean) obj).booleanValue();
                return qkVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((qk) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((qk) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((qk) create(bool, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((qk) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((qk) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((qk) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((qk) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((qk) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 8:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((qk) create(bool2, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((qk) create(bool3, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        String str;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                pst a = ost.a(((rk) this.l).a, (xxq) this.m);
                boolean z = this.k;
                SharedPreferences.Editor edit = a.edit();
                edit.putBoolean("add_tracks_to_start_of_playlist", z);
                edit.apply();
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                d8t d8tVar = (d8t) this.l;
                if (((Boolean) d8tVar.c()).booleanValue() && ((Boolean) d8tVar.c()).booleanValue() == this.k) {
                    ((Function0) this.m).invoke();
                }
                break;
            case 2:
                boolean z2 = this.k;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                List list = (List) this.l;
                qj1 qj1Var = (qj1) this.m;
                n8g b = t75.b();
                b.add(pj1.Share);
                if (!list.isEmpty() && !qj1Var.c.a()) {
                    b.add(pj1.DevicePicker);
                }
                b01 b01Var = qj1Var.a.f;
                if (((b01Var == null || (str = b01Var.a) == null) ? null : StringsKt.t0(str).toString()) == null && qj1Var.d.f()) {
                    b.add(pj1.AboutArtist);
                }
                if (!z2) {
                    if (z2) {
                        b6e.s();
                        break;
                    } else {
                        b.add(pj1.Dislike);
                    }
                } else {
                    b.add(pj1.UnDislike);
                }
                break;
            case 3:
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                xf2 xf2Var = (xf2) this.l;
                pst a2 = ost.a(xf2Var.a, (xxq) this.m);
                boolean z3 = this.k;
                SharedPreferences.Editor edit2 = a2.edit();
                edit2.putBoolean("autoplay_enabled", z3);
                edit2.apply();
                x0q x0qVar = xf2Var.b;
                Unit unit = Unit.a;
                x0qVar.a(unit);
                break;
            case 4:
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                tu6 tu6Var = (tu6) this.l;
                pst a3 = ost.a(tu6Var.a, (xxq) this.m);
                boolean z4 = this.k;
                SharedPreferences.Editor edit3 = a3.edit();
                edit3.putBoolean("crossfade_enabled", z4);
                edit3.apply();
                x0q x0qVar2 = tu6Var.b;
                Unit unit2 = Unit.a;
                x0qVar2.a(unit2);
                break;
            case 5:
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                u2f u2fVar = (u2f) this.l;
                Context context = u2fVar.a;
                k3f k3fVar = u2fVar.c;
                v2f v2fVar = (v2f) this.m;
                int i = v2fVar.a;
                jnn jnnVar = (jnn) k3fVar.a.get(Integer.valueOf(i));
                if (jnnVar != null) {
                    JobScheduler f = l1b.f(context);
                    JobInfo.Builder builder = new JobInfo.Builder(i, new ComponentName(context, (Class<?>) JobService.class));
                    jnnVar.c.invoke(builder);
                    JobInfo build = builder.build();
                    if (this.k) {
                        sk3.r(f.schedule(build));
                    } else {
                        build.getClass();
                        if (f.getPendingJob(build.getId()) == null) {
                            List<JobInfo> allPendingJobs = f.getAllPendingJobs();
                            allPendingJobs.getClass();
                            Iterator<T> it = allPendingJobs.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    f.schedule(build);
                                } else if (((JobInfo) it.next()).getId() == build.getId()) {
                                }
                            }
                        }
                    }
                    break;
                } else {
                    su4.s(2, null, "Job doesn't have registered configurator, id=" + v2fVar, null);
                    break;
                }
            case 6:
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                boolean z5 = this.k;
                Context context2 = (Context) this.m;
                try {
                    r7o r7oVar = z7o.b;
                    if (z5) {
                        boolean z6 = zni.a;
                        new File(context2.getFilesDir(), "mobile_api_enabled").createNewFile();
                    } else {
                        boolean z7 = zni.a;
                        new File(context2.getFilesDir(), "mobile_api_enabled").delete();
                    }
                } catch (Throwable unused) {
                    r7o r7oVar2 = z7o.b;
                }
                break;
            case 7:
                Object obj2 = this.m;
                nm6 nm6Var8 = nm6.a;
                qgg.h0(obj);
                boolean z8 = this.k;
                ayn aynVar = (ayn) this.l;
                if (z8) {
                    aynVar.r.add(obj2);
                } else {
                    aynVar.r.remove(obj2);
                }
                break;
            case 8:
                boolean z9 = this.k;
                nm6 nm6Var9 = nm6.a;
                qgg.h0(obj);
                vp5 vp5Var = (vp5) this.l;
                mxo mxoVar = (mxo) this.m;
                mxoVar.getClass();
                LinkedHashSet linkedHashSet = vp5Var.b;
                if (z9) {
                    linkedHashSet.add(mxoVar);
                } else {
                    linkedHashSet.remove(mxoVar);
                }
                ((y1f) ((w1f) vp5Var.a.c).c).f(!linkedHashSet.isEmpty());
                break;
            default:
                boolean z10 = this.k;
                nm6 nm6Var10 = nm6.a;
                qgg.h0(obj);
                dzv dzvVar = (dzv) this.l;
                rxv rxvVar = (rxv) this.m;
                dzvVar.getClass();
                rxvVar.getClass();
                LinkedHashSet linkedHashSet2 = dzvVar.b;
                if (z10) {
                    linkedHashSet2.add(rxvVar);
                } else {
                    linkedHashSet2.remove(rxvVar);
                }
                ((y1f) ((w1f) dzvVar.a.a.c).c).f(!linkedHashSet2.isEmpty());
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk(Context context, Continuation continuation, boolean z) {
        super(2, continuation);
        this.j = 6;
        this.k = z;
        this.m = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qk(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qk(Object obj, Object obj2, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
        this.k = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk(boolean z, ayn aynVar, Object obj, Continuation continuation) {
        super(2, continuation);
        this.j = 7;
        this.k = z;
        this.l = aynVar;
        this.m = obj;
    }
}
