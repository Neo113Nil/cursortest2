package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.util.Size;
import android.util.SparseArray;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.utils.ImageUtil$CodecFailedException;
import androidx.camera.core.internal.utils.a;
import androidx.compose.foundation.lazy.b;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.j;
import com.google.android.gms.auth.blockstore.restorecredential.ClearRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.internal.IClearRestoreCredentialCallback;
import com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.squareup.moshi.Moshi;
import com.yandex.div.state.db.StateEntry;
import com.yandex.go.taxi.intercity.dashboard.impl.analytics.debug.IntercityDashboardErrorException;
import com.yandex.messaging.input.bricks.writing.InputDraft;
import com.yandex.plus.home.feature.webviews.internal.settings.domain.ChangePlusSettingsInteractor$ChangeSettingError;
import core.network.mapi.exception.MapiClientException;
import defpackage.atx0;
import defpackage.ntx0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes11.dex */
public final class reu implements qeu, qw31, iqs, tcu0, pui0, ezv, hqs, txz, a600, nb10 {
    public final /* synthetic */ int a;
    public Object b;

    public reu(a73 a73Var, int i) {
        this.a = i;
        switch (i) {
            case 15:
                this.b = (IncorrectJpegMetadataQuirk) a73Var.b(IncorrectJpegMetadataQuirk.class);
                break;
            default:
                this.b = new reu(a73Var, 15);
                break;
        }
    }

    public static r74 D(w64 w64Var) {
        k590 k590Var = w64Var.a;
        jdv jdvVar = (jdv) k590Var.c();
        Rect b = k590Var.b();
        try {
            byte[] d = a.d(jdvVar, b, w64Var.b, k590Var.f());
            try {
                dlo dloVar = new dlo(new androidx.exifinterface.media.a(new ByteArrayInputStream(d)));
                Size size = new Size(b.width(), b.height());
                Rect rect = new Rect(0, 0, b.width(), b.height());
                int f = k590Var.f();
                Matrix g = k590Var.g();
                RectF rectF = lw01.a;
                Matrix matrix = new Matrix(g);
                matrix.postTranslate(-b.left, -b.top);
                return new r74(d, dloVar, 256, size, rect, f, matrix, k590Var.a());
            } catch (IOException e) {
                throw new ImageCaptureException(0, "Failed to extract Exif from YUV-generated JPEG", e);
            }
        } catch (ImageUtil$CodecFailedException e2) {
            throw new ImageCaptureException(1, "Failed to encode the image to JPEG.", e2);
        }
    }

    public static b6y G(reu reuVar, int i) {
        b bVar = (b) reuVar.b;
        i2t0 D = tje.D();
        tls e = D != null ? D.e() : null;
        i2t0 O = tje.O(D);
        try {
            s6y s6yVar = (s6y) bVar.f.getValue();
            tje.W(D, O, e);
            return bVar.q.a(i, s6yVar.j, bVar.d, new mtw(i, s6yVar));
        } catch (Throwable th) {
            tje.W(D, O, e);
            throw th;
        }
    }

    public void A(String str, boolean z) {
        ((com.yandex.plus.home.feature.webviews.internal.settings.domain.a) this.b).a(z);
    }

    public void B(int i, long j) {
        q810 q810Var = (q810) this.b;
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw ParserException.a(null, "ContentEncodingOrder " + j + " not supported");
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw ParserException.a(null, "ContentEncodingScope " + j + " not supported");
        }
        switch (i) {
            case HProv.PP_FAST_CODE /* 131 */:
                q810Var.c(i);
                q810Var.x.e = (int) j;
                return;
            case HProv.PP_LCD_QUERY /* 136 */:
                q810Var.c(i);
                q810Var.x.X = j == 1;
                return;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                q810Var.L = q810Var.l(j);
                return;
            case 159:
                q810Var.c(i);
                q810Var.x.Q = (int) j;
                return;
            case 176:
                q810Var.c(i);
                q810Var.x.n = (int) j;
                return;
            case 179:
                q810Var.b(i);
                q810Var.F.a(q810Var.l(j));
                return;
            case 186:
                q810Var.c(i);
                q810Var.x.o = (int) j;
                return;
            case 215:
                q810Var.c(i);
                q810Var.x.d = (int) j;
                return;
            case 231:
                q810Var.E = q810Var.l(j);
                return;
            case 238:
                q810Var.S = (int) j;
                return;
            case 241:
                if (q810Var.H) {
                    return;
                }
                q810Var.b(i);
                q810Var.G.a(j);
                q810Var.H = true;
                return;
            case 251:
                q810Var.T = true;
                return;
            case 16871:
                q810Var.c(i);
                q810Var.x.h = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw ParserException.a(null, "ContentCompAlgo " + j + " not supported");
            case 17029:
                if (j < 1 || j > 2) {
                    throw ParserException.a(null, "DocTypeReadVersion " + j + " not supported");
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw ParserException.a(null, "EBMLReadVersion " + j + " not supported");
            case 18401:
                if (j == 5) {
                    return;
                }
                throw ParserException.a(null, "ContentEncAlgo " + j + " not supported");
            case 18408:
                if (j == 1) {
                    return;
                }
                throw ParserException.a(null, "AESSettingsCipherMode " + j + " not supported");
            case 21420:
                q810Var.A = j + q810Var.s;
                return;
            case 21432:
                int i2 = (int) j;
                q810Var.c(i);
                if (i2 == 0) {
                    q810Var.x.y = 0;
                    return;
                }
                if (i2 == 1) {
                    q810Var.x.y = 2;
                    return;
                } else if (i2 == 3) {
                    q810Var.x.y = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    q810Var.x.y = 3;
                    return;
                }
            case 21680:
                q810Var.c(i);
                q810Var.x.q = (int) j;
                return;
            case 21682:
                q810Var.c(i);
                q810Var.x.s = (int) j;
                return;
            case 21690:
                q810Var.c(i);
                q810Var.x.r = (int) j;
                return;
            case 21930:
                q810Var.c(i);
                q810Var.x.W = j == 1;
                return;
            case 21938:
                q810Var.c(i);
                p810 p810Var = q810Var.x;
                p810Var.z = true;
                p810Var.p = (int) j;
                return;
            case 21998:
                q810Var.c(i);
                q810Var.x.g = (int) j;
                return;
            case 22186:
                q810Var.c(i);
                q810Var.x.T = j;
                return;
            case 22203:
                q810Var.c(i);
                q810Var.x.U = j;
                return;
            case 25188:
                q810Var.c(i);
                q810Var.x.R = (int) j;
                return;
            case 30114:
                q810Var.U = j;
                return;
            case 30321:
                q810Var.c(i);
                int i3 = (int) j;
                if (i3 == 0) {
                    q810Var.x.t = 0;
                    return;
                }
                if (i3 == 1) {
                    q810Var.x.t = 1;
                    return;
                } else if (i3 == 2) {
                    q810Var.x.t = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    q810Var.x.t = 3;
                    return;
                }
            case 2352003:
                q810Var.c(i);
                q810Var.x.f = (int) j;
                return;
            case 2807729:
                q810Var.t = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        q810Var.c(i);
                        int i4 = (int) j;
                        if (i4 == 1) {
                            q810Var.x.C = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            q810Var.x.C = 1;
                            return;
                        }
                    case 21946:
                        q810Var.c(i);
                        int g = kfc.g((int) j);
                        if (g != -1) {
                            q810Var.x.B = g;
                            return;
                        }
                        return;
                    case 21947:
                        q810Var.c(i);
                        q810Var.x.z = true;
                        int f = kfc.f((int) j);
                        if (f != -1) {
                            q810Var.x.A = f;
                            return;
                        }
                        return;
                    case 21948:
                        q810Var.c(i);
                        q810Var.x.D = (int) j;
                        return;
                    case 21949:
                        q810Var.c(i);
                        q810Var.x.E = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:
    
        r0 = java.util.Arrays.copyOfRange(r2, r1, r10.limit());
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        if (r1 != (-1)) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r74 C(w64 w64Var, int i) {
        byte[] bArr;
        byte[] copyOfRange;
        byte b;
        k590 k590Var = w64Var.a;
        reu reuVar = (reu) this.b;
        jdv jdvVar = (jdv) k590Var.c();
        int i2 = 0;
        if (((IncorrectJpegMetadataQuirk) reuVar.b) != null) {
            ByteBuffer h = jdvVar.i0()[0].h();
            int capacity = h.capacity();
            bArr = new byte[capacity];
            h.rewind();
            h.get(bArr);
            int i3 = 2;
            for (int i4 = 2; i4 + 4 <= capacity && (b = bArr[i4]) == -1; i4 += (((bArr[i4 + 2] & 255) << 8) | (bArr[i4 + 3] & 255)) + 2) {
                if (b == -1 && bArr[i4 + 1] == -38) {
                    break;
                }
            }
            while (true) {
                int i5 = i3 + 1;
                if (i5 > capacity) {
                    i2 = -1;
                    break;
                }
                if (bArr[i3] == -1 && bArr[i5] == -40) {
                    i2 = i3;
                    break;
                }
                i3 = i5;
                i = i;
            }
        } else {
            ByteBuffer h2 = jdvVar.i0()[0].h();
            copyOfRange = new byte[h2.capacity()];
            h2.rewind();
            h2.get(copyOfRange);
        }
        bArr = copyOfRange;
        dlo d = k590Var.d();
        Objects.requireNonNull(d);
        return new r74(bArr, d, i, k590Var.h(), k590Var.b(), k590Var.f(), k590Var.g(), k590Var.a());
    }

    public void E(mcw mcwVar) {
        com.yandex.go.analytics.b bVar = (com.yandex.go.analytics.b) this.b;
        String str = mcwVar.a;
        bVar.getClass();
        vug vugVar = new vug(bVar, str);
        for (Map.Entry entry : mcwVar.b.entrySet()) {
            vugVar.d((String) entry.getKey(), (String) entry.getValue());
        }
        vugVar.m();
        jst.e.r(str, new IntercityDashboardErrorException(str));
    }

    public void F(String str, Map map) {
        ((lir) this.b).a(new kir("transport_flex_health_issue", kotlin.collections.b.n(gw00.e(new Pair("issue", str)), map)));
    }

    public void H(Object obj) {
        MediaBrowserService.Result result = (MediaBrowserService.Result) this.b;
        if (!(obj instanceof List)) {
            if (!(obj instanceof Parcel)) {
                result.sendResult(null);
                return;
            }
            Parcel parcel = (Parcel) obj;
            parcel.setDataPosition(0);
            result.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
            return;
        }
        List<Parcel> list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        for (Parcel parcel2 : list) {
            parcel2.setDataPosition(0);
            arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
            parcel2.recycle();
        }
        result.sendResult(arrayList);
    }

    public void I(RuntimeException runtimeException) {
        com.yandex.plus.home.feature.webviews.internal.settings.domain.a aVar = (com.yandex.plus.home.feature.webviews.internal.settings.domain.a) this.b;
        j18 j18Var = aVar.a;
        if (j18Var.t() instanceof mf60) {
            j18Var.resumeWith(new Result.Failure(new ChangePlusSettingsInteractor$ChangeSettingError.HostChangeSettingError(runtimeException, ba6.a(aVar.b, aVar.c.a.d(aVar.d), 15))));
        }
    }

    @Override // defpackage.a600
    public boolean a() {
        ((kc00) ((com.yandex.go.taxi.main.a) this.b).h).a.getClass();
        return !(r0 instanceof hc00);
    }

    @Override // defpackage.pui0
    public void accept(Object obj, Object obj2) {
        final atx0 atx0Var = (atx0) obj2;
        ((IRestoreCredentialService) ((com.google.android.gms.auth.blockstore.restorecredential.internal.b) obj).i()).clearRestoreCredential((ClearRestoreCredentialRequest) this.b, new IClearRestoreCredentialCallback.Stub() { // from class: com.google.android.gms.auth.blockstore.restorecredential.internal.InternalRestoreCredentialClient$clearRestoreCredential$1$callback$1
            @Override // com.google.android.gms.auth.blockstore.restorecredential.internal.IClearRestoreCredentialCallback.Stub, com.google.android.gms.auth.blockstore.restorecredential.internal.IClearRestoreCredentialCallback
            public void onClearRestoreCredential(Status status, boolean cleared) {
                ntx0.a(status, Boolean.valueOf(cleared), atx0.this);
            }
        });
    }

    @Override // defpackage.qeu
    public void b(hx hxVar, MapiClientException mapiClientException) {
        F("action_request_error", kotlin.collections.b.i(new Pair(StateEntry.COLUMN_PATH, hxVar.a), new Pair(CRLReasonCodeExtension.REASON, String.valueOf(mapiClientException.getMessage()))));
    }

    @Override // defpackage.qeu
    public void c(u1m u1mVar, String str, Throwable th) {
        F("section_operation_failed", kotlin.collections.b.i(new Pair(StateEntry.COLUMN_PATH, String.valueOf(u1mVar != null ? u1mVar.a : null)), new Pair(CRLReasonCodeExtension.REASON, String.valueOf(th.getMessage()))));
    }

    @Override // defpackage.qeu
    public void d(u1m u1mVar) {
        F("document_retry_success", kotlin.collections.b.f());
    }

    @Override // defpackage.qeu
    public void e(kr krVar, Throwable th) {
        F("action_dispatching_failed", gw00.e(new Pair(CRLReasonCodeExtension.REASON, String.valueOf(th.getMessage()))));
    }

    @Override // defpackage.qeu
    public void f(u1m u1mVar, String str, Throwable th) {
        String str2 = u1mVar != null ? u1mVar.a : null;
        if (str2 == null) {
            str2 = "";
        }
        Pair pair = new Pair(StateEntry.COLUMN_PATH, str2);
        if (str == null) {
            str = "";
        }
        F("corrupted_action_received", kotlin.collections.b.i(pair, new Pair("type", str), new Pair(CRLReasonCodeExtension.REASON, String.valueOf(th.getMessage()))));
    }

    @Override // defpackage.qeu
    public void g(u1m u1mVar, String str) {
        F("unsupported_content_received", kotlin.collections.b.i(new Pair(StateEntry.COLUMN_PATH, String.valueOf(u1mVar != null ? u1mVar.a : null)), new Pair("type", str)));
    }

    @Override // defpackage.a600
    public boolean h() {
        return false;
    }

    public Object i(Object obj) {
        r74 D;
        w64 w64Var = (w64) obj;
        k590 k590Var = w64Var.a;
        try {
            int e = k590Var.e();
            if (e != 35) {
                if (e != 256 && e != 4101) {
                    throw new IllegalArgumentException("Unexpected format: " + e);
                }
                D = C(w64Var, e);
            } else {
                D = D(w64Var);
            }
            ((jdv) k590Var.c()).close();
            return D;
        } catch (Throwable th) {
            ((jdv) k590Var.c()).close();
            throw th;
        }
    }

    @Override // defpackage.qeu
    public void j(u1m u1mVar, String str, Throwable th) {
        String str2 = u1mVar != null ? u1mVar.a : null;
        if (str2 == null) {
            str2 = "";
        }
        Pair pair = new Pair(StateEntry.COLUMN_PATH, str2);
        if (str == null) {
            str = "";
        }
        F("corrupted_scaffold_received", kotlin.collections.b.i(pair, new Pair("type", str), new Pair(CRLReasonCodeExtension.REASON, String.valueOf(th.getMessage()))));
    }

    @Override // defpackage.qeu
    public void k(u1m u1mVar, Throwable th) {
        F("document_request_error", kotlin.collections.b.i(new Pair(StateEntry.COLUMN_PATH, u1mVar.a), new Pair(CRLReasonCodeExtension.REASON, String.valueOf(th.getMessage()))));
    }

    @Override // defpackage.nb10
    public void l() {
        j jVar = ((wb10) this.b).I;
        if (jVar != null) {
            jVar.b();
        }
    }

    @Override // defpackage.qeu
    public void m(u1m u1mVar, String str) {
        F("unsupported_scaffold_received", kotlin.collections.b.i(new Pair(StateEntry.COLUMN_PATH, String.valueOf(u1mVar != null ? u1mVar.a : null)), new Pair("type", str)));
    }

    @Override // defpackage.qeu
    public void n(IllegalArgumentException illegalArgumentException) {
        F("action_request_error", gw00.e(new Pair(CRLReasonCodeExtension.REASON, String.valueOf(illegalArgumentException.getMessage()))));
    }

    @Override // defpackage.qeu
    public void o(u1m u1mVar, Throwable th) {
        F("document_loading_failed", kotlin.collections.b.i(new Pair(StateEntry.COLUMN_PATH, u1mVar.a), new Pair(CRLReasonCodeExtension.REASON, String.valueOf(th.getMessage()))));
    }

    @Override // defpackage.iqs
    public void onFailure(Throwable th) {
        Object failure;
        switch (this.a) {
            case 3:
                ((e8v) this.b).close();
                break;
            default:
                try {
                    failure = Boolean.valueOf(((fyc) this.b).j0(th));
                } catch (Throwable th2) {
                    failure = new Result.Failure(th2);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    d6z.I(EmptyCoroutineContext.a, a);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.iqs
    public void onSuccess(Object obj) {
        Object failure;
        switch (this.a) {
            case 3:
                break;
            default:
                try {
                    failure = Boolean.valueOf(((fyc) this.b).T(obj));
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    d6z.I(EmptyCoroutineContext.a, a);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.qeu
    public void p(u1m u1mVar, String str, String str2, Throwable th) {
        String str3 = u1mVar != null ? u1mVar.a : null;
        if (str3 == null) {
            str3 = "";
        }
        Pair pair = new Pair(StateEntry.COLUMN_PATH, str3);
        if (str2 == null) {
            str2 = "";
        }
        F("corrupted_section_received", kotlin.collections.b.i(pair, new Pair("type", str2), new Pair(CRLReasonCodeExtension.REASON, String.valueOf(th.getMessage()))));
    }

    @Override // defpackage.qeu
    public void q(u1m u1mVar, Throwable th) {
        F("document_caught_retryable_error", kotlin.collections.b.i(new Pair(StateEntry.COLUMN_PATH, u1mVar.a), new Pair(CRLReasonCodeExtension.REASON, String.valueOf(th.getMessage()))));
    }

    @Override // defpackage.qeu
    public void r(u1m u1mVar, Throwable th) {
        F("document_parse_error", kotlin.collections.b.i(new Pair(StateEntry.COLUMN_PATH, u1mVar.a), new Pair(CRLReasonCodeExtension.REASON, String.valueOf(th.getMessage()))));
    }

    @Override // defpackage.nb10
    public void s() {
        j jVar = ((wb10) this.b).I;
        if (jVar != null) {
            jVar.b();
        }
    }

    @Override // defpackage.qeu
    public void t(hx hxVar, MapiClientException mapiClientException) {
        F("action_parse_error", kotlin.collections.b.i(new Pair(StateEntry.COLUMN_PATH, hxVar.a), new Pair(CRLReasonCodeExtension.REASON, String.valueOf(mapiClientException.getMessage()))));
    }

    @Override // defpackage.qeu
    public void u(u1m u1mVar, String str, String str2) {
        F("unsupported_section_received", kotlin.collections.b.i(new Pair(StateEntry.COLUMN_PATH, String.valueOf(u1mVar != null ? u1mVar.a : null)), new Pair("type", str2)));
    }

    @Override // defpackage.qeu
    public void v(u1m u1mVar, String str, Throwable th) {
        String str2 = u1mVar != null ? u1mVar.a : null;
        if (str2 == null) {
            str2 = "";
        }
        Pair pair = new Pair(StateEntry.COLUMN_PATH, str2);
        if (str == null) {
            str = "";
        }
        F("corrupted_content_received", kotlin.collections.b.i(pair, new Pair("type", str), new Pair(CRLReasonCodeExtension.REASON, String.valueOf(th.getMessage()))));
    }

    @Override // defpackage.qeu
    public void w(u1m u1mVar, Throwable th) {
        String str = u1mVar != null ? u1mVar.a : null;
        if (str == null) {
            str = "";
        }
        F("document_rendering_failed", kotlin.collections.b.i(new Pair(StateEntry.COLUMN_PATH, str), new Pair(CRLReasonCodeExtension.REASON, String.valueOf(th.getMessage()))));
    }

    @Override // defpackage.qeu
    public void x(u1m u1mVar, String str) {
        F("unsupported_action_received", kotlin.collections.b.i(new Pair(StateEntry.COLUMN_PATH, String.valueOf(u1mVar != null ? u1mVar.a : null)), new Pair("type", str)));
    }

    @Override // defpackage.qeu
    public void y(u1m u1mVar, String str, String str2, Exception exc) {
        F("section_preparing_failed", kotlin.collections.b.i(new Pair(StateEntry.COLUMN_PATH, String.valueOf(u1mVar != null ? u1mVar.a : null)), new Pair(CRLReasonCodeExtension.REASON, String.valueOf(exc.getMessage()))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void z(int i, int i2, c5p c5pVar) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j;
        int i9;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        q810 q810Var = (q810) this.b;
        w231 w231Var = q810Var.b;
        SparseArray sparseArray = q810Var.c;
        ef90 ef90Var = q810Var.k;
        ef90 ef90Var2 = q810Var.i;
        int i13 = 1;
        int i14 = 0;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (q810Var.J != 2) {
                    return;
                }
                p810 p810Var = (p810) sparseArray.get(q810Var.P);
                int i15 = q810Var.S;
                ef90 ef90Var3 = q810Var.p;
                if (i15 != 4 || !"V_VP9".equals(p810Var.c)) {
                    c5pVar.O(i2);
                    return;
                } else {
                    ef90Var3.H(i2);
                    c5pVar.readFully(ef90Var3.a, 0, i2);
                    return;
                }
            }
            if (i == 16877) {
                q810Var.c(i);
                p810 p810Var2 = q810Var.x;
                int i16 = p810Var2.h;
                if (i16 != 1685485123 && i16 != 1685480259) {
                    c5pVar.O(i2);
                    return;
                }
                byte[] bArr = new byte[i2];
                p810Var2.P = bArr;
                c5pVar.readFully(bArr, 0, i2);
                return;
            }
            if (i == 16981) {
                q810Var.c(i);
                byte[] bArr2 = new byte[i2];
                q810Var.x.j = bArr2;
                c5pVar.readFully(bArr2, 0, i2);
                return;
            }
            if (i == 18402) {
                byte[] bArr3 = new byte[i2];
                c5pVar.readFully(bArr3, 0, i2);
                q810Var.c(i);
                q810Var.x.k = new f001(1, 0, 0, bArr3);
                return;
            }
            if (i == 21419) {
                Arrays.fill(ef90Var.a, (byte) 0);
                c5pVar.readFully(ef90Var.a, 4 - i2, i2);
                ef90Var.K(0);
                q810Var.z = (int) ef90Var.A();
                return;
            }
            if (i == 25506) {
                q810Var.c(i);
                byte[] bArr4 = new byte[i2];
                q810Var.x.l = bArr4;
                c5pVar.readFully(bArr4, 0, i2);
                return;
            }
            if (i != 30322) {
                throw ParserException.a(null, "Unexpected id: " + i);
            }
            q810Var.c(i);
            byte[] bArr5 = new byte[i2];
            q810Var.x.x = bArr5;
            c5pVar.readFully(bArr5, 0, i2);
            return;
        }
        int i17 = 8;
        if (q810Var.J == 0) {
            q810Var.P = (int) w231Var.b(c5pVar, false, true, 8);
            q810Var.Q = w231Var.c;
            q810Var.L = -9223372036854775807L;
            q810Var.J = 1;
            ef90Var2.H(0);
        }
        p810 p810Var3 = (p810) sparseArray.get(q810Var.P);
        if (p810Var3 == null) {
            c5pVar.O(i2 - q810Var.Q);
            q810Var.J = 0;
            return;
        }
        p810Var3.Z.getClass();
        if (q810Var.J == 1) {
            q810Var.j(c5pVar, 3);
            int i18 = (ef90Var2.a[2] & 6) >> 1;
            if (i18 == 0) {
                q810Var.N = 1;
                int[] iArr2 = q810Var.O;
                if (iArr2 == null) {
                    iArr2 = new int[1];
                } else if (iArr2.length < 1) {
                    iArr2 = new int[Math.max(iArr2.length * 2, 1)];
                }
                q810Var.O = iArr2;
                iArr2[0] = (i2 - q810Var.Q) - 3;
            } else {
                q810Var.j(c5pVar, 4);
                int i19 = (ef90Var2.a[3] & 255) + 1;
                q810Var.N = i19;
                int[] iArr3 = q810Var.O;
                if (iArr3 == null) {
                    iArr3 = new int[i19];
                    i4 = 4;
                } else {
                    i4 = 4;
                    if (iArr3.length < i19) {
                        iArr3 = new int[Math.max(iArr3.length * 2, i19)];
                    }
                }
                q810Var.O = iArr3;
                if (i18 == 2) {
                    int i20 = (i2 - q810Var.Q) - 4;
                    int i21 = q810Var.N;
                    Arrays.fill(iArr3, 0, i21, i20 / i21);
                } else {
                    if (i18 != 1) {
                        if (i18 != 3) {
                            throw ParserException.a(null, "Unexpected lacing value: " + i18);
                        }
                        int i22 = 0;
                        int i23 = 0;
                        int i24 = i4;
                        while (true) {
                            int i25 = q810Var.N - i13;
                            int[] iArr4 = q810Var.O;
                            if (i22 >= i25) {
                                i3 = i13;
                                i5 = i14;
                                iArr4[i25] = ((i2 - q810Var.Q) - i24) - i23;
                                break;
                            }
                            iArr4[i22] = i14;
                            int i26 = i24 + 1;
                            q810Var.j(c5pVar, i26);
                            if (ef90Var2.a[i24] == 0) {
                                throw ParserException.a(null, "No valid varint length mask found");
                            }
                            int i27 = i14;
                            while (true) {
                                if (i27 >= i17) {
                                    i6 = i17;
                                    i7 = i13;
                                    i8 = i14;
                                    j = 0;
                                    i9 = i26;
                                    break;
                                }
                                i6 = i17;
                                int i28 = i13 << (7 - i27);
                                i7 = i13;
                                if ((ef90Var2.a[i24] & i28) != 0) {
                                    i9 = i26 + i27;
                                    q810Var.j(c5pVar, i9);
                                    i8 = i14;
                                    j = (~i28) & ef90Var2.a[i24] & 255;
                                    while (i26 < i9) {
                                        j = (j << i6) | (ef90Var2.a[i26] & 255);
                                        i26++;
                                    }
                                    if (i22 > 0) {
                                        j -= (1 << ((i27 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i27++;
                                    i13 = i7;
                                    i17 = i6;
                                }
                            }
                            if (j < -2147483648L || j > 2147483647L) {
                                break;
                            }
                            int i29 = (int) j;
                            int[] iArr5 = q810Var.O;
                            if (i22 != 0) {
                                i29 += iArr5[i22 - 1];
                            }
                            iArr5[i22] = i29;
                            i23 += i29;
                            i22++;
                            i24 = i9;
                            i13 = i7;
                            i17 = i6;
                            i14 = i8;
                        }
                        throw ParserException.a(null, "EBML lacing sample size out of range.");
                    }
                    int i30 = 0;
                    int i31 = 0;
                    int i32 = i4;
                    while (true) {
                        i10 = q810Var.N - 1;
                        iArr = q810Var.O;
                        if (i30 >= i10) {
                            break;
                        }
                        iArr[i30] = 0;
                        while (true) {
                            i11 = i32 + 1;
                            q810Var.j(c5pVar, i11);
                            int i33 = ef90Var2.a[i32] & 255;
                            int[] iArr6 = q810Var.O;
                            i12 = iArr6[i30] + i33;
                            iArr6[i30] = i12;
                            if (i33 != 255) {
                                break;
                            } else {
                                i32 = i11;
                            }
                        }
                        i31 += i12;
                        i30++;
                        i32 = i11;
                    }
                    iArr[i10] = ((i2 - q810Var.Q) - i32) - i31;
                }
            }
            i3 = 1;
            i5 = 0;
            byte[] bArr6 = ef90Var2.a;
            q810Var.K = q810Var.l((bArr6[i3] & 255) | (bArr6[i5] << 8)) + q810Var.E;
            q810Var.R = (p810Var3.e == 2 || (i == 163 && (ef90Var2.a[2] & DerValue.TAG_CONTEXT) == 128)) ? i3 : i5;
            q810Var.J = 2;
            q810Var.M = i5;
        } else {
            i3 = 1;
        }
        if (i == 163) {
            while (true) {
                int i34 = q810Var.M;
                if (i34 >= q810Var.N) {
                    q810Var.J = 0;
                    return;
                } else {
                    q810Var.f(p810Var3, ((q810Var.M * p810Var3.f) / 1000) + q810Var.K, q810Var.R, q810Var.m(c5pVar, p810Var3, q810Var.O[i34], false), 0);
                    q810Var.M++;
                }
            }
        } else {
            while (true) {
                int i35 = q810Var.M;
                if (i35 >= q810Var.N) {
                    return;
                }
                int[] iArr7 = q810Var.O;
                boolean z = i3;
                iArr7[i35] = q810Var.m(c5pVar, p810Var3, iArr7[i35], z);
                q810Var.M += z ? 1 : 0;
            }
        }
    }

    public /* synthetic */ reu(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public reu(Moshi moshi) {
        this.a = 7;
        this.b = moshi.adapter(InputDraft.class);
    }

    public /* synthetic */ reu() {
        this.a = 13;
    }
}
