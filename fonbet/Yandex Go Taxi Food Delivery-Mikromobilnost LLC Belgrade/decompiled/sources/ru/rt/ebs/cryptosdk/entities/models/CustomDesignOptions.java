package ru.rt.ebs.cryptosdk.entities.models;

import com.google.ar.core.ImageMetadata;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.gqg0;
import defpackage.k5a1;
import defpackage.ly3;
import defpackage.qv10;
import defpackage.t1i0;
import defpackage.unr0;
import defpackage.vfc;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/rt/ebs/cryptosdk/entities/models/CustomDesignOptions;", "Lru/rt/ebs/cryptosdk/entities/models/DesignOptions;", "cryptoSdkDesign", "Lru/rt/ebs/cryptosdk/entities/models/CryptoSdkDesign;", "<init>", "(Lru/rt/ebs/cryptosdk/entities/models/CryptoSdkDesign;)V", "getCryptoSdkDesign", "()Lru/rt/ebs/cryptosdk/entities/models/CryptoSdkDesign;", "Builder", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CustomDesignOptions extends DesignOptions {
    private final CryptoSdkDesign cryptoSdkDesign;

    private CustomDesignOptions(CryptoSdkDesign cryptoSdkDesign) {
        super(null);
        this.cryptoSdkDesign = cryptoSdkDesign;
    }

    public final CryptoSdkDesign getCryptoSdkDesign() {
        return this.cryptoSdkDesign;
    }

    public /* synthetic */ CustomDesignOptions(CryptoSdkDesign cryptoSdkDesign, DefaultConstructorMarker defaultConstructorMarker) {
        this(cryptoSdkDesign);
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bý\u0003\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006\u0012\b\b\u0003\u0010\t\u001a\u00020\u0006\u0012\b\b\u0003\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0003\u0010\r\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0003\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u0014\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u0015\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u0016\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u0017\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u0018\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u0019\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u001a\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u001b\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u001c\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u001d\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u001e\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u001f\u001a\u00020\u0006\u0012\b\b\u0003\u0010 \u001a\u00020\u0006\u0012\b\b\u0003\u0010!\u001a\u00020\u0006\u0012\b\b\u0003\u0010\"\u001a\u00020\u0006\u0012\b\b\u0003\u0010#\u001a\u00020\u0006\u0012\b\b\u0003\u0010$\u001a\u00020\u0006\u0012\b\b\u0003\u0010%\u001a\u00020\u0006\u0012\b\b\u0003\u0010&\u001a\u00020\u0006\u0012\b\b\u0003\u0010'\u001a\u00020\u0006\u0012\b\b\u0003\u0010(\u001a\u00020\u0006\u0012\b\b\u0003\u0010)\u001a\u00020\u0006\u0012\b\b\u0003\u0010*\u001a\u00020\u0006\u0012\b\b\u0003\u0010+\u001a\u00020\u0006\u0012\b\b\u0003\u0010,\u001a\u00020\u0006\u0012\b\b\u0003\u0010-\u001a\u00020\u0006\u0012\b\b\u0003\u0010.\u001a\u00020\u0006\u0012\b\b\u0003\u0010/\u001a\u00020\u0006\u0012\b\b\u0003\u00100\u001a\u00020\u0006\u0012\b\b\u0003\u00101\u001a\u00020\u0006\u0012\b\b\u0003\u00102\u001a\u00020\u0006\u0012\b\b\u0003\u00103\u001a\u00020\u0006\u0012\b\b\u0003\u00104\u001a\u00020\u0006\u0012\b\b\u0003\u00105\u001a\u00020\u0006\u0012\b\b\u0003\u00106\u001a\u00020\u0006\u0012\b\b\u0003\u00107\u001a\u00020\u0006¢\u0006\u0004\b8\u00109J\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u0010\u000e\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u0010\u000f\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u0010\u0015\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u0010\u0016\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u0010\u0017\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u0010\u0014\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u0010>\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u0010\u0019\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u0010\u001a\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u0010?\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u0010\u001c\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u0010\u001d\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u0010\u001e\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u0010\u001f\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u0010 \u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u0010!\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u0010\"\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u0010#\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u0010$\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u0010%\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u0010&\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u0010'\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u0010(\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u0010)\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u0010*\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u0010+\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u0010,\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u0010-\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u0010.\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u0010/\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u00100\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u00101\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u00102\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u00103\u001a\u00020\u00002\b\b\u0001\u0010@\u001a\u00020\u0006J\u0010\u00104\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u00105\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u00106\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0010\u00107\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0006J\u0006\u0010A\u001a\u00020BJ\t\u0010C\u001a\u00020\u0003HÂ\u0003J\t\u0010D\u001a\u00020\u0003HÂ\u0003J\t\u0010E\u001a\u00020\u0006HÂ\u0003J\t\u0010F\u001a\u00020\u0006HÂ\u0003J\t\u0010G\u001a\u00020\u0006HÂ\u0003J\t\u0010H\u001a\u00020\u0006HÂ\u0003J\t\u0010I\u001a\u00020\u0006HÂ\u0003J\t\u0010J\u001a\u00020\fHÂ\u0003J\t\u0010K\u001a\u00020\u0006HÂ\u0003J\t\u0010L\u001a\u00020\u0006HÂ\u0003J\t\u0010M\u001a\u00020\u0006HÂ\u0003J\t\u0010N\u001a\u00020\u0006HÂ\u0003J\t\u0010O\u001a\u00020\u0012HÂ\u0003J\t\u0010P\u001a\u00020\u0006HÂ\u0003J\t\u0010Q\u001a\u00020\u0006HÂ\u0003J\t\u0010R\u001a\u00020\u0006HÂ\u0003J\t\u0010S\u001a\u00020\u0006HÂ\u0003J\t\u0010T\u001a\u00020\u0006HÂ\u0003J\t\u0010U\u001a\u00020\u0006HÂ\u0003J\t\u0010V\u001a\u00020\u0006HÂ\u0003J\t\u0010W\u001a\u00020\u0006HÂ\u0003J\t\u0010X\u001a\u00020\u0006HÂ\u0003J\t\u0010Y\u001a\u00020\u0006HÂ\u0003J\t\u0010Z\u001a\u00020\u0006HÂ\u0003J\t\u0010[\u001a\u00020\u0006HÂ\u0003J\t\u0010\\\u001a\u00020\u0006HÂ\u0003J\t\u0010]\u001a\u00020\u0006HÂ\u0003J\t\u0010^\u001a\u00020\u0006HÂ\u0003J\t\u0010_\u001a\u00020\u0006HÂ\u0003J\t\u0010`\u001a\u00020\u0006HÂ\u0003J\t\u0010a\u001a\u00020\u0006HÂ\u0003J\t\u0010b\u001a\u00020\u0006HÂ\u0003J\t\u0010c\u001a\u00020\u0006HÂ\u0003J\t\u0010d\u001a\u00020\u0006HÂ\u0003J\t\u0010e\u001a\u00020\u0006HÂ\u0003J\t\u0010f\u001a\u00020\u0006HÂ\u0003J\t\u0010g\u001a\u00020\u0006HÂ\u0003J\t\u0010h\u001a\u00020\u0006HÂ\u0003J\t\u0010i\u001a\u00020\u0006HÂ\u0003J\t\u0010j\u001a\u00020\u0006HÂ\u0003J\t\u0010k\u001a\u00020\u0006HÂ\u0003J\t\u0010l\u001a\u00020\u0006HÂ\u0003J\t\u0010m\u001a\u00020\u0006HÂ\u0003J\t\u0010n\u001a\u00020\u0006HÂ\u0003J\t\u0010o\u001a\u00020\u0006HÂ\u0003J\t\u0010p\u001a\u00020\u0006HÂ\u0003J\t\u0010q\u001a\u00020\u0006HÂ\u0003J\t\u0010r\u001a\u00020\u0006HÂ\u0003J\t\u0010s\u001a\u00020\u0006HÂ\u0003J\t\u0010t\u001a\u00020\u0006HÂ\u0003Jý\u0003\u0010u\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u00062\b\b\u0003\u0010\t\u001a\u00020\u00062\b\b\u0003\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\r\u001a\u00020\u00062\b\b\u0003\u0010\u000e\u001a\u00020\u00062\b\b\u0003\u0010\u000f\u001a\u00020\u00062\b\b\u0003\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0003\u0010\u0013\u001a\u00020\u00062\b\b\u0003\u0010\u0014\u001a\u00020\u00062\b\b\u0003\u0010\u0015\u001a\u00020\u00062\b\b\u0003\u0010\u0016\u001a\u00020\u00062\b\b\u0003\u0010\u0017\u001a\u00020\u00062\b\b\u0003\u0010\u0018\u001a\u00020\u00062\b\b\u0003\u0010\u0019\u001a\u00020\u00062\b\b\u0003\u0010\u001a\u001a\u00020\u00062\b\b\u0003\u0010\u001b\u001a\u00020\u00062\b\b\u0003\u0010\u001c\u001a\u00020\u00062\b\b\u0003\u0010\u001d\u001a\u00020\u00062\b\b\u0003\u0010\u001e\u001a\u00020\u00062\b\b\u0003\u0010\u001f\u001a\u00020\u00062\b\b\u0003\u0010 \u001a\u00020\u00062\b\b\u0003\u0010!\u001a\u00020\u00062\b\b\u0003\u0010\"\u001a\u00020\u00062\b\b\u0003\u0010#\u001a\u00020\u00062\b\b\u0003\u0010$\u001a\u00020\u00062\b\b\u0003\u0010%\u001a\u00020\u00062\b\b\u0003\u0010&\u001a\u00020\u00062\b\b\u0003\u0010'\u001a\u00020\u00062\b\b\u0003\u0010(\u001a\u00020\u00062\b\b\u0003\u0010)\u001a\u00020\u00062\b\b\u0003\u0010*\u001a\u00020\u00062\b\b\u0003\u0010+\u001a\u00020\u00062\b\b\u0003\u0010,\u001a\u00020\u00062\b\b\u0003\u0010-\u001a\u00020\u00062\b\b\u0003\u0010.\u001a\u00020\u00062\b\b\u0003\u0010/\u001a\u00020\u00062\b\b\u0003\u00100\u001a\u00020\u00062\b\b\u0003\u00101\u001a\u00020\u00062\b\b\u0003\u00102\u001a\u00020\u00062\b\b\u0003\u00103\u001a\u00020\u00062\b\b\u0003\u00104\u001a\u00020\u00062\b\b\u0003\u00105\u001a\u00020\u00062\b\b\u0003\u00106\u001a\u00020\u00062\b\b\u0003\u00107\u001a\u00020\u0006HÆ\u0001J\u0013\u0010v\u001a\u00020\u00032\b\u0010w\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010x\u001a\u00020\u0006HÖ\u0001J\t\u0010y\u001a\u00020zHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006{"}, d2 = {"Lru/rt/ebs/cryptosdk/entities/models/CustomDesignOptions$Builder;", "", "isStatusBarLight", "", "isBiometryCapturingStatusBarLight", "headerTextColor", "", "headerBackgroundColor", "biometryCapturingHeaderTextColor", "biometryCapturingHeaderBackgroundColor", "biometryCapturingCameraSwitchIconColor", "buttonCornerRadius", "Lru/rt/ebs/cryptosdk/entities/models/ButtonCornerRadius;", "buttonBackgroundColorEnabled", "buttonBackgroundColorDisabled", "buttonTextColor", "frameColor", "frameThickness", "Lru/rt/ebs/cryptosdk/entities/models/FrameThickness;", "biometryCapturingInstructionsTextColor", "biometryCapturingInstructionsBackgroundColor", "biometryInstructionsBackgroundColor", "biometryInstructionsTextColor", "biometryInstructionsTextBulletPointsColor", "dataProcessingBackgroundColor", "dataProcessingTextColor", "dataProcessingLoaderColor", "processingWidgetBackgroundColor", "processingWidgetTextColor", "processingWidgetLoaderColor", "processingWidgetScreenDarkeningColor", "successfulVerificationWidgetBackgroundColor", "successfulVerificationWidgetIconColor", "successfulVerificationWidgetTextColor", "successfulVerificationWidgetDarkeningColor", "failedVerificationBackgroundColor", "failedVerificationTextColorPrimary", "failedVerificationTextColorSecondary", "failedVerificationTextBulletPointsColor", "accessDeniedBackgroundColor", "accessDeniedTextColorPrimary", "accessDeniedTextColorSecondary", "verificationErrorBackgroundColor", "verificationErrorTextColorPrimary", "verificationErrorTextColorSecondary", "verificationAttemptsExceededBackgroundColor", "verificationAttemptsExceededTextColorPrimary", "verificationAttemptsExceededTextColorSecondary", "noInternetConnectionBackgroundColor", "noInternetConnectionTextColorPrimary", "noInternetConnectionTextColorSecondary", "alertDialogStyle", "attentionIconColor", "attentionIconBackground", "cancelIconColor", "cancelIconBackground", "<init>", "(ZZIIIIILru/rt/ebs/cryptosdk/entities/models/ButtonCornerRadius;IIIILru/rt/ebs/cryptosdk/entities/models/FrameThickness;IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII)V", "isLight", "color", "radius", "thickness", "dataProcessingBackground", "processingWidgetBackground", "style", "build", "Lru/rt/ebs/cryptosdk/entities/models/DesignOptions;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "copy", "equals", "other", "hashCode", "toString", "", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Builder {
        private int accessDeniedBackgroundColor;
        private int accessDeniedTextColorPrimary;
        private int accessDeniedTextColorSecondary;
        private int alertDialogStyle;
        private int attentionIconBackground;
        private int attentionIconColor;
        private int biometryCapturingCameraSwitchIconColor;
        private int biometryCapturingHeaderBackgroundColor;
        private int biometryCapturingHeaderTextColor;
        private int biometryCapturingInstructionsBackgroundColor;
        private int biometryCapturingInstructionsTextColor;
        private int biometryInstructionsBackgroundColor;
        private int biometryInstructionsTextBulletPointsColor;
        private int biometryInstructionsTextColor;
        private int buttonBackgroundColorDisabled;
        private int buttonBackgroundColorEnabled;
        private ButtonCornerRadius buttonCornerRadius;
        private int buttonTextColor;
        private int cancelIconBackground;
        private int cancelIconColor;
        private int dataProcessingBackgroundColor;
        private int dataProcessingLoaderColor;
        private int dataProcessingTextColor;
        private int failedVerificationBackgroundColor;
        private int failedVerificationTextBulletPointsColor;
        private int failedVerificationTextColorPrimary;
        private int failedVerificationTextColorSecondary;
        private int frameColor;
        private FrameThickness frameThickness;
        private int headerBackgroundColor;
        private int headerTextColor;
        private boolean isBiometryCapturingStatusBarLight;
        private boolean isStatusBarLight;
        private int noInternetConnectionBackgroundColor;
        private int noInternetConnectionTextColorPrimary;
        private int noInternetConnectionTextColorSecondary;
        private int processingWidgetBackgroundColor;
        private int processingWidgetLoaderColor;
        private int processingWidgetScreenDarkeningColor;
        private int processingWidgetTextColor;
        private int successfulVerificationWidgetBackgroundColor;
        private int successfulVerificationWidgetDarkeningColor;
        private int successfulVerificationWidgetIconColor;
        private int successfulVerificationWidgetTextColor;
        private int verificationAttemptsExceededBackgroundColor;
        private int verificationAttemptsExceededTextColorPrimary;
        private int verificationAttemptsExceededTextColorSecondary;
        private int verificationErrorBackgroundColor;
        private int verificationErrorTextColorPrimary;
        private int verificationErrorTextColorSecondary;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8, int i9, FrameThickness frameThickness, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, int i37, int i38, int i39, int i40, int i41, int i42, int i43, int i44, int i45, int i46, int i47, int i48, DefaultConstructorMarker defaultConstructorMarker) {
            this(r43, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r17, r19, r21, r22, r23, r24, (i47 & 2097152) != 0 ? r22 : i18, (i47 & SelfTester_JCP.ENCRYPT_CBC) != 0 ? r23 : i19, (i47 & SelfTester_JCP.ENCRYPT_CNT) != 0 ? r24 : i20, (i47 & 16777216) != 0 ? gqg0.semitransparent : i21, (i47 & SelfTester_JCP.DECRYPT_CFB) != 0 ? gqg0.ebssdk_col_successful_verification_background : i22, (i47 & SelfTester_JCP.DECRYPT_CBC) != 0 ? gqg0.ebssdk_col_successful_verification_icon : i23, (i47 & SelfTester_JCP.DECRYPT_CNT) != 0 ? gqg0.ebssdk_col_successful_verification_text : i24, (i47 & SelfTester_JCP.IMITA) != 0 ? gqg0.semitransparent : i25, (i47 & 536870912) != 0 ? gqg0.ebssdk_col_esia_background : i26, (i47 & 1073741824) != 0 ? gqg0.ebssdk_col_text_message_dark : i27, (i47 & Integer.MIN_VALUE) != 0 ? gqg0.ebssdk_col_text_message : i28, (i48 & 1) != 0 ? gqg0.ebssdk_col_bullet_points_default : i29, (i48 & 2) != 0 ? gqg0.ebssdk_col_esia_background : i30, (i48 & 4) != 0 ? gqg0.ebssdk_col_text_message_dark : i31, (i48 & 8) != 0 ? gqg0.ebssdk_col_text_message : i32, (i48 & 16) != 0 ? gqg0.ebssdk_col_esia_background : i33, (i48 & 32) != 0 ? gqg0.ebssdk_col_text_message_dark : i34, (i48 & 64) != 0 ? gqg0.ebssdk_col_text_message : i35, (i48 & 128) != 0 ? gqg0.ebssdk_col_esia_background : i36, (i48 & 256) != 0 ? gqg0.ebssdk_col_text_message_dark : i37, (i48 & 512) != 0 ? gqg0.ebssdk_col_text_message : i38, (i48 & 1024) != 0 ? gqg0.ebssdk_col_esia_background : i39, (i48 & 2048) != 0 ? gqg0.ebssdk_col_text_message_dark : i40, (i48 & 4096) != 0 ? gqg0.ebssdk_col_text_message : i41, (i48 & 8192) != 0 ? t1i0.Ebssdk_DialogStyle : i42, (i48 & 16384) != 0 ? gqg0.ebssdk_col_icon_primary : i43, (i48 & 32768) != 0 ? gqg0.transparent : i44, (i48 & 65536) != 0 ? gqg0.ebssdk_col_icon_primary : i45, (i48 & 131072) != 0 ? gqg0.transparent : i46);
            ButtonCornerRadius buttonCornerRadius2;
            FrameThickness frameThickness2;
            boolean z3 = (i47 & 1) != 0 ? true : z;
            boolean z4 = (i47 & 2) != 0 ? false : z2;
            int i49 = (i47 & 4) != 0 ? gqg0.ebssdk_col_header_text : i;
            int i50 = (i47 & 8) != 0 ? gqg0.ebssdk_col_header_background : i2;
            int i51 = (i47 & 16) != 0 ? gqg0.ebssdk_col_biometry_capturing_header_text : i3;
            int i52 = (i47 & 32) != 0 ? gqg0.ebssdk_col_header_background : i4;
            int i53 = (i47 & 64) != 0 ? gqg0.ebssdk_col_biometry_capturing_icon_switch : i5;
            if ((i47 & 128) != 0) {
                ButtonCornerRadius.Companion.getClass();
                buttonCornerRadius2 = ButtonCornerRadius.DP_12;
            } else {
                buttonCornerRadius2 = buttonCornerRadius;
            }
            int i54 = (i47 & 256) != 0 ? gqg0.ebssdk_col_btn_background_enabled : i6;
            int i55 = (i47 & 512) != 0 ? gqg0.ebssdk_col_btn_background_disabled : i7;
            int i56 = (i47 & 1024) != 0 ? gqg0.ebssdk_col_btn_text : i8;
            int i57 = (i47 & 2048) != 0 ? gqg0.ebssdk_col_frame : i9;
            if ((i47 & 4096) != 0) {
                FrameThickness.Companion.getClass();
                frameThickness2 = FrameThickness.DP_4;
            } else {
                frameThickness2 = frameThickness;
            }
            int i58 = (i47 & 8192) != 0 ? gqg0.ebssdk_col_instruction_text_default : i10;
            boolean z5 = z3;
            int i59 = (i47 & 16384) != 0 ? gqg0.ebssdk_col_instruction_background_default : i11;
            int i60 = (i47 & 32768) != 0 ? gqg0.ebssdk_col_esia_background : i12;
            int i61 = (i47 & 65536) != 0 ? gqg0.ebssdk_col_text_message_dark : i13;
            int i62 = (i47 & 131072) != 0 ? gqg0.ebssdk_col_bullet_points_default : i14;
            int i63 = (i47 & 262144) != 0 ? gqg0.ebssdk_col_processing_background : i15;
            int i64 = (i47 & 524288) != 0 ? gqg0.ebssdk_col_processing_text : i16;
            int i65 = (i47 & 1048576) != 0 ? gqg0.ebssdk_col_processing_loader : i17;
        }

        /* renamed from: component1, reason: from getter */
        private final boolean getIsStatusBarLight() {
            return this.isStatusBarLight;
        }

        /* renamed from: component10, reason: from getter */
        private final int getButtonBackgroundColorDisabled() {
            return this.buttonBackgroundColorDisabled;
        }

        /* renamed from: component11, reason: from getter */
        private final int getButtonTextColor() {
            return this.buttonTextColor;
        }

        /* renamed from: component12, reason: from getter */
        private final int getFrameColor() {
            return this.frameColor;
        }

        /* renamed from: component13, reason: from getter */
        private final FrameThickness getFrameThickness() {
            return this.frameThickness;
        }

        /* renamed from: component14, reason: from getter */
        private final int getBiometryCapturingInstructionsTextColor() {
            return this.biometryCapturingInstructionsTextColor;
        }

        /* renamed from: component15, reason: from getter */
        private final int getBiometryCapturingInstructionsBackgroundColor() {
            return this.biometryCapturingInstructionsBackgroundColor;
        }

        /* renamed from: component16, reason: from getter */
        private final int getBiometryInstructionsBackgroundColor() {
            return this.biometryInstructionsBackgroundColor;
        }

        /* renamed from: component17, reason: from getter */
        private final int getBiometryInstructionsTextColor() {
            return this.biometryInstructionsTextColor;
        }

        /* renamed from: component18, reason: from getter */
        private final int getBiometryInstructionsTextBulletPointsColor() {
            return this.biometryInstructionsTextBulletPointsColor;
        }

        /* renamed from: component19, reason: from getter */
        private final int getDataProcessingBackgroundColor() {
            return this.dataProcessingBackgroundColor;
        }

        /* renamed from: component2, reason: from getter */
        private final boolean getIsBiometryCapturingStatusBarLight() {
            return this.isBiometryCapturingStatusBarLight;
        }

        /* renamed from: component20, reason: from getter */
        private final int getDataProcessingTextColor() {
            return this.dataProcessingTextColor;
        }

        /* renamed from: component21, reason: from getter */
        private final int getDataProcessingLoaderColor() {
            return this.dataProcessingLoaderColor;
        }

        /* renamed from: component22, reason: from getter */
        private final int getProcessingWidgetBackgroundColor() {
            return this.processingWidgetBackgroundColor;
        }

        /* renamed from: component23, reason: from getter */
        private final int getProcessingWidgetTextColor() {
            return this.processingWidgetTextColor;
        }

        /* renamed from: component24, reason: from getter */
        private final int getProcessingWidgetLoaderColor() {
            return this.processingWidgetLoaderColor;
        }

        /* renamed from: component25, reason: from getter */
        private final int getProcessingWidgetScreenDarkeningColor() {
            return this.processingWidgetScreenDarkeningColor;
        }

        /* renamed from: component26, reason: from getter */
        private final int getSuccessfulVerificationWidgetBackgroundColor() {
            return this.successfulVerificationWidgetBackgroundColor;
        }

        /* renamed from: component27, reason: from getter */
        private final int getSuccessfulVerificationWidgetIconColor() {
            return this.successfulVerificationWidgetIconColor;
        }

        /* renamed from: component28, reason: from getter */
        private final int getSuccessfulVerificationWidgetTextColor() {
            return this.successfulVerificationWidgetTextColor;
        }

        /* renamed from: component29, reason: from getter */
        private final int getSuccessfulVerificationWidgetDarkeningColor() {
            return this.successfulVerificationWidgetDarkeningColor;
        }

        /* renamed from: component3, reason: from getter */
        private final int getHeaderTextColor() {
            return this.headerTextColor;
        }

        /* renamed from: component30, reason: from getter */
        private final int getFailedVerificationBackgroundColor() {
            return this.failedVerificationBackgroundColor;
        }

        /* renamed from: component31, reason: from getter */
        private final int getFailedVerificationTextColorPrimary() {
            return this.failedVerificationTextColorPrimary;
        }

        /* renamed from: component32, reason: from getter */
        private final int getFailedVerificationTextColorSecondary() {
            return this.failedVerificationTextColorSecondary;
        }

        /* renamed from: component33, reason: from getter */
        private final int getFailedVerificationTextBulletPointsColor() {
            return this.failedVerificationTextBulletPointsColor;
        }

        /* renamed from: component34, reason: from getter */
        private final int getAccessDeniedBackgroundColor() {
            return this.accessDeniedBackgroundColor;
        }

        /* renamed from: component35, reason: from getter */
        private final int getAccessDeniedTextColorPrimary() {
            return this.accessDeniedTextColorPrimary;
        }

        /* renamed from: component36, reason: from getter */
        private final int getAccessDeniedTextColorSecondary() {
            return this.accessDeniedTextColorSecondary;
        }

        /* renamed from: component37, reason: from getter */
        private final int getVerificationErrorBackgroundColor() {
            return this.verificationErrorBackgroundColor;
        }

        /* renamed from: component38, reason: from getter */
        private final int getVerificationErrorTextColorPrimary() {
            return this.verificationErrorTextColorPrimary;
        }

        /* renamed from: component39, reason: from getter */
        private final int getVerificationErrorTextColorSecondary() {
            return this.verificationErrorTextColorSecondary;
        }

        /* renamed from: component4, reason: from getter */
        private final int getHeaderBackgroundColor() {
            return this.headerBackgroundColor;
        }

        /* renamed from: component40, reason: from getter */
        private final int getVerificationAttemptsExceededBackgroundColor() {
            return this.verificationAttemptsExceededBackgroundColor;
        }

        /* renamed from: component41, reason: from getter */
        private final int getVerificationAttemptsExceededTextColorPrimary() {
            return this.verificationAttemptsExceededTextColorPrimary;
        }

        /* renamed from: component42, reason: from getter */
        private final int getVerificationAttemptsExceededTextColorSecondary() {
            return this.verificationAttemptsExceededTextColorSecondary;
        }

        /* renamed from: component43, reason: from getter */
        private final int getNoInternetConnectionBackgroundColor() {
            return this.noInternetConnectionBackgroundColor;
        }

        /* renamed from: component44, reason: from getter */
        private final int getNoInternetConnectionTextColorPrimary() {
            return this.noInternetConnectionTextColorPrimary;
        }

        /* renamed from: component45, reason: from getter */
        private final int getNoInternetConnectionTextColorSecondary() {
            return this.noInternetConnectionTextColorSecondary;
        }

        /* renamed from: component46, reason: from getter */
        private final int getAlertDialogStyle() {
            return this.alertDialogStyle;
        }

        /* renamed from: component47, reason: from getter */
        private final int getAttentionIconColor() {
            return this.attentionIconColor;
        }

        /* renamed from: component48, reason: from getter */
        private final int getAttentionIconBackground() {
            return this.attentionIconBackground;
        }

        /* renamed from: component49, reason: from getter */
        private final int getCancelIconColor() {
            return this.cancelIconColor;
        }

        /* renamed from: component5, reason: from getter */
        private final int getBiometryCapturingHeaderTextColor() {
            return this.biometryCapturingHeaderTextColor;
        }

        /* renamed from: component50, reason: from getter */
        private final int getCancelIconBackground() {
            return this.cancelIconBackground;
        }

        /* renamed from: component6, reason: from getter */
        private final int getBiometryCapturingHeaderBackgroundColor() {
            return this.biometryCapturingHeaderBackgroundColor;
        }

        /* renamed from: component7, reason: from getter */
        private final int getBiometryCapturingCameraSwitchIconColor() {
            return this.biometryCapturingCameraSwitchIconColor;
        }

        /* renamed from: component8, reason: from getter */
        private final ButtonCornerRadius getButtonCornerRadius() {
            return this.buttonCornerRadius;
        }

        /* renamed from: component9, reason: from getter */
        private final int getButtonBackgroundColorEnabled() {
            return this.buttonBackgroundColorEnabled;
        }

        public final Builder accessDeniedBackgroundColor(int color) {
            this.accessDeniedBackgroundColor = color;
            return this;
        }

        public final Builder accessDeniedTextColorPrimary(int color) {
            this.accessDeniedTextColorPrimary = color;
            return this;
        }

        public final Builder accessDeniedTextColorSecondary(int color) {
            this.accessDeniedTextColorSecondary = color;
            return this;
        }

        public final Builder alertDialogStyle(int style) {
            this.alertDialogStyle = style;
            return this;
        }

        public final Builder attentionIconBackground(int color) {
            this.attentionIconBackground = color;
            return this;
        }

        public final Builder attentionIconColor(int color) {
            this.attentionIconColor = color;
            return this;
        }

        public final Builder biometryCapturingCameraSwitchIconColor(int color) {
            this.biometryCapturingCameraSwitchIconColor = color;
            return this;
        }

        public final Builder biometryCapturingHeaderBackgroundColor(int color) {
            this.biometryCapturingHeaderBackgroundColor = color;
            return this;
        }

        public final Builder biometryCapturingHeaderTextColor(int color) {
            this.biometryCapturingHeaderTextColor = color;
            return this;
        }

        public final Builder biometryCapturingInstructionsBackgroundColor(int color) {
            this.biometryCapturingInstructionsBackgroundColor = color;
            return this;
        }

        public final Builder biometryCapturingInstructionsTextColor(int color) {
            this.biometryCapturingInstructionsTextColor = color;
            return this;
        }

        public final Builder biometryInstructionsBackgroundColor(int color) {
            this.biometryInstructionsBackgroundColor = color;
            return this;
        }

        public final Builder biometryInstructionsTextBulletPointsColor(int color) {
            this.biometryInstructionsTextBulletPointsColor = color;
            return this;
        }

        public final Builder biometryInstructionsTextColor(int color) {
            this.biometryInstructionsTextColor = color;
            return this;
        }

        public final DesignOptions build() {
            return new CustomDesignOptions(new CryptoSdkDesign(this.isStatusBarLight, this.isBiometryCapturingStatusBarLight, this.headerTextColor, this.headerBackgroundColor, this.biometryCapturingHeaderTextColor, this.biometryCapturingHeaderBackgroundColor, this.biometryCapturingCameraSwitchIconColor, this.buttonCornerRadius, this.buttonBackgroundColorEnabled, this.buttonBackgroundColorDisabled, this.buttonTextColor, this.frameColor, this.frameThickness, this.biometryCapturingInstructionsTextColor, this.biometryCapturingInstructionsBackgroundColor, this.biometryInstructionsBackgroundColor, this.biometryInstructionsTextColor, this.biometryInstructionsTextBulletPointsColor, this.dataProcessingBackgroundColor, this.dataProcessingTextColor, this.dataProcessingLoaderColor, this.processingWidgetBackgroundColor, this.processingWidgetTextColor, this.processingWidgetLoaderColor, this.processingWidgetScreenDarkeningColor, this.successfulVerificationWidgetBackgroundColor, this.successfulVerificationWidgetIconColor, this.successfulVerificationWidgetTextColor, this.successfulVerificationWidgetDarkeningColor, this.failedVerificationBackgroundColor, this.failedVerificationTextColorPrimary, this.failedVerificationTextColorSecondary, this.failedVerificationTextBulletPointsColor, this.accessDeniedBackgroundColor, this.accessDeniedTextColorPrimary, this.accessDeniedTextColorSecondary, this.verificationErrorBackgroundColor, this.verificationErrorTextColorPrimary, this.verificationErrorTextColorSecondary, this.verificationAttemptsExceededBackgroundColor, this.verificationAttemptsExceededTextColorPrimary, this.verificationAttemptsExceededTextColorSecondary, this.noInternetConnectionBackgroundColor, this.noInternetConnectionTextColorPrimary, this.noInternetConnectionTextColorSecondary, this.alertDialogStyle, this.attentionIconColor, this.attentionIconBackground, this.cancelIconColor, this.cancelIconBackground), null);
        }

        public final Builder buttonBackgroundColorDisabled(int color) {
            this.buttonBackgroundColorDisabled = color;
            return this;
        }

        public final Builder buttonBackgroundColorEnabled(int color) {
            this.buttonBackgroundColorEnabled = color;
            return this;
        }

        public final Builder buttonCornerRadius(ButtonCornerRadius radius) {
            this.buttonCornerRadius = radius;
            return this;
        }

        public final Builder buttonTextColor(int color) {
            this.buttonTextColor = color;
            return this;
        }

        public final Builder cancelIconBackground(int color) {
            this.cancelIconBackground = color;
            return this;
        }

        public final Builder cancelIconColor(int color) {
            this.cancelIconColor = color;
            return this;
        }

        public final Builder copy(boolean isStatusBarLight, boolean isBiometryCapturingStatusBarLight, int headerTextColor, int headerBackgroundColor, int biometryCapturingHeaderTextColor, int biometryCapturingHeaderBackgroundColor, int biometryCapturingCameraSwitchIconColor, ButtonCornerRadius buttonCornerRadius, int buttonBackgroundColorEnabled, int buttonBackgroundColorDisabled, int buttonTextColor, int frameColor, FrameThickness frameThickness, int biometryCapturingInstructionsTextColor, int biometryCapturingInstructionsBackgroundColor, int biometryInstructionsBackgroundColor, int biometryInstructionsTextColor, int biometryInstructionsTextBulletPointsColor, int dataProcessingBackgroundColor, int dataProcessingTextColor, int dataProcessingLoaderColor, int processingWidgetBackgroundColor, int processingWidgetTextColor, int processingWidgetLoaderColor, int processingWidgetScreenDarkeningColor, int successfulVerificationWidgetBackgroundColor, int successfulVerificationWidgetIconColor, int successfulVerificationWidgetTextColor, int successfulVerificationWidgetDarkeningColor, int failedVerificationBackgroundColor, int failedVerificationTextColorPrimary, int failedVerificationTextColorSecondary, int failedVerificationTextBulletPointsColor, int accessDeniedBackgroundColor, int accessDeniedTextColorPrimary, int accessDeniedTextColorSecondary, int verificationErrorBackgroundColor, int verificationErrorTextColorPrimary, int verificationErrorTextColorSecondary, int verificationAttemptsExceededBackgroundColor, int verificationAttemptsExceededTextColorPrimary, int verificationAttemptsExceededTextColorSecondary, int noInternetConnectionBackgroundColor, int noInternetConnectionTextColorPrimary, int noInternetConnectionTextColorSecondary, int alertDialogStyle, int attentionIconColor, int attentionIconBackground, int cancelIconColor, int cancelIconBackground) {
            return new Builder(isStatusBarLight, isBiometryCapturingStatusBarLight, headerTextColor, headerBackgroundColor, biometryCapturingHeaderTextColor, biometryCapturingHeaderBackgroundColor, biometryCapturingCameraSwitchIconColor, buttonCornerRadius, buttonBackgroundColorEnabled, buttonBackgroundColorDisabled, buttonTextColor, frameColor, frameThickness, biometryCapturingInstructionsTextColor, biometryCapturingInstructionsBackgroundColor, biometryInstructionsBackgroundColor, biometryInstructionsTextColor, biometryInstructionsTextBulletPointsColor, dataProcessingBackgroundColor, dataProcessingTextColor, dataProcessingLoaderColor, processingWidgetBackgroundColor, processingWidgetTextColor, processingWidgetLoaderColor, processingWidgetScreenDarkeningColor, successfulVerificationWidgetBackgroundColor, successfulVerificationWidgetIconColor, successfulVerificationWidgetTextColor, successfulVerificationWidgetDarkeningColor, failedVerificationBackgroundColor, failedVerificationTextColorPrimary, failedVerificationTextColorSecondary, failedVerificationTextBulletPointsColor, accessDeniedBackgroundColor, accessDeniedTextColorPrimary, accessDeniedTextColorSecondary, verificationErrorBackgroundColor, verificationErrorTextColorPrimary, verificationErrorTextColorSecondary, verificationAttemptsExceededBackgroundColor, verificationAttemptsExceededTextColorPrimary, verificationAttemptsExceededTextColorSecondary, noInternetConnectionBackgroundColor, noInternetConnectionTextColorPrimary, noInternetConnectionTextColorSecondary, alertDialogStyle, attentionIconColor, attentionIconBackground, cancelIconColor, cancelIconBackground);
        }

        public final Builder dataProcessingBackground(int color) {
            this.dataProcessingBackgroundColor = color;
            return this;
        }

        public final Builder dataProcessingLoaderColor(int color) {
            this.dataProcessingLoaderColor = color;
            return this;
        }

        public final Builder dataProcessingTextColor(int color) {
            this.dataProcessingTextColor = color;
            return this;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) other;
            return this.isStatusBarLight == builder.isStatusBarLight && this.isBiometryCapturingStatusBarLight == builder.isBiometryCapturingStatusBarLight && this.headerTextColor == builder.headerTextColor && this.headerBackgroundColor == builder.headerBackgroundColor && this.biometryCapturingHeaderTextColor == builder.biometryCapturingHeaderTextColor && this.biometryCapturingHeaderBackgroundColor == builder.biometryCapturingHeaderBackgroundColor && this.biometryCapturingCameraSwitchIconColor == builder.biometryCapturingCameraSwitchIconColor && this.buttonCornerRadius == builder.buttonCornerRadius && this.buttonBackgroundColorEnabled == builder.buttonBackgroundColorEnabled && this.buttonBackgroundColorDisabled == builder.buttonBackgroundColorDisabled && this.buttonTextColor == builder.buttonTextColor && this.frameColor == builder.frameColor && this.frameThickness == builder.frameThickness && this.biometryCapturingInstructionsTextColor == builder.biometryCapturingInstructionsTextColor && this.biometryCapturingInstructionsBackgroundColor == builder.biometryCapturingInstructionsBackgroundColor && this.biometryInstructionsBackgroundColor == builder.biometryInstructionsBackgroundColor && this.biometryInstructionsTextColor == builder.biometryInstructionsTextColor && this.biometryInstructionsTextBulletPointsColor == builder.biometryInstructionsTextBulletPointsColor && this.dataProcessingBackgroundColor == builder.dataProcessingBackgroundColor && this.dataProcessingTextColor == builder.dataProcessingTextColor && this.dataProcessingLoaderColor == builder.dataProcessingLoaderColor && this.processingWidgetBackgroundColor == builder.processingWidgetBackgroundColor && this.processingWidgetTextColor == builder.processingWidgetTextColor && this.processingWidgetLoaderColor == builder.processingWidgetLoaderColor && this.processingWidgetScreenDarkeningColor == builder.processingWidgetScreenDarkeningColor && this.successfulVerificationWidgetBackgroundColor == builder.successfulVerificationWidgetBackgroundColor && this.successfulVerificationWidgetIconColor == builder.successfulVerificationWidgetIconColor && this.successfulVerificationWidgetTextColor == builder.successfulVerificationWidgetTextColor && this.successfulVerificationWidgetDarkeningColor == builder.successfulVerificationWidgetDarkeningColor && this.failedVerificationBackgroundColor == builder.failedVerificationBackgroundColor && this.failedVerificationTextColorPrimary == builder.failedVerificationTextColorPrimary && this.failedVerificationTextColorSecondary == builder.failedVerificationTextColorSecondary && this.failedVerificationTextBulletPointsColor == builder.failedVerificationTextBulletPointsColor && this.accessDeniedBackgroundColor == builder.accessDeniedBackgroundColor && this.accessDeniedTextColorPrimary == builder.accessDeniedTextColorPrimary && this.accessDeniedTextColorSecondary == builder.accessDeniedTextColorSecondary && this.verificationErrorBackgroundColor == builder.verificationErrorBackgroundColor && this.verificationErrorTextColorPrimary == builder.verificationErrorTextColorPrimary && this.verificationErrorTextColorSecondary == builder.verificationErrorTextColorSecondary && this.verificationAttemptsExceededBackgroundColor == builder.verificationAttemptsExceededBackgroundColor && this.verificationAttemptsExceededTextColorPrimary == builder.verificationAttemptsExceededTextColorPrimary && this.verificationAttemptsExceededTextColorSecondary == builder.verificationAttemptsExceededTextColorSecondary && this.noInternetConnectionBackgroundColor == builder.noInternetConnectionBackgroundColor && this.noInternetConnectionTextColorPrimary == builder.noInternetConnectionTextColorPrimary && this.noInternetConnectionTextColorSecondary == builder.noInternetConnectionTextColorSecondary && this.alertDialogStyle == builder.alertDialogStyle && this.attentionIconColor == builder.attentionIconColor && this.attentionIconBackground == builder.attentionIconBackground && this.cancelIconColor == builder.cancelIconColor && this.cancelIconBackground == builder.cancelIconBackground;
        }

        public final Builder failedVerificationBackgroundColor(int color) {
            this.failedVerificationBackgroundColor = color;
            return this;
        }

        public final Builder failedVerificationTextBulletPointsColor(int color) {
            this.failedVerificationTextBulletPointsColor = color;
            return this;
        }

        public final Builder failedVerificationTextColorPrimary(int color) {
            this.failedVerificationTextColorPrimary = color;
            return this;
        }

        public final Builder failedVerificationTextColorSecondary(int color) {
            this.failedVerificationTextColorSecondary = color;
            return this;
        }

        public final Builder frameColor(int color) {
            this.frameColor = color;
            return this;
        }

        public final Builder frameThickness(FrameThickness thickness) {
            this.frameThickness = thickness;
            return this;
        }

        public int hashCode() {
            return Integer.hashCode(this.cancelIconBackground) + k5a1.a(this.cancelIconColor, k5a1.a(this.attentionIconBackground, k5a1.a(this.attentionIconColor, k5a1.a(this.alertDialogStyle, k5a1.a(this.noInternetConnectionTextColorSecondary, k5a1.a(this.noInternetConnectionTextColorPrimary, k5a1.a(this.noInternetConnectionBackgroundColor, k5a1.a(this.verificationAttemptsExceededTextColorSecondary, k5a1.a(this.verificationAttemptsExceededTextColorPrimary, k5a1.a(this.verificationAttemptsExceededBackgroundColor, k5a1.a(this.verificationErrorTextColorSecondary, k5a1.a(this.verificationErrorTextColorPrimary, k5a1.a(this.verificationErrorBackgroundColor, k5a1.a(this.accessDeniedTextColorSecondary, k5a1.a(this.accessDeniedTextColorPrimary, k5a1.a(this.accessDeniedBackgroundColor, k5a1.a(this.failedVerificationTextBulletPointsColor, k5a1.a(this.failedVerificationTextColorSecondary, k5a1.a(this.failedVerificationTextColorPrimary, k5a1.a(this.failedVerificationBackgroundColor, k5a1.a(this.successfulVerificationWidgetDarkeningColor, k5a1.a(this.successfulVerificationWidgetTextColor, k5a1.a(this.successfulVerificationWidgetIconColor, k5a1.a(this.successfulVerificationWidgetBackgroundColor, k5a1.a(this.processingWidgetScreenDarkeningColor, k5a1.a(this.processingWidgetLoaderColor, k5a1.a(this.processingWidgetTextColor, k5a1.a(this.processingWidgetBackgroundColor, k5a1.a(this.dataProcessingLoaderColor, k5a1.a(this.dataProcessingTextColor, k5a1.a(this.dataProcessingBackgroundColor, k5a1.a(this.biometryInstructionsTextBulletPointsColor, k5a1.a(this.biometryInstructionsTextColor, k5a1.a(this.biometryInstructionsBackgroundColor, k5a1.a(this.biometryCapturingInstructionsBackgroundColor, k5a1.a(this.biometryCapturingInstructionsTextColor, (this.frameThickness.hashCode() + k5a1.a(this.frameColor, k5a1.a(this.buttonTextColor, k5a1.a(this.buttonBackgroundColorDisabled, k5a1.a(this.buttonBackgroundColorEnabled, (this.buttonCornerRadius.hashCode() + k5a1.a(this.biometryCapturingCameraSwitchIconColor, k5a1.a(this.biometryCapturingHeaderBackgroundColor, k5a1.a(this.biometryCapturingHeaderTextColor, k5a1.a(this.headerBackgroundColor, k5a1.a(this.headerTextColor, unr0.e(Boolean.hashCode(this.isStatusBarLight) * 31, 31, this.isBiometryCapturingStatusBarLight))))))) * 31))))) * 31))))))))))))))))))))))))))))))))))));
        }

        public final Builder headerBackgroundColor(int color) {
            this.headerBackgroundColor = color;
            return this;
        }

        public final Builder headerTextColor(int color) {
            this.headerTextColor = color;
            return this;
        }

        public final Builder isBiometryCapturingStatusBarLight(boolean isLight) {
            this.isBiometryCapturingStatusBarLight = isLight;
            return this;
        }

        public final Builder isStatusBarLight(boolean isLight) {
            this.isStatusBarLight = isLight;
            return this;
        }

        public final Builder noInternetConnectionBackgroundColor(int color) {
            this.noInternetConnectionBackgroundColor = color;
            return this;
        }

        public final Builder noInternetConnectionTextColorPrimary(int color) {
            this.noInternetConnectionTextColorPrimary = color;
            return this;
        }

        public final Builder noInternetConnectionTextColorSecondary(int color) {
            this.noInternetConnectionTextColorSecondary = color;
            return this;
        }

        public final Builder processingWidgetBackground(int color) {
            this.processingWidgetBackgroundColor = color;
            return this;
        }

        public final Builder processingWidgetLoaderColor(int color) {
            this.processingWidgetLoaderColor = color;
            return this;
        }

        public final Builder processingWidgetScreenDarkeningColor(int color) {
            this.processingWidgetScreenDarkeningColor = color;
            return this;
        }

        public final Builder processingWidgetTextColor(int color) {
            this.processingWidgetTextColor = color;
            return this;
        }

        public final Builder successfulVerificationWidgetBackgroundColor(int color) {
            this.successfulVerificationWidgetBackgroundColor = color;
            return this;
        }

        public final Builder successfulVerificationWidgetDarkeningColor(int color) {
            this.successfulVerificationWidgetDarkeningColor = color;
            return this;
        }

        public final Builder successfulVerificationWidgetIconColor(int color) {
            this.successfulVerificationWidgetIconColor = color;
            return this;
        }

        public final Builder successfulVerificationWidgetTextColor(int color) {
            this.successfulVerificationWidgetTextColor = color;
            return this;
        }

        public String toString() {
            boolean z = this.isStatusBarLight;
            boolean z2 = this.isBiometryCapturingStatusBarLight;
            int i = this.headerTextColor;
            int i2 = this.headerBackgroundColor;
            int i3 = this.biometryCapturingHeaderTextColor;
            int i4 = this.biometryCapturingHeaderBackgroundColor;
            int i5 = this.biometryCapturingCameraSwitchIconColor;
            ButtonCornerRadius buttonCornerRadius = this.buttonCornerRadius;
            int i6 = this.buttonBackgroundColorEnabled;
            int i7 = this.buttonBackgroundColorDisabled;
            int i8 = this.buttonTextColor;
            int i9 = this.frameColor;
            FrameThickness frameThickness = this.frameThickness;
            int i10 = this.biometryCapturingInstructionsTextColor;
            int i11 = this.biometryCapturingInstructionsBackgroundColor;
            int i12 = this.biometryInstructionsBackgroundColor;
            int i13 = this.biometryInstructionsTextColor;
            int i14 = this.biometryInstructionsTextBulletPointsColor;
            int i15 = this.dataProcessingBackgroundColor;
            int i16 = this.dataProcessingTextColor;
            int i17 = this.dataProcessingLoaderColor;
            int i18 = this.processingWidgetBackgroundColor;
            int i19 = this.processingWidgetTextColor;
            int i20 = this.processingWidgetLoaderColor;
            int i21 = this.processingWidgetScreenDarkeningColor;
            int i22 = this.successfulVerificationWidgetBackgroundColor;
            int i23 = this.successfulVerificationWidgetIconColor;
            int i24 = this.successfulVerificationWidgetTextColor;
            int i25 = this.successfulVerificationWidgetDarkeningColor;
            int i26 = this.failedVerificationBackgroundColor;
            int i27 = this.failedVerificationTextColorPrimary;
            int i28 = this.failedVerificationTextColorSecondary;
            int i29 = this.failedVerificationTextBulletPointsColor;
            int i30 = this.accessDeniedBackgroundColor;
            int i31 = this.accessDeniedTextColorPrimary;
            int i32 = this.accessDeniedTextColorSecondary;
            int i33 = this.verificationErrorBackgroundColor;
            int i34 = this.verificationErrorTextColorPrimary;
            int i35 = this.verificationErrorTextColorSecondary;
            int i36 = this.verificationAttemptsExceededBackgroundColor;
            int i37 = this.verificationAttemptsExceededTextColorPrimary;
            int i38 = this.verificationAttemptsExceededTextColorSecondary;
            int i39 = this.noInternetConnectionBackgroundColor;
            int i40 = this.noInternetConnectionTextColorPrimary;
            int i41 = this.noInternetConnectionTextColorSecondary;
            int i42 = this.alertDialogStyle;
            int i43 = this.attentionIconColor;
            int i44 = this.attentionIconBackground;
            int i45 = this.cancelIconColor;
            int i46 = this.cancelIconBackground;
            StringBuilder u = qv10.u("Builder(isStatusBarLight=", ", isBiometryCapturingStatusBarLight=", ", headerTextColor=", z, z2);
            vfc.u(i, i2, ", headerBackgroundColor=", ", biometryCapturingHeaderTextColor=", u);
            vfc.u(i3, i4, ", biometryCapturingHeaderBackgroundColor=", ", biometryCapturingCameraSwitchIconColor=", u);
            u.append(i5);
            u.append(", buttonCornerRadius=");
            u.append(buttonCornerRadius);
            u.append(", buttonBackgroundColorEnabled=");
            vfc.u(i6, i7, ", buttonBackgroundColorDisabled=", ", buttonTextColor=", u);
            vfc.u(i8, i9, ", frameColor=", ", frameThickness=", u);
            u.append(frameThickness);
            u.append(", biometryCapturingInstructionsTextColor=");
            u.append(i10);
            u.append(", biometryCapturingInstructionsBackgroundColor=");
            vfc.u(i11, i12, ", biometryInstructionsBackgroundColor=", ", biometryInstructionsTextColor=", u);
            vfc.u(i13, i14, ", biometryInstructionsTextBulletPointsColor=", ", dataProcessingBackgroundColor=", u);
            vfc.u(i15, i16, ", dataProcessingTextColor=", ", dataProcessingLoaderColor=", u);
            vfc.u(i17, i18, ", processingWidgetBackgroundColor=", ", processingWidgetTextColor=", u);
            vfc.u(i19, i20, ", processingWidgetLoaderColor=", ", processingWidgetScreenDarkeningColor=", u);
            vfc.u(i21, i22, ", successfulVerificationWidgetBackgroundColor=", ", successfulVerificationWidgetIconColor=", u);
            vfc.u(i23, i24, ", successfulVerificationWidgetTextColor=", ", successfulVerificationWidgetDarkeningColor=", u);
            vfc.u(i25, i26, ", failedVerificationBackgroundColor=", ", failedVerificationTextColorPrimary=", u);
            vfc.u(i27, i28, ", failedVerificationTextColorSecondary=", ", failedVerificationTextBulletPointsColor=", u);
            vfc.u(i29, i30, ", accessDeniedBackgroundColor=", ", accessDeniedTextColorPrimary=", u);
            vfc.u(i31, i32, ", accessDeniedTextColorSecondary=", ", verificationErrorBackgroundColor=", u);
            vfc.u(i33, i34, ", verificationErrorTextColorPrimary=", ", verificationErrorTextColorSecondary=", u);
            vfc.u(i35, i36, ", verificationAttemptsExceededBackgroundColor=", ", verificationAttemptsExceededTextColorPrimary=", u);
            vfc.u(i37, i38, ", verificationAttemptsExceededTextColorSecondary=", ", noInternetConnectionBackgroundColor=", u);
            vfc.u(i39, i40, ", noInternetConnectionTextColorPrimary=", ", noInternetConnectionTextColorSecondary=", u);
            vfc.u(i41, i42, ", alertDialogStyle=", ", attentionIconColor=", u);
            vfc.u(i43, i44, ", attentionIconBackground=", ", cancelIconColor=", u);
            return ly3.k(i45, i46, ", cancelIconBackground=", Extension.C_BRAKE, u);
        }

        public final Builder verificationAttemptsExceededBackgroundColor(int color) {
            this.verificationAttemptsExceededBackgroundColor = color;
            return this;
        }

        public final Builder verificationAttemptsExceededTextColorPrimary(int color) {
            this.verificationAttemptsExceededTextColorPrimary = color;
            return this;
        }

        public final Builder verificationAttemptsExceededTextColorSecondary(int color) {
            this.verificationAttemptsExceededTextColorSecondary = color;
            return this;
        }

        public final Builder verificationErrorBackgroundColor(int color) {
            this.verificationErrorBackgroundColor = color;
            return this;
        }

        public final Builder verificationErrorTextColorPrimary(int color) {
            this.verificationErrorTextColorPrimary = color;
            return this;
        }

        public final Builder verificationErrorTextColorSecondary(int color) {
            this.verificationErrorTextColorSecondary = color;
            return this;
        }

        public Builder(boolean z) {
            this(z, false, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 262143, null);
        }

        public Builder(boolean z, boolean z2) {
            this(z, z2, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 262143, null);
        }

        public Builder(boolean z, boolean z2, int i) {
            this(z, z2, i, 0, 0, 0, 0, null, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -8, 262143, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2) {
            this(z, z2, i, i2, 0, 0, 0, null, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -16, 262143, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3) {
            this(z, z2, i, i2, i3, 0, 0, null, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -32, 262143, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4) {
            this(z, z2, i, i2, i3, i4, 0, null, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -64, 262143, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5) {
            this(z, z2, i, i2, i3, i4, i5, null, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -128, 262143, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -256, 262143, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, i6, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -512, 262143, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, i6, i7, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1024, 262143, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, i6, i7, i8, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2048, 262143, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8, int i9) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, i6, i7, i8, i9, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4096, 262143, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8, int i9, FrameThickness frameThickness) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, i6, i7, i8, i9, frameThickness, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -8192, 262143, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8, int i9, FrameThickness frameThickness, int i10) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, i6, i7, i8, i9, frameThickness, i10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -16384, 262143, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8, int i9, FrameThickness frameThickness, int i10, int i11) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, i6, i7, i8, i9, frameThickness, i10, i11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -32768, 262143, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8, int i9, FrameThickness frameThickness, int i10, int i11, int i12) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, i6, i7, i8, i9, frameThickness, i10, i11, i12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -65536, 262143, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8, int i9, FrameThickness frameThickness, int i10, int i11, int i12, int i13) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, i6, i7, i8, i9, frameThickness, i10, i11, i12, i13, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -131072, 262143, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8, int i9, FrameThickness frameThickness, int i10, int i11, int i12, int i13, int i14) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, i6, i7, i8, i9, frameThickness, i10, i11, i12, i13, i14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -262144, 262143, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8, int i9, FrameThickness frameThickness, int i10, int i11, int i12, int i13, int i14, int i15) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, i6, i7, i8, i9, frameThickness, i10, i11, i12, i13, i14, i15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -524288, 262143, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8, int i9, FrameThickness frameThickness, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, i6, i7, i8, i9, frameThickness, i10, i11, i12, i13, i14, i15, i16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1048576, 262143, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8, int i9, FrameThickness frameThickness, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, i6, i7, i8, i9, frameThickness, i10, i11, i12, i13, i14, i15, i16, i17, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2097152, 262143, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8, int i9, FrameThickness frameThickness, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, i6, i7, i8, i9, frameThickness, i10, i11, i12, i13, i14, i15, i16, i17, i18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4194304, 262143, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8, int i9, FrameThickness frameThickness, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, i6, i7, i8, i9, frameThickness, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -8388608, 262143, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8, int i9, FrameThickness frameThickness, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, i6, i7, i8, i9, frameThickness, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ModalContentViewContainer.BASE_SHADOW_COLOR, 262143, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8, int i9, FrameThickness frameThickness, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, i6, i7, i8, i9, frameThickness, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -33554432, 262143, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8, int i9, FrameThickness frameThickness, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, i6, i7, i8, i9, frameThickness, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -67108864, 262143, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8, int i9, FrameThickness frameThickness, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, i6, i7, i8, i9, frameThickness, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -134217728, 262143, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8, int i9, FrameThickness frameThickness, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, i6, i7, i8, i9, frameThickness, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -268435456, 262143, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8, int i9, FrameThickness frameThickness, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, i6, i7, i8, i9, frameThickness, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -536870912, 262143, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8, int i9, FrameThickness frameThickness, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, i6, i7, i8, i9, frameThickness, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1073741824, 262143, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8, int i9, FrameThickness frameThickness, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, i6, i7, i8, i9, frameThickness, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Integer.MIN_VALUE, 262143, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8, int i9, FrameThickness frameThickness, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, i6, i7, i8, i9, frameThickness, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 262143, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8, int i9, FrameThickness frameThickness, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, i6, i7, i8, i9, frameThickness, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 262142, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8, int i9, FrameThickness frameThickness, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, i6, i7, i8, i9, frameThickness, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 262140, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8, int i9, FrameThickness frameThickness, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, i6, i7, i8, i9, frameThickness, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 262136, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8, int i9, FrameThickness frameThickness, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, i6, i7, i8, i9, frameThickness, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 262128, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8, int i9, FrameThickness frameThickness, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, i6, i7, i8, i9, frameThickness, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 262112, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8, int i9, FrameThickness frameThickness, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, i6, i7, i8, i9, frameThickness, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, i34, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 262080, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8, int i9, FrameThickness frameThickness, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, i6, i7, i8, i9, frameThickness, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, i34, i35, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 262016, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8, int i9, FrameThickness frameThickness, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, i6, i7, i8, i9, frameThickness, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, i34, i35, i36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 261888, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8, int i9, FrameThickness frameThickness, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, int i37) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, i6, i7, i8, i9, frameThickness, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, i34, i35, i36, i37, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 261632, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8, int i9, FrameThickness frameThickness, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, int i37, int i38) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, i6, i7, i8, i9, frameThickness, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, i34, i35, i36, i37, i38, 0, 0, 0, 0, 0, 0, 0, 0, 0, 261120, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8, int i9, FrameThickness frameThickness, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, int i37, int i38, int i39) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, i6, i7, i8, i9, frameThickness, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, i34, i35, i36, i37, i38, i39, 0, 0, 0, 0, 0, 0, 0, 0, 260096, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8, int i9, FrameThickness frameThickness, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, int i37, int i38, int i39, int i40) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, i6, i7, i8, i9, frameThickness, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, i34, i35, i36, i37, i38, i39, i40, 0, 0, 0, 0, 0, 0, 0, 258048, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8, int i9, FrameThickness frameThickness, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, int i37, int i38, int i39, int i40, int i41) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, i6, i7, i8, i9, frameThickness, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, i34, i35, i36, i37, i38, i39, i40, i41, 0, 0, 0, 0, 0, 0, 253952, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8, int i9, FrameThickness frameThickness, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, int i37, int i38, int i39, int i40, int i41, int i42) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, i6, i7, i8, i9, frameThickness, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, i34, i35, i36, i37, i38, i39, i40, i41, i42, 0, 0, 0, 0, 0, 245760, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8, int i9, FrameThickness frameThickness, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, int i37, int i38, int i39, int i40, int i41, int i42, int i43) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, i6, i7, i8, i9, frameThickness, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, i34, i35, i36, i37, i38, i39, i40, i41, i42, i43, 0, 0, 0, 0, 229376, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8, int i9, FrameThickness frameThickness, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, int i37, int i38, int i39, int i40, int i41, int i42, int i43, int i44) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, i6, i7, i8, i9, frameThickness, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, i34, i35, i36, i37, i38, i39, i40, i41, i42, i43, i44, 0, 0, 0, ImageMetadata.EDGE_MODE, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8, int i9, FrameThickness frameThickness, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, int i37, int i38, int i39, int i40, int i41, int i42, int i43, int i44, int i45) {
            this(z, z2, i, i2, i3, i4, i5, buttonCornerRadius, i6, i7, i8, i9, frameThickness, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, i34, i35, i36, i37, i38, i39, i40, i41, i42, i43, i44, i45, 0, 0, 131072, null);
        }

        public Builder(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, ButtonCornerRadius buttonCornerRadius, int i6, int i7, int i8, int i9, FrameThickness frameThickness, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, int i37, int i38, int i39, int i40, int i41, int i42, int i43, int i44, int i45, int i46) {
            this.isStatusBarLight = z;
            this.isBiometryCapturingStatusBarLight = z2;
            this.headerTextColor = i;
            this.headerBackgroundColor = i2;
            this.biometryCapturingHeaderTextColor = i3;
            this.biometryCapturingHeaderBackgroundColor = i4;
            this.biometryCapturingCameraSwitchIconColor = i5;
            this.buttonCornerRadius = buttonCornerRadius;
            this.buttonBackgroundColorEnabled = i6;
            this.buttonBackgroundColorDisabled = i7;
            this.buttonTextColor = i8;
            this.frameColor = i9;
            this.frameThickness = frameThickness;
            this.biometryCapturingInstructionsTextColor = i10;
            this.biometryCapturingInstructionsBackgroundColor = i11;
            this.biometryInstructionsBackgroundColor = i12;
            this.biometryInstructionsTextColor = i13;
            this.biometryInstructionsTextBulletPointsColor = i14;
            this.dataProcessingBackgroundColor = i15;
            this.dataProcessingTextColor = i16;
            this.dataProcessingLoaderColor = i17;
            this.processingWidgetBackgroundColor = i18;
            this.processingWidgetTextColor = i19;
            this.processingWidgetLoaderColor = i20;
            this.processingWidgetScreenDarkeningColor = i21;
            this.successfulVerificationWidgetBackgroundColor = i22;
            this.successfulVerificationWidgetIconColor = i23;
            this.successfulVerificationWidgetTextColor = i24;
            this.successfulVerificationWidgetDarkeningColor = i25;
            this.failedVerificationBackgroundColor = i26;
            this.failedVerificationTextColorPrimary = i27;
            this.failedVerificationTextColorSecondary = i28;
            this.failedVerificationTextBulletPointsColor = i29;
            this.accessDeniedBackgroundColor = i30;
            this.accessDeniedTextColorPrimary = i31;
            this.accessDeniedTextColorSecondary = i32;
            this.verificationErrorBackgroundColor = i33;
            this.verificationErrorTextColorPrimary = i34;
            this.verificationErrorTextColorSecondary = i35;
            this.verificationAttemptsExceededBackgroundColor = i36;
            this.verificationAttemptsExceededTextColorPrimary = i37;
            this.verificationAttemptsExceededTextColorSecondary = i38;
            this.noInternetConnectionBackgroundColor = i39;
            this.noInternetConnectionTextColorPrimary = i40;
            this.noInternetConnectionTextColorSecondary = i41;
            this.alertDialogStyle = i42;
            this.attentionIconColor = i43;
            this.attentionIconBackground = i44;
            this.cancelIconColor = i45;
            this.cancelIconBackground = i46;
        }

        public Builder() {
            this(false, false, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 262143, null);
        }
    }
}
