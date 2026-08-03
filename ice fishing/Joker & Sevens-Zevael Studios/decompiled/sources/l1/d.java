package l1;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f3953a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3954b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3955c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3956d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3957e;

    /* renamed from: f, reason: collision with root package name */
    public final float f3958f;

    /* renamed from: g, reason: collision with root package name */
    public final float f3959g;

    /* renamed from: h, reason: collision with root package name */
    public final float f3960h;

    /* renamed from: i, reason: collision with root package name */
    public final List f3961i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f3962j;

    public d(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, int i10) {
        str = (i10 & 1) != 0 ? "" : str;
        f10 = (i10 & 2) != 0 ? 0.0f : f10;
        f11 = (i10 & 4) != 0 ? 0.0f : f11;
        f12 = (i10 & 8) != 0 ? 0.0f : f12;
        f13 = (i10 & 16) != 0 ? 1.0f : f13;
        f14 = (i10 & 32) != 0 ? 1.0f : f14;
        f15 = (i10 & 64) != 0 ? 0.0f : f15;
        f16 = (i10 & 128) != 0 ? 0.0f : f16;
        if ((i10 & 256) != 0) {
            int i11 = h0.f4034a;
            list = bc.v.f1067g;
        }
        ArrayList arrayList = new ArrayList();
        this.f3953a = str;
        this.f3954b = f10;
        this.f3955c = f11;
        this.f3956d = f12;
        this.f3957e = f13;
        this.f3958f = f14;
        this.f3959g = f15;
        this.f3960h = f16;
        this.f3961i = list;
        this.f3962j = arrayList;
    }
}
