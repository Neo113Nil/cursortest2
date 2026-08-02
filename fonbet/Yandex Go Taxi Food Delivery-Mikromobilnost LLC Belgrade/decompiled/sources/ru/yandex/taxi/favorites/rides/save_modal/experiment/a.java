package ru.yandex.taxi.favorites.rides.save_modal.experiment;

import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
import defpackage.ny61;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.favorites.rides.save_modal.experiment.SaveFavoriteRideModalExperiment;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements uxs {
    public static final a a;
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.favorites.rides.save_modal.experiment.SaveFavoriteRideModalExperiment.Modal", aVar, 12);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("title_tk", true);
        pluginGeneratedSerialDescriptor.j("subtitle_tk", true);
        pluginGeneratedSerialDescriptor.j("button_tk", true);
        pluginGeneratedSerialDescriptor.j("button_loading_tk", true);
        pluginGeneratedSerialDescriptor.j("ride_name_input_hint_tk", true);
        pluginGeneratedSerialDescriptor.j("source_point_title_tk", true);
        pluginGeneratedSerialDescriptor.j("mid_point_title_tk", true);
        pluginGeneratedSerialDescriptor.j("mid_point_icon_tag", true);
        pluginGeneratedSerialDescriptor.j("destination_point_title_tk", true);
        pluginGeneratedSerialDescriptor.j("ride_details_title_tk", true);
        pluginGeneratedSerialDescriptor.j("notification_after_save", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{SaveFavoriteRideModalExperiment.Modal.m[0].getValue(), auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, d.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = SaveFavoriteRideModalExperiment.Modal.m;
        b.getClass();
        Object obj = null;
        boolean z = true;
        SaveFavoriteRideModalExperiment.a aVar = null;
        SaveFavoriteRideModalExperiment.Modal.ModalType modalType = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        int i = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    modalType = (SaveFavoriteRideModalExperiment.Modal.ModalType) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), modalType);
                    i |= 1;
                    break;
                case 1:
                    str = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str2 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str3 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str4 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str5 = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str6 = b.k(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    str7 = b.k(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    str8 = b.k(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    str9 = b.k(serialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    str10 = b.k(serialDescriptor, 10);
                    i |= 1024;
                    break;
                case 11:
                    aVar = (SaveFavoriteRideModalExperiment.a) b.A(serialDescriptor, 11, d.a, aVar);
                    i |= 2048;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new SaveFavoriteRideModalExperiment.Modal(i, modalType, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, aVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0110, code lost:
    
        if (defpackage.jl40.l(r0, ru.yandex.taxi.favorites.rides.save_modal.experiment.SaveFavoriteRideModalExperiment.a.c) == false) goto L73;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        SaveFavoriteRideModalExperiment.Modal modal = (SaveFavoriteRideModalExperiment.Modal) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = SaveFavoriteRideModalExperiment.Modal.m;
        if (b.F() || modal.a != SaveFavoriteRideModalExperiment.Modal.ModalType.SAVE) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), modal.a);
        }
        if (b.F() || !jl40.l(modal.b, "")) {
            b.o(serialDescriptor, 1, modal.b);
        }
        if (b.F() || !jl40.l(modal.c, "")) {
            b.o(serialDescriptor, 2, modal.c);
        }
        if (b.F() || !jl40.l(modal.d, "")) {
            b.o(serialDescriptor, 3, modal.d);
        }
        if (b.F() || !jl40.l(modal.e, "")) {
            b.o(serialDescriptor, 4, modal.e);
        }
        if (b.F() || !jl40.l(modal.f, "")) {
            b.o(serialDescriptor, 5, modal.f);
        }
        if (b.F() || !jl40.l(modal.g, "")) {
            b.o(serialDescriptor, 6, modal.g);
        }
        if (b.F() || !jl40.l(modal.h, "")) {
            b.o(serialDescriptor, 7, modal.h);
        }
        if (b.F() || !jl40.l(modal.i, "")) {
            b.o(serialDescriptor, 8, modal.i);
        }
        if (b.F() || !jl40.l(modal.j, "")) {
            b.o(serialDescriptor, 9, modal.j);
        }
        if (b.F() || !jl40.l(modal.k, "")) {
            b.o(serialDescriptor, 10, modal.k);
        }
        if (!b.F()) {
            SaveFavoriteRideModalExperiment.a aVar = modal.l;
            SaveFavoriteRideModalExperiment.a.Companion.getClass();
        }
        b.e(serialDescriptor, 11, d.a, modal.l);
        b.c(serialDescriptor);
    }
}
