package androidx.camera.core;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.media.Image;
import android.text.TextUtils;
import android.util.Pair;
import com.fillr.browsersdk.model.FillrWidgetPageEvent;
import com.fillr.e0;
import com.fillr.n;
import com.google.android.filament.Box;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.measurement.zzhr;
import com.google.android.gms.internal.measurement.zzhs;
import com.google.android.gms.internal.measurement.zzhw;
import com.google.android.gms.internal.mlkit_vision_text_common.zzdb;
import com.google.android.gms.internal.mlkit_vision_text_common.zzob;
import com.google.android.gms.internal.mlkit_vision_text_common.zzod;
import com.google.android.gms.internal.mlkit_vision_text_common.zzoj;
import com.google.android.gms.internal.mlkit_vision_text_common.zzot;
import com.google.android.gms.internal.mlkit_vision_text_common.zzou;
import com.google.android.gms.internal.mlkit_vision_text_common.zzrz;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsb;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsd;
import com.google.android.gms.internal.mlkit_vision_text_common.zzub;
import com.google.android.gms.measurement.internal.zzad;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.measurement.internal.zzpk;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.text.internal.TextRecognizerTaskWithResource;
import com.nimbusds.jose.JWECryptoParts;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.brotli.dec.HuffmanTreeGroup;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class FocusMeteringAction implements zzub {
    public long mAutoCancelDurationInMillis;
    public Object mMeteringPointsAe;
    public Object mMeteringPointsAf;
    public Object mMeteringPointsAwb;

    public FocusMeteringAction(FocusMeteringAction focusMeteringAction) {
        this.mMeteringPointsAf = Collections.unmodifiableList((ArrayList) focusMeteringAction.mMeteringPointsAf);
        this.mMeteringPointsAe = Collections.unmodifiableList((ArrayList) focusMeteringAction.mMeteringPointsAe);
        this.mMeteringPointsAwb = Collections.unmodifiableList((ArrayList) focusMeteringAction.mMeteringPointsAwb);
        this.mAutoCancelDurationInMillis = focusMeteringAction.mAutoCancelDurationInMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0026 A[Catch: JSONException -> 0x005e, TryCatch #0 {JSONException -> 0x005e, blocks: (B:6:0x000a, B:8:0x0010, B:10:0x0016, B:16:0x0026, B:18:0x004f, B:20:0x0057), top: B:5:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JSONObject buildJson() {
        FillrWidgetPageEvent fillrWidgetPageEvent;
        boolean z;
        String str = (String) this.mMeteringPointsAf;
        if (str != null) {
            try {
                if (str.length() > 0 && (fillrWidgetPageEvent = (FillrWidgetPageEvent) this.mMeteringPointsAe) != null) {
                    JSONObject jSONObject = (JSONObject) this.mMeteringPointsAwb;
                    if (fillrWidgetPageEvent.jsonRequired && jSONObject == null) {
                        z = false;
                        if (z) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("url", str);
                            jSONObject2.put("type", "page-".concat(((FillrWidgetPageEvent) this.mMeteringPointsAe).name));
                            jSONObject2.put("timestamp", this.mAutoCancelDurationInMillis);
                            JSONObject jSONObject3 = (JSONObject) this.mMeteringPointsAwb;
                            if (jSONObject3 == null || ((FillrWidgetPageEvent) this.mMeteringPointsAe) == FillrWidgetPageEvent.LOAD) {
                                return jSONObject2;
                            }
                            jSONObject2.put("info", jSONObject3);
                            return jSONObject2;
                        }
                    }
                    z = true;
                    if (z) {
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x012c, code lost:
    
        if (r6 != null) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01fb  */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v34, types: [android.util.Pair] */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzhs zza(zzhs zzhsVar, String str) {
        ?? r9;
        zzhs zzhsVar2;
        long j;
        Cursor cursor;
        ?? r0;
        Object obj;
        Pair pair;
        String zzd = zzhsVar.zzd();
        List zza = zzhsVar.zza();
        zzad zzadVar = (zzad) this.mMeteringPointsAwb;
        zzpg zzpgVar = zzadVar.zzg;
        zzpg zzpgVar2 = zzadVar.zzg;
        zzic zzicVar = (zzic) zzadVar.$$delegate_0;
        zzpgVar.zzp();
        zzhw zzI = zzpk.zzI(zzhsVar, "_eid");
        Long l = (Long) (zzI == null ? null : zzpk.zzT(zzI));
        if (l != null) {
            if (zzd.equals("_ep")) {
                zzpgVar.zzp();
                zzhw zzI2 = zzpk.zzI(zzhsVar, "_en");
                String str2 = (String) (zzI2 == null ? null : zzpk.zzT(zzI2));
                if (TextUtils.isEmpty(str2)) {
                    zzgu zzguVar = zzicVar.zzi;
                    zzic.zzP(zzguVar);
                    zzguVar.zze.zzb(l, "Extra parameter without an event name. eventId");
                    return null;
                }
                if (((zzhs) this.mMeteringPointsAf) == null || ((Long) this.mMeteringPointsAe) == null || l.longValue() != ((Long) this.mMeteringPointsAe).longValue()) {
                    zzaw zzawVar = zzpgVar.zze;
                    zzpg.zzaT(zzawVar);
                    zzic zzicVar2 = (zzic) zzawVar.$$delegate_0;
                    zzawVar.zzg();
                    zzawVar.zzay();
                    try {
                        try {
                            cursor = zzawVar.zze().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l.toString()});
                            try {
                                if (cursor.moveToFirst()) {
                                    zzhsVar2 = null;
                                    try {
                                        try {
                                            Pair create = Pair.create((zzhs) ((zzhr) zzpk.zzw(zzhs.zzp(), cursor.getBlob(0))).zzbd(), Long.valueOf(cursor.getLong(1)));
                                            cursor.close();
                                            pair = create;
                                        } catch (SQLiteException e) {
                                            e = e;
                                            j = 0;
                                            zzgu zzguVar2 = zzicVar2.zzi;
                                            zzic.zzP(zzguVar2);
                                            zzguVar2.zzd.zzb(e, "Error selecting main event");
                                        }
                                    } catch (IOException e2) {
                                        zzgu zzguVar3 = zzicVar2.zzi;
                                        zzic.zzP(zzguVar3);
                                        j = 0;
                                        try {
                                            zzguVar3.zzd.zzd("Failed to merge main event. appId, eventId", zzgu.zzl(str), l, e2);
                                        } catch (SQLiteException e3) {
                                            e = e3;
                                            zzgu zzguVar22 = zzicVar2.zzi;
                                            zzic.zzP(zzguVar22);
                                            zzguVar22.zzd.zzb(e, "Error selecting main event");
                                        }
                                        cursor.close();
                                        r0 = zzhsVar2;
                                        if (r0 != 0) {
                                        }
                                        zzgu zzguVar4 = zzicVar.zzi;
                                        zzic.zzP(zzguVar4);
                                        zzguVar4.zze.zzc("Extra parameter without existing main event. eventName, eventId", str2, l);
                                        return zzhsVar2;
                                    }
                                } else {
                                    zzgu zzguVar5 = zzicVar2.zzi;
                                    zzic.zzP(zzguVar5);
                                    zzguVar5.zzl.zza("Main event not found");
                                    cursor.close();
                                    pair = null;
                                    zzhsVar2 = null;
                                }
                                j = 0;
                                r0 = pair;
                            } catch (SQLiteException e4) {
                                e = e4;
                                zzhsVar2 = null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            r9 = zzd;
                            if (r9 != 0) {
                                r9.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        zzhsVar2 = null;
                        j = 0;
                        cursor = null;
                    } catch (Throwable th2) {
                        th = th2;
                        r9 = 0;
                        if (r9 != 0) {
                        }
                        throw th;
                    }
                    if (r0 != 0 || (obj = ((Pair) r0).first) == null) {
                        zzgu zzguVar42 = zzicVar.zzi;
                        zzic.zzP(zzguVar42);
                        zzguVar42.zze.zzc("Extra parameter without existing main event. eventName, eventId", str2, l);
                        return zzhsVar2;
                    }
                    this.mMeteringPointsAf = (zzhs) obj;
                    this.mAutoCancelDurationInMillis = ((Long) ((Pair) r0).second).longValue();
                    zzpgVar2.zzp();
                    this.mMeteringPointsAe = (Long) zzpk.zzM((zzhs) this.mMeteringPointsAf, "_eid");
                } else {
                    j = 0;
                }
                long j2 = this.mAutoCancelDurationInMillis - 1;
                this.mAutoCancelDurationInMillis = j2;
                if (j2 <= j) {
                    zzaw zzawVar2 = zzpgVar2.zze;
                    zzpg.zzaT(zzawVar2);
                    zzic zzicVar3 = (zzic) zzawVar2.$$delegate_0;
                    zzawVar2.zzg();
                    zzgu zzguVar6 = zzicVar3.zzi;
                    zzic.zzP(zzguVar6);
                    zzguVar6.zzl.zzb(str, "Clearing complex main event info. appId");
                    try {
                        zzawVar2.zze().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e6) {
                        zzgu zzguVar7 = zzicVar3.zzi;
                        zzic.zzP(zzguVar7);
                        zzguVar7.zzd.zzb(e6, "Error clearing complex main event");
                    }
                } else {
                    zzaw zzawVar3 = zzpgVar2.zze;
                    zzpg.zzaT(zzawVar3);
                    zzawVar3.zzU(str, l, this.mAutoCancelDurationInMillis, (zzhs) this.mMeteringPointsAf);
                }
                ArrayList arrayList = new ArrayList();
                for (zzhw zzhwVar : ((zzhs) this.mMeteringPointsAf).zza()) {
                    zzpgVar2.zzp();
                    if (zzpk.zzI(zzhsVar, zzhwVar.zzb()) == null) {
                        arrayList.add(zzhwVar);
                    }
                }
                if (arrayList.isEmpty()) {
                    zzgu zzguVar8 = zzicVar.zzi;
                    zzic.zzP(zzguVar8);
                    zzguVar8.zze.zzb(str2, "No unique parameters in main event. eventName");
                } else {
                    arrayList.addAll(zza);
                    zza = arrayList;
                }
                zzd = str2;
            } else {
                this.mMeteringPointsAe = l;
                this.mMeteringPointsAf = zzhsVar;
                zzpgVar.zzp();
                zzhw zzI3 = zzpk.zzI(zzhsVar, "_epc");
                Object zzT = zzI3 == null ? null : zzpk.zzT(zzI3);
                long longValue = ((Long) (zzT != null ? zzT : 0L)).longValue();
                this.mAutoCancelDurationInMillis = longValue;
                if (longValue <= 0) {
                    zzgu zzguVar9 = zzicVar.zzi;
                    zzic.zzP(zzguVar9);
                    zzguVar9.zze.zzb(zzd, "Complex event with zero extra param count. eventName");
                } else {
                    zzaw zzawVar4 = zzpgVar.zze;
                    zzpg.zzaT(zzawVar4);
                    zzawVar4.zzU(str, l, this.mAutoCancelDurationInMillis, zzhsVar);
                }
            }
        }
        zzhr zzhrVar = (zzhr) zzhsVar.zzco();
        zzhrVar.zzl(zzd);
        zzhrVar.zzi();
        zzhrVar.zzaY();
        ((zzhs) zzhrVar.zza).zzs(zza);
        return (zzhs) zzhrVar.zzbd();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzub
    public HuffmanTreeGroup zza$9() {
        int limit;
        TextRecognizerTaskWithResource textRecognizerTaskWithResource = (TextRecognizerTaskWithResource) this.mMeteringPointsAf;
        long j = this.mAutoCancelDurationInMillis;
        zzou zzouVar = (zzou) this.mMeteringPointsAe;
        InputImage inputImage = (InputImage) this.mMeteringPointsAwb;
        zzdb zzdbVar = new zzdb();
        JWECryptoParts jWECryptoParts = new JWECryptoParts();
        jWECryptoParts.header = Long.valueOf(j & Long.MAX_VALUE);
        jWECryptoParts.encryptedKey = zzouVar;
        jWECryptoParts.iv = Boolean.valueOf(TextRecognizerTaskWithResource.zza);
        Boolean bool = Boolean.TRUE;
        jWECryptoParts.cipherText = bool;
        jWECryptoParts.authenticationTag = bool;
        zzdbVar.zzc = new zzoj(jWECryptoParts);
        int i = inputImage.zzg;
        if (i == -1) {
            Bitmap bitmap = inputImage.zza;
            zzae.checkNotNull(bitmap);
            limit = bitmap.getAllocationByteCount();
        } else if (i == 17 || i == 842094169) {
            ByteBuffer byteBuffer = inputImage.zzb;
            zzae.checkNotNull(byteBuffer);
            limit = byteBuffer.limit();
        } else if (i != 35) {
            limit = 0;
        } else {
            Image.Plane[] planes = inputImage.getPlanes();
            zzae.checkNotNull(planes);
            limit = (planes[0].getBuffer().limit() * 3) / 2;
        }
        Box box = new Box(18);
        box.mCenter = i != -1 ? i != 35 ? i != 842094169 ? i != 16 ? i != 17 ? zzob.UNKNOWN_FORMAT : zzob.NV21 : zzob.NV16 : zzob.YV12 : zzob.YUV_420_888 : zzob.BITMAP;
        box.mHalfExtent = Integer.valueOf(limit & Integer.MAX_VALUE);
        zzdbVar.zzd = new zzod(box);
        n.b bVar = new n.b(24);
        textRecognizerTaskWithResource.zzf.getClass();
        bVar.b = zzsb.LATIN;
        zzdbVar.zze = new zzsd(bVar);
        zzrz zzrzVar = new zzrz(zzdbVar);
        e0 e0Var = new e0(20);
        e0Var.c = textRecognizerTaskWithResource.zzf.getIsThickClient() ? zzot.TYPE_THICK : zzot.TYPE_THIN;
        e0Var.i = zzrzVar;
        return new HuffmanTreeGroup(e0Var, 0, (byte) 0);
    }

    public FocusMeteringAction(String str) {
        this.mAutoCancelDurationInMillis = new Date().getTime();
        this.mMeteringPointsAf = str;
    }

    public /* synthetic */ FocusMeteringAction(zzad zzadVar) {
        this.mMeteringPointsAwb = zzadVar;
    }

    public FocusMeteringAction(MeteringPoint meteringPoint) {
        ArrayList arrayList = new ArrayList();
        this.mMeteringPointsAf = arrayList;
        this.mMeteringPointsAe = new ArrayList();
        this.mMeteringPointsAwb = new ArrayList();
        this.mAutoCancelDurationInMillis = 5000L;
        arrayList.add(meteringPoint);
    }
}
