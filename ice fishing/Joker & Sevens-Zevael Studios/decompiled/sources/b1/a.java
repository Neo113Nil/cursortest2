package b1;

import a0.a0;
import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1;
import b1.a;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import pc.o;
import s.g;
import x1.f;
import x1.y0;
import x1.y1;
import y0.m;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements View.OnDragListener, b {

    /* renamed from: a, reason: collision with root package name */
    public final e f938a;

    /* renamed from: b, reason: collision with root package name */
    public final g f939b;

    /* renamed from: c, reason: collision with root package name */
    public final AndroidDragAndDropManager$modifier$1 f940c;

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1] */
    public a() {
        e eVar = new e();
        eVar.f946w = 0L;
        this.f938a = eVar;
        this.f939b = new g(0);
        this.f940c = new y0() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
            public final boolean equals(Object obj) {
                return obj == this;
            }

            @Override // x1.y0
            public final m f() {
                return a.this.f938a;
            }

            @Override // x1.y0
            public final /* bridge */ /* synthetic */ void g(m mVar) {
            }

            public final int hashCode() {
                return a.this.f938a.hashCode();
            }
        };
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        f8.c cVar = new f8.c(5, dragEvent);
        int action = dragEvent.getAction();
        y1 y1Var = y1.f8218g;
        g gVar = this.f939b;
        e eVar = this.f938a;
        switch (action) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                o oVar = new o();
                d dVar = new d(cVar, eVar, oVar);
                if (dVar.invoke(eVar) == y1Var) {
                    f.y(eVar, dVar);
                }
                boolean z10 = oVar.f5679g;
                gVar.getClass();
                s.b bVar = new s.b(gVar);
                while (bVar.hasNext()) {
                    ((e) bVar.next()).v0(cVar);
                }
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                eVar.u0(cVar);
                break;
            case 4:
                a0 a0Var = new a0(3, cVar);
                if (a0Var.invoke(eVar) == y1Var) {
                    f.y(eVar, a0Var);
                }
                gVar.clear();
                break;
            case 5:
                eVar.s0(cVar);
                break;
            case 6:
                eVar.t0(cVar);
                break;
        }
        return false;
    }
}
