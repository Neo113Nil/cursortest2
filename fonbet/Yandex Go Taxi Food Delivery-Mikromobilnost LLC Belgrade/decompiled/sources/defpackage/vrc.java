package defpackage;

import android.widget.ImageView;
import com.ybsdk.core.design.design.DesignTextStyle;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.videoplayer.api.VideoPlayer$RepeatMode;
import com.ybsdk.widgets.common.ImageScaleTypeEntity;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenView$State$Type;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes4.dex */
public final class vrc {
    public final VideoPlayer$RepeatMode A;
    public final boolean B;
    public final zrc C;
    public final Integer D;
    public final boolean E;
    public final trc F;
    public final p60 G;
    public final CommunicationFullScreenView$State$Type a;
    public final Text b;
    public final ColorModel c;
    public final DesignTextStyle d;
    public final Text e;
    public final ColorModel f;
    public final DesignTextStyle g;
    public final Integer h;
    public final ColorModel i;
    public final rbv j;
    public final List k;
    public final YbButtonViewGroup.b l;
    public final urc m;
    public final int n;
    public final int o;
    public final ColorModel p;
    public final List q;
    public final ImageView.ScaleType r;
    public final int s;
    public final boolean t;
    public final boolean u;
    public final int v;
    public final int w;
    public final Float x;
    public final ImageScaleTypeEntity y;
    public final String z;

    public /* synthetic */ vrc(CommunicationFullScreenView$State$Type communicationFullScreenView$State$Type, Text text, ColorModel colorModel, DesignTextStyle designTextStyle, Text text2, ColorModel colorModel2, DesignTextStyle designTextStyle2, Integer num, ColorModel.Attr attr, rbv rbvVar, List list, YbButtonViewGroup.b bVar, urc urcVar, int i, int i2, ColorModel colorModel3, List list2, ImageView.ScaleType scaleType, int i3, boolean z, ImageScaleTypeEntity imageScaleTypeEntity, String str, VideoPlayer$RepeatMode videoPlayer$RepeatMode, Integer num2, trc trcVar, p60 p60Var, int i4, int i5) {
        this(communicationFullScreenView$State$Type, (i4 & 2) != 0 ? null : text, (i4 & 4) != 0 ? null : colorModel, (i4 & 8) != 0 ? null : designTextStyle, (i4 & 16) != 0 ? null : text2, (i4 & 32) != 0 ? null : colorModel2, (i4 & 64) != 0 ? null : designTextStyle2, (i4 & 128) != 0 ? null : num, (i4 & 256) != 0 ? null : attr, (i4 & 512) != 0 ? null : rbvVar, (i4 & 1024) != 0 ? null : list, (i4 & 4096) != 0 ? null : bVar, (i4 & 8192) != 0 ? null : urcVar, (i4 & 16384) != 0 ? 3 : i, (32768 & i4) != 0 ? 3 : i2, (65536 & i4) != 0 ? null : colorModel3, (131072 & i4) != 0 ? null : list2, (262144 & i4) != 0 ? null : scaleType, (524288 & i4) != 0 ? 0 : i3, (1048576 & i4) != 0 ? true : z, (2097152 & i4) != 0, 0, 0, (16777216 & i4) != 0 ? null : Float.valueOf(0.55f), (33554432 & i4) != 0 ? ImageScaleTypeEntity.DEFAULT : imageScaleTypeEntity, (67108864 & i4) != 0 ? null : str, (134217728 & i4) != 0 ? VideoPlayer$RepeatMode.OFF : videoPlayer$RepeatMode, (268435456 & i4) == 0, xrc.a, (i4 & 1073741824) != 0 ? null : num2, true, (i5 & 1) != 0 ? null : trcVar, (i5 & 2) != 0 ? null : p60Var);
    }

    public static vrc a(vrc vrcVar, Text text, rbv rbvVar, YbButtonViewGroup.b bVar, boolean z, boolean z2, int i, int i2, zrc zrcVar, boolean z3, int i3) {
        int i4;
        boolean z4;
        VideoPlayer$RepeatMode videoPlayer$RepeatMode;
        boolean z5;
        Integer num;
        boolean z6;
        CommunicationFullScreenView$State$Type communicationFullScreenView$State$Type = vrcVar.a;
        Text text2 = (i3 & 2) != 0 ? vrcVar.b : text;
        ColorModel colorModel = vrcVar.c;
        Text text3 = text2;
        DesignTextStyle designTextStyle = vrcVar.d;
        Text text4 = vrcVar.e;
        ColorModel colorModel2 = vrcVar.f;
        DesignTextStyle designTextStyle2 = vrcVar.g;
        Integer num2 = vrcVar.h;
        ColorModel colorModel3 = vrcVar.i;
        rbv rbvVar2 = (i3 & 512) != 0 ? vrcVar.j : rbvVar;
        List list = vrcVar.k;
        YbButtonViewGroup.b bVar2 = (i3 & 4096) != 0 ? vrcVar.l : bVar;
        urc urcVar = vrcVar.m;
        rbv rbvVar3 = rbvVar2;
        YbButtonViewGroup.b bVar3 = bVar2;
        int i5 = vrcVar.n;
        int i6 = vrcVar.o;
        ColorModel colorModel4 = vrcVar.p;
        List list2 = vrcVar.q;
        ImageView.ScaleType scaleType = vrcVar.r;
        int i7 = vrcVar.s;
        if ((i3 & 1048576) != 0) {
            i4 = i7;
            z4 = vrcVar.t;
        } else {
            i4 = i7;
            z4 = z;
        }
        boolean z7 = (i3 & 2097152) != 0 ? vrcVar.u : z2;
        int i8 = (i3 & SelfTester_JCP.ENCRYPT_CBC) != 0 ? vrcVar.v : i;
        int i9 = (i3 & SelfTester_JCP.ENCRYPT_CNT) != 0 ? vrcVar.w : i2;
        Float f = vrcVar.x;
        ImageScaleTypeEntity imageScaleTypeEntity = vrcVar.y;
        String str = vrcVar.z;
        VideoPlayer$RepeatMode videoPlayer$RepeatMode2 = vrcVar.A;
        if ((i3 & SelfTester_JCP.IMITA) != 0) {
            videoPlayer$RepeatMode = videoPlayer$RepeatMode2;
            z5 = vrcVar.B;
        } else {
            videoPlayer$RepeatMode = videoPlayer$RepeatMode2;
            z5 = true;
        }
        boolean z8 = z5;
        zrc zrcVar2 = (i3 & 536870912) != 0 ? vrcVar.C : zrcVar;
        Integer num3 = vrcVar.D;
        if ((i3 & Integer.MIN_VALUE) != 0) {
            num = num3;
            z6 = vrcVar.E;
        } else {
            num = num3;
            z6 = z3;
        }
        return new vrc(communicationFullScreenView$State$Type, text3, colorModel, designTextStyle, text4, colorModel2, designTextStyle2, num2, colorModel3, rbvVar3, list, bVar3, urcVar, i5, i6, colorModel4, list2, scaleType, i4, z4, z7, i8, i9, f, imageScaleTypeEntity, str, videoPlayer$RepeatMode, z8, zrcVar2, num, z6, vrcVar.F, vrcVar.G);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrc)) {
            return false;
        }
        vrc vrcVar = (vrc) obj;
        return this.a == vrcVar.a && jl40.l(this.b, vrcVar.b) && jl40.l(this.c, vrcVar.c) && this.d == vrcVar.d && jl40.l(this.e, vrcVar.e) && jl40.l(this.f, vrcVar.f) && this.g == vrcVar.g && jl40.l(this.h, vrcVar.h) && jl40.l(this.i, vrcVar.i) && jl40.l(this.j, vrcVar.j) && jl40.l(this.k, vrcVar.k) && jl40.l(this.l, vrcVar.l) && jl40.l(this.m, vrcVar.m) && this.n == vrcVar.n && this.o == vrcVar.o && jl40.l(this.p, vrcVar.p) && jl40.l(this.q, vrcVar.q) && this.r == vrcVar.r && this.s == vrcVar.s && this.t == vrcVar.t && this.u == vrcVar.u && this.v == vrcVar.v && this.w == vrcVar.w && jl40.l(this.x, vrcVar.x) && this.y == vrcVar.y && jl40.l(this.z, vrcVar.z) && this.A == vrcVar.A && this.B == vrcVar.B && jl40.l(this.C, vrcVar.C) && jl40.l(this.D, vrcVar.D) && this.E == vrcVar.E && jl40.l(this.F, vrcVar.F) && jl40.l(this.G, vrcVar.G);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Text text = this.b;
        int hashCode2 = (hashCode + (text == null ? 0 : text.hashCode())) * 31;
        ColorModel colorModel = this.c;
        int hashCode3 = (hashCode2 + (colorModel == null ? 0 : colorModel.hashCode())) * 31;
        DesignTextStyle designTextStyle = this.d;
        int hashCode4 = (hashCode3 + (designTextStyle == null ? 0 : designTextStyle.hashCode())) * 31;
        Text text2 = this.e;
        int hashCode5 = (hashCode4 + (text2 == null ? 0 : text2.hashCode())) * 31;
        ColorModel colorModel2 = this.f;
        int hashCode6 = (hashCode5 + (colorModel2 == null ? 0 : colorModel2.hashCode())) * 31;
        DesignTextStyle designTextStyle2 = this.g;
        int hashCode7 = (hashCode6 + (designTextStyle2 == null ? 0 : designTextStyle2.hashCode())) * 31;
        Integer num = this.h;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        ColorModel colorModel3 = this.i;
        int hashCode9 = (hashCode8 + (colorModel3 == null ? 0 : colorModel3.hashCode())) * 31;
        rbv rbvVar = this.j;
        int hashCode10 = (hashCode9 + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31;
        List list = this.k;
        int hashCode11 = (hashCode10 + (list == null ? 0 : list.hashCode())) * 961;
        YbButtonViewGroup.b bVar = this.l;
        int hashCode12 = (hashCode11 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        urc urcVar = this.m;
        int b = oyr.b(this.o, oyr.b(this.n, (hashCode12 + (urcVar == null ? 0 : urcVar.hashCode())) * 31, 31), 31);
        ColorModel colorModel4 = this.p;
        int hashCode13 = (b + (colorModel4 == null ? 0 : colorModel4.hashCode())) * 31;
        List list2 = this.q;
        int hashCode14 = (hashCode13 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ImageView.ScaleType scaleType = this.r;
        int b2 = oyr.b(this.w, oyr.b(this.v, unr0.e(unr0.e(oyr.b(this.s, (hashCode14 + (scaleType == null ? 0 : scaleType.hashCode())) * 31, 31), 31, this.t), 31, this.u), 31), 31);
        Float f = this.x;
        int hashCode15 = (this.y.hashCode() + ((b2 + (f == null ? 0 : f.hashCode())) * 31)) * 31;
        String str = this.z;
        int hashCode16 = (hashCode15 + (str == null ? 0 : str.hashCode())) * 31;
        VideoPlayer$RepeatMode videoPlayer$RepeatMode = this.A;
        int hashCode17 = (this.C.hashCode() + unr0.e((hashCode16 + (videoPlayer$RepeatMode == null ? 0 : videoPlayer$RepeatMode.hashCode())) * 31, 31, this.B)) * 31;
        Integer num2 = this.D;
        int e = unr0.e((hashCode17 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.E);
        trc trcVar = this.F;
        int hashCode18 = (e + (trcVar == null ? 0 : trcVar.hashCode())) * 31;
        p60 p60Var = this.G;
        return hashCode18 + (p60Var != null ? p60Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(type=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", titleColor=");
        sb.append(this.c);
        sb.append(", titleStyle=");
        sb.append(this.d);
        sb.append(", subtitle=");
        sb.append(this.e);
        sb.append(", subtitleColor=");
        sb.append(this.f);
        sb.append(", subtitleStyle=");
        sb.append(this.g);
        sb.append(", backgroundColor=");
        sb.append(this.h);
        sb.append(", imageBackground=");
        sb.append(this.i);
        sb.append(", image=");
        sb.append(this.j);
        sb.append(", infoList=");
        sb.append(this.k);
        sb.append(", onLinkClickListener=null, ybButtonViewGroupState=");
        sb.append(this.l);
        sb.append(", imagePaddings=");
        sb.append(this.m);
        sb.append(", titleLayoutGravity=");
        sb.append(this.n);
        sb.append(", subtitleGravity=");
        sb.append(this.o);
        sb.append(", backgroundColorView=");
        sb.append(this.p);
        sb.append(", gradientBackgroundColors=");
        sb.append(this.q);
        sb.append(", imageScaleType=");
        sb.append(this.r);
        sb.append(", titlePaddingTopDp=");
        tse0.z(sb, this.s, ", isScrollable=", this.t, ", isCommunicationViewPaddingBottom=");
        sb.append(this.u);
        sb.append(", buttonGroupPaddingBottomPx=");
        sb.append(this.v);
        sb.append(", infoViewPaddingTopPx=");
        sb.append(this.w);
        sb.append(", guidelinePercent=");
        sb.append(this.x);
        sb.append(", imageScaleTypeEntity=");
        sb.append(this.y);
        sb.append(", videoUri=");
        sb.append(this.z);
        sb.append(", repeatMode=");
        sb.append(this.A);
        sb.append(", playWhenReady=");
        sb.append(this.B);
        sb.append(", loadingState=");
        sb.append(this.C);
        sb.append(", imageViewSizeHeight=");
        sb.append(this.D);
        sb.append(", isFocused=");
        sb.append(this.E);
        sb.append(", customInsets=");
        sb.append(this.F);
        sb.append(", adLabelState=");
        sb.append(this.G);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public vrc(CommunicationFullScreenView$State$Type communicationFullScreenView$State$Type, Text text, ColorModel colorModel, DesignTextStyle designTextStyle, Text text2, ColorModel colorModel2, DesignTextStyle designTextStyle2, Integer num, ColorModel colorModel3, rbv rbvVar, List list, YbButtonViewGroup.b bVar, urc urcVar, int i, int i2, ColorModel colorModel4, List list2, ImageView.ScaleType scaleType, int i3, boolean z, boolean z2, int i4, int i5, Float f, ImageScaleTypeEntity imageScaleTypeEntity, String str, VideoPlayer$RepeatMode videoPlayer$RepeatMode, boolean z3, zrc zrcVar, Integer num2, boolean z4, trc trcVar, p60 p60Var) {
        this.a = communicationFullScreenView$State$Type;
        this.b = text;
        this.c = colorModel;
        this.d = designTextStyle;
        this.e = text2;
        this.f = colorModel2;
        this.g = designTextStyle2;
        this.h = num;
        this.i = colorModel3;
        this.j = rbvVar;
        this.k = list;
        this.l = bVar;
        this.m = urcVar;
        this.n = i;
        this.o = i2;
        this.p = colorModel4;
        this.q = list2;
        this.r = scaleType;
        this.s = i3;
        this.t = z;
        this.u = z2;
        this.v = i4;
        this.w = i5;
        this.x = f;
        this.y = imageScaleTypeEntity;
        this.z = str;
        this.A = videoPlayer$RepeatMode;
        this.B = z3;
        this.C = zrcVar;
        this.D = num2;
        this.E = z4;
        this.F = trcVar;
        this.G = p60Var;
    }
}
