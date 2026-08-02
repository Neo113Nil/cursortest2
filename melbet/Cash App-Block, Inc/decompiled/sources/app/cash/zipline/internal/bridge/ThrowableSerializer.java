package app.cash.zipline.internal.bridge;

import app.cash.zipline.ZiplineApiMismatchException;
import bo.app.yf$$ExternalSyntheticLambda10;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes3.dex */
public final class ThrowableSerializer implements KSerializer {
    public static final ThrowableSerializer INSTANCE = new ThrowableSerializer();
    public static final SerialDescriptor descriptor;
    public static final KSerializer surrogateSerializer;

    static {
        KSerializer serializer = ThrowableSurrogate.Companion.serializer();
        surrogateSerializer = serializer;
        descriptor = serializer.getDescriptor();
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Pair pair;
        ThrowableSurrogate throwableSurrogate = (ThrowableSurrogate) decoder.decodeSerializableValue$1(surrogateSerializer);
        if (throwableSurrogate.types.contains("CancellationException")) {
            return ThrowablesKt.theOnlyCancellationException;
        }
        Iterator it = throwableSurrogate.types.iterator();
        do {
            pair = null;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            ThrowableSerializer$knownTypeConstructor$1 throwableSerializer$knownTypeConstructor$1 = Intrinsics.areEqual(str, "ZiplineApiMismatchException") ? ThrowableSerializer$knownTypeConstructor$1.INSTANCE : null;
            if (throwableSerializer$knownTypeConstructor$1 != null) {
                pair = new Pair(str, throwableSerializer$knownTypeConstructor$1);
            }
        } while (pair == null);
        if (pair == null) {
            pair = new Pair("ZiplineException", new yf$$ExternalSyntheticLambda10(13));
        }
        String str2 = (String) pair.first;
        Function1 function1 = (Function1) pair.second;
        String str3 = throwableSurrogate.stacktraceString;
        if (StringsKt__StringsJVMKt.startsWith(str3, str2, false) && StringsKt__StringsJVMKt.regionMatches(str2.length(), 0, 2, str3, ": ", false)) {
            str3 = str3.substring(str2.length() + 2);
        }
        function1.getClass();
        Throwable th = (Throwable) function1.invoke(StringsKt.trim(new Regex("\n+").replace(new Regex("\n[ ]+at ").replace(str3, "\n\tat "), "\n")).toString());
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        do {
            length--;
            if (-1 >= length) {
                return th;
            }
        } while (!Intrinsics.areEqual(stackTrace[length].getClassName(), Reflection.factory.getOrCreateKotlinClass(OutboundCallHandler.class).getQualifiedName()));
        IntRange until = RangesKt___RangesKt.until(length + 1, stackTrace.length);
        until.getClass();
        th.setStackTrace((StackTraceElement[]) (until.isEmpty() ? ArraysKt___ArraysJvmKt.copyOfRange(0, 0, stackTrace) : ArraysKt___ArraysJvmKt.copyOfRange(until.first, until.last + 1, stackTrace)));
        return th;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Throwable th = (Throwable) obj;
        th.getClass();
        boolean z = th instanceof CancellationException;
        KSerializer kSerializer = surrogateSerializer;
        if (z) {
            encoder.encodeSerializableValue(kSerializer, new ThrowableSurrogate(CollectionsKt__CollectionsJVMKt.listOf("CancellationException"), ""));
            return;
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        stackTrace.getClass();
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            String className = stackTrace[i].getClassName();
            className.getClass();
            String qualifiedName = Reflection.factory.getOrCreateKotlinClass(Endpoint.class).getQualifiedName();
            qualifiedName.getClass();
            if (StringsKt__StringsJVMKt.startsWith(className, qualifiedName, false)) {
                StackTraceElement[] stackTrace2 = th.getStackTrace();
                stackTrace2.getClass();
                IntRange until = RangesKt___RangesKt.until(0, i);
                until.getClass();
                th.setStackTrace((StackTraceElement[]) (until.isEmpty() ? ArraysKt___ArraysJvmKt.copyOfRange(0, 0, stackTrace2) : ArraysKt___ArraysJvmKt.copyOfRange(until.first, until.last + 1, stackTrace2)));
            } else {
                i++;
            }
        }
        encoder.encodeSerializableValue(kSerializer, new ThrowableSurrogate(th instanceof ZiplineApiMismatchException ? CollectionsKt__CollectionsJVMKt.listOf("ZiplineApiMismatchException") : EmptyList.INSTANCE, StringsKt.trim(ExceptionsKt__ExceptionsKt.stackTraceToString(th)).toString()));
    }
}
