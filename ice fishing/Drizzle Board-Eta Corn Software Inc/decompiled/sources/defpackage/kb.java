package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.kolosta.rejin.jilosa.R;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class kb extends cD2QLRqg {
    public final boolean MdtA4re8;
    public mcXgUFR8 VgvYg0wo;
    public boolean wxUZMvaN;

    public kb(d80 d80Var, o3 o3Var, boolean z) {
        super(d80Var, o3Var);
        this.MdtA4re8 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final mcXgUFR8 amk52bBQ(Context context) {
        int i;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Animation loadAnimation;
        mcXgUFR8 mcxgufr8;
        if (this.wxUZMvaN) {
            return this.VgvYg0wo;
        }
        d80 d80Var = (d80) this.qoPGr6Ce;
        li liVar = d80Var.MdtA4re8;
        boolean z = d80Var.qoPGr6Ce == 2;
        ki kiVar = liVar.VhgXwMj9;
        int i2 = kiVar == null ? 0 : kiVar.P7K7Inc8;
        if (!this.MdtA4re8) {
            if (z) {
                if (kiVar != null) {
                    i = kiVar.NCTxEWno;
                    liVar.fVMzMhyS(0, 0, 0, 0);
                    viewGroup = liVar.SgZGMMPL;
                    mcXgUFR8 mcxgufr82 = null;
                    if (viewGroup != null) {
                    }
                    viewGroup2 = liVar.SgZGMMPL;
                    if (viewGroup2 != null) {
                    }
                    if (i == 0) {
                    }
                    if (i != 0) {
                    }
                    this.VgvYg0wo = mcxgufr82;
                    this.wxUZMvaN = true;
                    return mcxgufr82;
                }
                i = 0;
                liVar.fVMzMhyS(0, 0, 0, 0);
                viewGroup = liVar.SgZGMMPL;
                mcXgUFR8 mcxgufr822 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = liVar.SgZGMMPL;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.VgvYg0wo = mcxgufr822;
                this.wxUZMvaN = true;
                return mcxgufr822;
            }
            if (kiVar != null) {
                i = kiVar.MdtA4re8;
                liVar.fVMzMhyS(0, 0, 0, 0);
                viewGroup = liVar.SgZGMMPL;
                mcXgUFR8 mcxgufr8222 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = liVar.SgZGMMPL;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.VgvYg0wo = mcxgufr8222;
                this.wxUZMvaN = true;
                return mcxgufr8222;
            }
            i = 0;
            liVar.fVMzMhyS(0, 0, 0, 0);
            viewGroup = liVar.SgZGMMPL;
            mcXgUFR8 mcxgufr82222 = null;
            if (viewGroup != null) {
            }
            viewGroup2 = liVar.SgZGMMPL;
            if (viewGroup2 != null) {
            }
            if (i == 0) {
            }
            if (i != 0) {
            }
            this.VgvYg0wo = mcxgufr82222;
            this.wxUZMvaN = true;
            return mcxgufr82222;
        }
        if (!z) {
            if (kiVar != null) {
                i = kiVar.VgvYg0wo;
                liVar.fVMzMhyS(0, 0, 0, 0);
                viewGroup = liVar.SgZGMMPL;
                mcXgUFR8 mcxgufr822222 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = liVar.SgZGMMPL;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.VgvYg0wo = mcxgufr822222;
                this.wxUZMvaN = true;
                return mcxgufr822222;
            }
            i = 0;
            liVar.fVMzMhyS(0, 0, 0, 0);
            viewGroup = liVar.SgZGMMPL;
            mcXgUFR8 mcxgufr8222222 = null;
            if (viewGroup != null) {
            }
            viewGroup2 = liVar.SgZGMMPL;
            if (viewGroup2 != null) {
            }
            if (i == 0) {
            }
            if (i != 0) {
            }
            this.VgvYg0wo = mcxgufr8222222;
            this.wxUZMvaN = true;
            return mcxgufr8222222;
        }
        if (kiVar != null) {
            i = kiVar.wxUZMvaN;
            liVar.fVMzMhyS(0, 0, 0, 0);
            viewGroup = liVar.SgZGMMPL;
            mcXgUFR8 mcxgufr82222222 = null;
            if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
                liVar.SgZGMMPL.setTag(R.id.visible_removing_fragment_view_tag, null);
            }
            viewGroup2 = liVar.SgZGMMPL;
            if (viewGroup2 != null || viewGroup2.getLayoutTransition() == null) {
                if (i == 0 && i2 != 0) {
                    i = i2 == 4097 ? i2 != 8194 ? i2 != 8197 ? i2 != 4099 ? i2 != 4100 ? -1 : z ? fn.eIA6dogk(context, android.R.attr.activityOpenEnterAnimation) : fn.eIA6dogk(context, android.R.attr.activityOpenExitAnimation) : z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z ? fn.eIA6dogk(context, android.R.attr.activityCloseEnterAnimation) : fn.eIA6dogk(context, android.R.attr.activityCloseExitAnimation) : z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                }
                if (i != 0) {
                    boolean equals = "anim".equals(context.getResources().getResourceTypeName(i));
                    try {
                        if (equals) {
                            try {
                                loadAnimation = AnimationUtils.loadAnimation(context, i);
                            } catch (Resources.NotFoundException e) {
                                throw e;
                            } catch (RuntimeException unused) {
                            }
                            if (loadAnimation != null) {
                                mcxgufr8 = new mcXgUFR8(loadAnimation);
                                mcxgufr82222222 = mcxgufr8;
                            }
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
                        if (loadAnimator != null) {
                            mcxgufr8 = new mcXgUFR8(loadAnimator);
                            mcxgufr82222222 = mcxgufr8;
                        }
                    } catch (RuntimeException e2) {
                        if (equals) {
                            throw e2;
                        }
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i);
                        if (loadAnimation2 != null) {
                            mcxgufr82222222 = new mcXgUFR8(loadAnimation2);
                        }
                    }
                }
            }
            this.VgvYg0wo = mcxgufr82222222;
            this.wxUZMvaN = true;
            return mcxgufr82222222;
        }
        i = 0;
        liVar.fVMzMhyS(0, 0, 0, 0);
        viewGroup = liVar.SgZGMMPL;
        mcXgUFR8 mcxgufr822222222 = null;
        if (viewGroup != null) {
            liVar.SgZGMMPL.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        viewGroup2 = liVar.SgZGMMPL;
        if (viewGroup2 != null) {
        }
        if (i == 0) {
            i = i2 == 4097 ? i2 != 8194 ? i2 != 8197 ? i2 != 4099 ? i2 != 4100 ? -1 : z ? fn.eIA6dogk(context, android.R.attr.activityOpenEnterAnimation) : fn.eIA6dogk(context, android.R.attr.activityOpenExitAnimation) : z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z ? fn.eIA6dogk(context, android.R.attr.activityCloseEnterAnimation) : fn.eIA6dogk(context, android.R.attr.activityCloseExitAnimation) : z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
        }
        if (i != 0) {
        }
        this.VgvYg0wo = mcxgufr822222222;
        this.wxUZMvaN = true;
        return mcxgufr822222222;
    }
}
