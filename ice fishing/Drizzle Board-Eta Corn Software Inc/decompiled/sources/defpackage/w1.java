package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.kolosta.rejin.jilosa.R;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class w1 {
    public final float MdtA4re8;
    public final v1 NCTxEWno;
    public final float P7K7Inc8;
    public final float Qr9iLBAD;
    public final float VgvYg0wo;
    public final float b2ZJblxo;
    public final int eVhOlqcC;
    public final int jb9XjC4I;
    public final int k3x7lurq;
    public int ow5vqvCr;
    public final v1 qoPGr6Ce;
    public final float wxUZMvaN;

    public w1(Context context, v1 v1Var) {
        AttributeSet attributeSet;
        int i;
        int next;
        v1 v1Var2 = new v1();
        v1Var2.eVhOlqcC = 255;
        v1Var2.ow5vqvCr = -2;
        v1Var2.OnDfzHZD = -2;
        v1Var2.ygLcUYwZ = -2;
        v1Var2.I5GHvsYW = Boolean.TRUE;
        this.NCTxEWno = v1Var2;
        int i2 = v1Var.NCTxEWno;
        if (i2 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i2);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                attributeSet = Xml.asAttributeSet(xml);
                i = attributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i2));
                notFoundException.initCause(e);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            i = 0;
        }
        TypedArray FySoLYna = fn.FySoLYna(context, attributeSet, y00.qoPGr6Ce, R.attr.badgeStyle, i == 0 ? R.style.Widget_MaterialComponents_Badge : i, new int[0]);
        Resources resources = context.getResources();
        this.MdtA4re8 = FySoLYna.getDimensionPixelSize(5, -1);
        this.jb9XjC4I = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.eVhOlqcC = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.wxUZMvaN = FySoLYna.getDimensionPixelSize(15, -1);
        this.VgvYg0wo = FySoLYna.getDimension(13, resources.getDimension(R.dimen.m3_badge_size));
        this.b2ZJblxo = FySoLYna.getDimension(18, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.P7K7Inc8 = FySoLYna.getDimension(4, resources.getDimension(R.dimen.m3_badge_size));
        this.Qr9iLBAD = FySoLYna.getDimension(14, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.k3x7lurq = FySoLYna.getInt(25, 1);
        this.ow5vqvCr = FySoLYna.getInt(2, 0);
        v1 v1Var3 = this.NCTxEWno;
        int i3 = v1Var.eVhOlqcC;
        v1Var3.eVhOlqcC = i3 != -2 ? i3 : 255;
        int i4 = v1Var.ow5vqvCr;
        if (i4 != -2) {
            v1Var3.ow5vqvCr = i4;
        } else {
            boolean hasValue = FySoLYna.hasValue(24);
            v1 v1Var4 = this.NCTxEWno;
            if (hasValue) {
                v1Var4.ow5vqvCr = FySoLYna.getInt(24, 0);
            } else {
                v1Var4.ow5vqvCr = -1;
            }
        }
        String str = v1Var.k3x7lurq;
        if (str != null) {
            this.NCTxEWno.k3x7lurq = str;
        } else if (FySoLYna.hasValue(8)) {
            this.NCTxEWno.k3x7lurq = FySoLYna.getString(8);
        }
        v1 v1Var5 = this.NCTxEWno;
        v1Var5.sjUBp5pO = v1Var.sjUBp5pO;
        CharSequence charSequence = v1Var.OxcuoDLp;
        v1Var5.OxcuoDLp = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        v1 v1Var6 = this.NCTxEWno;
        int i5 = v1Var.amk52bBQ;
        v1Var6.amk52bBQ = i5 == 0 ? R.plurals.mtrl_badge_content_description : i5;
        int i6 = v1Var.KlHjfFWx;
        v1Var6.KlHjfFWx = i6 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i6;
        Boolean bool = v1Var.I5GHvsYW;
        v1Var6.I5GHvsYW = Boolean.valueOf(bool == null || bool.booleanValue());
        v1 v1Var7 = this.NCTxEWno;
        int i7 = v1Var.OnDfzHZD;
        v1Var7.OnDfzHZD = i7 == -2 ? FySoLYna.getInt(22, -2) : i7;
        v1 v1Var8 = this.NCTxEWno;
        int i8 = v1Var.ygLcUYwZ;
        v1Var8.ygLcUYwZ = i8 == -2 ? FySoLYna.getInt(23, -2) : i8;
        v1 v1Var9 = this.NCTxEWno;
        Integer num = v1Var.P7K7Inc8;
        v1Var9.P7K7Inc8 = Integer.valueOf(num == null ? FySoLYna.getResourceId(6, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        v1 v1Var10 = this.NCTxEWno;
        Integer num2 = v1Var.b2ZJblxo;
        v1Var10.b2ZJblxo = Integer.valueOf(num2 == null ? FySoLYna.getResourceId(7, 0) : num2.intValue());
        v1 v1Var11 = this.NCTxEWno;
        Integer num3 = v1Var.Qr9iLBAD;
        v1Var11.Qr9iLBAD = Integer.valueOf(num3 == null ? FySoLYna.getResourceId(16, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        v1 v1Var12 = this.NCTxEWno;
        Integer num4 = v1Var.jb9XjC4I;
        v1Var12.jb9XjC4I = Integer.valueOf(num4 == null ? FySoLYna.getResourceId(17, 0) : num4.intValue());
        v1 v1Var13 = this.NCTxEWno;
        Integer num5 = v1Var.MdtA4re8;
        v1Var13.MdtA4re8 = Integer.valueOf(num5 == null ? w30.gjV1z5T1(context, FySoLYna, 1).getDefaultColor() : num5.intValue());
        v1 v1Var14 = this.NCTxEWno;
        Integer num6 = v1Var.VgvYg0wo;
        v1Var14.VgvYg0wo = Integer.valueOf(num6 == null ? FySoLYna.getResourceId(9, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = v1Var.wxUZMvaN;
        if (num7 != null) {
            this.NCTxEWno.wxUZMvaN = num7;
        } else {
            boolean hasValue2 = FySoLYna.hasValue(10);
            v1 v1Var15 = this.NCTxEWno;
            if (hasValue2) {
                v1Var15.wxUZMvaN = Integer.valueOf(w30.gjV1z5T1(context, FySoLYna, 10).getDefaultColor());
            } else {
                this.NCTxEWno.wxUZMvaN = Integer.valueOf(new bc0(context, v1Var15.VgvYg0wo.intValue()).k3x7lurq.getDefaultColor());
            }
        }
        v1 v1Var16 = this.NCTxEWno;
        Integer num8 = v1Var.Ey6iv0m0;
        v1Var16.Ey6iv0m0 = Integer.valueOf(num8 == null ? FySoLYna.getInt(3, 8388661) : num8.intValue());
        v1 v1Var17 = this.NCTxEWno;
        Integer num9 = v1Var.RXQxj5Oe;
        v1Var17.RXQxj5Oe = Integer.valueOf(num9 == null ? FySoLYna.getDimensionPixelSize(12, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        v1 v1Var18 = this.NCTxEWno;
        Integer num10 = v1Var.FySoLYna;
        v1Var18.FySoLYna = Integer.valueOf(num10 == null ? FySoLYna.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        v1 v1Var19 = this.NCTxEWno;
        Integer num11 = v1Var.gjV1z5T1;
        v1Var19.gjV1z5T1 = Integer.valueOf(num11 == null ? FySoLYna.getDimensionPixelOffset(19, 0) : num11.intValue());
        v1 v1Var20 = this.NCTxEWno;
        Integer num12 = v1Var.WYNAV5pd;
        v1Var20.WYNAV5pd = Integer.valueOf(num12 == null ? FySoLYna.getDimensionPixelOffset(26, 0) : num12.intValue());
        v1 v1Var21 = this.NCTxEWno;
        Integer num13 = v1Var.DK9slbsy;
        v1Var21.DK9slbsy = Integer.valueOf(num13 == null ? FySoLYna.getDimensionPixelOffset(20, v1Var21.gjV1z5T1.intValue()) : num13.intValue());
        v1 v1Var22 = this.NCTxEWno;
        Integer num14 = v1Var.lwWCatUu;
        v1Var22.lwWCatUu = Integer.valueOf(num14 == null ? FySoLYna.getDimensionPixelOffset(27, v1Var22.WYNAV5pd.intValue()) : num14.intValue());
        v1 v1Var23 = this.NCTxEWno;
        Integer num15 = v1Var.Mq3SeTnW;
        v1Var23.Mq3SeTnW = Integer.valueOf(num15 == null ? FySoLYna.getDimensionPixelOffset(21, 0) : num15.intValue());
        v1 v1Var24 = this.NCTxEWno;
        Integer num16 = v1Var.U0LaHZX7;
        v1Var24.U0LaHZX7 = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        v1 v1Var25 = this.NCTxEWno;
        Integer num17 = v1Var.i7xS8jrb;
        v1Var25.i7xS8jrb = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        v1 v1Var26 = this.NCTxEWno;
        Boolean bool2 = v1Var.euDDoUNr;
        v1Var26.euDDoUNr = Boolean.valueOf(bool2 == null ? FySoLYna.getBoolean(0, false) : bool2.booleanValue());
        FySoLYna.recycle();
        Locale locale = v1Var.lDXGDhIF;
        v1 v1Var27 = this.NCTxEWno;
        if (locale == null) {
            v1Var27.lDXGDhIF = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            v1Var27.lDXGDhIF = locale;
        }
        this.qoPGr6Ce = v1Var;
    }
}
