package defpackage;

import android.content.Context;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.yandex.music.shared.dto.track.TrackDto$TrackDtoTypeAdapter$Companion$factory$1;
import com.yandex.music.shared.dto.videoclip.VideoClipDto;
import com.yandex.pulse.metrics.o;
import defpackage.m9u;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final /* synthetic */ class d4u implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ d4u(bhn bhnVar) {
        this.a = 11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                bdt I = hag.I(z66.class);
                qdc qdcVar = l13Var.a;
                Set set = l13Var.b;
                return new nc5((z66) qdcVar.D(I, l13Var, set), (ezb) qdcVar.D(hag.I(ezb.class), l13Var, set), (t3g) qdcVar.D(hag.I(t3g.class), l13Var, set));
            case 1:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                return new p6u((oq7) l13Var2.a.D(hag.I(oq7.class), l13Var2, l13Var2.b));
            case 2:
                ((l13) obj).getClass();
                return new g4u();
            case 3:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                bdt I2 = hag.I(vyk.class);
                qdc qdcVar2 = l13Var3.a;
                Set set2 = l13Var3.b;
                return new w5u((vyk) qdcVar2.D(I2, l13Var3, set2), (k1l) qdcVar2.D(hag.I(k1l.class), l13Var3, set2), (g4u) qdcVar2.D(hag.I(g4u.class), l13Var3, set2), (t3g) qdcVar2.D(hag.I(t3g.class), l13Var3, set2), (p6u) qdcVar2.D(hag.I(p6u.class), l13Var3, set2));
            case 4:
                ((l13) obj).getClass();
                return new u9u();
            case 5:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                return new e4u(l13Var4);
            case 6:
                ((l13) obj).getClass();
                return new h4u();
            case 7:
                ((l13) obj).getClass();
                return new s2u();
            case 8:
                opf opfVar = (opf) obj;
                opfVar.getClass();
                jpa.B(opfVar, c3x.h(4287221203L), 0L, 0L, 0.0f, null, 0, 126);
                return Unit.a;
            case 9:
                ((jfp) obj).getClass();
                return Unit.a;
            case 10:
                xxq xxqVar = (xxq) obj;
                xxqVar.getClass();
                return xxqVar.a;
            case 11:
                GsonBuilder gsonBuilder = (GsonBuilder) obj;
                gsonBuilder.getClass();
                gsonBuilder.e.add(new TrackDto$TrackDtoTypeAdapter$Companion$factory$1());
                gsonBuilder.b(n9u.class, new JsonDeserializer<n9u>() { // from class: com.yandex.music.shared.radio.data.network.rotor.dto.VideoClipSequenceItemDto$GsonDeserializer

                    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/music/shared/radio/data/network/rotor/dto/VideoClipSequenceItemDto$GsonDeserializer$RadioItemDto;", "", "Lcom/google/gson/JsonObject;", "data", "", "type", "<init>", "(Lcom/google/gson/JsonObject;Ljava/lang/String;)V", "Lcom/google/gson/JsonObject;", "a", "()Lcom/google/gson/JsonObject;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "shared-video-clips-queue"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
                    public static final class RadioItemDto {

                        @SerializedName("data")
                        private final JsonObject data;

                        @SerializedName("type")
                        private final String type;

                        public RadioItemDto(JsonObject jsonObject, String str) {
                            this.data = jsonObject;
                            this.type = str;
                        }

                        /* renamed from: a, reason: from getter */
                        public final JsonObject getData() {
                            return this.data;
                        }

                        /* renamed from: b, reason: from getter */
                        public final String getType() {
                            return this.type;
                        }
                    }

                    @Override // com.google.gson.JsonDeserializer
                    public final Object a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
                        String str;
                        jsonElement.getClass();
                        type.getClass();
                        jsonDeserializationContext.getClass();
                        RadioItemDto radioItemDto = (RadioItemDto) jsonDeserializationContext.a(jsonElement, RadioItemDto.class);
                        String type2 = radioItemDto.getType();
                        if (type2 != null) {
                            str = type2.toLowerCase(Locale.ROOT);
                            str.getClass();
                        } else {
                            str = null;
                        }
                        if (Intrinsics.d(str, "clip")) {
                            JsonObject data = radioItemDto.getData();
                            return new VideoClipSequenceItemDto$VideoClip(data != null ? (VideoClipDto) jsonDeserializationContext.a(data, VideoClipDto.class) : null);
                        }
                        if (str == null) {
                            str = "unknown";
                        }
                        return new m9u(str);
                    }
                });
                return Unit.a;
            case 12:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.w(jfpVar);
                return Unit.a;
            case 13:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.x(jfpVar2, 1.0f);
                return Unit.a;
            case 14:
                jfp jfpVar3 = (jfp) obj;
                jfpVar3.getClass();
                wfp.x(jfpVar3, 0.0f);
                return Unit.a;
            case 15:
                jfp jfpVar4 = (jfp) obj;
                jfpVar4.getClass();
                wfp.x(jfpVar4, 1.0f);
                return Unit.a;
            case 16:
                ((jfp) obj).getClass();
                return Unit.a;
            case 17:
                ((jfp) obj).getClass();
                return Unit.a;
            case 18:
                u51 u51Var = (u51) obj;
                u51Var.getClass();
                return u51Var.b;
            case 19:
                vz1.e((o18) obj, xau.class).E(new d4u(20));
                return Unit.a;
            case 20:
                ((l13) obj).getClass();
                return new xau();
            case 21:
                jfp jfpVar5 = (jfp) obj;
                jfpVar5.getClass();
                wfp.e(jfpVar5);
                return Unit.a;
            case 22:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, zju.class).E(new d4u(23));
                o18Var.b(hag.I(wju.class)).E(new d4u(24));
                o18Var.b(hag.I(bku.class)).E(new d4u(25));
                o18Var.b(hag.I(gka.class)).E(new d4u(26));
                o18Var.b(hag.I(uju.class)).E(new d4u(27));
                return Unit.a;
            case 23:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                return new zju(new kz3(l13Var5.b(hag.I(z66.class), true)));
            case 24:
                ((l13) obj).getClass();
                return new wju(new cvo(wjb.PassportVpnLockScreen, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60), new tiq(""));
            case 25:
                l13 l13Var6 = (l13) obj;
                l13Var6.getClass();
                hft hftVar = new hft(24);
                bdt I3 = hag.I(zju.class);
                qdc qdcVar3 = l13Var6.a;
                Set set3 = l13Var6.b;
                return new bku(hftVar, ((zju) qdcVar3.D(I3, l13Var6, set3)).c, (k1l) qdcVar3.D(hag.I(k1l.class), l13Var6, set3), new h4d(l13Var6, 12));
            case 26:
                l13 l13Var7 = (l13) obj;
                l13Var7.getClass();
                bdt I4 = hag.I(uaa.class);
                qdc qdcVar4 = l13Var7.a;
                Set set4 = l13Var7.b;
                return new gka((uaa) qdcVar4.D(I4, l13Var7, set4), (frt) qdcVar4.D(hag.I(frt.class), l13Var7, set4), (uju) qdcVar4.D(hag.I(uju.class), l13Var7, set4));
            case 27:
                l13 l13Var8 = (l13) obj;
                l13Var8.getClass();
                return new uju((Context) l13Var8.a.D(hag.I(Context.class), l13Var8, l13Var8.b));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((Integer) obj).intValue();
                return Unit.a;
            default:
                fht fhtVar = (fht) obj;
                fhtVar.getClass();
                return Boolean.valueOf(fhtVar instanceof fgt);
        }
    }

    public /* synthetic */ d4u(int i) {
        this.a = i;
    }
}
