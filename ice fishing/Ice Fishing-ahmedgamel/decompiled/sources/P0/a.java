package P0;

import Q0.f;
import S0.p;
import android.os.Build;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2412f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(f fVar, int i) {
        super(fVar);
        this.f2412f = i;
    }

    @Override // P0.b
    public final boolean a(p workSpec) {
        switch (this.f2412f) {
            case 0:
                h.e(workSpec, "workSpec");
                return workSpec.f2816j.f1375b;
            case 1:
                h.e(workSpec, "workSpec");
                return workSpec.f2816j.f1377d;
            case 2:
                h.e(workSpec, "workSpec");
                return workSpec.f2816j.f1374a == 2;
            case 3:
                h.e(workSpec, "workSpec");
                int i = workSpec.f2816j.f1374a;
                return i == 3 || (Build.VERSION.SDK_INT >= 30 && i == 6);
            default:
                h.e(workSpec, "workSpec");
                return workSpec.f2816j.f1378e;
        }
    }

    @Override // P0.b
    public final boolean b(Object obj) {
        switch (this.f2412f) {
            case 2:
                O0.a value = (O0.a) obj;
                h.e(value, "value");
                int i = Build.VERSION.SDK_INT;
                boolean z3 = value.f2154a;
                if (i < 26 ? z3 : z3 && value.f2155b) {
                }
            case 3:
                O0.a value2 = (O0.a) obj;
                h.e(value2, "value");
                if (!value2.f2154a || value2.f2156c) {
                }
                break;
        }
        return !((Boolean) obj).booleanValue();
    }
}
