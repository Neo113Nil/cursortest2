package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class rhy extends RecyclerView.d {
    public final float A;
    public final float B;
    public final float C;
    public final float D;
    public final bdc E;
    public final ArrayList F;
    public eiy G;
    public float H;
    public final Context a;
    public final Paint b;
    public final Paint c;
    public final Paint w;
    public final Rect x;
    public final Rect y;
    public float z;

    public rhy(Context context) {
        this.a = context;
        Paint f = unr0.f(true);
        f.setStrokeWidth(tje.w(4, context));
        Paint.Cap cap = Paint.Cap.ROUND;
        f.setStrokeCap(cap);
        this.b = f;
        Paint paint = new Paint();
        paint.setStrokeWidth(tje.w(4, context));
        paint.setStrokeCap(cap);
        paint.setPathEffect(new DashPathEffect(new float[]{20.0f, 20.0f}, 10.0f));
        this.c = paint;
        this.w = unr0.f(true);
        this.x = new Rect();
        this.y = new Rect();
        this.A = tje.w(8, context);
        this.B = tje.w(4, context);
        this.C = tje.w(2, context);
        this.D = tje.w(4, context);
        this.E = new bdc(xng0.controlMinor);
        this.F = new ArrayList();
        this.G = aiy.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r1 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r1 = ((defpackage.t7u) r19.getChildViewHolder(r1)).g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (r1 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        r0.G = r1;
        r0.H = 0.0f;
        r9 = r19.getChildCount();
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        r11 = r0.F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r10 >= r9) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        r1 = r19.getChildViewHolder(r19.getChildAt(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if ((r1 instanceof defpackage.t7u) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        r2 = r1.F();
        r3 = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        if (r2 != (-1)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        r12 = (defpackage.t7u) r1;
        r1 = r12.x();
        r2 = r1 instanceof defpackage.cpu;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
    
        if (r2 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        r4 = ((defpackage.cpu) r1).a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0086, code lost:
    
        if (r4.isAttachedToWindow() != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        r13 = r0.x;
        r4.getDrawingRect(r13);
        r19.offsetDescendantRectToMyCoords(r4, r13);
        r13.offset(r7, (int) r3.getTranslationY());
        r0.z = r3.getAlpha();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a5, code lost:
    
        if (r10 != (r19.getChildCount() - 1)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a7, code lost:
    
        r14 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00aa, code lost:
    
        if (r2 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ac, code lost:
    
        r11 = ((defpackage.cpu) r1).b;
        r2 = r13.exactCenterX();
        r15 = r12.g();
        r1 = defpackage.jl40.l(r15, r0.G);
        r3 = r0.y;
        r4 = r0.B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c2, code lost:
    
        if (r1 != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c4, code lost:
    
        r11.getDrawingRect(r3);
        r19.offsetDescendantRectToMyCoords(r11, r3);
        r1 = r3.top;
        r7 = r3;
        r16 = r4;
        r0.f(r18, r2, r0.H, r1, r0.G);
        r0 = r17;
        r0.f(r18, r2, r1, r13.top - r16, r15);
        r0.H = r13.bottom + r16;
        r0.G = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010c, code lost:
    
        r1 = r12.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0116, code lost:
    
        if (defpackage.jl40.l(r1, r0.G) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0118, code lost:
    
        r0.H = r13.bottom + r16;
        r0.G = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0121, code lost:
    
        if (r14 == 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0123, code lost:
    
        r11.getDrawingRect(r7);
        r19.offsetDescendantRectToMyCoords(r11, r7);
        r0.f(r18, r2, r0.H, r7.bottom, r0.G);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x019e, code lost:
    
        r10 = r10 + 1;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f4, code lost:
    
        r7 = r3;
        r16 = r4;
        r0.f(r18, r2, r0.H, r13.top - r16, r0.G);
        r0.H = r13.bottom + r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0138, code lost:
    
        if ((r1 instanceof defpackage.dpu) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x013a, code lost:
    
        r7 = (defpackage.dpu) r1;
        r2 = r13.exactCenterX();
        r15 = r12.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x014b, code lost:
    
        if (defpackage.jl40.l(r15, r0.G) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x014d, code lost:
    
        r4 = r13.top;
        r0.f(r18, r2, r0.H, r4, r0.G);
        r0.H = r4;
        r0.G = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x015d, code lost:
    
        r12 = r12.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0167, code lost:
    
        if (defpackage.jl40.l(r12, r0.G) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0169, code lost:
    
        r0.f(r18, r2, r0.H, r13.exactCenterY(), r0.G);
        r0.H = r13.exactCenterY();
        r0.G = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x017e, code lost:
    
        if (r14 == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0180, code lost:
    
        r0.f(r18, r2, r0.H, r13.bottom, r0.G);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x018c, code lost:
    
        r1 = r7.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x018e, code lost:
    
        if (r1 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0190, code lost:
    
        r11.add(new defpackage.hrn(r1, r2, r13.exactCenterY(), r0.z));
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a3, code lost:
    
        defpackage.w511.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01a6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00a9, code lost:
    
        r14 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x007b, code lost:
    
        if ((r1 instanceof defpackage.dpu) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x007d, code lost:
    
        r4 = ((defpackage.dpu) r1).a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01a7, code lost:
    
        defpackage.w511.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01aa, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ab, code lost:
    
        r1 = r11.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b3, code lost:
    
        if (r1.hasNext() == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01b5, code lost:
    
        r2 = (defpackage.hrn) r1.next();
        r3 = defpackage.qhy.a[r2.a.a.ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01c7, code lost:
    
        if (r3 == 1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01ca, code lost:
    
        if (r3 != 2) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01cc, code lost:
    
        r3 = r0.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01d5, code lost:
    
        r4 = defpackage.s8o.m(r2.a.b, r0.a);
        r5 = r0.w;
        r5.setColor(r4);
        r5.setAlpha((int) (r2.d * 255.0f));
        r18.drawCircle(r2.b, r2.c, r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01cf, code lost:
    
        defpackage.w511.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01d2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d3, code lost:
    
        r3 = r0.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01f7, code lost:
    
        r11.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01fa, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x003f, code lost:
    
        r1 = defpackage.aiy.a;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas, RecyclerView recyclerView, RecyclerView.k kVar) {
        View view;
        rhy rhyVar = this;
        if (recyclerView.getChildCount() != 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                if (!(i2 < recyclerView.getChildCount())) {
                    view = null;
                    break;
                }
                int i3 = i2 + 1;
                view = recyclerView.getChildAt(i2);
                if (view == null) {
                    ny61.s();
                    return;
                } else if (recyclerView.getChildViewHolder(view) instanceof t7u) {
                    break;
                } else {
                    i2 = i3;
                }
            }
        }
    }

    public final void f(Canvas canvas, float f, float f2, float f3, eiy eiyVar) {
        boolean l = jl40.l(eiyVar, yhy.a);
        Context context = this.a;
        if (l) {
            int m = s8o.m(this.E, context);
            Paint paint = this.c;
            paint.setColor(m);
            float f4 = this.A;
            canvas.drawLine(f, f2 + f4, f, f3 - f4, paint);
            return;
        }
        if (jl40.l(eiyVar, aiy.a)) {
            return;
        }
        if (!(eiyVar instanceof ciy)) {
            w511.b();
            return;
        }
        kdc kdcVar = ((ciy) eiyVar).a;
        int m2 = kdcVar != null ? s8o.m(kdcVar, context) : 0;
        Paint paint2 = this.b;
        paint2.setColor(m2);
        canvas.drawLine(f, f2, f, f3, paint2);
    }
}
