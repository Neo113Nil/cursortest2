package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.kolosta.rejin.jilosa.R;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class dHPzAh2D {
    public final int Ey6iv0m0;
    public final boolean I5GHvsYW;
    public final int KlHjfFWx;
    public final Window MdtA4re8;
    public final PVxc5pbY NCTxEWno;
    public TextView OnDfzHZD;
    public final int OxcuoDLp;
    public Button P7K7Inc8;
    public Button Qr9iLBAD;
    public final DmBEA2wf RXQxj5Oe;
    public AlertController$RecycleListView VgvYg0wo;
    public final int amk52bBQ;
    public Button b2ZJblxo;
    public Drawable eVhOlqcC;
    public NestedScrollView jb9XjC4I;
    public ImageView k3x7lurq;
    public ListAdapter lDXGDhIF;
    public TextView ow5vqvCr;
    public final Context qoPGr6Ce;
    public CharSequence wxUZMvaN;
    public View ygLcUYwZ;
    public int sjUBp5pO = -1;
    public final pP9Y2m6O FySoLYna = new pP9Y2m6O(1, this);

    public dHPzAh2D(Context context, PVxc5pbY pVxc5pbY, Window window) {
        this.qoPGr6Ce = context;
        this.NCTxEWno = pVxc5pbY;
        this.MdtA4re8 = window;
        DmBEA2wf dmBEA2wf = new DmBEA2wf();
        dmBEA2wf.qoPGr6Ce = new WeakReference(pVxc5pbY);
        this.RXQxj5Oe = dmBEA2wf;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, z00.VgvYg0wo, R.attr.alertDialogStyle, 0);
        this.OxcuoDLp = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.amk52bBQ = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.KlHjfFWx = obtainStyledAttributes.getResourceId(7, 0);
        this.Ey6iv0m0 = obtainStyledAttributes.getResourceId(3, 0);
        this.I5GHvsYW = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        pVxc5pbY.wxUZMvaN().P7K7Inc8(1);
    }

    public static ViewGroup qoPGr6Ce(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
