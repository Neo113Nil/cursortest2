package defpackage;

import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import flex.feature.divkit.scaffold.DivKitScaffoldPadding;
import flex.feature.divkit.scaffold.ScaffoldAnimations;
import flex.section.divkit.DivkitSnippet;
import flex.theme.ThemedColor;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class uul implements uxs {
    public static final uul a;
    private static final SerialDescriptor descriptor;

    static {
        uul uulVar = new uul();
        a = uulVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.feature.divkit.scaffold.DivkitScaffold", uulVar, 9);
        pluginGeneratedSerialDescriptor.j("topView", true);
        pluginGeneratedSerialDescriptor.j("topPadding", false);
        pluginGeneratedSerialDescriptor.j("bottomView", true);
        pluginGeneratedSerialDescriptor.j("bottomPadding", false);
        pluginGeneratedSerialDescriptor.j("overlayView", true);
        pluginGeneratedSerialDescriptor.j(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, true);
        pluginGeneratedSerialDescriptor.j("animations", true);
        pluginGeneratedSerialDescriptor.j("backgroundView", true);
        pluginGeneratedSerialDescriptor.j("landscapeSettings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = wul.j;
        KSerializer n = qke.n((KSerializer) i3yVarArr[0].getValue());
        ayk aykVar = ayk.a;
        return new KSerializer[]{n, qke.n(aykVar), qke.n((KSerializer) i3yVarArr[2].getValue()), qke.n(aykVar), qke.n((KSerializer) i3yVarArr[4].getValue()), qke.n((KSerializer) i3yVarArr[5].getValue()), qke.n(njm0.a), qke.n((KSerializer) i3yVarArr[7].getValue()), qke.n(frx.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = wul.j;
        b.getClass();
        hrx hrxVar = null;
        boolean z = true;
        DivkitSnippet divkitSnippet = null;
        int i = 0;
        DivkitSnippet divkitSnippet2 = null;
        DivKitScaffoldPadding divKitScaffoldPadding = null;
        DivkitSnippet divkitSnippet3 = null;
        DivKitScaffoldPadding divKitScaffoldPadding2 = null;
        DivkitSnippet divkitSnippet4 = null;
        ThemedColor themedColor = null;
        ScaffoldAnimations scaffoldAnimations = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    divkitSnippet2 = (DivkitSnippet) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), divkitSnippet2);
                    i |= 1;
                    break;
                case 1:
                    divKitScaffoldPadding = (DivKitScaffoldPadding) b.s(serialDescriptor, 1, ayk.a, divKitScaffoldPadding);
                    i |= 2;
                    break;
                case 2:
                    divkitSnippet3 = (DivkitSnippet) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), divkitSnippet3);
                    i |= 4;
                    break;
                case 3:
                    divKitScaffoldPadding2 = (DivKitScaffoldPadding) b.s(serialDescriptor, 3, ayk.a, divKitScaffoldPadding2);
                    i |= 8;
                    break;
                case 4:
                    divkitSnippet4 = (DivkitSnippet) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), divkitSnippet4);
                    i |= 16;
                    break;
                case 5:
                    themedColor = (ThemedColor) b.s(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), themedColor);
                    i |= 32;
                    break;
                case 6:
                    scaffoldAnimations = (ScaffoldAnimations) b.s(serialDescriptor, 6, njm0.a, scaffoldAnimations);
                    i |= 64;
                    break;
                case 7:
                    divkitSnippet = (DivkitSnippet) b.s(serialDescriptor, 7, (myi) i3yVarArr[7].getValue(), divkitSnippet);
                    i |= 128;
                    break;
                case 8:
                    hrxVar = (hrx) b.s(serialDescriptor, 8, frx.a, hrxVar);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new wul(i, divkitSnippet2, divKitScaffoldPadding, divkitSnippet3, divKitScaffoldPadding2, divkitSnippet4, themedColor, scaffoldAnimations, divkitSnippet, hrxVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        wul wulVar = (wul) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = wul.j;
        if (b.F() || wulVar.a != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), wulVar.a);
        }
        ayk aykVar = ayk.a;
        DivKitScaffoldPadding divKitScaffoldPadding = wulVar.b;
        hrx hrxVar = wulVar.i;
        DivkitSnippet divkitSnippet = wulVar.h;
        ScaffoldAnimations scaffoldAnimations = wulVar.g;
        ThemedColor themedColor = wulVar.f;
        DivkitSnippet divkitSnippet2 = wulVar.e;
        DivkitSnippet divkitSnippet3 = wulVar.c;
        b.g(serialDescriptor, 1, aykVar, divKitScaffoldPadding);
        if (b.F() || divkitSnippet3 != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), divkitSnippet3);
        }
        b.g(serialDescriptor, 3, aykVar, wulVar.d);
        if (b.F() || divkitSnippet2 != null) {
            b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), divkitSnippet2);
        }
        if (b.F() || themedColor != null) {
            b.g(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), themedColor);
        }
        if (b.F() || scaffoldAnimations != null) {
            b.g(serialDescriptor, 6, njm0.a, scaffoldAnimations);
        }
        if (b.F() || divkitSnippet != null) {
            b.g(serialDescriptor, 7, (KSerializer) i3yVarArr[7].getValue(), divkitSnippet);
        }
        if (b.F() || hrxVar != null) {
            b.g(serialDescriptor, 8, frx.a, hrxVar);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
