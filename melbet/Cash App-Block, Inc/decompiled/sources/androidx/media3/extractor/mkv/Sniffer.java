package androidx.media3.extractor.mkv;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.hardware.display.DisplayManager;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.Display;
import android.view.Surface;
import androidx.camera.video.internal.config.FormatCombo;
import androidx.constraintlayout.widget.R$styleable;
import androidx.constraintlayout.widget.StateSet$State;
import androidx.constraintlayout.widget.StateSet$Variant;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.emoji2.text.MetadataRepo;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.SniffFailure;
import androidx.media3.extractor.VorbisUtil$Mode;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.tracing.Trace;
import app.cash.redwood.yoga.internal.event.CallableEvent;
import app.cash.redwood.yoga.internal.event.LayoutPassReason;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.file.FileResource;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.datadog.android.core.internal.system.AppVersionProvider;
import com.datadog.android.trace.internal.compat.function.Function;
import com.datadog.trace.api.Config;
import com.datadog.trace.api.Pair;
import com.datadog.trace.api.cache.DDPartialKeyCache$Hasher;
import com.datadog.trace.core.propagation.PropagationTags$HeaderType;
import com.datadog.trace.core.propagation.ptags.DatadogPTagsCodec;
import com.datadog.trace.core.propagation.ptags.PTagsFactory$PTags;
import com.datadog.trace.core.propagation.ptags.TagValue;
import com.datadog.trace.core.propagation.ptags.W3CPTagsCodec;
import com.fillr.e0;
import com.fillr.featuretoggle.repository.ToggleCollection;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.android.filament.Renderer;
import com.google.android.filament.View;
import com.google.android.filament.Viewport;
import com.google.android.libraries.places.internal.zzbnf;
import com.google.android.libraries.places.internal.zzka;
import com.google.android.libraries.places.internal.zzmv;
import com.google.android.libraries.places.internal.zzwd;
import com.google.android.libraries.places.widget.internal.placedetails.photoviewer.PlacesLightboxActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.common.base.Splitter;
import com.google.common.primitives.ImmutableIntArray;
import com.google.common.util.concurrent.AsyncCallable;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.crypto.tink.aead.AesCtrHmacAeadParameters;
import com.google.crypto.tink.daead.AesSivParameters;
import com.google.crypto.tink.hybrid.internal.EciesDemHelper;
import com.google.crypto.tink.internal.Random;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.subtle.AesCtrJceCipher;
import com.google.crypto.tink.subtle.AesSiv;
import com.google.crypto.tink.subtle.Bytes;
import com.google.crypto.tink.subtle.EncryptThenAuthenticate;
import com.google.mlkit.vision.text.zza;
import com.miteksystems.misnap.camera.a.n;
import com.squareup.cash.appmessages.AppMessageImage;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.filament.BaseModelView;
import com.squareup.cash.filament.engine.FilamentDisplayHelper;
import com.squareup.util.android.Views;
import com.stripe.android.stripe3ds2.init.AppInfo;
import com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository$get$1;
import com.withpersona.sdk2.camera.CameraHelper$unbind$2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.chrisbanes.haze.HazeSourceNode$launchPreDraw$1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.brotli.dec.HuffmanTreeGroup;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class Sniffer implements SniffFailure, CallableEvent, ResourceTranscoder, AppVersionProvider, AsyncCallable, FutureCallback, AccessibilityViewCommand, EciesDemHelper.Dem {
    public final /* synthetic */ int $r8$classId;
    public int peekLength;
    public Object scratch;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public Sniffer(Context context, XmlResourceParser xmlResourceParser) {
        this.$r8$classId = 4;
        this.peekLength = -1;
        this.scratch = new SparseArray();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.StateSet);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.peekLength = obtainStyledAttributes.getResourceId(index, this.peekLength);
            }
        }
        obtainStyledAttributes.recycle();
        try {
            int eventType = xmlResourceParser.getEventType();
            StateSet$State stateSet$State = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                stateSet$State = new StateSet$State(context, xmlResourceParser);
                                ((SparseArray) this.scratch).put(stateSet$State.mId, stateSet$State);
                                break;
                            } else {
                                break;
                            }
                        case 1301459538:
                            name.equals("LayoutDescription");
                            break;
                        case 1382829617:
                            name.equals("StateSet");
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                StateSet$Variant stateSet$Variant = new StateSet$Variant(context, xmlResourceParser);
                                if (stateSet$State != null) {
                                    stateSet$State.mVariants.add(stateSet$Variant);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("StateSet".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e2);
        }
    }

    public static int calculateSize(int i) {
        if (i <= 0) {
            a$$ExternalSyntheticBUOutline0.m$3("Cache capacity must be > 0");
            return 0;
        }
        if (i > 1073741824) {
            i = 1073741824;
        }
        int numberOfLeadingZeros = (-1) >>> Integer.numberOfLeadingZeros(i - 1);
        if (numberOfLeadingZeros < 0) {
            return 1;
        }
        if (numberOfLeadingZeros >= 1073741824) {
            return 1073741824;
        }
        return numberOfLeadingZeros + 1;
    }

    public int actionsTopMargin(boolean z, AppMessageImage appMessageImage) {
        int i = this.peekLength;
        if (z) {
            return Views.dip((Context) this.scratch, 28);
        }
        if ((appMessageImage instanceof AppMessageImage.Static.Inset) || (appMessageImage instanceof AppMessageImage.Animated.Inset)) {
            return i;
        }
        if ((appMessageImage instanceof AppMessageImage.Static.Fill) || (appMessageImage instanceof AppMessageImage.Animated.Fill)) {
            return 0;
        }
        if ((appMessageImage instanceof AppMessageImage.Static.Fixed) || (appMessageImage instanceof AppMessageImage.Animated.Fixed)) {
            return i;
        }
        if (appMessageImage == null) {
            return 0;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.google.common.util.concurrent.AsyncCallable
    public /* synthetic */ ListenableFuture call() {
        return ((e0) this.scratch).zzh(this.peekLength);
    }

    public Object computeIfAbsent(CharSequence charSequence, int i, int i2, DDPartialKeyCache$Hasher dDPartialKeyCache$Hasher, TransportImpl$$ExternalSyntheticLambda0 transportImpl$$ExternalSyntheticLambda0, TransportImpl$$ExternalSyntheticLambda0 transportImpl$$ExternalSyntheticLambda02) {
        int i3;
        Sniffer[] snifferArr;
        int i4;
        boolean z;
        Sniffer[] snifferArr2 = (Sniffer[]) this.scratch;
        int i5 = this.peekLength;
        if (charSequence == null) {
            return null;
        }
        int apply = dDPartialKeyCache$Hasher.apply(i, i2, charSequence);
        int i6 = apply & i5;
        int i7 = apply;
        int i8 = 1;
        while (true) {
            int i9 = i7 & i5;
            Sniffer sniffer = snifferArr2[i9];
            int i10 = 12;
            if (sniffer == null) {
                Object apply2 = transportImpl$$ExternalSyntheticLambda02.apply(apply, i, charSequence, i2);
                snifferArr2[i9] = new Sniffer(apply, apply2, i10);
                return apply2;
            }
            Object obj = sniffer.scratch;
            if (apply == sniffer.peekLength) {
                switch (transportImpl$$ExternalSyntheticLambda0.$r8$classId) {
                    case 1:
                        i3 = i5;
                        snifferArr = snifferArr2;
                        i4 = i6;
                        CharSequence charSequence2 = charSequence;
                        TagValue tagValue = (TagValue) obj;
                        int min = Integer.min(charSequence2.length(), i2);
                        if (i >= 0 && min >= 0 && min - i == tagValue.length()) {
                            int i11 = i;
                            boolean z2 = true;
                            int i12 = 0;
                            while (z2 && i11 < min) {
                                z2 = TagValue.convertW3CtoDD(charSequence2.charAt(i11)) == tagValue.charAt(i12);
                                i11++;
                                i12++;
                            }
                            z = z2;
                            break;
                        }
                        z = false;
                        break;
                    default:
                        CharSequence charSequence3 = charSequence;
                        TagValue tagValue2 = (TagValue) obj;
                        int min2 = Integer.min(charSequence3.length(), i2);
                        if (i >= 0 && min2 >= 0) {
                            i3 = i5;
                            if (min2 - i == tagValue2.length()) {
                                int i13 = i;
                                int i14 = 0;
                                boolean z3 = true;
                                while (z3 && i13 < min2) {
                                    Sniffer[] snifferArr3 = snifferArr2;
                                    int i15 = i6;
                                    z3 = charSequence3.charAt(i13) == tagValue2.charAt(i14);
                                    i13++;
                                    i14++;
                                    snifferArr2 = snifferArr3;
                                    i6 = i15;
                                }
                                snifferArr = snifferArr2;
                                i4 = i6;
                                z = z3;
                                break;
                            }
                        } else {
                            i3 = i5;
                        }
                        snifferArr = snifferArr2;
                        i4 = i6;
                        z = false;
                        break;
                }
                if (z) {
                    return obj;
                }
            } else {
                i3 = i5;
                snifferArr = snifferArr2;
                i4 = i6;
            }
            if (i8 == 3) {
                Object apply3 = transportImpl$$ExternalSyntheticLambda02.apply(apply, i, charSequence, i2);
                snifferArr[i4] = new Sniffer(apply, apply3, 12);
                return apply3;
            }
            i7 = Integer.reverseBytes(i7 * (-1640532531)) * (-1640532531);
            i8++;
            i5 = i3;
            snifferArr2 = snifferArr;
            i6 = i4;
        }
    }

    public PTagsFactory$PTags createInvalid() {
        return new PTagsFactory$PTags(this, null, null, null, -128, null);
    }

    public PTagsFactory$PTags createValid(ArrayList arrayList, TagValue tagValue, TagValue tagValue2) {
        return new PTagsFactory$PTags(this, arrayList, tagValue, tagValue2, -128, null);
    }

    @Override // com.google.crypto.tink.hybrid.internal.EciesDemHelper.Dem
    public byte[] decrypt(byte[] bArr, byte[] bArr2, int i) {
        int i2 = this.$r8$classId;
        byte[] bArr3 = EciesDemHelper.EMPTY_AAD;
        boolean z = false;
        switch (i2) {
            case 22:
                if (bArr2.length < i) {
                    a$$ExternalSyntheticBUOutline0.m$6("ciphertext too short");
                    return null;
                }
                byte[] copyOfRange = Arrays.copyOfRange(bArr2, i, bArr2.length);
                EncryptThenAuthenticate aead = getAead(bArr);
                int length = copyOfRange.length;
                int i3 = aead.macLength;
                byte[] bArr4 = aead.outputPrefix;
                if (length < bArr4.length + i3) {
                    a$$ExternalSyntheticBUOutline0.m$6("Decryption failed (ciphertext too short).");
                    return null;
                }
                if (!Util.isPrefix(bArr4, copyOfRange)) {
                    a$$ExternalSyntheticBUOutline0.m$6("Decryption failed (OutputPrefix mismatch).");
                    return null;
                }
                byte[] copyOfRange2 = Arrays.copyOfRange(copyOfRange, bArr4.length, copyOfRange.length - i3);
                if (!MessageDigest.isEqual(aead.mac.computeMac(Bytes.concat(bArr3, copyOfRange2, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr3.length * 8).array(), 8))), Arrays.copyOfRange(copyOfRange, copyOfRange.length - i3, copyOfRange.length))) {
                    a$$ExternalSyntheticBUOutline0.m$6("invalid MAC");
                }
                AesCtrJceCipher aesCtrJceCipher = aead.cipher;
                int length2 = copyOfRange2.length;
                int i4 = aesCtrJceCipher.ivSize;
                if (length2 < i4) {
                    a$$ExternalSyntheticBUOutline0.m$6("ciphertext too short");
                    return null;
                }
                byte[] bArr5 = new byte[i4];
                System.arraycopy(copyOfRange2, 0, bArr5, 0, i4);
                int length3 = copyOfRange2.length;
                int i5 = aesCtrJceCipher.ivSize;
                byte[] bArr6 = new byte[length3 - i5];
                aesCtrJceCipher.doCtr(false, copyOfRange2, bArr6, i5, copyOfRange2.length - i5, bArr5, 0);
                return bArr6;
            default:
                if (bArr2.length < i) {
                    a$$ExternalSyntheticBUOutline0.m$6("ciphertext too short");
                    return null;
                }
                byte[] copyOfRange3 = Arrays.copyOfRange(bArr2, i, bArr2.length);
                n nVar = new n(9, z);
                nVar.a = (AesSivParameters) this.scratch;
                nVar.b = new WireAdapter(com.google.crypto.tink.util.Bytes.copyFrom(bArr));
                AesSiv create = AesSiv.create(nVar.m2161build());
                byte[][] bArr7 = {bArr3};
                AesSiv.validateAssociatedDataLength(1);
                int length4 = copyOfRange3.length;
                byte[] bArr8 = create.outputPrefix;
                if (length4 < bArr8.length + 16) {
                    a$$ExternalSyntheticBUOutline0.m$6("Ciphertext too short.");
                    return null;
                }
                if (!Util.isPrefix(bArr8, copyOfRange3)) {
                    a$$ExternalSyntheticBUOutline0.m$6("Decryption failed (OutputPrefix mismatch).");
                    return null;
                }
                Cipher cipher = (Cipher) AesSiv.localAesCtrCipher.get();
                byte[] copyOfRange4 = Arrays.copyOfRange(copyOfRange3, bArr8.length, bArr8.length + 16);
                byte[] bArr9 = (byte[]) copyOfRange4.clone();
                bArr9[8] = (byte) (bArr9[8] & Byte.MAX_VALUE);
                bArr9[12] = (byte) (bArr9[12] & Byte.MAX_VALUE);
                cipher.init(2, new SecretKeySpec(create.aesCtrKey, "AES"), new IvParameterSpec(bArr9));
                int length5 = bArr8.length + 16;
                int length6 = copyOfRange3.length - length5;
                byte[] doFinal = cipher.doFinal(copyOfRange3, length5, length6);
                if (length6 == 0 && doFinal == null && "The Android Project".equals(System.getProperty("java.vendor"))) {
                    doFinal = new byte[0];
                }
                byte[][] bArr10 = (byte[][]) Arrays.copyOf(bArr7, 2);
                bArr10[1] = doFinal;
                if (MessageDigest.isEqual(copyOfRange4, create.s2v(bArr10))) {
                    return doFinal;
                }
                throw new AEADBadTagException("Integrity check failed.");
        }
    }

    @Override // com.google.crypto.tink.hybrid.internal.EciesDemHelper.Dem
    public byte[] encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int i = this.$r8$classId;
        byte[] bArr5 = EciesDemHelper.EMPTY_AAD;
        boolean z = false;
        switch (i) {
            case 22:
                EncryptThenAuthenticate aead = getAead(bArr);
                AesCtrJceCipher aesCtrJceCipher = aead.cipher;
                int length = bArr4.length;
                int i2 = aesCtrJceCipher.ivSize;
                int i3 = Integer.MAX_VALUE - i2;
                if (length > i3) {
                    throw new GeneralSecurityException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i3, "plaintext length can not exceed "));
                }
                byte[] bArr6 = new byte[bArr4.length + i2];
                byte[] randBytes = Random.randBytes(i2);
                System.arraycopy(randBytes, 0, bArr6, 0, i2);
                aesCtrJceCipher.doCtr(true, bArr4, bArr6, 0, bArr4.length, randBytes, aesCtrJceCipher.ivSize);
                return Bytes.concat(bArr2, bArr3, Bytes.concat(aead.outputPrefix, bArr6, aead.mac.computeMac(Bytes.concat(bArr5, bArr6, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr5.length * 8).array(), 8)))));
            default:
                n nVar = new n(9, z);
                nVar.a = (AesSivParameters) this.scratch;
                nVar.b = new WireAdapter(com.google.crypto.tink.util.Bytes.copyFrom(bArr));
                AesSiv create = AesSiv.create(nVar.m2161build());
                byte[][] bArr7 = {bArr5};
                AesSiv.validateAssociatedDataLength(1);
                int length2 = bArr4.length;
                byte[] bArr8 = create.outputPrefix;
                if (length2 > 2147483631 - bArr8.length) {
                    a$$ExternalSyntheticBUOutline0.m$6("plaintext too long");
                    return null;
                }
                Cipher cipher = (Cipher) AesSiv.localAesCtrCipher.get();
                byte[][] bArr9 = (byte[][]) Arrays.copyOf(bArr7, 2);
                bArr9[1] = bArr4;
                byte[] s2v = create.s2v(bArr9);
                byte[] bArr10 = (byte[]) s2v.clone();
                bArr10[8] = (byte) (bArr10[8] & Byte.MAX_VALUE);
                bArr10[12] = (byte) (bArr10[12] & Byte.MAX_VALUE);
                cipher.init(1, new SecretKeySpec(create.aesCtrKey, "AES"), new IvParameterSpec(bArr10));
                byte[] copyOf = Arrays.copyOf(bArr8, bArr8.length + s2v.length + bArr4.length);
                System.arraycopy(s2v, 0, copyOf, bArr8.length, s2v.length);
                if (cipher.doFinal(bArr4, 0, bArr4.length, copyOf, bArr8.length + s2v.length) == bArr4.length) {
                    return Bytes.concat(bArr2, bArr3, copyOf);
                }
                a$$ExternalSyntheticBUOutline0.m$6("not enough data written");
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object get(ContinuationImpl continuationImpl) {
        DefaultAppInfoRepository$get$1 defaultAppInfoRepository$get$1;
        int i;
        if (continuationImpl instanceof DefaultAppInfoRepository$get$1) {
            defaultAppInfoRepository$get$1 = (DefaultAppInfoRepository$get$1) continuationImpl;
            int i2 = defaultAppInfoRepository$get$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                defaultAppInfoRepository$get$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = defaultAppInfoRepository$get$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultAppInfoRepository$get$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    HuffmanTreeGroup huffmanTreeGroup = (HuffmanTreeGroup) this.scratch;
                    defaultAppInfoRepository$get$1.label = 1;
                    obj = JobKt.withContext((CoroutineContext) huffmanTreeGroup.codes, new CameraHelper$unbind$2(huffmanTreeGroup, continuation, 21), defaultAppInfoRepository$get$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                AppInfo appInfo = (AppInfo) obj;
                return appInfo != null ? initAppInfo() : appInfo;
            }
        }
        defaultAppInfoRepository$get$1 = new DefaultAppInfoRepository$get$1(this, continuationImpl);
        Object obj2 = defaultAppInfoRepository$get$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultAppInfoRepository$get$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        AppInfo appInfo2 = (AppInfo) obj2;
        if (appInfo2 != null) {
        }
    }

    public EncryptThenAuthenticate getAead(byte[] bArr) {
        AesCtrHmacAeadParameters aesCtrHmacAeadParameters = (AesCtrHmacAeadParameters) this.scratch;
        byte[] copyOf = Arrays.copyOf(bArr, aesCtrHmacAeadParameters.aesKeySizeBytes);
        int i = aesCtrHmacAeadParameters.aesKeySizeBytes;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, aesCtrHmacAeadParameters.hmacKeySizeBytes + i);
        MetadataRepo metadataRepo = new MetadataRepo(16);
        metadataRepo.mMetadataList = aesCtrHmacAeadParameters;
        metadataRepo.mEmojiCharArray = new WireAdapter(com.google.crypto.tink.util.Bytes.copyFrom(copyOf));
        metadataRepo.mRootNode = new WireAdapter(com.google.crypto.tink.util.Bytes.copyFrom(copyOfRange));
        return EncryptThenAuthenticate.create(metadataRepo.m1114build());
    }

    @Override // com.google.crypto.tink.hybrid.internal.EciesDemHelper.Dem
    public int getSymmetricKeySizeInBytes() {
        switch (this.$r8$classId) {
        }
        return this.peekLength;
    }

    @Override // com.datadog.android.core.internal.system.AppVersionProvider
    public String getVersion() {
        Object obj = ((AtomicReference) this.scratch).get();
        obj.getClass();
        return (String) obj;
    }

    @Override // com.datadog.android.core.internal.system.AppVersionProvider
    public int getVersionCode() {
        return this.peekLength;
    }

    public AppInfo initAppInfo() {
        String m = Boxes$$ExternalSyntheticOutline1.m();
        AppInfo appInfo = new AppInfo(m, this.peekLength);
        HuffmanTreeGroup huffmanTreeGroup = (HuffmanTreeGroup) this.scratch;
        huffmanTreeGroup.getClass();
        Object value = ((Lazy) huffmanTreeGroup.trees).getValue();
        value.getClass();
        ((SharedPreferences) value).edit().putInt("app_version", huffmanTreeGroup.alphabetSize).putString("sdk_app_id", m).apply();
        return appInfo;
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public void onFailure(Throwable th) {
        zzka zzkaVar = (zzka) this.scratch;
        zzkaVar.zzh = false;
        zzkaVar.zza = null;
        zzkaVar.zzb = null;
        zzkaVar.zzc = this.peekLength;
    }

    public void onNativeWindowChanged(Surface surface) {
        surface.getClass();
        BaseModelView baseModelView = (BaseModelView) this.scratch;
        final FilamentDisplayHelper filamentDisplayHelper = baseModelView.displayHelper;
        if (BaseModelView.access$isActiveRenderSession(baseModelView, this.peekLength)) {
            baseModelView.destroySwapChain(false);
            baseModelView.swapChain = baseModelView.getEngine().createSwapChain(surface, baseModelView.uiHelper.stayAwake ? 0L : 1L);
            filamentDisplayHelper.detach();
            Renderer renderer = baseModelView.renderer;
            if (renderer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("renderer");
                throw null;
            }
            final Display display = baseModelView.textureView.getDisplay();
            display.getClass();
            filamentDisplayHelper.getClass();
            if (renderer == ((Renderer) filamentDisplayHelper.mRenderer) && display.equals((Display) filamentDisplayHelper.display)) {
                return;
            }
            filamentDisplayHelper.mRenderer = renderer;
            filamentDisplayHelper.display = display;
            DisplayManager.DisplayListener displayListener = new DisplayManager.DisplayListener() { // from class: com.squareup.cash.filament.engine.FilamentDisplayHelper$attach$1
                @Override // android.hardware.display.DisplayManager.DisplayListener
                public final void onDisplayAdded(int i) {
                }

                @Override // android.hardware.display.DisplayManager.DisplayListener
                public final void onDisplayChanged(int i) {
                    if (i == display.getDisplayId()) {
                        filamentDisplayHelper.updateDisplayInfo();
                    }
                }

                @Override // android.hardware.display.DisplayManager.DisplayListener
                public final void onDisplayRemoved(int i) {
                }
            };
            filamentDisplayHelper.mListener = displayListener;
            ((DisplayManager) filamentDisplayHelper.mDisplayManager).registerDisplayListener(displayListener, null);
            filamentDisplayHelper.updateDisplayInfo();
        }
    }

    public void onResized(int i, int i2) {
        BaseModelView baseModelView = (BaseModelView) this.scratch;
        if (BaseModelView.access$isActiveRenderSession(baseModelView, this.peekLength)) {
            baseModelView.getCamera().setProjection(baseModelView.cameraFov, i / i2, baseModelView.cameraFovDirection);
            View view = baseModelView.view;
            if (view != null) {
                view.setViewport(new Viewport(i, i2));
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("view");
                throw null;
            }
        }
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public /* synthetic */ void onSuccess(Object obj) {
        zzka zzkaVar = (zzka) this.scratch;
        zzkaVar.zzh = false;
        String zzc = ((zzbnf) obj).zzc();
        int i = this.peekLength;
        try {
            zzkaVar.zza = zzc;
            List splitToList = Splitter.on('.').splitToList(zzc);
            if (splitToList.size() < 2) {
                throw new IllegalStateException("Invalid JWT format");
            }
            zzkaVar.zzb = Long.valueOf(Long.parseLong(new JSONObject(new String(Base64.decode((String) splitToList.get(1), 8), StandardCharsets.UTF_8)).get("exp").toString()));
            zzkaVar.zzc = i;
        } catch (Exception e) {
            a$$ExternalSyntheticBUOutline0.m("Couldn't decode JWT payload", e);
        }
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public boolean perform(android.view.View view) {
        ((BottomSheetBehavior) this.scratch).setState(this.peekLength);
        return true;
    }

    public long readUint(DefaultExtractorInput defaultExtractorInput) {
        ParsableByteArray parsableByteArray = (ParsableByteArray) this.scratch;
        int i = 0;
        defaultExtractorInput.peekFully(parsableByteArray.data, 0, 1, false);
        int i2 = parsableByteArray.data[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        defaultExtractorInput.peekFully(parsableByteArray.data, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (parsableByteArray.data[i] & 255) + (i5 << 8);
        }
        this.peekLength = i4 + 1 + this.peekLength;
        return i5;
    }

    @Override // com.datadog.android.core.internal.system.AppVersionProvider
    public void setVersion(String str) {
        ((AtomicReference) this.scratch).set(str);
    }

    public int stateGetConstraintID(int i) {
        SparseArray sparseArray = (SparseArray) this.scratch;
        int i2 = 0;
        if (-1 == i) {
            StateSet$State stateSet$State = i == -1 ? (StateSet$State) sparseArray.valueAt(0) : (StateSet$State) sparseArray.get(-1);
            if (stateSet$State != null) {
                ArrayList arrayList = stateSet$State.mVariants;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        i2 = -1;
                        break;
                    }
                    StateSet$Variant stateSet$Variant = (StateSet$Variant) arrayList.get(i2);
                    float f = stateSet$Variant.mMaxHeight;
                    float f2 = stateSet$Variant.mMaxWidth;
                    float f3 = stateSet$Variant.mMinHeight;
                    float f4 = stateSet$Variant.mMinWidth;
                    if ((Float.isNaN(f4) || -1.0f >= f4) && ((Float.isNaN(f3) || -1.0f >= f3) && ((Float.isNaN(f2) || -1.0f <= f2) && (Float.isNaN(f) || -1.0f <= f)))) {
                        break;
                    }
                    i2++;
                }
                if (-1 != i2) {
                    return i2 == -1 ? stateSet$State.mConstraintID : ((StateSet$Variant) arrayList.get(i2)).mConstraintID;
                }
            }
        } else {
            StateSet$State stateSet$State2 = (StateSet$State) sparseArray.get(i);
            if (stateSet$State2 != null) {
                ArrayList arrayList2 = stateSet$State2.mVariants;
                while (true) {
                    if (i2 >= arrayList2.size()) {
                        i2 = -1;
                        break;
                    }
                    StateSet$Variant stateSet$Variant2 = (StateSet$Variant) arrayList2.get(i2);
                    float f5 = stateSet$Variant2.mMaxHeight;
                    float f6 = stateSet$Variant2.mMaxWidth;
                    float f7 = stateSet$Variant2.mMinHeight;
                    float f8 = stateSet$Variant2.mMinWidth;
                    if ((Float.isNaN(f8) || -1.0f >= f8) && ((Float.isNaN(f7) || -1.0f >= f7) && ((Float.isNaN(f6) || -1.0f <= f6) && (Float.isNaN(f5) || -1.0f <= f5)))) {
                        break;
                    }
                    i2++;
                }
                return i2 == -1 ? stateSet$State2.mConstraintID : ((StateSet$Variant) arrayList2.get(i2)).mConstraintID;
            }
        }
        return -1;
    }

    public void support(List list, List list2) {
        Map map = (Map) this.scratch;
        int i = this.peekLength;
        list.getClass();
        list2.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object obj = map.get(str);
            if (obj == null) {
                obj = new LinkedHashSet();
                map.put(str, obj);
            }
            Set set = (Set) obj;
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                set.add(new FormatCombo(i, str, (String) it2.next()));
            }
            set.add(new FormatCombo(i, str, null));
        }
        Object obj2 = map.get(null);
        if (obj2 == null) {
            obj2 = new LinkedHashSet();
            map.put(null, obj2);
        }
        Set set2 = (Set) obj2;
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            set2.add(new FormatCombo(i, null, (String) it3.next()));
        }
    }

    public int titleTopMargin(AppMessageImage appMessageImage, String str) {
        Context context = (Context) this.scratch;
        if (str == null) {
            return 0;
        }
        if ((appMessageImage instanceof AppMessageImage.Static.Inset) || (appMessageImage instanceof AppMessageImage.Animated.Inset)) {
            return Views.dip(context, 24);
        }
        if ((appMessageImage instanceof AppMessageImage.Static.Fill) || (appMessageImage instanceof AppMessageImage.Animated.Fill)) {
            return Views.dip(context, 24);
        }
        if ((appMessageImage instanceof AppMessageImage.Static.Fixed) || (appMessageImage instanceof AppMessageImage.Animated.Fixed)) {
            return Views.dip(context, 24);
        }
        if (appMessageImage == null) {
            return Views.dip(context, 24);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 6:
                ImmutableIntArray immutableIntArray = (ImmutableIntArray) this.scratch;
                ArrayList arrayList = new ArrayList(immutableIntArray.end);
                int i = 0;
                while (true) {
                    int i2 = immutableIntArray.end;
                    if (i >= i2) {
                        StringBuilder sb = new StringBuilder("UnsupportedBrands{major=");
                        int i3 = this.peekLength;
                        String str = androidx.media3.common.util.Util.DEVICE_DEBUG_INFO;
                        sb.append(new String(new byte[]{(byte) (i3 >> 24), (byte) (i3 >> 16), (byte) (i3 >> 8), (byte) i3}, StandardCharsets.US_ASCII));
                        sb.append(", compatible=");
                        sb.append(arrayList);
                        sb.append("}");
                        return sb.toString();
                    }
                    Trace.checkElementIndex(i, i2);
                    int i4 = immutableIntArray.f1000array[i];
                    String str2 = androidx.media3.common.util.Util.DEVICE_DEBUG_INFO;
                    arrayList.add(new String(new byte[]{(byte) (i4 >> 24), (byte) (i4 >> 16), (byte) (i4 >> 8), (byte) i4}, StandardCharsets.US_ASCII));
                    i++;
                }
            default:
                return super.toString();
        }
    }

    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    public Resource transcode(Resource resource, Options options) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) resource.get()).compress((Bitmap.CompressFormat) this.scratch, this.peekLength, byteArrayOutputStream);
        resource.recycle();
        return new FileResource(byteArrayOutputStream.toByteArray());
    }

    public float zzc(int i, int i2) {
        TypedArray obtainStyledAttributes = ((PlacesLightboxActivity) this.scratch).obtainStyledAttributes(this.peekLength, com.google.android.libraries.places.R$styleable.PlacesMaterialThemeAttrs);
        float dimension = obtainStyledAttributes.getDimension(i, r0.getResources().getDimensionPixelSize(i2));
        obtainStyledAttributes.recycle();
        return dimension;
    }

    public /* synthetic */ Sniffer(int i, Object obj, int i2) {
        this.$r8$classId = i2;
        this.peekLength = i;
        this.scratch = obj;
    }

    public /* synthetic */ Sniffer(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.scratch = obj;
        this.peekLength = i;
    }

    public Sniffer(zzmv zzmvVar, Map map) {
        char[][] cArr;
        this.$r8$classId = 19;
        map.getClass();
        if (map.isEmpty()) {
            cArr = zzwd.zzb;
        } else {
            cArr = new char[((Character) Collections.max(map.keySet())).charValue() + 1][];
            for (Character ch : map.keySet()) {
                cArr[ch.charValue()] = ((String) map.get(ch)).toCharArray();
            }
        }
        this.scratch = cArr;
        this.peekLength = cArr.length;
    }

    public Sniffer(String str, int i) {
        this.$r8$classId = 10;
        this.peekLength = i;
        this.scratch = new AtomicReference(str);
    }

    public Sniffer(ToggleCollection toggleCollection) {
        this.$r8$classId = 16;
        this.peekLength = 2;
        this.scratch = toggleCollection;
    }

    public Sniffer(int i, boolean z, boolean z2) {
        this.$r8$classId = i;
        switch (i) {
            case 7:
                LayoutPassReason.Companion.getClass();
                int i2 = LayoutPassReason.COUNT;
                int[] iArr = new int[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    iArr[i3] = 0;
                }
                this.scratch = iArr;
                break;
            case 9:
                this.scratch = Bitmap.CompressFormat.JPEG;
                this.peekLength = 100;
                break;
            case 14:
                int i4 = Config.INSTANCE.spanAttributeSchemaVersion;
                this.peekLength = i4;
                if (i4 != 1) {
                    this.scratch = new VorbisUtil$Mode(5);
                    break;
                } else {
                    this.scratch = new zza(4);
                    break;
                }
            default:
                this.scratch = new ParsableByteArray(8);
                break;
        }
    }

    public Sniffer(int i, int[] iArr) {
        ImmutableIntArray immutableIntArray;
        this.$r8$classId = 6;
        this.peekLength = i;
        if (iArr != null) {
            ImmutableIntArray immutableIntArray2 = ImmutableIntArray.EMPTY;
            immutableIntArray = iArr.length == 0 ? ImmutableIntArray.EMPTY : new ImmutableIntArray(Arrays.copyOf(iArr, iArr.length));
        } else {
            immutableIntArray = ImmutableIntArray.EMPTY;
        }
        this.scratch = immutableIntArray;
    }

    public Sniffer(int i, int i2) {
        this.$r8$classId = i2;
        switch (i2) {
            case 13:
                int calculateSize = calculateSize(i);
                this.scratch = new Sniffer[calculateSize];
                this.peekLength = calculateSize - 1;
                break;
            case 15:
                EnumMap enumMap = new EnumMap(PropagationTags$HeaderType.class);
                this.scratch = enumMap;
                this.peekLength = i;
                enumMap.put((EnumMap) PropagationTags$HeaderType.DATADOG, (PropagationTags$HeaderType) new DatadogPTagsCodec(i));
                enumMap.put((EnumMap) PropagationTags$HeaderType.W3C, (PropagationTags$HeaderType) new W3CPTagsCodec());
                break;
            case 16:
                this.peekLength = i;
                this.scratch = new ToggleCollection(Collections.EMPTY_LIST);
                break;
            case 29:
                this.peekLength = i;
                this.scratch = new AtomicInteger(0);
                break;
            default:
                int calculateSize2 = calculateSize(i);
                this.scratch = new Pair[calculateSize2];
                this.peekLength = calculateSize2 - 1;
                break;
        }
    }

    public /* synthetic */ Sniffer(byte b, int i, boolean z) {
        this.$r8$classId = i;
    }

    public Sniffer(Context context, CoroutineContext coroutineContext) {
        Object failure;
        this.$r8$classId = 28;
        try {
            Result.Companion companion = Result.Companion;
            failure = Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        int intValue = ((Number) (failure instanceof Result.Failure ? -1 : failure)).intValue();
        this.scratch = new HuffmanTreeGroup(intValue, context, coroutineContext);
        this.peekLength = intValue;
        JobKt.launch$default(JobKt.CoroutineScope(coroutineContext), null, null, new HazeSourceNode$launchPreDraw$1(this, null, 7), 3);
    }

    public Sniffer(AesCtrHmacAeadParameters aesCtrHmacAeadParameters) {
        this.$r8$classId = 22;
        this.scratch = aesCtrHmacAeadParameters;
        this.peekLength = aesCtrHmacAeadParameters.aesKeySizeBytes + aesCtrHmacAeadParameters.hmacKeySizeBytes;
    }

    public Sniffer(AesSivParameters aesSivParameters) {
        this.$r8$classId = 23;
        this.scratch = aesSivParameters;
        this.peekLength = aesSivParameters.keySizeBytes;
    }

    public Sniffer(boolean z, boolean z2, boolean z3) {
        this.$r8$classId = 5;
        this.peekLength = (z || z2 || z3) ? 1 : 0;
    }

    public Object computeIfAbsent(Object obj, Function function) {
        Pair[] pairArr = (Pair[]) this.scratch;
        int i = this.peekLength;
        if (obj == null) {
            return null;
        }
        int hashCode = obj.hashCode();
        int i2 = hashCode & i;
        int i3 = 1;
        while (true) {
            int i4 = hashCode & i;
            Pair pair = pairArr[i4];
            if (pair == null) {
                Object apply = function.apply(obj);
                pairArr[i4] = new Pair(obj, apply);
                return apply;
            }
            if (obj.equals(pair.left)) {
                return pair.right;
            }
            if (i3 == 3) {
                Object apply2 = function.apply(obj);
                pairArr[i2] = new Pair(obj, apply2);
                return apply2;
            }
            hashCode = Integer.reverseBytes(hashCode * (-1640532531)) * (-1640532531);
            i3++;
        }
    }
}
