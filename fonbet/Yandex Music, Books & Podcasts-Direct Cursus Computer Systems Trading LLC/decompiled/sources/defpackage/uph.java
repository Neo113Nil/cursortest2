package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes.dex */
public final class uph implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Map a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ aqh c;

    public uph(aqh aqhVar, HashMap hashMap, HashMap hashMap2) {
        this.c = aqhVar;
        this.a = hashMap;
        this.b = hashMap2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Map map;
        Map map2;
        fzj fzjVar;
        irh irhVar;
        aqh aqhVar = this.c;
        aqhVar.E.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        HashSet hashSet = aqhVar.H;
        if (hashSet == null || aqhVar.I == null) {
            return;
        }
        int size = hashSet.size() - aqhVar.I.size();
        qph qphVar = new qph(aqhVar, 1);
        int firstVisiblePosition = aqhVar.E.getFirstVisiblePosition();
        int i = 0;
        boolean z = false;
        while (true) {
            int childCount = aqhVar.E.getChildCount();
            map = this.a;
            map2 = this.b;
            if (i >= childCount) {
                break;
            }
            View childAt = aqhVar.E.getChildAt(i);
            irh irhVar2 = (irh) aqhVar.F.getItem(firstVisiblePosition + i);
            Rect rect = (Rect) map.get(irhVar2);
            int top = childAt.getTop();
            int i2 = rect != null ? rect.top : (aqhVar.Z * size) + top;
            AnimationSet animationSet = new AnimationSet(true);
            HashSet hashSet2 = aqhVar.H;
            if (hashSet2 == null || !hashSet2.contains(irhVar2)) {
                irhVar = irhVar2;
            } else {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                irhVar = irhVar2;
                alphaAnimation.setDuration(aqhVar.O0);
                animationSet.addAnimation(alphaAnimation);
                i2 = top;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, i2 - top, 0.0f);
            translateAnimation.setDuration(aqhVar.N0);
            animationSet.addAnimation(translateAnimation);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setInterpolator(aqhVar.Q0);
            if (!z) {
                animationSet.setAnimationListener(qphVar);
                z = true;
            }
            childAt.clearAnimation();
            childAt.startAnimation(animationSet);
            irh irhVar3 = irhVar;
            map.remove(irhVar3);
            map2.remove(irhVar3);
            i++;
        }
        for (Map.Entry entry : map2.entrySet()) {
            irh irhVar4 = (irh) entry.getKey();
            BitmapDrawable bitmapDrawable = (BitmapDrawable) entry.getValue();
            Rect rect2 = (Rect) map.get(irhVar4);
            if (aqhVar.I.contains(irhVar4)) {
                fzjVar = new fzj(bitmapDrawable, rect2);
                fzjVar.h = 0.0f;
                fzjVar.e = aqhVar.P0;
                fzjVar.d = aqhVar.Q0;
            } else {
                int i3 = aqhVar.Z * size;
                fzj fzjVar2 = new fzj(bitmapDrawable, rect2);
                fzjVar2.g = i3;
                fzjVar2.e = aqhVar.N0;
                fzjVar2.d = aqhVar.Q0;
                fzjVar2.l = new qdc(aqhVar, irhVar4);
                aqhVar.J.add(irhVar4);
                fzjVar = fzjVar2;
            }
            aqhVar.E.a.add(fzjVar);
        }
    }
}
