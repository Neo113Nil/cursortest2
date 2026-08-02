package ru.yandex.taxi.provider;

import defpackage.c921;
import defpackage.cne0;
import defpackage.evu0;
import defpackage.hst;
import defpackage.jst;
import defpackage.ny61;
import defpackage.rh10;
import defpackage.tst;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes9.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c921 b;

    public c(vpr vprVar, c921 c921Var) {
        this.a = vprVar;
        this.b = c921Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UpdatesCheckerImpl$shouldShowDialog$$inlined$map$1$2$1 updatesCheckerImpl$shouldShowDialog$$inlined$map$1$2$1;
        int i;
        int i2;
        if (continuation instanceof UpdatesCheckerImpl$shouldShowDialog$$inlined$map$1$2$1) {
            updatesCheckerImpl$shouldShowDialog$$inlined$map$1$2$1 = (UpdatesCheckerImpl$shouldShowDialog$$inlined$map$1$2$1) continuation;
            int i3 = updatesCheckerImpl$shouldShowDialog$$inlined$map$1$2$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                updatesCheckerImpl$shouldShowDialog$$inlined$map$1$2$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = updatesCheckerImpl$shouldShowDialog$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = updatesCheckerImpl$shouldShowDialog$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    c921 c921Var = this.b;
                    h hVar = (h) c921Var.c.get();
                    String l = ((cne0) hVar.b).l("launch_current_version", null);
                    long j = ((cne0) hVar.b).j("launch_notification_interval", 0L);
                    boolean z = false;
                    if (l == null || evu0.J(l)) {
                        jst.e.getClass();
                    } else {
                        if ((c921Var.a.d() - c921Var.f.j("key_last_show_timestamp", 0L)) / 1000 <= j) {
                            jst.e.getClass();
                        } else if (((ru.yandex.taxi.vendor_api.google.b) ((tst) c921Var.d.get())).b()) {
                            jst.e.getClass();
                            try {
                                c921Var.e.getClass();
                                int[] c = rh10.c("5.89.0");
                                try {
                                    i2 = Integer.parseInt("128354");
                                } catch (NumberFormatException unused) {
                                    i2 = Integer.MAX_VALUE;
                                }
                                c[3] = i2;
                                try {
                                    int[] c2 = rh10.c(l);
                                    for (int i4 = 0; i4 < 4; i4++) {
                                        int i5 = c[i4];
                                        int i6 = c2[i4];
                                        if (i5 < i6) {
                                            hst hstVar = jst.e;
                                            c921Var.a();
                                            hstVar.getClass();
                                            z = true;
                                            break;
                                        }
                                        if (i5 > i6) {
                                            break;
                                        }
                                    }
                                } catch (Exception e) {
                                    jst.e.k(e, String.format("Error while parsing version from backend %s", Arrays.copyOf(new Object[]{l}, 1)));
                                }
                            } catch (Exception e2) {
                                jst.e.k(e2, "Error while getting app version");
                            }
                            hst hstVar2 = jst.e;
                            c921Var.a();
                            hstVar2.getClass();
                        }
                    }
                    Boolean valueOf = Boolean.valueOf(z);
                    updatesCheckerImpl$shouldShowDialog$$inlined$map$1$2$1.L$0 = null;
                    updatesCheckerImpl$shouldShowDialog$$inlined$map$1$2$1.L$1 = null;
                    updatesCheckerImpl$shouldShowDialog$$inlined$map$1$2$1.L$2 = null;
                    updatesCheckerImpl$shouldShowDialog$$inlined$map$1$2$1.L$3 = null;
                    updatesCheckerImpl$shouldShowDialog$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, updatesCheckerImpl$shouldShowDialog$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        updatesCheckerImpl$shouldShowDialog$$inlined$map$1$2$1 = new UpdatesCheckerImpl$shouldShowDialog$$inlined$map$1$2$1(this, continuation);
        Object obj22 = updatesCheckerImpl$shouldShowDialog$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updatesCheckerImpl$shouldShowDialog$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
