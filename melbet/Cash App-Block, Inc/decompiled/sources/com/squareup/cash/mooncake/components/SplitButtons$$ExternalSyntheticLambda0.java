package com.squareup.cash.mooncake.components;

import android.graphics.Rect;
import android.view.ViewGroup;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XFloat;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.http2.Huffman;

/* loaded from: classes6.dex */
public final /* synthetic */ class SplitButtons$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ SplitButtons$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                int i = SplitButtons.$r8$clinit;
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new XFloat(((Huffman.Node) r3.getParent().appLaunchedCallback).resolve() / 1.0f);
            case 1:
                ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            case 2:
                ViewGroup viewGroup = (ViewGroup) obj;
                viewGroup.getClass();
                return new Rect(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
            case 3:
                ColorPalette colorPalette = (ColorPalette) obj;
                colorPalette.getClass();
                return Integer.valueOf(colorPalette.icon);
            case 4:
                ColorPalette colorPalette2 = (ColorPalette) obj;
                colorPalette2.getClass();
                return Integer.valueOf(colorPalette2.error);
            case 5:
                ColorPalette colorPalette3 = (ColorPalette) obj;
                colorPalette3.getClass();
                return Integer.valueOf(colorPalette3.error);
            case 6:
                ColorPalette colorPalette4 = (ColorPalette) obj;
                colorPalette4.getClass();
                return Integer.valueOf(colorPalette4.error);
            case 7:
                ColorPalette colorPalette5 = (ColorPalette) obj;
                colorPalette5.getClass();
                return Integer.valueOf(colorPalette5.background);
            case 8:
                ColorPalette colorPalette6 = (ColorPalette) obj;
                colorPalette6.getClass();
                return Integer.valueOf(colorPalette6.icon);
            case 9:
                ColorPalette colorPalette7 = (ColorPalette) obj;
                colorPalette7.getClass();
                return Integer.valueOf(colorPalette7.green);
            case 10:
                ColorPalette colorPalette8 = (ColorPalette) obj;
                colorPalette8.getClass();
                return Integer.valueOf(colorPalette8.icon);
            case 11:
                ColorPalette colorPalette9 = (ColorPalette) obj;
                colorPalette9.getClass();
                return Integer.valueOf(colorPalette9.behindBackground);
            case 12:
                ColorPalette colorPalette10 = (ColorPalette) obj;
                colorPalette10.getClass();
                return Integer.valueOf(colorPalette10.error);
            case 13:
                ColorPalette colorPalette11 = (ColorPalette) obj;
                colorPalette11.getClass();
                return Integer.valueOf(colorPalette11.error);
            case 14:
                ColorPalette colorPalette12 = (ColorPalette) obj;
                colorPalette12.getClass();
                return Integer.valueOf(colorPalette12.error);
            case 15:
                ColorPalette colorPalette13 = (ColorPalette) obj;
                colorPalette13.getClass();
                return Integer.valueOf(colorPalette13.placeholderIcon);
            case 16:
                ColorPalette colorPalette14 = (ColorPalette) obj;
                colorPalette14.getClass();
                return Integer.valueOf(colorPalette14.icon);
            case 17:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
            case 18:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj));
            case 19:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj));
            case 20:
                int i2 = MooncakeSearchTextField.$r8$clinit;
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
            case 21:
                int i3 = MooncakeSearchTextField.$r8$clinit;
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj));
            case 22:
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                layoutSpec.getClass();
                return new YInt(((Huffman.Node) layoutSpec.getParent().lastAppBecameInvisibleRealtimeMillis).resolve());
            case 23:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
            case 24:
                ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                layoutSpec2.getClass();
                return new XInt(((Huffman.Node) layoutSpec2.getParent().appLaunchedCallback).resolve() / 2);
            case 25:
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj));
            case 26:
                ContourLayout.LayoutSpec layoutSpec3 = (ContourLayout.LayoutSpec) obj;
                layoutSpec3.getClass();
                return new YInt(((Huffman.Node) layoutSpec3.getParent().lastAppBecameInvisibleRealtimeMillis).resolve());
            case 27:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj));
            case 28:
                ContourLayout.LayoutSpec layoutSpec4 = (ContourLayout.LayoutSpec) obj;
                layoutSpec4.getClass();
                return new XInt(((Huffman.Node) layoutSpec4.getParent().appLaunchedCallback).resolve() / 2);
            default:
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj));
        }
    }
}
