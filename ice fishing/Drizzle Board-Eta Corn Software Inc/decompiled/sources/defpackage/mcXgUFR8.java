package defpackage;

import android.R;
import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.ActionMode;
import android.view.Choreographer;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class mcXgUFR8 implements g40, kf, xg {
    public static final int[] VgvYg0wo = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public Object MdtA4re8;
    public final /* synthetic */ int NCTxEWno;
    public Object wxUZMvaN;

    public mcXgUFR8(EditText editText, int i) {
        this.NCTxEWno = i;
        switch (i) {
            case 15:
                this.MdtA4re8 = editText;
                qf qfVar = new qf(editText);
                this.wxUZMvaN = qfVar;
                editText.addTextChangedListener(qfVar);
                if (df.NCTxEWno == null) {
                    synchronized (df.qoPGr6Ce) {
                        try {
                            if (df.NCTxEWno == null) {
                                df dfVar = new df();
                                try {
                                    df.MdtA4re8 = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, df.class.getClassLoader());
                                } catch (Throwable unused) {
                                }
                                df.NCTxEWno = dfVar;
                            }
                        } finally {
                        }
                    }
                }
                editText.setEditableFactory(df.NCTxEWno);
                return;
            default:
                this.MdtA4re8 = editText;
                this.wxUZMvaN = new tg0(editText);
                return;
        }
    }

    public static int WYNAV5pd(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }

    public void DK9slbsy() {
        ((SparseIntArray) this.MdtA4re8).clear();
    }

    public void Ey6iv0m0(boolean z) {
        li liVar = ((ej) this.wxUZMvaN).FySoLYna;
        if (liVar != null) {
            liVar.ow5vqvCr().OnDfzHZD.Ey6iv0m0(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.MdtA4re8).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                m1.qoPGr6Ce();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public KeyListener FySoLYna(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        if (keyListener instanceof jf) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new jf(keyListener);
    }

    public void I5GHvsYW(boolean z) {
        li liVar = ((ej) this.wxUZMvaN).FySoLYna;
        if (liVar != null) {
            liVar.ow5vqvCr().OnDfzHZD.I5GHvsYW(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.MdtA4re8).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                m1.qoPGr6Ce();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void KlHjfFWx(boolean z) {
        li liVar = ((ej) this.wxUZMvaN).FySoLYna;
        if (liVar != null) {
            liVar.ow5vqvCr().OnDfzHZD.KlHjfFWx(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.MdtA4re8).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                m1.qoPGr6Ce();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    @Override // defpackage.kf
    public boolean MdtA4re8(CharSequence charSequence, int i, int i2, te0 te0Var) {
        if ((te0Var.MdtA4re8 & 4) > 0) {
            return true;
        }
        if (((af0) this.MdtA4re8) == null) {
            this.MdtA4re8 = new af0(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((re) this.wxUZMvaN).getClass();
        ((af0) this.MdtA4re8).setSpan(new ue0(te0Var), i, i2, 33);
        return true;
    }

    public void Mq3SeTnW(yzvmSy3z yzvmsy3z) {
        VZZbw3BB vZZbw3BB = (VZZbw3BB) this.MdtA4re8;
        ((ActionMode.Callback) vZZbw3BB.qoPGr6Ce).onDestroyActionMode(vZZbw3BB.wxUZMvaN(yzvmsy3z));
        SJ7tYVsF sJ7tYVsF = (SJ7tYVsF) this.wxUZMvaN;
        if (sJ7tYVsF.FySoLYna != null) {
            sJ7tYVsF.OnDfzHZD.getDecorView().removeCallbacks(sJ7tYVsF.gjV1z5T1);
        }
        if (sJ7tYVsF.RXQxj5Oe != null) {
            xg0 xg0Var = sJ7tYVsF.WYNAV5pd;
            if (xg0Var != null) {
                xg0Var.NCTxEWno();
            }
            xg0 qoPGr6Ce = hg0.qoPGr6Ce(sJ7tYVsF.RXQxj5Oe);
            qoPGr6Ce.qoPGr6Ce(0.0f);
            sJ7tYVsF.WYNAV5pd = qoPGr6Ce;
            qoPGr6Ce.wxUZMvaN(new n5CPt0tX(2, this));
        }
        sJ7tYVsF.I5GHvsYW = null;
        ViewGroup viewGroup = sJ7tYVsF.U0LaHZX7;
        WeakHashMap weakHashMap = hg0.qoPGr6Ce;
        viewGroup.requestApplyInsets();
        sJ7tYVsF.eIA6dogk();
    }

    @Override // defpackage.xg
    public Object NCTxEWno(yg ygVar, g9 g9Var) {
        int i = this.NCTxEWno;
        int i2 = 2;
        g9 g9Var2 = null;
        xe0 xe0Var = xe0.qoPGr6Ce;
        u9 u9Var = u9.NCTxEWno;
        switch (i) {
            case 18:
                Object NCTxEWno = ((r4) this.MdtA4re8).NCTxEWno(new dh(new j20(), ygVar, (t90) this.wxUZMvaN), g9Var);
                return NCTxEWno == u9Var ? NCTxEWno : xe0Var;
            case 19:
                Object P7K7Inc8 = fn.P7K7Inc8(g9Var, ygVar, new eh(g9Var2, (vx) this.wxUZMvaN, 1), (xg[]) this.MdtA4re8);
                return P7K7Inc8 == u9Var ? P7K7Inc8 : xe0Var;
            case 20:
                Object P7K7Inc82 = fn.P7K7Inc8(g9Var, ygVar, new eh(g9Var2, (gl) this.wxUZMvaN, i2), (xg[]) this.MdtA4re8);
                return P7K7Inc82 == u9Var ? P7K7Inc82 : xe0Var;
            case 21:
                Object P7K7Inc83 = fn.P7K7Inc8(g9Var, ygVar, new eh(g9Var2, (hl) this.wxUZMvaN, 3), (xg[]) this.MdtA4re8);
                return P7K7Inc83 == u9Var ? P7K7Inc83 : xe0Var;
            case 22:
            case 23:
            case 24:
            case 25:
            default:
                Object NCTxEWno2 = ((f0) this.MdtA4re8).NCTxEWno(new nd(ygVar, i2, (zy) this.wxUZMvaN), g9Var);
                return NCTxEWno2 == u9Var ? NCTxEWno2 : xe0Var;
            case 26:
                Object NCTxEWno3 = ((mcXgUFR8) this.MdtA4re8).NCTxEWno(new at(ygVar, (wx) this.wxUZMvaN), g9Var);
                return NCTxEWno3 == u9Var ? NCTxEWno3 : xe0Var;
        }
    }

    public void OnDfzHZD(boolean z) {
        li liVar = ((ej) this.wxUZMvaN).FySoLYna;
        if (liVar != null) {
            liVar.ow5vqvCr().OnDfzHZD.OnDfzHZD(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.MdtA4re8).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                m1.qoPGr6Ce();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void OxcuoDLp(boolean z) {
        li liVar = ((ej) this.wxUZMvaN).FySoLYna;
        if (liVar != null) {
            liVar.ow5vqvCr().OnDfzHZD.OxcuoDLp(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.MdtA4re8).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                m1.qoPGr6Ce();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public boolean P7K7Inc8() {
        synchronized (this) {
            if (((AtomicBoolean) this.wxUZMvaN).get()) {
                return false;
            }
            ((AtomicInteger) this.MdtA4re8).incrementAndGet();
            return true;
        }
    }

    public void Qr9iLBAD(boolean z) {
        li liVar = ((ej) this.wxUZMvaN).FySoLYna;
        if (liVar != null) {
            liVar.ow5vqvCr().OnDfzHZD.Qr9iLBAD(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.MdtA4re8).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                m1.qoPGr6Ce();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void RXQxj5Oe(boolean z) {
        li liVar = ((ej) this.wxUZMvaN).FySoLYna;
        if (liVar != null) {
            liVar.ow5vqvCr().OnDfzHZD.RXQxj5Oe(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.MdtA4re8).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                m1.qoPGr6Ce();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void SgZGMMPL(yh yhVar) {
        d1 d1Var = (d1) this.wxUZMvaN;
        ya0 ya0Var = (ya0) this.MdtA4re8;
        int i = yhVar.NCTxEWno;
        boolean z = false;
        Object[] objArr = 0;
        if (i == 0) {
            d1Var.execute(new XrPeKzBk(ya0Var, yhVar.qoPGr6Ce, 5, z));
        } else {
            d1Var.execute(new g3(i, (int) (objArr == true ? 1 : 0), (Object) ya0Var));
        }
    }

    public void U0LaHZX7() {
        String str = (String) this.MdtA4re8;
        if (((FileChannel) this.wxUZMvaN) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.wxUZMvaN = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.wxUZMvaN;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.wxUZMvaN = null;
            throw new IllegalStateException(q70.P7K7Inc8("Unable to lock file: '", str, "'."), th);
        }
    }

    public void VhgXwMj9(boolean z) {
        qf qfVar = (qf) ((mcXgUFR8) ((tg0) this.wxUZMvaN).MdtA4re8).wxUZMvaN;
        if (qfVar.wxUZMvaN != z) {
            if (qfVar.MdtA4re8 != null) {
                ze qoPGr6Ce = ze.qoPGr6Ce();
                pf pfVar = qfVar.MdtA4re8;
                qoPGr6Ce.getClass();
                fn.MdtA4re8(pfVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = qoPGr6Ce.qoPGr6Ce;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    qoPGr6Ce.NCTxEWno.remove(pfVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            qfVar.wxUZMvaN = z;
            if (z) {
                qf.qoPGr6Ce(qfVar.NCTxEWno, ze.qoPGr6Ce().NCTxEWno());
            }
        }
    }

    public Drawable Xkz7p5xa(Drawable drawable, boolean z) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.wxUZMvaN) == null) {
                this.wxUZMvaN = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i = 0; i < numberOfLayers; i++) {
            int id = layerDrawable.getId(i);
            drawableArr[i] = Xkz7p5xa(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i2 = 0; i2 < numberOfLayers; i2++) {
            layerDrawable2.setId(i2, layerDrawable.getId(i2));
            layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
            layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
            layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
            layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
            layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
            layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
            layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
            layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
            layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
        }
        return layerDrawable2;
    }

    public void aZz0PFXp(int i, int i2, int i3, int i4) {
        r3 r3Var = (r3) this.wxUZMvaN;
        r3Var.VgvYg0wo.set(i, i2, i3, i4);
        Rect rect = r3Var.wxUZMvaN;
        super/*android.view.View*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    @Override // defpackage.g40
    public boolean amk52bBQ() {
        return ((g40) this.MdtA4re8).amk52bBQ();
    }

    public Bundle b2ZJblxo(String str) {
        Bundle bundle;
        r50 r50Var = (r50) this.MdtA4re8;
        if (!r50Var.b2ZJblxo) {
            m1.Ey6iv0m0("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle2 = r50Var.P7K7Inc8;
        if (bundle2 == null) {
            return null;
        }
        if (bundle2.containsKey(str)) {
            bundle = bundle2.getBundle(str);
            if (bundle == null) {
                n50.P7K7Inc8(str);
                throw null;
            }
        } else {
            bundle = null;
        }
        bundle2.remove(str);
        if (bundle2.isEmpty()) {
            r50Var.P7K7Inc8 = null;
        }
        return bundle;
    }

    public void eIA6dogk(String str, p50 p50Var) {
        r50 r50Var = (r50) this.MdtA4re8;
        synchronized (r50Var.MdtA4re8) {
            if (r50Var.wxUZMvaN.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            r50Var.wxUZMvaN.put(str, p50Var);
        }
    }

    public void eVhOlqcC(boolean z) {
        li liVar = ((ej) this.wxUZMvaN).FySoLYna;
        if (liVar != null) {
            liVar.ow5vqvCr().OnDfzHZD.eVhOlqcC(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.MdtA4re8).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                m1.qoPGr6Ce();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public boolean euDDoUNr(yzvmSy3z yzvmsy3z, Menu menu) {
        ViewGroup viewGroup = ((SJ7tYVsF) this.wxUZMvaN).U0LaHZX7;
        WeakHashMap weakHashMap = hg0.qoPGr6Ce;
        viewGroup.requestApplyInsets();
        VZZbw3BB vZZbw3BB = (VZZbw3BB) this.MdtA4re8;
        ActionMode.Callback callback = (ActionMode.Callback) vZZbw3BB.qoPGr6Ce;
        oa0 wxUZMvaN = vZZbw3BB.wxUZMvaN(yzvmsy3z);
        p70 p70Var = (p70) vZZbw3BB.wxUZMvaN;
        Menu menu2 = (Menu) p70Var.get(menu);
        if (menu2 == null) {
            menu2 = new ss((Context) vZZbw3BB.NCTxEWno, (yr) menu);
            p70Var.put(menu, menu2);
        }
        return callback.onPrepareActionMode(wxUZMvaN, menu2);
    }

    public void fVMzMhyS() {
        synchronized (this) {
            ((AtomicInteger) this.MdtA4re8).decrementAndGet();
            if (((AtomicInteger) this.MdtA4re8).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public p50 gjV1z5T1() {
        p50 p50Var;
        r50 r50Var = (r50) this.MdtA4re8;
        synchronized (r50Var.MdtA4re8) {
            Iterator it = r50Var.wxUZMvaN.entrySet().iterator();
            do {
                p50Var = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                p50 p50Var2 = (p50) entry.getValue();
                if (fn.qoPGr6Ce(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    p50Var = p50Var2;
                }
            } while (p50Var == null);
        }
        return p50Var;
    }

    public void hzgxAD8d() {
        Integer num;
        h7 h7Var = (h7) this.wxUZMvaN;
        String str = (String) this.MdtA4re8;
        Bundle bundle = h7Var.b2ZJblxo;
        HashMap hashMap = h7Var.P7K7Inc8;
        if (!h7Var.wxUZMvaN.contains(str) && (num = (Integer) h7Var.NCTxEWno.remove(str)) != null) {
            h7Var.qoPGr6Ce.remove(num);
        }
        h7Var.VgvYg0wo.remove(str);
        if (hashMap.containsKey(str)) {
            StringBuilder b2ZJblxo = q70.b2ZJblxo("Dropping pending result for request ", str, ": ");
            b2ZJblxo.append(hashMap.get(str));
            Log.w("ActivityResultRegistry", b2ZJblxo.toString());
            hashMap.remove(str);
        }
        if (bundle.containsKey(str)) {
            StringBuilder b2ZJblxo2 = q70.b2ZJblxo("Dropping pending result for request ", str, ": ");
            b2ZJblxo2.append(bundle.getParcelable(str));
            Log.w("ActivityResultRegistry", b2ZJblxo2.toString());
            bundle.remove(str);
        }
        if (h7Var.MdtA4re8.get(str) == null) {
            return;
        }
        m1.qoPGr6Ce();
    }

    public ff i7xS8jrb(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        tg0 tg0Var = (tg0) this.wxUZMvaN;
        if (inputConnection == null) {
            inputConnection2 = null;
        } else {
            mcXgUFR8 mcxgufr8 = (mcXgUFR8) tg0Var.MdtA4re8;
            if (!(inputConnection instanceof ff)) {
                inputConnection = new ff(editorInfo, inputConnection, (EditText) mcxgufr8.MdtA4re8);
            }
            inputConnection2 = inputConnection;
        }
        return (ff) inputConnection2;
    }

    public void jb9XjC4I(boolean z) {
        ej ejVar = (ej) this.wxUZMvaN;
        f4UNdked f4undked = ejVar.I5GHvsYW.OxcuoDLp;
        li liVar = ejVar.FySoLYna;
        if (liVar != null) {
            liVar.ow5vqvCr().OnDfzHZD.jb9XjC4I(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.MdtA4re8).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                m1.qoPGr6Ce();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void k3x7lurq(boolean z) {
        li liVar = ((ej) this.wxUZMvaN).FySoLYna;
        if (liVar != null) {
            liVar.ow5vqvCr().OnDfzHZD.k3x7lurq(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.MdtA4re8).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                m1.qoPGr6Ce();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void lDXGDhIF(boolean z) {
        li liVar = ((ej) this.wxUZMvaN).FySoLYna;
        if (liVar != null) {
            liVar.ow5vqvCr().OnDfzHZD.lDXGDhIF(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.MdtA4re8).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                m1.qoPGr6Ce();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void lwWCatUu(AttributeSet attributeSet, int i) {
        switch (this.NCTxEWno) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.MdtA4re8;
                f0 Mq3SeTnW = f0.Mq3SeTnW(absSeekBar.getContext(), attributeSet, VgvYg0wo, i);
                Drawable amk52bBQ = Mq3SeTnW.amk52bBQ(0);
                if (amk52bBQ != null) {
                    if (amk52bBQ instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) amk52bBQ;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i2 = 0; i2 < numberOfFrames; i2++) {
                            Drawable Xkz7p5xa = Xkz7p5xa(animationDrawable.getFrame(i2), true);
                            Xkz7p5xa.setLevel(10000);
                            animationDrawable2.addFrame(Xkz7p5xa, animationDrawable.getDuration(i2));
                        }
                        animationDrawable2.setLevel(10000);
                        amk52bBQ = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(amk52bBQ);
                }
                Drawable amk52bBQ2 = Mq3SeTnW.amk52bBQ(1);
                if (amk52bBQ2 != null) {
                    absSeekBar.setProgressDrawable(Xkz7p5xa(amk52bBQ2, false));
                }
                Mq3SeTnW.SgZGMMPL();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.MdtA4re8).getContext().obtainStyledAttributes(attributeSet, z00.jb9XjC4I, i, 0);
                try {
                    boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
                    obtainStyledAttributes.recycle();
                    VhgXwMj9(z);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public void ow5vqvCr(boolean z) {
        li liVar = ((ej) this.wxUZMvaN).FySoLYna;
        if (liVar != null) {
            liVar.ow5vqvCr().OnDfzHZD.ow5vqvCr(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.MdtA4re8).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                m1.qoPGr6Ce();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void pRiPUEwG() {
        if (!((r50) this.MdtA4re8).Qr9iLBAD) {
            m1.Ey6iv0m0("Can not perform this action after onSaveInstanceState");
            return;
        }
        q65VbST0 q65vbst0 = (q65VbST0) this.wxUZMvaN;
        if (q65vbst0 == null) {
            q65vbst0 = new q65VbST0(this);
        }
        this.wxUZMvaN = q65vbst0;
        try {
            ko.class.getDeclaredConstructor(null);
            q65VbST0 q65vbst02 = (q65VbST0) this.wxUZMvaN;
            if (q65vbst02 != null) {
                ((LinkedHashSet) q65vbst02.NCTxEWno).add(ko.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + ko.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    @Override // defpackage.kf
    public Object qoPGr6Ce() {
        return (af0) this.MdtA4re8;
    }

    public void sjUBp5pO(boolean z) {
        li liVar = ((ej) this.wxUZMvaN).FySoLYna;
        if (liVar != null) {
            liVar.ow5vqvCr().OnDfzHZD.sjUBp5pO(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.MdtA4re8).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                m1.qoPGr6Ce();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public String toString() {
        switch (this.NCTxEWno) {
            case 28:
                String str = "[ ";
                if (((r70) this.MdtA4re8) != null) {
                    for (int i = 0; i < 9; i++) {
                        str = str + ((r70) this.MdtA4re8).jb9XjC4I[i] + " ";
                    }
                }
                return str + "] " + ((r70) this.MdtA4re8);
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00bc A[Catch: all -> 0x00bd, TRY_ENTER, TryCatch #6 {all -> 0x00bd, blocks: (B:61:0x00bc, B:62:0x00bf, B:63:0x00d7), top: B:59:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bf A[Catch: all -> 0x00bd, TryCatch #6 {all -> 0x00bd, blocks: (B:61:0x00bc, B:62:0x00bf, B:63:0x00d7), top: B:59:0x00ba }] */
    @Override // defpackage.g40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f40 wxUZMvaN(String str) {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        str.getClass();
        zb zbVar = (zb) this.wxUZMvaN;
        if (!str.equals(":memory:")) {
            str = ((oa) zbVar.MdtA4re8).qoPGr6Ce.getDatabasePath(str).getAbsolutePath();
            str.getClass();
        }
        boolean z = true;
        ig igVar = new ig(str, (zbVar.qoPGr6Ce || zbVar.NCTxEWno || str.equals(":memory:")) ? false : true);
        ReentrantLock reentrantLock = igVar.qoPGr6Ce;
        reentrantLock.lock();
        mcXgUFR8 mcxgufr8 = igVar.NCTxEWno;
        if (mcxgufr8 != null) {
            try {
                mcxgufr8.U0LaHZX7();
            } catch (Throwable th) {
                th = th;
                z = false;
                try {
                    if (!z) {
                        throw th;
                    }
                    throw new IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", th);
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
        try {
            try {
                if (zbVar.NCTxEWno) {
                    throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                }
                f40 wxUZMvaN = ((g40) this.MdtA4re8).wxUZMvaN(str);
                if (zbVar.qoPGr6Ce) {
                    zb.VgvYg0wo(wxUZMvaN);
                    if (((oa) zbVar.MdtA4re8).P7K7Inc8 == t30.MdtA4re8) {
                        w30.KlHjfFWx(wxUZMvaN, "PRAGMA synchronous = NORMAL");
                    } else {
                        w30.KlHjfFWx(wxUZMvaN, "PRAGMA synchronous = FULL");
                    }
                    ((we) zbVar.wxUZMvaN).KlHjfFWx(wxUZMvaN);
                } else {
                    try {
                        zbVar.NCTxEWno = true;
                        zbVar.P7K7Inc8(wxUZMvaN);
                        zbVar.NCTxEWno = false;
                    } catch (Throwable th2) {
                        zbVar.NCTxEWno = false;
                        throw th2;
                    }
                }
                if (mcxgufr8 != null && (fileChannel2 = (FileChannel) mcxgufr8.wxUZMvaN) != null) {
                    try {
                        fileChannel2.close();
                        mcxgufr8.wxUZMvaN = null;
                    } finally {
                    }
                }
                return wxUZMvaN;
            } catch (Throwable th3) {
                if (mcxgufr8 != null && (fileChannel = (FileChannel) mcxgufr8.wxUZMvaN) != null) {
                    try {
                        fileChannel.close();
                        mcxgufr8.wxUZMvaN = null;
                    } finally {
                    }
                }
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
            if (!z) {
            }
        }
    }

    public void ygLcUYwZ(boolean z) {
        ej ejVar = (ej) this.wxUZMvaN;
        f4UNdked f4undked = ejVar.I5GHvsYW.OxcuoDLp;
        li liVar = ejVar.FySoLYna;
        if (liVar != null) {
            liVar.ow5vqvCr().OnDfzHZD.ygLcUYwZ(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.MdtA4re8).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                m1.qoPGr6Ce();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0209, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0109 A[Catch: IOException -> 0x0091, XmlPullParserException -> 0x0094, TryCatch #2 {IOException -> 0x0091, XmlPullParserException -> 0x0094, blocks: (B:19:0x0062, B:28:0x0209, B:29:0x0074, B:30:0x0082, B:33:0x0087, B:41:0x0097, B:44:0x00b1, B:47:0x00a0, B:51:0x00a9, B:54:0x00bf, B:57:0x00ce, B:59:0x00d6, B:62:0x00e0, B:66:0x0109, B:69:0x0110, B:70:0x0128, B:72:0x00e9, B:74:0x00f1, B:77:0x00ff, B:80:0x0129, B:82:0x0131, B:85:0x013f, B:88:0x0149, B:91:0x0154, B:92:0x016c, B:94:0x016d, B:97:0x0177, B:100:0x0182, B:101:0x019a, B:103:0x019b, B:105:0x01a3, B:108:0x01ac, B:111:0x01b6, B:114:0x01c0, B:115:0x01d8, B:117:0x01d9, B:120:0x01e3, B:123:0x01ed, B:124:0x0205, B:127:0x0206), top: B:18:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0110 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void ytu5o6f4(Context context, XmlResourceParser xmlResourceParser) {
        int eventType;
        n8 n8Var;
        s8 s8Var = new s8();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    eventType = xmlResourceParser.getEventType();
                    n8Var = null;
                } catch (IOException e) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e);
                } catch (XmlPullParserException e2) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e2);
                }
                while (eventType != 1) {
                    if (eventType == 0) {
                        xmlResourceParser.getName();
                    } else if (eventType == 2) {
                        String name = xmlResourceParser.getName();
                        switch (name.hashCode()) {
                            case -2025855158:
                                if (name.equals("Layout")) {
                                    if (n8Var == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    n8Var.wxUZMvaN.qoPGr6Ce(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -1984451626:
                                if (name.equals("Motion")) {
                                    if (n8Var == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    n8Var.MdtA4re8.qoPGr6Ce(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -1962203927:
                                if (name.equals("ConstraintOverride")) {
                                    n8Var = s8.MdtA4re8(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                } else {
                                    break;
                                }
                            case -1269513683:
                                if (name.equals("PropertySet")) {
                                    if (n8Var == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    n8Var.NCTxEWno.qoPGr6Ce(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -1238332596:
                                if (name.equals("Transform")) {
                                    if (n8Var == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    n8Var.VgvYg0wo.qoPGr6Ce(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -71750448:
                                if (name.equals("Guideline")) {
                                    n8Var = s8.MdtA4re8(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    n8Var.wxUZMvaN.qoPGr6Ce = true;
                                    break;
                                } else {
                                    break;
                                }
                            case 366511058:
                                if (!name.equals("CustomMethod")) {
                                    continue;
                                }
                                if (n8Var != null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                f8.qoPGr6Ce(context, xmlResourceParser, n8Var.P7K7Inc8);
                                break;
                            case 1331510167:
                                if (name.equals("Barrier")) {
                                    n8Var = s8.MdtA4re8(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    n8Var.wxUZMvaN.Wi7iiXC4 = 1;
                                    break;
                                } else {
                                    break;
                                }
                            case 1791837707:
                                if (!name.equals("CustomAttribute")) {
                                    continue;
                                } else if (n8Var != null) {
                                }
                                break;
                            case 1803088381:
                                if (name.equals("Constraint")) {
                                    n8Var = s8.MdtA4re8(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (eventType == 3) {
                        String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                        switch (lowerCase.hashCode()) {
                            case -2075718416:
                                if (!lowerCase.equals("guideline")) {
                                    break;
                                }
                                s8Var.NCTxEWno.put(Integer.valueOf(n8Var.qoPGr6Ce), n8Var);
                                n8Var = null;
                                break;
                            case -190376483:
                                if (lowerCase.equals("constraint")) {
                                    s8Var.NCTxEWno.put(Integer.valueOf(n8Var.qoPGr6Ce), n8Var);
                                    n8Var = null;
                                    break;
                                } else {
                                    break;
                                }
                            case 426575017:
                                if (lowerCase.equals("constraintoverride")) {
                                    s8Var.NCTxEWno.put(Integer.valueOf(n8Var.qoPGr6Ce), n8Var);
                                    n8Var = null;
                                    break;
                                } else {
                                    break;
                                }
                            case 2146106725:
                                if (lowerCase.equals("constraintset")) {
                                    ((SparseArray) this.wxUZMvaN).put(identifier, s8Var);
                                    return;
                                }
                                break;
                        }
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.wxUZMvaN).put(identifier, s8Var);
                return;
            }
        }
    }

    public /* synthetic */ mcXgUFR8(int i, boolean z) {
        this.NCTxEWno = i;
    }

    public /* synthetic */ mcXgUFR8(Object obj, int i, Object obj2) {
        this.NCTxEWno = i;
        this.wxUZMvaN = obj;
        this.MdtA4re8 = obj2;
    }

    public /* synthetic */ mcXgUFR8(Object obj, int i, boolean z) {
        this.NCTxEWno = i;
        this.wxUZMvaN = obj;
    }

    public /* synthetic */ mcXgUFR8(Object obj, Object obj2, int i, boolean z) {
        this.NCTxEWno = i;
        this.MdtA4re8 = obj;
        this.wxUZMvaN = obj2;
    }

    public mcXgUFR8(String str) {
        this.NCTxEWno = 17;
        this.MdtA4re8 = str.concat(".lck");
    }

    public mcXgUFR8(zw zwVar) {
        this.NCTxEWno = 11;
        this.MdtA4re8 = new AtomicInteger(0);
        this.wxUZMvaN = new AtomicBoolean(false);
    }

    public /* synthetic */ mcXgUFR8(int i, Object obj) {
        this.NCTxEWno = i;
        this.MdtA4re8 = obj;
    }

    public mcXgUFR8(ej ejVar) {
        this.NCTxEWno = 23;
        this.MdtA4re8 = new CopyOnWriteArrayList();
        this.wxUZMvaN = ejVar;
    }

    public mcXgUFR8(zb zbVar, g40 g40Var) {
        this.NCTxEWno = 8;
        g40Var.getClass();
        this.wxUZMvaN = zbVar;
        this.MdtA4re8 = g40Var;
    }

    public mcXgUFR8(Animation animation) {
        this.NCTxEWno = 22;
        this.MdtA4re8 = animation;
        this.wxUZMvaN = null;
    }

    public mcXgUFR8(Animator animator) {
        this.NCTxEWno = 22;
        this.MdtA4re8 = null;
        this.wxUZMvaN = animator;
    }

    public mcXgUFR8(ArrayList arrayList, ArrayList arrayList2) {
        this.NCTxEWno = 24;
        int size = arrayList.size();
        this.MdtA4re8 = new int[size];
        this.wxUZMvaN = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.MdtA4re8)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.wxUZMvaN)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public mcXgUFR8(int i, int i2) {
        this.NCTxEWno = 24;
        this.MdtA4re8 = new int[]{i, i2};
        this.wxUZMvaN = new float[]{0.0f, 1.0f};
    }

    public mcXgUFR8(int i) {
        this.NCTxEWno = i;
        switch (i) {
            case 25:
                this.MdtA4re8 = new SparseIntArray();
                this.wxUZMvaN = new SparseIntArray();
                break;
            default:
                this.MdtA4re8 = Choreographer.getInstance();
                this.wxUZMvaN = Looper.myLooper();
                break;
        }
    }

    public mcXgUFR8(int i, int i2, int i3) {
        this.NCTxEWno = 24;
        this.MdtA4re8 = new int[]{i, i2, i3};
        this.wxUZMvaN = new float[]{0.0f, 0.5f, 1.0f};
    }
}
