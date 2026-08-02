package flex.engine.section.metrics;

import android.view.View;
import android.view.ViewTreeObserver;
import defpackage.au50;
import defpackage.gp50;
import defpackage.ofa0;
import defpackage.quy;
import defpackage.sls;
import defpackage.txi0;
import defpackage.tyi0;
import defpackage.vyi0;
import defpackage.x43;
import defpackage.z2x;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010#R\u0016\u0010%\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lflex/engine/section/metrics/PooledPreDrawListener;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "Ltxi0;", "renderCompleteCallback", "Lquy;", "listenerRecycleCallback", "Lkotlin/Function0;", "", "currentTimeProvider", "<init>", "(Ltxi0;Lquy;Lsls;)V", "Landroid/view/View;", "view", "Landroid/view/ViewTreeObserver;", "viewTreeObserver", "", "position", "Lvyi0;", "payload", "Lzy11;", "prepare", "(Landroid/view/View;Landroid/view/ViewTreeObserver;ILvyi0;)V", "cancel", "()V", "clear", "", "onPreDraw", "()Z", "Ltxi0;", "Lquy;", "Lsls;", "Landroid/view/View;", "Landroid/view/ViewTreeObserver;", "", "snippetType", "Ljava/lang/String;", "sectionName", "startTime", "J", "cancelled", "Z", "value", CA20Status.STATUS_USER_I, "getPosition", "()I", "flex-section-extension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PooledPreDrawListener implements ViewTreeObserver.OnPreDrawListener {
    private boolean cancelled;
    private final sls currentTimeProvider;
    private final quy listenerRecycleCallback;
    private int position = -1;
    private final txi0 renderCompleteCallback;
    private String sectionName;
    private String snippetType;
    private long startTime;
    private View view;
    private ViewTreeObserver viewTreeObserver;

    public PooledPreDrawListener(txi0 txi0Var, quy quyVar, sls slsVar) {
        this.renderCompleteCallback = txi0Var;
        this.listenerRecycleCallback = quyVar;
        this.currentTimeProvider = slsVar;
    }

    public final void cancel() {
        this.cancelled = true;
        clear();
    }

    public final void clear() {
        ViewTreeObserver viewTreeObserver = this.viewTreeObserver;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        this.view = null;
        this.viewTreeObserver = null;
        this.snippetType = null;
        this.sectionName = null;
        this.startTime = 0L;
        this.position = -1;
    }

    public final int getPosition() {
        return this.position;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        View view;
        ViewTreeObserver viewTreeObserver = this.viewTreeObserver;
        if (viewTreeObserver != null && (view = this.view) != null) {
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
            if (!this.cancelled) {
                long longValue = ((Number) this.currentTimeProvider.invoke()).longValue();
                txi0 txi0Var = this.renderCompleteCallback;
                String str = this.snippetType;
                String str2 = this.sectionName;
                long j = this.startTime;
                int i = this.position;
                z2x z2xVar = (z2x) ((au50) txi0Var).b;
                z2xVar.f.put(Integer.valueOf(i), new tyi0(j, str, longValue, str2));
                if (!z2xVar.g) {
                    z2xVar.g = true;
                    view.post(z2xVar.h);
                }
                z2x z2xVar2 = (z2x) ((gp50) this.listenerRecycleCallback).b;
                z2xVar2.e.remove(view);
                ofa0 ofa0Var = z2xVar2.d;
                ofa0Var.getClass();
                clear();
                x43 x43Var = (x43) ofa0Var.w;
                if (x43Var.size() < 10) {
                    x43Var.addLast(this);
                }
            }
        }
        return true;
    }

    public final void prepare(View view, ViewTreeObserver viewTreeObserver, int position, vyi0 payload) {
        this.view = view;
        this.viewTreeObserver = viewTreeObserver;
        this.position = position;
        this.snippetType = payload.a;
        this.sectionName = payload.b;
        this.startTime = payload.c;
        this.cancelled = false;
    }
}
