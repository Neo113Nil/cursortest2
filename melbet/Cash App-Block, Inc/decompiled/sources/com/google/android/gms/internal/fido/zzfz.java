package com.google.android.gms.internal.fido;

import androidx.appcompat.widget.ActionBarContextView;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.recyclerview.widget.AdapterHelper;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_barcode.zzdk;
import com.google.android.libraries.places.internal.zzbor;
import com.google.android.libraries.places.internal.zzbqd;
import com.google.android.libraries.places.internal.zzcda;
import java.net.Inet4Address;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.DeepRecursiveKt;
import kotlin.DeepRecursiveScope;
import kotlin.DeepRecursiveScopeImpl;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1;
import kotlinx.serialization.json.internal.JsonTreeReader$readObject$2;
import kotlinx.serialization.json.internal.WriteModeKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class zzfz implements ViewPropertyAnimatorListener {
    public Object zza;
    public int zzb;
    public boolean zzc;

    public zzfz(MessageDigest messageDigest, int i) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.zza = messageDigest;
        this.zzb = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$readObject(zzfz zzfzVar, DeepRecursiveScope deepRecursiveScope, BaseContinuationImpl baseContinuationImpl) {
        JsonTreeReader$readObject$2 jsonTreeReader$readObject$2;
        int i;
        LinkedHashMap linkedHashMap;
        DeepRecursiveScope deepRecursiveScope2;
        byte b;
        AdapterHelper adapterHelper;
        zzfz zzfzVar2;
        AdapterHelper adapterHelper2 = (AdapterHelper) zzfzVar.zza;
        if (baseContinuationImpl instanceof JsonTreeReader$readObject$2) {
            jsonTreeReader$readObject$2 = (JsonTreeReader$readObject$2) baseContinuationImpl;
            int i2 = jsonTreeReader$readObject$2.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                jsonTreeReader$readObject$2.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = jsonTreeReader$readObject$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = jsonTreeReader$readObject$2.label;
                int i3 = 0;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    byte consumeNextToken = adapterHelper2.consumeNextToken((byte) 6);
                    if (adapterHelper2.peekNextToken() == 4) {
                        AdapterHelper.fail$default(adapterHelper2, "Unexpected leading comma", 0, null, 6);
                        throw null;
                    }
                    linkedHashMap = new LinkedHashMap();
                    deepRecursiveScope2 = deepRecursiveScope;
                    b = consumeNextToken;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = jsonTreeReader$readObject$2.I$0;
                    String str = jsonTreeReader$readObject$2.L$3;
                    linkedHashMap = jsonTreeReader$readObject$2.L$2;
                    zzfzVar2 = jsonTreeReader$readObject$2.L$1;
                    deepRecursiveScope2 = jsonTreeReader$readObject$2.L$0;
                    SafeTrace.throwOnFailure(obj);
                    linkedHashMap.put(str, (JsonElement) obj);
                    b = ((AdapterHelper) zzfzVar2.zza).consumeNextToken();
                    if (b != 4) {
                        if (b != 7) {
                            AdapterHelper.fail$default((AdapterHelper) zzfzVar2.zza, "Expected end of the object or comma", 0, null, 6);
                            throw null;
                        }
                        AdapterHelper adapterHelper3 = (AdapterHelper) zzfzVar2.zza;
                        if (b != 6) {
                            adapterHelper3.consumeNextToken((byte) 7);
                        } else if (b == 4) {
                            WriteModeKt.invalidTrailingComma(adapterHelper3, "object");
                            throw null;
                        }
                        return new JsonObject(linkedHashMap);
                    }
                    i3 = i4;
                    zzfzVar = zzfzVar2;
                }
                adapterHelper = (AdapterHelper) zzfzVar.zza;
                if (adapterHelper.canConsumeValue()) {
                    zzfzVar2 = zzfzVar;
                    AdapterHelper adapterHelper32 = (AdapterHelper) zzfzVar2.zza;
                    if (b != 6) {
                    }
                    return new JsonObject(linkedHashMap);
                }
                String consumeStringLenient = zzfzVar.zzc ? adapterHelper.consumeStringLenient() : adapterHelper.consumeString();
                adapterHelper.consumeNextToken((byte) 5);
                Unit unit = Unit.INSTANCE;
                jsonTreeReader$readObject$2.L$0 = deepRecursiveScope2;
                jsonTreeReader$readObject$2.L$1 = zzfzVar;
                jsonTreeReader$readObject$2.L$2 = linkedHashMap;
                jsonTreeReader$readObject$2.L$3 = consumeStringLenient;
                jsonTreeReader$readObject$2.I$0 = i3;
                jsonTreeReader$readObject$2.label = 1;
                DeepRecursiveScopeImpl deepRecursiveScopeImpl = (DeepRecursiveScopeImpl) deepRecursiveScope2;
                deepRecursiveScopeImpl.getClass();
                deepRecursiveScopeImpl.cont = jsonTreeReader$readObject$2;
                deepRecursiveScopeImpl.value = unit;
                return coroutineSingletons;
            }
        }
        jsonTreeReader$readObject$2 = new JsonTreeReader$readObject$2(zzfzVar, baseContinuationImpl);
        Object obj2 = jsonTreeReader$readObject$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = jsonTreeReader$readObject$2.label;
        int i32 = 0;
        if (i != 0) {
        }
        adapterHelper = (AdapterHelper) zzfzVar.zza;
        if (adapterHelper.canConsumeValue()) {
        }
    }

    public static final List zzj(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return arrayList2;
        }
        if (arrayList2.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + arrayList.size());
        for (int i = 0; i < Math.max(arrayList.size(), arrayList2.size()); i++) {
            if (i < arrayList.size()) {
                arrayList3.add((zzcda) arrayList.get(i));
            }
            if (i < arrayList2.size()) {
                arrayList3.add((zzcda) arrayList2.get(i));
            }
        }
        return arrayList3;
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListener
    public void onAnimationCancel() {
        this.zzc = true;
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListener
    public void onAnimationEnd() {
        if (this.zzc) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.zza;
        actionBarContextView.mVisibilityAnim = null;
        super/*android.view.View*/.setVisibility(this.zzb);
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListener
    public void onAnimationStart() {
        super/*android.view.View*/.setVisibility(0);
        this.zzc = false;
    }

    public JsonElement read() {
        JsonElement jsonObject;
        Object obj;
        Object invoke;
        AdapterHelper adapterHelper = (AdapterHelper) this.zza;
        byte peekNextToken = adapterHelper.peekNextToken();
        if (peekNextToken == 1) {
            return readValue(true);
        }
        if (peekNextToken == 0) {
            return readValue(false);
        }
        if (peekNextToken != 6) {
            if (peekNextToken == 8) {
                return readArray();
            }
            AdapterHelper.fail$default(adapterHelper, "Cannot read Json element because of unexpected ".concat(WriteModeKt.tokenDescription(peekNextToken)), 0, null, 6);
            throw null;
        }
        int i = this.zzb + 1;
        this.zzb = i;
        if (i == 200) {
            JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$1 = new JsonTreeReader$readDeepRecursive$1(this, null);
            Unit unit = Unit.INSTANCE;
            CoroutineSingletons coroutineSingletons = DeepRecursiveKt.UNDEFINED_RESULT;
            DeepRecursiveScopeImpl deepRecursiveScopeImpl = new DeepRecursiveScopeImpl(null);
            deepRecursiveScopeImpl.function = jsonTreeReader$readDeepRecursive$1;
            deepRecursiveScopeImpl.value = unit;
            deepRecursiveScopeImpl.cont = deepRecursiveScopeImpl;
            CoroutineSingletons coroutineSingletons2 = DeepRecursiveKt.UNDEFINED_RESULT;
            deepRecursiveScopeImpl.result = coroutineSingletons2;
            while (true) {
                obj = deepRecursiveScopeImpl.result;
                Continuation continuation = deepRecursiveScopeImpl.cont;
                if (continuation == null) {
                    break;
                }
                Result.Companion companion = Result.Companion;
                if (Intrinsics.areEqual(coroutineSingletons2, obj)) {
                    try {
                        JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$12 = deepRecursiveScopeImpl.function;
                        Unit unit2 = deepRecursiveScopeImpl.value;
                        if (jsonTreeReader$readDeepRecursive$12 == null) {
                            jsonTreeReader$readDeepRecursive$12.getClass();
                            CoroutineContext context = continuation.getContext();
                            Object intrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1 = context == EmptyCoroutineContext.INSTANCE ? new IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1(continuation) : new IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2(continuation, context);
                            TypeIntrinsics.beforeCheckcastToFunctionOfArity(3, jsonTreeReader$readDeepRecursive$12);
                            invoke = jsonTreeReader$readDeepRecursive$12.invoke(deepRecursiveScopeImpl, unit2, intrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1);
                        } else {
                            TypeIntrinsics.beforeCheckcastToFunctionOfArity(3, jsonTreeReader$readDeepRecursive$12);
                            invoke = jsonTreeReader$readDeepRecursive$12.invoke(deepRecursiveScopeImpl, unit2, continuation);
                        }
                        if (invoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            continuation.resumeWith(invoke);
                        }
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        continuation.resumeWith(new Result.Failure(th));
                    }
                } else {
                    deepRecursiveScopeImpl.result = coroutineSingletons2;
                    continuation.resumeWith(obj);
                }
            }
            SafeTrace.throwOnFailure(obj);
            jsonObject = (JsonElement) obj;
        } else {
            byte consumeNextToken = adapterHelper.consumeNextToken((byte) 6);
            if (adapterHelper.peekNextToken() == 4) {
                AdapterHelper.fail$default(adapterHelper, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!adapterHelper.canConsumeValue()) {
                    break;
                }
                String consumeStringLenient = this.zzc ? adapterHelper.consumeStringLenient() : adapterHelper.consumeString();
                adapterHelper.consumeNextToken((byte) 5);
                linkedHashMap.put(consumeStringLenient, read());
                consumeNextToken = adapterHelper.consumeNextToken();
                if (consumeNextToken != 4) {
                    if (consumeNextToken != 7) {
                        AdapterHelper.fail$default(adapterHelper, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                }
            }
            if (consumeNextToken == 6) {
                adapterHelper.consumeNextToken((byte) 7);
            } else if (consumeNextToken == 4) {
                WriteModeKt.invalidTrailingComma(adapterHelper, "object");
                throw null;
            }
            jsonObject = new JsonObject(linkedHashMap);
        }
        this.zzb--;
        return jsonObject;
    }

    public JsonArray readArray() {
        AdapterHelper adapterHelper = (AdapterHelper) this.zza;
        byte consumeNextToken = adapterHelper.consumeNextToken();
        if (adapterHelper.peekNextToken() == 4) {
            AdapterHelper.fail$default(adapterHelper, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (adapterHelper.canConsumeValue()) {
            arrayList.add(read());
            consumeNextToken = adapterHelper.consumeNextToken();
            if (consumeNextToken != 4) {
                boolean z = consumeNextToken == 9;
                int i = adapterHelper.mExistingUpdateTypes;
                if (!z) {
                    AdapterHelper.fail$default(adapterHelper, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (consumeNextToken == 8) {
            adapterHelper.consumeNextToken((byte) 9);
        } else if (consumeNextToken == 4) {
            WriteModeKt.invalidTrailingComma(adapterHelper, "array");
            throw null;
        }
        return new JsonArray(arrayList);
    }

    public JsonPrimitive readValue(boolean z) {
        AdapterHelper adapterHelper = (AdapterHelper) this.zza;
        String consumeStringLenient = (this.zzc || !z) ? adapterHelper.consumeStringLenient() : adapterHelper.consumeString();
        return (z || !Intrinsics.areEqual(consumeStringLenient, "null")) ? new JsonLiteral(consumeStringLenient, z, null) : JsonNull.INSTANCE;
    }

    public boolean zza() {
        return this.zzb < ((List) this.zza).size();
    }

    public void zza$com$google$android$gms$internal$mlkit_vision_barcode$zzcl(Object obj) {
        obj.getClass();
        zzd(this.zzb + 1);
        Object[] objArr = (Object[]) this.zza;
        int i = this.zzb;
        this.zzb = i + 1;
        objArr[i] = obj;
    }

    public boolean zzb() {
        if (!zza()) {
            return false;
        }
        this.zzb++;
        return zza();
    }

    public void zzd(int i) {
        Object[] objArr = (Object[]) this.zza;
        int length = objArr.length;
        if (length >= i) {
            if (this.zzc) {
                this.zza = (Object[]) objArr.clone();
                this.zzc = false;
                return;
            }
            return;
        }
        int i2 = length + (length >> 1) + 1;
        if (i2 < i) {
            int highestOneBit = Integer.highestOneBit(i - 1);
            i2 = highestOneBit + highestOneBit;
        }
        if (i2 < 0) {
            i2 = Integer.MAX_VALUE;
        }
        this.zza = Arrays.copyOf(objArr, i2);
        this.zzc = false;
    }

    public zzdk zzf() {
        this.zzc = true;
        Object[] objArr = (Object[]) this.zza;
        int i = this.zzb;
        com.google.android.gms.internal.mlkit_vision_barcode.zzcq zzcqVar = com.google.android.gms.internal.mlkit_vision_barcode.zzcs.zza;
        return i == 0 ? zzdk.zza : new zzdk(i, objArr);
    }

    public void zzg(List list) {
        List list2;
        Trace.checkNotNull(list, "newGroups");
        if (this.zzc) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Boolean bool = null;
            for (int i = 0; i < list.size(); i++) {
                zzbqd zzbqdVar = (zzbqd) list.get(i);
                int i2 = 0;
                while (true) {
                    List list3 = zzbqdVar.zzd;
                    zzbor zzborVar = zzbqdVar.zze;
                    if (i2 < list3.size()) {
                        SocketAddress socketAddress = (SocketAddress) zzbqdVar.zzd.get(i2);
                        if ((socketAddress instanceof InetSocketAddress) && (((InetSocketAddress) socketAddress).getAddress() instanceof Inet4Address)) {
                            if (bool == null) {
                                bool = Boolean.FALSE;
                            }
                            arrayList.add(new zzcda(zzborVar, socketAddress));
                        } else {
                            if (bool == null) {
                                bool = Boolean.TRUE;
                            }
                            arrayList2.add(new zzcda(zzborVar, socketAddress));
                        }
                        i2++;
                    }
                }
            }
            list2 = (bool == null || !bool.booleanValue()) ? zzj(arrayList, arrayList2) : zzj(arrayList2, arrayList);
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (int i3 = 0; i3 < list.size(); i3++) {
                zzbqd zzbqdVar2 = (zzbqd) list.get(i3);
                for (int i4 = 0; i4 < zzbqdVar2.zzd.size(); i4++) {
                    arrayList3.add(new zzcda(zzbqdVar2.zze, (SocketAddress) zzbqdVar2.zzd.get(i4)));
                }
            }
            list2 = arrayList3;
        }
        this.zza = list2;
        this.zzb = 0;
    }

    public boolean zzh(SocketAddress socketAddress) {
        Trace.checkNotNull(socketAddress, "needle");
        for (int i = 0; i < ((List) this.zza).size(); i++) {
            if (((zzcda) ((List) this.zza).get(i)).zzb.equals(socketAddress)) {
                this.zzb = i;
                return true;
            }
        }
        return false;
    }

    public zzfz() {
        this.zza = new Object[4];
        this.zzb = 0;
    }

    public zzfz(SimpleType simpleType, int i, boolean z) {
        this.zza = simpleType;
        this.zzb = i;
        this.zzc = z;
    }

    public SocketAddress zzd() {
        if (zza()) {
            return ((zzcda) ((List) this.zza).get(this.zzb)).zzb;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Index is past the end of the address group list");
        return null;
    }
}
