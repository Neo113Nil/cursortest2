package com.gamericefishpro.space.a2;

import android.os.Trace;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.ei.l;
import com.gamericefishpro.space.f2.g1;
import com.gamericefishpro.space.f2.h0;
import com.gamericefishpro.space.f2.z;
import com.gamericefishpro.space.h2.f0;
import com.gamericefishpro.space.h2.j0;
import com.gamericefishpro.space.h2.r0;
import com.gamericefishpro.space.i2.n1;
import com.gamericefishpro.space.m1.u;
import com.gamericefishpro.space.t0.x;
import com.gamericefishpro.space.u1.i0;
import com.gamericefishpro.space.v.y;
import com.gamericefishpro.space.w.l1;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends l implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, Object obj) {
        super(0);
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0173 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0175 A[LOOP:0: B:62:0x0140->B:72:0x0175, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x0178 A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        x xVar;
        boolean z = false;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((e) this.e).d;
            case 1:
                return ((j) this.e).A0();
            case 2:
                z zVar = (z) this.e;
                if (!((Boolean) zVar.g.getValue()).booleanValue() && (xVar = zVar.c) != null) {
                    xVar.l();
                }
                return Unit.a;
            case 3:
                h0 h0VarA = ((g1) this.e).a();
                f0 f0Var = h0VarA.d;
                if (h0VarA.G != ((com.gamericefishpro.space.v0.b) f0Var.o()).d.i) {
                    com.gamericefishpro.space.t.h0 h0Var = h0VarA.y;
                    Object[] objArr = h0Var.c;
                    long[] jArr = h0Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j = jArr[i];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((255 & j) < 128) {
                                        ((z) objArr[(i << 3) + i3]).d = true;
                                    }
                                    j >>= 8;
                                }
                                if (i2 == 8) {
                                    if (i != length) {
                                        i++;
                                    }
                                }
                            } else if (i != length) {
                                i++;
                            }
                        }
                    }
                    if (f0Var.B != null) {
                        if (!f0Var.a0.e) {
                            f0.T(f0Var, false, 7);
                        }
                    } else if (!f0Var.q()) {
                        f0.V(f0Var, false, 7);
                    }
                }
                return Unit.a;
            case 4:
                return (com.gamericefishpro.space.n1.c) this.e;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                j0 j0Var = ((f0) this.e).a0;
                j0Var.p.R = true;
                r0 r0Var = j0Var.q;
                if (r0Var != null) {
                    r0Var.L = true;
                }
                return Unit.a;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                com.gamericefishpro.space.c1.c cVar = (com.gamericefishpro.space.c1.c) ((n1) this.e).a.e;
                if (!cVar.e) {
                    if (cVar.i) {
                        com.gamericefishpro.space.d1.a.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    cVar.a();
                    cVar.i = true;
                }
                return Unit.a;
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                Object obj = com.gamericefishpro.space.l4.h0.c;
                File file = (File) this.e;
                synchronized (obj) {
                    com.gamericefishpro.space.l4.h0.b.remove(file.getAbsolutePath());
                }
                return Unit.a;
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                ((u) this.e).C0();
                return Unit.a;
            case 9:
                com.gamericefishpro.space.p2.b bVar = (com.gamericefishpro.space.p2.b) this.e;
                bVar.g = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    bVar.a();
                    Unit unit = Unit.a;
                    return Unit.a;
                } finally {
                    Trace.endSection();
                }
            case 10:
                File file2 = (File) ((com.gamericefishpro.space.b2.b) this.e).invoke();
                Intrinsics.checkNotNullParameter(file2, "<this>");
                String name = file2.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (Intrinsics.a(StringsKt.B(name, ""), "preferences_pb")) {
                    File absoluteFile = file2.getAbsoluteFile();
                    Intrinsics.checkNotNullExpressionValue(absoluteFile, "file.absoluteFile");
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file2 + " does not match required extension for Preferences file: preferences_pb").toString());
            case RequestError.STOP_TRACKING /* 11 */:
                i0 i0Var = (i0) this.e;
                Unit unit2 = Unit.a;
                i0Var.h.setValue(unit2);
                return unit2;
            case 12:
                l1 l1Var = (l1) this.e;
                Object objK = l1Var.a.k();
                y yVar = y.i;
                if (objK == yVar && l1Var.d.getValue() == yVar) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 13:
                Object systemService = ((View) ((com.gamericefishpro.space.u6.e) this.e).b).getContext().getSystemService("input_method");
                Intrinsics.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            default:
                return new BaseInputConnection((View) ((com.gamericefishpro.space.u6.l) this.e).d, false);
        }
    }
}
