package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Locale;
import kotlin.KotlinVersion;
import org.xmlpull.v1.XmlPullParserException;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class mk2 {
    public final lk2 a;
    public final lk2 b = new lk2();
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;

    public mk2(Context context) {
        AttributeSet attributeSet;
        int i;
        int next;
        lk2 lk2Var = new lk2();
        int i2 = lk2Var.a;
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
        TypedArray B = bcx.B(context, attributeSet, vdn.c, R.attr.badgeStyle, i == 0 ? R.style.Widget_MaterialComponents_Badge : i, new int[0]);
        Resources resources = context.getResources();
        this.c = B.getDimensionPixelSize(5, -1);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.d = B.getDimensionPixelSize(15, -1);
        this.e = B.getDimension(13, resources.getDimension(R.dimen.m3_badge_size));
        this.g = B.getDimension(18, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f = B.getDimension(4, resources.getDimension(R.dimen.m3_badge_size));
        this.h = B.getDimension(14, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.k = B.getInt(25, 1);
        this.l = B.getInt(2, 0);
        lk2 lk2Var2 = this.b;
        int i3 = lk2Var.i;
        lk2Var2.i = i3 == -2 ? KotlinVersion.MAX_COMPONENT_VALUE : i3;
        int i4 = lk2Var.k;
        if (i4 != -2) {
            lk2Var2.k = i4;
        } else {
            boolean hasValue = B.hasValue(24);
            lk2 lk2Var3 = this.b;
            if (hasValue) {
                lk2Var3.k = B.getInt(24, 0);
            } else {
                lk2Var3.k = -1;
            }
        }
        String str = lk2Var.j;
        if (str != null) {
            this.b.j = str;
        } else if (B.hasValue(8)) {
            this.b.j = B.getString(8);
        }
        lk2 lk2Var4 = this.b;
        lk2Var4.o = lk2Var.o;
        CharSequence charSequence = lk2Var.p;
        lk2Var4.p = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        lk2 lk2Var5 = this.b;
        int i5 = lk2Var.q;
        lk2Var5.q = i5 == 0 ? R.plurals.mtrl_badge_content_description : i5;
        int i6 = lk2Var.r;
        lk2Var5.r = i6 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i6;
        Boolean bool = lk2Var.t;
        lk2Var5.t = Boolean.valueOf(bool == null || bool.booleanValue());
        lk2 lk2Var6 = this.b;
        int i7 = lk2Var.l;
        lk2Var6.l = i7 == -2 ? B.getInt(22, -2) : i7;
        lk2 lk2Var7 = this.b;
        int i8 = lk2Var.m;
        lk2Var7.m = i8 == -2 ? B.getInt(23, -2) : i8;
        lk2 lk2Var8 = this.b;
        Integer num = lk2Var.e;
        lk2Var8.e = Integer.valueOf(num == null ? B.getResourceId(6, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        lk2 lk2Var9 = this.b;
        Integer num2 = lk2Var.f;
        lk2Var9.f = Integer.valueOf(num2 == null ? B.getResourceId(7, 0) : num2.intValue());
        lk2 lk2Var10 = this.b;
        Integer num3 = lk2Var.g;
        lk2Var10.g = Integer.valueOf(num3 == null ? B.getResourceId(16, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        lk2 lk2Var11 = this.b;
        Integer num4 = lk2Var.h;
        lk2Var11.h = Integer.valueOf(num4 == null ? B.getResourceId(17, 0) : num4.intValue());
        lk2 lk2Var12 = this.b;
        Integer num5 = lk2Var.b;
        lk2Var12.b = Integer.valueOf(num5 == null ? ivf.D(context, B, 1).getDefaultColor() : num5.intValue());
        lk2 lk2Var13 = this.b;
        Integer num6 = lk2Var.d;
        lk2Var13.d = Integer.valueOf(num6 == null ? B.getResourceId(9, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = lk2Var.c;
        if (num7 != null) {
            this.b.c = num7;
        } else {
            boolean hasValue2 = B.hasValue(10);
            lk2 lk2Var14 = this.b;
            if (hasValue2) {
                lk2Var14.c = Integer.valueOf(ivf.D(context, B, 10).getDefaultColor());
            } else {
                this.b.c = Integer.valueOf(new x9s(context, lk2Var14.d.intValue()).k.getDefaultColor());
            }
        }
        lk2 lk2Var15 = this.b;
        Integer num8 = lk2Var.s;
        lk2Var15.s = Integer.valueOf(num8 == null ? B.getInt(3, 8388661) : num8.intValue());
        lk2 lk2Var16 = this.b;
        Integer num9 = lk2Var.u;
        lk2Var16.u = Integer.valueOf(num9 == null ? B.getDimensionPixelSize(12, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        lk2 lk2Var17 = this.b;
        Integer num10 = lk2Var.v;
        lk2Var17.v = Integer.valueOf(num10 == null ? B.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        lk2 lk2Var18 = this.b;
        Integer num11 = lk2Var.w;
        lk2Var18.w = Integer.valueOf(num11 == null ? B.getDimensionPixelOffset(19, 0) : num11.intValue());
        lk2 lk2Var19 = this.b;
        Integer num12 = lk2Var.x;
        lk2Var19.x = Integer.valueOf(num12 == null ? B.getDimensionPixelOffset(26, 0) : num12.intValue());
        lk2 lk2Var20 = this.b;
        Integer num13 = lk2Var.y;
        lk2Var20.y = Integer.valueOf(num13 == null ? B.getDimensionPixelOffset(20, lk2Var20.w.intValue()) : num13.intValue());
        lk2 lk2Var21 = this.b;
        Integer num14 = lk2Var.z;
        lk2Var21.z = Integer.valueOf(num14 == null ? B.getDimensionPixelOffset(27, lk2Var21.x.intValue()) : num14.intValue());
        lk2 lk2Var22 = this.b;
        Integer num15 = lk2Var.C;
        lk2Var22.C = Integer.valueOf(num15 == null ? B.getDimensionPixelOffset(21, 0) : num15.intValue());
        lk2 lk2Var23 = this.b;
        Integer num16 = lk2Var.A;
        lk2Var23.A = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        lk2 lk2Var24 = this.b;
        Integer num17 = lk2Var.B;
        lk2Var24.B = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        lk2 lk2Var25 = this.b;
        Boolean bool2 = lk2Var.D;
        lk2Var25.D = Boolean.valueOf(bool2 == null ? B.getBoolean(0, false) : bool2.booleanValue());
        B.recycle();
        Locale locale = lk2Var.n;
        lk2 lk2Var26 = this.b;
        if (locale == null) {
            lk2Var26.n = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            lk2Var26.n = locale;
        }
        this.a = lk2Var;
    }
}
