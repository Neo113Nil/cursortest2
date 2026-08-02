package ru.yandex.taxi.favorites.experiment;

import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
import defpackage.ny61;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.w7s;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.favorites.experiment.FavoritesCreateRegularAddressExperiment;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements uxs {
    public static final a a;
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.favorites.experiment.FavoritesCreateRegularAddressExperiment.Button", aVar, 3);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = FavoritesCreateRegularAddressExperiment.a.d;
        return new KSerializer[]{w7s.a, i3yVarArr[1].getValue(), i3yVarArr[2].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = FavoritesCreateRegularAddressExperiment.a.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        FormattedText formattedText = null;
        FavoritesCreateRegularAddressExperiment.ButtonType buttonType = null;
        FavoritesCreateRegularAddressExperiment.ButtonAction buttonAction = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                formattedText = (FormattedText) b.A(serialDescriptor, 0, w7s.a, formattedText);
                i |= 1;
            } else if (v == 1) {
                buttonType = (FavoritesCreateRegularAddressExperiment.ButtonType) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), buttonType);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                buttonAction = (FavoritesCreateRegularAddressExperiment.ButtonAction) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), buttonAction);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new FavoritesCreateRegularAddressExperiment.a(i, formattedText, buttonType, buttonAction);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        FavoritesCreateRegularAddressExperiment.a aVar = (FavoritesCreateRegularAddressExperiment.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = FavoritesCreateRegularAddressExperiment.a.d;
        if (b.F() || !jl40.l(aVar.a, FormattedText.c)) {
            b.e(serialDescriptor, 0, w7s.a, aVar.a);
        }
        if (b.F() || aVar.b != FavoritesCreateRegularAddressExperiment.ButtonType.DEFAULT) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), aVar.b);
        }
        if (b.F() || aVar.c != FavoritesCreateRegularAddressExperiment.ButtonAction.UNKNOWN) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), aVar.c);
        }
        b.c(serialDescriptor);
    }
}
