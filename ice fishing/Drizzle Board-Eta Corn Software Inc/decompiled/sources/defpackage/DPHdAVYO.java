package defpackage;

import android.R;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class DPHdAVYO {
    public final Object NCTxEWno;
    public final int qoPGr6Ce;

    public DPHdAVYO(Context context) {
        int P7K7Inc8 = PVxc5pbY.P7K7Inc8(context, 0);
        this.NCTxEWno = new AhLfQVuM(new ContextThemeWrapper(context, PVxc5pbY.P7K7Inc8(context, P7K7Inc8)));
        this.qoPGr6Ce = P7K7Inc8;
    }

    public static void NCTxEWno(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            char charAt = str.charAt(!z ? i : length);
            boolean z2 = charAt < ' ' || charAt == ' ';
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            Log.w("SupportSQLite", "delete failed: ", e);
        }
    }

    public void MdtA4re8(fk fkVar, int i, int i2) {
        ((zb) this.NCTxEWno).k3x7lurq(new ta0(fkVar), i, i2);
    }

    public PVxc5pbY qoPGr6Ce() {
        AhLfQVuM ahLfQVuM = (AhLfQVuM) this.NCTxEWno;
        ContextThemeWrapper contextThemeWrapper = ahLfQVuM.qoPGr6Ce;
        PVxc5pbY pVxc5pbY = new PVxc5pbY(contextThemeWrapper, this.qoPGr6Ce);
        View view = ahLfQVuM.VgvYg0wo;
        dHPzAh2D dhpzah2d = pVxc5pbY.b2ZJblxo;
        if (view != null) {
            dhpzah2d.ygLcUYwZ = view;
        } else {
            CharSequence charSequence = ahLfQVuM.wxUZMvaN;
            if (charSequence != null) {
                dhpzah2d.wxUZMvaN = charSequence;
                TextView textView = dhpzah2d.ow5vqvCr;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = ahLfQVuM.MdtA4re8;
            if (drawable != null) {
                dhpzah2d.eVhOlqcC = drawable;
                ImageView imageView = dhpzah2d.k3x7lurq;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    dhpzah2d.k3x7lurq.setImageDrawable(drawable);
                }
            }
        }
        if (ahLfQVuM.b2ZJblxo != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) ahLfQVuM.NCTxEWno.inflate(dhpzah2d.amk52bBQ, (ViewGroup) null);
            int i = ahLfQVuM.jb9XjC4I ? dhpzah2d.KlHjfFWx : dhpzah2d.Ey6iv0m0;
            ListAdapter listAdapter = ahLfQVuM.b2ZJblxo;
            if (listAdapter == null) {
                listAdapter = new rwijVcAB(contextThemeWrapper, i, R.id.text1, null);
            }
            dhpzah2d.lDXGDhIF = listAdapter;
            dhpzah2d.sjUBp5pO = ahLfQVuM.eVhOlqcC;
            if (ahLfQVuM.Qr9iLBAD != null) {
                alertController$RecycleListView.setOnItemClickListener(new YH0kflLW(ahLfQVuM, dhpzah2d));
            }
            if (ahLfQVuM.jb9XjC4I) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            dhpzah2d.VgvYg0wo = alertController$RecycleListView;
        }
        pVxc5pbY.setCancelable(true);
        pVxc5pbY.setCanceledOnTouchOutside(true);
        pVxc5pbY.setOnCancelListener(null);
        pVxc5pbY.setOnDismissListener(null);
        zr zrVar = ahLfQVuM.P7K7Inc8;
        if (zrVar != null) {
            pVxc5pbY.setOnKeyListener(zrVar);
        }
        return pVxc5pbY;
    }

    public DPHdAVYO(zb zbVar, int i) {
        this.NCTxEWno = zbVar;
        this.qoPGr6Ce = i;
    }

    public DPHdAVYO() {
        this.qoPGr6Ce = 1;
        this.NCTxEWno = Collections.singletonList(null);
    }

    public DPHdAVYO(ArrayList arrayList) {
        this.qoPGr6Ce = 0;
        this.NCTxEWno = arrayList;
    }
}
