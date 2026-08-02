package P0;

import Q0.f;
import S0.p;
import android.os.Build;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2343f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(f fVar, int i) {
        super(fVar);
        this.f2343f = i;
    }

    @Override // P0.b
    public final boolean a(p workSpec) {
        switch (this.f2343f) {
            case 0:
                h.e(workSpec, "workSpec");
                return workSpec.f2945j.f1404b;
            case 1:
                h.e(workSpec, "workSpec");
                return workSpec.f2945j.f1406d;
            case 2:
                h.e(workSpec, "workSpec");
                return workSpec.f2945j.f1403a == 2;
            case 3:
                h.e(workSpec, "workSpec");
                int i = workSpec.f2945j.f1403a;
                return i == 3 || (Build.VERSION.SDK_INT >= 30 && i == 6);
            default:
                h.e(workSpec, "workSpec");
                return workSpec.f2945j.f1407e;
        }
    }

    @Override // P0.b
    public final boolean b(Object obj) {
        switch (this.f2343f) {
            case 2:
                O0.a value = (O0.a) obj;
                h.e(value, "value");
                int i = Build.VERSION.SDK_INT;
                boolean z6 = value.f2242a;
                if (i < 26 ? z6 : z6 && value.f2243b) {
                }
            case 3:
                O0.a value2 = (O0.a) obj;
                h.e(value2, "value");
                if (!value2.f2242a || value2.f2244c) {
                }
                break;
        }
        return !((Boolean) obj).booleanValue();
    }
}
