package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class her {
    public final int a;
    public final eup b;
    public final int[][] c;
    public final eup[] d;
    public final eer e;
    public final eer f;
    public final eer g;
    public final eer h;

    public her(gn7 gn7Var) {
        this.a = gn7Var.a;
        this.b = (eup) gn7Var.c;
        this.c = (int[][]) gn7Var.d;
        this.d = (eup[]) gn7Var.b;
        this.e = (eer) gn7Var.e;
        this.f = (eer) gn7Var.f;
        this.g = (eer) gn7Var.g;
        this.h = (eer) gn7Var.h;
    }

    public static void a(gn7 gn7Var, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                Resources resources = context.getResources();
                int[] iArr = vdn.E;
                TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                eup e = eup.a(context, obtainAttributes.getResourceId(0, 0), obtainAttributes.getResourceId(1, 0)).e();
                obtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i3;
                    }
                }
                gn7Var.a(StateSet.trimStateSet(iArr2, i), e);
            }
        }
    }

    public static her b(Context context, TypedArray typedArray, int i) {
        XmlResourceParser xml;
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        gn7 gn7Var = new gn7();
        gn7Var.c();
        try {
            xml = context.getResources().getXml(resourceId);
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            gn7Var.c();
        }
        try {
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (xml.getName().equals("selector")) {
                a(gn7Var, context, xml, asAttributeSet, context.getTheme());
            }
            xml.close();
            if (gn7Var.a == 0) {
                return null;
            }
            return new her(gn7Var);
        } catch (Throwable th) {
            if (xml != null) {
                try {
                    xml.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final eup c() {
        eup eupVar = this.b;
        eer eerVar = this.h;
        eer eerVar2 = this.g;
        eer eerVar3 = this.f;
        eer eerVar4 = this.e;
        if (eerVar4 == null && eerVar3 == null && eerVar2 == null && eerVar == null) {
            return eupVar;
        }
        iz7 h = eupVar.h();
        if (eerVar4 != null) {
            h.e = eerVar4.b;
        }
        if (eerVar3 != null) {
            h.f = eerVar3.b;
        }
        if (eerVar2 != null) {
            h.h = eerVar2.b;
        }
        if (eerVar != null) {
            h.g = eerVar.b;
        }
        return h.e();
    }

    public final boolean d() {
        eer eerVar;
        eer eerVar2;
        eer eerVar3;
        eer eerVar4;
        return this.a > 1 || ((eerVar = this.e) != null && eerVar.a > 1) || (((eerVar2 = this.f) != null && eerVar2.a > 1) || (((eerVar3 = this.g) != null && eerVar3.a > 1) || ((eerVar4 = this.h) != null && eerVar4.a > 1)));
    }
}
