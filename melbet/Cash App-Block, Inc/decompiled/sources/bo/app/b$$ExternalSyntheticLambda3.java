package bo.app;

import androidx.compose.runtime.StaticProvidableCompositionLocal;
import app.cash.local.views.wallet.WalletWidgetKt;
import app.cash.redwood.protocol.Change;
import app.cash.redwood.protocol.ModifierElementSerializer;
import app.cash.redwood.ui.LayoutDirection;
import app.cash.zipline.ZiplineManifest$Module$$serializer;
import app.cash.zipline.internal.bridge.SerializableZiplineFunction$$serializer;
import java.lang.annotation.Annotation;
import java.math.BigInteger;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElementSerializer;

/* loaded from: classes3.dex */
public final /* synthetic */ class b$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ b$$ExternalSyntheticLambda3(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return b.b();
            case 1:
                return Unit.INSTANCE;
            case 2:
                return Unit.INSTANCE;
            case 3:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = WalletWidgetKt.LocalWalletWidgetBorderVisible;
                return Boolean.TRUE;
            case 4:
                return Unit.INSTANCE;
            case 5:
                return new HashSetSerializer(JsonElementSerializer.INSTANCE, 1);
            case 6:
                return new HashSetSerializer(ModifierElementSerializer.INSTANCE, 1);
            case 7:
                return new HashSetSerializer(Change.Companion.serializer(), 1);
            case 8:
                return new PolymorphicSerializer(Reflection.factory.getOrCreateKotlinClass(Object.class), new Annotation[0]);
            case 9:
                return new HashMapSerializer(StringSerializer.INSTANCE, new HashSetSerializer(BuiltinSerializersKt.getNullable(new PolymorphicSerializer(Reflection.factory.getOrCreateKotlinClass(Object.class), new Annotation[0])), 1), 1);
            case 10:
                LayoutDirection[] values = LayoutDirection.values();
                values.getClass();
                return new EnumSerializer("app.cash.redwood.ui.LayoutDirection", (Enum[]) values);
            case 11:
                return Unit.INSTANCE;
            case 12:
                return new HashMapSerializer(StringSerializer.INSTANCE, ZiplineManifest$Module$$serializer.INSTANCE, 1);
            case 13:
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                return new HashMapSerializer(stringSerializer, stringSerializer, 1);
            case 14:
                return new HashSetSerializer(StringSerializer.INSTANCE, 1);
            case 15:
                StringSerializer stringSerializer2 = StringSerializer.INSTANCE;
                return new HashMapSerializer(stringSerializer2, stringSerializer2, 1);
            case 16:
                return new HashSetSerializer(SerializableZiplineFunction$$serializer.INSTANCE, 1);
            case 17:
                return new HashSetSerializer(StringSerializer.INSTANCE, 1);
            case 18:
                return new ECParameterSpec(new EllipticCurve(new ECFieldFp(new BigInteger("ffffffff00000001000000000000000000000000ffffffffffffffffffffffff", 16)), new BigInteger("ffffffff00000001000000000000000000000000fffffffffffffffffffffffc", 16), new BigInteger("5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", 16)), new ECPoint(new BigInteger("6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", 16), new BigInteger("4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5", 16)), new BigInteger("ffffffff00000000ffffffffffffffffbce6faada7179e84f3b9cac2fc632551", 16), 1);
            case 19:
                return a0.c(null);
            case 20:
                return ae.l();
            case 21:
                return b6.a();
            case 22:
                return ba.a();
            case 23:
                return c2.c();
            case 24:
                return c2.g();
            case 25:
                return c2.a();
            case 26:
                return c2.b();
            case 27:
                return c5.g();
            case 28:
                return c5.i();
            default:
                return c5.a();
        }
    }
}
