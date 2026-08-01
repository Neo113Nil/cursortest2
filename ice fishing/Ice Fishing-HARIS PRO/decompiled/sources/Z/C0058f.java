package Z;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.lumenpath.harispro.hrnavigator.R;

/* renamed from: Z.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0058f extends AbstractC0059g {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1547c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1548d;
    public F.i e;

    public C0058f(Y y2, K.d dVar, boolean z2) {
        super(y2, dVar);
        this.f1547c = z2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:59|(3:73|74|(4:76|65|27|28))|61|62|(4:64|65|27|28)) */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ed, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ee, code lost:
    
        if (r0 == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f0, code lost:
    
        r9 = android.view.animation.AnimationUtils.loadAnimation(r9, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f4, code lost:
    
        if (r9 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f6, code lost:
    
        r9 = new F.i(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00fd, code lost:
    
        throw r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final F.i k(Context context) {
        int i;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Animation loadAnimation;
        F.i iVar;
        F.i iVar2;
        if (this.f1548d) {
            return this.e;
        }
        Y y2 = (Y) this.f1549a;
        boolean z2 = y2.f1503a == 2;
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = y2.f1505c;
        r rVar = abstractComponentCallbacksC0070s.f1587I;
        int i2 = rVar == null ? 0 : rVar.f1574f;
        if (!this.f1547c) {
            if (z2) {
                if (rVar != null) {
                    i = rVar.f1571b;
                    abstractComponentCallbacksC0070s.K(0, 0, 0, 0);
                    viewGroup = abstractComponentCallbacksC0070s.f1583E;
                    if (viewGroup != null) {
                    }
                    viewGroup2 = abstractComponentCallbacksC0070s.f1583E;
                    if (viewGroup2 != null) {
                    }
                    if (i == 0) {
                    }
                    if (i != 0) {
                    }
                    iVar2 = null;
                    this.e = iVar2;
                    this.f1548d = true;
                    return iVar2;
                }
                i = 0;
                abstractComponentCallbacksC0070s.K(0, 0, 0, 0);
                viewGroup = abstractComponentCallbacksC0070s.f1583E;
                if (viewGroup != null) {
                }
                viewGroup2 = abstractComponentCallbacksC0070s.f1583E;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                iVar2 = null;
                this.e = iVar2;
                this.f1548d = true;
                return iVar2;
            }
            if (rVar != null) {
                i = rVar.f1572c;
                abstractComponentCallbacksC0070s.K(0, 0, 0, 0);
                viewGroup = abstractComponentCallbacksC0070s.f1583E;
                if (viewGroup != null) {
                }
                viewGroup2 = abstractComponentCallbacksC0070s.f1583E;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                iVar2 = null;
                this.e = iVar2;
                this.f1548d = true;
                return iVar2;
            }
            i = 0;
            abstractComponentCallbacksC0070s.K(0, 0, 0, 0);
            viewGroup = abstractComponentCallbacksC0070s.f1583E;
            if (viewGroup != null) {
            }
            viewGroup2 = abstractComponentCallbacksC0070s.f1583E;
            if (viewGroup2 != null) {
            }
            if (i == 0) {
            }
            if (i != 0) {
            }
            iVar2 = null;
            this.e = iVar2;
            this.f1548d = true;
            return iVar2;
        }
        if (!z2) {
            if (rVar != null) {
                i = rVar.e;
                abstractComponentCallbacksC0070s.K(0, 0, 0, 0);
                viewGroup = abstractComponentCallbacksC0070s.f1583E;
                if (viewGroup != null) {
                }
                viewGroup2 = abstractComponentCallbacksC0070s.f1583E;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                iVar2 = null;
                this.e = iVar2;
                this.f1548d = true;
                return iVar2;
            }
            i = 0;
            abstractComponentCallbacksC0070s.K(0, 0, 0, 0);
            viewGroup = abstractComponentCallbacksC0070s.f1583E;
            if (viewGroup != null) {
            }
            viewGroup2 = abstractComponentCallbacksC0070s.f1583E;
            if (viewGroup2 != null) {
            }
            if (i == 0) {
            }
            if (i != 0) {
            }
            iVar2 = null;
            this.e = iVar2;
            this.f1548d = true;
            return iVar2;
        }
        if (rVar != null) {
            i = rVar.f1573d;
            abstractComponentCallbacksC0070s.K(0, 0, 0, 0);
            viewGroup = abstractComponentCallbacksC0070s.f1583E;
            if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
                abstractComponentCallbacksC0070s.f1583E.setTag(R.id.visible_removing_fragment_view_tag, null);
            }
            viewGroup2 = abstractComponentCallbacksC0070s.f1583E;
            if (viewGroup2 != null || viewGroup2.getLayoutTransition() == null) {
                if (i == 0 && i2 != 0) {
                    i = i2 == 4097 ? i2 != 8194 ? i2 != 8197 ? i2 != 4099 ? i2 != 4100 ? -1 : z2 ? R.j.q0(context, android.R.attr.activityOpenEnterAnimation) : R.j.q0(context, android.R.attr.activityOpenExitAnimation) : z2 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z2 ? R.j.q0(context, android.R.attr.activityCloseEnterAnimation) : R.j.q0(context, android.R.attr.activityCloseExitAnimation) : z2 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z2 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                }
                if (i != 0) {
                    boolean equals = "anim".equals(context.getResources().getResourceTypeName(i));
                    if (equals) {
                        try {
                            loadAnimation = AnimationUtils.loadAnimation(context, i);
                        } catch (Resources.NotFoundException e) {
                            throw e;
                        } catch (RuntimeException unused) {
                        }
                        if (loadAnimation != null) {
                            iVar = new F.i(loadAnimation);
                            iVar2 = iVar;
                            this.e = iVar2;
                            this.f1548d = true;
                            return iVar2;
                        }
                    }
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
                    if (loadAnimator != null) {
                        iVar = new F.i(loadAnimator);
                        iVar2 = iVar;
                        this.e = iVar2;
                        this.f1548d = true;
                        return iVar2;
                    }
                }
            }
            iVar2 = null;
            this.e = iVar2;
            this.f1548d = true;
            return iVar2;
        }
        i = 0;
        abstractComponentCallbacksC0070s.K(0, 0, 0, 0);
        viewGroup = abstractComponentCallbacksC0070s.f1583E;
        if (viewGroup != null) {
            abstractComponentCallbacksC0070s.f1583E.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        viewGroup2 = abstractComponentCallbacksC0070s.f1583E;
        if (viewGroup2 != null) {
        }
        if (i == 0) {
            i = i2 == 4097 ? i2 != 8194 ? i2 != 8197 ? i2 != 4099 ? i2 != 4100 ? -1 : z2 ? R.j.q0(context, android.R.attr.activityOpenEnterAnimation) : R.j.q0(context, android.R.attr.activityOpenExitAnimation) : z2 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z2 ? R.j.q0(context, android.R.attr.activityCloseEnterAnimation) : R.j.q0(context, android.R.attr.activityCloseExitAnimation) : z2 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z2 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
        }
        if (i != 0) {
        }
        iVar2 = null;
        this.e = iVar2;
        this.f1548d = true;
        return iVar2;
    }
}
