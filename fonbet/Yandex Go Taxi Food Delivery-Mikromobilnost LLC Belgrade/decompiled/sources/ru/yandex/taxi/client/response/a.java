package ru.yandex.taxi.client.response;

import defpackage.auu0;
import defpackage.cdx;
import defpackage.i3y;
import defpackage.myi;
import defpackage.ny61;
import defpackage.pnz;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import java.util.Arrays;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.client.response.LaunchAcceptance;

/* loaded from: classes9.dex */
public final /* synthetic */ class a implements uxs {
    public static final a a;
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.client.response.LaunchAcceptance", aVar, 12);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("content", true);
        pluginGeneratedSerialDescriptor.j("accept_button", true);
        final String[] strArr = {"accept_button_title"};
        pluginGeneratedSerialDescriptor.k(new cdx() { // from class: jux
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return cdx.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return (obj instanceof cdx) && Arrays.equals(strArr, ((cdx) obj).names());
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return Arrays.hashCode(strArr) ^ 397397176;
            }

            @Override // defpackage.cdx
            public final /* synthetic */ String[] names() {
                return strArr;
            }

            @Override // java.lang.annotation.Annotation
            public final String toString() {
                return oyr.p("@kotlinx.serialization.json.JsonNames(names=", Arrays.toString(strArr), Extension.C_BRAKE);
            }
        });
        pluginGeneratedSerialDescriptor.j("cancel_button", true);
        final String[] strArr2 = {"cancel_button_title"};
        pluginGeneratedSerialDescriptor.k(new cdx() { // from class: jux
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return cdx.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return (obj instanceof cdx) && Arrays.equals(strArr2, ((cdx) obj).names());
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return Arrays.hashCode(strArr2) ^ 397397176;
            }

            @Override // defpackage.cdx
            public final /* synthetic */ String[] names() {
                return strArr2;
            }

            @Override // java.lang.annotation.Annotation
            public final String toString() {
                return oyr.p("@kotlinx.serialization.json.JsonNames(names=", Arrays.toString(strArr2), Extension.C_BRAKE);
            }
        });
        pluginGeneratedSerialDescriptor.j("header_image_tag", true);
        pluginGeneratedSerialDescriptor.j("ttl", true);
        pluginGeneratedSerialDescriptor.j("show_on_demand", true);
        pluginGeneratedSerialDescriptor.j("webview_url", true);
        pluginGeneratedSerialDescriptor.j("close_button_enabled", true);
        pluginGeneratedSerialDescriptor.j("back_button_enabled", true);
        pluginGeneratedSerialDescriptor.j("style", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = LaunchAcceptance.m;
        auu0 auu0Var = auu0.a;
        z96 z96Var = z96.a;
        return new KSerializer[]{auu0Var, qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), pnz.a, z96Var, qke.n(auu0Var), z96Var, z96Var, i3yVarArr[11].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = LaunchAcceptance.m;
        b.getClass();
        Object obj = null;
        LaunchAcceptance.IconStyle iconStyle = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        long j = 0;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = true;
        String str7 = null;
        while (z4) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z4 = false;
                    continue;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) b.s(serialDescriptor, 3, auu0.a, str4);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) b.s(serialDescriptor, 4, auu0.a, str5);
                    i |= 16;
                    break;
                case 5:
                    str6 = (String) b.s(serialDescriptor, 5, auu0.a, str6);
                    i |= 32;
                    break;
                case 6:
                    j = b.f(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    z = b.C(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    str7 = (String) b.s(serialDescriptor, 8, auu0.a, str7);
                    i |= 256;
                    break;
                case 9:
                    z2 = b.C(serialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    z3 = b.C(serialDescriptor, 10);
                    i |= 1024;
                    break;
                case 11:
                    iconStyle = (LaunchAcceptance.IconStyle) b.A(serialDescriptor, 11, (myi) i3yVarArr[11].getValue(), iconStyle);
                    i |= 2048;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new LaunchAcceptance(i, str, str2, str3, str4, str5, str6, j, z, str7, z2, z3, iconStyle);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        LaunchAcceptance.n((LaunchAcceptance) obj, b, serialDescriptor);
        b.c(serialDescriptor);
    }
}
