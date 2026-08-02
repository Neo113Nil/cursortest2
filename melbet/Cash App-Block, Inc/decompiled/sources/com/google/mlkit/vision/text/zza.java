package com.google.mlkit.vision.text;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.OffsetApplier;
import androidx.media3.extractor.mkv.Sniffer;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.request.ErrorResult;
import coil3.request.ImageRequest;
import coil3.request.SuccessResult;
import com.datadog.android.trace.api.span.DatadogSpan;
import com.datadog.android.trace.api.span.DatadogSpanBuilder;
import com.datadog.android.trace.api.span.DatadogSpanContext;
import com.datadog.android.trace.api.span.NoOpDatadogSpan;
import com.datadog.trace.api.naming.NamingSchema;
import com.google.android.filament.Viewport;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.fido.fido2.zzf;
import com.google.android.gms.internal.mlkit_vision_text_common.zzu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuz;
import com.google.android.gms.internal.p001authapiphone.zzh;
import com.google.android.gms.internal.p001authapiphone.zzw;
import com.google.android.gms.internal.tapandpay.zzaj;
import com.google.android.gms.internal.tapandpay.zzy;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.common.base.Splitter;
import com.google.crypto.tink.aead.internal.ChaCha20Poly1305Jce;
import com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.crypto.tink.hybrid.internal.HpkeAead;
import com.google.crypto.tink.hybrid.internal.HpkeUtil;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.mlkit.vision.text.Text;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.ECIEncoderSet;
import com.google.zxing.common.StringUtils;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.GenericGFPoly;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.Version;
import com.google.zxing.qrcode.encoder.BlockPair;
import com.google.zxing.qrcode.encoder.Encoder;
import com.google.zxing.qrcode.encoder.MaskUtil;
import com.google.zxing.qrcode.encoder.MinimalEncoder$ResultList$ResultNode;
import com.miteksystems.misnap.camera.a.n;
import com.plaid.internal.EnumC0170g;
import com.squareup.card.entry.validators.InputValidator;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoImage;
import com.squareup.cash.money.applets.sections.AppletTileUninstalledRowVariantProvider;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.protos.franklin.ui.MerchantData;
import com.squareup.protos.franklin.ui.UiCustomer;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.EmptyList;
import okio.Path$$ExternalSyntheticBUOutline0;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final /* synthetic */ class zza implements DatadogSpanBuilder, NamingSchema, RemoteCall, HpkeAead, zzu, Writer, InputValidator, ImageRequest.Listener, AppletTileUninstalledRowVariantProvider {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zza(int i) {
        this.$r8$classId = i;
    }

    public static Recipient create$default(UiCustomer uiCustomer, long j, boolean z, boolean z2, String str, int i) {
        Image image;
        Parcelable.Creator<Recipient> creator = Recipient.CREATOR;
        boolean z3 = (i & 4) != 0 ? false : z;
        boolean z4 = (i & 8) != 0 ? true : z2;
        String str2 = (i & 16) != 0 ? null : str;
        uiCustomer.getClass();
        if (str2 != null && !z3) {
            a$$ExternalSyntheticBUOutline0.m$1("contactName cannot be nonnull when the recipient is not in contacts");
            return null;
        }
        String str3 = uiCustomer.id;
        String str4 = uiCustomer.threaded_customer_id;
        String str5 = uiCustomer.cashtag;
        Boolean bool = uiCustomer.is_cash_customer;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = uiCustomer.is_verified_account;
        boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        Boolean bool3 = uiCustomer.is_business;
        boolean booleanValue3 = bool3 != null ? bool3.booleanValue() : false;
        String str6 = uiCustomer.email_address;
        String str7 = uiCustomer.sms_number;
        Image image2 = uiCustomer.photo;
        if (image2 == null) {
            String str8 = uiCustomer.photo_url;
            image = str8 != null ? new Image(str8, str8, 4) : null;
        } else {
            image = image2;
        }
        String str9 = uiCustomer.full_name;
        String str10 = uiCustomer.email_address;
        String str11 = uiCustomer.sms_number;
        Boolean bool4 = uiCustomer.can_accept_payments;
        boolean booleanValue4 = bool4 != null ? bool4.booleanValue() : false;
        Long l = uiCustomer.credit_card_fee_bps;
        long longValue = l != null ? l.longValue() : j;
        BlockState blockState = uiCustomer.block_state;
        if (blockState == null) {
            blockState = BlockState.NOT_BLOCKED;
        }
        BlockState blockState2 = blockState;
        MerchantData merchantData = uiCustomer.merchant_data;
        return new Recipient(null, true, false, str3, str4, str5, booleanValue, booleanValue2, booleanValue3, str6, str7, image, str10, str11, booleanValue4, longValue, blockState2, merchantData, z4, uiCustomer.accent_color, uiCustomer.themed_accent_color, uiCustomer.region, merchantData != null ? merchantData.category : null, uiCustomer.customer_joined_on, str9, str2, null, null, z3, null, false, false, uiCustomer.render_data, null, -335544315, 23);
    }

    public static Recipient createEmailRecipient(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        return new Recipient(null, false, false, null, null, null, false, false, false, str2, null, null, str2, null, false, j, null, null, false, null, null, null, null, null, str, null, null, null, false, null, false, false, null, null, -285250050, 63);
    }

    public static Recipient createPhoneRecipient(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        return new Recipient(null, false, false, null, null, null, false, false, false, null, str2, null, null, str2, false, j, null, null, false, null, null, null, null, null, str, null, null, null, false, null, false, false, null, null, -285254658, 63);
    }

    public static InvestingCryptoImage icon(BigDecimal bigDecimal) {
        bigDecimal.getClass();
        int signum = bigDecimal.signum();
        if (signum == -1) {
            return InvestingCryptoImage.ARROW_DOWN;
        }
        if (signum != 0) {
            if (signum == 1) {
                return InvestingCryptoImage.ARROW_UP;
            }
            Path$$ExternalSyntheticBUOutline0.m();
        }
        return null;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) {
        int i = 1;
        switch (this.$r8$classId) {
            case 6:
                zzh zzhVar = (zzh) ((zzw) obj).getService();
                zzf zzfVar = new zzf(2, (TaskCompletionSource) obj2);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
                int i2 = com.google.android.gms.internal.p001authapiphone.zzc.$r8$clinit;
                obtain.writeStrongBinder(zzfVar);
                Parcel obtain2 = Parcel.obtain();
                try {
                    zzhVar.zza.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                    obtain.recycle();
                    obtain2.recycle();
                }
            default:
                com.google.android.gms.internal.tapandpay.zzd zzdVar = (com.google.android.gms.internal.tapandpay.zzd) ((zzaj) obj).getService();
                zzy zzyVar = new zzy(i, (TaskCompletionSource) obj2);
                Parcel zza = zzdVar.zza();
                int i3 = com.google.android.gms.internal.tapandpay.zzc.$r8$clinit;
                zza.writeStrongBinder(zzyVar);
                zzdVar.zzb(zza, 30);
                return;
        }
    }

    @Override // com.datadog.trace.api.naming.NamingSchema
    public boolean allowInferredServices() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:257:0x0636, code lost:
    
        if (r9 < 8) goto L299;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x07e8  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0835  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x02b9 A[LOOP:34: B:445:0x02b7->B:446:0x02b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:449:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x084e  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0307 A[LOOP:2: B:77:0x0305->B:78:0x0307, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0318  */
    @Override // com.google.zxing.Writer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        Charset forName;
        int i5;
        Mode mode;
        int i6;
        Version versionForNumber;
        int i7;
        int i8;
        int sizeInBytes;
        int i9;
        BitArray bitArray;
        Version version;
        CharacterSetECI characterSetECI;
        int length;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        char c;
        Version version2;
        BitArray bitArray2;
        int i18;
        int i19;
        int i20;
        Map map2 = map;
        if (str.isEmpty()) {
            a$$ExternalSyntheticBUOutline0.m$3("Found empty contents");
            return null;
        }
        if (barcodeFormat != BarcodeFormat.QR_CODE) {
            OptionalProvider$$ExternalSyntheticLambda0.m((Object) barcodeFormat, "Can only encode QR_CODE, but got ");
            return null;
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
        }
        int i21 = 4;
        if (map2 != null) {
            EncodeHintType encodeHintType = EncodeHintType.ERROR_CORRECTION;
            if (map2.containsKey(encodeHintType)) {
                String obj = map2.get(encodeHintType).toString();
                if (obj == null) {
                    a$$ExternalSyntheticBUOutline0.m$2("Name is null");
                } else if (!obj.equals("L")) {
                    if (obj.equals("M")) {
                        i4 = 2;
                    } else if (obj.equals("Q")) {
                        i4 = 3;
                    } else if (obj.equals("H")) {
                        i4 = 4;
                    } else {
                        a$$ExternalSyntheticBUOutline0.m$3("No enum constant com.google.zxing.qrcode.decoder.ErrorCorrectionLevel.".concat(obj));
                    }
                    EncodeHintType encodeHintType2 = EncodeHintType.MARGIN;
                    i3 = map2.containsKey(encodeHintType2) ? Integer.parseInt(map2.get(encodeHintType2).toString()) : 4;
                }
                i4 = 0;
                EncodeHintType encodeHintType22 = EncodeHintType.MARGIN;
                if (map2.containsKey(encodeHintType22)) {
                }
            }
            i4 = 1;
            EncodeHintType encodeHintType222 = EncodeHintType.MARGIN;
            if (map2.containsKey(encodeHintType222)) {
            }
        } else {
            i3 = 4;
            i4 = 1;
        }
        Charset charset = Encoder.DEFAULT_BYTE_MODE_ENCODING;
        if (map2 != null) {
            EncodeHintType encodeHintType3 = EncodeHintType.GS1_FORMAT;
            if (map2.containsKey(encodeHintType3) && Boolean.parseBoolean(map2.get(encodeHintType3).toString())) {
                z = true;
                if (map2 != null) {
                    EncodeHintType encodeHintType4 = EncodeHintType.QR_COMPACT;
                    if (map2.containsKey(encodeHintType4) && Boolean.parseBoolean(map2.get(encodeHintType4).toString())) {
                        z2 = true;
                        EncodeHintType encodeHintType5 = EncodeHintType.CHARACTER_SET;
                        z3 = map2 == null && map2.containsKey(encodeHintType5);
                        if (z3) {
                            try {
                                forName = Charset.forName(map2.get(encodeHintType5).toString());
                            } catch (UnsupportedCharsetException unused) {
                            }
                            int i22 = 8;
                            int i23 = 1;
                            if (z2) {
                                i5 = 0;
                                Charset charset2 = StringUtils.SHIFT_JIS_CHARSET;
                                Mode mode2 = Mode.BYTE;
                                if (charset2 != null && charset2.equals(forName) && Encoder.isOnlyDoubleByteKanji(str)) {
                                    mode = Mode.KANJI;
                                } else {
                                    boolean z4 = false;
                                    boolean z5 = false;
                                    int i24 = 0;
                                    while (true) {
                                        if (i24 < str.length()) {
                                            char charAt = str.charAt(i24);
                                            if (charAt < '0' || charAt > '9') {
                                                if ((charAt < '`' ? Encoder.ALPHANUMERIC_TABLE[charAt] : -1) == -1) {
                                                    break;
                                                }
                                                z4 = true;
                                            } else {
                                                z5 = true;
                                            }
                                            i24++;
                                        } else if (z4) {
                                            mode = Mode.ALPHANUMERIC;
                                        } else if (z5) {
                                            mode = Mode.NUMERIC;
                                        }
                                    }
                                    mode = mode2;
                                }
                                BitArray bitArray3 = new BitArray();
                                if (mode == mode2 && z3 && (characterSetECI = CharacterSetECI.getCharacterSetECI(forName)) != null) {
                                    i6 = 4;
                                    bitArray3.appendBits(7, 4);
                                    bitArray3.appendBits(characterSetECI.values[0], 8);
                                } else {
                                    i6 = 4;
                                }
                                if (z) {
                                    bitArray3.appendBits(5, i6);
                                }
                                bitArray3.appendBits(mode.bits, i6);
                                BitArray bitArray4 = new BitArray();
                                Encoder.appendBytes(str, mode, bitArray4, forName);
                                if (map2 != null) {
                                    EncodeHintType encodeHintType6 = EncodeHintType.QR_VERSION;
                                    if (map2.containsKey(encodeHintType6)) {
                                        Version versionForNumber2 = Version.getVersionForNumber(Integer.parseInt(map2.get(encodeHintType6).toString()));
                                        if (!Encoder.willFit(mode.getCharacterCountBits(versionForNumber2) + bitArray3.size + bitArray4.size, versionForNumber2, i4)) {
                                            throw new WriterException("Data too big for requested version");
                                        }
                                        versionForNumber = versionForNumber2;
                                        BitArray bitArray5 = new BitArray();
                                        i7 = bitArray3.size;
                                        bitArray5.ensureCapacity(i7);
                                        for (i8 = 0; i8 < i7; i8++) {
                                            bitArray5.appendBit(bitArray3.get(i8));
                                        }
                                        sizeInBytes = mode != mode2 ? bitArray4.getSizeInBytes() : str.length();
                                        int characterCountBits = mode.getCharacterCountBits(versionForNumber);
                                        i9 = 1 << characterCountBits;
                                        if (sizeInBytes < i9) {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append(sizeInBytes);
                                            sb.append(" is bigger than ");
                                            sb.append(i9 - 1);
                                            throw new WriterException(sb.toString());
                                        }
                                        bitArray5.appendBits(sizeInBytes, characterCountBits);
                                        int i25 = bitArray4.size;
                                        bitArray5.ensureCapacity(bitArray5.size + i25);
                                        for (int i26 = 0; i26 < i25; i26++) {
                                            bitArray5.appendBit(bitArray4.get(i26));
                                        }
                                        bitArray = bitArray5;
                                        version = versionForNumber;
                                    }
                                }
                                int characterCountBits2 = mode.getCharacterCountBits(Version.getVersionForNumber(1)) + bitArray3.size + bitArray4.size;
                                int i27 = 1;
                                while (i27 <= 40) {
                                    Version versionForNumber3 = Version.getVersionForNumber(i27);
                                    if (Encoder.willFit(characterCountBits2, versionForNumber3, i4)) {
                                        int characterCountBits3 = mode.getCharacterCountBits(versionForNumber3) + bitArray3.size + bitArray4.size;
                                        int i28 = 1;
                                        while (i28 <= 40) {
                                            versionForNumber = Version.getVersionForNumber(i28);
                                            if (Encoder.willFit(characterCountBits3, versionForNumber, i4)) {
                                                BitArray bitArray52 = new BitArray();
                                                i7 = bitArray3.size;
                                                bitArray52.ensureCapacity(i7);
                                                while (i8 < i7) {
                                                }
                                                if (mode != mode2) {
                                                }
                                                int characterCountBits4 = mode.getCharacterCountBits(versionForNumber);
                                                i9 = 1 << characterCountBits4;
                                                if (sizeInBytes < i9) {
                                                }
                                            } else {
                                                i28++;
                                                map2 = map2;
                                                i4 = i4;
                                                i3 = i3;
                                                i22 = 8;
                                            }
                                        }
                                        throw new WriterException("Data too big");
                                    }
                                    i27++;
                                    map2 = map2;
                                    i4 = i4;
                                    i3 = i3;
                                    i22 = 8;
                                }
                                throw new WriterException("Data too big");
                            }
                            if (forName.equals(charset)) {
                                forName = null;
                            }
                            Splitter splitter = new Splitter(str, forName, z, i4);
                            int i29 = splitter.limit;
                            Version[] versionArr = {Splitter.getVersion(1), Splitter.getVersion(2), Splitter.getVersion(3)};
                            i5 = 0;
                            n[] nVarArr = {splitter.encodeSpecificVersion(versionArr[0]), splitter.encodeSpecificVersion(versionArr[1]), splitter.encodeSpecificVersion(versionArr[2])};
                            int i30 = Integer.MAX_VALUE;
                            int i31 = 0;
                            int i32 = -1;
                            for (int i33 = 3; i31 < i33; i33 = 3) {
                                n nVar = nVarArr[i31];
                                int size = nVar.getSize((Version) nVar.b);
                                if (Encoder.willFit(size, versionArr[i31], i29) && size < i30) {
                                    i30 = size;
                                    i32 = i31;
                                }
                                i31++;
                            }
                            if (i32 < 0) {
                                throw new WriterException("Data too big for any version");
                            }
                            n nVar2 = nVarArr[i32];
                            BitArray bitArray6 = new BitArray();
                            Iterator it = ((ArrayList) nVar2.a).iterator();
                            while (it.hasNext()) {
                                MinimalEncoder$ResultList$ResultNode minimalEncoder$ResultList$ResultNode = (MinimalEncoder$ResultList$ResultNode) it.next();
                                int i34 = minimalEncoder$ResultList$ResultNode.charsetEncoderIndex;
                                n nVar3 = minimalEncoder$ResultList$ResultNode.this$1;
                                Splitter splitter2 = (Splitter) nVar3.c;
                                Mode mode3 = minimalEncoder$ResultList$ResultNode.mode;
                                bitArray6.appendBits(mode3.bits, i21);
                                int i35 = minimalEncoder$ResultList$ResultNode.characterLength;
                                if (i35 > 0) {
                                    bitArray6.appendBits(minimalEncoder$ResultList$ResultNode.getCharacterCountIndicator(), mode3.getCharacterCountBits((Version) nVar3.b));
                                }
                                if (mode3 == Mode.ECI) {
                                    bitArray6.appendBits(CharacterSetECI.getCharacterSetECI(((ECIEncoderSet) splitter2.strategy).encoders[i34].charset()).values[0], 8);
                                } else if (i35 > 0) {
                                    String str2 = (String) splitter2.trimmer;
                                    int i36 = minimalEncoder$ResultList$ResultNode.fromPosition;
                                    Encoder.appendBytes(str2.substring(i36, i35 + i36), mode3, bitArray6, ((ECIEncoderSet) splitter2.strategy).encoders[i34].charset());
                                }
                                i21 = 4;
                            }
                            version = (Version) nVar2.b;
                            bitArray = bitArray6;
                            Sniffer sniffer = version.ecBlocks[CameraSelector$$ExternalSyntheticOutline0.ordinal(i4)];
                            int i37 = version.totalCodewords;
                            int i38 = sniffer.peekLength;
                            Viewport[] viewportArr = (Viewport[]) sniffer.scratch;
                            length = viewportArr.length;
                            i10 = i5;
                            int i39 = i10;
                            while (i10 < length) {
                                i39 += viewportArr[i10].width;
                                i10++;
                            }
                            int i40 = i37 - (i39 * i38);
                            i11 = i40 * 8;
                            if (bitArray.size <= i11) {
                                throw new WriterException(Recorder$$ExternalSyntheticOutline2.m(bitArray.size, i11, " > ", new StringBuilder("data bits cannot fit in the QR Code")));
                            }
                            for (int i41 = i5; i41 < 4 && bitArray.size < i11; i41++) {
                                bitArray.appendBit(i5);
                            }
                            boolean z6 = i5;
                            int i42 = bitArray.size & 7;
                            if (i42 > 0) {
                                while (i42 < i22) {
                                    bitArray.appendBit(z6);
                                    i42++;
                                    z6 = 0;
                                }
                            }
                            int sizeInBytes2 = i40 - bitArray.getSizeInBytes();
                            for (int i43 = 0; i43 < sizeInBytes2; i43++) {
                                bitArray.appendBits((i43 & 1) == 0 ? EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE : 17, i22);
                            }
                            if (bitArray.size != i11) {
                                throw new WriterException("Bits size does not equal capacity");
                            }
                            int i44 = 0;
                            for (Viewport viewport : viewportArr) {
                                i44 += viewport.width;
                            }
                            if (bitArray.getSizeInBytes() != i40) {
                                throw new WriterException("Number of bits and data bytes does not match");
                            }
                            ArrayList arrayList = new ArrayList(i44);
                            int i45 = 0;
                            int i46 = 0;
                            int i47 = 0;
                            int i48 = 0;
                            BitArray bitArray7 = bitArray;
                            while (i45 < i44) {
                                int i49 = i3;
                                int i50 = i23;
                                int[] iArr = new int[i50];
                                int[] iArr2 = new int[i50];
                                if (i45 >= i44) {
                                    throw new WriterException("Block ID too large");
                                }
                                int i51 = i37 % i44;
                                int i52 = i44 - i51;
                                int i53 = i37 / i44;
                                int i54 = i40 / i44;
                                int i55 = i54 + 1;
                                int i56 = i53 - i54;
                                int i57 = (i53 + 1) - i55;
                                if (i56 != i57) {
                                    throw new WriterException("EC bytes mismatch");
                                }
                                if (i44 != i52 + i51) {
                                    throw new WriterException("RS blocks mismatch");
                                }
                                if (i37 != ((i55 + i57) * i51) + ((i54 + i56) * i52)) {
                                    throw new WriterException("Total bytes mismatch");
                                }
                                if (i45 < i52) {
                                    c = 0;
                                    iArr[0] = i54;
                                    iArr2[0] = i56;
                                } else {
                                    c = 0;
                                    iArr[0] = i55;
                                    iArr2[0] = i57;
                                }
                                int i58 = iArr[c];
                                byte[] bArr = new byte[i58];
                                int i59 = i46 * 8;
                                int i60 = i45;
                                int i61 = 0;
                                while (i61 < i58) {
                                    int i62 = i61;
                                    int i63 = i44;
                                    int i64 = 0;
                                    for (int i65 = 0; i65 < 8; i65++) {
                                        if (bitArray7.get(i59)) {
                                            i64 = (1 << (7 - i65)) | i64;
                                        }
                                        i59++;
                                    }
                                    bArr[i62] = (byte) i64;
                                    i61 = i62 + 1;
                                    i44 = i63;
                                }
                                int i66 = i44;
                                int i67 = iArr2[0];
                                int[] iArr3 = new int[i58 + i67];
                                for (int i68 = 0; i68 < i58; i68++) {
                                    iArr3[i68] = bArr[i68] & 255;
                                }
                                BinaryBitmap binaryBitmap = new BinaryBitmap(GenericGF.QR_CODE_FIELD_256);
                                GenericGF genericGF = (GenericGF) binaryBitmap.binarizer;
                                if (i67 != 0) {
                                    bitArray2 = bitArray7;
                                    int length2 = iArr3.length - i67;
                                    if (length2 > 0) {
                                        ArrayList arrayList2 = (ArrayList) binaryBitmap.matrix;
                                        i19 = i4;
                                        if (i67 >= arrayList2.size()) {
                                            GenericGFPoly genericGFPoly = (GenericGFPoly) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(1, arrayList2);
                                            int size2 = arrayList2.size();
                                            GenericGFPoly genericGFPoly2 = genericGFPoly;
                                            while (size2 <= i67) {
                                                int i69 = size2;
                                                genericGFPoly2 = genericGFPoly2.multiply(new GenericGFPoly(genericGF, new int[]{1, genericGF.expTable[(i69 - 1) + genericGF.generatorBase]}));
                                                arrayList2.add(genericGFPoly2);
                                                size2 = i69 + 1;
                                                i37 = i37;
                                                version = version;
                                            }
                                        }
                                        version2 = version;
                                        i18 = i37;
                                        GenericGFPoly genericGFPoly3 = (GenericGFPoly) arrayList2.get(i67);
                                        int[] iArr4 = new int[length2];
                                        System.arraycopy(iArr3, 0, iArr4, 0, length2);
                                        if (length2 != 0) {
                                            if (length2 > 1 && iArr4[0] == 0) {
                                                int i70 = 1;
                                                while (i70 < length2 && iArr4[i70] == 0) {
                                                    i70++;
                                                }
                                                if (i70 == length2) {
                                                    iArr4 = new int[]{0};
                                                } else {
                                                    int i71 = length2 - i70;
                                                    i20 = length2;
                                                    int[] iArr5 = new int[i71];
                                                    System.arraycopy(iArr4, i70, iArr5, 0, i71);
                                                    iArr4 = iArr5;
                                                    if (i67 < 0) {
                                                        int length3 = iArr4.length;
                                                        int[] iArr6 = new int[length3 + i67];
                                                        int i72 = 0;
                                                        while (i72 < length3) {
                                                            iArr6[i72] = genericGF.multiply(iArr4[i72], 1);
                                                            i72++;
                                                            length3 = length3;
                                                        }
                                                        GenericGFPoly genericGFPoly4 = new GenericGFPoly(genericGF, iArr6);
                                                        if (!genericGF.equals(genericGFPoly3.field)) {
                                                            a$$ExternalSyntheticBUOutline0.m$3("GenericGFPolys do not have same GenericGF field");
                                                        } else if (genericGFPoly3.isZero()) {
                                                            a$$ExternalSyntheticBUOutline0.m$3("Divide by 0");
                                                        } else {
                                                            GenericGFPoly genericGFPoly5 = genericGF.zero;
                                                            int inverse = genericGF.inverse(genericGFPoly3.getCoefficient(genericGFPoly3.getDegree()));
                                                            while (genericGFPoly4.getDegree() >= genericGFPoly3.getDegree() && !genericGFPoly4.isZero()) {
                                                                int degree = genericGFPoly4.getDegree() - genericGFPoly3.getDegree();
                                                                int multiply = genericGF.multiply(genericGFPoly4.getCoefficient(genericGFPoly4.getDegree()), inverse);
                                                                int i73 = inverse;
                                                                GenericGFPoly multiplyByMonomial = genericGFPoly3.multiplyByMonomial(degree, multiply);
                                                                genericGFPoly5 = genericGFPoly5.addOrSubtract(genericGF.buildMonomial(degree, multiply));
                                                                genericGFPoly4 = genericGFPoly4.addOrSubtract(multiplyByMonomial);
                                                                inverse = i73;
                                                            }
                                                            int[] iArr7 = new GenericGFPoly[]{genericGFPoly5, genericGFPoly4}[1].coefficients;
                                                            int length4 = i67 - iArr7.length;
                                                            for (int i74 = 0; i74 < length4; i74++) {
                                                                iArr3[i20 + i74] = 0;
                                                            }
                                                            System.arraycopy(iArr7, 0, iArr3, i20 + length4, iArr7.length);
                                                        }
                                                    } else {
                                                        Path$$ExternalSyntheticBUOutline0.m$3();
                                                    }
                                                }
                                            }
                                            i20 = length2;
                                            if (i67 < 0) {
                                            }
                                        } else {
                                            Path$$ExternalSyntheticBUOutline0.m$3();
                                        }
                                    } else {
                                        version2 = version;
                                        i18 = i37;
                                        i19 = i4;
                                        a$$ExternalSyntheticBUOutline0.m$3("No data bytes provided");
                                    }
                                } else {
                                    version2 = version;
                                    bitArray2 = bitArray7;
                                    i18 = i37;
                                    i19 = i4;
                                    a$$ExternalSyntheticBUOutline0.m$3("No error correction bytes");
                                }
                                byte[] bArr2 = new byte[i67];
                                for (int i75 = 0; i75 < i67; i75++) {
                                    bArr2[i75] = (byte) iArr3[i58 + i75];
                                }
                                arrayList.add(new BlockPair(bArr, bArr2));
                                i48 = Math.max(i48, i58);
                                i47 = Math.max(i47, i67);
                                i46 += iArr[0];
                                i45 = i60 + 1;
                                i44 = i66;
                                i3 = i49;
                                bitArray7 = bitArray2;
                                i4 = i19;
                                i37 = i18;
                                version = version2;
                                i23 = 1;
                            }
                            Version version3 = version;
                            int i76 = i37;
                            int i77 = i4;
                            int i78 = i3;
                            if (i40 != i46) {
                                throw new WriterException("Data bytes does not match offset");
                            }
                            BitArray bitArray8 = new BitArray();
                            for (int i79 = 0; i79 < i48; i79++) {
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    byte[] bArr3 = ((BlockPair) it2.next()).dataBytes;
                                    if (i79 < bArr3.length) {
                                        bitArray8.appendBits(bArr3[i79], 8);
                                    }
                                }
                            }
                            for (int i80 = 0; i80 < i47; i80++) {
                                Iterator it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                    byte[] bArr4 = ((BlockPair) it3.next()).errorCorrectionBytes;
                                    if (i80 < bArr4.length) {
                                        bitArray8.appendBits(bArr4[i80], 8);
                                    }
                                }
                            }
                            if (i76 != bitArray8.getSizeInBytes()) {
                                StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i76, "Interleaving error: ", " and ");
                                m2m.append(bitArray8.getSizeInBytes());
                                m2m.append(" differ.");
                                throw new WriterException(m2m.toString());
                            }
                            int i81 = (version3.versionNumber * 4) + 17;
                            OffsetApplier offsetApplier = new OffsetApplier(i81, i81);
                            int i82 = offsetApplier.nesting;
                            int i83 = offsetApplier.offset;
                            if (map != null) {
                                EncodeHintType encodeHintType7 = EncodeHintType.QR_MASK_PATTERN;
                                if (map.containsKey(encodeHintType7)) {
                                    i13 = Integer.parseInt(map.get(encodeHintType7).toString());
                                    i12 = 8;
                                    if (i13 >= 0) {
                                    }
                                    i13 = -1;
                                    if (i13 == -1) {
                                        int i84 = -1;
                                        int i85 = Integer.MAX_VALUE;
                                        int i86 = 0;
                                        while (i86 < i12) {
                                            int i87 = i77;
                                            MaskUtil.buildMatrix(bitArray8, i87, version3, i86, offsetApplier);
                                            int i88 = 0;
                                            int applyMaskPenaltyRule1Internal = MaskUtil.applyMaskPenaltyRule1Internal(offsetApplier, false) + MaskUtil.applyMaskPenaltyRule1Internal(offsetApplier, true);
                                            byte[][] bArr5 = (byte[][]) offsetApplier.applier;
                                            int i89 = 0;
                                            int i90 = 0;
                                            while (i89 < i82 - 1) {
                                                byte[] bArr6 = bArr5[i89];
                                                int i91 = i88;
                                                while (i91 < i83 - 1) {
                                                    byte b = bArr6[i91];
                                                    int i92 = i91 + 1;
                                                    int i93 = i91;
                                                    if (b == bArr6[i92]) {
                                                        byte[] bArr7 = bArr5[i89 + 1];
                                                        if (b == bArr7[i93] && b == bArr7[i92]) {
                                                            i90++;
                                                        }
                                                    }
                                                    i91 = i92;
                                                }
                                                i89++;
                                                i88 = 0;
                                            }
                                            int i94 = (i90 * 3) + applyMaskPenaltyRule1Internal;
                                            int i95 = 0;
                                            int i96 = 0;
                                            while (i95 < i82) {
                                                int i97 = 0;
                                                while (i97 < i83) {
                                                    byte[] bArr8 = bArr5[i95];
                                                    int i98 = i97 + 6;
                                                    int i99 = i84;
                                                    if (i98 < i83) {
                                                        i15 = i96;
                                                        byte b2 = 1;
                                                        if (bArr8[i97] == 1 && bArr8[i97 + 1] == 0 && bArr8[i97 + 2] == 1 && bArr8[i97 + 3] == 1 && bArr8[i97 + 4] == 1 && bArr8[i97 + 5] == 0 && bArr8[i98] == 1) {
                                                            int i100 = i97 - 4;
                                                            if (i100 >= 0 && bArr8.length >= i97) {
                                                                while (i100 < i97) {
                                                                    if (bArr8[i100] != b2) {
                                                                        i100++;
                                                                        b2 = 1;
                                                                    }
                                                                }
                                                                i96 = i15 + 1;
                                                                i16 = i95 + 6;
                                                                if (i16 < i82) {
                                                                    byte b3 = 1;
                                                                    if (bArr5[i95][i97] == 1 && bArr5[i95 + 1][i97] == 0 && bArr5[i95 + 2][i97] == 1 && bArr5[i95 + 3][i97] == 1 && bArr5[i95 + 4][i97] == 1 && bArr5[i95 + 5][i97] == 0 && bArr5[i16][i97] == 1) {
                                                                        int i101 = i95 - 4;
                                                                        if (i101 >= 0 && bArr5.length >= i95) {
                                                                            while (i101 < i95) {
                                                                                if (bArr5[i101][i97] != b3) {
                                                                                    i101++;
                                                                                    b3 = 1;
                                                                                }
                                                                            }
                                                                            i17 = i95;
                                                                            i96++;
                                                                            i97++;
                                                                            i84 = i99;
                                                                            i95 = i17;
                                                                        }
                                                                        int i102 = i95 + 7;
                                                                        int i103 = i95 + 11;
                                                                        if (i102 >= 0 && bArr5.length >= i103) {
                                                                            while (i102 < i103) {
                                                                                i17 = i95;
                                                                                if (bArr5[i102][i97] == 1) {
                                                                                    break;
                                                                                }
                                                                                i102++;
                                                                                i95 = i17;
                                                                            }
                                                                            i17 = i95;
                                                                            i96++;
                                                                            i97++;
                                                                            i84 = i99;
                                                                            i95 = i17;
                                                                        }
                                                                    }
                                                                }
                                                                i17 = i95;
                                                                i97++;
                                                                i84 = i99;
                                                                i95 = i17;
                                                            }
                                                            int i104 = i97 + 7;
                                                            int i105 = i97 + 11;
                                                            if (i104 >= 0 && bArr8.length >= i105) {
                                                                while (i104 < i105) {
                                                                    int i106 = i104;
                                                                    if (bArr8[i104] != 1) {
                                                                        i104 = i106 + 1;
                                                                    }
                                                                }
                                                                i96 = i15 + 1;
                                                                i16 = i95 + 6;
                                                                if (i16 < i82) {
                                                                }
                                                                i17 = i95;
                                                                i97++;
                                                                i84 = i99;
                                                                i95 = i17;
                                                            }
                                                        }
                                                    } else {
                                                        i15 = i96;
                                                    }
                                                    i96 = i15;
                                                    i16 = i95 + 6;
                                                    if (i16 < i82) {
                                                    }
                                                    i17 = i95;
                                                    i97++;
                                                    i84 = i99;
                                                    i95 = i17;
                                                }
                                                i95++;
                                            }
                                            int i107 = i84;
                                            int i108 = (i96 * 40) + i94;
                                            int i109 = 0;
                                            for (int i110 = 0; i110 < i82; i110++) {
                                                byte[] bArr9 = bArr5[i110];
                                                for (int i111 = 0; i111 < i83; i111++) {
                                                    if (bArr9[i111] == 1) {
                                                        i109++;
                                                    }
                                                }
                                            }
                                            int i112 = i82 * i83;
                                            int abs = (((Math.abs((i109 * 2) - i112) * 10) / i112) * 10) + i108;
                                            if (abs < i85) {
                                                i85 = abs;
                                                i84 = i86;
                                            } else {
                                                i84 = i107;
                                            }
                                            i86++;
                                            i77 = i87;
                                            i12 = 8;
                                        }
                                        i13 = i84;
                                    }
                                    MaskUtil.buildMatrix(bitArray8, i77, version3, i13, offsetApplier);
                                    int i113 = i78 * 2;
                                    int i114 = i83 + i113;
                                    int i115 = i113 + i82;
                                    int max = Math.max(i, i114);
                                    int max2 = Math.max(i2, i115);
                                    int min = Math.min(max / i114, max2 / i115);
                                    int i116 = (max - (i83 * min)) / 2;
                                    int i117 = (max2 - (i82 * min)) / 2;
                                    BitMatrix bitMatrix = new BitMatrix(max, max2);
                                    i14 = 0;
                                    while (i14 < i82) {
                                        int i118 = i116;
                                        int i119 = 0;
                                        while (i119 < i83) {
                                            if (offsetApplier.get(i119, i14) == 1) {
                                                bitMatrix.setRegion(i118, i117, min, min);
                                            }
                                            i119++;
                                            i118 += min;
                                        }
                                        i14++;
                                        i117 += min;
                                    }
                                    return bitMatrix;
                                }
                            }
                            i12 = 8;
                            i13 = -1;
                            if (i13 == -1) {
                            }
                            MaskUtil.buildMatrix(bitArray8, i77, version3, i13, offsetApplier);
                            int i1132 = i78 * 2;
                            int i1142 = i83 + i1132;
                            int i1152 = i1132 + i82;
                            int max3 = Math.max(i, i1142);
                            int max22 = Math.max(i2, i1152);
                            int min2 = Math.min(max3 / i1142, max22 / i1152);
                            int i1162 = (max3 - (i83 * min2)) / 2;
                            int i1172 = (max22 - (i82 * min2)) / 2;
                            BitMatrix bitMatrix2 = new BitMatrix(max3, max22);
                            i14 = 0;
                            while (i14 < i82) {
                            }
                            return bitMatrix2;
                        }
                        forName = charset;
                        int i222 = 8;
                        int i232 = 1;
                        if (z2) {
                        }
                        Sniffer sniffer2 = version.ecBlocks[CameraSelector$$ExternalSyntheticOutline0.ordinal(i4)];
                        int i372 = version.totalCodewords;
                        int i382 = sniffer2.peekLength;
                        Viewport[] viewportArr2 = (Viewport[]) sniffer2.scratch;
                        length = viewportArr2.length;
                        i10 = i5;
                        int i392 = i10;
                        while (i10 < length) {
                        }
                        int i402 = i372 - (i392 * i382);
                        i11 = i402 * 8;
                        if (bitArray.size <= i11) {
                        }
                    }
                }
                z2 = false;
                EncodeHintType encodeHintType52 = EncodeHintType.CHARACTER_SET;
                if (map2 == null) {
                }
                if (z3) {
                }
                forName = charset;
                int i2222 = 8;
                int i2322 = 1;
                if (z2) {
                }
                Sniffer sniffer22 = version.ecBlocks[CameraSelector$$ExternalSyntheticOutline0.ordinal(i4)];
                int i3722 = version.totalCodewords;
                int i3822 = sniffer22.peekLength;
                Viewport[] viewportArr22 = (Viewport[]) sniffer22.scratch;
                length = viewportArr22.length;
                i10 = i5;
                int i3922 = i10;
                while (i10 < length) {
                }
                int i4022 = i3722 - (i3922 * i3822);
                i11 = i4022 * 8;
                if (bitArray.size <= i11) {
                }
            }
        }
        z = false;
        if (map2 != null) {
        }
        z2 = false;
        EncodeHintType encodeHintType522 = EncodeHintType.CHARACTER_SET;
        if (map2 == null) {
        }
        if (z3) {
        }
        forName = charset;
        int i22222 = 8;
        int i23222 = 1;
        if (z2) {
        }
        Sniffer sniffer222 = version.ecBlocks[CameraSelector$$ExternalSyntheticOutline0.ordinal(i4)];
        int i37222 = version.totalCodewords;
        int i38222 = sniffer222.peekLength;
        Viewport[] viewportArr222 = (Viewport[]) sniffer222.scratch;
        length = viewportArr222.length;
        i10 = i5;
        int i39222 = i10;
        while (i10 < length) {
        }
        int i40222 = i37222 - (i39222 * i38222);
        i11 = i40222 * 8;
        if (bitArray.size <= i11) {
        }
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public byte[] getAeadId() {
        return HpkeUtil.CHACHA20_POLY1305_AEAD_ID;
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public int getKeyLength() {
        return 32;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanBuilder
    public DatadogSpanBuilder ignoreActiveSpan() {
        return new zza(2);
    }

    @Override // com.squareup.card.entry.validators.InputValidator
    public boolean isComplete(String str) {
        str.getClass();
        int length = str.length();
        return 2 <= length && length < 14;
    }

    @Override // com.squareup.card.entry.validators.InputValidator
    public boolean isValid(String str) {
        str.getClass();
        return true;
    }

    @Override // coil3.request.ImageRequest.Listener
    public void onError(ImageRequest imageRequest, ErrorResult errorResult) {
        Timber.Forest.e(errorResult.throwable);
    }

    @Override // coil3.request.ImageRequest.Listener
    public void onSuccess(SuccessResult successResult) {
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public byte[] open(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4) {
        if (bArr.length != 32) {
            AesGcmSiv$$ExternalSyntheticLambda0.m$1("Unexpected key length: 32");
            return null;
        }
        if (!ChaCha20Poly1305Jce.isSupported()) {
            return new InsecureNonceChaCha20Poly1305(bArr, 0).decrypt(ByteBuffer.wrap(Arrays.copyOfRange(bArr3, i, bArr3.length)), bArr2, bArr4);
        }
        Provider provider = ChaCha20Poly1305Jce.getValidCipherInstance().getProvider();
        if (!re$$ExternalSyntheticOutline0._isCompatible(1)) {
            a$$ExternalSyntheticBUOutline0.m$6("Can not use ChaCha20Poly1305 in FIPS-mode.");
            return null;
        }
        if (bArr.length != 32) {
            AesGcmSiv$$ExternalSyntheticLambda0.m$2("The key length in bytes must be 32.");
            return null;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "ChaCha20");
        if (bArr3 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("ciphertext is null");
            return null;
        }
        if (bArr2.length != 12) {
            a$$ExternalSyntheticBUOutline0.m$6("nonce length must be 12 bytes.");
            return null;
        }
        if (bArr3.length < i + 16) {
            a$$ExternalSyntheticBUOutline0.m$6("ciphertext too short");
            return null;
        }
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", provider);
        cipher.init(2, secretKeySpec, ivParameterSpec);
        if (bArr4.length != 0) {
            cipher.updateAAD(bArr4);
        }
        return cipher.doFinal(bArr3, i, bArr3.length - i);
    }

    @Override // com.squareup.cash.money.applets.sections.AppletTileUninstalledRowVariantProvider
    public List rowVariants(ArrayList arrayList, List list) {
        return EmptyList.INSTANCE;
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public byte[] seal(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4) {
        if (bArr.length != 32) {
            AesGcmSiv$$ExternalSyntheticLambda0.m$1("Unexpected key length: 32");
            return null;
        }
        if (!ChaCha20Poly1305Jce.isSupported()) {
            InsecureNonceChaCha20Poly1305 insecureNonceChaCha20Poly1305 = new InsecureNonceChaCha20Poly1305(bArr, 0);
            if (bArr3.length > 2147483631) {
                a$$ExternalSyntheticBUOutline0.m$6("plaintext too long");
                return null;
            }
            ByteBuffer allocate = ByteBuffer.allocate(bArr3.length + 16);
            insecureNonceChaCha20Poly1305.encrypt(allocate, bArr2, bArr3, bArr4);
            byte[] array2 = allocate.array();
            if (array2.length > Integer.MAX_VALUE - i) {
                AesGcmSiv$$ExternalSyntheticLambda0.m$1("Plaintext too long");
                return null;
            }
            byte[] bArr5 = new byte[array2.length + i];
            System.arraycopy(array2, 0, bArr5, i, array2.length);
            return bArr5;
        }
        Provider provider = ChaCha20Poly1305Jce.getValidCipherInstance().getProvider();
        if (!re$$ExternalSyntheticOutline0._isCompatible(1)) {
            a$$ExternalSyntheticBUOutline0.m$6("Can not use ChaCha20Poly1305 in FIPS-mode.");
            return null;
        }
        if (bArr.length != 32) {
            AesGcmSiv$$ExternalSyntheticLambda0.m$2("The key length in bytes must be 32.");
            return null;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "ChaCha20");
        if (bArr2.length != 12) {
            a$$ExternalSyntheticBUOutline0.m$6("nonce length must be 12 bytes.");
            return null;
        }
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", provider);
        cipher.init(1, secretKeySpec, ivParameterSpec);
        if (bArr4.length != 0) {
            cipher.updateAAD(bArr4);
        }
        int outputSize = cipher.getOutputSize(bArr3.length);
        if (outputSize > Integer.MAX_VALUE - i) {
            a$$ExternalSyntheticBUOutline0.m$6("plaintext too long");
            return null;
        }
        byte[] bArr6 = new byte[i + outputSize];
        if (cipher.doFinal(bArr3, 0, bArr3.length, bArr6, i) == outputSize) {
            return bArr6;
        }
        a$$ExternalSyntheticBUOutline0.m$6("not enough data written");
        return null;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanBuilder
    public DatadogSpan start() {
        NoOpDatadogSpan noOpDatadogSpan = new NoOpDatadogSpan();
        noOpDatadogSpan.operationName = "";
        return noOpDatadogSpan;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanBuilder
    public DatadogSpanBuilder withOrigin(String str) {
        return new zza(2);
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanBuilder
    public DatadogSpanBuilder withParentContext(DatadogSpanContext datadogSpanContext) {
        return new zza(2);
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanBuilder
    public DatadogSpanBuilder withResourceName(String str) {
        return new zza(2);
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanBuilder
    public DatadogSpanBuilder withStartTimestamp(long j) {
        return new zza(2);
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanBuilder
    public DatadogSpanBuilder withTag(Object obj, String str) {
        str.getClass();
        return new zza(2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
    public Object zza(Object obj) {
        return new Text.TextBlock((zzuz) obj);
    }
}
