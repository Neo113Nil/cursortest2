package r0;

import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m extends l {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f5924j;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5924j) {
            case 0:
                int i10 = this.f5923i;
                this.f5923i = i10 + 2;
                Object[] objArr = this.f5921g;
                return new a(0, objArr[i10], objArr[i10 + 1]);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                int i11 = this.f5923i;
                this.f5923i = i11 + 2;
                return this.f5921g[i11];
            default:
                int i12 = this.f5923i;
                this.f5923i = i12 + 2;
                return this.f5921g[i12 + 1];
        }
    }
}
