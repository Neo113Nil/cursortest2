package defpackage;

import android.content.ClipDescription;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.kolosta.rejin.jilosa.R;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class f0 implements xg, an {
    public static volatile f0 P7K7Inc8;
    public static f0 Qr9iLBAD;
    public static final Object b2ZJblxo = new Object();
    public Object MdtA4re8;
    public final /* synthetic */ int NCTxEWno;
    public Object VgvYg0wo;
    public Object wxUZMvaN;

    public f0(VZZbw3BB vZZbw3BB, re reVar, wa waVar, Set set) {
        this.NCTxEWno = 4;
        this.MdtA4re8 = reVar;
        this.wxUZMvaN = vZZbw3BB;
        this.VgvYg0wo = waVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            euDDoUNr(str, 0, str.length(), 1, true, new lf(str, 0));
        }
    }

    public static f0 Ey6iv0m0(Context context) {
        if (P7K7Inc8 == null) {
            synchronized (b2ZJblxo) {
                try {
                    if (P7K7Inc8 == null) {
                        P7K7Inc8 = new f0(context);
                    }
                } finally {
                }
            }
        }
        return P7K7Inc8;
    }

    public static f0 Mq3SeTnW(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new f0(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        if (r10 != (-1)) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean WYNAV5pd(ff ffVar, Editable editable, int i, int i2, boolean z) {
        int min;
        if (editable != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z) {
                    int max = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                        loop0: while (true) {
                            boolean z2 = false;
                            while (true) {
                                if (max == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart >= 0) {
                                    char charAt = editable.charAt(selectionStart);
                                    if (z2) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt)) {
                                        max--;
                                    } else {
                                        if (Character.isHighSurrogate(charAt)) {
                                            break loop0;
                                        }
                                        z2 = true;
                                    }
                                } else if (!z2) {
                                    selectionStart = 0;
                                }
                            }
                            max--;
                        }
                    }
                    selectionStart = -1;
                    int max2 = Math.max(i2, 0);
                    min = editable.length();
                    if (selectionEnd >= 0 && min >= selectionEnd && max2 >= 0) {
                        loop2: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (max2 == 0) {
                                    min = selectionEnd;
                                    break loop2;
                                }
                                if (selectionEnd < min) {
                                    char charAt2 = editable.charAt(selectionEnd);
                                    if (z3) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt2)) {
                                        max2--;
                                        selectionEnd++;
                                    } else {
                                        if (Character.isLowSurrogate(charAt2)) {
                                            break loop2;
                                        }
                                        selectionEnd++;
                                        z3 = true;
                                    }
                                }
                            }
                            max2--;
                            selectionEnd++;
                        }
                    }
                    min = -1;
                    if (selectionStart != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    min = Math.min(selectionEnd + i2, editable.length());
                }
                ue0[] ue0VarArr = (ue0[]) editable.getSpans(selectionStart, min, ue0.class);
                if (ue0VarArr != null && ue0VarArr.length > 0) {
                    for (ue0 ue0Var : ue0VarArr) {
                        int spanStart = editable.getSpanStart(ue0Var);
                        int spanEnd = editable.getSpanEnd(ue0Var);
                        selectionStart = Math.min(spanStart, selectionStart);
                        min = Math.max(spanEnd, min);
                    }
                    int max3 = Math.max(selectionStart, 0);
                    int min2 = Math.min(min, editable.length());
                    ffVar.beginBatchEdit();
                    editable.delete(max3, min2);
                    ffVar.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean eVhOlqcC(Editable editable, KeyEvent keyEvent, boolean z) {
        ue0[] ue0VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (ue0VarArr = (ue0[]) editable.getSpans(selectionStart, selectionEnd, ue0.class)) != null && ue0VarArr.length > 0) {
                for (ue0 ue0Var : ue0VarArr) {
                    int spanStart = editable.getSpanStart(ue0Var);
                    int spanEnd = editable.getSpanEnd(ue0Var);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean DK9slbsy(CharSequence charSequence, int i, int i2, te0 te0Var) {
        if ((te0Var.MdtA4re8 & 3) == 0) {
            wa waVar = (wa) this.VgvYg0wo;
            ts NCTxEWno = te0Var.NCTxEWno();
            int qoPGr6Ce = NCTxEWno.qoPGr6Ce(8);
            if (qoPGr6Ce != 0) {
                ((ByteBuffer) NCTxEWno.VgvYg0wo).getShort(qoPGr6Ce + NCTxEWno.NCTxEWno);
            }
            waVar.getClass();
            ThreadLocal threadLocal = wa.NCTxEWno;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean hasGlyph = waVar.qoPGr6Ce.hasGlyph(sb.toString());
            int i3 = te0Var.MdtA4re8 & 4;
            te0Var.MdtA4re8 = hasGlyph ? i3 | 2 : i3 | 1;
        }
        return (te0Var.MdtA4re8 & 3) == 2;
    }

    public View FySoLYna(int i) {
        return ((l10) this.MdtA4re8).qoPGr6Ce.getChildAt(i);
    }

    public int I5GHvsYW(int i) {
        a5 a5Var = (a5) this.wxUZMvaN;
        if (i < 0) {
            return -1;
        }
        int childCount = ((l10) this.MdtA4re8).qoPGr6Ce.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int NCTxEWno = i - (i2 - a5Var.NCTxEWno(i2));
            if (NCTxEWno == 0) {
                while (a5Var.wxUZMvaN(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += NCTxEWno;
        }
        return -1;
    }

    public Typeface KlHjfFWx(int i, int i2, n nVar) {
        int resourceId = ((TypedArray) this.MdtA4re8).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        TypedValue typedValue = (TypedValue) this.wxUZMvaN;
        if (typedValue == null) {
            typedValue = new TypedValue();
            this.wxUZMvaN = typedValue;
        }
        TypedValue typedValue2 = typedValue;
        Context context = (Context) this.VgvYg0wo;
        ThreadLocal threadLocal = i30.qoPGr6Ce;
        if (context.isRestricted()) {
            return null;
        }
        return i30.qoPGr6Ce(context, resourceId, typedValue2, i2, nVar, true, false);
    }

    @Override // defpackage.an
    public Object MdtA4re8() {
        return null;
    }

    @Override // defpackage.xg
    public Object NCTxEWno(yg ygVar, g9 g9Var) {
        int i = this.NCTxEWno;
        xe0 xe0Var = xe0.qoPGr6Ce;
        u9 u9Var = u9.NCTxEWno;
        switch (i) {
            case 5:
                Object P7K7Inc82 = fn.P7K7Inc8(g9Var, ygVar, new eh((el) this.VgvYg0wo, (g9) null, 4), new xg[]{(xg) this.MdtA4re8, (xg) this.wxUZMvaN});
                return P7K7Inc82 == u9Var ? P7K7Inc82 : xe0Var;
            default:
                Object NCTxEWno = ((xg) this.MdtA4re8).NCTxEWno(new dh(ygVar, (v30) this.wxUZMvaN, (zk) this.VgvYg0wo), g9Var);
                return NCTxEWno == u9Var ? NCTxEWno : xe0Var;
        }
    }

    public Object OnDfzHZD(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = (HashMap) this.MdtA4re8;
        if (f50.k3x7lurq()) {
            try {
                f50.wxUZMvaN(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                um umVar = (um) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> qoPGr6Ce = umVar.qoPGr6Ce();
                if (!qoPGr6Ce.isEmpty()) {
                    for (Class cls2 : qoPGr6Ce) {
                        if (!hashMap.containsKey(cls2)) {
                            OnDfzHZD(cls2, hashSet);
                        }
                    }
                }
                obj = umVar.NCTxEWno((Context) this.VgvYg0wo);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th) {
                throw new d7(th);
            }
        }
        return obj;
    }

    public Drawable OxcuoDLp(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.MdtA4re8;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : ra.Ey6iv0m0((Context) this.VgvYg0wo, resourceId);
    }

    public void Qr9iLBAD(View view, int i, boolean z) {
        RecyclerView recyclerView = ((l10) this.MdtA4re8).qoPGr6Ce;
        int childCount = i < 0 ? recyclerView.getChildCount() : I5GHvsYW(i);
        ((a5) this.wxUZMvaN).VgvYg0wo(childCount, z);
        if (z) {
            lwWCatUu(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.euDDoUNr(view);
    }

    public en RXQxj5Oe() {
        Matcher matcher = (Matcher) this.MdtA4re8;
        return w30.KRabZ4CU(matcher.start(), matcher.end());
    }

    public void SgZGMMPL() {
        ((TypedArray) this.MdtA4re8).recycle();
    }

    public boolean U0LaHZX7(int i, j8 j8Var, t8 t8Var) {
        e2 e2Var = (e2) this.wxUZMvaN;
        int[] iArr = t8Var.N2kLh4D5;
        int[] iArr2 = t8Var.Ey6iv0m0;
        e2Var.qoPGr6Ce = iArr[0];
        e2Var.NCTxEWno = iArr[1];
        e2Var.MdtA4re8 = t8Var.lDXGDhIF();
        e2Var.wxUZMvaN = t8Var.jb9XjC4I();
        e2Var.jb9XjC4I = false;
        e2Var.eVhOlqcC = i;
        boolean z = e2Var.qoPGr6Ce == 3;
        boolean z2 = e2Var.NCTxEWno == 3;
        boolean z3 = z && t8Var.KRabZ4CU > 0.0f;
        boolean z4 = z2 && t8Var.KRabZ4CU > 0.0f;
        if (z3 && iArr2[0] == 4) {
            e2Var.qoPGr6Ce = 1;
        }
        if (z4 && iArr2[1] == 4) {
            e2Var.NCTxEWno = 1;
        }
        j8Var.NCTxEWno(t8Var, e2Var);
        t8Var.aZz0PFXp(e2Var.VgvYg0wo);
        t8Var.eIA6dogk(e2Var.P7K7Inc8);
        t8Var.euDDoUNr = e2Var.Qr9iLBAD;
        int i2 = e2Var.b2ZJblxo;
        t8Var.ESscZ9M1 = i2;
        t8Var.euDDoUNr = i2 > 0;
        e2Var.eVhOlqcC = 0;
        return e2Var.jb9XjC4I;
    }

    public Drawable amk52bBQ(int i) {
        int resourceId;
        Drawable VgvYg0wo;
        if (!((TypedArray) this.MdtA4re8).hasValue(i) || (resourceId = ((TypedArray) this.MdtA4re8).getResourceId(i, 0)) == 0) {
            return null;
        }
        j5BPOSYv qoPGr6Ce = j5BPOSYv.qoPGr6Ce();
        Context context = (Context) this.VgvYg0wo;
        synchronized (qoPGr6Ce) {
            VgvYg0wo = qoPGr6Ce.qoPGr6Ce.VgvYg0wo(context, resourceId, true);
        }
        return VgvYg0wo;
    }

    @Override // defpackage.an
    public Uri b2ZJblxo() {
        return (Uri) this.VgvYg0wo;
    }

    public void eIA6dogk(View view) {
        if (((ArrayList) this.VgvYg0wo).remove(view)) {
            l10 l10Var = (l10) this.MdtA4re8;
            g20 euDDoUNr = RecyclerView.euDDoUNr(view);
            if (euDDoUNr != null) {
                RecyclerView recyclerView = l10Var.qoPGr6Ce;
                int i = euDDoUNr.lDXGDhIF;
                if (recyclerView.eIA6dogk()) {
                    euDDoUNr.sjUBp5pO = i;
                    recyclerView.SMax8wMR.add(euDDoUNr);
                } else {
                    View view2 = euDDoUNr.qoPGr6Ce;
                    WeakHashMap weakHashMap = hg0.qoPGr6Ce;
                    view2.setImportantForAccessibility(i);
                }
                euDDoUNr.lDXGDhIF = 0;
            }
        }
    }

    public Object euDDoUNr(CharSequence charSequence, int i, int i2, int i3, boolean z, kf kfVar) {
        int i4;
        char c;
        mf mfVar = new mf((vs) ((VZZbw3BB) this.wxUZMvaN).MdtA4re8);
        int codePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean z2 = true;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z2) {
                vs vsVar = (vs) mfVar.MdtA4re8.qoPGr6Ce.get(codePointAt);
                if (mfVar.qoPGr6Ce == 2) {
                    if (vsVar != null) {
                        mfVar.MdtA4re8 = vsVar;
                        mfVar.P7K7Inc8++;
                    } else {
                        if (codePointAt == 65038) {
                            mfVar.qoPGr6Ce();
                        } else if (codePointAt != 65039) {
                            vs vsVar2 = mfVar.MdtA4re8;
                            if (vsVar2.NCTxEWno != null) {
                                if (mfVar.P7K7Inc8 != 1) {
                                    mfVar.wxUZMvaN = vsVar2;
                                    mfVar.qoPGr6Ce();
                                } else if (mfVar.NCTxEWno()) {
                                    mfVar.wxUZMvaN = mfVar.MdtA4re8;
                                    mfVar.qoPGr6Ce();
                                } else {
                                    mfVar.qoPGr6Ce();
                                }
                                c = 3;
                            } else {
                                mfVar.qoPGr6Ce();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (vsVar == null) {
                    mfVar.qoPGr6Ce();
                    c = 1;
                } else {
                    mfVar.qoPGr6Ce = 2;
                    mfVar.MdtA4re8 = vsVar;
                    mfVar.P7K7Inc8 = 1;
                    c = 2;
                }
                mfVar.VgvYg0wo = codePointAt;
                if (c == 1) {
                    i6 = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (i6 < i2) {
                        codePointAt = Character.codePointAt(charSequence, i6);
                    }
                } else if (c == 2) {
                    int charCount = Character.charCount(codePointAt) + i6;
                    if (charCount < i2) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i6 = charCount;
                } else if (c == 3) {
                    if (z || !DK9slbsy(charSequence, i4, i6, mfVar.wxUZMvaN.NCTxEWno)) {
                        z2 = kfVar.MdtA4re8(charSequence, i4, i6, mfVar.wxUZMvaN.NCTxEWno);
                        i5++;
                    }
                }
            }
        }
        if (mfVar.qoPGr6Ce == 2 && mfVar.MdtA4re8.NCTxEWno != null && ((mfVar.P7K7Inc8 > 1 || mfVar.NCTxEWno()) && i5 < i3 && z2 && (z || !DK9slbsy(charSequence, i4, i6, mfVar.MdtA4re8.NCTxEWno)))) {
            kfVar.MdtA4re8(charSequence, i4, i6, mfVar.MdtA4re8.NCTxEWno);
        }
        return kfVar.qoPGr6Ce();
    }

    public int gjV1z5T1() {
        return ((l10) this.MdtA4re8).qoPGr6Ce.getChildCount();
    }

    public f0 i7xS8jrb() {
        CharSequence charSequence = (CharSequence) this.wxUZMvaN;
        Matcher matcher = (Matcher) this.MdtA4re8;
        int end = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        if (end > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        if (matcher2.find(end)) {
            return new f0(matcher2, charSequence);
        }
        return null;
    }

    public void jb9XjC4I(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = ((l10) this.MdtA4re8).qoPGr6Ce;
        int childCount = i < 0 ? recyclerView.getChildCount() : I5GHvsYW(i);
        ((a5) this.wxUZMvaN).VgvYg0wo(childCount, z);
        if (z) {
            lwWCatUu(view);
        }
        g20 euDDoUNr = RecyclerView.euDDoUNr(view);
        if (euDDoUNr != null) {
            if (!euDDoUNr.jb9XjC4I() && !euDDoUNr.ygLcUYwZ()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + euDDoUNr + recyclerView.RXQxj5Oe());
            }
            euDDoUNr.jb9XjC4I &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public void k3x7lurq(int i) {
        g20 euDDoUNr;
        int I5GHvsYW = I5GHvsYW(i);
        ((a5) this.wxUZMvaN).P7K7Inc8(I5GHvsYW);
        RecyclerView recyclerView = ((l10) this.MdtA4re8).qoPGr6Ce;
        View childAt = recyclerView.getChildAt(I5GHvsYW);
        if (childAt != null && (euDDoUNr = RecyclerView.euDDoUNr(childAt)) != null) {
            if (euDDoUNr.jb9XjC4I() && !euDDoUNr.ygLcUYwZ()) {
                throw new IllegalArgumentException("called detach on an already detached child " + euDDoUNr + recyclerView.RXQxj5Oe());
            }
            euDDoUNr.qoPGr6Ce(256);
        }
        recyclerView.detachViewFromParent(I5GHvsYW);
    }

    public int lDXGDhIF() {
        return ((l10) this.MdtA4re8).qoPGr6Ce.getChildCount() - ((ArrayList) this.VgvYg0wo).size();
    }

    public void lwWCatUu(View view) {
        ((ArrayList) this.VgvYg0wo).add(view);
        l10 l10Var = (l10) this.MdtA4re8;
        g20 euDDoUNr = RecyclerView.euDDoUNr(view);
        if (euDDoUNr != null) {
            View view2 = euDDoUNr.qoPGr6Ce;
            RecyclerView recyclerView = l10Var.qoPGr6Ce;
            int i = euDDoUNr.sjUBp5pO;
            if (i != -1) {
                euDDoUNr.lDXGDhIF = i;
            } else {
                WeakHashMap weakHashMap = hg0.qoPGr6Ce;
                euDDoUNr.lDXGDhIF = view2.getImportantForAccessibility();
            }
            if (recyclerView.eIA6dogk()) {
                euDDoUNr.sjUBp5pO = 4;
                recyclerView.SMax8wMR.add(euDDoUNr);
            } else {
                WeakHashMap weakHashMap2 = hg0.qoPGr6Ce;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public void ow5vqvCr(Bundle bundle) {
        HashSet hashSet = (HashSet) this.wxUZMvaN;
        String string = ((Context) this.VgvYg0wo).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (um.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    OnDfzHZD((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new d7(e);
            }
        }
    }

    public void pRiPUEwG(u8 u8Var) {
        ArrayList arrayList = (ArrayList) this.MdtA4re8;
        arrayList.clear();
        int size = u8Var.SMax8wMR.size();
        for (int i = 0; i < size; i++) {
            t8 t8Var = (t8) u8Var.SMax8wMR.get(i);
            int[] iArr = t8Var.N2kLh4D5;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(t8Var);
            }
        }
        u8Var.CTE3lpUp.qoPGr6Ce = true;
    }

    @Override // defpackage.an
    public ClipDescription qoPGr6Ce() {
        return (ClipDescription) this.wxUZMvaN;
    }

    public ColorStateList sjUBp5pO(int i) {
        int resourceId;
        ColorStateList RXQxj5Oe;
        TypedArray typedArray = (TypedArray) this.MdtA4re8;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (RXQxj5Oe = w30.RXQxj5Oe((Context) this.VgvYg0wo, resourceId)) == null) ? typedArray.getColorStateList(i) : RXQxj5Oe;
    }

    public String toString() {
        switch (this.NCTxEWno) {
            case 3:
                return ((a5) this.wxUZMvaN).toString() + ", hidden list:" + ((ArrayList) this.VgvYg0wo).size();
            case 11:
                String str = (String) this.VgvYg0wo;
                String str2 = (String) this.wxUZMvaN;
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.MdtA4re8;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                if (str2 != null) {
                    sb.append(" action=");
                    sb.append(str2);
                }
                if (str != null) {
                    sb.append(" mimetype=");
                    sb.append(str);
                }
                sb.append(" }");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.an
    public Uri wxUZMvaN() {
        return (Uri) this.MdtA4re8;
    }

    public View ygLcUYwZ(int i) {
        return ((l10) this.MdtA4re8).qoPGr6Ce.getChildAt(I5GHvsYW(i));
    }

    public void ytu5o6f4(u8 u8Var, int i, int i2, int i3) {
        u8Var.getClass();
        int i4 = u8Var.VGmz0ccI;
        int i5 = u8Var.LfKQckgD;
        u8Var.VGmz0ccI = 0;
        u8Var.LfKQckgD = 0;
        u8Var.aZz0PFXp(i2);
        u8Var.eIA6dogk(i3);
        if (i4 < 0) {
            u8Var.VGmz0ccI = 0;
        } else {
            u8Var.VGmz0ccI = i4;
        }
        if (i5 < 0) {
            u8Var.LfKQckgD = 0;
        } else {
            u8Var.LfKQckgD = i5;
        }
        u8 u8Var2 = (u8) this.VgvYg0wo;
        u8Var2.B1cjorwa = i;
        u8Var2.nSmgoSB5();
    }

    public /* synthetic */ f0(Object obj, Object obj2, Object obj3, int i) {
        this.NCTxEWno = i;
        this.MdtA4re8 = obj;
        this.wxUZMvaN = obj2;
        this.VgvYg0wo = obj3;
    }

    public f0(l10 l10Var) {
        this.NCTxEWno = 3;
        this.MdtA4re8 = l10Var;
        this.wxUZMvaN = new a5();
        this.VgvYg0wo = new ArrayList();
    }

    public f0(Context context, TypedArray typedArray) {
        this.NCTxEWno = 12;
        this.VgvYg0wo = context;
        this.MdtA4re8 = typedArray;
    }

    public f0(Runnable runnable) {
        this.NCTxEWno = 9;
        this.VgvYg0wo = new CopyOnWriteArrayList();
        this.MdtA4re8 = new HashMap();
        this.wxUZMvaN = runnable;
    }

    public f0(Context context, LocationManager locationManager) {
        this.NCTxEWno = 13;
        this.wxUZMvaN = new ke0();
        this.VgvYg0wo = context;
        this.MdtA4re8 = locationManager;
    }

    public f0(Context context) {
        this.NCTxEWno = 0;
        this.VgvYg0wo = context.getApplicationContext();
        this.wxUZMvaN = new HashSet();
        this.MdtA4re8 = new HashMap();
    }

    @Override // defpackage.an
    public void P7K7Inc8() {
    }

    public f0(u8 u8Var) {
        this.NCTxEWno = 1;
        this.MdtA4re8 = new ArrayList();
        this.wxUZMvaN = new e2();
        this.VgvYg0wo = u8Var;
    }

    public /* synthetic */ f0() {
        this.NCTxEWno = 2;
    }

    public f0(Matcher matcher, CharSequence charSequence) {
        this.NCTxEWno = 8;
        this.MdtA4re8 = matcher;
        this.wxUZMvaN = charSequence;
        this.VgvYg0wo = new br(this);
    }
}
