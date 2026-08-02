package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimationDrawable;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.mediarouter.app.MediaRouteExpandCollapseButton;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class je implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ je(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        xqh xqhVar;
        xqh xqhVar2;
        xqh xqhVar3;
        int i = this.a;
        Message message4 = null;
        message4 = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ig) obj).b();
                break;
            case 1:
                n30 n30Var = (n30) obj;
                if (view == n30Var.i && (message3 = n30Var.k) != null) {
                    message4 = Message.obtain(message3);
                } else if (view == n30Var.l && (message2 = n30Var.n) != null) {
                    message4 = Message.obtain(message2);
                } else if (view == n30Var.o && (message = n30Var.q) != null) {
                    message4 = Message.obtain(message);
                }
                if (message4 != null) {
                    message4.sendToTarget();
                }
                n30Var.E.obtainMessage(1, n30Var.b).sendToTarget();
                break;
            case 2:
                ze3 ze3Var = (ze3) obj;
                if (ze3Var.k && ze3Var.isShowing()) {
                    if (!ze3Var.m) {
                        TypedArray obtainStyledAttributes = ze3Var.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        ze3Var.l = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        ze3Var.m = true;
                    }
                    if (ze3Var.l) {
                        ze3Var.cancel();
                        break;
                    }
                }
                break;
            case 3:
                if (!bp6.a.contains(this)) {
                    try {
                        ((b08) obj).B();
                        break;
                    } catch (Throwable th) {
                        bp6.a(this, th);
                        return;
                    }
                }
                break;
            case 4:
                if (!bp6.a.contains(this)) {
                    try {
                        ((j18) obj).i.dismiss();
                        break;
                    } catch (Throwable th2) {
                        bp6.a(this, th2);
                        return;
                    }
                }
                break;
            case 5:
                adh adhVar = (adh) obj;
                int i2 = adhVar.k;
                if (i2 == 2) {
                    adhVar.y(1);
                    adhVar.n.announceForAccessibility(adhVar.getString(ru.yandex.music.R.string.mtrl_picker_toggled_to_day_selection));
                    break;
                } else if (i2 == 1) {
                    adhVar.y(2);
                    adhVar.m.announceForAccessibility(adhVar.getString(ru.yandex.music.R.string.mtrl_picker_toggled_to_year_selection));
                    break;
                }
                break;
            case 6:
                ((lqh) obj).dismiss();
                break;
            case 7:
                oqh oqhVar = (oqh) obj;
                wqh wqhVar = oqhVar.x;
                if (wqhVar.w != null) {
                    wqhVar.r.removeMessages(2);
                }
                wqhVar.w = oqhVar.u;
                boolean isActivated = view.isActivated();
                boolean z = !isActivated;
                if (isActivated) {
                    Integer num = (Integer) wqhVar.x.get(oqhVar.u.c);
                    r6 = num == null ? 1 : Math.max(1, num.intValue());
                }
                oqhVar.u(z);
                oqhVar.w.setProgress(r6);
                oqhVar.u.j(r6);
                wqhVar.r.sendEmptyMessageDelayed(2, 500L);
                break;
            case 8:
                pqh pqhVar = (pqh) obj;
                krh krhVar = pqhVar.A.m.f;
                irh irhVar = pqhVar.z;
                krhVar.getClass();
                if (irhVar != null) {
                    krh.b();
                    yld c = krh.c();
                    if (c.e instanceof yqh) {
                        g8c b = c.d.b(irhVar);
                        if (b == null || (xqhVar = (xqh) b.a) == null || !xqhVar.e) {
                            Log.w("GlobalMediaRouter", "Ignoring attempt to transfer to a non-transferable route.");
                        } else {
                            ((yqh) c.e).o(Collections.singletonList(irhVar.b));
                        }
                        pqhVar.v.setVisibility(4);
                        pqhVar.w.setVisibility(0);
                        break;
                    } else {
                        xq0.q("There is no currently selected dynamic group route.");
                        break;
                    }
                } else {
                    jj4.j("route must not be null");
                    break;
                }
                break;
            case 9:
                tqh tqhVar = (tqh) obj;
                boolean v = tqhVar.v(tqhVar.u);
                boolean z2 = !v;
                boolean e = tqhVar.u.e();
                uqh uqhVar = tqhVar.H;
                if (!v) {
                    krh krhVar2 = uqhVar.m.f;
                    irh irhVar2 = tqhVar.u;
                    krhVar2.getClass();
                    if (irhVar2 == null) {
                        jj4.j("route must not be null");
                        break;
                    } else {
                        krh.b();
                        yld c2 = krh.c();
                        if (!(c2.e instanceof yqh)) {
                            xq0.q("There is no currently selected dynamic group route.");
                            break;
                        } else {
                            g8c b2 = c2.d.b(irhVar2);
                            if (Collections.unmodifiableList(c2.d.v).contains(irhVar2) || b2 == null || (xqhVar3 = (xqh) b2.a) == null || !xqhVar3.d) {
                                Log.w("GlobalMediaRouter", "Ignoring attempt to add a non-groupable route to dynamic group : " + irhVar2);
                            } else {
                                ((yqh) c2.e).m(irhVar2.b);
                            }
                        }
                    }
                } else {
                    krh krhVar3 = uqhVar.m.f;
                    irh irhVar3 = tqhVar.u;
                    krhVar3.getClass();
                    if (irhVar3 == null) {
                        jj4.j("route must not be null");
                        break;
                    } else {
                        krh.b();
                        yld c3 = krh.c();
                        if (!(c3.e instanceof yqh)) {
                            xq0.q("There is no currently selected dynamic group route.");
                            break;
                        } else {
                            g8c b3 = c3.d.b(irhVar3);
                            if (!Collections.unmodifiableList(c3.d.v).contains(irhVar3) || b3 == null || ((xqhVar2 = (xqh) b3.a) != null && !xqhVar2.c)) {
                                Log.w("GlobalMediaRouter", "Ignoring attempt to remove a non-unselectable member route : " + irhVar3);
                            } else if (Collections.unmodifiableList(c3.d.v).size() <= 1) {
                                Log.w("GlobalMediaRouter", "Ignoring attempt to remove the last member route.");
                            } else {
                                ((yqh) c3.e).n(irhVar3.b);
                            }
                        }
                    }
                }
                tqhVar.w(z2, !e);
                if (e) {
                    List unmodifiableList = Collections.unmodifiableList(uqhVar.m.i.v);
                    for (irh irhVar4 : Collections.unmodifiableList(tqhVar.u.v)) {
                        if (unmodifiableList.contains(irhVar4) != z2) {
                            oqh oqhVar2 = (oqh) uqhVar.m.v.get(irhVar4.c);
                            if (oqhVar2 instanceof tqh) {
                                ((tqh) oqhVar2).w(z2, true);
                            }
                        }
                    }
                }
                wqh wqhVar2 = uqhVar.m;
                irh irhVar5 = tqhVar.u;
                List unmodifiableList2 = Collections.unmodifiableList(wqhVar2.i.v);
                int max = Math.max(1, unmodifiableList2.size());
                if (irhVar5.e()) {
                    Iterator it = Collections.unmodifiableList(irhVar5.v).iterator();
                    while (it.hasNext()) {
                        if (unmodifiableList2.contains((irh) it.next()) != z2) {
                            max += !v ? 1 : -1;
                        }
                    }
                } else {
                    max += v ? -1 : 1;
                }
                boolean z3 = wqhVar2.y0 && Collections.unmodifiableList(wqhVar2.i.v).size() > 1;
                boolean z4 = wqhVar2.y0 && max >= 2;
                if (z3 != z4) {
                    opn S = wqhVar2.s.S(0);
                    if (S instanceof qqh) {
                        qqh qqhVar = (qqh) S;
                        uqhVar.u(z4 ? qqhVar.z : 0, qqhVar.a);
                        break;
                    }
                }
                break;
            case 10:
                MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) obj;
                AnimationDrawable animationDrawable = mediaRouteExpandCollapseButton.e;
                AnimationDrawable animationDrawable2 = mediaRouteExpandCollapseButton.d;
                boolean z5 = mediaRouteExpandCollapseButton.h;
                mediaRouteExpandCollapseButton.h = !z5;
                if (z5) {
                    mediaRouteExpandCollapseButton.setImageDrawable(animationDrawable);
                    animationDrawable.start();
                    mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.f);
                } else {
                    mediaRouteExpandCollapseButton.setImageDrawable(animationDrawable2);
                    animationDrawable2.start();
                    mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.g);
                }
                View.OnClickListener onClickListener = mediaRouteExpandCollapseButton.i;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 11:
                pos posVar = ((Toolbar) obj).v0;
                rxh rxhVar = posVar != null ? posVar.b : null;
                if (rxhVar != null) {
                    rxhVar.collapseActionView();
                    break;
                }
                break;
            default:
                if (!bp6.a.contains(this)) {
                    try {
                        ((lbv) obj).cancel();
                        break;
                    } catch (Throwable th3) {
                        bp6.a(this, th3);
                    }
                }
                break;
        }
    }
}
