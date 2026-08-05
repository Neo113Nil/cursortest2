package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import android.view.ContextThemeWrapper;
import com.kolosta.rejin.jilosa.R;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class z90 implements r60 {
    public final int[][] MdtA4re8;
    public final t60 NCTxEWno;
    public final int qoPGr6Ce;
    public final t60[] wxUZMvaN;

    public z90(yt ytVar) {
        this.qoPGr6Ce = ytVar.qoPGr6Ce;
        this.NCTxEWno = (t60) ytVar.NCTxEWno;
        this.MdtA4re8 = (int[][]) ytVar.MdtA4re8;
        this.wxUZMvaN = (t60[]) ytVar.wxUZMvaN;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Cloneable, t60[]] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Cloneable, t60[]] */
    public static z90 P7K7Inc8(Context context, TypedArray typedArray, int i) {
        XmlResourceParser xml;
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        yt ytVar = new yt();
        ytVar.NCTxEWno = new t60();
        ytVar.MdtA4re8 = new int[10][];
        ytVar.wxUZMvaN = new t60[10];
        try {
            xml = context.getResources().getXml(resourceId);
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            ytVar.NCTxEWno = new t60();
            ytVar.MdtA4re8 = new int[10][];
            ytVar.wxUZMvaN = new t60[10];
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
                b2ZJblxo(ytVar, context, xml, asAttributeSet, context.getTheme());
            }
            xml.close();
            if (ytVar.qoPGr6Ce == 0) {
                return null;
            }
            return new z90(ytVar);
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

    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Cloneable, java.lang.Object, t60[]] */
    public static void b2ZJblxo(yt ytVar, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
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
                int[] iArr = y00.OxcuoDLp;
                TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                int resourceId = obtainAttributes.getResourceId(0, 0);
                int resourceId2 = obtainAttributes.getResourceId(1, 0);
                P7K7Inc8 p7K7Inc8 = new P7K7Inc8(0.0f);
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
                if (resourceId2 != 0) {
                    contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
                }
                t60 qoPGr6Ce = t60.b2ZJblxo(contextThemeWrapper.obtainStyledAttributes(y00.gjV1z5T1), p7K7Inc8).qoPGr6Ce();
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
                int[] trimStateSet = StateSet.trimStateSet(iArr2, i);
                int i4 = ytVar.qoPGr6Ce;
                if (i4 == 0 || trimStateSet.length == 0) {
                    ytVar.NCTxEWno = qoPGr6Ce;
                }
                int[][] iArr3 = (int[][]) ytVar.MdtA4re8;
                if (i4 >= iArr3.length) {
                    int i5 = i4 + 10;
                    int[][] iArr4 = new int[i5][];
                    System.arraycopy(iArr3, 0, iArr4, 0, i4);
                    ytVar.MdtA4re8 = iArr4;
                    ?? r6 = new t60[i5];
                    System.arraycopy((t60[]) ytVar.wxUZMvaN, 0, r6, 0, i4);
                    ytVar.wxUZMvaN = r6;
                }
                int[][] iArr5 = (int[][]) ytVar.MdtA4re8;
                int i6 = ytVar.qoPGr6Ce;
                iArr5[i6] = trimStateSet;
                ((t60[]) ytVar.wxUZMvaN)[i6] = qoPGr6Ce;
                ytVar.qoPGr6Ce = i6 + 1;
            }
        }
    }

    @Override // defpackage.r60
    public final t60[] MdtA4re8() {
        return this.wxUZMvaN;
    }

    @Override // defpackage.r60
    public final t60 NCTxEWno(int[] iArr) {
        int i;
        int i2;
        int[][] iArr2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = -1;
            i2 = this.qoPGr6Ce;
            iArr2 = this.MdtA4re8;
            if (i4 >= i2) {
                i4 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i4], iArr)) {
                break;
            }
            i4++;
        }
        if (i4 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr2[i3], iArr3)) {
                    i = i3;
                    break;
                }
                i3++;
            }
            i4 = i;
        }
        return this.wxUZMvaN[i4];
    }

    @Override // defpackage.r60
    public final boolean VgvYg0wo() {
        return this.qoPGr6Ce > 1;
    }

    @Override // defpackage.r60
    public final t60 qoPGr6Ce(float f) {
        return this.NCTxEWno.qoPGr6Ce(f);
    }

    @Override // defpackage.r60
    public final t60 wxUZMvaN() {
        return this.NCTxEWno;
    }
}
