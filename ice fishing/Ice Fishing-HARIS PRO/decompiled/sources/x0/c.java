package x0;

import L0.m;
import a.AbstractC0078a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.recyclerview.widget.RecyclerView;
import com.lumenpath.harispro.hrnavigator.R;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import u0.AbstractC0358a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final b f4750a;

    /* renamed from: b, reason: collision with root package name */
    public final b f4751b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4752c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4753d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final float f4754f;

    /* renamed from: g, reason: collision with root package name */
    public final float f4755g;

    /* renamed from: h, reason: collision with root package name */
    public final float f4756h;
    public final int i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final int f4757k;

    public c(Context context, b bVar) {
        AttributeSet attributeSet;
        int i;
        int next;
        b bVar2 = new b();
        bVar2.i = 255;
        bVar2.f4734k = -2;
        bVar2.f4735l = -2;
        bVar2.f4736m = -2;
        bVar2.f4743t = Boolean.TRUE;
        this.f4751b = bVar2;
        int i2 = bVar.f4727a;
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
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                i = asAttributeSet.getStyleAttribute();
                attributeSet = asAttributeSet;
            } catch (IOException | XmlPullParserException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i2));
                notFoundException.initCause(e);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            i = 0;
        }
        TypedArray g2 = m.g(context, attributeSet, AbstractC0358a.f4439a, R.attr.badgeStyle, i == 0 ? 2131887111 : i, new int[0]);
        Resources resources = context.getResources();
        this.f4752c = g2.getDimensionPixelSize(4, -1);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.f4753d = g2.getDimensionPixelSize(14, -1);
        this.e = g2.getDimension(12, resources.getDimension(R.dimen.m3_badge_size));
        this.f4755g = g2.getDimension(17, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f4754f = g2.getDimension(3, resources.getDimension(R.dimen.m3_badge_size));
        this.f4756h = g2.getDimension(13, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f4757k = g2.getInt(24, 1);
        b bVar3 = this.f4751b;
        int i3 = bVar.i;
        bVar3.i = i3 == -2 ? 255 : i3;
        int i4 = bVar.f4734k;
        if (i4 != -2) {
            bVar3.f4734k = i4;
        } else if (g2.hasValue(23)) {
            this.f4751b.f4734k = g2.getInt(23, 0);
        } else {
            this.f4751b.f4734k = -1;
        }
        String str = bVar.j;
        if (str != null) {
            this.f4751b.j = str;
        } else if (g2.hasValue(7)) {
            this.f4751b.j = g2.getString(7);
        }
        b bVar4 = this.f4751b;
        bVar4.f4738o = bVar.f4738o;
        CharSequence charSequence = bVar.f4739p;
        bVar4.f4739p = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        b bVar5 = this.f4751b;
        int i5 = bVar.f4740q;
        bVar5.f4740q = i5 == 0 ? R.plurals.mtrl_badge_content_description : i5;
        int i6 = bVar.f4741r;
        bVar5.f4741r = i6 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i6;
        Boolean bool = bVar.f4743t;
        bVar5.f4743t = Boolean.valueOf(bool == null || bool.booleanValue());
        b bVar6 = this.f4751b;
        int i7 = bVar.f4735l;
        bVar6.f4735l = i7 == -2 ? g2.getInt(21, -2) : i7;
        b bVar7 = this.f4751b;
        int i8 = bVar.f4736m;
        bVar7.f4736m = i8 == -2 ? g2.getInt(22, -2) : i8;
        b bVar8 = this.f4751b;
        Integer num = bVar.e;
        bVar8.e = Integer.valueOf(num == null ? g2.getResourceId(5, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        b bVar9 = this.f4751b;
        Integer num2 = bVar.f4731f;
        bVar9.f4731f = Integer.valueOf(num2 == null ? g2.getResourceId(6, 0) : num2.intValue());
        b bVar10 = this.f4751b;
        Integer num3 = bVar.f4732g;
        bVar10.f4732g = Integer.valueOf(num3 == null ? g2.getResourceId(15, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        b bVar11 = this.f4751b;
        Integer num4 = bVar.f4733h;
        bVar11.f4733h = Integer.valueOf(num4 == null ? g2.getResourceId(16, 0) : num4.intValue());
        b bVar12 = this.f4751b;
        Integer num5 = bVar.f4728b;
        bVar12.f4728b = Integer.valueOf(num5 == null ? AbstractC0078a.B(context, g2, 1).getDefaultColor() : num5.intValue());
        b bVar13 = this.f4751b;
        Integer num6 = bVar.f4730d;
        bVar13.f4730d = Integer.valueOf(num6 == null ? g2.getResourceId(8, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = bVar.f4729c;
        if (num7 != null) {
            this.f4751b.f4729c = num7;
        } else if (g2.hasValue(9)) {
            this.f4751b.f4729c = Integer.valueOf(AbstractC0078a.B(context, g2, 9).getDefaultColor());
        } else {
            int intValue = this.f4751b.f4730d.intValue();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(intValue, AbstractC0358a.f4435F);
            obtainStyledAttributes.getDimension(0, RecyclerView.f2111C0);
            ColorStateList B2 = AbstractC0078a.B(context, obtainStyledAttributes, 3);
            AbstractC0078a.B(context, obtainStyledAttributes, 4);
            AbstractC0078a.B(context, obtainStyledAttributes, 5);
            obtainStyledAttributes.getInt(2, 0);
            obtainStyledAttributes.getInt(1, 1);
            int i9 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
            obtainStyledAttributes.getResourceId(i9, 0);
            obtainStyledAttributes.getString(i9);
            obtainStyledAttributes.getBoolean(14, false);
            AbstractC0078a.B(context, obtainStyledAttributes, 6);
            obtainStyledAttributes.getFloat(7, RecyclerView.f2111C0);
            obtainStyledAttributes.getFloat(8, RecyclerView.f2111C0);
            obtainStyledAttributes.getFloat(9, RecyclerView.f2111C0);
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(intValue, AbstractC0358a.f4456u);
            obtainStyledAttributes2.hasValue(0);
            obtainStyledAttributes2.getFloat(0, RecyclerView.f2111C0);
            obtainStyledAttributes2.recycle();
            this.f4751b.f4729c = Integer.valueOf(B2.getDefaultColor());
        }
        b bVar14 = this.f4751b;
        Integer num8 = bVar.f4742s;
        bVar14.f4742s = Integer.valueOf(num8 == null ? g2.getInt(2, 8388661) : num8.intValue());
        b bVar15 = this.f4751b;
        Integer num9 = bVar.f4744u;
        bVar15.f4744u = Integer.valueOf(num9 == null ? g2.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        b bVar16 = this.f4751b;
        Integer num10 = bVar.f4745v;
        bVar16.f4745v = Integer.valueOf(num10 == null ? g2.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        b bVar17 = this.f4751b;
        Integer num11 = bVar.f4746w;
        bVar17.f4746w = Integer.valueOf(num11 == null ? g2.getDimensionPixelOffset(18, 0) : num11.intValue());
        b bVar18 = this.f4751b;
        Integer num12 = bVar.f4747x;
        bVar18.f4747x = Integer.valueOf(num12 == null ? g2.getDimensionPixelOffset(25, 0) : num12.intValue());
        b bVar19 = this.f4751b;
        Integer num13 = bVar.f4748y;
        bVar19.f4748y = Integer.valueOf(num13 == null ? g2.getDimensionPixelOffset(19, bVar19.f4746w.intValue()) : num13.intValue());
        b bVar20 = this.f4751b;
        Integer num14 = bVar.f4749z;
        bVar20.f4749z = Integer.valueOf(num14 == null ? g2.getDimensionPixelOffset(26, bVar20.f4747x.intValue()) : num14.intValue());
        b bVar21 = this.f4751b;
        Integer num15 = bVar.f4725C;
        bVar21.f4725C = Integer.valueOf(num15 == null ? g2.getDimensionPixelOffset(20, 0) : num15.intValue());
        b bVar22 = this.f4751b;
        Integer num16 = bVar.f4723A;
        bVar22.f4723A = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        b bVar23 = this.f4751b;
        Integer num17 = bVar.f4724B;
        bVar23.f4724B = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        b bVar24 = this.f4751b;
        Boolean bool2 = bVar.f4726D;
        bVar24.f4726D = Boolean.valueOf(bool2 == null ? g2.getBoolean(0, false) : bool2.booleanValue());
        g2.recycle();
        Locale locale = bVar.f4737n;
        if (locale == null) {
            this.f4751b.f4737n = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            this.f4751b.f4737n = locale;
        }
        this.f4750a = bVar;
    }
}
