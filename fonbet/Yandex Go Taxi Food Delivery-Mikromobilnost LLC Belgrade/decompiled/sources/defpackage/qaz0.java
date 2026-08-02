package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.messaging.analytics.b;
import com.yandex.messaging.internal.view.timeline.ChatItemHighlighter;
import com.yandex.messaging.internal.view.timeline.MissedHistoryAnimator;
import com.yandex.messaging.internal.view.timeline.e;
import java.util.Date;
import java.util.HashMap;
import kotlin.Pair;

/* loaded from: classes15.dex */
public final class qaz0 extends RecyclerView.d {
    public final kb A;
    public final Rect B;
    public final Rect C;
    public final Rect D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final Paint J;
    public final Paint K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final arg Q;
    public final Paint R;
    public final int S;
    public final Paint T;
    public final Drawable U;
    public int V;
    public int W;
    public RecyclerView Z;
    public final w3c a;
    public int a0;
    public final z9z0 b;
    public boolean b0;
    public final ChatItemHighlighter c;
    public boolean c0;
    public final MissedHistoryAnimator w;
    public final dbb x;
    public final yi6 y;
    public final h9z0 z;

    public qaz0(Activity activity, w3c w3cVar, mp11 mp11Var, z9z0 z9z0Var, ChatItemHighlighter chatItemHighlighter, MissedHistoryAnimator missedHistoryAnimator, dbb dbbVar, yi6 yi6Var, h9z0 h9z0Var, kb kbVar) {
        this.a = w3cVar;
        this.b = z9z0Var;
        this.c = chatItemHighlighter;
        this.w = missedHistoryAnimator;
        this.x = dbbVar;
        this.y = yi6Var;
        this.z = h9z0Var;
        this.A = kbVar;
        Resources resources = activity.getResources();
        this.B = new Rect();
        this.C = new Rect();
        this.D = new Rect();
        this.E = resources.getDimensionPixelSize(gvg0.chat_timeline_base_message_offset);
        this.F = kjs0.b(12);
        this.G = kjs0.b(16);
        this.H = kjs0.b(18);
        this.I = kjs0.b(24);
        Paint paint = new Paint(1);
        paint.setTextSize(kjs0.e(13));
        paint.setColor(fxa1.c(jng0.messagingCommonTextSecondaryColor, activity).data);
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTypeface(mp11Var.b());
        this.J = paint;
        this.K = new Paint(paint);
        this.L = resources.getDimensionPixelSize(gvg0.chat_timeline_date_top_margin);
        this.M = resources.getDimensionPixelSize(gvg0.chat_timeline_date_bottom_margin);
        this.N = kjs0.b(24);
        this.O = kjs0.b(6);
        this.P = m810.b(14.0f * kjs0.a.scaledDensity);
        this.Q = new arg(activity);
        Paint paint2 = new Paint();
        paint2.setColor(job1.g(fxa1.c(jng0.messagingCommonAccentColor, activity).data, 0.1f));
        this.R = paint2;
        this.S = resources.getDimensionPixelSize(gvg0.chat_timeline_missed_history_item_height);
        Paint paint3 = new Paint(paint);
        paint3.setAlpha(0);
        this.T = paint3;
        this.U = activity.getDrawable(wwg0.msg_bg_sticky_date);
        this.b0 = true;
        this.c0 = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        this.Z = recyclerView;
        qdz0 qdz0Var = (qdz0) recyclerView.getChildViewHolder(view);
        qdz0Var.N.setEmpty();
        boolean z = this.b0;
        kb kbVar = this.A;
        view.setPaddingRelative(kbVar.b(qdz0Var, z), view.getPaddingTop(), kbVar.a(qdz0Var), view.getPaddingBottom());
        rect.set(0, 0, 0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0203  */
    @Override // androidx.recyclerview.widget.RecyclerView.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas, RecyclerView recyclerView, RecyclerView.k kVar) {
        MissedHistoryAnimator missedHistoryAnimator;
        float f;
        wbz0 vbz0Var;
        boolean z;
        mbz0 mbz0Var;
        boolean z2;
        View view;
        boolean z3;
        int i;
        int i2;
        int i3;
        yi6 yi6Var;
        int i4;
        boolean z4;
        boolean z5;
        int i5;
        Rect rect;
        h9z0 h9z0Var;
        yi6 yi6Var2;
        boolean z6;
        String str;
        int i6;
        float f2;
        Drawable drawable;
        gl glVar;
        int i7;
        int i8;
        Paint paint;
        boolean z7;
        boolean z8;
        View childAt;
        Canvas canvas2 = canvas;
        RecyclerView recyclerView2 = recyclerView;
        this.Z = recyclerView2;
        canvas2.save();
        if (recyclerView2.getClipToPadding()) {
            canvas2.clipRect(recyclerView2.getPaddingLeft(), recyclerView2.getPaddingTop(), recyclerView2.getWidth() - recyclerView2.getPaddingRight(), recyclerView2.getHeight() - recyclerView2.getPaddingBottom());
        }
        this.c.onDraw();
        int childCount = recyclerView2.getChildCount();
        this.V = 0;
        int i9 = 0;
        boolean z9 = false;
        boolean z10 = true;
        while (true) {
            missedHistoryAnimator = this.w;
            if (i9 >= childCount) {
                break;
            }
            View childAt2 = recyclerView2.getChildAt(i9);
            qdz0 qdz0Var = (qdz0) recyclerView2.getChildViewHolder(childAt2);
            wbz0 wbz0Var = qdz0Var.O;
            int i10 = i9 + 1;
            if (i10 < childCount) {
                f = 0.5f;
                vbz0Var = ((qdz0) recyclerView2.getChildViewHolder(recyclerView2.getChildAt(i10))).O;
            } else {
                f = 0.5f;
                vbz0Var = new vbz0(0.0d);
            }
            mbz0 mbz0Var2 = qdz0Var.P;
            mbz0 mbz0Var3 = lbz0.a;
            int i11 = i9;
            h9z0 h9z0Var2 = this.z;
            h9z0Var2.getClass();
            int i12 = h9z0Var2.d;
            int i13 = ((qdz0) recyclerView2.getChildViewHolder(childAt2)).O instanceof tbz0 ? i12 : 0;
            if (i10 < childCount) {
                View childAt3 = recyclerView2.getChildAt(i10);
                view = childAt3;
                qdz0 qdz0Var2 = (qdz0) recyclerView2.getChildViewHolder(childAt3);
                z = z9;
                mbz0Var = qdz0Var2.P;
                z2 = qdz0Var2.W();
            } else {
                z = z9;
                mbz0Var = mbz0Var3;
                z2 = false;
                view = null;
            }
            if (i11 == 0) {
                mbz0Var3 = qdz0Var.Q;
            }
            boolean z11 = z2;
            boolean z12 = this.c0 && mbz0Var2.b(mbz0Var);
            boolean z13 = this.c0 && mbz0Var3.b(mbz0Var2);
            w3c w3cVar = this.a;
            boolean m = wbz0Var.m(w3cVar, vbz0Var);
            boolean z14 = m || wbz0Var.e(w3cVar, vbz0Var) || z11;
            qdz0Var.N.setEmpty();
            boolean z15 = qdz0Var instanceof e;
            boolean z16 = z12;
            Rect rect2 = this.B;
            if (z15) {
                e eVar = (e) qdz0Var;
                z3 = z13;
                int save = canvas2.save();
                try {
                    childAt2.getHitRect(rect2);
                    canvas2.clipRect(rect2);
                    i = childCount;
                    i2 = i12;
                    canvas2.translate(rect2.left, rect2.top);
                    eVar.w0(z14, z10);
                    eVar.i0(canvas2, this.b, z14, z10);
                } finally {
                    canvas2.restoreToCount(save);
                }
            } else {
                z3 = z13;
                i = childCount;
                i2 = i12;
            }
            boolean z17 = z14 && this.b0;
            recyclerView2.getDecoratedBoundsWithMargins(childAt2, rect2);
            if (z17) {
                rect2.top -= i13;
            }
            int i14 = this.L;
            yi6 yi6Var3 = this.y;
            int i15 = this.M;
            if (m) {
                int i16 = rect2.top - i15;
                i3 = i14;
                int i17 = this.N;
                if (i16 > 0) {
                    i4 = i15;
                    if (i16 <= (i17 + i3) * 2) {
                        this.V = i16;
                        this.W = i16 - (view != null ? view.getBottom() : 0);
                    }
                } else {
                    i4 = i15;
                }
                Paint paint2 = this.J;
                Paint paint3 = i16 <= i17 ? this.K : paint2;
                int i18 = this.V - i17;
                if (i18 > 0) {
                    int i19 = this.W;
                    int i20 = this.O;
                    if (i18 <= i19 + i20) {
                        i7 = rect2.bottom - i20;
                        i8 = yi6Var3.c;
                        yi6Var = yi6Var3;
                        if (i8 != -1 || (childAt = recyclerView2.getChildAt(i8 - 1)) == null || i7 >= childAt.getTop() - this.W) {
                            paint = paint3;
                            z7 = true;
                        } else {
                            paint = paint2;
                            z7 = false;
                        }
                        double q = wbz0Var.q() * 1000.0d;
                        boolean z18 = z17;
                        String b = this.Q.b(new Date(Math.round(q)));
                        z8 = z7;
                        int min = Math.min(Math.min(sb2.k(255 - (i16 - i17), 0, 255), this.a0), paint.getAlpha());
                        int length = b.length();
                        z5 = z14;
                        Rect rect3 = this.C;
                        paint.getTextBounds(b, 0, length, rect3);
                        z4 = z18;
                        i5 = i10;
                        rect3.offset(((int) (recyclerView2.getWidth() * 0.5d)) - (rect3.width() / 2), rect2.top - i4);
                        if (z8) {
                            f(canvas2, rect3, min);
                        }
                        canvas2.drawText(b, recyclerView2.getWidth() * f, rect2.top - i4, paint);
                    }
                }
                i7 = i17;
                i8 = yi6Var3.c;
                yi6Var = yi6Var3;
                if (i8 != -1) {
                }
                paint = paint3;
                z7 = true;
                double q2 = wbz0Var.q() * 1000.0d;
                boolean z182 = z17;
                String b2 = this.Q.b(new Date(Math.round(q2)));
                z8 = z7;
                int min2 = Math.min(Math.min(sb2.k(255 - (i16 - i17), 0, 255), this.a0), paint.getAlpha());
                int length2 = b2.length();
                z5 = z14;
                Rect rect32 = this.C;
                paint.getTextBounds(b2, 0, length2, rect32);
                z4 = z182;
                i5 = i10;
                rect32.offset(((int) (recyclerView2.getWidth() * 0.5d)) - (rect32.width() / 2), rect2.top - i4);
                if (z8) {
                }
                canvas2.drawText(b2, recyclerView2.getWidth() * f, rect2.top - i4, paint);
            } else {
                i3 = i14;
                yi6Var = yi6Var3;
                i4 = i15;
                z4 = z17;
                z5 = z14;
                i5 = i10;
            }
            int i21 = this.S;
            if (z16) {
                int i22 = rect2.top;
                if (m) {
                    i22 -= (i3 + i4) + this.P;
                }
                int i23 = i22 - i21;
                if (i22 > 0) {
                    missedHistoryAnimator.onMissedHistoryDraw(canvas2, recyclerView2.getWidth() * f, (i22 + i23) / 2.0f);
                    z = true;
                }
            }
            if (z3) {
                int i24 = rect2.bottom;
                int i25 = i21 + i24;
                if (i24 < recyclerView2.getHeight()) {
                    missedHistoryAnimator.onMissedHistoryDraw(canvas2, recyclerView2.getWidth() * f, (i25 + i24) / 2.0f);
                    z = true;
                }
            }
            if ((qdz0Var instanceof e) && ((e) qdz0Var).p0()) {
                rect = rect2;
                h9z0Var = h9z0Var2;
                yi6Var2 = yi6Var;
                canvas2.drawRect(0.0f, rect2.top, recyclerView2.getWidth(), rect2.bottom, this.R);
            } else {
                rect = rect2;
                h9z0Var = h9z0Var2;
                yi6Var2 = yi6Var;
            }
            this.c.onItemDraw(canvas, 0, rect.top, recyclerView2.getWidth(), rect.bottom, qdz0Var);
            canvas2 = canvas;
            int i26 = yi6Var2.c;
            if (i26 != -1 && i26 == recyclerView2.getChildAdapterPosition(childAt2)) {
                canvas2.save();
                canvas2.translate(0.0f, rect.bottom + (qdz0Var.W() ? this.G : 0));
                int i27 = yi6Var2.c;
                if (i27 != -1 && (glVar = (gl) yi6Var2.x) != null) {
                    View view2 = (View) glVar.b;
                    boolean z19 = i27 == 0;
                    if (yi6Var2.b != recyclerView2.getWidth() || z19 != glVar.a) {
                        if (glVar.a != z19) {
                            ((TextView) glVar.c).setText(z19 ? oyh0.chat_thread_empty_separator_text : oyh0.chat_thread_separator_text);
                            ((View) glVar.w).setVisibility(z19 ? 4 : 0);
                            ((View) glVar.x).setVisibility(z19 ? 4 : 0);
                            glVar.a = z19;
                        }
                        yi6Var2.b = recyclerView2.getWidth();
                        int width = recyclerView2.getWidth();
                        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                        int i28 = width - (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0);
                        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                        int i29 = i28 - (marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0);
                        int i30 = view2.getLayoutParams().height;
                        view2.measure(View.MeasureSpec.makeMeasureSpec(i29, 1073741824), View.MeasureSpec.makeMeasureSpec(i30, 1073741824));
                        view2.layout(0, 0, i29, i30);
                    }
                    view2.draw(canvas2);
                }
                canvas2.restore();
            }
            if (z4) {
                int i31 = h9z0Var.g;
                TextPaint textPaint = h9z0Var.j;
                TextPaint textPaint2 = h9z0Var.i;
                kb kbVar = h9z0Var.c;
                z6 = false;
                Rect rect4 = h9z0Var.k;
                qdz0 qdz0Var3 = (qdz0) recyclerView2.getChildViewHolder(childAt2);
                Rect rect5 = qdz0Var3.N;
                wbz0 wbz0Var2 = qdz0Var3.O;
                wbz0Var2.getClass();
                if (wbz0Var2 instanceof tbz0) {
                    z83.b(null, 0, Integer.valueOf(childAt2.getPaddingTop()));
                    z83.b(null, 0, Integer.valueOf(childAt2.getPaddingBottom()));
                    String i32 = qdz0Var3.O.i();
                    boolean z20 = childAt2.getLayoutDirection() == 1;
                    int i33 = z20 ? 0 : kbVar.c;
                    int i34 = z20 ? kbVar.c : 0;
                    childAt2.getHitRect(rect4);
                    boolean z21 = z20;
                    rect4.set((childAt2.getPaddingLeft() + rect4.left) - i33, rect4.top - i2, (rect4.right - childAt2.getPaddingRight()) + i34, rect4.bottom);
                    HashMap hashMap = h9z0Var.l;
                    if (((e1k) hashMap.get(i32)) == null) {
                        hashMap.put(i32, ((q0k) h9z0Var.a.get()).b(i32, gvg0.avatar_size_24, new r3k0(21, h9z0Var, i32)));
                    }
                    String str2 = (String) h9z0Var.n.get(i32);
                    if (str2 == null) {
                        str2 = "";
                    }
                    float measureText = textPaint2.measureText(str2);
                    int width2 = rect4.width();
                    int i35 = kbVar.c;
                    float f3 = width2 - i35;
                    if (f3 < measureText) {
                        str2 = TextUtils.ellipsize(str2, textPaint2, f3, TextUtils.TruncateAt.END).toString();
                        measureText = textPaint2.measureText(str2);
                    } else if (h9z0Var.p.contains(i32)) {
                        str = h9z0Var.h;
                        float measureText2 = textPaint.measureText(str);
                        i6 = i35;
                        float f4 = (f3 - measureText) - i31;
                        if (f4 < measureText2) {
                            if (f4 >= h9z0Var.e) {
                                String obj = TextUtils.ellipsize(str, textPaint, f4, TextUtils.TruncateAt.END).toString();
                                f2 = textPaint.measureText(obj);
                                str = obj;
                            }
                            f2 = 0.0f;
                            str = null;
                        } else {
                            f2 = measureText2;
                        }
                        int i36 = rect4.top + h9z0Var.f;
                        if (z21) {
                            float f5 = rect4.left + i6;
                            float f6 = i36;
                            canvas2.drawText(str2, f5, f6, textPaint2);
                            if (str != null) {
                                canvas2.drawText(str, i31 + measureText + f5, f6, textPaint);
                            }
                            int i37 = rect4.left;
                            int i38 = rect4.top;
                            rect5.set(i37, i38, (int) (f5 + measureText), i38 + i2);
                        } else {
                            float f7 = (rect4.right - i6) - measureText;
                            if (str != null) {
                                canvas2.drawText(str, f7 - (f2 + i31), i36, textPaint);
                            }
                            canvas2.drawText(str2, f7, i36, textPaint2);
                            int i39 = rect4.top;
                            rect5.set((int) f7, i39, rect4.right, i39 + i2);
                        }
                        int i40 = !z21 ? rect4.right - i2 : rect4.left;
                        int i41 = !z21 ? rect4.right : rect4.left + i2;
                        int i42 = rect4.top;
                        rect4.set(i40, i42, i41, i42 + i2);
                        drawable = (Drawable) h9z0Var.m.get(i32);
                        if (drawable == null) {
                            Drawable.Callback callback = drawable.getCallback();
                            drawable.setCallback(null);
                            drawable.setBounds(rect4);
                            drawable.setCallback(callback);
                            drawable.draw(canvas2);
                        }
                    }
                    i6 = i35;
                    f2 = 0.0f;
                    str = null;
                    int i362 = rect4.top + h9z0Var.f;
                    if (z21) {
                    }
                    if (!z21) {
                    }
                    if (!z21) {
                    }
                    int i422 = rect4.top;
                    rect4.set(i40, i422, i41, i422 + i2);
                    drawable = (Drawable) h9z0Var.m.get(i32);
                    if (drawable == null) {
                    }
                }
            } else {
                z6 = false;
            }
            recyclerView2 = recyclerView;
            i9 = i5;
            z9 = z;
            childCount = i;
            z10 = z5;
        }
        boolean z22 = z9;
        if (((hab) ((paz0) recyclerView.getAdapter())).c.g == null) {
            missedHistoryAnimator.onMissedHistoryDraw(canvas2, recyclerView.getWidth() * 0.5f, (((recyclerView.getHeight() - recyclerView.getPaddingBottom()) - r2) * 0.5f) + recyclerView.getPaddingTop());
        } else if (!z22) {
            missedHistoryAnimator.onNoMissedHistoryItems();
        }
        canvas2.restore();
        dbb dbbVar = this.x;
        b bVar = dbbVar.a;
        String uniqueRequestId = dbbVar.b.uniqueRequestId();
        tcz0 a = bVar.a(uniqueRequestId);
        if (a == null || true != a.e) {
            return;
        }
        tcz0 tcz0Var = bVar.d;
        bVar.d = null;
        bVar.e = null;
        tcz0 tcz0Var2 = (tcz0Var == null || !tcz0Var.a.equals(uniqueRequestId)) ? null : tcz0Var;
        if (tcz0Var2 != null) {
            bVar.c.getClass();
            tcz0Var2.l = Long.valueOf(SystemClock.elapsedRealtime());
            Long l = tcz0Var2.k;
            long j = tcz0Var2.c;
            if (l != null) {
                long longValue = l.longValue() - j;
                Long l2 = tcz0Var2.l;
                if (l2 != null) {
                    long longValue2 = l2.longValue() - j;
                    scz0 scz0Var = !tcz0Var2.e ? scz0.x : !tcz0Var2.d ? scz0.y : !tcz0Var2.f ? scz0.w : !tcz0Var2.g ? scz0.b : scz0.c;
                    x22 x22Var = bVar.a;
                    Pair pair = new Pair("chat", tcz0Var2.a);
                    Pair pair2 = new Pair("source", tcz0Var2.b);
                    Pair pair3 = new Pair("type", scz0Var.a);
                    Pair pair4 = new Pair("tap2load", Long.valueOf(longValue));
                    Pair pair5 = new Pair("tap2draw", Long.valueOf(longValue2));
                    Long l3 = tcz0Var2.j;
                    long j2 = 0;
                    if (l3 != null) {
                        long longValue3 = l3.longValue();
                        Long l4 = tcz0Var2.i;
                        if (l4 != null) {
                            j2 = longValue3 - l4.longValue();
                        }
                    }
                    x22Var.reportEvent("qm_sdk_chat_timeline", kotlin.collections.b.i(pair, pair2, pair3, pair4, pair5, new Pair("gap_time", Long.valueOf(j2)), new Pair("gap_count", Integer.valueOf(tcz0Var2.h)), new Pair("connection", bVar.b.a().b), new Pair("gapless", Boolean.TRUE)));
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        View childAt;
        int childCount = recyclerView.getChildCount();
        if (childCount == 0) {
            return;
        }
        int i3 = childCount - 1;
        View childAt2 = recyclerView.getChildAt(i3);
        Rect rect = this.B;
        recyclerView.getDecoratedBoundsWithMargins(childAt2, rect);
        while (rect.bottom < 0 && i3 > 0) {
            i3--;
            childAt2 = recyclerView.getChildAt(i3);
            recyclerView.getDecoratedBoundsWithMargins(childAt2, rect);
        }
        String b = this.Q.b(new Date(Math.round(((qdz0) recyclerView.getChildViewHolder(childAt2)).O.q() * 1000.0d)));
        int length = b.length();
        Paint paint = this.J;
        Rect rect2 = this.C;
        paint.getTextBounds(b, 0, length, rect2);
        int i4 = this.V;
        int i5 = this.N;
        int i6 = i4 - i5;
        if (i6 > 0) {
            int i7 = this.W;
            int i8 = this.O;
            if (i6 <= i7 + i8) {
                i = rect.bottom - i8;
                i2 = this.y.c;
                if ((i2 != -1 || (childAt = recyclerView.getChildAt(i2 - 1)) == null || i >= childAt.getTop() - this.M) && i <= i5) {
                    rect2.offset(((int) (recyclerView.getWidth() * 0.5d)) - (rect2.width() / 2), i);
                    f(canvas, rect2, this.a0);
                    canvas.drawText(b, recyclerView.getWidth() * 0.5f, i, this.T);
                }
                return;
            }
        }
        i = i5;
        i2 = this.y.c;
        if (i2 != -1) {
        }
        rect2.offset(((int) (recyclerView.getWidth() * 0.5d)) - (rect2.width() / 2), i);
        f(canvas, rect2, this.a0);
        canvas.drawText(b, recyclerView.getWidth() * 0.5f, i, this.T);
    }

    public final void f(Canvas canvas, Rect rect, int i) {
        int i2 = rect.left;
        int i3 = this.O;
        int i4 = i2 - (i3 * 2);
        int i5 = rect.top - i3;
        int i6 = (i3 * 2) + rect.right;
        int i7 = rect.bottom + i3;
        Rect rect2 = this.D;
        rect2.set(i4, i5, i6, i7);
        Drawable drawable = this.U;
        drawable.setBounds(rect2);
        drawable.setAlpha(i);
        drawable.draw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(View view, View view2) {
        boolean z;
        int i;
        RecyclerView recyclerView = this.Z;
        if (recyclerView == null) {
            ny61.g("Required value was null.");
            return 0;
        }
        wbz0 wbz0Var = ((qdz0) recyclerView.getChildViewHolder(view)).O;
        wbz0 vbz0Var = new vbz0(0.0d);
        if (view2 != null) {
            qdz0 qdz0Var = (qdz0) recyclerView.getChildViewHolder(view2);
            vbz0Var = qdz0Var.O;
            z = qdz0Var.W();
        } else {
            z = false;
        }
        w3c w3cVar = this.a;
        boolean m = wbz0Var.m(w3cVar, vbz0Var);
        boolean e = wbz0Var.e(w3cVar, vbz0Var);
        if (this.b0) {
            h9z0 h9z0Var = this.z;
            h9z0Var.getClass();
            if (((qdz0) recyclerView.getChildViewHolder(view)).O instanceof tbz0) {
                i = h9z0Var.d;
                int i2 = this.F;
                if (i <= 0) {
                    if (m) {
                        return i;
                    }
                    if (z) {
                        return i + this.G;
                    }
                    if (e) {
                        return i + i2;
                    }
                } else {
                    if (z) {
                        return this.I;
                    }
                    if (e) {
                        return i2;
                    }
                }
                return 0;
            }
        }
        i = 0;
        int i22 = this.F;
        if (i <= 0) {
        }
        return 0;
    }

    public final int h(View view, View view2, boolean z) {
        RecyclerView recyclerView = this.Z;
        if (recyclerView == null) {
            ny61.g("Required value was null.");
            return 0;
        }
        wbz0 wbz0Var = ((qdz0) recyclerView.getChildViewHolder(view)).O;
        wbz0 vbz0Var = new vbz0(0.0d);
        if (view2 != null) {
            vbz0Var = ((qdz0) recyclerView.getChildViewHolder(view2)).O;
        }
        if (wbz0Var.m(this.a, vbz0Var)) {
            return (z ? 0 : this.L) + this.M + this.P;
        }
        return 0;
    }

    public final int i(View view, View view2) {
        RecyclerView recyclerView = this.Z;
        if (recyclerView == null) {
            ny61.g("Required value was null.");
            return 0;
        }
        if ((view == null ? view2 : view) == null) {
            ny61.g("Required value was null.");
            return 0;
        }
        if (this.c0) {
            mbz0 mbz0Var = lbz0.a;
            mbz0 mbz0Var2 = view != null ? ((qdz0) recyclerView.getChildViewHolder(view)).P : ((qdz0) recyclerView.getChildViewHolder(view2)).Q;
            if (view2 != null) {
                mbz0Var = ((qdz0) recyclerView.getChildViewHolder(view2)).P;
            }
            if (mbz0Var2.b(mbz0Var)) {
                return this.S;
            }
        }
        return 0;
    }

    public final int j(View view) {
        View view2;
        RecyclerView recyclerView = this.Z;
        if (recyclerView == null) {
            ny61.g("Required value was null.");
            return 0;
        }
        yi6 yi6Var = this.y;
        int i = yi6Var.c;
        if (i == -1 || i != recyclerView.getChildAdapterPosition(view)) {
            return 0;
        }
        gl glVar = (gl) yi6Var.x;
        if (glVar != null) {
            view2 = (View) glVar.b;
        } else {
            View inflate = ((Activity) yi6Var.w).getLayoutInflater().inflate(olh0.msg_chat_thread_separator, (ViewGroup) recyclerView, false);
            gl glVar2 = new gl();
            glVar2.b = inflate;
            glVar2.c = (TextView) inflate.findViewById(e9h0.text);
            glVar2.w = inflate.findViewById(e9h0.left);
            glVar2.x = inflate.findViewById(e9h0.right);
            yi6Var.x = glVar2;
            view2 = inflate;
        }
        int i2 = view2.getLayoutParams().height;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i3 = i2 + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        return i3 + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
    }
}
