package com.gamericefishpro.space.n9;

import android.app.BroadcastOptions;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.os.UserHandle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.gamericefishpro.space.i9.p5;
import com.gamericefishpro.space.i9.q7;
import com.gamericefishpro.space.i9.r8;
import com.gamericefishpro.space.i9.t7;
import com.onesignal.core.activities.PermissionsActivity;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m4 implements a2 {
    public static volatile m4 d0;
    public z0 A;
    public q3 B;
    public h1 D;
    public final r1 E;
    public boolean G;
    public long H;
    public ArrayList I;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public boolean O;
    public FileLock P;
    public FileChannel Q;
    public ArrayList R;
    public ArrayList S;
    public final HashMap U;
    public final HashMap V;
    public final HashMap W;
    public b3 Y;
    public String Z;
    public u3 a0;
    public long b0;
    public final l1 d;
    public final z0 e;
    public m i;
    public b1 v;
    public b4 w;
    public c y;
    public final z0 z;
    public final AtomicBoolean F = new AtomicBoolean(false);
    public final LinkedList J = new LinkedList();
    public final HashMap X = new HashMap();
    public final j4 c0 = new j4(this);
    public long T = -1;
    public final i4 C = new i4(this);

    public m4(com.gamericefishpro.space.b9.b bVar) {
        this.E = r1.r(bVar.a, null, null);
        z0 z0Var = new z0(this, 2);
        z0Var.t();
        this.z = z0Var;
        z0 z0Var2 = new z0(this, 0);
        z0Var2.t();
        this.e = z0Var2;
        l1 l1Var = new l1(this);
        l1Var.t();
        this.d = l1Var;
        this.U = new HashMap();
        this.V = new HashMap();
        this.W = new HashMap();
        c().A(new com.gamericefishpro.space.h4.b(this, bVar));
    }

    public static m4 C(Context context) {
        com.gamericefishpro.space.v8.c0.g(context);
        com.gamericefishpro.space.v8.c0.g(context.getApplicationContext());
        if (d0 == null) {
            synchronized (m4.class) {
                try {
                    if (d0 == null) {
                        d0 = new m4(new com.gamericefishpro.space.b9.b(context, 3));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d0;
    }

    public static final void D(com.gamericefishpro.space.i9.z2 z2Var, int i, String str) {
        List listH = z2Var.h();
        for (int i2 = 0; i2 < listH.size(); i2++) {
            if ("_err".equals(((com.gamericefishpro.space.i9.d3) listH.get(i2)).q())) {
                return;
            }
        }
        com.gamericefishpro.space.i9.c3 c3VarB = com.gamericefishpro.space.i9.d3.B();
        c3VarB.h("_err");
        c3VarB.j(i);
        com.gamericefishpro.space.i9.d3 d3Var = (com.gamericefishpro.space.i9.d3) c3VarB.e();
        com.gamericefishpro.space.i9.c3 c3VarB2 = com.gamericefishpro.space.i9.d3.B();
        c3VarB2.h("_ev");
        c3VarB2.i(str);
        com.gamericefishpro.space.i9.d3 d3Var2 = (com.gamericefishpro.space.i9.d3) c3VarB2.e();
        z2Var.k(d3Var);
        z2Var.k(d3Var2);
    }

    public static final void E(com.gamericefishpro.space.i9.z2 z2Var, String str) {
        List listH = z2Var.h();
        for (int i = 0; i < listH.size(); i++) {
            if (str.equals(((com.gamericefishpro.space.i9.d3) listH.get(i)).q())) {
                z2Var.m(i);
                return;
            }
        }
    }

    public static String M(String str, Map map) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    public static final boolean S(t4 t4Var) {
        return !TextUtils.isEmpty(t4Var.e);
    }

    public static final void T(g4 g4Var) {
        if (g4Var == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (!g4Var.i) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(g4Var.getClass())));
        }
    }

    public static final Boolean U(t4 t4Var) {
        Boolean bool = t4Var.I;
        String str = t4Var.V;
        if (!TextUtils.isEmpty(str)) {
            int iOrdinal = ((b2) com.gamericefishpro.space.m.d.H(str).e).ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                return null;
            }
            if (iOrdinal == 2) {
                return Boolean.TRUE;
            }
            if (iOrdinal == 3) {
                return Boolean.FALSE;
            }
        }
        return bool;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0047 A[PHI: r11
      0x0047: PHI (r11v12 int) = (r11v2 int), (r11v0 int) binds: [B:15:0x0049, B:12:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:54:0x015a A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:8:0x0030, B:18:0x004e, B:55:0x015d, B:26:0x006c, B:31:0x00c8, B:30:0x00b6, B:32:0x00cd, B:36:0x00de, B:40:0x00f4, B:42:0x010c, B:44:0x0127, B:46:0x0130, B:48:0x0136, B:49:0x013a, B:51:0x0143, B:53:0x0152, B:54:0x015a, B:43:0x0118, B:37:0x00e5, B:39:0x00ee), top: B:64:0x0030, outer: #0 }] */
    public final void A(String str, int i, Throwable th, byte[] bArr, Map map) {
        boolean z;
        z0 z0Var = this.e;
        c().r();
        k0();
        com.gamericefishpro.space.v8.c0.d(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.M = false;
                O();
                throw th2;
            }
        }
        t0 t0Var = a().G;
        Integer numValueOf = Integer.valueOf(bArr.length);
        t0Var.b(numValueOf, "onConfigFetched. Response size");
        m mVar = this.i;
        T(mVar);
        mVar.d0();
        try {
            m mVar2 = this.i;
            T(mVar2);
            a1 a1VarT0 = mVar2.t0(str);
            if (i == 200 || i == 204) {
                if (th == null) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (i == 304) {
                i = 304;
                if (th == null) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (a1VarT0 == null) {
                a().B.b(v0.z(str), "App does not exist in onConfigFetched. appId");
            } else {
                l1 l1Var = this.d;
                if (z || i == 404) {
                    String strM = M("Last-Modified", map);
                    String strM2 = M("ETag", map);
                    if (i == 404 || i == 304) {
                        T(l1Var);
                        if (l1Var.D(str) == null) {
                            T(l1Var);
                            l1Var.F(str, null, null, null);
                        }
                    } else {
                        T(l1Var);
                        l1Var.F(str, bArr, strM, strM2);
                    }
                    e().getClass();
                    a1VarT0.f(System.currentTimeMillis());
                    m mVar3 = this.i;
                    T(mVar3);
                    mVar3.u0(a1VarT0, false);
                    if (i == 404) {
                        a().D.b(str, "Config not found. Using empty config. appId");
                    } else {
                        a().G.c("Successfully fetched config. Got network response. code, size", Integer.valueOf(i), numValueOf);
                    }
                    T(z0Var);
                    if (z0Var.L() && L()) {
                        q();
                    } else {
                        T(z0Var);
                        if (z0Var.L()) {
                            m mVar4 = this.i;
                            T(mVar4);
                            if (mVar4.x(a1VarT0.D())) {
                                t(a1VarT0.D());
                            } else {
                                N();
                            }
                        } else {
                            N();
                        }
                    }
                } else {
                    e().getClass();
                    a1VarT0.g(System.currentTimeMillis());
                    m mVar5 = this.i;
                    T(mVar5);
                    mVar5.u0(a1VarT0, false);
                    a().G.c("Fetching config failed. code, error", Integer.valueOf(i), th);
                    T(l1Var);
                    l1Var.r();
                    l1Var.F.put(str, null);
                    d1 d1Var = this.B.B;
                    e().getClass();
                    d1Var.b(System.currentTimeMillis());
                    if (i == 503 || i == 429) {
                        d1 d1Var2 = this.B.z;
                        e().getClass();
                        d1Var2.b(System.currentTimeMillis());
                    }
                    N();
                }
            }
            m mVar6 = this.i;
            T(mVar6);
            mVar6.e0();
            m mVar7 = this.i;
            T(mVar7);
            mVar7.f0();
            this.M = false;
            O();
        } catch (Throwable th3) {
            m mVar8 = this.i;
            T(mVar8);
            mVar8.f0();
            throw th3;
        }
    }

    public final void B() {
        c().r();
        k0();
        if (this.G) {
            return;
        }
        this.G = true;
        c().r();
        FileLock fileLock = this.P;
        r1 r1Var = this.E;
        if (fileLock == null || !fileLock.isValid()) {
            ((r1) this.i.d).getClass();
            try {
                FileChannel channel = new RandomAccessFile(new File(new File(r1Var.d.getFilesDir(), "google_app_measurement.db").getPath()), "rw").getChannel();
                this.Q = channel;
                FileLock fileLockTryLock = channel.tryLock();
                this.P = fileLockTryLock;
                if (fileLockTryLock == null) {
                    a().y.a("Storage concurrent data access panic");
                    return;
                }
                a().G.a("Storage concurrent access okay");
            } catch (FileNotFoundException e) {
                a().y.b(e, "Failed to acquire storage lock");
                return;
            } catch (IOException e2) {
                a().y.b(e2, "Failed to access storage lock file");
                return;
            } catch (OverlappingFileLockException e3) {
                a().B.b(e3, "Storage lock already acquired");
                return;
            }
        } else {
            a().G.a("Storage concurrent access okay");
        }
        FileChannel fileChannel = this.Q;
        c().r();
        int i = 0;
        if (fileChannel == null || !fileChannel.isOpen()) {
            a().y.a("Bad channel to read from");
        } else {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            try {
                fileChannel.position(0L);
                int i2 = fileChannel.read(byteBufferAllocate);
                if (i2 == 4) {
                    byteBufferAllocate.flip();
                    i = byteBufferAllocate.getInt();
                } else if (i2 != -1) {
                    a().B.b(Integer.valueOf(i2), "Unexpected data length. Bytes read");
                }
            } catch (IOException e4) {
                a().y.b(e4, "Failed to read from channel");
            }
        }
        m0 m0VarQ = r1Var.q();
        m0VarQ.s();
        int i3 = m0VarQ.w;
        c().r();
        if (i > i3) {
            a().y.c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(i3));
            return;
        }
        if (i < i3) {
            FileChannel fileChannel2 = this.Q;
            c().r();
            if (fileChannel2 == null || !fileChannel2.isOpen()) {
                a().y.a("Bad channel to read from");
            } else {
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                byteBufferAllocate2.putInt(i3);
                byteBufferAllocate2.flip();
                try {
                    fileChannel2.truncate(0L);
                    fileChannel2.write(byteBufferAllocate2);
                    fileChannel2.force(true);
                    if (fileChannel2.size() != 4) {
                        a().y.b(Long.valueOf(fileChannel2.size()), "Error writing to channel. Bytes written");
                    }
                    a().G.c("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(i3));
                    return;
                } catch (IOException e5) {
                    a().y.b(e5, "Failed to write to channel");
                }
            }
            a().y.c("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(i3));
        }
    }

    public final int F(String str, com.gamericefishpro.space.m.d dVar) {
        b2 b2VarV;
        l1 l1Var = this.d;
        com.gamericefishpro.space.i9.z1 z1VarM = l1Var.M(str);
        d2 d2Var = d2.AD_PERSONALIZATION;
        if (z1VarM == null) {
            dVar.J(d2Var, h.FAILSAFE);
            return 1;
        }
        m mVar = this.i;
        T(mVar);
        a1 a1VarT0 = mVar.t0(str);
        if (a1VarT0 == null || ((b2) com.gamericefishpro.space.m.d.H(a1VarT0.s()).e) != b2.POLICY || (b2VarV = l1Var.v(str, d2Var)) == b2.UNINITIALIZED) {
            dVar.J(d2Var, h.REMOTE_DEFAULT);
            if (l1Var.L(str, d2Var)) {
                return 0;
            }
        } else {
            dVar.J(d2Var, h.REMOTE_ENFORCED_DEFAULT);
            if (b2VarV == b2.GRANTED) {
                return 0;
            }
        }
        return 1;
    }

    public final HashMap G(com.gamericefishpro.space.i9.a3 a3Var) {
        Serializable serializableG;
        HashMap map = new HashMap();
        i0();
        HashMap map2 = new HashMap();
        for (com.gamericefishpro.space.i9.d3 d3Var : a3Var.p()) {
            if (d3Var.q().startsWith("gad_") && (serializableG = z0.G(d3Var)) != null) {
                map2.put(d3Var.q(), serializableG);
            }
        }
        for (Map.Entry entry : map2.entrySet()) {
            map.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        return map;
    }

    public final void H() {
        c().r();
        if (this.J.isEmpty()) {
            return;
        }
        if (this.a0 == null) {
            this.a0 = new u3(this, this.E, 2);
        }
        if (this.a0.c != 0) {
            return;
        }
        e().getClass();
        long jMax = Math.max(0L, ((long) ((Integer) e0.B0.a(null)).intValue()) - (SystemClock.elapsedRealtime() - this.b0));
        a().G.b(Long.valueOf(jMax), "Scheduling notify next app runnable, delay in ms");
        if (this.a0 == null) {
            this.a0 = new u3(this, this.E, 2);
        }
        this.a0.b(jMax);
    }

    /* JADX WARN: Code duplicated, block: B:114:0x03f6 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0415 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0430 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x0446 A[Catch: all -> 0x0121, TRY_ENTER, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0456  */
    /* JADX WARN: Code duplicated, block: B:124:0x0458 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x0468  */
    /* JADX WARN: Code duplicated, block: B:130:0x046f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0471 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x049f  */
    /* JADX WARN: Code duplicated, block: B:139:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:140:0x04a5 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:145:0x04bd A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x04c7 A[Catch: all -> 0x0121, LOOP:11: B:143:0x04b7->B:147:0x04c7, LOOP_END, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x04ef A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:158:0x051d A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x0532  */
    /* JADX WARN: Code duplicated, block: B:162:0x0534 A[PHI: r10
      0x0534: PHI (r10v11 com.gamericefishpro.space.i9.h3) = (r10v9 com.gamericefishpro.space.i9.h3), (r10v14 com.gamericefishpro.space.i9.h3) binds: [B:166:0x0553, B:161:0x0532] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:163:0x0538 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x0546 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x0555  */
    /* JADX WARN: Code duplicated, block: B:172:0x0574 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x0583 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:188:0x05c3 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:191:0x05de A[Catch: all -> 0x0121, LOOP:10: B:186:0x05bd->B:191:0x05de, LOOP_END, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:195:0x05e8 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:198:0x05fa A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:211:0x067e A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:213:0x068a A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:218:0x06c9 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:223:0x06f0 A[Catch: all -> 0x0121, LOOP:9: B:222:0x06ee->B:223:0x06f0, LOOP_END, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:224:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:234:0x074e A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:236:0x0757 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:238:0x075d A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:239:0x0766  */
    /* JADX WARN: Code duplicated, block: B:432:0x0e33 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:438:0x0e5e A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:440:0x0e6c A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:441:0x0e79 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:446:0x0ec0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:447:0x0ec2 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x017e  */
    /* JADX WARN: Code duplicated, block: B:451:0x0ef1 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:488:0x0469 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:492:0x069f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:496:0x06dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:498:0x06c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:502:0x05d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:504:0x04cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:508:0x0776 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:525:0x0ec7 A[SYNTHETIC] */
    public final boolean I(String str, long j) {
        boolean z;
        int i;
        Long l;
        r1 r1Var;
        long j2;
        int i2;
        m mVarF0;
        ArrayList arrayList;
        StringBuilder sb;
        int i3;
        int iDelete;
        m mVarF1;
        com.gamericefishpro.space.i9.e2 e2VarD;
        Long l2;
        long j3;
        long j4;
        long j5;
        int I;
        HashMap map;
        long jP;
        Long l3;
        com.gamericefishpro.space.i9.d3 d3VarZ;
        Long lValueOf;
        String str2;
        com.gamericefishpro.space.i9.h3 h3Var;
        String str3;
        String str4;
        int i4;
        int i5;
        com.gamericefishpro.space.i9.d3 d3VarJ;
        com.gamericefishpro.space.i9.z2 z2Var;
        String str5;
        int i6;
        Bundle bundleY;
        int i7;
        z0 z0VarI0;
        ArrayList arrayList2;
        int size;
        int i8;
        com.gamericefishpro.space.i9.c3 c3VarB;
        Object obj;
        com.gamericefishpro.space.i9.d3 d3VarJ2;
        String str6;
        int i9;
        com.gamericefishpro.space.i9.z2 z2Var2;
        ArrayList arrayList3;
        int i10;
        int i11;
        int i12;
        String strS;
        int iCharCount;
        int iCodePointAt;
        com.gamericefishpro.space.i9.h3 h3Var2;
        m4 m4Var = this;
        String str7 = "1";
        String str8 = "_ai";
        String str9 = "purchase";
        String str10 = "items";
        Long l4 = 1L;
        m4Var.f0().d0();
        try {
            e1 e1Var = new e1(m4Var);
            m4Var.f0().Z(str, j, m4Var.T, e1Var);
            ArrayList arrayList4 = (ArrayList) e1Var.d;
            if (arrayList4 == null || arrayList4.isEmpty()) {
                f0().e0();
                z = false;
            } else {
                com.gamericefishpro.space.i9.h3 h3Var3 = (com.gamericefishpro.space.i9.h3) ((com.gamericefishpro.space.i9.i3) e1Var.b).i();
                h3Var3.b();
                ((com.gamericefishpro.space.i9.i3) h3Var3.e).a0();
                int i13 = -1;
                int i14 = -1;
                int i15 = 0;
                int i16 = 0;
                boolean z2 = false;
                boolean z3 = false;
                com.gamericefishpro.space.i9.z2 z2Var3 = null;
                com.gamericefishpro.space.i9.z2 z2Var4 = null;
                while (true) {
                    int size2 = ((ArrayList) e1Var.d).size();
                    i = i16;
                    l = l4;
                    r1Var = m4Var.E;
                    if (i15 >= size2) {
                        break;
                    }
                    com.gamericefishpro.space.i9.z2 z2Var5 = (com.gamericefishpro.space.i9.z2) ((com.gamericefishpro.space.i9.a3) ((ArrayList) e1Var.d).get(i15)).i();
                    int i17 = i15;
                    String str11 = str10;
                    if (m4Var.e0().G(((com.gamericefishpro.space.i9.i3) e1Var.b).p(), z2Var5.n())) {
                        m4Var.a().w().c("Dropping blocked raw event. appId", v0.z(((com.gamericefishpro.space.i9.i3) e1Var.b).p()), r1Var.m().a(z2Var5.n()));
                        if (!str7.equals(m4Var.e0().b(((com.gamericefishpro.space.i9.i3) e1Var.b).p(), "measurement.upload.blacklist_internal")) && !str7.equals(m4Var.e0().b(((com.gamericefishpro.space.i9.i3) e1Var.b).p(), "measurement.upload.blacklist_public")) && !"_err".equals(z2Var5.n())) {
                            m4Var.j0();
                            r4.H(m4Var.c0, ((com.gamericefishpro.space.i9.i3) e1Var.b).p(), 11, "_ev", z2Var5.n(), 0);
                        }
                        str4 = str8;
                        str3 = str9;
                        i16 = i;
                        i6 = i17;
                        str5 = str11;
                    } else {
                        String strN = z2Var5.n();
                        if (strN.equals(str9) || strN.equals("_iap") || strN.equals("ecommerce_purchase")) {
                            com.gamericefishpro.space.i9.c3 c3VarB2 = com.gamericefishpro.space.i9.d3.B();
                            c3VarB2.h("_ct");
                            if (z2) {
                                str2 = "returning";
                            } else {
                                String strP = ((com.gamericefishpro.space.i9.i3) e1Var.b).p();
                                if (m4Var.R(strP, str9) && m4Var.R(strP, "_iap") && m4Var.R(strP, "ecommerce_purchase")) {
                                    str2 = "new";
                                } else {
                                    str2 = "returning";
                                }
                            }
                            c3VarB2.i(str2);
                            z2Var5.k((com.gamericefishpro.space.i9.d3) c3VarB2.e());
                            z2 = true;
                        }
                        if (z2Var5.n().equals(f2.g(str8, f2.c, f2.a))) {
                            z2Var5.b();
                            ((com.gamericefishpro.space.i9.a3) z2Var5.e).F(str8);
                            m4Var.a().y().a("Renaming ad_impression to _ai");
                            if (Log.isLoggable(m4Var.a().B(), 5)) {
                                for (int i18 = 0; i18 < z2Var5.i(); i18++) {
                                    if ("ad_platform".equals(z2Var5.j(i18).q()) && !z2Var5.j(i18).s().isEmpty() && "admob".equalsIgnoreCase(z2Var5.j(i18).s())) {
                                        m4Var.a().D.a("AdMob ad impression logged from app. Potentially duplicative.");
                                    }
                                }
                            }
                        }
                        boolean zH = m4Var.e0().H(((com.gamericefishpro.space.i9.i3) e1Var.b).p(), z2Var5.n());
                        if (!zH) {
                            m4Var.i0();
                            String strN2 = z2Var5.n();
                            com.gamericefishpro.space.v8.c0.d(strN2);
                            if (strN2.hashCode() != 95027 || !strN2.equals("_ui")) {
                                str4 = str8;
                                str3 = str9;
                                h3Var = h3Var3;
                                zH = false;
                            }
                            if (zH) {
                                arrayList3 = new ArrayList(z2Var5.h());
                                i11 = -1;
                                i12 = -1;
                                for (i10 = 0; i10 < arrayList3.size(); i10++) {
                                    if ("value".equals(((com.gamericefishpro.space.i9.d3) arrayList3.get(i10)).q())) {
                                        i11 = i10;
                                    } else if ("currency".equals(((com.gamericefishpro.space.i9.d3) arrayList3.get(i10)).q())) {
                                        i12 = i10;
                                    }
                                }
                                if (i11 != -1) {
                                    if (!((com.gamericefishpro.space.i9.d3) arrayList3.get(i11)).t() || ((com.gamericefishpro.space.i9.d3) arrayList3.get(i11)).x()) {
                                        if (i12 == -1) {
                                            strS = ((com.gamericefishpro.space.i9.d3) arrayList3.get(i12)).s();
                                            if (strS.length() == 3) {
                                                iCharCount = 0;
                                                while (iCharCount < strS.length()) {
                                                    iCodePointAt = strS.codePointAt(iCharCount);
                                                    if (Character.isLetter(iCodePointAt)) {
                                                        iCharCount += Character.charCount(iCodePointAt);
                                                    }
                                                }
                                            }
                                        }
                                        m4Var.a().D.a("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                        z2Var5.m(i11);
                                        E(z2Var5, "_c");
                                        D(z2Var5, 19, "currency");
                                        break;
                                    }
                                    m4Var.a().D.a("Value must be specified with a numeric type.");
                                    z2Var5.m(i11);
                                    E(z2Var5, "_c");
                                    D(z2Var5, 18, "value");
                                }
                            }
                            if ("_e".equals(z2Var5.n())) {
                                m4Var.i0();
                                if (z0.z((com.gamericefishpro.space.i9.a3) z2Var5.e(), "_fr") == null) {
                                    if (z2Var4 != null && Math.abs(z2Var4.o() - z2Var5.o()) <= 1000) {
                                        z2Var2 = (com.gamericefishpro.space.i9.z2) z2Var4.clone();
                                        if (m4Var.K(z2Var5, z2Var2)) {
                                            h3Var3 = h3Var;
                                            h3Var3.W(i14, z2Var2);
                                            i13 = i13;
                                            z2Var3 = null;
                                            z2Var4 = null;
                                        }
                                    }
                                    h3Var3 = h3Var;
                                    z2Var3 = z2Var5;
                                    i13 = i;
                                } else {
                                    h3Var3 = h3Var;
                                    i4 = i13;
                                    i13 = i4;
                                }
                            } else {
                                h3Var3 = h3Var;
                                if ("_vs".equals(z2Var5.n())) {
                                    m4Var.i0();
                                    if (z0.z((com.gamericefishpro.space.i9.a3) z2Var5.e(), "_et") == null) {
                                        if (z2Var3 != null && Math.abs(z2Var3.o() - z2Var5.o()) <= 1000) {
                                            z2Var = (com.gamericefishpro.space.i9.z2) z2Var3.clone();
                                            if (m4Var.K(z2Var, z2Var5)) {
                                                int i19 = i13;
                                                h3Var3.W(i19, z2Var);
                                                i13 = i19;
                                                z2Var3 = null;
                                                z2Var4 = null;
                                            }
                                        }
                                        i13 = i13;
                                        z2Var4 = z2Var5;
                                        i14 = i;
                                    } else {
                                        i4 = i13;
                                        i13 = i4;
                                    }
                                } else {
                                    i4 = i13;
                                    if (m4Var.d0().B(null, e0.j1) && (("_f".equals(z2Var5.n()) || "_v".equals(z2Var5.n())) && ("_f".equals(z2Var5.n()) || "_v".equals(z2Var5.n())))) {
                                        for (i5 = 0; i5 < z2Var5.i(); i5++) {
                                            d3VarJ = z2Var5.j(i5);
                                            if ("_elt".equals(d3VarJ.q())) {
                                                z2Var5.q(d3VarJ.u());
                                                z2Var5.m(i5);
                                                break;
                                            }
                                        }
                                    }
                                    i13 = i4;
                                }
                            }
                            if (z2Var5.i() != 0) {
                                m4Var.i0();
                                bundleY = z0.y(z2Var5.h());
                                i7 = 0;
                                while (i7 < z2Var5.i()) {
                                    d3VarJ2 = z2Var5.j(i7);
                                    str6 = str11;
                                    if (d3VarJ2.q().equals(str6) || d3VarJ2.z().isEmpty()) {
                                        i9 = i7;
                                        if (!d3VarJ2.q().equals(str6)) {
                                            m4Var.x(z2Var5.n(), (com.gamericefishpro.space.i9.c3) d3VarJ2.i(), bundleY, ((com.gamericefishpro.space.i9.i3) e1Var.b).p());
                                        }
                                    } else {
                                        String strP2 = ((com.gamericefishpro.space.i9.i3) e1Var.b).p();
                                        List listZ = d3VarJ2.z();
                                        Bundle[] bundleArr = new Bundle[listZ.size()];
                                        int i20 = 0;
                                        while (i20 < listZ.size()) {
                                            com.gamericefishpro.space.i9.d3 d3Var = (com.gamericefishpro.space.i9.d3) listZ.get(i20);
                                            m4Var.i0();
                                            Bundle bundleY2 = z0.y(d3Var.z());
                                            Iterator it = d3Var.z().iterator();
                                            while (it.hasNext()) {
                                                m4Var.x(z2Var5.n(), (com.gamericefishpro.space.i9.c3) ((com.gamericefishpro.space.i9.d3) it.next()).i(), bundleY2, strP2);
                                                i7 = i7;
                                                listZ = listZ;
                                            }
                                            bundleArr[i20] = bundleY2;
                                            i20++;
                                            i7 = i7;
                                            listZ = listZ;
                                        }
                                        i9 = i7;
                                        bundleY.putParcelableArray(str6, bundleArr);
                                    }
                                    i7 = i9 + 1;
                                    str11 = str6;
                                }
                                str5 = str11;
                                z2Var5.b();
                                ((com.gamericefishpro.space.i9.a3) z2Var5.e).D();
                                z0VarI0 = m4Var.i0();
                                arrayList2 = new ArrayList();
                                for (String str12 : bundleY.keySet()) {
                                    c3VarB = com.gamericefishpro.space.i9.d3.B();
                                    c3VarB.h(str12);
                                    obj = bundleY.get(str12);
                                    if (obj != null) {
                                        z0VarI0.R(c3VarB, obj);
                                        arrayList2.add((com.gamericefishpro.space.i9.d3) c3VarB.e());
                                    }
                                }
                                size = arrayList2.size();
                                i8 = 0;
                                while (i8 < size) {
                                    Object obj2 = arrayList2.get(i8);
                                    i8++;
                                    z2Var5.k((com.gamericefishpro.space.i9.d3) obj2);
                                }
                            } else {
                                str5 = str11;
                            }
                            i6 = i17;
                            ((ArrayList) e1Var.d).set(i6, (com.gamericefishpro.space.i9.a3) z2Var5.e());
                            h3Var3.X(z2Var5);
                            i16 = i + 1;
                        }
                        str4 = str8;
                        int i21 = 0;
                        boolean z4 = false;
                        boolean z5 = false;
                        while (true) {
                            str3 = str9;
                            if (i21 >= z2Var5.i()) {
                                break;
                            }
                            if ("_c".equals(z2Var5.j(i21).q())) {
                                com.gamericefishpro.space.i9.c3 c3Var = (com.gamericefishpro.space.i9.c3) z2Var5.j(i21).i();
                                h3Var2 = h3Var3;
                                c3Var.j(1L);
                                com.gamericefishpro.space.i9.d3 d3Var2 = (com.gamericefishpro.space.i9.d3) c3Var.e();
                                z2Var5.b();
                                ((com.gamericefishpro.space.i9.a3) z2Var5.e).A(i21, d3Var2);
                                z4 = true;
                            } else {
                                h3Var2 = h3Var3;
                                if ("_r".equals(z2Var5.j(i21).q())) {
                                    com.gamericefishpro.space.i9.c3 c3Var2 = (com.gamericefishpro.space.i9.c3) z2Var5.j(i21).i();
                                    c3Var2.j(1L);
                                    com.gamericefishpro.space.i9.d3 d3Var3 = (com.gamericefishpro.space.i9.d3) c3Var2.e();
                                    z2Var5.b();
                                    ((com.gamericefishpro.space.i9.a3) z2Var5.e).A(i21, d3Var3);
                                    z5 = true;
                                    z4 = z4;
                                }
                            }
                            i21++;
                            str9 = str3;
                            h3Var3 = h3Var2;
                        }
                        h3Var = h3Var3;
                        if (!z4 && zH) {
                            m4Var.a().y().b(r1Var.m().a(z2Var5.n()), "Marking event as conversion");
                            com.gamericefishpro.space.i9.c3 c3VarB3 = com.gamericefishpro.space.i9.d3.B();
                            c3VarB3.h("_c");
                            c3VarB3.j(1L);
                            z2Var5.l(c3VarB3);
                        }
                        if (!z5) {
                            m4Var.a().y().b(r1Var.m().a(z2Var5.n()), "Marking event as real-time");
                            com.gamericefishpro.space.i9.c3 c3VarB4 = com.gamericefishpro.space.i9.d3.B();
                            c3VarB4.h("_r");
                            c3VarB4.j(1L);
                            z2Var5.l(c3VarB4);
                        }
                        if (m4Var.f0().v0(m4Var.g(), ((com.gamericefishpro.space.i9.i3) e1Var.b).p(), false, true, false, false).e > m4Var.d0().z(((com.gamericefishpro.space.i9.i3) e1Var.b).p(), e0.p)) {
                            E(z2Var5, "_r");
                        } else {
                            z3 = true;
                        }
                        if (r4.p0(z2Var5.n()) && zH != 0 && m4Var.f0().v0(m4Var.g(), ((com.gamericefishpro.space.i9.i3) e1Var.b).p(), true, false, false, false).c > m4Var.d0().z(((com.gamericefishpro.space.i9.i3) e1Var.b).p(), e0.o)) {
                            m4Var.a().w().b(v0.z(((com.gamericefishpro.space.i9.i3) e1Var.b).p()), "Too many conversions. Not logging as conversion. appId");
                            boolean z6 = false;
                            com.gamericefishpro.space.i9.c3 c3Var3 = null;
                            int i22 = -1;
                            for (int i23 = 0; i23 < z2Var5.i(); i23++) {
                                com.gamericefishpro.space.i9.d3 d3VarJ3 = z2Var5.j(i23);
                                if ("_c".equals(d3VarJ3.q())) {
                                    c3Var3 = (com.gamericefishpro.space.i9.c3) d3VarJ3.i();
                                    i22 = i23;
                                } else if ("_err".equals(d3VarJ3.q())) {
                                    z6 = true;
                                }
                            }
                            if (z6) {
                                if (c3Var3 != null) {
                                    z2Var5.m(i22);
                                } else {
                                    c3Var3 = null;
                                    if (c3Var3 != null) {
                                        com.gamericefishpro.space.i9.c3 c3Var4 = (com.gamericefishpro.space.i9.c3) c3Var3.clone();
                                        c3Var4.h("_err");
                                        c3Var4.j(10L);
                                        com.gamericefishpro.space.i9.d3 d3Var4 = (com.gamericefishpro.space.i9.d3) c3Var4.e();
                                        z2Var5.b();
                                        ((com.gamericefishpro.space.i9.a3) z2Var5.e).A(i22, d3Var4);
                                    } else {
                                        m4Var.a().v().b(v0.z(((com.gamericefishpro.space.i9.i3) e1Var.b).p()), "Did not find conversion parameter. appId");
                                    }
                                }
                            } else if (c3Var3 != null) {
                                com.gamericefishpro.space.i9.c3 c3Var5 = (com.gamericefishpro.space.i9.c3) c3Var3.clone();
                                c3Var5.h("_err");
                                c3Var5.j(10L);
                                com.gamericefishpro.space.i9.d3 d3Var5 = (com.gamericefishpro.space.i9.d3) c3Var5.e();
                                z2Var5.b();
                                ((com.gamericefishpro.space.i9.a3) z2Var5.e).A(i22, d3Var5);
                            } else {
                                m4Var.a().v().b(v0.z(((com.gamericefishpro.space.i9.i3) e1Var.b).p()), "Did not find conversion parameter. appId");
                            }
                        }
                        if (zH) {
                            arrayList3 = new ArrayList(z2Var5.h());
                            i11 = -1;
                            i12 = -1;
                            while (i10 < arrayList3.size()) {
                                if ("value".equals(((com.gamericefishpro.space.i9.d3) arrayList3.get(i10)).q())) {
                                    i11 = i10;
                                } else if ("currency".equals(((com.gamericefishpro.space.i9.d3) arrayList3.get(i10)).q())) {
                                    i12 = i10;
                                }
                            }
                            if (i11 != -1) {
                                if (((com.gamericefishpro.space.i9.d3) arrayList3.get(i11)).t()) {
                                }
                                if (i12 == -1) {
                                    strS = ((com.gamericefishpro.space.i9.d3) arrayList3.get(i12)).s();
                                    if (strS.length() == 3) {
                                        iCharCount = 0;
                                        while (iCharCount < strS.length()) {
                                            iCodePointAt = strS.codePointAt(iCharCount);
                                            if (Character.isLetter(iCodePointAt)) {
                                                iCharCount += Character.charCount(iCodePointAt);
                                            }
                                        }
                                    }
                                }
                                m4Var.a().D.a("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                z2Var5.m(i11);
                                E(z2Var5, "_c");
                                D(z2Var5, 19, "currency");
                                break;
                            }
                        }
                        if ("_e".equals(z2Var5.n())) {
                            m4Var.i0();
                            if (z0.z((com.gamericefishpro.space.i9.a3) z2Var5.e(), "_fr") == null) {
                                if (z2Var4 != null) {
                                    z2Var2 = (com.gamericefishpro.space.i9.z2) z2Var4.clone();
                                    if (m4Var.K(z2Var5, z2Var2)) {
                                        h3Var3 = h3Var;
                                        h3Var3.W(i14, z2Var2);
                                        i13 = i13;
                                        z2Var3 = null;
                                        z2Var4 = null;
                                    }
                                }
                                h3Var3 = h3Var;
                                z2Var3 = z2Var5;
                                i13 = i;
                            } else {
                                h3Var3 = h3Var;
                                i4 = i13;
                                i13 = i4;
                            }
                        } else {
                            h3Var3 = h3Var;
                            if ("_vs".equals(z2Var5.n())) {
                                m4Var.i0();
                                if (z0.z((com.gamericefishpro.space.i9.a3) z2Var5.e(), "_et") == null) {
                                    if (z2Var3 != null) {
                                        z2Var = (com.gamericefishpro.space.i9.z2) z2Var3.clone();
                                        if (m4Var.K(z2Var, z2Var5)) {
                                            int i110 = i13;
                                            h3Var3.W(i110, z2Var);
                                            i13 = i110;
                                            z2Var3 = null;
                                            z2Var4 = null;
                                        }
                                    }
                                    i13 = i13;
                                    z2Var4 = z2Var5;
                                    i14 = i;
                                } else {
                                    i4 = i13;
                                    i13 = i4;
                                }
                            } else {
                                i4 = i13;
                                if (m4Var.d0().B(null, e0.j1)) {
                                    while (i5 < z2Var5.i()) {
                                        d3VarJ = z2Var5.j(i5);
                                        if ("_elt".equals(d3VarJ.q())) {
                                            z2Var5.q(d3VarJ.u());
                                            z2Var5.m(i5);
                                            break;
                                        }
                                    }
                                }
                                i13 = i4;
                            }
                        }
                        if (z2Var5.i() != 0) {
                            m4Var.i0();
                            bundleY = z0.y(z2Var5.h());
                            i7 = 0;
                            while (i7 < z2Var5.i()) {
                                d3VarJ2 = z2Var5.j(i7);
                                str6 = str11;
                                if (d3VarJ2.q().equals(str6)) {
                                    i9 = i7;
                                    if (!d3VarJ2.q().equals(str6)) {
                                        m4Var.x(z2Var5.n(), (com.gamericefishpro.space.i9.c3) d3VarJ2.i(), bundleY, ((com.gamericefishpro.space.i9.i3) e1Var.b).p());
                                    }
                                } else {
                                    i9 = i7;
                                    if (!d3VarJ2.q().equals(str6)) {
                                        m4Var.x(z2Var5.n(), (com.gamericefishpro.space.i9.c3) d3VarJ2.i(), bundleY, ((com.gamericefishpro.space.i9.i3) e1Var.b).p());
                                    }
                                }
                                i7 = i9 + 1;
                                str11 = str6;
                            }
                            str5 = str11;
                            z2Var5.b();
                            ((com.gamericefishpro.space.i9.a3) z2Var5.e).D();
                            z0VarI0 = m4Var.i0();
                            arrayList2 = new ArrayList();
                            while (r5.hasNext()) {
                                c3VarB = com.gamericefishpro.space.i9.d3.B();
                                c3VarB.h(str12);
                                obj = bundleY.get(str12);
                                if (obj != null) {
                                    z0VarI0.R(c3VarB, obj);
                                    arrayList2.add((com.gamericefishpro.space.i9.d3) c3VarB.e());
                                }
                            }
                            size = arrayList2.size();
                            i8 = 0;
                            while (i8 < size) {
                                Object obj3 = arrayList2.get(i8);
                                i8++;
                                z2Var5.k((com.gamericefishpro.space.i9.d3) obj3);
                            }
                        } else {
                            str5 = str11;
                        }
                        i6 = i17;
                        ((ArrayList) e1Var.d).set(i6, (com.gamericefishpro.space.i9.a3) z2Var5.e());
                        h3Var3.X(z2Var5);
                        i16 = i + 1;
                    }
                    i15 = i6 + 1;
                    str10 = str5;
                    l4 = l;
                    str7 = str7;
                    str8 = str4;
                    str9 = str3;
                }
                long j6 = 0;
                long jLongValue = 0;
                int i24 = i;
                int i25 = 0;
                while (i25 < i24) {
                    com.gamericefishpro.space.i9.a3 a3VarT1 = ((com.gamericefishpro.space.i9.i3) h3Var3.e).T1(i25);
                    if ("_e".equals(a3VarT1.s())) {
                        m4Var.i0();
                        if (z0.z(a3VarT1, "_fr") != null) {
                            h3Var3.Y(i25);
                            i24--;
                            i25--;
                        } else {
                            m4Var.i0();
                            d3VarZ = z0.z(a3VarT1, "_et");
                            if (d3VarZ == null) {
                                if (d3VarZ.t()) {
                                    lValueOf = Long.valueOf(d3VarZ.u());
                                } else {
                                    lValueOf = null;
                                }
                                if (lValueOf == null && lValueOf.longValue() > 0) {
                                    jLongValue += lValueOf.longValue();
                                }
                            }
                        }
                    } else {
                        m4Var.i0();
                        d3VarZ = z0.z(a3VarT1, "_et");
                        if (d3VarZ == null) {
                            if (d3VarZ.t()) {
                                lValueOf = Long.valueOf(d3VarZ.u());
                            } else {
                                lValueOf = null;
                            }
                            if (lValueOf == null) {
                            }
                        }
                    }
                    i25++;
                }
                m4Var.J(h3Var3, jLongValue, false);
                Iterator it2 = h3Var3.U().iterator();
                while (it2.hasNext()) {
                    if ("_s".equals(((com.gamericefishpro.space.i9.a3) it2.next()).s())) {
                        m4Var.f0().j0(h3Var3.o(), "_se");
                        break;
                    }
                }
                if (z0.f0(h3Var3, "_sid") >= 0) {
                    m4Var.J(h3Var3, jLongValue, true);
                } else {
                    int iF0 = z0.f0(h3Var3, "_se");
                    if (iF0 >= 0) {
                        h3Var3.b();
                        ((com.gamericefishpro.space.i9.i3) h3Var3.e).e0(iF0);
                        m4Var.a().v().b(v0.z(((com.gamericefishpro.space.i9.i3) e1Var.b).p()), "Session engagement user property is in the bundle without session ID. appId");
                    }
                }
                String strP3 = ((com.gamericefishpro.space.i9.i3) e1Var.b).p();
                m4Var.c().r();
                m4Var.k0();
                a1 a1VarT0 = m4Var.f0().t0(strP3);
                if (a1VarT0 == null) {
                    m4Var.a().v().b(v0.z(strP3), "Cannot fix consent fields without appInfo. appId");
                } else {
                    m4Var.m(a1VarT0, h3Var3);
                }
                String strP4 = ((com.gamericefishpro.space.i9.i3) e1Var.b).p();
                m4Var.c().r();
                m4Var.k0();
                a1 a1VarT1 = m4Var.f0().t0(strP4);
                if (a1VarT1 == null) {
                    m4Var.a().w().b(v0.z(strP4), "Cannot populate ad_campaign_info without appInfo. appId");
                } else {
                    m4Var.n(a1VarT1, h3Var3);
                }
                h3Var3.b();
                ((com.gamericefishpro.space.i9.i3) h3Var3.e).h0(Long.MAX_VALUE);
                h3Var3.b();
                ((com.gamericefishpro.space.i9.i3) h3Var3.e).i0(Long.MIN_VALUE);
                for (int i26 = 0; i26 < h3Var3.V(); i26++) {
                    com.gamericefishpro.space.i9.a3 a3VarT2 = ((com.gamericefishpro.space.i9.i3) h3Var3.e).T1(i26);
                    if (a3VarT2.u() < ((com.gamericefishpro.space.i9.i3) h3Var3.e).a2()) {
                        long jU = a3VarT2.u();
                        h3Var3.b();
                        ((com.gamericefishpro.space.i9.i3) h3Var3.e).h0(jU);
                    }
                    if (a3VarT2.u() > ((com.gamericefishpro.space.i9.i3) h3Var3.e).c2()) {
                        long jU2 = a3VarT2.u();
                        h3Var3.b();
                        ((com.gamericefishpro.space.i9.i3) h3Var3.e).i0(jU2);
                    }
                }
                h3Var3.M();
                e2 e2Var = e2.c;
                e2 e2VarJ = m4Var.b(((com.gamericefishpro.space.i9.i3) e1Var.b).p()).j(e2.c(100, ((com.gamericefishpro.space.i9.i3) e1Var.b).u0()));
                e2 e2VarW = m4Var.f0().W(((com.gamericefishpro.space.i9.i3) e1Var.b).p());
                m4Var.f0().V(((com.gamericefishpro.space.i9.i3) e1Var.b).p(), e2VarJ);
                d2 d2Var = d2.ANALYTICS_STORAGE;
                if (!e2VarJ.i(d2Var) && e2VarW.i(d2Var)) {
                    m4Var.f0().h0(((com.gamericefishpro.space.i9.i3) e1Var.b).p());
                } else if (e2VarJ.i(d2Var) && !e2VarW.i(d2Var)) {
                    m4Var.f0().i0(((com.gamericefishpro.space.i9.i3) e1Var.b).p());
                }
                d2 d2Var2 = d2.AD_STORAGE;
                if (!e2VarJ.i(d2Var2)) {
                    h3Var3.b();
                    ((com.gamericefishpro.space.i9.i3) h3Var3.e).z1();
                    h3Var3.b();
                    ((com.gamericefishpro.space.i9.i3) h3Var3.e).B1();
                    h3Var3.b();
                    ((com.gamericefishpro.space.i9.i3) h3Var3.e).S0();
                }
                if (!e2VarJ.i(d2Var)) {
                    h3Var3.b();
                    ((com.gamericefishpro.space.i9.i3) h3Var3.e).D1();
                    h3Var3.b();
                    ((com.gamericefishpro.space.i9.i3) h3Var3.e).Z0();
                }
                r8.a();
                if (m4Var.d0().B(((com.gamericefishpro.space.i9.i3) e1Var.b).p(), e0.P0)) {
                    m4Var.j0();
                    if (r4.N(((com.gamericefishpro.space.i9.i3) e1Var.b).p()) && m4Var.b(((com.gamericefishpro.space.i9.i3) e1Var.b).p()).i(d2Var2) && ((com.gamericefishpro.space.i9.i3) e1Var.b).z0()) {
                        m4Var.w(h3Var3, e1Var);
                    }
                }
                h3Var3.b();
                ((com.gamericefishpro.space.i9.i3) h3Var3.e).L1();
                h3Var3.J(m4Var.h0().v(h3Var3.o(), h3Var3.U(), Collections.unmodifiableList(((com.gamericefishpro.space.i9.i3) h3Var3.e).U1()), Long.valueOf(((com.gamericefishpro.space.i9.i3) h3Var3.e).a2()), Long.valueOf(((com.gamericefishpro.space.i9.i3) h3Var3.e).c2()), !e2VarJ.i(d2Var)));
                if (m4Var.d0().t(((com.gamericefishpro.space.i9.i3) e1Var.b).p())) {
                    HashMap map2 = new HashMap();
                    ArrayList arrayList5 = new ArrayList();
                    SecureRandom secureRandomO0 = m4Var.j0().o0();
                    int i27 = 0;
                    while (i27 < h3Var3.V()) {
                        com.gamericefishpro.space.i9.z2 z2Var6 = (com.gamericefishpro.space.i9.z2) ((com.gamericefishpro.space.i9.i3) h3Var3.e).T1(i27).i();
                        if (z2Var6.n().equals("_ep")) {
                            m4Var.i0();
                            String str13 = (String) z0.A((com.gamericefishpro.space.i9.a3) z2Var6.e(), "_en");
                            r rVarP = (r) map2.get(str13);
                            if (rVarP == null) {
                                m mVarF2 = m4Var.f0();
                                String strP5 = ((com.gamericefishpro.space.i9.i3) e1Var.b).p();
                                com.gamericefishpro.space.v8.c0.g(str13);
                                rVarP = mVarF2.P("events", strP5, str13);
                                if (rVarP != null) {
                                    map2.put(str13, rVarP);
                                }
                            }
                            if (rVarP == null || rVarP.i != null) {
                                l2 = l;
                            } else {
                                Long l5 = rVarP.j;
                                if (l5 != null && l5.longValue() > 1) {
                                    m4Var.i0();
                                    z0.x(z2Var6, "_sr", l5);
                                }
                                Boolean bool = rVarP.k;
                                if (bool == null || !bool.booleanValue()) {
                                    l2 = l;
                                } else {
                                    m4Var.i0();
                                    l2 = l;
                                    z0.x(z2Var6, "_efs", l2);
                                }
                                arrayList5.add((com.gamericefishpro.space.i9.a3) z2Var6.e());
                            }
                            h3Var3.W(i27, z2Var6);
                            j3 = j6;
                        } else {
                            l2 = l;
                            l1 l1VarE0 = m4Var.e0();
                            j3 = j6;
                            String strP6 = ((com.gamericefishpro.space.i9.i3) e1Var.b).p();
                            String strB = l1VarE0.b(strP6, "measurement.account.time_zone_offset_minutes");
                            if (TextUtils.isEmpty(strB)) {
                                j4 = j3;
                            } else {
                                try {
                                    j4 = Long.parseLong(strB);
                                } catch (NumberFormatException e) {
                                    ((r1) l1VarE0.d).a().w().c("Unable to parse timezone offset. appId", v0.z(strP6), e);
                                    j4 = j3;
                                }
                            }
                            m4Var.j0();
                            long j7 = j4 * 60000;
                            long jO = (z2Var6.o() + j7) / 86400000;
                            com.gamericefishpro.space.i9.a3 a3Var = (com.gamericefishpro.space.i9.a3) z2Var6.e();
                            if (TextUtils.isEmpty("_dbg")) {
                                j5 = j7;
                            } else {
                                Iterator it3 = a3Var.p().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        com.gamericefishpro.space.i9.d3 d3Var6 = (com.gamericefishpro.space.i9.d3) it3.next();
                                        j5 = j7;
                                        if ("_dbg".equals(d3Var6.q())) {
                                            I = !l2.equals(Long.valueOf(d3Var6.u())) ? e0().I(((com.gamericefishpro.space.i9.i3) e1Var.b).p(), z2Var6.n()) : 1;
                                        } else {
                                            j7 = j5;
                                        }
                                    } else {
                                        j5 = j7;
                                    }
                                }
                            }
                            if (I <= 0) {
                                a().w().c("Sample rate must be positive. event, rate", z2Var6.n(), Integer.valueOf(I));
                                arrayList5.add((com.gamericefishpro.space.i9.a3) z2Var6.e());
                                h3Var3.W(i27, z2Var6);
                            } else {
                                r rVarB = (r) map2.get(z2Var6.n());
                                if (rVarB == null && (rVarB = f0().P("events", ((com.gamericefishpro.space.i9.i3) e1Var.b).p(), z2Var6.n())) == null) {
                                    a().w().c("Event being bundled has no eventAggregate. appId, eventName", ((com.gamericefishpro.space.i9.i3) e1Var.b).p(), z2Var6.n());
                                    rVarB = new r(((com.gamericefishpro.space.i9.i3) e1Var.b).p(), z2Var6.n(), 1L, 1L, 1L, z2Var6.o(), 0L, null, null, null, null);
                                }
                                i0();
                                Long l6 = (Long) z0.A((com.gamericefishpro.space.i9.a3) z2Var6.e(), "_eid");
                                boolean z7 = l6 != null;
                                if (I == 1) {
                                    arrayList5.add((com.gamericefishpro.space.i9.a3) z2Var6.e());
                                    if (z7 && (rVarB.i != null || rVarB.j != null || rVarB.k != null)) {
                                        map2.put(z2Var6.n(), rVarB.b(null, null, null));
                                    }
                                    h3Var3.W(i27, z2Var6);
                                } else {
                                    if (secureRandomO0.nextInt(I) == 0) {
                                        i0();
                                        HashMap map3 = map2;
                                        Long lValueOf2 = Long.valueOf(I);
                                        z0.x(z2Var6, "_sr", lValueOf2);
                                        arrayList5.add((com.gamericefishpro.space.i9.a3) z2Var6.e());
                                        if (z7) {
                                            rVarB = rVarB.b(null, lValueOf2, null);
                                        }
                                        map = map3;
                                        map.put(z2Var6.n(), new r(rVarB.a, rVarB.b, rVarB.c, rVarB.d, rVarB.e, rVarB.f, z2Var6.o(), Long.valueOf(jO), rVarB.i, rVarB.j, rVarB.k));
                                        l3 = l2;
                                    } else {
                                        map = map2;
                                        Long l7 = rVarB.h;
                                        if (l7 != null) {
                                            jP = l7.longValue();
                                        } else {
                                            j0();
                                            jP = (j5 + z2Var6.p()) / 86400000;
                                        }
                                        if (jP != jO) {
                                            i0();
                                            z0.x(z2Var6, "_efs", l2);
                                            i0();
                                            l3 = l2;
                                            Long lValueOf3 = Long.valueOf(I);
                                            z0.x(z2Var6, "_sr", lValueOf3);
                                            arrayList5.add((com.gamericefishpro.space.i9.a3) z2Var6.e());
                                            if (z7) {
                                                rVarB = rVarB.b(null, lValueOf3, Boolean.TRUE);
                                            }
                                            map.put(z2Var6.n(), new r(rVarB.a, rVarB.b, rVarB.c, rVarB.d, rVarB.e, rVarB.f, z2Var6.o(), Long.valueOf(jO), rVarB.i, rVarB.j, rVarB.k));
                                        } else {
                                            l3 = l2;
                                            if (z7) {
                                                map.put(z2Var6.n(), rVarB.b(l6, null, null));
                                            }
                                        }
                                    }
                                    h3Var3.W(i27, z2Var6);
                                }
                                i27++;
                                m4Var = this;
                                l = l3;
                                map2 = map;
                                j6 = j3;
                            }
                        }
                        map = map2;
                        l3 = l2;
                        i27++;
                        m4Var = this;
                        l = l3;
                        map2 = map;
                        j6 = j3;
                    }
                    j2 = j6;
                    HashMap map4 = map2;
                    if (arrayList5.size() < h3Var3.V()) {
                        h3Var3.b();
                        ((com.gamericefishpro.space.i9.i3) h3Var3.e).a0();
                        h3Var3.b();
                        ((com.gamericefishpro.space.i9.i3) h3Var3.e).Z(arrayList5);
                    }
                    Iterator it4 = map4.entrySet().iterator();
                    while (it4.hasNext()) {
                        f0().Q("events", (r) ((Map.Entry) it4.next()).getValue());
                    }
                } else {
                    j2 = 0;
                }
                String strP7 = ((com.gamericefishpro.space.i9.i3) e1Var.b).p();
                a1 a1VarT2 = f0().t0(strP7);
                try {
                    if (a1VarT2 == null) {
                        a().v().b(v0.z(((com.gamericefishpro.space.i9.i3) e1Var.b).p()), "Bundling raw events w/o app info. appId");
                    } else {
                        if (h3Var3.V() > 0) {
                            p1 p1Var = a1VarT2.a.z;
                            r1.l(p1Var);
                            p1Var.r();
                            long j8 = a1VarT2.i;
                            if (j8 != j2) {
                                h3Var3.h(j8);
                            } else {
                                h3Var3.i();
                            }
                            p1 p1Var2 = a1VarT2.a.z;
                            r1.l(p1Var2);
                            p1Var2.r();
                            long j9 = a1VarT2.h;
                            if (j9 != j2) {
                                j8 = j9;
                            }
                            if (j8 != j2) {
                                h3Var3.b0(j8);
                            } else {
                                h3Var3.c0();
                            }
                            a1VarT2.h(h3Var3.V());
                            p1 p1Var3 = a1VarT2.a.z;
                            r1.l(p1Var3);
                            p1Var3.r();
                            int i28 = (int) a1VarT2.F;
                            h3Var3.b();
                            ((com.gamericefishpro.space.i9.i3) h3Var3.e).j1(i28);
                            p1 p1Var4 = a1VarT2.a.z;
                            r1.l(p1Var4);
                            p1Var4.r();
                            h3Var3.x((int) a1VarT2.g);
                            a1VarT2.L(((com.gamericefishpro.space.i9.i3) h3Var3.e).a2());
                            a1VarT2.M(((com.gamericefishpro.space.i9.i3) h3Var3.e).c2());
                            String strU = a1VarT2.u();
                            if (strU != null) {
                                h3Var3.F(strU);
                            } else {
                                h3Var3.G();
                            }
                            i2 = 0;
                            f0().u0(a1VarT2, false);
                        }
                        if (h3Var3.V() > 0) {
                            r1Var.getClass();
                            e2VarD = e0().D(((com.gamericefishpro.space.i9.i3) e1Var.b).p());
                            if (e2VarD == null && e2VarD.p()) {
                                long jQ = e2VarD.q();
                                h3Var3.b();
                                ((com.gamericefishpro.space.i9.i3) h3Var3.e).Q0(jQ);
                            } else if (((com.gamericefishpro.space.i9.i3) e1Var.b).E().isEmpty()) {
                                h3Var3.b();
                                ((com.gamericefishpro.space.i9.i3) h3Var3.e).Q0(-1L);
                            } else {
                                a().w().b(v0.z(((com.gamericefishpro.space.i9.i3) e1Var.b).p()), "Did not find measurement config or missing version info. appId");
                            }
                            f0().y0((com.gamericefishpro.space.i9.i3) h3Var3.e(), z3);
                        }
                        mVarF0 = f0();
                        arrayList = (ArrayList) e1Var.c;
                        com.gamericefishpro.space.v8.c0.g(arrayList);
                        mVarF0.r();
                        mVarF0.s();
                        sb = new StringBuilder("rowid in (");
                        for (i3 = i2; i3 < arrayList.size(); i3++) {
                            if (i3 != 0) {
                                sb.append(",");
                            }
                            sb.append(((Long) arrayList.get(i3)).longValue());
                        }
                        sb.append(")");
                        iDelete = mVarF0.g0().delete("raw_events", sb.toString(), null);
                        if (iDelete != arrayList.size()) {
                            ((r1) mVarF0.d).a().v().c("Deleted fewer rows from raw events table than expected", Integer.valueOf(iDelete), Integer.valueOf(arrayList.size()));
                        }
                        mVarF1 = f0();
                        mVarF1.g0().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{strP7, strP7});
                        f0().e0();
                        z = true;
                    }
                    mVarF1.g0().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{strP7, strP7});
                } catch (SQLiteException e2) {
                    ((r1) mVarF1.d).a().v().c("Failed to remove unused event metadata. appId", v0.z(strP7), e2);
                }
                i2 = 0;
                if (h3Var3.V() > 0) {
                    r1Var.getClass();
                    e2VarD = e0().D(((com.gamericefishpro.space.i9.i3) e1Var.b).p());
                    if (e2VarD == null) {
                        if (((com.gamericefishpro.space.i9.i3) e1Var.b).E().isEmpty()) {
                            h3Var3.b();
                            ((com.gamericefishpro.space.i9.i3) h3Var3.e).Q0(-1L);
                        } else {
                            a().w().b(v0.z(((com.gamericefishpro.space.i9.i3) e1Var.b).p()), "Did not find measurement config or missing version info. appId");
                        }
                    } else if (((com.gamericefishpro.space.i9.i3) e1Var.b).E().isEmpty()) {
                        h3Var3.b();
                        ((com.gamericefishpro.space.i9.i3) h3Var3.e).Q0(-1L);
                    } else {
                        a().w().b(v0.z(((com.gamericefishpro.space.i9.i3) e1Var.b).p()), "Did not find measurement config or missing version info. appId");
                    }
                    f0().y0((com.gamericefishpro.space.i9.i3) h3Var3.e(), z3);
                }
                mVarF0 = f0();
                arrayList = (ArrayList) e1Var.c;
                com.gamericefishpro.space.v8.c0.g(arrayList);
                mVarF0.r();
                mVarF0.s();
                sb = new StringBuilder("rowid in (");
                while (i3 < arrayList.size()) {
                    if (i3 != 0) {
                        sb.append(",");
                    }
                    sb.append(((Long) arrayList.get(i3)).longValue());
                }
                sb.append(")");
                iDelete = mVarF0.g0().delete("raw_events", sb.toString(), null);
                if (iDelete != arrayList.size()) {
                    ((r1) mVarF0.d).a().v().c("Deleted fewer rows from raw events table than expected", Integer.valueOf(iDelete), Integer.valueOf(arrayList.size()));
                }
                mVarF1 = f0();
                f0().e0();
                z = true;
            }
            f0().f0();
            return z;
        } catch (Throwable th) {
            f0().f0();
            throw th;
        }
    }

    public final void J(com.gamericefishpro.space.i9.h3 h3Var, long j, boolean z) {
        p4 p4Var;
        Object obj;
        String str = true != z ? "_lte" : "_se";
        m mVar = this.i;
        T(mVar);
        p4 p4VarL0 = mVar.l0(h3Var.o(), str);
        if (p4VarL0 == null || (obj = p4VarL0.e) == null) {
            String strO = h3Var.o();
            e().getClass();
            p4Var = new p4(strO, "auto", str, System.currentTimeMillis(), Long.valueOf(j));
        } else {
            String strO2 = h3Var.o();
            e().getClass();
            p4Var = new p4(strO2, "auto", str, System.currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j));
        }
        com.gamericefishpro.space.i9.q3 q3VarA = com.gamericefishpro.space.i9.r3.A();
        q3VarA.b();
        ((com.gamericefishpro.space.i9.r3) q3VarA.e).C(str);
        e().getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        q3VarA.b();
        ((com.gamericefishpro.space.i9.r3) q3VarA.e).B(jCurrentTimeMillis);
        Object obj2 = p4Var.e;
        long jLongValue = ((Long) obj2).longValue();
        q3VarA.b();
        ((com.gamericefishpro.space.i9.r3) q3VarA.e).F(jLongValue);
        com.gamericefishpro.space.i9.r3 r3Var = (com.gamericefishpro.space.i9.r3) q3VarA.e();
        int iF0 = z0.f0(h3Var, str);
        if (iF0 >= 0) {
            h3Var.b();
            ((com.gamericefishpro.space.i9.i3) h3Var.e).c0(iF0, r3Var);
        } else {
            h3Var.b();
            ((com.gamericefishpro.space.i9.i3) h3Var.e).d0(r3Var);
        }
        if (j > 0) {
            m mVar2 = this.i;
            T(mVar2);
            mVar2.k0(p4Var);
            a().G.c("Updated engagement user property. scope, value", true != z ? "lifetime" : "session-scoped", obj2);
        }
    }

    public final boolean K(com.gamericefishpro.space.i9.z2 z2Var, com.gamericefishpro.space.i9.z2 z2Var2) {
        com.gamericefishpro.space.v8.c0.b("_e".equals(z2Var.n()));
        i0();
        com.gamericefishpro.space.i9.d3 d3VarZ = z0.z((com.gamericefishpro.space.i9.a3) z2Var.e(), "_sc");
        String strS = d3VarZ == null ? null : d3VarZ.s();
        i0();
        com.gamericefishpro.space.i9.d3 d3VarZ2 = z0.z((com.gamericefishpro.space.i9.a3) z2Var2.e(), "_pc");
        String strS2 = d3VarZ2 != null ? d3VarZ2.s() : null;
        if (strS2 == null || !strS2.equals(strS)) {
            return false;
        }
        com.gamericefishpro.space.v8.c0.b("_e".equals(z2Var.n()));
        i0();
        com.gamericefishpro.space.i9.d3 d3VarZ3 = z0.z((com.gamericefishpro.space.i9.a3) z2Var.e(), "_et");
        if (d3VarZ3 == null || !d3VarZ3.t() || d3VarZ3.u() <= 0) {
            return true;
        }
        long jU = d3VarZ3.u();
        i0();
        com.gamericefishpro.space.i9.d3 d3VarZ4 = z0.z((com.gamericefishpro.space.i9.a3) z2Var2.e(), "_et");
        if (d3VarZ4 != null && d3VarZ4.u() > 0) {
            jU += d3VarZ4.u();
        }
        i0();
        z0.x(z2Var2, "_et", Long.valueOf(jU));
        i0();
        z0.x(z2Var, "_fr", 1L);
        return true;
    }

    public final boolean L() {
        c().r();
        k0();
        m mVar = this.i;
        T(mVar);
        if (mVar.b0("select count(1) > 0 from raw_events", null) != 0) {
            return true;
        }
        m mVar2 = this.i;
        T(mVar2);
        return !TextUtils.isEmpty(mVar2.z());
    }

    /* JADX WARN: Code duplicated, block: B:109:0x035e  */
    /* JADX WARN: Code duplicated, block: B:112:0x037e  */
    /* JADX WARN: Code duplicated, block: B:16:0x008f  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:60:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:62:0x01df  */
    /* JADX WARN: Code duplicated, block: B:64:0x0205  */
    /* JADX WARN: Code duplicated, block: B:67:0x0223  */
    /* JADX WARN: Code duplicated, block: B:70:0x0270  */
    /* JADX WARN: Code duplicated, block: B:73:0x0280  */
    /* JADX WARN: Code duplicated, block: B:95:0x032a  */
    public final void N() {
        boolean z;
        long jMax;
        long jMax2;
        int i;
        z0 z0Var;
        b1 b1VarG0;
        m4 m4Var;
        long jA;
        long jMax3;
        long jCurrentTimeMillis;
        b4 b4Var;
        v0 v0Var;
        Context context;
        JobInfo jobInfoBuild;
        JobScheduler jobScheduler;
        Method method;
        int iIntValue;
        z0 z0Var2 = this.z;
        c().r();
        k0();
        if (this.H > 0) {
            e().getClass();
            long jAbs = 3600000 - Math.abs(SystemClock.elapsedRealtime() - this.H);
            if (jAbs > 0) {
                a().G.b(Long.valueOf(jAbs), "Upload has been suspended. Will update scheduling later in approximately ms");
                g0().a();
                b4 b4Var2 = this.w;
                T(b4Var2);
                b4Var2.v();
                return;
            }
            this.H = 0L;
        }
        if (!this.E.h() || !L()) {
            a().G.a("Nothing to upload or uploading impossible");
            g0().a();
            b4 b4Var3 = this.w;
            T(b4Var3);
            b4Var3.v();
            return;
        }
        e().getClass();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        d0();
        long jMax4 = Math.max(0L, ((Long) e0.O.a(null)).longValue());
        m mVar = this.i;
        T(mVar);
        if (mVar.b0("select count(1) > 0 from raw_events where realtime = 1", null) != 0) {
            z = true;
        } else {
            m mVar2 = this.i;
            T(mVar2);
            if (mVar2.b0("select count(1) > 0 from queue where has_realtime = 1", null) != 0) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            String strV = d0().v("debug.firebase.analytics.app");
            if (TextUtils.isEmpty(strV) || ".none.".equals(strV)) {
                d0();
                jMax = Math.max(0L, ((Long) e0.I.a(null)).longValue());
            } else {
                d0();
                jMax = Math.max(0L, ((Long) e0.J.a(null)).longValue());
            }
        } else {
            d0();
            jMax = Math.max(0L, ((Long) e0.H.a(null)).longValue());
        }
        long jA2 = this.B.A.a();
        long jA3 = this.B.B.a();
        m mVar3 = this.i;
        T(mVar3);
        long jC0 = mVar3.c0("select max(bundle_end_timestamp) from queue", null, 0L);
        m mVar4 = this.i;
        T(mVar4);
        long jMax5 = Math.max(jC0, mVar4.c0("select max(timestamp) from raw_events", null, 0L));
        if (jMax5 != 0) {
            long jAbs2 = jCurrentTimeMillis2 - Math.abs(jMax5 - jCurrentTimeMillis2);
            long jAbs3 = jCurrentTimeMillis2 - Math.abs(jA2 - jCurrentTimeMillis2);
            long jAbs4 = jCurrentTimeMillis2 - Math.abs(jA3 - jCurrentTimeMillis2);
            long jMin = jMax4 + jAbs2;
            long jMax6 = Math.max(jAbs3, jAbs4);
            if (z && jMax6 > 0) {
                jMin = Math.min(jAbs2, jMax6) + jMax;
            }
            T(z0Var2);
            jMax2 = !z0Var2.b0(jMax6, jMax) ? jMax6 + jMax : jMin;
            if (jAbs4 != 0 && jAbs4 >= jAbs2) {
                int i2 = 0;
                while (true) {
                    d0();
                    i = 0;
                    if (i2 >= Math.min(20, Math.max(0, ((Integer) e0.Q.a(null)).intValue()))) {
                        jMax2 = 0;
                        break;
                    }
                    d0();
                    jMax2 += Math.max(0L, ((Long) e0.P.a(null)).longValue()) * (1 << i2);
                    if (jMax2 > jAbs4) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            if (jMax2 == 0) {
                a().G.a("Next upload time is 0");
                g0().a();
                b4 b4Var4 = this.w;
                T(b4Var4);
                b4Var4.v();
                return;
            }
            z0Var = this.e;
            T(z0Var);
            if (z0Var.L()) {
                a().G.a("No network");
                b1VarG0 = g0();
                m4Var = b1VarG0.a;
                m4Var.k0();
                m4Var.c().r();
                if (!b1VarG0.b) {
                    m4Var.E.d.registerReceiver(b1VarG0, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    z0 z0Var3 = m4Var.e;
                    T(z0Var3);
                    b1VarG0.c = z0Var3.L();
                    m4Var.a().G.b(Boolean.valueOf(b1VarG0.c), "Registering connectivity change receiver. Network connected");
                    b1VarG0.b = true;
                }
                b4 b4Var5 = this.w;
                T(b4Var5);
                b4Var5.v();
                return;
            }
            jA = this.B.z.a();
            d0();
            jMax3 = Math.max(0L, ((Long) e0.G.a(null)).longValue());
            T(z0Var2);
            if (!z0Var2.b0(jA, jMax3)) {
                jMax2 = Math.max(jMax2, jA + jMax3);
            }
            g0().a();
            e().getClass();
            jCurrentTimeMillis = jMax2 - System.currentTimeMillis();
            if (jCurrentTimeMillis <= 0) {
                d0();
                jCurrentTimeMillis = Math.max(0L, ((Long) e0.K.a(null)).longValue());
                d1 d1Var = this.B.A;
                e().getClass();
                d1Var.b(System.currentTimeMillis());
            }
            a().G.b(Long.valueOf(jCurrentTimeMillis), "Upload scheduled in approximately ms");
            b4Var = this.w;
            T(b4Var);
            b4Var.s();
            r1 r1Var = (r1) b4Var.d;
            r1Var.getClass();
            v0Var = r1Var.y;
            context = r1Var.d;
            if (!r4.h0(context)) {
                r1.l(v0Var);
                v0Var.F.a("Receiver not registered/enabled");
            }
            if (!r4.K(context)) {
                r1.l(v0Var);
                v0Var.F.a("Service not registered/enabled");
            }
            b4Var.v();
            r1.l(v0Var);
            v0Var.G.b(Long.valueOf(jCurrentTimeMillis), "Scheduling upload, millis");
            r1Var.D.getClass();
            SystemClock.elapsedRealtime();
            if (jCurrentTimeMillis < Math.max(0L, ((Long) e0.L.a(null)).longValue()) && b4Var.w().c == 0) {
                b4Var.w().b(jCurrentTimeMillis);
            }
            ComponentName componentName = new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService");
            int iY = b4Var.y();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            jobInfoBuild = new JobInfo.Builder(iY, componentName).setMinimumLatency(jCurrentTimeMillis).setOverrideDeadline(jCurrentTimeMillis + jCurrentTimeMillis).setExtras(persistableBundle).build();
            Method method2 = com.gamericefishpro.space.i9.f0.a;
            jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            jobScheduler.getClass();
            method = com.gamericefishpro.space.i9.f0.a;
            if (method != null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
                jobScheduler.schedule(jobInfoBuild);
            }
            Method method3 = com.gamericefishpro.space.i9.f0.b;
            if (method3 != null) {
                try {
                    Integer num = (Integer) method3.invoke(UserHandle.class, null);
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = i;
                    }
                } catch (IllegalAccessException | InvocationTargetException e) {
                    if (Log.isLoggable("JobSchedulerCompat", 6)) {
                        Log.e("JobSchedulerCompat", "myUserId invocation illegal", e);
                    }
                }
            } else {
                iIntValue = i;
            }
            try {
                return;
            } catch (IllegalAccessException | InvocationTargetException e2) {
                Log.e("UploadAlarm", "error calling scheduleAsPackage", e2);
                jobScheduler.schedule(jobInfoBuild);
                return;
            }
        }
        jMax2 = 0;
        i = 0;
        if (jMax2 == 0) {
            a().G.a("Next upload time is 0");
            g0().a();
            b4 b4Var6 = this.w;
            T(b4Var6);
            b4Var6.v();
            return;
        }
        z0Var = this.e;
        T(z0Var);
        if (z0Var.L()) {
            a().G.a("No network");
            b1VarG0 = g0();
            m4Var = b1VarG0.a;
            m4Var.k0();
            m4Var.c().r();
            if (!b1VarG0.b) {
                m4Var.E.d.registerReceiver(b1VarG0, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                z0 z0Var4 = m4Var.e;
                T(z0Var4);
                b1VarG0.c = z0Var4.L();
                m4Var.a().G.b(Boolean.valueOf(b1VarG0.c), "Registering connectivity change receiver. Network connected");
                b1VarG0.b = true;
            }
            b4 b4Var7 = this.w;
            T(b4Var7);
            b4Var7.v();
            return;
        }
        jA = this.B.z.a();
        d0();
        jMax3 = Math.max(0L, ((Long) e0.G.a(null)).longValue());
        T(z0Var2);
        if (!z0Var2.b0(jA, jMax3)) {
            jMax2 = Math.max(jMax2, jA + jMax3);
        }
        g0().a();
        e().getClass();
        jCurrentTimeMillis = jMax2 - System.currentTimeMillis();
        if (jCurrentTimeMillis <= 0) {
            d0();
            jCurrentTimeMillis = Math.max(0L, ((Long) e0.K.a(null)).longValue());
            d1 d1Var2 = this.B.A;
            e().getClass();
            d1Var2.b(System.currentTimeMillis());
        }
        a().G.b(Long.valueOf(jCurrentTimeMillis), "Upload scheduled in approximately ms");
        b4Var = this.w;
        T(b4Var);
        b4Var.s();
        r1 r1Var2 = (r1) b4Var.d;
        r1Var2.getClass();
        v0Var = r1Var2.y;
        context = r1Var2.d;
        if (!r4.h0(context)) {
            r1.l(v0Var);
            v0Var.F.a("Receiver not registered/enabled");
        }
        if (!r4.K(context)) {
            r1.l(v0Var);
            v0Var.F.a("Service not registered/enabled");
        }
        b4Var.v();
        r1.l(v0Var);
        v0Var.G.b(Long.valueOf(jCurrentTimeMillis), "Scheduling upload, millis");
        r1Var2.D.getClass();
        SystemClock.elapsedRealtime();
        if (jCurrentTimeMillis < Math.max(0L, ((Long) e0.L.a(null)).longValue())) {
            b4Var.w().b(jCurrentTimeMillis);
        }
        ComponentName componentName2 = new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iY2 = b4Var.y();
        PersistableBundle persistableBundle2 = new PersistableBundle();
        persistableBundle2.putString("action", "com.google.android.gms.measurement.UPLOAD");
        jobInfoBuild = new JobInfo.Builder(iY2, componentName2).setMinimumLatency(jCurrentTimeMillis).setOverrideDeadline(jCurrentTimeMillis + jCurrentTimeMillis).setExtras(persistableBundle2).build();
        Method method4 = com.gamericefishpro.space.i9.f0.a;
        jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        jobScheduler.getClass();
        method = com.gamericefishpro.space.i9.f0.a;
        if (method != null) {
        }
        jobScheduler.schedule(jobInfoBuild);
    }

    public final void O() {
        c().r();
        if (this.M || this.N || this.O) {
            a().G.d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.M), Boolean.valueOf(this.N), Boolean.valueOf(this.O));
            return;
        }
        a().G.a("Stopping uploading service(s)");
        ArrayList arrayList = this.I;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Runnable) obj).run();
        }
        ArrayList arrayList2 = this.I;
        com.gamericefishpro.space.v8.c0.g(arrayList2);
        arrayList2.clear();
    }

    public final Boolean P(a1 a1Var) {
        try {
            long jP = a1Var.P();
            r1 r1Var = this.E;
            if (jP != -2147483648L) {
                if (a1Var.P() == com.gamericefishpro.space.b9.c.a(r1Var.d).e(0, a1Var.D()).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = com.gamericefishpro.space.b9.c.a(r1Var.d).e(0, a1Var.D()).versionName;
                String strN = a1Var.N();
                if (strN != null && strN.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final t4 Q(String str) {
        m mVar = this.i;
        T(mVar);
        a1 a1VarT0 = mVar.t0(str);
        if (a1VarT0 != null) {
            r1 r1Var = a1VarT0.a;
            if (!TextUtils.isEmpty(a1VarT0.N())) {
                Boolean boolP = P(a1VarT0);
                if (boolP != null && !boolP.booleanValue()) {
                    a().y.b(v0.z(str), "App version does not match; dropping. appId");
                    return null;
                }
                String strG = a1VarT0.G();
                String strN = a1VarT0.N();
                long jP = a1VarT0.P();
                p1 p1Var = r1Var.z;
                r1.l(p1Var);
                p1Var.r();
                String str2 = a1VarT0.l;
                p1 p1Var2 = r1Var.z;
                r1.l(p1Var2);
                p1Var2.r();
                long j = a1VarT0.m;
                p1 p1Var3 = r1Var.z;
                r1.l(p1Var3);
                p1Var3.r();
                long j2 = a1VarT0.n;
                p1 p1Var4 = r1Var.z;
                r1.l(p1Var4);
                p1Var4.r();
                boolean z = a1VarT0.o;
                String strJ = a1VarT0.J();
                p1 p1Var5 = r1Var.z;
                r1.l(p1Var5);
                p1Var5.r();
                boolean z2 = a1VarT0.p;
                Boolean boolW = a1VarT0.w();
                long jB = a1VarT0.b();
                p1 p1Var6 = r1Var.z;
                r1.l(p1Var6);
                p1Var6.r();
                ArrayList arrayList = a1VarT0.s;
                String strG2 = b(str).g();
                boolean zY = a1VarT0.y();
                p1 p1Var7 = r1Var.z;
                r1.l(p1Var7);
                p1Var7.r();
                long j3 = a1VarT0.v;
                int i = b(str).b;
                String str3 = n0(str).b;
                p1 p1Var8 = r1Var.z;
                r1.l(p1Var8);
                p1Var8.r();
                int i2 = a1VarT0.x;
                p1 p1Var9 = r1Var.z;
                r1.l(p1Var9);
                p1Var9.r();
                return new t4(str, strG, strN, jP, str2, j, j2, (String) null, z, false, strJ, 0L, 0, z2, false, boolW, jB, (List) arrayList, strG2, "", (String) null, zY, j3, i, str3, i2, a1VarT0.B, a1VarT0.C(), a1VarT0.s(), 0L, a1VarT0.t());
            }
        }
        a().F.b(str, "No app data available; dropping");
        return null;
    }

    public final boolean R(String str, String str2) {
        m mVar = this.i;
        T(mVar);
        r rVarP = mVar.P("events", str, str2);
        return rVarP == null || rVarP.c < 1;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:43:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:44:0x0100  */
    public final void V(o4 o4Var, t4 t4Var) {
        r rVarP;
        long jLongValue;
        c().r();
        k0();
        boolean zS = S(t4Var);
        String str = t4Var.d;
        if (zS) {
            if (!t4Var.A) {
                b0(t4Var);
                return;
            }
            r4 r4VarJ0 = j0();
            String str2 = o4Var.e;
            int iW0 = r4VarJ0.w0(str2);
            j4 j4Var = this.c0;
            if (iW0 != 0) {
                j0();
                d0();
                String strW = r4.w(str2, true, 24);
                int length = str2 != null ? str2.length() : 0;
                j0();
                r4.H(j4Var, t4Var.d, iW0, "_ev", strW, length);
                return;
            }
            int iE = j0().E(o4Var.b(), str2);
            if (iE != 0) {
                j0();
                d0();
                String strW2 = r4.w(str2, true, 24);
                Object objB = o4Var.b();
                int length2 = (objB == null || !((objB instanceof String) || (objB instanceof CharSequence))) ? 0 : objB.toString().length();
                j0();
                r4.H(j4Var, t4Var.d, iE, "_ev", strW2, length2);
                return;
            }
            Object objF = j0().F(o4Var.b(), str2);
            if (objF != null) {
                String str3 = "_sid";
                if ("_sid".equals(str2)) {
                    long j = o4Var.i;
                    String str4 = o4Var.y;
                    com.gamericefishpro.space.v8.c0.g(str);
                    m mVar = this.i;
                    T(mVar);
                    p4 p4VarL0 = mVar.l0(str, "_sno");
                    if (p4VarL0 != null) {
                        Object obj = p4VarL0.e;
                        if (obj instanceof Long) {
                            jLongValue = ((Long) obj).longValue();
                        } else {
                            if (p4VarL0 != null) {
                                a().B.b(p4VarL0.e, "Retrieved last session number from database does not contain a valid (long) value");
                            }
                            m mVar2 = this.i;
                            T(mVar2);
                            rVarP = mVar2.P("events", str, "_s");
                            if (rVarP != null) {
                                t0 t0Var = a().G;
                                long j2 = rVarP.c;
                                t0Var.b(Long.valueOf(j2), "Backfill the session number. Last used session number");
                                jLongValue = j2;
                            } else {
                                jLongValue = 0;
                            }
                        }
                    } else {
                        if (p4VarL0 != null) {
                            a().B.b(p4VarL0.e, "Retrieved last session number from database does not contain a valid (long) value");
                        }
                        m mVar3 = this.i;
                        T(mVar3);
                        rVarP = mVar3.P("events", str, "_s");
                        if (rVarP != null) {
                            t0 t0Var2 = a().G;
                            long j3 = rVarP.c;
                            t0Var2.b(Long.valueOf(j3), "Backfill the session number. Last used session number");
                            jLongValue = j3;
                        } else {
                            jLongValue = 0;
                        }
                    }
                    V(new o4(j, Long.valueOf(jLongValue + 1), "_sno", str4), t4Var);
                } else {
                    str3 = "_sid";
                }
                com.gamericefishpro.space.v8.c0.g(str);
                String str5 = o4Var.y;
                com.gamericefishpro.space.v8.c0.g(str5);
                p4 p4Var = new p4(str, str5, str2, o4Var.i, objF);
                t0 t0Var3 = a().G;
                r1 r1Var = this.E;
                p0 p0Var = r1Var.C;
                String str6 = p4Var.c;
                t0Var3.c("Setting user property", p0Var.c(str6), objF);
                m mVar4 = this.i;
                T(mVar4);
                mVar4.d0();
                try {
                    boolean zEquals = "_id".equals(str6);
                    Object obj2 = p4Var.e;
                    if (zEquals) {
                        m mVar5 = this.i;
                        T(mVar5);
                        p4 p4VarL1 = mVar5.l0(str, "_id");
                        if (p4VarL1 != null && !obj2.equals(p4VarL1.e)) {
                            m mVar6 = this.i;
                            T(mVar6);
                            mVar6.j0(str, "_lair");
                        }
                    }
                    b0(t4Var);
                    m mVar7 = this.i;
                    T(mVar7);
                    boolean zK0 = mVar7.k0(p4Var);
                    if (str3.equals(str2)) {
                        z0 z0Var = this.z;
                        T(z0Var);
                        String str7 = t4Var.N;
                        long jC0 = TextUtils.isEmpty(str7) ? 0L : z0Var.c0(str7.getBytes(Charset.forName("UTF-8")));
                        m mVar8 = this.i;
                        T(mVar8);
                        a1 a1VarT0 = mVar8.t0(str);
                        if (a1VarT0 != null) {
                            a1VarT0.A(jC0);
                            if (a1VarT0.o()) {
                                m mVar9 = this.i;
                                T(mVar9);
                                mVar9.u0(a1VarT0, false);
                            }
                        }
                    }
                    m mVar10 = this.i;
                    T(mVar10);
                    mVar10.e0();
                    if (!zK0) {
                        a().y.c("Too many unique user properties are set. Ignoring user property", r1Var.C.c(str6), obj2);
                        j0();
                        r4.H(j4Var, str, 9, null, null, 0);
                    }
                } finally {
                    m mVar11 = this.i;
                    T(mVar11);
                    mVar11.f0();
                }
            }
        }
    }

    public final void W(String str, t4 t4Var) {
        c().r();
        k0();
        boolean zS = S(t4Var);
        String str2 = t4Var.d;
        if (zS) {
            if (!t4Var.A) {
                b0(t4Var);
                return;
            }
            Boolean boolU = U(t4Var);
            if ("_npa".equals(str) && boolU != null) {
                a().F.a("Falling back to manifest metadata value for ad personalization");
                e().getClass();
                V(new o4(System.currentTimeMillis(), Long.valueOf(true != boolU.booleanValue() ? 0L : 1L), "_npa", "auto"), t4Var);
                return;
            }
            t0 t0Var = a().F;
            r1 r1Var = this.E;
            t0Var.b(r1Var.C.c(str), "Removing user property");
            m mVar = this.i;
            T(mVar);
            mVar.d0();
            try {
                b0(t4Var);
                if ("_id".equals(str)) {
                    m mVar2 = this.i;
                    T(mVar2);
                    com.gamericefishpro.space.v8.c0.g(str2);
                    mVar2.j0(str2, "_lair");
                }
                m mVar3 = this.i;
                T(mVar3);
                com.gamericefishpro.space.v8.c0.g(str2);
                mVar3.j0(str2, str);
                m mVar4 = this.i;
                T(mVar4);
                mVar4.e0();
                a().F.b(r1Var.C.c(str), "User property removed");
            } finally {
                m mVar5 = this.i;
                T(mVar5);
                mVar5.f0();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x028f A[Catch: all -> 0x01e1, TryCatch #1 {all -> 0x01e1, blocks: (B:62:0x0177, B:65:0x0185, B:100:0x0264, B:102:0x028f, B:103:0x0292, B:70:0x01ad, B:72:0x01d5, B:75:0x01e6, B:77:0x01ed, B:79:0x01f3, B:81:0x01fd, B:83:0x0203, B:85:0x0209, B:87:0x020f, B:88:0x0214, B:94:0x022d, B:96:0x0231, B:97:0x0242, B:98:0x024d, B:99:0x0258), top: B:172:0x0177, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x02b5 A[Catch: all -> 0x02ca, TRY_LEAVE, TryCatch #3 {all -> 0x02ca, blocks: (B:105:0x0297, B:107:0x02b5, B:150:0x037e, B:151:0x0381, B:153:0x038e, B:154:0x039e, B:165:0x0446, B:112:0x02cd, B:117:0x02ed, B:119:0x02f5, B:121:0x02fc, B:125:0x030f, B:129:0x0321, B:133:0x032d, B:136:0x0340, B:141:0x035f, B:143:0x0367, B:145:0x036f, B:147:0x0375, B:139:0x034d, B:127:0x031a, B:115:0x02db, B:155:0x03b7, B:157:0x03ec, B:158:0x03ef, B:160:0x03fc, B:161:0x040a, B:162:0x0422, B:164:0x042a), top: B:176:0x0138, inners: #0, #5 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x02ed A[Catch: all -> 0x02ca, TryCatch #3 {all -> 0x02ca, blocks: (B:105:0x0297, B:107:0x02b5, B:150:0x037e, B:151:0x0381, B:153:0x038e, B:154:0x039e, B:165:0x0446, B:112:0x02cd, B:117:0x02ed, B:119:0x02f5, B:121:0x02fc, B:125:0x030f, B:129:0x0321, B:133:0x032d, B:136:0x0340, B:141:0x035f, B:143:0x0367, B:145:0x036f, B:147:0x0375, B:139:0x034d, B:127:0x031a, B:115:0x02db, B:155:0x03b7, B:157:0x03ec, B:158:0x03ef, B:160:0x03fc, B:161:0x040a, B:162:0x0422, B:164:0x042a), top: B:176:0x0138, inners: #0, #5 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x02f5 A[Catch: all -> 0x02ca, TryCatch #3 {all -> 0x02ca, blocks: (B:105:0x0297, B:107:0x02b5, B:150:0x037e, B:151:0x0381, B:153:0x038e, B:154:0x039e, B:165:0x0446, B:112:0x02cd, B:117:0x02ed, B:119:0x02f5, B:121:0x02fc, B:125:0x030f, B:129:0x0321, B:133:0x032d, B:136:0x0340, B:141:0x035f, B:143:0x0367, B:145:0x036f, B:147:0x0375, B:139:0x034d, B:127:0x031a, B:115:0x02db, B:155:0x03b7, B:157:0x03ec, B:158:0x03ef, B:160:0x03fc, B:161:0x040a, B:162:0x0422, B:164:0x042a), top: B:176:0x0138, inners: #0, #5 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x02fc A[Catch: all -> 0x02ca, TryCatch #3 {all -> 0x02ca, blocks: (B:105:0x0297, B:107:0x02b5, B:150:0x037e, B:151:0x0381, B:153:0x038e, B:154:0x039e, B:165:0x0446, B:112:0x02cd, B:117:0x02ed, B:119:0x02f5, B:121:0x02fc, B:125:0x030f, B:129:0x0321, B:133:0x032d, B:136:0x0340, B:141:0x035f, B:143:0x0367, B:145:0x036f, B:147:0x0375, B:139:0x034d, B:127:0x031a, B:115:0x02db, B:155:0x03b7, B:157:0x03ec, B:158:0x03ef, B:160:0x03fc, B:161:0x040a, B:162:0x0422, B:164:0x042a), top: B:176:0x0138, inners: #0, #5 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0309  */
    /* JADX WARN: Code duplicated, block: B:125:0x030f A[Catch: all -> 0x02ca, TryCatch #3 {all -> 0x02ca, blocks: (B:105:0x0297, B:107:0x02b5, B:150:0x037e, B:151:0x0381, B:153:0x038e, B:154:0x039e, B:165:0x0446, B:112:0x02cd, B:117:0x02ed, B:119:0x02f5, B:121:0x02fc, B:125:0x030f, B:129:0x0321, B:133:0x032d, B:136:0x0340, B:141:0x035f, B:143:0x0367, B:145:0x036f, B:147:0x0375, B:139:0x034d, B:127:0x031a, B:115:0x02db, B:155:0x03b7, B:157:0x03ec, B:158:0x03ef, B:160:0x03fc, B:161:0x040a, B:162:0x0422, B:164:0x042a), top: B:176:0x0138, inners: #0, #5 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x031a A[Catch: all -> 0x02ca, TryCatch #3 {all -> 0x02ca, blocks: (B:105:0x0297, B:107:0x02b5, B:150:0x037e, B:151:0x0381, B:153:0x038e, B:154:0x039e, B:165:0x0446, B:112:0x02cd, B:117:0x02ed, B:119:0x02f5, B:121:0x02fc, B:125:0x030f, B:129:0x0321, B:133:0x032d, B:136:0x0340, B:141:0x035f, B:143:0x0367, B:145:0x036f, B:147:0x0375, B:139:0x034d, B:127:0x031a, B:115:0x02db, B:155:0x03b7, B:157:0x03ec, B:158:0x03ef, B:160:0x03fc, B:161:0x040a, B:162:0x0422, B:164:0x042a), top: B:176:0x0138, inners: #0, #5 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x0320  */
    /* JADX WARN: Code duplicated, block: B:131:0x0328  */
    /* JADX WARN: Code duplicated, block: B:132:0x032b  */
    /* JADX WARN: Code duplicated, block: B:135:0x033e  */
    /* JADX WARN: Code duplicated, block: B:141:0x035f A[Catch: all -> 0x02ca, TryCatch #3 {all -> 0x02ca, blocks: (B:105:0x0297, B:107:0x02b5, B:150:0x037e, B:151:0x0381, B:153:0x038e, B:154:0x039e, B:165:0x0446, B:112:0x02cd, B:117:0x02ed, B:119:0x02f5, B:121:0x02fc, B:125:0x030f, B:129:0x0321, B:133:0x032d, B:136:0x0340, B:141:0x035f, B:143:0x0367, B:145:0x036f, B:147:0x0375, B:139:0x034d, B:127:0x031a, B:115:0x02db, B:155:0x03b7, B:157:0x03ec, B:158:0x03ef, B:160:0x03fc, B:161:0x040a, B:162:0x0422, B:164:0x042a), top: B:176:0x0138, inners: #0, #5 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x0367 A[Catch: all -> 0x02ca, TryCatch #3 {all -> 0x02ca, blocks: (B:105:0x0297, B:107:0x02b5, B:150:0x037e, B:151:0x0381, B:153:0x038e, B:154:0x039e, B:165:0x0446, B:112:0x02cd, B:117:0x02ed, B:119:0x02f5, B:121:0x02fc, B:125:0x030f, B:129:0x0321, B:133:0x032d, B:136:0x0340, B:141:0x035f, B:143:0x0367, B:145:0x036f, B:147:0x0375, B:139:0x034d, B:127:0x031a, B:115:0x02db, B:155:0x03b7, B:157:0x03ec, B:158:0x03ef, B:160:0x03fc, B:161:0x040a, B:162:0x0422, B:164:0x042a), top: B:176:0x0138, inners: #0, #5 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x036d  */
    /* JADX WARN: Code duplicated, block: B:147:0x0375 A[Catch: all -> 0x02ca, TryCatch #3 {all -> 0x02ca, blocks: (B:105:0x0297, B:107:0x02b5, B:150:0x037e, B:151:0x0381, B:153:0x038e, B:154:0x039e, B:165:0x0446, B:112:0x02cd, B:117:0x02ed, B:119:0x02f5, B:121:0x02fc, B:125:0x030f, B:129:0x0321, B:133:0x032d, B:136:0x0340, B:141:0x035f, B:143:0x0367, B:145:0x036f, B:147:0x0375, B:139:0x034d, B:127:0x031a, B:115:0x02db, B:155:0x03b7, B:157:0x03ec, B:158:0x03ef, B:160:0x03fc, B:161:0x040a, B:162:0x0422, B:164:0x042a), top: B:176:0x0138, inners: #0, #5 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x037e A[Catch: all -> 0x02ca, TryCatch #3 {all -> 0x02ca, blocks: (B:105:0x0297, B:107:0x02b5, B:150:0x037e, B:151:0x0381, B:153:0x038e, B:154:0x039e, B:165:0x0446, B:112:0x02cd, B:117:0x02ed, B:119:0x02f5, B:121:0x02fc, B:125:0x030f, B:129:0x0321, B:133:0x032d, B:136:0x0340, B:141:0x035f, B:143:0x0367, B:145:0x036f, B:147:0x0375, B:139:0x034d, B:127:0x031a, B:115:0x02db, B:155:0x03b7, B:157:0x03ec, B:158:0x03ef, B:160:0x03fc, B:161:0x040a, B:162:0x0422, B:164:0x042a), top: B:176:0x0138, inners: #0, #5 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x038e A[Catch: all -> 0x02ca, TryCatch #3 {all -> 0x02ca, blocks: (B:105:0x0297, B:107:0x02b5, B:150:0x037e, B:151:0x0381, B:153:0x038e, B:154:0x039e, B:165:0x0446, B:112:0x02cd, B:117:0x02ed, B:119:0x02f5, B:121:0x02fc, B:125:0x030f, B:129:0x0321, B:133:0x032d, B:136:0x0340, B:141:0x035f, B:143:0x0367, B:145:0x036f, B:147:0x0375, B:139:0x034d, B:127:0x031a, B:115:0x02db, B:155:0x03b7, B:157:0x03ec, B:158:0x03ef, B:160:0x03fc, B:161:0x040a, B:162:0x0422, B:164:0x042a), top: B:176:0x0138, inners: #0, #5 }] */
    /* JADX WARN: Code duplicated, block: B:155:0x03b7 A[Catch: all -> 0x02ca, TryCatch #3 {all -> 0x02ca, blocks: (B:105:0x0297, B:107:0x02b5, B:150:0x037e, B:151:0x0381, B:153:0x038e, B:154:0x039e, B:165:0x0446, B:112:0x02cd, B:117:0x02ed, B:119:0x02f5, B:121:0x02fc, B:125:0x030f, B:129:0x0321, B:133:0x032d, B:136:0x0340, B:141:0x035f, B:143:0x0367, B:145:0x036f, B:147:0x0375, B:139:0x034d, B:127:0x031a, B:115:0x02db, B:155:0x03b7, B:157:0x03ec, B:158:0x03ef, B:160:0x03fc, B:161:0x040a, B:162:0x0422, B:164:0x042a), top: B:176:0x0138, inners: #0, #5 }] */
    /* JADX WARN: Code duplicated, block: B:157:0x03ec A[Catch: all -> 0x02ca, TryCatch #3 {all -> 0x02ca, blocks: (B:105:0x0297, B:107:0x02b5, B:150:0x037e, B:151:0x0381, B:153:0x038e, B:154:0x039e, B:165:0x0446, B:112:0x02cd, B:117:0x02ed, B:119:0x02f5, B:121:0x02fc, B:125:0x030f, B:129:0x0321, B:133:0x032d, B:136:0x0340, B:141:0x035f, B:143:0x0367, B:145:0x036f, B:147:0x0375, B:139:0x034d, B:127:0x031a, B:115:0x02db, B:155:0x03b7, B:157:0x03ec, B:158:0x03ef, B:160:0x03fc, B:161:0x040a, B:162:0x0422, B:164:0x042a), top: B:176:0x0138, inners: #0, #5 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x03fc A[Catch: all -> 0x02ca, TryCatch #3 {all -> 0x02ca, blocks: (B:105:0x0297, B:107:0x02b5, B:150:0x037e, B:151:0x0381, B:153:0x038e, B:154:0x039e, B:165:0x0446, B:112:0x02cd, B:117:0x02ed, B:119:0x02f5, B:121:0x02fc, B:125:0x030f, B:129:0x0321, B:133:0x032d, B:136:0x0340, B:141:0x035f, B:143:0x0367, B:145:0x036f, B:147:0x0375, B:139:0x034d, B:127:0x031a, B:115:0x02db, B:155:0x03b7, B:157:0x03ec, B:158:0x03ef, B:160:0x03fc, B:161:0x040a, B:162:0x0422, B:164:0x042a), top: B:176:0x0138, inners: #0, #5 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x0422 A[Catch: all -> 0x02ca, TryCatch #3 {all -> 0x02ca, blocks: (B:105:0x0297, B:107:0x02b5, B:150:0x037e, B:151:0x0381, B:153:0x038e, B:154:0x039e, B:165:0x0446, B:112:0x02cd, B:117:0x02ed, B:119:0x02f5, B:121:0x02fc, B:125:0x030f, B:129:0x0321, B:133:0x032d, B:136:0x0340, B:141:0x035f, B:143:0x0367, B:145:0x036f, B:147:0x0375, B:139:0x034d, B:127:0x031a, B:115:0x02db, B:155:0x03b7, B:157:0x03ec, B:158:0x03ef, B:160:0x03fc, B:161:0x040a, B:162:0x0422, B:164:0x042a), top: B:176:0x0138, inners: #0, #5 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x042a A[Catch: all -> 0x02ca, TryCatch #3 {all -> 0x02ca, blocks: (B:105:0x0297, B:107:0x02b5, B:150:0x037e, B:151:0x0381, B:153:0x038e, B:154:0x039e, B:165:0x0446, B:112:0x02cd, B:117:0x02ed, B:119:0x02f5, B:121:0x02fc, B:125:0x030f, B:129:0x0321, B:133:0x032d, B:136:0x0340, B:141:0x035f, B:143:0x0367, B:145:0x036f, B:147:0x0375, B:139:0x034d, B:127:0x031a, B:115:0x02db, B:155:0x03b7, B:157:0x03ec, B:158:0x03ef, B:160:0x03fc, B:161:0x040a, B:162:0x0422, B:164:0x042a), top: B:176:0x0138, inners: #0, #5 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x02cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x0177 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x010d A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cc, B:38:0x00dc, B:40:0x00eb, B:46:0x0100, B:48:0x010d, B:50:0x0118, B:53:0x011f, B:56:0x013a, B:59:0x0153, B:67:0x019b, B:54:0x012c, B:49:0x0114, B:42:0x00f5, B:45:0x00fd), top: B:174:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0114 A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cc, B:38:0x00dc, B:40:0x00eb, B:46:0x0100, B:48:0x010d, B:50:0x0118, B:53:0x011f, B:56:0x013a, B:59:0x0153, B:67:0x019b, B:54:0x012c, B:49:0x0114, B:42:0x00f5, B:45:0x00fd), top: B:174:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x011f A[Catch: all -> 0x00c4, TRY_ENTER, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cc, B:38:0x00dc, B:40:0x00eb, B:46:0x0100, B:48:0x010d, B:50:0x0118, B:53:0x011f, B:56:0x013a, B:59:0x0153, B:67:0x019b, B:54:0x012c, B:49:0x0114, B:42:0x00f5, B:45:0x00fd), top: B:174:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x012c A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cc, B:38:0x00dc, B:40:0x00eb, B:46:0x0100, B:48:0x010d, B:50:0x0118, B:53:0x011f, B:56:0x013a, B:59:0x0153, B:67:0x019b, B:54:0x012c, B:49:0x0114, B:42:0x00f5, B:45:0x00fd), top: B:174:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x013a A[Catch: all -> 0x00c4, TRY_LEAVE, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cc, B:38:0x00dc, B:40:0x00eb, B:46:0x0100, B:48:0x010d, B:50:0x0118, B:53:0x011f, B:56:0x013a, B:59:0x0153, B:67:0x019b, B:54:0x012c, B:49:0x0114, B:42:0x00f5, B:45:0x00fd), top: B:174:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0153 A[Catch: all -> 0x00c4, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cc, B:38:0x00dc, B:40:0x00eb, B:46:0x0100, B:48:0x010d, B:50:0x0118, B:53:0x011f, B:56:0x013a, B:59:0x0153, B:67:0x019b, B:54:0x012c, B:49:0x0114, B:42:0x00f5, B:45:0x00fd), top: B:174:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x017d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0185 A[Catch: all -> 0x01e1, TRY_LEAVE, TryCatch #1 {all -> 0x01e1, blocks: (B:62:0x0177, B:65:0x0185, B:100:0x0264, B:102:0x028f, B:103:0x0292, B:70:0x01ad, B:72:0x01d5, B:75:0x01e6, B:77:0x01ed, B:79:0x01f3, B:81:0x01fd, B:83:0x0203, B:85:0x0209, B:87:0x020f, B:88:0x0214, B:94:0x022d, B:96:0x0231, B:97:0x0242, B:98:0x024d, B:99:0x0258), top: B:172:0x0177, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x019b A[Catch: all -> 0x00c4, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cc, B:38:0x00dc, B:40:0x00eb, B:46:0x0100, B:48:0x010d, B:50:0x0118, B:53:0x011f, B:56:0x013a, B:59:0x0153, B:67:0x019b, B:54:0x012c, B:49:0x0114, B:42:0x00f5, B:45:0x00fd), top: B:174:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d5 A[Catch: all -> 0x01e1, TryCatch #1 {all -> 0x01e1, blocks: (B:62:0x0177, B:65:0x0185, B:100:0x0264, B:102:0x028f, B:103:0x0292, B:70:0x01ad, B:72:0x01d5, B:75:0x01e6, B:77:0x01ed, B:79:0x01f3, B:81:0x01fd, B:83:0x0203, B:85:0x0209, B:87:0x020f, B:88:0x0214, B:94:0x022d, B:96:0x0231, B:97:0x0242, B:98:0x024d, B:99:0x0258), top: B:172:0x0177, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01e6 A[Catch: all -> 0x01e1, TryCatch #1 {all -> 0x01e1, blocks: (B:62:0x0177, B:65:0x0185, B:100:0x0264, B:102:0x028f, B:103:0x0292, B:70:0x01ad, B:72:0x01d5, B:75:0x01e6, B:77:0x01ed, B:79:0x01f3, B:81:0x01fd, B:83:0x0203, B:85:0x0209, B:87:0x020f, B:88:0x0214, B:94:0x022d, B:96:0x0231, B:97:0x0242, B:98:0x024d, B:99:0x0258), top: B:172:0x0177, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x024d A[Catch: all -> 0x01e1, TryCatch #1 {all -> 0x01e1, blocks: (B:62:0x0177, B:65:0x0185, B:100:0x0264, B:102:0x028f, B:103:0x0292, B:70:0x01ad, B:72:0x01d5, B:75:0x01e6, B:77:0x01ed, B:79:0x01f3, B:81:0x01fd, B:83:0x0203, B:85:0x0209, B:87:0x020f, B:88:0x0214, B:94:0x022d, B:96:0x0231, B:97:0x0242, B:98:0x024d, B:99:0x0258), top: B:172:0x0177, inners: #4 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.gamericefishpro.space.n9.t4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [com.gamericefishpro.space.n9.m4] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.gamericefishpro.space.n9.m4] */
    public final void X(t4 t4Var) throws Throwable {
        long j;
        long j2;
        r rVarP;
        boolean z;
        long j3;
        m4 m4Var;
        long j4;
        m4 m4Var2;
        Bundle bundle;
        long j5;
        h1 h1Var;
        r1 r1Var;
        String str;
        Context context;
        v0 v0Var;
        r1 r1Var2;
        Intent intent;
        String str2;
        PackageManager packageManager;
        List<ResolveInfo> listQueryIntentServices;
        Bundle bundle2;
        long j6;
        String str3;
        long jF;
        r1 r1Var3;
        PackageInfo packageInfoE;
        t4 t4Var2;
        ApplicationInfo applicationInfoD;
        long j7;
        long j8;
        boolean z2;
        long j9;
        m4 m4Var3 = t4Var;
        r1 r1Var4 = this.E;
        c().r();
        k0();
        com.gamericefishpro.space.v8.c0.g(m4Var3);
        boolean z3 = m4Var3.H;
        String str4 = m4Var3.d;
        com.gamericefishpro.space.v8.c0.d(str4);
        if (!S(m4Var3)) {
            return;
        }
        m mVar = this.i;
        T(mVar);
        a1 a1VarT0 = mVar.t0(str4);
        if (a1VarT0 != null && TextUtils.isEmpty(a1VarT0.G()) && !TextUtils.isEmpty(m4Var3.e)) {
            a1VarT0.f(0L);
            m mVar2 = this.i;
            T(mVar2);
            mVar2.u0(a1VarT0, false);
            l1 l1Var = this.d;
            T(l1Var);
            l1Var.r();
            l1Var.A.remove(str4);
        }
        if (!m4Var3.A) {
            b0(t4Var);
            return;
        }
        long jCurrentTimeMillis = m4Var3.E;
        if (jCurrentTimeMillis == 0) {
            e().getClass();
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        long j10 = jCurrentTimeMillis;
        int i = m4Var3.F;
        if (i != 0 && i != 1) {
            a().B.c("Incorrect app type, assuming installed app. appId, appType", v0.z(str4), Integer.valueOf(i));
            i = 0;
        }
        m mVar3 = this.i;
        T(mVar3);
        mVar3.d0();
        try {
            m mVar4 = this.i;
            T(mVar4);
            p4 p4VarL0 = mVar4.l0(str4, "_npa");
            Boolean boolU = U(m4Var3);
            try {
                if (p4VarL0 != null) {
                    j = 1;
                    if (!"auto".equals(p4VarL0.b)) {
                        j2 = j10;
                    }
                    if (d0().B(null, e0.b1)) {
                        a0(m4Var3, m4Var3.W);
                    } else {
                        a0(m4Var3, j2);
                    }
                    b0(t4Var);
                    if (i == 0) {
                        m mVar5 = this.i;
                        T(mVar5);
                        rVarP = mVar5.P("events", str4, "_f");
                        z = false;
                    } else {
                        m mVar6 = this.i;
                        T(mVar6);
                        rVarP = mVar6.P("events", str4, "_v");
                        z = true;
                    }
                    if (rVarP == null) {
                        j4 = ((j2 / 3600000) + j) * 3600000;
                        if (z) {
                            m4Var2 = this;
                            Long lValueOf = Long.valueOf(j4);
                            long j11 = j2;
                            m4Var2.V(new o4(j11, lValueOf, "_fvt", "auto"), m4Var3);
                            m4Var2.c().r();
                            m4Var2.k0();
                            bundle = new Bundle();
                            bundle.putLong("_c", 1L);
                            bundle.putLong("_r", 1L);
                            bundle.putLong("_et", 1L);
                            if (z3) {
                                bundle.putLong("_dac", 1L);
                            }
                            if (m4Var2.d0().B(null, e0.j1)) {
                                m4Var2.e().getClass();
                                bundle.putLong("_elt", System.currentTimeMillis());
                            }
                            m4Var2.i(new u("_v", new t(bundle), "auto", j11), m4Var3);
                            m4Var3 = m4Var2;
                        } else {
                            Long lValueOf2 = Long.valueOf(j4);
                            j5 = j2;
                            V(new o4(j5, lValueOf2, "_fot", "auto"), m4Var3);
                            c().r();
                            h1Var = this.D;
                            com.gamericefishpro.space.v8.c0.g(h1Var);
                            r1Var = h1Var.e;
                            if (str4 != null) {
                                try {
                                    if (str4.isEmpty()) {
                                        r1Var2 = r1Var4;
                                        str = "_elt";
                                        str2 = str4;
                                        v0 v0Var2 = r1Var.y;
                                        r1.l(v0Var2);
                                        v0Var2.C.a("Install Referrer Reporter was called with invalid app package name");
                                    } else {
                                        str = "_elt";
                                        p1 p1Var = r1Var.z;
                                        context = r1Var.d;
                                        v0Var = r1Var.y;
                                        r1.l(p1Var);
                                        p1Var.r();
                                        if (h1Var.b()) {
                                            r1Var2 = r1Var4;
                                            g1 g1Var = new g1(h1Var, str4);
                                            p1 p1Var2 = r1Var.z;
                                            r1.l(p1Var2);
                                            p1Var2.r();
                                            str2 = str4;
                                            intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                            intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                            packageManager = context.getPackageManager();
                                            if (packageManager == null) {
                                                r1.l(v0Var);
                                                v0Var.C.a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                            } else {
                                                listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
                                                if (listQueryIntentServices != null || listQueryIntentServices.isEmpty()) {
                                                    r1.l(v0Var);
                                                    v0Var.E.a("Play Service for fetching Install Referrer is unavailable on device");
                                                } else {
                                                    ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                                                    if (serviceInfo != null) {
                                                        String str5 = serviceInfo.packageName;
                                                        if (serviceInfo.name != null && "com.android.vending".equals(str5) && h1Var.b()) {
                                                            try {
                                                                boolean zA = com.gamericefishpro.space.y8.a.b().a(context, new Intent(intent), g1Var, 1);
                                                                r1.l(v0Var);
                                                                v0Var.G.b(zA ? "available" : "not available", "Install Referrer Service is");
                                                            } catch (RuntimeException e) {
                                                                v0 v0Var3 = r1Var.y;
                                                                r1.l(v0Var3);
                                                                v0Var3.y.b(e.getMessage(), "Exception occurred while binding to Install Referrer Service");
                                                            }
                                                        } else {
                                                            r1.l(v0Var);
                                                            v0Var.B.a("Play Store version 8.3.73 or higher required for Install Referrer");
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            r1.l(v0Var);
                                            v0Var.E.a("Install Referrer Reporter is not available");
                                            r1Var2 = r1Var4;
                                            str2 = str4;
                                        }
                                    }
                                    c().r();
                                    k0();
                                    bundle2 = new Bundle();
                                    j6 = j;
                                    bundle2.putLong("_c", j6);
                                    bundle2.putLong("_r", j6);
                                    bundle2.putLong("_uwa", 0L);
                                    bundle2.putLong("_pfo", 0L);
                                    bundle2.putLong("_sys", 0L);
                                    bundle2.putLong("_sysu", 0L);
                                    bundle2.putLong("_et", j6);
                                    if (z3) {
                                        bundle2.putLong("_dac", j6);
                                    }
                                    com.gamericefishpro.space.v8.c0.g(str2);
                                    m4Var3 = this;
                                    m mVar7 = m4Var3.i;
                                    T(mVar7);
                                    com.gamericefishpro.space.v8.c0.d(str2);
                                    mVar7.r();
                                    mVar7.s();
                                    str3 = str2;
                                    jF = mVar7.F(str3);
                                    r1Var3 = r1Var2;
                                    if (r1Var3.d.getPackageManager() == null) {
                                        m4Var3.a().y.b(v0.z(str3), "PackageManager is null, first open report might be inaccurate. appId");
                                        t4Var2 = t4Var;
                                    } else {
                                        try {
                                            packageInfoE = com.gamericefishpro.space.b9.c.a(r1Var3.d).e(0, str3);
                                        } catch (PackageManager.NameNotFoundException e2) {
                                            m4Var3.a().y.c("Package info is null, first open report might be inaccurate. appId", v0.z(str3), e2);
                                            packageInfoE = null;
                                        }
                                        if (packageInfoE != null) {
                                            j8 = packageInfoE.firstInstallTime;
                                            if (j8 != 0) {
                                                if (j8 != packageInfoE.lastUpdateTime) {
                                                    if (m4Var3.d0().B(null, e0.I0)) {
                                                        bundle2.putLong("_uwa", 1L);
                                                    } else if (jF == 0) {
                                                        bundle2.putLong("_uwa", 1L);
                                                        z2 = false;
                                                        jF = 0;
                                                    }
                                                    z2 = false;
                                                } else {
                                                    z2 = true;
                                                }
                                                if (true != z2) {
                                                    j9 = 0;
                                                } else {
                                                    j9 = 1;
                                                }
                                                o4 o4Var = new o4(j5, Long.valueOf(j9), "_fi", "auto");
                                                t4Var2 = t4Var;
                                                m4Var3.V(o4Var, t4Var2);
                                            } else {
                                                t4Var2 = t4Var;
                                            }
                                        } else {
                                            t4Var2 = t4Var;
                                        }
                                        try {
                                            applicationInfoD = com.gamericefishpro.space.b9.c.a(r1Var3.d).d(0, str3);
                                        } catch (PackageManager.NameNotFoundException e3) {
                                            m4Var3.a().y.c("Application info is null, first open report might be inaccurate. appId", v0.z(str3), e3);
                                            applicationInfoD = null;
                                        }
                                        if (applicationInfoD != null) {
                                            if ((applicationInfoD.flags & 1) != 0) {
                                                j7 = 1;
                                                bundle2.putLong("_sys", 1L);
                                            } else {
                                                j7 = 1;
                                            }
                                            if ((applicationInfoD.flags & 128) != 0) {
                                                bundle2.putLong("_sysu", j7);
                                            }
                                        }
                                    }
                                    if (jF >= 0) {
                                        bundle2.putLong("_pfo", jF);
                                    }
                                    if (m4Var3.d0().B(null, e0.j1)) {
                                        m4Var3.e().getClass();
                                        bundle2.putLong(str, System.currentTimeMillis());
                                    }
                                    m4Var3.i(new u("_f", new t(bundle2), "auto", j5), t4Var2);
                                    m4Var3 = m4Var3;
                                } catch (Throwable th) {
                                    th = th;
                                    m4Var3 = this;
                                    m mVar8 = m4Var3.i;
                                    T(mVar8);
                                    mVar8.f0();
                                    throw th;
                                }
                            } else {
                                r1Var2 = r1Var4;
                                str = "_elt";
                                str2 = str4;
                                v0 v0Var4 = r1Var.y;
                                r1.l(v0Var4);
                                v0Var4.C.a("Install Referrer Reporter was called with invalid app package name");
                                c().r();
                                k0();
                                bundle2 = new Bundle();
                                j6 = j;
                                bundle2.putLong("_c", j6);
                                bundle2.putLong("_r", j6);
                                bundle2.putLong("_uwa", 0L);
                                bundle2.putLong("_pfo", 0L);
                                bundle2.putLong("_sys", 0L);
                                bundle2.putLong("_sysu", 0L);
                                bundle2.putLong("_et", j6);
                                if (z3) {
                                    bundle2.putLong("_dac", j6);
                                }
                                com.gamericefishpro.space.v8.c0.g(str2);
                                m4Var3 = this;
                                m mVar9 = m4Var3.i;
                                T(mVar9);
                                com.gamericefishpro.space.v8.c0.d(str2);
                                mVar9.r();
                                mVar9.s();
                                str3 = str2;
                                jF = mVar9.F(str3);
                                r1Var3 = r1Var2;
                                if (r1Var3.d.getPackageManager() == null) {
                                    m4Var3.a().y.b(v0.z(str3), "PackageManager is null, first open report might be inaccurate. appId");
                                    t4Var2 = t4Var;
                                } else {
                                    packageInfoE = com.gamericefishpro.space.b9.c.a(r1Var3.d).e(0, str3);
                                    if (packageInfoE != null) {
                                        j8 = packageInfoE.firstInstallTime;
                                        if (j8 != 0) {
                                            if (j8 != packageInfoE.lastUpdateTime) {
                                                if (m4Var3.d0().B(null, e0.I0)) {
                                                    bundle2.putLong("_uwa", 1L);
                                                } else if (jF == 0) {
                                                    bundle2.putLong("_uwa", 1L);
                                                    z2 = false;
                                                    jF = 0;
                                                }
                                                z2 = false;
                                            } else {
                                                z2 = true;
                                            }
                                            if (true != z2) {
                                                j9 = 0;
                                            } else {
                                                j9 = 1;
                                            }
                                            o4 o4Var2 = new o4(j5, Long.valueOf(j9), "_fi", "auto");
                                            t4Var2 = t4Var;
                                            m4Var3.V(o4Var2, t4Var2);
                                        } else {
                                            t4Var2 = t4Var;
                                        }
                                    } else {
                                        t4Var2 = t4Var;
                                    }
                                    applicationInfoD = com.gamericefishpro.space.b9.c.a(r1Var3.d).d(0, str3);
                                    if (applicationInfoD != null) {
                                        if ((applicationInfoD.flags & 1) != 0) {
                                            j7 = 1;
                                            bundle2.putLong("_sys", 1L);
                                        } else {
                                            j7 = 1;
                                        }
                                        if ((applicationInfoD.flags & 128) != 0) {
                                            bundle2.putLong("_sysu", j7);
                                        }
                                    }
                                }
                                if (jF >= 0) {
                                    bundle2.putLong("_pfo", jF);
                                }
                                if (m4Var3.d0().B(null, e0.j1)) {
                                    m4Var3.e().getClass();
                                    bundle2.putLong(str, System.currentTimeMillis());
                                }
                                m4Var3.i(new u("_f", new t(bundle2), "auto", j5), t4Var2);
                                m4Var3 = m4Var3;
                            }
                        }
                    } else {
                        j3 = j2;
                        m4Var = this;
                        if (m4Var3.B) {
                            m4Var3 = m4Var;
                            m4Var.i(new u("_cd", new t(new Bundle()), "auto", j3), m4Var3);
                            m4Var3 = m4Var;
                        }
                    }
                    m4Var3 = m4Var;
                    m mVar10 = m4Var3.i;
                    T(mVar10);
                    mVar10.e0();
                    m mVar11 = m4Var3.i;
                    T(mVar11);
                    mVar11.f0();
                    return;
                }
                j = 1;
                if (rVarP == null) {
                    j4 = ((j2 / 3600000) + j) * 3600000;
                    if (z) {
                        Long lValueOf3 = Long.valueOf(j4);
                        j5 = j2;
                        V(new o4(j5, lValueOf3, "_fot", "auto"), m4Var3);
                        c().r();
                        h1Var = this.D;
                        com.gamericefishpro.space.v8.c0.g(h1Var);
                        r1Var = h1Var.e;
                        if (str4 != null) {
                            if (str4.isEmpty()) {
                                r1Var2 = r1Var4;
                                str = "_elt";
                                str2 = str4;
                                v0 v0Var5 = r1Var.y;
                                r1.l(v0Var5);
                                v0Var5.C.a("Install Referrer Reporter was called with invalid app package name");
                            } else {
                                str = "_elt";
                                p1 p1Var3 = r1Var.z;
                                context = r1Var.d;
                                v0Var = r1Var.y;
                                r1.l(p1Var3);
                                p1Var3.r();
                                if (h1Var.b()) {
                                    r1.l(v0Var);
                                    v0Var.E.a("Install Referrer Reporter is not available");
                                    r1Var2 = r1Var4;
                                    str2 = str4;
                                } else {
                                    r1Var2 = r1Var4;
                                    g1 g1Var2 = new g1(h1Var, str4);
                                    p1 p1Var4 = r1Var.z;
                                    r1.l(p1Var4);
                                    p1Var4.r();
                                    str2 = str4;
                                    intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                    intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                    packageManager = context.getPackageManager();
                                    if (packageManager == null) {
                                        r1.l(v0Var);
                                        v0Var.C.a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                    } else {
                                        listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
                                        if (listQueryIntentServices != null) {
                                            r1.l(v0Var);
                                            v0Var.E.a("Play Service for fetching Install Referrer is unavailable on device");
                                        } else {
                                            r1.l(v0Var);
                                            v0Var.E.a("Play Service for fetching Install Referrer is unavailable on device");
                                        }
                                    }
                                }
                            }
                            c().r();
                            k0();
                            bundle2 = new Bundle();
                            j6 = j;
                            bundle2.putLong("_c", j6);
                            bundle2.putLong("_r", j6);
                            bundle2.putLong("_uwa", 0L);
                            bundle2.putLong("_pfo", 0L);
                            bundle2.putLong("_sys", 0L);
                            bundle2.putLong("_sysu", 0L);
                            bundle2.putLong("_et", j6);
                            if (z3) {
                                bundle2.putLong("_dac", j6);
                            }
                            com.gamericefishpro.space.v8.c0.g(str2);
                            m4Var3 = this;
                            m mVar12 = m4Var3.i;
                            T(mVar12);
                            com.gamericefishpro.space.v8.c0.d(str2);
                            mVar12.r();
                            mVar12.s();
                            str3 = str2;
                            jF = mVar12.F(str3);
                            r1Var3 = r1Var2;
                            if (r1Var3.d.getPackageManager() == null) {
                                m4Var3.a().y.b(v0.z(str3), "PackageManager is null, first open report might be inaccurate. appId");
                                t4Var2 = t4Var;
                            } else {
                                packageInfoE = com.gamericefishpro.space.b9.c.a(r1Var3.d).e(0, str3);
                                if (packageInfoE != null) {
                                    j8 = packageInfoE.firstInstallTime;
                                    if (j8 != 0) {
                                        if (j8 != packageInfoE.lastUpdateTime) {
                                            if (m4Var3.d0().B(null, e0.I0)) {
                                                bundle2.putLong("_uwa", 1L);
                                            } else if (jF == 0) {
                                                bundle2.putLong("_uwa", 1L);
                                                z2 = false;
                                                jF = 0;
                                            }
                                            z2 = false;
                                        } else {
                                            z2 = true;
                                        }
                                        if (true != z2) {
                                            j9 = 0;
                                        } else {
                                            j9 = 1;
                                        }
                                        o4 o4Var3 = new o4(j5, Long.valueOf(j9), "_fi", "auto");
                                        t4Var2 = t4Var;
                                        m4Var3.V(o4Var3, t4Var2);
                                    } else {
                                        t4Var2 = t4Var;
                                    }
                                } else {
                                    t4Var2 = t4Var;
                                }
                                applicationInfoD = com.gamericefishpro.space.b9.c.a(r1Var3.d).d(0, str3);
                                if (applicationInfoD != null) {
                                    if ((applicationInfoD.flags & 1) != 0) {
                                        j7 = 1;
                                        bundle2.putLong("_sys", 1L);
                                    } else {
                                        j7 = 1;
                                    }
                                    if ((applicationInfoD.flags & 128) != 0) {
                                        bundle2.putLong("_sysu", j7);
                                    }
                                }
                            }
                            if (jF >= 0) {
                                bundle2.putLong("_pfo", jF);
                            }
                            if (m4Var3.d0().B(null, e0.j1)) {
                                m4Var3.e().getClass();
                                bundle2.putLong(str, System.currentTimeMillis());
                            }
                            m4Var3.i(new u("_f", new t(bundle2), "auto", j5), t4Var2);
                            m4Var3 = m4Var3;
                        } else {
                            r1Var2 = r1Var4;
                            str = "_elt";
                            str2 = str4;
                            v0 v0Var6 = r1Var.y;
                            r1.l(v0Var6);
                            v0Var6.C.a("Install Referrer Reporter was called with invalid app package name");
                            c().r();
                            k0();
                            bundle2 = new Bundle();
                            j6 = j;
                            bundle2.putLong("_c", j6);
                            bundle2.putLong("_r", j6);
                            bundle2.putLong("_uwa", 0L);
                            bundle2.putLong("_pfo", 0L);
                            bundle2.putLong("_sys", 0L);
                            bundle2.putLong("_sysu", 0L);
                            bundle2.putLong("_et", j6);
                            if (z3) {
                                bundle2.putLong("_dac", j6);
                            }
                            com.gamericefishpro.space.v8.c0.g(str2);
                            m4Var3 = this;
                            m mVar13 = m4Var3.i;
                            T(mVar13);
                            com.gamericefishpro.space.v8.c0.d(str2);
                            mVar13.r();
                            mVar13.s();
                            str3 = str2;
                            jF = mVar13.F(str3);
                            r1Var3 = r1Var2;
                            if (r1Var3.d.getPackageManager() == null) {
                                m4Var3.a().y.b(v0.z(str3), "PackageManager is null, first open report might be inaccurate. appId");
                                t4Var2 = t4Var;
                            } else {
                                packageInfoE = com.gamericefishpro.space.b9.c.a(r1Var3.d).e(0, str3);
                                if (packageInfoE != null) {
                                    j8 = packageInfoE.firstInstallTime;
                                    if (j8 != 0) {
                                        if (j8 != packageInfoE.lastUpdateTime) {
                                            if (m4Var3.d0().B(null, e0.I0)) {
                                                bundle2.putLong("_uwa", 1L);
                                            } else if (jF == 0) {
                                                bundle2.putLong("_uwa", 1L);
                                                z2 = false;
                                                jF = 0;
                                            }
                                            z2 = false;
                                        } else {
                                            z2 = true;
                                        }
                                        if (true != z2) {
                                            j9 = 0;
                                        } else {
                                            j9 = 1;
                                        }
                                        o4 o4Var4 = new o4(j5, Long.valueOf(j9), "_fi", "auto");
                                        t4Var2 = t4Var;
                                        m4Var3.V(o4Var4, t4Var2);
                                    } else {
                                        t4Var2 = t4Var;
                                    }
                                } else {
                                    t4Var2 = t4Var;
                                }
                                applicationInfoD = com.gamericefishpro.space.b9.c.a(r1Var3.d).d(0, str3);
                                if (applicationInfoD != null) {
                                    if ((applicationInfoD.flags & 1) != 0) {
                                        j7 = 1;
                                        bundle2.putLong("_sys", 1L);
                                    } else {
                                        j7 = 1;
                                    }
                                    if ((applicationInfoD.flags & 128) != 0) {
                                        bundle2.putLong("_sysu", j7);
                                    }
                                }
                            }
                            if (jF >= 0) {
                                bundle2.putLong("_pfo", jF);
                            }
                            if (m4Var3.d0().B(null, e0.j1)) {
                                m4Var3.e().getClass();
                                bundle2.putLong(str, System.currentTimeMillis());
                            }
                            m4Var3.i(new u("_f", new t(bundle2), "auto", j5), t4Var2);
                            m4Var3 = m4Var3;
                        }
                    } else {
                        m4Var2 = this;
                        Long lValueOf4 = Long.valueOf(j4);
                        long j12 = j2;
                        m4Var2.V(new o4(j12, lValueOf4, "_fvt", "auto"), m4Var3);
                        m4Var2.c().r();
                        m4Var2.k0();
                        bundle = new Bundle();
                        bundle.putLong("_c", 1L);
                        bundle.putLong("_r", 1L);
                        bundle.putLong("_et", 1L);
                        if (z3) {
                            bundle.putLong("_dac", 1L);
                        }
                        if (m4Var2.d0().B(null, e0.j1)) {
                            m4Var2.e().getClass();
                            bundle.putLong("_elt", System.currentTimeMillis());
                        }
                        m4Var2.i(new u("_v", new t(bundle), "auto", j12), m4Var3);
                        m4Var3 = m4Var2;
                    }
                } else {
                    j3 = j2;
                    m4Var = this;
                    if (m4Var3.B) {
                        m4Var3 = m4Var;
                        m4Var.i(new u("_cd", new t(new Bundle()), "auto", j3), m4Var3);
                        m4Var3 = m4Var;
                    }
                }
                m4Var3 = m4Var;
                m mVar14 = m4Var3.i;
                T(mVar14);
                mVar14.e0();
                m mVar15 = m4Var3.i;
                T(mVar15);
                mVar15.f0();
                return;
            } catch (Throwable th2) {
                th = th2;
                m mVar16 = m4Var3.i;
                T(mVar16);
                mVar16.f0();
                throw th;
            }
            if (boolU != null) {
                o4 o4Var5 = new o4(j10, Long.valueOf(true != boolU.booleanValue() ? 0L : j), "_npa", "auto");
                j2 = j10;
                if (p4VarL0 == null || !p4VarL0.e.equals(o4Var5.v)) {
                    V(o4Var5, m4Var3);
                }
            } else {
                j2 = j10;
                if (p4VarL0 != null) {
                    W("_npa", m4Var3);
                }
            }
            if (d0().B(null, e0.b1)) {
                a0(m4Var3, m4Var3.W);
            } else {
                a0(m4Var3, j2);
            }
            b0(t4Var);
            if (i == 0) {
                m mVar17 = this.i;
                T(mVar17);
                rVarP = mVar17.P("events", str4, "_f");
                z = false;
            } else {
                m mVar18 = this.i;
                T(mVar18);
                rVarP = mVar18.P("events", str4, "_v");
                z = true;
            }
        } catch (Throwable th3) {
            th = th3;
            m4Var3 = this;
        }
    }

    public final void Y(e eVar, t4 t4Var) {
        u uVar;
        com.gamericefishpro.space.v8.c0.d(eVar.d);
        com.gamericefishpro.space.v8.c0.g(eVar.e);
        com.gamericefishpro.space.v8.c0.g(eVar.i);
        com.gamericefishpro.space.v8.c0.d(eVar.i.e);
        c().r();
        k0();
        if (S(t4Var)) {
            if (!t4Var.A) {
                b0(t4Var);
                return;
            }
            e eVar2 = new e(eVar);
            boolean z = false;
            eVar2.w = false;
            m mVar = this.i;
            T(mVar);
            mVar.d0();
            try {
                m mVar2 = this.i;
                T(mVar2);
                String str = eVar2.d;
                com.gamericefishpro.space.v8.c0.g(str);
                e eVarP0 = mVar2.p0(str, eVar2.i.e);
                r1 r1Var = this.E;
                if (eVarP0 != null && !eVarP0.e.equals(eVar2.e)) {
                    a().B.d("Updating a conditional user property with different origin. name, origin, origin (from DB)", r1Var.C.c(eVar2.i.e), eVar2.e, eVarP0.e);
                }
                if (eVarP0 != null && eVarP0.w) {
                    eVar2.e = eVarP0.e;
                    eVar2.v = eVarP0.v;
                    eVar2.A = eVarP0.A;
                    eVar2.y = eVarP0.y;
                    eVar2.B = eVarP0.B;
                    eVar2.w = true;
                    o4 o4Var = eVar2.i;
                    eVar2.i = new o4(eVarP0.i.i, o4Var.b(), o4Var.e, eVarP0.i.y);
                } else if (TextUtils.isEmpty(eVar2.y)) {
                    o4 o4Var2 = eVar2.i;
                    eVar2.i = new o4(eVar2.v, o4Var2.b(), o4Var2.e, eVar2.i.y);
                    eVar2.w = true;
                    z = true;
                }
                if (eVar2.w) {
                    o4 o4Var3 = eVar2.i;
                    String str2 = eVar2.d;
                    com.gamericefishpro.space.v8.c0.g(str2);
                    String str3 = eVar2.e;
                    String str4 = o4Var3.e;
                    long j = o4Var3.i;
                    Object objB = o4Var3.b();
                    com.gamericefishpro.space.v8.c0.g(objB);
                    p4 p4Var = new p4(str2, str3, str4, j, objB);
                    Object obj = p4Var.e;
                    String str5 = p4Var.c;
                    m mVar3 = this.i;
                    T(mVar3);
                    if (mVar3.k0(p4Var)) {
                        a().F.d("User property updated immediately", eVar2.d, r1Var.C.c(str5), obj);
                    } else {
                        a().y.d("(2)Too many active user properties, ignoring", v0.z(eVar2.d), r1Var.C.c(str5), obj);
                    }
                    if (z && (uVar = eVar2.B) != null) {
                        l(new u(uVar, eVar2.v), t4Var);
                    }
                }
                m mVar4 = this.i;
                T(mVar4);
                if (mVar4.o0(eVar2)) {
                    a().F.d("Conditional property added", eVar2.d, r1Var.C.c(eVar2.i.e), eVar2.i.b());
                } else {
                    a().y.d("Too many conditional properties, ignoring", v0.z(eVar2.d), r1Var.C.c(eVar2.i.e), eVar2.i.b());
                }
                m mVar5 = this.i;
                T(mVar5);
                mVar5.e0();
            } finally {
                m mVar6 = this.i;
                T(mVar6);
                mVar6.f0();
            }
        }
    }

    public final void Z(e eVar, t4 t4Var) {
        com.gamericefishpro.space.v8.c0.d(eVar.d);
        com.gamericefishpro.space.v8.c0.g(eVar.i);
        com.gamericefishpro.space.v8.c0.d(eVar.i.e);
        c().r();
        k0();
        if (S(t4Var)) {
            if (!t4Var.A) {
                b0(t4Var);
                return;
            }
            m mVar = this.i;
            T(mVar);
            mVar.d0();
            try {
                b0(t4Var);
                String str = eVar.d;
                com.gamericefishpro.space.v8.c0.g(str);
                m mVar2 = this.i;
                T(mVar2);
                e eVarP0 = mVar2.p0(str, eVar.i.e);
                r1 r1Var = this.E;
                if (eVarP0 != null) {
                    a().F.c("Removing conditional user property", eVar.d, r1Var.C.c(eVar.i.e));
                    m mVar3 = this.i;
                    T(mVar3);
                    mVar3.q0(str, eVar.i.e);
                    if (eVarP0.w) {
                        m mVar4 = this.i;
                        T(mVar4);
                        mVar4.j0(str, eVar.i.e);
                    }
                    u uVar = eVar.D;
                    if (uVar != null) {
                        t tVar = uVar.e;
                        u uVarT = j0().T(uVar.d, tVar != null ? tVar.f() : null, eVarP0.e, uVar.v, true);
                        com.gamericefishpro.space.v8.c0.g(uVarT);
                        l(uVarT, t4Var);
                    }
                } else {
                    a().B.c("Conditional user property doesn't exist", v0.z(eVar.d), r1Var.C.c(eVar.i.e));
                }
                m mVar5 = this.i;
                T(mVar5);
                mVar5.e0();
            } finally {
                m mVar6 = this.i;
                T(mVar6);
                mVar6.f0();
            }
        }
    }

    @Override // com.gamericefishpro.space.n9.a2
    public final v0 a() {
        r1 r1Var = this.E;
        com.gamericefishpro.space.v8.c0.g(r1Var);
        v0 v0Var = r1Var.y;
        r1.l(v0Var);
        return v0Var;
    }

    public final void a0(t4 t4Var, long j) throws Throwable {
        m mVar = this.i;
        T(mVar);
        String str = t4Var.d;
        com.gamericefishpro.space.v8.c0.g(str);
        a1 a1VarT0 = mVar.t0(str);
        if (a1VarT0 != null) {
            j0();
            String str2 = t4Var.e;
            String strG = a1VarT0.G();
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            boolean zIsEmpty2 = TextUtils.isEmpty(strG);
            if (!zIsEmpty && !zIsEmpty2) {
                com.gamericefishpro.space.v8.c0.g(str2);
                if (!str2.equals(strG)) {
                    a().B.b(v0.z(a1VarT0.D()), "New GMP App Id passed in. Removing cached database data. appId");
                    m mVar2 = this.i;
                    T(mVar2);
                    r1 r1Var = (r1) mVar2.d;
                    String strD = a1VarT0.D();
                    mVar2.s();
                    mVar2.r();
                    com.gamericefishpro.space.v8.c0.d(strD);
                    try {
                        SQLiteDatabase sQLiteDatabaseG0 = mVar2.g0();
                        String[] strArr = {strD};
                        int iDelete = sQLiteDatabaseG0.delete("events", "app_id=?", strArr) + sQLiteDatabaseG0.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseG0.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseG0.delete("apps", "app_id=?", strArr) + sQLiteDatabaseG0.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseG0.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseG0.delete("event_filters", "app_id=?", strArr) + sQLiteDatabaseG0.delete("property_filters", "app_id=?", strArr) + sQLiteDatabaseG0.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseG0.delete("consent_settings", "app_id=?", strArr) + sQLiteDatabaseG0.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseG0.delete("trigger_uris", "app_id=?", strArr);
                        if (r1Var.v.B(null, e0.h1)) {
                            iDelete += sQLiteDatabaseG0.delete("no_data_mode_events", "app_id=?", strArr);
                        }
                        if (iDelete > 0) {
                            v0 v0Var = r1Var.y;
                            r1.l(v0Var);
                            v0Var.G.c("Deleted application data. app, records", strD, Integer.valueOf(iDelete));
                        }
                    } catch (SQLiteException e) {
                        v0 v0Var2 = r1Var.y;
                        r1.l(v0Var2);
                        v0Var2.y.c("Error deleting application data. appId, error", v0.z(strD), e);
                    }
                    a1VarT0 = null;
                }
            }
        }
        if (a1VarT0 != null) {
            boolean z = (a1VarT0.P() == -2147483648L || a1VarT0.P() == t4Var.C) ? false : true;
            String strN = a1VarT0.N();
            if (z || ((a1VarT0.P() != -2147483648L || strN == null || strN.equals(t4Var.i)) ? false : true)) {
                Bundle bundle = new Bundle();
                bundle.putString("_pv", strN);
                u uVar = new u("_au", new t(bundle), "auto", j);
                if (d0().B(null, e0.c1)) {
                    i(uVar, t4Var);
                } else {
                    j(uVar, t4Var);
                }
            }
        }
    }

    public final e2 b(String str) {
        e2 e2Var = e2.c;
        c().r();
        k0();
        HashMap map = this.U;
        e2 e2VarK = (e2) map.get(str);
        if (e2VarK == null) {
            m mVar = this.i;
            T(mVar);
            e2VarK = mVar.K(str);
            if (e2VarK == null) {
                e2VarK = e2.c;
            }
            c().r();
            k0();
            map.put(str, e2VarK);
            m mVar2 = this.i;
            T(mVar2);
            mVar2.M(str, e2VarK);
        }
        return e2VarK;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x029a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x029d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:103:0x029e  */
    /* JADX WARN: Code duplicated, block: B:46:0x012d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0155  */
    /* JADX WARN: Code duplicated, block: B:56:0x0160  */
    /* JADX WARN: Code duplicated, block: B:59:0x016b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0177  */
    /* JADX WARN: Code duplicated, block: B:65:0x018c  */
    /* JADX WARN: Code duplicated, block: B:68:0x019d  */
    /* JADX WARN: Code duplicated, block: B:69:0x019f  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:75:0x0207  */
    /* JADX WARN: Code duplicated, block: B:78:0x021a  */
    /* JADX WARN: Code duplicated, block: B:79:0x021c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0232  */
    /* JADX WARN: Code duplicated, block: B:83:0x0234  */
    /* JADX WARN: Code duplicated, block: B:86:0x0249  */
    /* JADX WARN: Code duplicated, block: B:88:0x0259  */
    /* JADX WARN: Code duplicated, block: B:89:0x025b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0276  */
    /* JADX WARN: Code duplicated, block: B:94:0x0278  */
    /* JADX WARN: Code duplicated, block: B:97:0x028e  */
    public final a1 b0(t4 t4Var) {
        boolean z;
        r1 r1Var;
        String str;
        long j;
        String str2;
        String str3;
        String str4;
        boolean z2;
        t7 t7Var;
        boolean z3;
        boolean z4;
        String str5;
        boolean z5;
        String str6;
        boolean z6;
        int i;
        boolean z7;
        c().r();
        k0();
        com.gamericefishpro.space.v8.c0.g(t4Var);
        boolean z8 = t4Var.G;
        String str7 = t4Var.d;
        com.gamericefishpro.space.v8.c0.d(str7);
        String str8 = t4Var.M;
        if (!str8.isEmpty()) {
            this.W.put(str7, new k4(this, str8));
        }
        m mVar = this.i;
        T(mVar);
        a1 a1VarT0 = mVar.t0(str7);
        e2 e2VarJ = b(str7).j(e2.c(100, t4Var.L));
        d2 d2Var = d2.AD_STORAGE;
        String strW = e2VarJ.i(d2Var) ? this.B.w(str7, z8) : "";
        boolean z9 = true;
        d2 d2Var2 = d2.ANALYTICS_STORAGE;
        if (a1VarT0 != null) {
            r1 r1Var2 = a1VarT0.a;
            if (e2VarJ.i(d2Var) && strW != null) {
                p1 p1Var = r1Var2.z;
                r1.l(p1Var);
                p1Var.r();
                if (!strW.equals(a1VarT0.e)) {
                    p1 p1Var2 = r1Var2.z;
                    r1.l(p1Var2);
                    p1Var2.r();
                    boolean zIsEmpty = TextUtils.isEmpty(a1VarT0.e);
                    a1VarT0.I(strW);
                    if (z8) {
                        q3 q3Var = this.B;
                        q3Var.getClass();
                        if (!"00000000-0000-0000-0000-000000000000".equals((e2VarJ.i(d2Var) ? q3Var.v(str7) : new Pair("", Boolean.FALSE)).first) && !zIsEmpty) {
                            if (e2VarJ.i(d2Var2)) {
                                a1VarT0.F(o(e2VarJ));
                                z = false;
                            } else {
                                z = true;
                            }
                            m mVar2 = this.i;
                            T(mVar2);
                            if (mVar2.l0(str7, "_id") != null) {
                                m mVar3 = this.i;
                                T(mVar3);
                                if (mVar3.l0(str7, "_lair") == null) {
                                    e().getClass();
                                    p4 p4Var = new p4(str7, "auto", "_lair", System.currentTimeMillis(), 1L);
                                    m mVar4 = this.i;
                                    T(mVar4);
                                    mVar4.k0(p4Var);
                                }
                            }
                        }
                    }
                    if (TextUtils.isEmpty(a1VarT0.E()) && e2VarJ.i(d2Var2)) {
                        a1VarT0.F(o(e2VarJ));
                    }
                } else if (TextUtils.isEmpty(a1VarT0.E())) {
                    a1VarT0.F(o(e2VarJ));
                }
            } else if (TextUtils.isEmpty(a1VarT0.E()) && e2VarJ.i(d2Var2)) {
                a1VarT0.F(o(e2VarJ));
            }
            r1Var = a1VarT0.a;
            a1VarT0.H(t4Var.e);
            str = t4Var.D;
            if (!TextUtils.isEmpty(str)) {
                a1VarT0.K(str);
            }
            j = t4Var.w;
            if (j != 0) {
                a1VarT0.S(j);
            }
            str2 = t4Var.i;
            if (!TextUtils.isEmpty(str2)) {
                a1VarT0.O(str2);
            }
            a1VarT0.Q(t4Var.C);
            str3 = t4Var.v;
            if (str3 != null) {
                a1VarT0.R(str3);
            }
            a1VarT0.a(t4Var.y);
            a1VarT0.d(t4Var.A);
            str4 = t4Var.z;
            if (!TextUtils.isEmpty(str4)) {
                a1VarT0.v(str4);
            }
            p1 p1Var3 = r1Var.z;
            r1.l(p1Var3);
            p1Var3.r();
            boolean z10 = a1VarT0.Q;
            if (a1VarT0.p != z8) {
                z2 = true;
            } else {
                z2 = false;
            }
            a1VarT0.Q = z10 | z2;
            a1VarT0.p = z8;
            Boolean bool = t4Var.I;
            p1 p1Var4 = r1Var.z;
            r1.l(p1Var4);
            p1Var4.r();
            a1VarT0.Q |= !Objects.equals(a1VarT0.q, bool);
            a1VarT0.q = bool;
            a1VarT0.c(t4Var.J);
            String str9 = t4Var.N;
            p1 p1Var5 = r1Var.z;
            r1.l(p1Var5);
            p1Var5.r();
            a1VarT0.Q |= !Objects.equals(a1VarT0.t, str9);
            a1VarT0.t = str9;
            t7Var = t7.e;
            if (d0().B(null, e0.L0)) {
                a1VarT0.x(t4Var.K);
            } else {
                if (d0().B(null, e0.K0)) {
                    a1VarT0.x(null);
                }
            }
            z3 = t4Var.O;
            p1 p1Var6 = r1Var.z;
            r1.l(p1Var6);
            p1Var6.r();
            boolean z11 = a1VarT0.Q;
            if (a1VarT0.u != z3) {
                z4 = true;
            } else {
                z4 = false;
            }
            a1VarT0.Q = z11 | z4;
            a1VarT0.u = z3;
            str5 = t4Var.U;
            p1 p1Var7 = r1Var.z;
            r1.l(p1Var7);
            p1Var7.r();
            boolean z12 = a1VarT0.Q;
            if (a1VarT0.C != str5) {
                z5 = true;
            } else {
                z5 = false;
            }
            a1VarT0.Q = z12 | z5;
            a1VarT0.C = str5;
            r8.a();
            if (d0().B(null, e0.P0)) {
                i = t4Var.S;
                p1 p1Var8 = r1Var.z;
                r1.l(p1Var8);
                p1Var8.r();
                boolean z13 = a1VarT0.Q;
                if (a1VarT0.x != i) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                a1VarT0.Q = z13 | z7;
                a1VarT0.x = i;
            }
            a1VarT0.z(t4Var.P);
            str6 = t4Var.V;
            p1 p1Var9 = r1Var.z;
            r1.l(p1Var9);
            p1Var9.r();
            boolean z14 = a1VarT0.Q;
            if (a1VarT0.G != str6) {
                z6 = true;
            } else {
                z6 = false;
            }
            a1VarT0.Q = z14 | z6;
            a1VarT0.G = str6;
            int i2 = t4Var.X;
            p1 p1Var10 = r1Var.z;
            r1.l(p1Var10);
            p1Var10.r();
            a1VarT0.Q |= a1VarT0.I != i2;
            a1VarT0.I = i2;
            if (!a1VarT0.o()) {
                z9 = z;
            } else if (!z) {
                return a1VarT0;
            }
            m mVar5 = this.i;
            T(mVar5);
            mVar5.u0(a1VarT0, z9);
            return a1VarT0;
        }
        a1VarT0 = new a1(this.E, str7);
        if (e2VarJ.i(d2Var2)) {
            a1VarT0.F(o(e2VarJ));
        }
        if (e2VarJ.i(d2Var)) {
            a1VarT0.I(strW);
        }
        z = false;
        r1Var = a1VarT0.a;
        a1VarT0.H(t4Var.e);
        str = t4Var.D;
        if (!TextUtils.isEmpty(str)) {
            a1VarT0.K(str);
        }
        j = t4Var.w;
        if (j != 0) {
            a1VarT0.S(j);
        }
        str2 = t4Var.i;
        if (!TextUtils.isEmpty(str2)) {
            a1VarT0.O(str2);
        }
        a1VarT0.Q(t4Var.C);
        str3 = t4Var.v;
        if (str3 != null) {
            a1VarT0.R(str3);
        }
        a1VarT0.a(t4Var.y);
        a1VarT0.d(t4Var.A);
        str4 = t4Var.z;
        if (!TextUtils.isEmpty(str4)) {
            a1VarT0.v(str4);
        }
        p1 p1Var11 = r1Var.z;
        r1.l(p1Var11);
        p1Var11.r();
        boolean z15 = a1VarT0.Q;
        if (a1VarT0.p != z8) {
            z2 = true;
        } else {
            z2 = false;
        }
        a1VarT0.Q = z15 | z2;
        a1VarT0.p = z8;
        Boolean bool2 = t4Var.I;
        p1 p1Var12 = r1Var.z;
        r1.l(p1Var12);
        p1Var12.r();
        a1VarT0.Q |= !Objects.equals(a1VarT0.q, bool2);
        a1VarT0.q = bool2;
        a1VarT0.c(t4Var.J);
        String str10 = t4Var.N;
        p1 p1Var13 = r1Var.z;
        r1.l(p1Var13);
        p1Var13.r();
        a1VarT0.Q |= !Objects.equals(a1VarT0.t, str10);
        a1VarT0.t = str10;
        t7Var = t7.e;
        if (d0().B(null, e0.L0)) {
            a1VarT0.x(t4Var.K);
        } else {
            if (d0().B(null, e0.K0)) {
                a1VarT0.x(null);
            }
        }
        z3 = t4Var.O;
        p1 p1Var14 = r1Var.z;
        r1.l(p1Var14);
        p1Var14.r();
        boolean z16 = a1VarT0.Q;
        if (a1VarT0.u != z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        a1VarT0.Q = z16 | z4;
        a1VarT0.u = z3;
        str5 = t4Var.U;
        p1 p1Var15 = r1Var.z;
        r1.l(p1Var15);
        p1Var15.r();
        boolean z17 = a1VarT0.Q;
        if (a1VarT0.C != str5) {
            z5 = true;
        } else {
            z5 = false;
        }
        a1VarT0.Q = z17 | z5;
        a1VarT0.C = str5;
        r8.a();
        if (d0().B(null, e0.P0)) {
            i = t4Var.S;
            p1 p1Var16 = r1Var.z;
            r1.l(p1Var16);
            p1Var16.r();
            boolean z18 = a1VarT0.Q;
            if (a1VarT0.x != i) {
                z7 = true;
            } else {
                z7 = false;
            }
            a1VarT0.Q = z18 | z7;
            a1VarT0.x = i;
        }
        a1VarT0.z(t4Var.P);
        str6 = t4Var.V;
        p1 p1Var17 = r1Var.z;
        r1.l(p1Var17);
        p1Var17.r();
        boolean z19 = a1VarT0.Q;
        if (a1VarT0.G != str6) {
            z6 = true;
        } else {
            z6 = false;
        }
        a1VarT0.Q = z19 | z6;
        a1VarT0.G = str6;
        int i3 = t4Var.X;
        p1 p1Var18 = r1Var.z;
        r1.l(p1Var18);
        p1Var18.r();
        a1VarT0.Q |= a1VarT0.I != i3;
        a1VarT0.I = i3;
        if (!a1VarT0.o()) {
            z9 = z;
        } else if (!z) {
            return a1VarT0;
        }
        m mVar6 = this.i;
        T(mVar6);
        mVar6.u0(a1VarT0, z9);
        return a1VarT0;
    }

    @Override // com.gamericefishpro.space.n9.a2
    public final p1 c() {
        r1 r1Var = this.E;
        com.gamericefishpro.space.v8.c0.g(r1Var);
        p1 p1Var = r1Var.z;
        r1.l(p1Var);
        return p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    public final List c0(Bundle bundle, t4 t4Var) {
        int[] iArr;
        c().r();
        r8.a();
        g gVarD0 = d0();
        String str = t4Var.d;
        if (!gVarD0.B(str, e0.P0) || str == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    a().y.a("Uri sources and timestamps do not match");
                } else {
                    int i = 0;
                    while (i < intArray.length) {
                        m mVar = this.i;
                        T(mVar);
                        r1 r1Var = (r1) mVar.d;
                        int i2 = intArray[i];
                        long j = longArray[i];
                        com.gamericefishpro.space.v8.c0.d(str);
                        mVar.r();
                        mVar.s();
                        try {
                            iArr = intArray;
                            try {
                                int iDelete = mVar.g0().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i2), String.valueOf(j)});
                                v0 v0Var = r1Var.y;
                                r1.l(v0Var);
                                t0 t0Var = v0Var.G;
                                StringBuilder sb = new StringBuilder(String.valueOf(iDelete).length() + 46);
                                sb.append("Pruned ");
                                sb.append(iDelete);
                                sb.append(" trigger URIs. appId, source, timestamp");
                                t0Var.d(sb.toString(), str, Integer.valueOf(i2), Long.valueOf(j));
                            } catch (SQLiteException e) {
                                e = e;
                                v0 v0Var2 = r1Var.y;
                                r1.l(v0Var2);
                                v0Var2.y.c("Error pruning trigger URIs. appId", v0.z(str), e);
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            iArr = intArray;
                        }
                        i++;
                        intArray = iArr;
                    }
                }
            }
        }
        m mVar2 = this.i;
        T(mVar2);
        String str2 = t4Var.d;
        com.gamericefishpro.space.v8.c0.d(str2);
        mVar2.r();
        mVar2.s();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = mVar2.g0().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new a4(string, cursorQuery.getLong(1), cursorQuery.getInt(2)));
                    } while (cursorQuery.moveToNext());
                }
            } finally {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        } catch (SQLiteException e3) {
            v0 v0Var3 = ((r1) mVar2.d).y;
            r1.l(v0Var3);
            v0Var3.y.c("Error querying trigger uris. appId", v0.z(str2), e3);
            arrayList = Collections.EMPTY_LIST;
        }
        return arrayList;
    }

    @Override // com.gamericefishpro.space.n9.a2
    public final Context d() {
        return this.E.d;
    }

    public final g d0() {
        r1 r1Var = this.E;
        com.gamericefishpro.space.v8.c0.g(r1Var);
        return r1Var.v;
    }

    @Override // com.gamericefishpro.space.n9.a2
    public final com.gamericefishpro.space.z8.a e() {
        r1 r1Var = this.E;
        com.gamericefishpro.space.v8.c0.g(r1Var);
        return r1Var.D;
    }

    public final l1 e0() {
        l1 l1Var = this.d;
        T(l1Var);
        return l1Var;
    }

    @Override // com.gamericefishpro.space.n9.a2
    public final com.gamericefishpro.space.lb.e f() {
        return this.E.i;
    }

    public final m f0() {
        m mVar = this.i;
        T(mVar);
        return mVar;
    }

    public final long g() {
        e().getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        q3 q3Var = this.B;
        q3Var.s();
        q3Var.r();
        d1 d1Var = q3Var.C;
        long jA = d1Var.a();
        if (jA == 0) {
            r4 r4Var = ((r1) q3Var.d).B;
            r1.j(r4Var);
            jA = ((long) r4Var.o0().nextInt(86400000)) + 1;
            d1Var.b(jA);
        }
        return ((((jCurrentTimeMillis + jA) / 1000) / 60) / 60) / 24;
    }

    public final b1 g0() {
        b1 b1Var = this.v;
        if (b1Var != null) {
            return b1Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final void h(u uVar, String str) {
        m mVar = this.i;
        T(mVar);
        a1 a1VarT0 = mVar.t0(str);
        if (a1VarT0 != null) {
            r1 r1Var = a1VarT0.a;
            if (!TextUtils.isEmpty(a1VarT0.N())) {
                Boolean boolP = P(a1VarT0);
                if (boolP == null) {
                    if (!"_ui".equals(uVar.d)) {
                        a().B.b(v0.z(str), "Could not find package. appId");
                    }
                } else if (!boolP.booleanValue()) {
                    a().y.b(v0.z(str), "App version does not match; dropping event. appId");
                    return;
                }
                String strG = a1VarT0.G();
                String strN = a1VarT0.N();
                long jP = a1VarT0.P();
                p1 p1Var = r1Var.z;
                r1.l(p1Var);
                p1Var.r();
                String str2 = a1VarT0.l;
                p1 p1Var2 = r1Var.z;
                r1.l(p1Var2);
                p1Var2.r();
                long j = a1VarT0.m;
                p1 p1Var3 = r1Var.z;
                r1.l(p1Var3);
                p1Var3.r();
                long j2 = a1VarT0.n;
                p1 p1Var4 = r1Var.z;
                r1.l(p1Var4);
                p1Var4.r();
                boolean z = a1VarT0.o;
                String strJ = a1VarT0.J();
                p1 p1Var5 = r1Var.z;
                r1.l(p1Var5);
                p1Var5.r();
                boolean z2 = a1VarT0.p;
                Boolean boolW = a1VarT0.w();
                long jB = a1VarT0.b();
                p1 p1Var6 = r1Var.z;
                r1.l(p1Var6);
                p1Var6.r();
                ArrayList arrayList = a1VarT0.s;
                String strG2 = b(str).g();
                boolean zY = a1VarT0.y();
                p1 p1Var7 = r1Var.z;
                r1.l(p1Var7);
                p1Var7.r();
                long j3 = a1VarT0.v;
                int i = b(str).b;
                String str3 = n0(str).b;
                p1 p1Var8 = r1Var.z;
                r1.l(p1Var8);
                p1Var8.r();
                int i2 = a1VarT0.x;
                p1 p1Var9 = r1Var.z;
                r1.l(p1Var9);
                p1Var9.r();
                i(uVar, new t4(str, strG, strN, jP, str2, j, j2, (String) null, z, false, strJ, 0L, 0, z2, false, boolW, jB, (List) arrayList, strG2, "", (String) null, zY, j3, i, str3, i2, a1VarT0.B, a1VarT0.C(), a1VarT0.s(), 0L, a1VarT0.t()));
                return;
            }
        }
        a().F.b(str, "No app data available; dropping event");
    }

    public final c h0() {
        c cVar = this.y;
        T(cVar);
        return cVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0097  */
    /* JADX WARN: Code duplicated, block: B:34:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:40:0x010d  */
    /* JADX WARN: Code duplicated, block: B:47:? A[SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0080: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:129), block:B:18:0x0080 */
    public final void i(u uVar, t4 t4Var) throws Throwable {
        Throwable th;
        Cursor cursorRawQuery;
        Cursor cursor;
        Bundle bundleY;
        u uVarC;
        t tVar;
        String string;
        String str = t4Var.d;
        com.gamericefishpro.space.v8.c0.d(str);
        w0 w0VarB = w0.b(uVar);
        Bundle bundle = (Bundle) w0VarB.e;
        r4 r4VarJ0 = j0();
        m mVar = this.i;
        T(mVar);
        r1 r1Var = (r1) mVar.d;
        mVar.r();
        mVar.s();
        Cursor cursor2 = null;
        try {
            try {
                cursorRawQuery = mVar.g0().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        try {
                            com.gamericefishpro.space.i9.a3 a3Var = (com.gamericefishpro.space.i9.a3) ((com.gamericefishpro.space.i9.z2) z0.e0(com.gamericefishpro.space.i9.a3.z(), cursorRawQuery.getBlob(0))).e();
                            mVar.e.i0();
                            bundleY = z0.y(a3Var.p());
                            cursorRawQuery.close();
                        } catch (IOException e) {
                            v0 v0Var = r1Var.y;
                            r1.l(v0Var);
                            v0Var.y.c("Failed to retrieve default event parameters. appId", v0.z(str), e);
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            bundleY = null;
                        }
                        r4VarJ0.C(bundle, bundleY);
                        r4 r4VarJ1 = j0();
                        g gVarD0 = d0();
                        gVarD0.getClass();
                        r4VarJ1.A(w0VarB, Math.max(Math.min(gVarD0.z(str, e0.X), 100), 25));
                        uVarC = w0VarB.c();
                        if (!d0().B(null, e0.f1) && "_cmp".equals(uVarC.d)) {
                            tVar = uVarC.e;
                            if ("referrer API v2".equals(tVar.d.getString("_cis"))) {
                                string = tVar.d.getString("gclid");
                                if (!TextUtils.isEmpty(string)) {
                                    V(new o4(uVarC.v, string, "_lgclid", "auto"), t4Var);
                                }
                            }
                        }
                        j(uVarC, t4Var);
                    }
                    v0 v0Var2 = r1Var.y;
                    r1.l(v0Var2);
                    v0Var2.G.a("Default event parameters not found");
                } catch (SQLiteException e2) {
                    e = e2;
                    v0 v0Var3 = r1Var.y;
                    r1.l(v0Var3);
                    v0Var3.y.b(e, "Error selecting default event parameters");
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                    throw th;
                }
                cursor2.close();
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorRawQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
                throw th;
            }
            cursor2.close();
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        bundleY = null;
        r4VarJ0.C(bundle, bundleY);
        r4 r4VarJ2 = j0();
        g gVarD1 = d0();
        gVarD1.getClass();
        r4VarJ2.A(w0VarB, Math.max(Math.min(gVarD1.z(str, e0.X), 100), 25));
        uVarC = w0VarB.c();
        if (!d0().B(null, e0.f1)) {
            tVar = uVarC.e;
            if ("referrer API v2".equals(tVar.d.getString("_cis"))) {
                string = tVar.d.getString("gclid");
                if (!TextUtils.isEmpty(string)) {
                    V(new o4(uVarC.v, string, "_lgclid", "auto"), t4Var);
                }
            }
        }
        j(uVarC, t4Var);
    }

    public final z0 i0() {
        z0 z0Var = this.z;
        T(z0Var);
        return z0Var;
    }

    public final void j(u uVar, t4 t4Var) {
        u uVar2;
        List listS0;
        r1 r1Var;
        List listS1;
        List<e> listS2;
        String str;
        com.gamericefishpro.space.v8.c0.g(t4Var);
        String str2 = t4Var.d;
        com.gamericefishpro.space.v8.c0.d(str2);
        c().r();
        k0();
        long j = uVar.v;
        w0 w0VarB = w0.b(uVar);
        c().r();
        r4.i0((this.Y == null || (str = this.Z) == null || !str.equals(str2)) ? null : this.Y, (Bundle) w0VarB.e, false);
        u uVarC = w0VarB.c();
        i0();
        if (TextUtils.isEmpty(t4Var.e)) {
            return;
        }
        if (!t4Var.A) {
            b0(t4Var);
            return;
        }
        List list = t4Var.K;
        if (list != null) {
            String str3 = uVarC.d;
            if (!list.contains(str3)) {
                a().F.d("Dropping non-safelisted event. appId, event name, origin", str2, uVarC.d, uVarC.i);
                return;
            } else {
                Bundle bundleF = uVarC.e.f();
                bundleF.putLong("ga_safelisted", 1L);
                uVar2 = new u(str3, new t(bundleF), uVarC.i, uVarC.v);
            }
        } else {
            uVar2 = uVarC;
        }
        m mVar = this.i;
        T(mVar);
        mVar.d0();
        try {
            String str4 = uVar2.d;
            if ("_s".equals(str4)) {
                m mVar2 = this.i;
                T(mVar2);
                if (!mVar2.G(str2, "_s") && uVar2.e.d.getLong("_sid") != 0) {
                    m mVar3 = this.i;
                    T(mVar3);
                    if (mVar3.G(str2, "_f")) {
                        m mVar4 = this.i;
                        T(mVar4);
                        mVar4.J(str2, null, "_sid", k(uVar2, str2));
                    } else {
                        m mVar5 = this.i;
                        T(mVar5);
                        if (mVar5.G(str2, "_v")) {
                            m mVar6 = this.i;
                            T(mVar6);
                            mVar6.J(str2, null, "_sid", k(uVar2, str2));
                        } else {
                            m mVar7 = this.i;
                            T(mVar7);
                            e().getClass();
                            mVar7.J(str2, Long.valueOf(System.currentTimeMillis() - 15000), "_sid", k(uVar2, str2));
                        }
                    }
                }
            }
            m mVar8 = this.i;
            T(mVar8);
            com.gamericefishpro.space.v8.c0.d(str2);
            mVar8.r();
            mVar8.s();
            if (j < 0) {
                v0 v0Var = ((r1) mVar8.d).y;
                r1.l(v0Var);
                v0Var.B.c("Invalid time querying timed out conditional properties", v0.z(str2), Long.valueOf(j));
                listS0 = Collections.EMPTY_LIST;
            } else {
                listS0 = mVar8.s0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
            }
            Iterator it = listS0.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                r1Var = this.E;
                if (!zHasNext) {
                    break;
                }
                e eVar = (e) it.next();
                if (eVar != null) {
                    a().G.d("User property timed out", eVar.d, r1Var.C.c(eVar.i.e), eVar.i.b());
                    u uVar3 = eVar.z;
                    if (uVar3 != null) {
                        l(new u(uVar3, j), t4Var);
                    }
                    m mVar9 = this.i;
                    T(mVar9);
                    mVar9.q0(str2, eVar.i.e);
                }
            }
            m mVar10 = this.i;
            T(mVar10);
            com.gamericefishpro.space.v8.c0.d(str2);
            mVar10.r();
            mVar10.s();
            if (j < 0) {
                v0 v0Var2 = ((r1) mVar10.d).y;
                r1.l(v0Var2);
                v0Var2.B.c("Invalid time querying expired conditional properties", v0.z(str2), Long.valueOf(j));
                listS1 = Collections.EMPTY_LIST;
            } else {
                listS1 = mVar10.s0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
            }
            ArrayList arrayList = new ArrayList(listS1.size());
            Iterator it2 = listS1.iterator();
            while (it2.hasNext()) {
                e eVar2 = (e) it2.next();
                if (eVar2 != null) {
                    Iterator it3 = it2;
                    a().G.d("User property expired", eVar2.d, r1Var.C.c(eVar2.i.e), eVar2.i.b());
                    m mVar11 = this.i;
                    T(mVar11);
                    mVar11.j0(str2, eVar2.i.e);
                    u uVar4 = eVar2.D;
                    if (uVar4 != null) {
                        arrayList.add(uVar4);
                    }
                    m mVar12 = this.i;
                    T(mVar12);
                    mVar12.q0(str2, eVar2.i.e);
                    it2 = it3;
                }
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                l(new u((u) obj, j), t4Var);
            }
            m mVar13 = this.i;
            T(mVar13);
            com.gamericefishpro.space.v8.c0.d(str2);
            com.gamericefishpro.space.v8.c0.d(str4);
            mVar13.r();
            mVar13.s();
            if (j < 0) {
                r1 r1Var2 = (r1) mVar13.d;
                v0 v0Var3 = r1Var2.y;
                r1.l(v0Var3);
                v0Var3.B.d("Invalid time querying triggered conditional properties", v0.z(str2), r1Var2.C.a(str4), Long.valueOf(j));
                listS2 = Collections.EMPTY_LIST;
            } else {
                listS2 = mVar13.s0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j)});
            }
            ArrayList arrayList2 = new ArrayList(listS2.size());
            for (e eVar3 : listS2) {
                if (eVar3 != null) {
                    o4 o4Var = eVar3.i;
                    String str5 = eVar3.d;
                    com.gamericefishpro.space.v8.c0.g(str5);
                    String str6 = eVar3.e;
                    String str7 = o4Var.e;
                    Object objB = o4Var.b();
                    com.gamericefishpro.space.v8.c0.g(objB);
                    p4 p4Var = new p4(str5, str6, str7, j, objB);
                    Object obj2 = p4Var.e;
                    String str8 = p4Var.c;
                    m mVar14 = this.i;
                    T(mVar14);
                    if (mVar14.k0(p4Var)) {
                        a().G.d("User property triggered", eVar3.d, r1Var.C.c(str8), obj2);
                    } else {
                        a().y.d("Too many active user properties, ignoring", v0.z(eVar3.d), r1Var.C.c(str8), obj2);
                    }
                    u uVar5 = eVar3.B;
                    if (uVar5 != null) {
                        arrayList2.add(uVar5);
                    }
                    eVar3.i = new o4(p4Var);
                    eVar3.w = true;
                    m mVar15 = this.i;
                    T(mVar15);
                    mVar15.o0(eVar3);
                }
            }
            l(uVar2, t4Var);
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj3 = arrayList2.get(i2);
                i2++;
                l(new u((u) obj3, j), t4Var);
            }
            m mVar16 = this.i;
            T(mVar16);
            mVar16.e0();
        } finally {
            m mVar17 = this.i;
            T(mVar17);
            mVar17.f0();
        }
    }

    public final r4 j0() {
        r1 r1Var = this.E;
        com.gamericefishpro.space.v8.c0.g(r1Var);
        r4 r4Var = r1Var.B;
        r1.j(r4Var);
        return r4Var;
    }

    public final Bundle k(u uVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", uVar.e.d.getLong("_sid"));
        m mVar = this.i;
        T(mVar);
        p4 p4VarL0 = mVar.l0(str, "_sno");
        if (p4VarL0 != null) {
            Object obj = p4VarL0.e;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    public final void k0() {
        if (!this.F.get()) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x03e5 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05bc, B:156:0x05e6, B:160:0x0636, B:163:0x0664, B:165:0x0691, B:166:0x0694, B:168:0x069a, B:170:0x06a2, B:172:0x06a8, B:174:0x06b0, B:176:0x06b6, B:180:0x06c5, B:183:0x06d4, B:185:0x06dd, B:187:0x06e5, B:190:0x0716, B:192:0x071f, B:196:0x0734, B:201:0x0741, B:236:0x07bc, B:237:0x07c3, B:239:0x07e6, B:242:0x07ef, B:246:0x07fa, B:247:0x0814, B:249:0x081a, B:251:0x0834, B:253:0x0840, B:255:0x084d, B:262:0x0882, B:266:0x088c, B:267:0x088f, B:269:0x089c, B:270:0x089f, B:281:0x08e3, B:260:0x086e, B:240:0x07e9, B:204:0x074a, B:208:0x0757, B:212:0x0765, B:216:0x0773, B:220:0x0781, B:224:0x078f, B:228:0x079b, B:232:0x07a9, B:162:0x0657, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:393:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x03ea A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05bc, B:156:0x05e6, B:160:0x0636, B:163:0x0664, B:165:0x0691, B:166:0x0694, B:168:0x069a, B:170:0x06a2, B:172:0x06a8, B:174:0x06b0, B:176:0x06b6, B:180:0x06c5, B:183:0x06d4, B:185:0x06dd, B:187:0x06e5, B:190:0x0716, B:192:0x071f, B:196:0x0734, B:201:0x0741, B:236:0x07bc, B:237:0x07c3, B:239:0x07e6, B:242:0x07ef, B:246:0x07fa, B:247:0x0814, B:249:0x081a, B:251:0x0834, B:253:0x0840, B:255:0x084d, B:262:0x0882, B:266:0x088c, B:267:0x088f, B:269:0x089c, B:270:0x089f, B:281:0x08e3, B:260:0x086e, B:240:0x07e9, B:204:0x074a, B:208:0x0757, B:212:0x0765, B:216:0x0773, B:220:0x0781, B:224:0x078f, B:228:0x079b, B:232:0x07a9, B:162:0x0657, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:393:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x040a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x040c A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05bc, B:156:0x05e6, B:160:0x0636, B:163:0x0664, B:165:0x0691, B:166:0x0694, B:168:0x069a, B:170:0x06a2, B:172:0x06a8, B:174:0x06b0, B:176:0x06b6, B:180:0x06c5, B:183:0x06d4, B:185:0x06dd, B:187:0x06e5, B:190:0x0716, B:192:0x071f, B:196:0x0734, B:201:0x0741, B:236:0x07bc, B:237:0x07c3, B:239:0x07e6, B:242:0x07ef, B:246:0x07fa, B:247:0x0814, B:249:0x081a, B:251:0x0834, B:253:0x0840, B:255:0x084d, B:262:0x0882, B:266:0x088c, B:267:0x088f, B:269:0x089c, B:270:0x089f, B:281:0x08e3, B:260:0x086e, B:240:0x07e9, B:204:0x074a, B:208:0x0757, B:212:0x0765, B:216:0x0773, B:220:0x0781, B:224:0x078f, B:228:0x079b, B:232:0x07a9, B:162:0x0657, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:393:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0426 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05bc, B:156:0x05e6, B:160:0x0636, B:163:0x0664, B:165:0x0691, B:166:0x0694, B:168:0x069a, B:170:0x06a2, B:172:0x06a8, B:174:0x06b0, B:176:0x06b6, B:180:0x06c5, B:183:0x06d4, B:185:0x06dd, B:187:0x06e5, B:190:0x0716, B:192:0x071f, B:196:0x0734, B:201:0x0741, B:236:0x07bc, B:237:0x07c3, B:239:0x07e6, B:242:0x07ef, B:246:0x07fa, B:247:0x0814, B:249:0x081a, B:251:0x0834, B:253:0x0840, B:255:0x084d, B:262:0x0882, B:266:0x088c, B:267:0x088f, B:269:0x089c, B:270:0x089f, B:281:0x08e3, B:260:0x086e, B:240:0x07e9, B:204:0x074a, B:208:0x0757, B:212:0x0765, B:216:0x0773, B:220:0x0781, B:224:0x078f, B:228:0x079b, B:232:0x07a9, B:162:0x0657, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:393:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x042c A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05bc, B:156:0x05e6, B:160:0x0636, B:163:0x0664, B:165:0x0691, B:166:0x0694, B:168:0x069a, B:170:0x06a2, B:172:0x06a8, B:174:0x06b0, B:176:0x06b6, B:180:0x06c5, B:183:0x06d4, B:185:0x06dd, B:187:0x06e5, B:190:0x0716, B:192:0x071f, B:196:0x0734, B:201:0x0741, B:236:0x07bc, B:237:0x07c3, B:239:0x07e6, B:242:0x07ef, B:246:0x07fa, B:247:0x0814, B:249:0x081a, B:251:0x0834, B:253:0x0840, B:255:0x084d, B:262:0x0882, B:266:0x088c, B:267:0x088f, B:269:0x089c, B:270:0x089f, B:281:0x08e3, B:260:0x086e, B:240:0x07e9, B:204:0x074a, B:208:0x0757, B:212:0x0765, B:216:0x0773, B:220:0x0781, B:224:0x078f, B:228:0x079b, B:232:0x07a9, B:162:0x0657, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:393:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0462 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05bc, B:156:0x05e6, B:160:0x0636, B:163:0x0664, B:165:0x0691, B:166:0x0694, B:168:0x069a, B:170:0x06a2, B:172:0x06a8, B:174:0x06b0, B:176:0x06b6, B:180:0x06c5, B:183:0x06d4, B:185:0x06dd, B:187:0x06e5, B:190:0x0716, B:192:0x071f, B:196:0x0734, B:201:0x0741, B:236:0x07bc, B:237:0x07c3, B:239:0x07e6, B:242:0x07ef, B:246:0x07fa, B:247:0x0814, B:249:0x081a, B:251:0x0834, B:253:0x0840, B:255:0x084d, B:262:0x0882, B:266:0x088c, B:267:0x088f, B:269:0x089c, B:270:0x089f, B:281:0x08e3, B:260:0x086e, B:240:0x07e9, B:204:0x074a, B:208:0x0757, B:212:0x0765, B:216:0x0773, B:220:0x0781, B:224:0x078f, B:228:0x079b, B:232:0x07a9, B:162:0x0657, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:393:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0480  */
    /* JADX WARN: Code duplicated, block: B:121:0x0484 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05bc, B:156:0x05e6, B:160:0x0636, B:163:0x0664, B:165:0x0691, B:166:0x0694, B:168:0x069a, B:170:0x06a2, B:172:0x06a8, B:174:0x06b0, B:176:0x06b6, B:180:0x06c5, B:183:0x06d4, B:185:0x06dd, B:187:0x06e5, B:190:0x0716, B:192:0x071f, B:196:0x0734, B:201:0x0741, B:236:0x07bc, B:237:0x07c3, B:239:0x07e6, B:242:0x07ef, B:246:0x07fa, B:247:0x0814, B:249:0x081a, B:251:0x0834, B:253:0x0840, B:255:0x084d, B:262:0x0882, B:266:0x088c, B:267:0x088f, B:269:0x089c, B:270:0x089f, B:281:0x08e3, B:260:0x086e, B:240:0x07e9, B:204:0x074a, B:208:0x0757, B:212:0x0765, B:216:0x0773, B:220:0x0781, B:224:0x078f, B:228:0x079b, B:232:0x07a9, B:162:0x0657, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:393:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x04c1 A[Catch: all -> 0x01eb, TRY_ENTER, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05bc, B:156:0x05e6, B:160:0x0636, B:163:0x0664, B:165:0x0691, B:166:0x0694, B:168:0x069a, B:170:0x06a2, B:172:0x06a8, B:174:0x06b0, B:176:0x06b6, B:180:0x06c5, B:183:0x06d4, B:185:0x06dd, B:187:0x06e5, B:190:0x0716, B:192:0x071f, B:196:0x0734, B:201:0x0741, B:236:0x07bc, B:237:0x07c3, B:239:0x07e6, B:242:0x07ef, B:246:0x07fa, B:247:0x0814, B:249:0x081a, B:251:0x0834, B:253:0x0840, B:255:0x084d, B:262:0x0882, B:266:0x088c, B:267:0x088f, B:269:0x089c, B:270:0x089f, B:281:0x08e3, B:260:0x086e, B:240:0x07e9, B:204:0x074a, B:208:0x0757, B:212:0x0765, B:216:0x0773, B:220:0x0781, B:224:0x078f, B:228:0x079b, B:232:0x07a9, B:162:0x0657, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:393:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x04dd A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05bc, B:156:0x05e6, B:160:0x0636, B:163:0x0664, B:165:0x0691, B:166:0x0694, B:168:0x069a, B:170:0x06a2, B:172:0x06a8, B:174:0x06b0, B:176:0x06b6, B:180:0x06c5, B:183:0x06d4, B:185:0x06dd, B:187:0x06e5, B:190:0x0716, B:192:0x071f, B:196:0x0734, B:201:0x0741, B:236:0x07bc, B:237:0x07c3, B:239:0x07e6, B:242:0x07ef, B:246:0x07fa, B:247:0x0814, B:249:0x081a, B:251:0x0834, B:253:0x0840, B:255:0x084d, B:262:0x0882, B:266:0x088c, B:267:0x088f, B:269:0x089c, B:270:0x089f, B:281:0x08e3, B:260:0x086e, B:240:0x07e9, B:204:0x074a, B:208:0x0757, B:212:0x0765, B:216:0x0773, B:220:0x0781, B:224:0x078f, B:228:0x079b, B:232:0x07a9, B:162:0x0657, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:393:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x04ed A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05bc, B:156:0x05e6, B:160:0x0636, B:163:0x0664, B:165:0x0691, B:166:0x0694, B:168:0x069a, B:170:0x06a2, B:172:0x06a8, B:174:0x06b0, B:176:0x06b6, B:180:0x06c5, B:183:0x06d4, B:185:0x06dd, B:187:0x06e5, B:190:0x0716, B:192:0x071f, B:196:0x0734, B:201:0x0741, B:236:0x07bc, B:237:0x07c3, B:239:0x07e6, B:242:0x07ef, B:246:0x07fa, B:247:0x0814, B:249:0x081a, B:251:0x0834, B:253:0x0840, B:255:0x084d, B:262:0x0882, B:266:0x088c, B:267:0x088f, B:269:0x089c, B:270:0x089f, B:281:0x08e3, B:260:0x086e, B:240:0x07e9, B:204:0x074a, B:208:0x0757, B:212:0x0765, B:216:0x0773, B:220:0x0781, B:224:0x078f, B:228:0x079b, B:232:0x07a9, B:162:0x0657, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:393:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x0501 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05bc, B:156:0x05e6, B:160:0x0636, B:163:0x0664, B:165:0x0691, B:166:0x0694, B:168:0x069a, B:170:0x06a2, B:172:0x06a8, B:174:0x06b0, B:176:0x06b6, B:180:0x06c5, B:183:0x06d4, B:185:0x06dd, B:187:0x06e5, B:190:0x0716, B:192:0x071f, B:196:0x0734, B:201:0x0741, B:236:0x07bc, B:237:0x07c3, B:239:0x07e6, B:242:0x07ef, B:246:0x07fa, B:247:0x0814, B:249:0x081a, B:251:0x0834, B:253:0x0840, B:255:0x084d, B:262:0x0882, B:266:0x088c, B:267:0x088f, B:269:0x089c, B:270:0x089f, B:281:0x08e3, B:260:0x086e, B:240:0x07e9, B:204:0x074a, B:208:0x0757, B:212:0x0765, B:216:0x0773, B:220:0x0781, B:224:0x078f, B:228:0x079b, B:232:0x07a9, B:162:0x0657, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:393:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x057a A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05bc, B:156:0x05e6, B:160:0x0636, B:163:0x0664, B:165:0x0691, B:166:0x0694, B:168:0x069a, B:170:0x06a2, B:172:0x06a8, B:174:0x06b0, B:176:0x06b6, B:180:0x06c5, B:183:0x06d4, B:185:0x06dd, B:187:0x06e5, B:190:0x0716, B:192:0x071f, B:196:0x0734, B:201:0x0741, B:236:0x07bc, B:237:0x07c3, B:239:0x07e6, B:242:0x07ef, B:246:0x07fa, B:247:0x0814, B:249:0x081a, B:251:0x0834, B:253:0x0840, B:255:0x084d, B:262:0x0882, B:266:0x088c, B:267:0x088f, B:269:0x089c, B:270:0x089f, B:281:0x08e3, B:260:0x086e, B:240:0x07e9, B:204:0x074a, B:208:0x0757, B:212:0x0765, B:216:0x0773, B:220:0x0781, B:224:0x078f, B:228:0x079b, B:232:0x07a9, B:162:0x0657, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:393:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x05bc A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05bc, B:156:0x05e6, B:160:0x0636, B:163:0x0664, B:165:0x0691, B:166:0x0694, B:168:0x069a, B:170:0x06a2, B:172:0x06a8, B:174:0x06b0, B:176:0x06b6, B:180:0x06c5, B:183:0x06d4, B:185:0x06dd, B:187:0x06e5, B:190:0x0716, B:192:0x071f, B:196:0x0734, B:201:0x0741, B:236:0x07bc, B:237:0x07c3, B:239:0x07e6, B:242:0x07ef, B:246:0x07fa, B:247:0x0814, B:249:0x081a, B:251:0x0834, B:253:0x0840, B:255:0x084d, B:262:0x0882, B:266:0x088c, B:267:0x088f, B:269:0x089c, B:270:0x089f, B:281:0x08e3, B:260:0x086e, B:240:0x07e9, B:204:0x074a, B:208:0x0757, B:212:0x0765, B:216:0x0773, B:220:0x0781, B:224:0x078f, B:228:0x079b, B:232:0x07a9, B:162:0x0657, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:393:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:155:0x05e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:162:0x0657 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05bc, B:156:0x05e6, B:160:0x0636, B:163:0x0664, B:165:0x0691, B:166:0x0694, B:168:0x069a, B:170:0x06a2, B:172:0x06a8, B:174:0x06b0, B:176:0x06b6, B:180:0x06c5, B:183:0x06d4, B:185:0x06dd, B:187:0x06e5, B:190:0x0716, B:192:0x071f, B:196:0x0734, B:201:0x0741, B:236:0x07bc, B:237:0x07c3, B:239:0x07e6, B:242:0x07ef, B:246:0x07fa, B:247:0x0814, B:249:0x081a, B:251:0x0834, B:253:0x0840, B:255:0x084d, B:262:0x0882, B:266:0x088c, B:267:0x088f, B:269:0x089c, B:270:0x089f, B:281:0x08e3, B:260:0x086e, B:240:0x07e9, B:204:0x074a, B:208:0x0757, B:212:0x0765, B:216:0x0773, B:220:0x0781, B:224:0x078f, B:228:0x079b, B:232:0x07a9, B:162:0x0657, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:393:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x0691 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05bc, B:156:0x05e6, B:160:0x0636, B:163:0x0664, B:165:0x0691, B:166:0x0694, B:168:0x069a, B:170:0x06a2, B:172:0x06a8, B:174:0x06b0, B:176:0x06b6, B:180:0x06c5, B:183:0x06d4, B:185:0x06dd, B:187:0x06e5, B:190:0x0716, B:192:0x071f, B:196:0x0734, B:201:0x0741, B:236:0x07bc, B:237:0x07c3, B:239:0x07e6, B:242:0x07ef, B:246:0x07fa, B:247:0x0814, B:249:0x081a, B:251:0x0834, B:253:0x0840, B:255:0x084d, B:262:0x0882, B:266:0x088c, B:267:0x088f, B:269:0x089c, B:270:0x089f, B:281:0x08e3, B:260:0x086e, B:240:0x07e9, B:204:0x074a, B:208:0x0757, B:212:0x0765, B:216:0x0773, B:220:0x0781, B:224:0x078f, B:228:0x079b, B:232:0x07a9, B:162:0x0657, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:393:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:168:0x069a A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05bc, B:156:0x05e6, B:160:0x0636, B:163:0x0664, B:165:0x0691, B:166:0x0694, B:168:0x069a, B:170:0x06a2, B:172:0x06a8, B:174:0x06b0, B:176:0x06b6, B:180:0x06c5, B:183:0x06d4, B:185:0x06dd, B:187:0x06e5, B:190:0x0716, B:192:0x071f, B:196:0x0734, B:201:0x0741, B:236:0x07bc, B:237:0x07c3, B:239:0x07e6, B:242:0x07ef, B:246:0x07fa, B:247:0x0814, B:249:0x081a, B:251:0x0834, B:253:0x0840, B:255:0x084d, B:262:0x0882, B:266:0x088c, B:267:0x088f, B:269:0x089c, B:270:0x089f, B:281:0x08e3, B:260:0x086e, B:240:0x07e9, B:204:0x074a, B:208:0x0757, B:212:0x0765, B:216:0x0773, B:220:0x0781, B:224:0x078f, B:228:0x079b, B:232:0x07a9, B:162:0x0657, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:393:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:169:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:172:0x06a8 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05bc, B:156:0x05e6, B:160:0x0636, B:163:0x0664, B:165:0x0691, B:166:0x0694, B:168:0x069a, B:170:0x06a2, B:172:0x06a8, B:174:0x06b0, B:176:0x06b6, B:180:0x06c5, B:183:0x06d4, B:185:0x06dd, B:187:0x06e5, B:190:0x0716, B:192:0x071f, B:196:0x0734, B:201:0x0741, B:236:0x07bc, B:237:0x07c3, B:239:0x07e6, B:242:0x07ef, B:246:0x07fa, B:247:0x0814, B:249:0x081a, B:251:0x0834, B:253:0x0840, B:255:0x084d, B:262:0x0882, B:266:0x088c, B:267:0x088f, B:269:0x089c, B:270:0x089f, B:281:0x08e3, B:260:0x086e, B:240:0x07e9, B:204:0x074a, B:208:0x0757, B:212:0x0765, B:216:0x0773, B:220:0x0781, B:224:0x078f, B:228:0x079b, B:232:0x07a9, B:162:0x0657, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:393:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:173:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:176:0x06b6 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05bc, B:156:0x05e6, B:160:0x0636, B:163:0x0664, B:165:0x0691, B:166:0x0694, B:168:0x069a, B:170:0x06a2, B:172:0x06a8, B:174:0x06b0, B:176:0x06b6, B:180:0x06c5, B:183:0x06d4, B:185:0x06dd, B:187:0x06e5, B:190:0x0716, B:192:0x071f, B:196:0x0734, B:201:0x0741, B:236:0x07bc, B:237:0x07c3, B:239:0x07e6, B:242:0x07ef, B:246:0x07fa, B:247:0x0814, B:249:0x081a, B:251:0x0834, B:253:0x0840, B:255:0x084d, B:262:0x0882, B:266:0x088c, B:267:0x088f, B:269:0x089c, B:270:0x089f, B:281:0x08e3, B:260:0x086e, B:240:0x07e9, B:204:0x074a, B:208:0x0757, B:212:0x0765, B:216:0x0773, B:220:0x0781, B:224:0x078f, B:228:0x079b, B:232:0x07a9, B:162:0x0657, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:393:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:180:0x06c5 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05bc, B:156:0x05e6, B:160:0x0636, B:163:0x0664, B:165:0x0691, B:166:0x0694, B:168:0x069a, B:170:0x06a2, B:172:0x06a8, B:174:0x06b0, B:176:0x06b6, B:180:0x06c5, B:183:0x06d4, B:185:0x06dd, B:187:0x06e5, B:190:0x0716, B:192:0x071f, B:196:0x0734, B:201:0x0741, B:236:0x07bc, B:237:0x07c3, B:239:0x07e6, B:242:0x07ef, B:246:0x07fa, B:247:0x0814, B:249:0x081a, B:251:0x0834, B:253:0x0840, B:255:0x084d, B:262:0x0882, B:266:0x088c, B:267:0x088f, B:269:0x089c, B:270:0x089f, B:281:0x08e3, B:260:0x086e, B:240:0x07e9, B:204:0x074a, B:208:0x0757, B:212:0x0765, B:216:0x0773, B:220:0x0781, B:224:0x078f, B:228:0x079b, B:232:0x07a9, B:162:0x0657, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:393:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:182:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:185:0x06dd A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05bc, B:156:0x05e6, B:160:0x0636, B:163:0x0664, B:165:0x0691, B:166:0x0694, B:168:0x069a, B:170:0x06a2, B:172:0x06a8, B:174:0x06b0, B:176:0x06b6, B:180:0x06c5, B:183:0x06d4, B:185:0x06dd, B:187:0x06e5, B:190:0x0716, B:192:0x071f, B:196:0x0734, B:201:0x0741, B:236:0x07bc, B:237:0x07c3, B:239:0x07e6, B:242:0x07ef, B:246:0x07fa, B:247:0x0814, B:249:0x081a, B:251:0x0834, B:253:0x0840, B:255:0x084d, B:262:0x0882, B:266:0x088c, B:267:0x088f, B:269:0x089c, B:270:0x089f, B:281:0x08e3, B:260:0x086e, B:240:0x07e9, B:204:0x074a, B:208:0x0757, B:212:0x0765, B:216:0x0773, B:220:0x0781, B:224:0x078f, B:228:0x079b, B:232:0x07a9, B:162:0x0657, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:393:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:186:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:190:0x0716 A[Catch: all -> 0x01eb, TRY_ENTER, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05bc, B:156:0x05e6, B:160:0x0636, B:163:0x0664, B:165:0x0691, B:166:0x0694, B:168:0x069a, B:170:0x06a2, B:172:0x06a8, B:174:0x06b0, B:176:0x06b6, B:180:0x06c5, B:183:0x06d4, B:185:0x06dd, B:187:0x06e5, B:190:0x0716, B:192:0x071f, B:196:0x0734, B:201:0x0741, B:236:0x07bc, B:237:0x07c3, B:239:0x07e6, B:242:0x07ef, B:246:0x07fa, B:247:0x0814, B:249:0x081a, B:251:0x0834, B:253:0x0840, B:255:0x084d, B:262:0x0882, B:266:0x088c, B:267:0x088f, B:269:0x089c, B:270:0x089f, B:281:0x08e3, B:260:0x086e, B:240:0x07e9, B:204:0x074a, B:208:0x0757, B:212:0x0765, B:216:0x0773, B:220:0x0781, B:224:0x078f, B:228:0x079b, B:232:0x07a9, B:162:0x0657, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:393:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x071f A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05bc, B:156:0x05e6, B:160:0x0636, B:163:0x0664, B:165:0x0691, B:166:0x0694, B:168:0x069a, B:170:0x06a2, B:172:0x06a8, B:174:0x06b0, B:176:0x06b6, B:180:0x06c5, B:183:0x06d4, B:185:0x06dd, B:187:0x06e5, B:190:0x0716, B:192:0x071f, B:196:0x0734, B:201:0x0741, B:236:0x07bc, B:237:0x07c3, B:239:0x07e6, B:242:0x07ef, B:246:0x07fa, B:247:0x0814, B:249:0x081a, B:251:0x0834, B:253:0x0840, B:255:0x084d, B:262:0x0882, B:266:0x088c, B:267:0x088f, B:269:0x089c, B:270:0x089f, B:281:0x08e3, B:260:0x086e, B:240:0x07e9, B:204:0x074a, B:208:0x0757, B:212:0x0765, B:216:0x0773, B:220:0x0781, B:224:0x078f, B:228:0x079b, B:232:0x07a9, B:162:0x0657, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:393:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:194:0x0730  */
    /* JADX WARN: Code duplicated, block: B:199:0x073e  */
    /* JADX WARN: Code duplicated, block: B:200:0x0740  */
    /* JADX WARN: Code duplicated, block: B:203:0x0748  */
    /* JADX WARN: Code duplicated, block: B:204:0x074a A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05bc, B:156:0x05e6, B:160:0x0636, B:163:0x0664, B:165:0x0691, B:166:0x0694, B:168:0x069a, B:170:0x06a2, B:172:0x06a8, B:174:0x06b0, B:176:0x06b6, B:180:0x06c5, B:183:0x06d4, B:185:0x06dd, B:187:0x06e5, B:190:0x0716, B:192:0x071f, B:196:0x0734, B:201:0x0741, B:236:0x07bc, B:237:0x07c3, B:239:0x07e6, B:242:0x07ef, B:246:0x07fa, B:247:0x0814, B:249:0x081a, B:251:0x0834, B:253:0x0840, B:255:0x084d, B:262:0x0882, B:266:0x088c, B:267:0x088f, B:269:0x089c, B:270:0x089f, B:281:0x08e3, B:260:0x086e, B:240:0x07e9, B:204:0x074a, B:208:0x0757, B:212:0x0765, B:216:0x0773, B:220:0x0781, B:224:0x078f, B:228:0x079b, B:232:0x07a9, B:162:0x0657, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:393:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:206:0x0754  */
    /* JADX WARN: Code duplicated, block: B:207:0x0756  */
    /* JADX WARN: Code duplicated, block: B:210:0x0762  */
    /* JADX WARN: Code duplicated, block: B:211:0x0764  */
    /* JADX WARN: Code duplicated, block: B:214:0x0770  */
    /* JADX WARN: Code duplicated, block: B:215:0x0772  */
    /* JADX WARN: Code duplicated, block: B:218:0x077e  */
    /* JADX WARN: Code duplicated, block: B:219:0x0780  */
    /* JADX WARN: Code duplicated, block: B:222:0x078c  */
    /* JADX WARN: Code duplicated, block: B:223:0x078e  */
    /* JADX WARN: Code duplicated, block: B:226:0x0798  */
    /* JADX WARN: Code duplicated, block: B:227:0x079a  */
    /* JADX WARN: Code duplicated, block: B:230:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:231:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:233:0x07b6  */
    /* JADX WARN: Code duplicated, block: B:236:0x07bc A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05bc, B:156:0x05e6, B:160:0x0636, B:163:0x0664, B:165:0x0691, B:166:0x0694, B:168:0x069a, B:170:0x06a2, B:172:0x06a8, B:174:0x06b0, B:176:0x06b6, B:180:0x06c5, B:183:0x06d4, B:185:0x06dd, B:187:0x06e5, B:190:0x0716, B:192:0x071f, B:196:0x0734, B:201:0x0741, B:236:0x07bc, B:237:0x07c3, B:239:0x07e6, B:242:0x07ef, B:246:0x07fa, B:247:0x0814, B:249:0x081a, B:251:0x0834, B:253:0x0840, B:255:0x084d, B:262:0x0882, B:266:0x088c, B:267:0x088f, B:269:0x089c, B:270:0x089f, B:281:0x08e3, B:260:0x086e, B:240:0x07e9, B:204:0x074a, B:208:0x0757, B:212:0x0765, B:216:0x0773, B:220:0x0781, B:224:0x078f, B:228:0x079b, B:232:0x07a9, B:162:0x0657, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:393:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:239:0x07e6 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05bc, B:156:0x05e6, B:160:0x0636, B:163:0x0664, B:165:0x0691, B:166:0x0694, B:168:0x069a, B:170:0x06a2, B:172:0x06a8, B:174:0x06b0, B:176:0x06b6, B:180:0x06c5, B:183:0x06d4, B:185:0x06dd, B:187:0x06e5, B:190:0x0716, B:192:0x071f, B:196:0x0734, B:201:0x0741, B:236:0x07bc, B:237:0x07c3, B:239:0x07e6, B:242:0x07ef, B:246:0x07fa, B:247:0x0814, B:249:0x081a, B:251:0x0834, B:253:0x0840, B:255:0x084d, B:262:0x0882, B:266:0x088c, B:267:0x088f, B:269:0x089c, B:270:0x089f, B:281:0x08e3, B:260:0x086e, B:240:0x07e9, B:204:0x074a, B:208:0x0757, B:212:0x0765, B:216:0x0773, B:220:0x0781, B:224:0x078f, B:228:0x079b, B:232:0x07a9, B:162:0x0657, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:393:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:240:0x07e9 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05bc, B:156:0x05e6, B:160:0x0636, B:163:0x0664, B:165:0x0691, B:166:0x0694, B:168:0x069a, B:170:0x06a2, B:172:0x06a8, B:174:0x06b0, B:176:0x06b6, B:180:0x06c5, B:183:0x06d4, B:185:0x06dd, B:187:0x06e5, B:190:0x0716, B:192:0x071f, B:196:0x0734, B:201:0x0741, B:236:0x07bc, B:237:0x07c3, B:239:0x07e6, B:242:0x07ef, B:246:0x07fa, B:247:0x0814, B:249:0x081a, B:251:0x0834, B:253:0x0840, B:255:0x084d, B:262:0x0882, B:266:0x088c, B:267:0x088f, B:269:0x089c, B:270:0x089f, B:281:0x08e3, B:260:0x086e, B:240:0x07e9, B:204:0x074a, B:208:0x0757, B:212:0x0765, B:216:0x0773, B:220:0x0781, B:224:0x078f, B:228:0x079b, B:232:0x07a9, B:162:0x0657, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:393:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:242:0x07ef A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05bc, B:156:0x05e6, B:160:0x0636, B:163:0x0664, B:165:0x0691, B:166:0x0694, B:168:0x069a, B:170:0x06a2, B:172:0x06a8, B:174:0x06b0, B:176:0x06b6, B:180:0x06c5, B:183:0x06d4, B:185:0x06dd, B:187:0x06e5, B:190:0x0716, B:192:0x071f, B:196:0x0734, B:201:0x0741, B:236:0x07bc, B:237:0x07c3, B:239:0x07e6, B:242:0x07ef, B:246:0x07fa, B:247:0x0814, B:249:0x081a, B:251:0x0834, B:253:0x0840, B:255:0x084d, B:262:0x0882, B:266:0x088c, B:267:0x088f, B:269:0x089c, B:270:0x089f, B:281:0x08e3, B:260:0x086e, B:240:0x07e9, B:204:0x074a, B:208:0x0757, B:212:0x0765, B:216:0x0773, B:220:0x0781, B:224:0x078f, B:228:0x079b, B:232:0x07a9, B:162:0x0657, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:393:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:244:0x07f5  */
    /* JADX WARN: Code duplicated, block: B:266:0x088c A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05bc, B:156:0x05e6, B:160:0x0636, B:163:0x0664, B:165:0x0691, B:166:0x0694, B:168:0x069a, B:170:0x06a2, B:172:0x06a8, B:174:0x06b0, B:176:0x06b6, B:180:0x06c5, B:183:0x06d4, B:185:0x06dd, B:187:0x06e5, B:190:0x0716, B:192:0x071f, B:196:0x0734, B:201:0x0741, B:236:0x07bc, B:237:0x07c3, B:239:0x07e6, B:242:0x07ef, B:246:0x07fa, B:247:0x0814, B:249:0x081a, B:251:0x0834, B:253:0x0840, B:255:0x084d, B:262:0x0882, B:266:0x088c, B:267:0x088f, B:269:0x089c, B:270:0x089f, B:281:0x08e3, B:260:0x086e, B:240:0x07e9, B:204:0x074a, B:208:0x0757, B:212:0x0765, B:216:0x0773, B:220:0x0781, B:224:0x078f, B:228:0x079b, B:232:0x07a9, B:162:0x0657, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:393:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:269:0x089c A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05bc, B:156:0x05e6, B:160:0x0636, B:163:0x0664, B:165:0x0691, B:166:0x0694, B:168:0x069a, B:170:0x06a2, B:172:0x06a8, B:174:0x06b0, B:176:0x06b6, B:180:0x06c5, B:183:0x06d4, B:185:0x06dd, B:187:0x06e5, B:190:0x0716, B:192:0x071f, B:196:0x0734, B:201:0x0741, B:236:0x07bc, B:237:0x07c3, B:239:0x07e6, B:242:0x07ef, B:246:0x07fa, B:247:0x0814, B:249:0x081a, B:251:0x0834, B:253:0x0840, B:255:0x084d, B:262:0x0882, B:266:0x088c, B:267:0x088f, B:269:0x089c, B:270:0x089f, B:281:0x08e3, B:260:0x086e, B:240:0x07e9, B:204:0x074a, B:208:0x0757, B:212:0x0765, B:216:0x0773, B:220:0x0781, B:224:0x078f, B:228:0x079b, B:232:0x07a9, B:162:0x0657, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:393:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:272:0x08b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:300:0x096b  */
    /* JADX WARN: Code duplicated, block: B:303:0x09b0 A[Catch: all -> 0x0944, TryCatch #2 {all -> 0x0944, blocks: (B:273:0x08b5, B:275:0x08c0, B:277:0x08ce, B:279:0x08d8, B:282:0x08ec, B:284:0x08f6, B:286:0x0902, B:288:0x090c, B:290:0x091a, B:292:0x0932, B:296:0x094b, B:298:0x0959, B:299:0x0962, B:301:0x096d, B:303:0x09b0, B:306:0x09bb, B:307:0x09c5, B:308:0x09c6, B:310:0x09d0, B:276:0x08c5), top: B:386:0x08b5 }] */
    /* JADX WARN: Code duplicated, block: B:305:0x09ba  */
    /* JADX WARN: Code duplicated, block: B:306:0x09bb A[Catch: all -> 0x0944, TryCatch #2 {all -> 0x0944, blocks: (B:273:0x08b5, B:275:0x08c0, B:277:0x08ce, B:279:0x08d8, B:282:0x08ec, B:284:0x08f6, B:286:0x0902, B:288:0x090c, B:290:0x091a, B:292:0x0932, B:296:0x094b, B:298:0x0959, B:299:0x0962, B:301:0x096d, B:303:0x09b0, B:306:0x09bb, B:307:0x09c5, B:308:0x09c6, B:310:0x09d0, B:276:0x08c5), top: B:386:0x08b5 }] */
    /* JADX WARN: Code duplicated, block: B:310:0x09d0 A[Catch: all -> 0x0944, TRY_LEAVE, TryCatch #2 {all -> 0x0944, blocks: (B:273:0x08b5, B:275:0x08c0, B:277:0x08ce, B:279:0x08d8, B:282:0x08ec, B:284:0x08f6, B:286:0x0902, B:288:0x090c, B:290:0x091a, B:292:0x0932, B:296:0x094b, B:298:0x0959, B:299:0x0962, B:301:0x096d, B:303:0x09b0, B:306:0x09bb, B:307:0x09c5, B:308:0x09c6, B:310:0x09d0, B:276:0x08c5), top: B:386:0x08b5 }] */
    /* JADX WARN: Code duplicated, block: B:314:0x09f0 A[Catch: all -> 0x09fe, TryCatch #7 {all -> 0x09fe, blocks: (B:312:0x09d9, B:314:0x09f0, B:318:0x0a01, B:320:0x0a39, B:322:0x0a41, B:324:0x0a4b, B:325:0x0a55, B:327:0x0a5f, B:328:0x0a69, B:329:0x0a72, B:331:0x0a78, B:333:0x0ac2, B:335:0x0ad4, B:339:0x0af3, B:341:0x0b03, B:338:0x0ae3, B:345:0x0b16, B:346:0x0b58, B:347:0x0b63, B:348:0x0b76, B:350:0x0b7c, B:359:0x0bc3, B:360:0x0c0b, B:362:0x0c1c, B:376:0x0c83, B:367:0x0c36, B:368:0x0c39, B:353:0x0b8a, B:355:0x0bb0, B:373:0x0c54, B:374:0x0c6d, B:375:0x0c6e), top: B:394:0x09d9, inners: #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:319:0x0a36  */
    /* JADX WARN: Code duplicated, block: B:322:0x0a41 A[Catch: all -> 0x09fe, TryCatch #7 {all -> 0x09fe, blocks: (B:312:0x09d9, B:314:0x09f0, B:318:0x0a01, B:320:0x0a39, B:322:0x0a41, B:324:0x0a4b, B:325:0x0a55, B:327:0x0a5f, B:328:0x0a69, B:329:0x0a72, B:331:0x0a78, B:333:0x0ac2, B:335:0x0ad4, B:339:0x0af3, B:341:0x0b03, B:338:0x0ae3, B:345:0x0b16, B:346:0x0b58, B:347:0x0b63, B:348:0x0b76, B:350:0x0b7c, B:359:0x0bc3, B:360:0x0c0b, B:362:0x0c1c, B:376:0x0c83, B:367:0x0c36, B:368:0x0c39, B:353:0x0b8a, B:355:0x0bb0, B:373:0x0c54, B:374:0x0c6d, B:375:0x0c6e), top: B:394:0x09d9, inners: #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:327:0x0a5f A[Catch: all -> 0x09fe, TryCatch #7 {all -> 0x09fe, blocks: (B:312:0x09d9, B:314:0x09f0, B:318:0x0a01, B:320:0x0a39, B:322:0x0a41, B:324:0x0a4b, B:325:0x0a55, B:327:0x0a5f, B:328:0x0a69, B:329:0x0a72, B:331:0x0a78, B:333:0x0ac2, B:335:0x0ad4, B:339:0x0af3, B:341:0x0b03, B:338:0x0ae3, B:345:0x0b16, B:346:0x0b58, B:347:0x0b63, B:348:0x0b76, B:350:0x0b7c, B:359:0x0bc3, B:360:0x0c0b, B:362:0x0c1c, B:376:0x0c83, B:367:0x0c36, B:368:0x0c39, B:353:0x0b8a, B:355:0x0bb0, B:373:0x0c54, B:374:0x0c6d, B:375:0x0c6e), top: B:394:0x09d9, inners: #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:331:0x0a78 A[Catch: all -> 0x09fe, TryCatch #7 {all -> 0x09fe, blocks: (B:312:0x09d9, B:314:0x09f0, B:318:0x0a01, B:320:0x0a39, B:322:0x0a41, B:324:0x0a4b, B:325:0x0a55, B:327:0x0a5f, B:328:0x0a69, B:329:0x0a72, B:331:0x0a78, B:333:0x0ac2, B:335:0x0ad4, B:339:0x0af3, B:341:0x0b03, B:338:0x0ae3, B:345:0x0b16, B:346:0x0b58, B:347:0x0b63, B:348:0x0b76, B:350:0x0b7c, B:359:0x0bc3, B:360:0x0c0b, B:362:0x0c1c, B:376:0x0c83, B:367:0x0c36, B:368:0x0c39, B:353:0x0b8a, B:355:0x0bb0, B:373:0x0c54, B:374:0x0c6d, B:375:0x0c6e), top: B:394:0x09d9, inners: #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:333:0x0ac2 A[Catch: all -> 0x09fe, TryCatch #7 {all -> 0x09fe, blocks: (B:312:0x09d9, B:314:0x09f0, B:318:0x0a01, B:320:0x0a39, B:322:0x0a41, B:324:0x0a4b, B:325:0x0a55, B:327:0x0a5f, B:328:0x0a69, B:329:0x0a72, B:331:0x0a78, B:333:0x0ac2, B:335:0x0ad4, B:339:0x0af3, B:341:0x0b03, B:338:0x0ae3, B:345:0x0b16, B:346:0x0b58, B:347:0x0b63, B:348:0x0b76, B:350:0x0b7c, B:359:0x0bc3, B:360:0x0c0b, B:362:0x0c1c, B:376:0x0c83, B:367:0x0c36, B:368:0x0c39, B:353:0x0b8a, B:355:0x0bb0, B:373:0x0c54, B:374:0x0c6d, B:375:0x0c6e), top: B:394:0x09d9, inners: #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:335:0x0ad4 A[Catch: all -> 0x09fe, TryCatch #7 {all -> 0x09fe, blocks: (B:312:0x09d9, B:314:0x09f0, B:318:0x0a01, B:320:0x0a39, B:322:0x0a41, B:324:0x0a4b, B:325:0x0a55, B:327:0x0a5f, B:328:0x0a69, B:329:0x0a72, B:331:0x0a78, B:333:0x0ac2, B:335:0x0ad4, B:339:0x0af3, B:341:0x0b03, B:338:0x0ae3, B:345:0x0b16, B:346:0x0b58, B:347:0x0b63, B:348:0x0b76, B:350:0x0b7c, B:359:0x0bc3, B:360:0x0c0b, B:362:0x0c1c, B:376:0x0c83, B:367:0x0c36, B:368:0x0c39, B:353:0x0b8a, B:355:0x0bb0, B:373:0x0c54, B:374:0x0c6d, B:375:0x0c6e), top: B:394:0x09d9, inners: #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:337:0x0ade  */
    /* JADX WARN: Code duplicated, block: B:338:0x0ae3 A[Catch: all -> 0x09fe, TryCatch #7 {all -> 0x09fe, blocks: (B:312:0x09d9, B:314:0x09f0, B:318:0x0a01, B:320:0x0a39, B:322:0x0a41, B:324:0x0a4b, B:325:0x0a55, B:327:0x0a5f, B:328:0x0a69, B:329:0x0a72, B:331:0x0a78, B:333:0x0ac2, B:335:0x0ad4, B:339:0x0af3, B:341:0x0b03, B:338:0x0ae3, B:345:0x0b16, B:346:0x0b58, B:347:0x0b63, B:348:0x0b76, B:350:0x0b7c, B:359:0x0bc3, B:360:0x0c0b, B:362:0x0c1c, B:376:0x0c83, B:367:0x0c36, B:368:0x0c39, B:353:0x0b8a, B:355:0x0bb0, B:373:0x0c54, B:374:0x0c6d, B:375:0x0c6e), top: B:394:0x09d9, inners: #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:341:0x0b03 A[Catch: all -> 0x09fe, TRY_LEAVE, TryCatch #7 {all -> 0x09fe, blocks: (B:312:0x09d9, B:314:0x09f0, B:318:0x0a01, B:320:0x0a39, B:322:0x0a41, B:324:0x0a4b, B:325:0x0a55, B:327:0x0a5f, B:328:0x0a69, B:329:0x0a72, B:331:0x0a78, B:333:0x0ac2, B:335:0x0ad4, B:339:0x0af3, B:341:0x0b03, B:338:0x0ae3, B:345:0x0b16, B:346:0x0b58, B:347:0x0b63, B:348:0x0b76, B:350:0x0b7c, B:359:0x0bc3, B:360:0x0c0b, B:362:0x0c1c, B:376:0x0c83, B:367:0x0c36, B:368:0x0c39, B:353:0x0b8a, B:355:0x0bb0, B:373:0x0c54, B:374:0x0c6d, B:375:0x0c6e), top: B:394:0x09d9, inners: #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:343:0x0b0e  */
    /* JADX WARN: Code duplicated, block: B:350:0x0b7c A[Catch: all -> 0x09fe, TryCatch #7 {all -> 0x09fe, blocks: (B:312:0x09d9, B:314:0x09f0, B:318:0x0a01, B:320:0x0a39, B:322:0x0a41, B:324:0x0a4b, B:325:0x0a55, B:327:0x0a5f, B:328:0x0a69, B:329:0x0a72, B:331:0x0a78, B:333:0x0ac2, B:335:0x0ad4, B:339:0x0af3, B:341:0x0b03, B:338:0x0ae3, B:345:0x0b16, B:346:0x0b58, B:347:0x0b63, B:348:0x0b76, B:350:0x0b7c, B:359:0x0bc3, B:360:0x0c0b, B:362:0x0c1c, B:376:0x0c83, B:367:0x0c36, B:368:0x0c39, B:353:0x0b8a, B:355:0x0bb0, B:373:0x0c54, B:374:0x0c6d, B:375:0x0c6e), top: B:394:0x09d9, inners: #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:355:0x0bb0 A[Catch: all -> 0x09fe, TryCatch #7 {all -> 0x09fe, blocks: (B:312:0x09d9, B:314:0x09f0, B:318:0x0a01, B:320:0x0a39, B:322:0x0a41, B:324:0x0a4b, B:325:0x0a55, B:327:0x0a5f, B:328:0x0a69, B:329:0x0a72, B:331:0x0a78, B:333:0x0ac2, B:335:0x0ad4, B:339:0x0af3, B:341:0x0b03, B:338:0x0ae3, B:345:0x0b16, B:346:0x0b58, B:347:0x0b63, B:348:0x0b76, B:350:0x0b7c, B:359:0x0bc3, B:360:0x0c0b, B:362:0x0c1c, B:376:0x0c83, B:367:0x0c36, B:368:0x0c39, B:353:0x0b8a, B:355:0x0bb0, B:373:0x0c54, B:374:0x0c6d, B:375:0x0c6e), top: B:394:0x09d9, inners: #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:362:0x0c1c A[Catch: all -> 0x09fe, SQLiteException -> 0x0c32, TRY_LEAVE, TryCatch #5 {SQLiteException -> 0x0c32, blocks: (B:360:0x0c0b, B:362:0x0c1c), top: B:391:0x0c0b, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:366:0x0c34  */
    /* JADX WARN: Code duplicated, block: B:382:0x0519 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:0x0b10 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:414:0x0b8a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:415:0x0b88 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:416:? A[LOOP:3: B:348:0x0b76->B:416:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:418:0x03a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:419:0x039e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0338 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05bc, B:156:0x05e6, B:160:0x0636, B:163:0x0664, B:165:0x0691, B:166:0x0694, B:168:0x069a, B:170:0x06a2, B:172:0x06a8, B:174:0x06b0, B:176:0x06b6, B:180:0x06c5, B:183:0x06d4, B:185:0x06dd, B:187:0x06e5, B:190:0x0716, B:192:0x071f, B:196:0x0734, B:201:0x0741, B:236:0x07bc, B:237:0x07c3, B:239:0x07e6, B:242:0x07ef, B:246:0x07fa, B:247:0x0814, B:249:0x081a, B:251:0x0834, B:253:0x0840, B:255:0x084d, B:262:0x0882, B:266:0x088c, B:267:0x088f, B:269:0x089c, B:270:0x089f, B:281:0x08e3, B:260:0x086e, B:240:0x07e9, B:204:0x074a, B:208:0x0757, B:212:0x0765, B:216:0x0773, B:220:0x0781, B:224:0x078f, B:228:0x079b, B:232:0x07a9, B:162:0x0657, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:393:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0379  */
    /* JADX WARN: Code duplicated, block: B:95:0x037e A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05bc, B:156:0x05e6, B:160:0x0636, B:163:0x0664, B:165:0x0691, B:166:0x0694, B:168:0x069a, B:170:0x06a2, B:172:0x06a8, B:174:0x06b0, B:176:0x06b6, B:180:0x06c5, B:183:0x06d4, B:185:0x06dd, B:187:0x06e5, B:190:0x0716, B:192:0x071f, B:196:0x0734, B:201:0x0741, B:236:0x07bc, B:237:0x07c3, B:239:0x07e6, B:242:0x07ef, B:246:0x07fa, B:247:0x0814, B:249:0x081a, B:251:0x0834, B:253:0x0840, B:255:0x084d, B:262:0x0882, B:266:0x088c, B:267:0x088f, B:269:0x089c, B:270:0x089f, B:281:0x08e3, B:260:0x086e, B:240:0x07e9, B:204:0x074a, B:208:0x0757, B:212:0x0765, B:216:0x0773, B:220:0x0781, B:224:0x078f, B:228:0x079b, B:232:0x07a9, B:162:0x0657, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:393:0x01cc, inners: #1, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0390 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05bc, B:156:0x05e6, B:160:0x0636, B:163:0x0664, B:165:0x0691, B:166:0x0694, B:168:0x069a, B:170:0x06a2, B:172:0x06a8, B:174:0x06b0, B:176:0x06b6, B:180:0x06c5, B:183:0x06d4, B:185:0x06dd, B:187:0x06e5, B:190:0x0716, B:192:0x071f, B:196:0x0734, B:201:0x0741, B:236:0x07bc, B:237:0x07c3, B:239:0x07e6, B:242:0x07ef, B:246:0x07fa, B:247:0x0814, B:249:0x081a, B:251:0x0834, B:253:0x0840, B:255:0x084d, B:262:0x0882, B:266:0x088c, B:267:0x088f, B:269:0x089c, B:270:0x089f, B:281:0x08e3, B:260:0x086e, B:240:0x07e9, B:204:0x074a, B:208:0x0757, B:212:0x0765, B:216:0x0773, B:220:0x0781, B:224:0x078f, B:228:0x079b, B:232:0x07a9, B:162:0x0657, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:393:0x01cc, inners: #1, #8, #9 }] */
    public final void l(u uVar, t4 t4Var) throws Throwable {
        m4 m4Var;
        String str;
        String str2;
        String str3;
        long jRound;
        String str4;
        m mVarF0;
        int iZ;
        p4 p4Var;
        p4 p4Var2;
        j4 j4Var;
        boolean zP0;
        boolean zEquals;
        Iterator<String> it;
        long length;
        Object objB;
        String str5;
        j jVarW0;
        long jIntValue;
        String str6;
        Bundle bundleF;
        m mVarF1;
        long jDelete;
        r1 r1Var;
        q qVar;
        String str7;
        r rVarP;
        r rVarA;
        q qVar2;
        com.gamericefishpro.space.i9.h3 h3VarU;
        String str8;
        String str9;
        String str10;
        long j;
        String str11;
        String str12;
        String str13;
        e2 e2VarJ;
        boolean zB;
        d2 d2Var;
        long j2;
        com.gamericefishpro.space.i9.d4 d4VarA;
        Map mapB;
        String str14;
        ArrayList arrayList;
        e2 e2VarJ2;
        a1 a1VarT0;
        int i;
        List listM0;
        int i2;
        m mVarF2;
        m mVarF3;
        Iterator<String> it2;
        boolean zH;
        int i3;
        String str15;
        ContentValues contentValues;
        String str16;
        z0 z0VarI0;
        long jC0;
        a1 a1VarT1;
        long j3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        long jH;
        g gVarD0;
        d0 d0Var;
        j4 j4Var2;
        Object obj;
        p4 p4VarL0;
        Object obj2;
        long jMax;
        long jIntValue2;
        String str17 = "events";
        com.gamericefishpro.space.v8.c0.g(t4Var);
        boolean z9 = t4Var.G;
        long j4 = t4Var.J;
        long j5 = t4Var.y;
        String str18 = t4Var.L;
        long j6 = t4Var.w;
        long j7 = t4Var.C;
        String str19 = t4Var.N;
        String str20 = t4Var.i;
        String str21 = t4Var.v;
        long j8 = j5;
        boolean z10 = t4Var.A;
        String str22 = t4Var.d;
        com.gamericefishpro.space.v8.c0.d(str22);
        long jNanoTime = System.nanoTime();
        c().r();
        k0();
        i0();
        String str23 = t4Var.e;
        if (TextUtils.isEmpty(str23)) {
            return;
        }
        if (!z10) {
            b0(t4Var);
            return;
        }
        l1 l1VarE0 = e0();
        String str24 = uVar.d;
        boolean zG = l1VarE0.G(str22, str24);
        r1 r1Var2 = this.E;
        j4 j4Var3 = this.c0;
        if (zG) {
            a().w().c("Dropping blocked event. appId", v0.z(str22), r1Var2.m().a(str24));
            if (!"1".equals(e0().b(str22, "measurement.upload.blacklist_internal")) && !"1".equals(e0().b(str22, "measurement.upload.blacklist_public"))) {
                if ("_err".equals(str24)) {
                    return;
                }
                j0();
                r4.H(j4Var3, str22, 11, "_ev", str24, 0);
                return;
            }
            a1 a1VarT2 = f0().t0(str22);
            if (a1VarT2 != null) {
                r1 r1Var3 = a1VarT2.a;
                p1 p1Var = r1Var3.z;
                r1.l(p1Var);
                p1Var.r();
                long j9 = a1VarT2.S;
                p1 p1Var2 = r1Var3.z;
                r1.l(p1Var2);
                p1Var2.r();
                long jMax2 = Math.max(j9, a1VarT2.R);
                e().getClass();
                long jAbs = Math.abs(System.currentTimeMillis() - jMax2);
                d0();
                if (jAbs > ((Long) e0.N.a(null)).longValue()) {
                    a().x().a("Fetching config for blocked app");
                    z(a1VarT2);
                    return;
                }
                return;
            }
            return;
        }
        w0 w0VarB = w0.b(uVar);
        r4 r4VarJ0 = j0();
        g gVarD1 = d0();
        gVarD1.getClass();
        r4VarJ0.A(w0VarB, Math.max(Math.min(gVarD1.z(str22, e0.X), 100), 25));
        int iMax = Math.max(Math.min(d0().z(str22, e0.g0), 35), 10);
        Bundle bundle = (Bundle) w0VarB.e;
        for (String str25 : new TreeSet(bundle.keySet())) {
            if ("items".equals(str25)) {
                j0().B(bundle.getParcelableArray(str25), iMax);
            }
        }
        u uVarC = w0VarB.c();
        t tVar = uVarC.e;
        String str26 = uVarC.d;
        if (Log.isLoggable(a().B(), 2)) {
            a().y().b(r1Var2.m().d(uVarC), "Logging event");
        }
        f0().d0();
        try {
            b0(t4Var);
            boolean z11 = "ecommerce_purchase".equals(str26) || "purchase".equals(str26) || "refund".equals(str26);
            if (!"_iap".equals(str26)) {
                if (z11) {
                    z11 = true;
                } else {
                    str3 = str21;
                    str17 = "events";
                    str = str19;
                    str4 = str22;
                    str2 = str20;
                }
                j4Var = j4Var3;
                zP0 = r4.p0(str26);
                zEquals = "_err".equals(str26);
                j0();
                if (tVar == null) {
                    length = 0;
                } else {
                    it = tVar.d.keySet().iterator();
                    length = 0;
                    while (it.hasNext()) {
                        objB = tVar.b(it.next());
                        if (objB instanceof Parcelable[]) {
                            length += (long) ((Parcelable[]) objB).length;
                        }
                    }
                }
                str5 = str4;
                jVarW0 = f0().w0(g(), str5, length + 1, true, zP0, false, zEquals, false, false, false);
                long j10 = jVarW0.b;
                d0();
                jIntValue = j10 - ((long) ((Integer) e0.l.a(null)).intValue());
                if (jIntValue <= 0) {
                    if (zP0) {
                        long j11 = jVarW0.a;
                        d0();
                        jIntValue2 = j11 - ((long) ((Integer) e0.n.a(null)).intValue());
                        if (jIntValue2 > 0) {
                            if (jIntValue2 % 1000 == 1) {
                                a().v().c("Data loss. Too many public events logged. appId, count", v0.z(str5), Long.valueOf(jVarW0.a));
                            }
                            j0();
                            r4.H(j4Var, str5, 16, "_ev", uVarC.d, 0);
                            f0().e0();
                        }
                    }
                    str6 = str5;
                    if (zEquals) {
                        jMax = jVarW0.d - ((long) Math.max(0, Math.min(1000000, d0().z(str6, e0.m))));
                        if (jMax > 0) {
                            if (jMax == 1) {
                                a().v().c("Too many error events logged. appId, count", v0.z(str6), Long.valueOf(jVarW0.d));
                            }
                            f0().e0();
                        }
                    }
                    bundleF = tVar.f();
                    r4 r4VarJ1 = j0();
                    String str27 = uVarC.i;
                    r4VarJ1.G(bundleF, "_o", str27);
                    if (j0().R(str6, t4Var.U)) {
                        j0().G(bundleF, "_dbg", 1L);
                        j0().G(bundleF, "_r", 1L);
                    }
                    if ("_s".equals(str26) && (p4VarL0 = f0().l0(str6, "_sno")) != null) {
                        obj2 = p4VarL0.e;
                        if (obj2 instanceof Long) {
                            j0().G(bundleF, "_sno", obj2);
                        }
                    }
                    if (d0().B(null, e0.X0) && Objects.equals(str27, "am") && str26.equals("_ai")) {
                        obj = bundleF.get("value");
                        if (obj instanceof String) {
                            try {
                                double d = Double.parseDouble((String) obj);
                                bundleF.remove("value");
                                bundleF.putDouble("value", d);
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                    mVarF1 = f0();
                    com.gamericefishpro.space.v8.c0.d(str6);
                    mVarF1.r();
                    mVarF1.s();
                    try {
                        jDelete = mVarF1.g0().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str6, String.valueOf(Math.max(0, Math.min(1000000, ((r1) mVarF1.d).v.z(str6, e0.q))))});
                    } catch (SQLiteException e) {
                        ((r1) mVarF1.d).a().v().c("Error deleting over the limit events. appId", v0.z(str6), e);
                        jDelete = 0;
                    }
                    if (jDelete > 0) {
                        a().w().c("Data lost. Too many events stored on disk, deleted. appId", v0.z(str6), Long.valueOf(jDelete));
                    }
                    r1Var = this.E;
                    qVar = new q(r1Var, uVarC.i, str6, uVarC.d, uVarC.v, 0L, bundleF);
                    m mVarF4 = f0();
                    str7 = qVar.b;
                    String str28 = str17;
                    rVarP = mVarF4.P(str28, str6, str7);
                    if (rVarP == null) {
                        jH = f0().H(str6);
                        gVarD0 = d0();
                        gVarD0.getClass();
                        d0Var = e0.W;
                        j4Var2 = j4Var;
                        if (jH >= Math.max(Math.min(gVarD0.z(str6, d0Var), 2000), PermissionsActivity.DELAY_TIME_CALLBACK_CALL) || !zP0) {
                            j4Var = j4Var2;
                            rVarA = new r(str6, str7, 0L, 0L, 0L, qVar.d, 0L, null, null, null, null);
                            str6 = str6;
                        } else {
                            t0 t0VarV = a().v();
                            u0 u0VarZ = v0.z(str6);
                            String strA = r1Var.m().a(str7);
                            g gVarD2 = d0();
                            gVarD2.getClass();
                            t0VarV.d("Too many event names used, ignoring event. appId, name, supported count", u0VarZ, strA, Integer.valueOf(Math.max(Math.min(gVarD2.z(str6, d0Var), 2000), PermissionsActivity.DELAY_TIME_CALLBACK_CALL)));
                            j0();
                            r4.H(j4Var2, str6, 8, null, null, 0);
                        }
                    } else {
                        qVar = qVar.a(r1Var, rVarP.f);
                        rVarA = rVarP.a(qVar.d);
                    }
                    qVar2 = qVar;
                    f0().Q(str28, rVarA);
                    c().r();
                    k0();
                    String str29 = qVar2.a;
                    com.gamericefishpro.space.v8.c0.d(str29);
                    com.gamericefishpro.space.v8.c0.b(str29.equals(str6));
                    h3VarU = com.gamericefishpro.space.i9.i3.U();
                    h3VarU.y();
                    h3VarU.j();
                    if (!TextUtils.isEmpty(str6)) {
                        h3VarU.p(str6);
                    }
                    if (TextUtils.isEmpty(str3)) {
                        str8 = str3;
                    } else {
                        str8 = str3;
                        h3VarU.n(str8);
                    }
                    if (TextUtils.isEmpty(str2)) {
                        str9 = str2;
                    } else {
                        str9 = str2;
                        h3VarU.q(str9);
                    }
                    if (TextUtils.isEmpty(str)) {
                        str10 = str;
                    } else {
                        str10 = str;
                        h3VarU.R(str10);
                    }
                    if (j7 != -2147483648L) {
                        j = j7;
                        h3VarU.L((int) j);
                    } else {
                        j = j7;
                    }
                    str11 = str8;
                    h3VarU.r(j6);
                    if (TextUtils.isEmpty(str23)) {
                        str12 = str23;
                    } else {
                        str12 = str23;
                        h3VarU.H(str12);
                    }
                    com.gamericefishpro.space.v8.c0.g(str6);
                    str13 = str10;
                    e2VarJ = b(str6).j(e2.c(100, str18));
                    h3VarU.Q(e2VarJ.f());
                    r8.a();
                    zB = d0().B(str6, e0.P0);
                    d2Var = d2.AD_STORAGE;
                    if (zB) {
                        j0();
                        if (r4.N(str6)) {
                            h3VarU.z(t4Var.S);
                            j2 = j;
                            j3 = t4Var.T;
                            if (!e2VarJ.i(d2Var) && j3 != 0) {
                                j3 = (j3 & (-2)) | 32;
                            }
                            if (j3 == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            h3VarU.T(z);
                            if (j3 != 0) {
                                com.gamericefishpro.space.i9.p2 p2VarW = com.gamericefishpro.space.i9.q2.w();
                                if ((j3 & 1) != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                p2VarW.h(z2);
                                if ((j3 & 2) != 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                p2VarW.i(z3);
                                if ((j3 & 4) != 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                p2VarW.j(z4);
                                if ((j3 & 8) != 0) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                p2VarW.k(z5);
                                if ((j3 & 16) != 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                p2VarW.l(z6);
                                if ((j3 & 32) != 0) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                p2VarW.m(z7);
                                if ((j3 & 64) != 0) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                p2VarW.n(z8);
                                h3VarU.A((com.gamericefishpro.space.i9.q2) p2VarW.e());
                            }
                        } else {
                            j2 = j;
                        }
                    } else {
                        j2 = j;
                    }
                    if (j8 != 0) {
                        h3VarU.w(j8);
                        j8 = j8;
                    }
                    h3VarU.O(j4);
                    z0 z0VarI1 = i0();
                    d4VarA = com.gamericefishpro.space.i9.d4.a(z0VarI1.e.E.d().getContentResolver(), com.gamericefishpro.space.i9.j4.a(), c0.e);
                    if (d4VarA == null) {
                        mapB = Collections.EMPTY_MAP;
                    } else {
                        mapB = d4VarA.b();
                    }
                    if (mapB == null && !mapB.isEmpty()) {
                        arrayList = new ArrayList();
                        int iIntValue = ((Integer) e0.f0.a(null)).intValue();
                        Iterator it3 = mapB.entrySet().iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                str14 = str9;
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it3.next();
                            Iterator it4 = it3;
                            str14 = str9;
                            if (((String) entry.getKey()).startsWith("measurement.id.")) {
                                try {
                                    int i4 = Integer.parseInt((String) entry.getValue());
                                    if (i4 != 0) {
                                        arrayList.add(Integer.valueOf(i4));
                                        if (arrayList.size() >= iIntValue) {
                                            ((r1) z0VarI1.d).a().w().b(Integer.valueOf(arrayList.size()), "Too many experiment IDs. Number of IDs");
                                            break;
                                        }
                                        continue;
                                    } else {
                                        continue;
                                    }
                                } catch (NumberFormatException e2) {
                                    ((r1) z0VarI1.d).a().w().b(e2, "Experiment ID NumberFormatException");
                                }
                            }
                            it3 = it4;
                            str9 = str14;
                        }
                        if (!arrayList.isEmpty()) {
                            if (arrayList != null) {
                                h3VarU.N(arrayList);
                            }
                            if (d0().B(null, e0.a1)) {
                                h3VarU.D();
                            }
                            e2VarJ2 = b(str6).j(e2.c(100, str18));
                            if (e2VarJ2.i(d2Var) || !z9) {
                                str12 = str12;
                            } else {
                                try {
                                    q3 q3Var = this.B;
                                    q3Var.getClass();
                                    Pair pairV = e2VarJ2.i(d2Var) ? q3Var.v(str6) : new Pair("", Boolean.FALSE);
                                    if (TextUtils.isEmpty((CharSequence) pairV.first)) {
                                        str12 = str12;
                                    } else {
                                        h3VarU.t((String) pairV.first);
                                        Object obj3 = pairV.second;
                                        if (obj3 != null) {
                                            h3VarU.u(((Boolean) obj3).booleanValue());
                                        }
                                        if (qVar2.b.equals("_fx") || ((String) pairV.first).equals("00000000-0000-0000-0000-000000000000") || (a1VarT1 = f0().t0(str6)) == null) {
                                            str12 = str12;
                                        } else {
                                            p1 p1Var3 = a1VarT1.a.z;
                                            r1.l(p1Var3);
                                            p1Var3.r();
                                            if (a1VarT1.y) {
                                                u(str6, false, null, null);
                                                Bundle bundle2 = new Bundle();
                                                p1 p1Var4 = a1VarT1.a.z;
                                                r1.l(p1Var4);
                                                p1Var4.r();
                                                Long l = a1VarT1.z;
                                                if (l != null) {
                                                    bundle2.putLong("_pfo", Math.max(0L, l.longValue()));
                                                }
                                                p1 p1Var5 = a1VarT1.a.z;
                                                r1.l(p1Var5);
                                                p1Var5.r();
                                                Long l2 = a1VarT1.A;
                                                if (l2 != null) {
                                                    bundle2.putLong("_uwa", l2.longValue());
                                                }
                                                bundle2.putLong("_r", 1L);
                                                j4Var.a(str6, "_fx", bundle2);
                                            } else {
                                                str12 = str12;
                                            }
                                        }
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    m4Var = this;
                                }
                            }
                            r1Var2.p().t();
                            String str30 = Build.MODEL;
                            h3VarU.k();
                            r1Var2.p().t();
                            String str31 = Build.VERSION.RELEASE;
                            h3VarU.b();
                            ((com.gamericefishpro.space.i9.i3) h3VarU.e).o0(str31);
                            h3VarU.m((int) r1Var2.p().v());
                            h3VarU.l(r1Var2.p().w());
                            h3VarU.S(t4Var.P);
                            if (r1Var2.b()) {
                                h3VarU.o();
                                if (!TextUtils.isEmpty(null)) {
                                    h3VarU.b();
                                    ((com.gamericefishpro.space.i9.i3) h3VarU.e).R0(null);
                                    throw null;
                                }
                            }
                            a1VarT0 = f0().t0(str6);
                            if (a1VarT0 == null) {
                                a1VarT0 = new a1(r1Var2, str6);
                                m4Var = this;
                                try {
                                    a1VarT0.F(m4Var.o(e2VarJ2));
                                    a1VarT0.K(t4Var.D);
                                    a1VarT0.H(str12);
                                    if (e2VarJ2.i(d2Var)) {
                                        a1VarT0.I(m4Var.B.w(str6, z9));
                                    }
                                    a1VarT0.e(0L);
                                    a1VarT0.L(0L);
                                    a1VarT0.M(0L);
                                    a1VarT0.O(str14);
                                    a1VarT0.Q(j2);
                                    a1VarT0.R(str11);
                                    a1VarT0.S(j6);
                                    a1VarT0.a(j8);
                                    a1VarT0.d(z10);
                                    a1VarT0.c(j4);
                                    i = 0;
                                    m4Var.f0().u0(a1VarT0, false);
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } else {
                                i = 0;
                                m4Var = this;
                            }
                            if (e2VarJ2.i(d2.ANALYTICS_STORAGE) && !TextUtils.isEmpty(a1VarT0.E())) {
                                String strE = a1VarT0.E();
                                com.gamericefishpro.space.v8.c0.g(strE);
                                h3VarU.v(strE);
                            }
                            if (!TextUtils.isEmpty(a1VarT0.J())) {
                                String strJ = a1VarT0.J();
                                com.gamericefishpro.space.v8.c0.g(strJ);
                                h3VarU.K(strJ);
                            }
                            listM0 = m4Var.f0().m0(str6);
                            i2 = i;
                            while (i2 < listM0.size()) {
                                com.gamericefishpro.space.i9.q3 q3VarA = com.gamericefishpro.space.i9.r3.A();
                                String str32 = ((p4) listM0.get(i2)).c;
                                q3VarA.b();
                                ((com.gamericefishpro.space.i9.r3) q3VarA.e).C(str32);
                                long j12 = ((p4) listM0.get(i2)).d;
                                q3VarA.b();
                                ((com.gamericefishpro.space.i9.r3) q3VarA.e).B(j12);
                                m4Var.i0().P(q3VarA, ((p4) listM0.get(i2)).e);
                                h3VarU.Z(q3VarA);
                                if ("_sid".equals(((p4) listM0.get(i2)).c)) {
                                    p1 p1Var6 = a1VarT0.a.z;
                                    r1.l(p1Var6);
                                    p1Var6.r();
                                    if (a1VarT0.w != 0) {
                                        z0VarI0 = m4Var.i0();
                                        if (TextUtils.isEmpty(str13)) {
                                            str16 = str13;
                                            jC0 = 0;
                                        } else {
                                            str16 = str13;
                                            jC0 = z0VarI0.c0(str16.getBytes(Charset.forName("UTF-8")));
                                        }
                                        p1 p1Var7 = a1VarT0.a.z;
                                        r1.l(p1Var7);
                                        p1Var7.r();
                                        if (jC0 != a1VarT0.w) {
                                            h3VarU.b();
                                            ((com.gamericefishpro.space.i9.i3) h3VarU.e).Z0();
                                        }
                                    } else {
                                        str16 = str13;
                                    }
                                } else {
                                    str16 = str13;
                                }
                                i2++;
                                str13 = str16;
                            }
                            try {
                                mVarF2 = m4Var.f0();
                                com.gamericefishpro.space.i9.i3 i3Var = (com.gamericefishpro.space.i9.i3) h3VarU.e();
                                mVarF2.r();
                                mVarF2.s();
                                com.gamericefishpro.space.v8.c0.d(i3Var.p());
                                byte[] bArrA = i3Var.a();
                                long jC1 = mVarF2.e.i0().c0(bArrA);
                                ContentValues contentValues2 = new ContentValues();
                                contentValues2.put("app_id", i3Var.p());
                                contentValues2.put("metadata_fingerprint", Long.valueOf(jC1));
                                contentValues2.put("metadata", bArrA);
                                try {
                                    mVarF2.g0().insertWithOnConflict("raw_events_metadata", null, contentValues2, 4);
                                    mVarF3 = m4Var.f0();
                                    t tVar2 = qVar2.f;
                                    Objects.requireNonNull(tVar2);
                                    it2 = tVar2.d.keySet().iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            l1 l1VarE1 = m4Var.e0();
                                            String str33 = qVar2.a;
                                            zH = l1VarE1.H(str33, qVar2.b);
                                            j jVarV0 = m4Var.f0().v0(m4Var.g(), str33, false, false, false, false);
                                            if (zH || jVarV0.e >= m4Var.d0().z(str33, e0.p)) {
                                                i3 = i;
                                                break;
                                            }
                                        } else if ("_r".equals(it2.next())) {
                                        }
                                        i3 = 1;
                                        break;
                                    }
                                    mVarF3.r();
                                    mVarF3.s();
                                    str15 = qVar2.a;
                                    com.gamericefishpro.space.v8.c0.d(str15);
                                    byte[] bArrA2 = mVarF3.e.i0().T(qVar2).a();
                                    contentValues = new ContentValues();
                                    contentValues.put("app_id", str15);
                                    contentValues.put("name", qVar2.b);
                                    contentValues.put("timestamp", Long.valueOf(qVar2.d));
                                    contentValues.put("metadata_fingerprint", Long.valueOf(jC1));
                                    contentValues.put("data", bArrA2);
                                    contentValues.put("realtime", Integer.valueOf(i3));
                                    try {
                                        if (mVarF3.g0().insert("raw_events", null, contentValues) == -1) {
                                            ((r1) mVarF3.d).a().v().b(v0.z(str15), "Failed to insert raw event (got -1). appId");
                                        } else {
                                            m4Var.H = 0L;
                                        }
                                    } catch (SQLiteException e3) {
                                        ((r1) mVarF3.d).a().v().c("Error storing raw event. appId", v0.z(qVar2.a), e3);
                                    }
                                } catch (SQLiteException e4) {
                                    ((r1) mVarF2.d).a().v().c("Error storing raw event metadata. appId", v0.z(i3Var.p()), e4);
                                    throw e4;
                                }
                            } catch (IOException e5) {
                                m4Var.a().v().c("Data loss. Failed to insert raw event metadata. appId", v0.z(h3VarU.o()), e5);
                            }
                            m4Var.f0().e0();
                            m4Var.f0().f0();
                            m4Var.N();
                            m4Var.a().y().b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                            return;
                        }
                        m4Var.f0().f0();
                        throw th;
                    }
                    str14 = str9;
                    arrayList = null;
                    if (arrayList != null) {
                        h3VarU.N(arrayList);
                    }
                    if (d0().B(null, e0.a1)) {
                        h3VarU.D();
                    }
                    e2VarJ2 = b(str6).j(e2.c(100, str18));
                    if (e2VarJ2.i(d2Var)) {
                        str12 = str12;
                        r1Var2.p().t();
                        String str34 = Build.MODEL;
                        h3VarU.k();
                        r1Var2.p().t();
                        String str35 = Build.VERSION.RELEASE;
                        h3VarU.b();
                        ((com.gamericefishpro.space.i9.i3) h3VarU.e).o0(str35);
                        h3VarU.m((int) r1Var2.p().v());
                        h3VarU.l(r1Var2.p().w());
                        h3VarU.S(t4Var.P);
                        if (r1Var2.b()) {
                            h3VarU.o();
                            if (!TextUtils.isEmpty(null)) {
                                h3VarU.b();
                                ((com.gamericefishpro.space.i9.i3) h3VarU.e).R0(null);
                                throw null;
                            }
                        }
                        a1VarT0 = f0().t0(str6);
                        if (a1VarT0 == null) {
                            a1VarT0 = new a1(r1Var2, str6);
                            m4Var = this;
                            a1VarT0.F(m4Var.o(e2VarJ2));
                            a1VarT0.K(t4Var.D);
                            a1VarT0.H(str12);
                            if (e2VarJ2.i(d2Var)) {
                                a1VarT0.I(m4Var.B.w(str6, z9));
                            }
                            a1VarT0.e(0L);
                            a1VarT0.L(0L);
                            a1VarT0.M(0L);
                            a1VarT0.O(str14);
                            a1VarT0.Q(j2);
                            a1VarT0.R(str11);
                            a1VarT0.S(j6);
                            a1VarT0.a(j8);
                            a1VarT0.d(z10);
                            a1VarT0.c(j4);
                            i = 0;
                            m4Var.f0().u0(a1VarT0, false);
                        } else {
                            i = 0;
                            m4Var = this;
                        }
                        if (e2VarJ2.i(d2.ANALYTICS_STORAGE)) {
                            String strE2 = a1VarT0.E();
                            com.gamericefishpro.space.v8.c0.g(strE2);
                            h3VarU.v(strE2);
                        }
                        if (!TextUtils.isEmpty(a1VarT0.J())) {
                            String strJ2 = a1VarT0.J();
                            com.gamericefishpro.space.v8.c0.g(strJ2);
                            h3VarU.K(strJ2);
                        }
                        listM0 = m4Var.f0().m0(str6);
                        i2 = i;
                        while (i2 < listM0.size()) {
                            com.gamericefishpro.space.i9.q3 q3VarA2 = com.gamericefishpro.space.i9.r3.A();
                            String str36 = ((p4) listM0.get(i2)).c;
                            q3VarA2.b();
                            ((com.gamericefishpro.space.i9.r3) q3VarA2.e).C(str36);
                            long j13 = ((p4) listM0.get(i2)).d;
                            q3VarA2.b();
                            ((com.gamericefishpro.space.i9.r3) q3VarA2.e).B(j13);
                            m4Var.i0().P(q3VarA2, ((p4) listM0.get(i2)).e);
                            h3VarU.Z(q3VarA2);
                            if ("_sid".equals(((p4) listM0.get(i2)).c)) {
                                p1 p1Var8 = a1VarT0.a.z;
                                r1.l(p1Var8);
                                p1Var8.r();
                                if (a1VarT0.w != 0) {
                                    z0VarI0 = m4Var.i0();
                                    if (TextUtils.isEmpty(str13)) {
                                        str16 = str13;
                                        jC0 = 0;
                                    } else {
                                        str16 = str13;
                                        jC0 = z0VarI0.c0(str16.getBytes(Charset.forName("UTF-8")));
                                    }
                                    p1 p1Var9 = a1VarT0.a.z;
                                    r1.l(p1Var9);
                                    p1Var9.r();
                                    if (jC0 != a1VarT0.w) {
                                        h3VarU.b();
                                        ((com.gamericefishpro.space.i9.i3) h3VarU.e).Z0();
                                    }
                                } else {
                                    str16 = str13;
                                }
                            } else {
                                str16 = str13;
                            }
                            i2++;
                            str13 = str16;
                        }
                        mVarF2 = m4Var.f0();
                        com.gamericefishpro.space.i9.i3 i3Var2 = (com.gamericefishpro.space.i9.i3) h3VarU.e();
                        mVarF2.r();
                        mVarF2.s();
                        com.gamericefishpro.space.v8.c0.d(i3Var2.p());
                        byte[] bArrA3 = i3Var2.a();
                        long jC2 = mVarF2.e.i0().c0(bArrA3);
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("app_id", i3Var2.p());
                        contentValues3.put("metadata_fingerprint", Long.valueOf(jC2));
                        contentValues3.put("metadata", bArrA3);
                        mVarF2.g0().insertWithOnConflict("raw_events_metadata", null, contentValues3, 4);
                        mVarF3 = m4Var.f0();
                        t tVar3 = qVar2.f;
                        Objects.requireNonNull(tVar3);
                        it2 = tVar3.d.keySet().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                l1 l1VarE2 = m4Var.e0();
                                String str37 = qVar2.a;
                                zH = l1VarE2.H(str37, qVar2.b);
                                j jVarV1 = m4Var.f0().v0(m4Var.g(), str37, false, false, false, false);
                                if (zH) {
                                }
                                i3 = i;
                                break;
                            }
                            if ("_r".equals(it2.next())) {
                            }
                            i3 = 1;
                            break;
                        }
                        mVarF3.r();
                        mVarF3.s();
                        str15 = qVar2.a;
                        com.gamericefishpro.space.v8.c0.d(str15);
                        byte[] bArrA4 = mVarF3.e.i0().T(qVar2).a();
                        contentValues = new ContentValues();
                        contentValues.put("app_id", str15);
                        contentValues.put("name", qVar2.b);
                        contentValues.put("timestamp", Long.valueOf(qVar2.d));
                        contentValues.put("metadata_fingerprint", Long.valueOf(jC2));
                        contentValues.put("data", bArrA4);
                        contentValues.put("realtime", Integer.valueOf(i3));
                        if (mVarF3.g0().insert("raw_events", null, contentValues) == -1) {
                            ((r1) mVarF3.d).a().v().b(v0.z(str15), "Failed to insert raw event (got -1). appId");
                        } else {
                            m4Var.H = 0L;
                        }
                        m4Var.f0().e0();
                        m4Var.f0().f0();
                        m4Var.N();
                        m4Var.a().y().b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                        return;
                    }
                    str12 = str12;
                    r1Var2.p().t();
                    String str38 = Build.MODEL;
                    h3VarU.k();
                    r1Var2.p().t();
                    String str39 = Build.VERSION.RELEASE;
                    h3VarU.b();
                    ((com.gamericefishpro.space.i9.i3) h3VarU.e).o0(str39);
                    h3VarU.m((int) r1Var2.p().v());
                    h3VarU.l(r1Var2.p().w());
                    h3VarU.S(t4Var.P);
                    if (r1Var2.b()) {
                        h3VarU.o();
                        if (!TextUtils.isEmpty(null)) {
                            h3VarU.b();
                            ((com.gamericefishpro.space.i9.i3) h3VarU.e).R0(null);
                            throw null;
                        }
                    }
                    a1VarT0 = f0().t0(str6);
                    if (a1VarT0 == null) {
                        a1VarT0 = new a1(r1Var2, str6);
                        m4Var = this;
                        a1VarT0.F(m4Var.o(e2VarJ2));
                        a1VarT0.K(t4Var.D);
                        a1VarT0.H(str12);
                        if (e2VarJ2.i(d2Var)) {
                            a1VarT0.I(m4Var.B.w(str6, z9));
                        }
                        a1VarT0.e(0L);
                        a1VarT0.L(0L);
                        a1VarT0.M(0L);
                        a1VarT0.O(str14);
                        a1VarT0.Q(j2);
                        a1VarT0.R(str11);
                        a1VarT0.S(j6);
                        a1VarT0.a(j8);
                        a1VarT0.d(z10);
                        a1VarT0.c(j4);
                        i = 0;
                        m4Var.f0().u0(a1VarT0, false);
                    } else {
                        i = 0;
                        m4Var = this;
                    }
                    if (e2VarJ2.i(d2.ANALYTICS_STORAGE)) {
                        String strE3 = a1VarT0.E();
                        com.gamericefishpro.space.v8.c0.g(strE3);
                        h3VarU.v(strE3);
                    }
                    if (!TextUtils.isEmpty(a1VarT0.J())) {
                        String strJ3 = a1VarT0.J();
                        com.gamericefishpro.space.v8.c0.g(strJ3);
                        h3VarU.K(strJ3);
                    }
                    listM0 = m4Var.f0().m0(str6);
                    i2 = i;
                    while (i2 < listM0.size()) {
                        com.gamericefishpro.space.i9.q3 q3VarA3 = com.gamericefishpro.space.i9.r3.A();
                        String str310 = ((p4) listM0.get(i2)).c;
                        q3VarA3.b();
                        ((com.gamericefishpro.space.i9.r3) q3VarA3.e).C(str310);
                        long j14 = ((p4) listM0.get(i2)).d;
                        q3VarA3.b();
                        ((com.gamericefishpro.space.i9.r3) q3VarA3.e).B(j14);
                        m4Var.i0().P(q3VarA3, ((p4) listM0.get(i2)).e);
                        h3VarU.Z(q3VarA3);
                        if ("_sid".equals(((p4) listM0.get(i2)).c)) {
                            p1 p1Var10 = a1VarT0.a.z;
                            r1.l(p1Var10);
                            p1Var10.r();
                            if (a1VarT0.w != 0) {
                                z0VarI0 = m4Var.i0();
                                if (TextUtils.isEmpty(str13)) {
                                    str16 = str13;
                                    jC0 = 0;
                                } else {
                                    str16 = str13;
                                    jC0 = z0VarI0.c0(str16.getBytes(Charset.forName("UTF-8")));
                                }
                                p1 p1Var11 = a1VarT0.a.z;
                                r1.l(p1Var11);
                                p1Var11.r();
                                if (jC0 != a1VarT0.w) {
                                    h3VarU.b();
                                    ((com.gamericefishpro.space.i9.i3) h3VarU.e).Z0();
                                }
                            } else {
                                str16 = str13;
                            }
                        } else {
                            str16 = str13;
                        }
                        i2++;
                        str13 = str16;
                    }
                    mVarF2 = m4Var.f0();
                    com.gamericefishpro.space.i9.i3 i3Var3 = (com.gamericefishpro.space.i9.i3) h3VarU.e();
                    mVarF2.r();
                    mVarF2.s();
                    com.gamericefishpro.space.v8.c0.d(i3Var3.p());
                    byte[] bArrA5 = i3Var3.a();
                    long jC3 = mVarF2.e.i0().c0(bArrA5);
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("app_id", i3Var3.p());
                    contentValues4.put("metadata_fingerprint", Long.valueOf(jC3));
                    contentValues4.put("metadata", bArrA5);
                    mVarF2.g0().insertWithOnConflict("raw_events_metadata", null, contentValues4, 4);
                    mVarF3 = m4Var.f0();
                    t tVar4 = qVar2.f;
                    Objects.requireNonNull(tVar4);
                    it2 = tVar4.d.keySet().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            l1 l1VarE3 = m4Var.e0();
                            String str311 = qVar2.a;
                            zH = l1VarE3.H(str311, qVar2.b);
                            j jVarV2 = m4Var.f0().v0(m4Var.g(), str311, false, false, false, false);
                            if (zH) {
                            }
                            i3 = i;
                            break;
                        }
                        if ("_r".equals(it2.next())) {
                        }
                        i3 = 1;
                        break;
                    }
                    mVarF3.r();
                    mVarF3.s();
                    str15 = qVar2.a;
                    com.gamericefishpro.space.v8.c0.d(str15);
                    byte[] bArrA6 = mVarF3.e.i0().T(qVar2).a();
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str15);
                    contentValues.put("name", qVar2.b);
                    contentValues.put("timestamp", Long.valueOf(qVar2.d));
                    contentValues.put("metadata_fingerprint", Long.valueOf(jC3));
                    contentValues.put("data", bArrA6);
                    contentValues.put("realtime", Integer.valueOf(i3));
                    if (mVarF3.g0().insert("raw_events", null, contentValues) == -1) {
                        ((r1) mVarF3.d).a().v().b(v0.z(str15), "Failed to insert raw event (got -1). appId");
                    } else {
                        m4Var.H = 0L;
                    }
                    m4Var.f0().e0();
                    m4Var.f0().f0();
                    m4Var.N();
                    m4Var.a().y().b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                    return;
                    m4Var.f0().f0();
                    throw th;
                }
                if (jIntValue % 1000 == 1) {
                    a().v().c("Data loss. Too many events logged. appId, count", v0.z(str5), Long.valueOf(jVarW0.b));
                }
                f0().e0();
                f0().f0();
            }
            str = str19;
            str2 = str20;
            String strD = tVar.d();
            str3 = str21;
            Bundle bundle3 = tVar.d;
            if (z11) {
                double dDoubleValue = tVar.c().doubleValue() * 1000000.0d;
                if (dDoubleValue == 0.0d) {
                    dDoubleValue = bundle3.getLong("value") * 1000000.0d;
                }
                if (dDoubleValue > 9.223372036854776E18d || dDoubleValue < -9.223372036854776E18d) {
                    a().w().c("Data lost. Currency value is too big. appId", v0.z(str22), Double.valueOf(dDoubleValue));
                    f0().e0();
                } else {
                    jRound = Math.round(dDoubleValue);
                    if ("refund".equals(str26)) {
                        jRound = -jRound;
                    }
                }
                f0().f0();
            }
            str17 = "events";
            jRound = bundle3.getLong("value");
            if (!TextUtils.isEmpty(strD)) {
                String upperCase = strD.toUpperCase(Locale.US);
                if (upperCase.matches("[A-Z]{3}")) {
                    String strConcat = "_ltv_".concat(upperCase);
                    p4 p4VarL1 = f0().l0(str22, strConcat);
                    try {
                        if (p4VarL1 != null) {
                            Object obj4 = p4VarL1.e;
                            if (obj4 instanceof Long) {
                                long jLongValue = ((Long) obj4).longValue();
                                String str40 = uVarC.i;
                                e().getClass();
                                p4Var = new p4(str22, str40, strConcat, System.currentTimeMillis(), Long.valueOf(jLongValue + jRound));
                                str4 = str22;
                            }
                            p4Var2 = p4Var;
                            if (!f0().k0(p4Var2)) {
                                a().v().d("Too many unique user properties are set. Ignoring user property. appId", v0.z(str4), r1Var2.m().c(p4Var2.c), p4Var2.e);
                                j0();
                                r4.H(j4Var3, str4, 9, null, null, 0);
                                j4Var = j4Var3;
                            }
                            zP0 = r4.p0(str26);
                            zEquals = "_err".equals(str26);
                            j0();
                            if (tVar == null) {
                                length = 0;
                            } else {
                                it = tVar.d.keySet().iterator();
                                length = 0;
                                while (it.hasNext()) {
                                    objB = tVar.b(it.next());
                                    if (objB instanceof Parcelable[]) {
                                        length += (long) ((Parcelable[]) objB).length;
                                    }
                                }
                            }
                            str5 = str4;
                            jVarW0 = f0().w0(g(), str5, length + 1, true, zP0, false, zEquals, false, false, false);
                            long j15 = jVarW0.b;
                            d0();
                            jIntValue = j15 - ((long) ((Integer) e0.l.a(null)).intValue());
                            if (jIntValue <= 0) {
                                if (zP0) {
                                    long j16 = jVarW0.a;
                                    d0();
                                    jIntValue2 = j16 - ((long) ((Integer) e0.n.a(null)).intValue());
                                    if (jIntValue2 > 0) {
                                        if (jIntValue2 % 1000 == 1) {
                                            a().v().c("Data loss. Too many public events logged. appId, count", v0.z(str5), Long.valueOf(jVarW0.a));
                                        }
                                        j0();
                                        r4.H(j4Var, str5, 16, "_ev", uVarC.d, 0);
                                        f0().e0();
                                    }
                                }
                                str6 = str5;
                                if (zEquals) {
                                    jMax = jVarW0.d - ((long) Math.max(0, Math.min(1000000, d0().z(str6, e0.m))));
                                    if (jMax > 0) {
                                        if (jMax == 1) {
                                            a().v().c("Too many error events logged. appId, count", v0.z(str6), Long.valueOf(jVarW0.d));
                                        }
                                        f0().e0();
                                    }
                                }
                                bundleF = tVar.f();
                                r4 r4VarJ2 = j0();
                                String str210 = uVarC.i;
                                r4VarJ2.G(bundleF, "_o", str210);
                                if (j0().R(str6, t4Var.U)) {
                                    j0().G(bundleF, "_dbg", 1L);
                                    j0().G(bundleF, "_r", 1L);
                                }
                                if ("_s".equals(str26)) {
                                    obj2 = p4VarL0.e;
                                    if (obj2 instanceof Long) {
                                        j0().G(bundleF, "_sno", obj2);
                                    }
                                }
                                if (d0().B(null, e0.X0)) {
                                    obj = bundleF.get("value");
                                    if (obj instanceof String) {
                                        double d2 = Double.parseDouble((String) obj);
                                        bundleF.remove("value");
                                        bundleF.putDouble("value", d2);
                                    }
                                }
                                mVarF1 = f0();
                                com.gamericefishpro.space.v8.c0.d(str6);
                                mVarF1.r();
                                mVarF1.s();
                                jDelete = mVarF1.g0().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str6, String.valueOf(Math.max(0, Math.min(1000000, ((r1) mVarF1.d).v.z(str6, e0.q))))});
                                if (jDelete > 0) {
                                    a().w().c("Data lost. Too many events stored on disk, deleted. appId", v0.z(str6), Long.valueOf(jDelete));
                                }
                                r1Var = this.E;
                                qVar = new q(r1Var, uVarC.i, str6, uVarC.d, uVarC.v, 0L, bundleF);
                                m mVarF5 = f0();
                                str7 = qVar.b;
                                String str211 = str17;
                                rVarP = mVarF5.P(str211, str6, str7);
                                if (rVarP == null) {
                                    jH = f0().H(str6);
                                    gVarD0 = d0();
                                    gVarD0.getClass();
                                    d0Var = e0.W;
                                    j4Var2 = j4Var;
                                    if (jH >= Math.max(Math.min(gVarD0.z(str6, d0Var), 2000), PermissionsActivity.DELAY_TIME_CALLBACK_CALL)) {
                                    }
                                    j4Var = j4Var2;
                                    rVarA = new r(str6, str7, 0L, 0L, 0L, qVar.d, 0L, null, null, null, null);
                                    str6 = str6;
                                } else {
                                    qVar = qVar.a(r1Var, rVarP.f);
                                    rVarA = rVarP.a(qVar.d);
                                }
                                qVar2 = qVar;
                                f0().Q(str211, rVarA);
                                c().r();
                                k0();
                                String str212 = qVar2.a;
                                com.gamericefishpro.space.v8.c0.d(str212);
                                com.gamericefishpro.space.v8.c0.b(str212.equals(str6));
                                h3VarU = com.gamericefishpro.space.i9.i3.U();
                                h3VarU.y();
                                h3VarU.j();
                                if (!TextUtils.isEmpty(str6)) {
                                    h3VarU.p(str6);
                                }
                                if (TextUtils.isEmpty(str3)) {
                                    str8 = str3;
                                    h3VarU.n(str8);
                                } else {
                                    str8 = str3;
                                }
                                if (TextUtils.isEmpty(str2)) {
                                    str9 = str2;
                                    h3VarU.q(str9);
                                } else {
                                    str9 = str2;
                                }
                                if (TextUtils.isEmpty(str)) {
                                    str10 = str;
                                    h3VarU.R(str10);
                                } else {
                                    str10 = str;
                                }
                                if (j7 != -2147483648L) {
                                    j = j7;
                                    h3VarU.L((int) j);
                                } else {
                                    j = j7;
                                }
                                str11 = str8;
                                h3VarU.r(j6);
                                if (TextUtils.isEmpty(str23)) {
                                    str12 = str23;
                                    h3VarU.H(str12);
                                } else {
                                    str12 = str23;
                                }
                                com.gamericefishpro.space.v8.c0.g(str6);
                                str13 = str10;
                                e2VarJ = b(str6).j(e2.c(100, str18));
                                h3VarU.Q(e2VarJ.f());
                                r8.a();
                                zB = d0().B(str6, e0.P0);
                                d2Var = d2.AD_STORAGE;
                                if (zB) {
                                    j0();
                                    if (r4.N(str6)) {
                                        h3VarU.z(t4Var.S);
                                        j2 = j;
                                        j3 = t4Var.T;
                                        if (!e2VarJ.i(d2Var)) {
                                            j3 = (j3 & (-2)) | 32;
                                        }
                                        if (j3 == 1) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        h3VarU.T(z);
                                        if (j3 != 0) {
                                            com.gamericefishpro.space.i9.p2 p2VarW2 = com.gamericefishpro.space.i9.q2.w();
                                            if ((j3 & 1) != 0) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            p2VarW2.h(z2);
                                            if ((j3 & 2) != 0) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            p2VarW2.i(z3);
                                            if ((j3 & 4) != 0) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            p2VarW2.j(z4);
                                            if ((j3 & 8) != 0) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            p2VarW2.k(z5);
                                            if ((j3 & 16) != 0) {
                                                z6 = true;
                                            } else {
                                                z6 = false;
                                            }
                                            p2VarW2.l(z6);
                                            if ((j3 & 32) != 0) {
                                                z7 = true;
                                            } else {
                                                z7 = false;
                                            }
                                            p2VarW2.m(z7);
                                            if ((j3 & 64) != 0) {
                                                z8 = true;
                                            } else {
                                                z8 = false;
                                            }
                                            p2VarW2.n(z8);
                                            h3VarU.A((com.gamericefishpro.space.i9.q2) p2VarW2.e());
                                        }
                                    } else {
                                        j2 = j;
                                    }
                                } else {
                                    j2 = j;
                                }
                                if (j8 != 0) {
                                    h3VarU.w(j8);
                                    j8 = j8;
                                }
                                h3VarU.O(j4);
                                z0 z0VarI2 = i0();
                                d4VarA = com.gamericefishpro.space.i9.d4.a(z0VarI2.e.E.d().getContentResolver(), com.gamericefishpro.space.i9.j4.a(), c0.e);
                                if (d4VarA == null) {
                                    mapB = Collections.EMPTY_MAP;
                                } else {
                                    mapB = d4VarA.b();
                                }
                                if (mapB == null) {
                                    str14 = str9;
                                    arrayList = null;
                                } else {
                                    str14 = str9;
                                    arrayList = null;
                                }
                                if (arrayList != null) {
                                    h3VarU.N(arrayList);
                                }
                                if (d0().B(null, e0.a1)) {
                                    h3VarU.D();
                                }
                                e2VarJ2 = b(str6).j(e2.c(100, str18));
                                if (e2VarJ2.i(d2Var)) {
                                    str12 = str12;
                                    r1Var2.p().t();
                                    String str312 = Build.MODEL;
                                    h3VarU.k();
                                    r1Var2.p().t();
                                    String str313 = Build.VERSION.RELEASE;
                                    h3VarU.b();
                                    ((com.gamericefishpro.space.i9.i3) h3VarU.e).o0(str313);
                                    h3VarU.m((int) r1Var2.p().v());
                                    h3VarU.l(r1Var2.p().w());
                                    h3VarU.S(t4Var.P);
                                    if (r1Var2.b()) {
                                        h3VarU.o();
                                        if (!TextUtils.isEmpty(null)) {
                                            h3VarU.b();
                                            ((com.gamericefishpro.space.i9.i3) h3VarU.e).R0(null);
                                            throw null;
                                        }
                                    }
                                    a1VarT0 = f0().t0(str6);
                                    if (a1VarT0 == null) {
                                        a1VarT0 = new a1(r1Var2, str6);
                                        m4Var = this;
                                        a1VarT0.F(m4Var.o(e2VarJ2));
                                        a1VarT0.K(t4Var.D);
                                        a1VarT0.H(str12);
                                        if (e2VarJ2.i(d2Var)) {
                                            a1VarT0.I(m4Var.B.w(str6, z9));
                                        }
                                        a1VarT0.e(0L);
                                        a1VarT0.L(0L);
                                        a1VarT0.M(0L);
                                        a1VarT0.O(str14);
                                        a1VarT0.Q(j2);
                                        a1VarT0.R(str11);
                                        a1VarT0.S(j6);
                                        a1VarT0.a(j8);
                                        a1VarT0.d(z10);
                                        a1VarT0.c(j4);
                                        i = 0;
                                        m4Var.f0().u0(a1VarT0, false);
                                    } else {
                                        i = 0;
                                        m4Var = this;
                                    }
                                    if (e2VarJ2.i(d2.ANALYTICS_STORAGE)) {
                                        String strE4 = a1VarT0.E();
                                        com.gamericefishpro.space.v8.c0.g(strE4);
                                        h3VarU.v(strE4);
                                    }
                                    if (!TextUtils.isEmpty(a1VarT0.J())) {
                                        String strJ4 = a1VarT0.J();
                                        com.gamericefishpro.space.v8.c0.g(strJ4);
                                        h3VarU.K(strJ4);
                                    }
                                    listM0 = m4Var.f0().m0(str6);
                                    i2 = i;
                                    while (i2 < listM0.size()) {
                                        com.gamericefishpro.space.i9.q3 q3VarA4 = com.gamericefishpro.space.i9.r3.A();
                                        String str314 = ((p4) listM0.get(i2)).c;
                                        q3VarA4.b();
                                        ((com.gamericefishpro.space.i9.r3) q3VarA4.e).C(str314);
                                        long j17 = ((p4) listM0.get(i2)).d;
                                        q3VarA4.b();
                                        ((com.gamericefishpro.space.i9.r3) q3VarA4.e).B(j17);
                                        m4Var.i0().P(q3VarA4, ((p4) listM0.get(i2)).e);
                                        h3VarU.Z(q3VarA4);
                                        if ("_sid".equals(((p4) listM0.get(i2)).c)) {
                                            p1 p1Var12 = a1VarT0.a.z;
                                            r1.l(p1Var12);
                                            p1Var12.r();
                                            if (a1VarT0.w != 0) {
                                                z0VarI0 = m4Var.i0();
                                                if (TextUtils.isEmpty(str13)) {
                                                    str16 = str13;
                                                    jC0 = 0;
                                                } else {
                                                    str16 = str13;
                                                    jC0 = z0VarI0.c0(str16.getBytes(Charset.forName("UTF-8")));
                                                }
                                                p1 p1Var13 = a1VarT0.a.z;
                                                r1.l(p1Var13);
                                                p1Var13.r();
                                                if (jC0 != a1VarT0.w) {
                                                    h3VarU.b();
                                                    ((com.gamericefishpro.space.i9.i3) h3VarU.e).Z0();
                                                }
                                            } else {
                                                str16 = str13;
                                            }
                                        } else {
                                            str16 = str13;
                                        }
                                        i2++;
                                        str13 = str16;
                                    }
                                    mVarF2 = m4Var.f0();
                                    com.gamericefishpro.space.i9.i3 i3Var4 = (com.gamericefishpro.space.i9.i3) h3VarU.e();
                                    mVarF2.r();
                                    mVarF2.s();
                                    com.gamericefishpro.space.v8.c0.d(i3Var4.p());
                                    byte[] bArrA7 = i3Var4.a();
                                    long jC4 = mVarF2.e.i0().c0(bArrA7);
                                    ContentValues contentValues5 = new ContentValues();
                                    contentValues5.put("app_id", i3Var4.p());
                                    contentValues5.put("metadata_fingerprint", Long.valueOf(jC4));
                                    contentValues5.put("metadata", bArrA7);
                                    mVarF2.g0().insertWithOnConflict("raw_events_metadata", null, contentValues5, 4);
                                    mVarF3 = m4Var.f0();
                                    t tVar5 = qVar2.f;
                                    Objects.requireNonNull(tVar5);
                                    it2 = tVar5.d.keySet().iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            l1 l1VarE4 = m4Var.e0();
                                            String str315 = qVar2.a;
                                            zH = l1VarE4.H(str315, qVar2.b);
                                            j jVarV3 = m4Var.f0().v0(m4Var.g(), str315, false, false, false, false);
                                            if (zH) {
                                            }
                                            i3 = i;
                                            break;
                                        }
                                        if ("_r".equals(it2.next())) {
                                        }
                                        i3 = 1;
                                        break;
                                    }
                                    mVarF3.r();
                                    mVarF3.s();
                                    str15 = qVar2.a;
                                    com.gamericefishpro.space.v8.c0.d(str15);
                                    byte[] bArrA8 = mVarF3.e.i0().T(qVar2).a();
                                    contentValues = new ContentValues();
                                    contentValues.put("app_id", str15);
                                    contentValues.put("name", qVar2.b);
                                    contentValues.put("timestamp", Long.valueOf(qVar2.d));
                                    contentValues.put("metadata_fingerprint", Long.valueOf(jC4));
                                    contentValues.put("data", bArrA8);
                                    contentValues.put("realtime", Integer.valueOf(i3));
                                    if (mVarF3.g0().insert("raw_events", null, contentValues) == -1) {
                                        ((r1) mVarF3.d).a().v().b(v0.z(str15), "Failed to insert raw event (got -1). appId");
                                    } else {
                                        m4Var.H = 0L;
                                    }
                                    m4Var.f0().e0();
                                    m4Var.f0().f0();
                                    m4Var.N();
                                    m4Var.a().y().b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                                    return;
                                }
                                str12 = str12;
                                r1Var2.p().t();
                                String str316 = Build.MODEL;
                                h3VarU.k();
                                r1Var2.p().t();
                                String str317 = Build.VERSION.RELEASE;
                                h3VarU.b();
                                ((com.gamericefishpro.space.i9.i3) h3VarU.e).o0(str317);
                                h3VarU.m((int) r1Var2.p().v());
                                h3VarU.l(r1Var2.p().w());
                                h3VarU.S(t4Var.P);
                                if (r1Var2.b()) {
                                    h3VarU.o();
                                    if (!TextUtils.isEmpty(null)) {
                                        h3VarU.b();
                                        ((com.gamericefishpro.space.i9.i3) h3VarU.e).R0(null);
                                        throw null;
                                    }
                                }
                                a1VarT0 = f0().t0(str6);
                                if (a1VarT0 == null) {
                                    a1VarT0 = new a1(r1Var2, str6);
                                    m4Var = this;
                                    a1VarT0.F(m4Var.o(e2VarJ2));
                                    a1VarT0.K(t4Var.D);
                                    a1VarT0.H(str12);
                                    if (e2VarJ2.i(d2Var)) {
                                        a1VarT0.I(m4Var.B.w(str6, z9));
                                    }
                                    a1VarT0.e(0L);
                                    a1VarT0.L(0L);
                                    a1VarT0.M(0L);
                                    a1VarT0.O(str14);
                                    a1VarT0.Q(j2);
                                    a1VarT0.R(str11);
                                    a1VarT0.S(j6);
                                    a1VarT0.a(j8);
                                    a1VarT0.d(z10);
                                    a1VarT0.c(j4);
                                    i = 0;
                                    m4Var.f0().u0(a1VarT0, false);
                                } else {
                                    i = 0;
                                    m4Var = this;
                                }
                                if (e2VarJ2.i(d2.ANALYTICS_STORAGE)) {
                                    String strE5 = a1VarT0.E();
                                    com.gamericefishpro.space.v8.c0.g(strE5);
                                    h3VarU.v(strE5);
                                }
                                if (!TextUtils.isEmpty(a1VarT0.J())) {
                                    String strJ5 = a1VarT0.J();
                                    com.gamericefishpro.space.v8.c0.g(strJ5);
                                    h3VarU.K(strJ5);
                                }
                                listM0 = m4Var.f0().m0(str6);
                                i2 = i;
                                while (i2 < listM0.size()) {
                                    com.gamericefishpro.space.i9.q3 q3VarA5 = com.gamericefishpro.space.i9.r3.A();
                                    String str318 = ((p4) listM0.get(i2)).c;
                                    q3VarA5.b();
                                    ((com.gamericefishpro.space.i9.r3) q3VarA5.e).C(str318);
                                    long j18 = ((p4) listM0.get(i2)).d;
                                    q3VarA5.b();
                                    ((com.gamericefishpro.space.i9.r3) q3VarA5.e).B(j18);
                                    m4Var.i0().P(q3VarA5, ((p4) listM0.get(i2)).e);
                                    h3VarU.Z(q3VarA5);
                                    if ("_sid".equals(((p4) listM0.get(i2)).c)) {
                                        p1 p1Var14 = a1VarT0.a.z;
                                        r1.l(p1Var14);
                                        p1Var14.r();
                                        if (a1VarT0.w != 0) {
                                            z0VarI0 = m4Var.i0();
                                            if (TextUtils.isEmpty(str13)) {
                                                str16 = str13;
                                                jC0 = 0;
                                            } else {
                                                str16 = str13;
                                                jC0 = z0VarI0.c0(str16.getBytes(Charset.forName("UTF-8")));
                                            }
                                            p1 p1Var15 = a1VarT0.a.z;
                                            r1.l(p1Var15);
                                            p1Var15.r();
                                            if (jC0 != a1VarT0.w) {
                                                h3VarU.b();
                                                ((com.gamericefishpro.space.i9.i3) h3VarU.e).Z0();
                                            }
                                        } else {
                                            str16 = str13;
                                        }
                                    } else {
                                        str16 = str13;
                                    }
                                    i2++;
                                    str13 = str16;
                                }
                                mVarF2 = m4Var.f0();
                                com.gamericefishpro.space.i9.i3 i3Var5 = (com.gamericefishpro.space.i9.i3) h3VarU.e();
                                mVarF2.r();
                                mVarF2.s();
                                com.gamericefishpro.space.v8.c0.d(i3Var5.p());
                                byte[] bArrA9 = i3Var5.a();
                                long jC5 = mVarF2.e.i0().c0(bArrA9);
                                ContentValues contentValues6 = new ContentValues();
                                contentValues6.put("app_id", i3Var5.p());
                                contentValues6.put("metadata_fingerprint", Long.valueOf(jC5));
                                contentValues6.put("metadata", bArrA9);
                                mVarF2.g0().insertWithOnConflict("raw_events_metadata", null, contentValues6, 4);
                                mVarF3 = m4Var.f0();
                                t tVar6 = qVar2.f;
                                Objects.requireNonNull(tVar6);
                                it2 = tVar6.d.keySet().iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        l1 l1VarE5 = m4Var.e0();
                                        String str319 = qVar2.a;
                                        zH = l1VarE5.H(str319, qVar2.b);
                                        j jVarV4 = m4Var.f0().v0(m4Var.g(), str319, false, false, false, false);
                                        if (zH) {
                                        }
                                        i3 = i;
                                        break;
                                    }
                                    if ("_r".equals(it2.next())) {
                                    }
                                    i3 = 1;
                                    break;
                                }
                                mVarF3.r();
                                mVarF3.s();
                                str15 = qVar2.a;
                                com.gamericefishpro.space.v8.c0.d(str15);
                                byte[] bArrA10 = mVarF3.e.i0().T(qVar2).a();
                                contentValues = new ContentValues();
                                contentValues.put("app_id", str15);
                                contentValues.put("name", qVar2.b);
                                contentValues.put("timestamp", Long.valueOf(qVar2.d));
                                contentValues.put("metadata_fingerprint", Long.valueOf(jC5));
                                contentValues.put("data", bArrA10);
                                contentValues.put("realtime", Integer.valueOf(i3));
                                if (mVarF3.g0().insert("raw_events", null, contentValues) == -1) {
                                    ((r1) mVarF3.d).a().v().b(v0.z(str15), "Failed to insert raw event (got -1). appId");
                                } else {
                                    m4Var.H = 0L;
                                }
                                m4Var.f0().e0();
                                m4Var.f0().f0();
                                m4Var.N();
                                m4Var.a().y().b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                                return;
                                m4Var.f0().f0();
                                throw th;
                            }
                            if (jIntValue % 1000 == 1) {
                                a().v().c("Data loss. Too many events logged. appId, count", v0.z(str5), Long.valueOf(jVarW0.b));
                            }
                            f0().e0();
                            f0().f0();
                        }
                        mVarF0.g0().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '!_ltv!_%' escape '!'order by set_timestamp desc limit ?,10);", new String[]{str22, str22, String.valueOf(iZ)});
                    } catch (SQLiteException e6) {
                        ((r1) mVarF0.d).a().v().c("Error pruning currencies. appId", v0.z(str22), e6);
                    }
                    mVarF0 = f0();
                    iZ = d0().z(str22, e0.T) - 1;
                    com.gamericefishpro.space.v8.c0.d(str22);
                    mVarF0.r();
                    mVarF0.s();
                    String str41 = uVarC.i;
                    e().getClass();
                    str4 = str22;
                    p4Var = new p4(str4, str41, strConcat, System.currentTimeMillis(), Long.valueOf(jRound));
                    p4Var2 = p4Var;
                    if (!f0().k0(p4Var2)) {
                        a().v().d("Too many unique user properties are set. Ignoring user property. appId", v0.z(str4), r1Var2.m().c(p4Var2.c), p4Var2.e);
                        j0();
                        r4.H(j4Var3, str4, 9, null, null, 0);
                        j4Var = j4Var3;
                    }
                    zP0 = r4.p0(str26);
                    zEquals = "_err".equals(str26);
                    j0();
                    if (tVar == null) {
                        length = 0;
                    } else {
                        it = tVar.d.keySet().iterator();
                        length = 0;
                        while (it.hasNext()) {
                            objB = tVar.b(it.next());
                            if (objB instanceof Parcelable[]) {
                                length += (long) ((Parcelable[]) objB).length;
                            }
                        }
                    }
                    str5 = str4;
                    jVarW0 = f0().w0(g(), str5, length + 1, true, zP0, false, zEquals, false, false, false);
                    long j19 = jVarW0.b;
                    d0();
                    jIntValue = j19 - ((long) ((Integer) e0.l.a(null)).intValue());
                    if (jIntValue <= 0) {
                        if (zP0) {
                            long j110 = jVarW0.a;
                            d0();
                            jIntValue2 = j110 - ((long) ((Integer) e0.n.a(null)).intValue());
                            if (jIntValue2 > 0) {
                                if (jIntValue2 % 1000 == 1) {
                                    a().v().c("Data loss. Too many public events logged. appId, count", v0.z(str5), Long.valueOf(jVarW0.a));
                                }
                                j0();
                                r4.H(j4Var, str5, 16, "_ev", uVarC.d, 0);
                                f0().e0();
                            }
                        }
                        str6 = str5;
                        if (zEquals) {
                            jMax = jVarW0.d - ((long) Math.max(0, Math.min(1000000, d0().z(str6, e0.m))));
                            if (jMax > 0) {
                                if (jMax == 1) {
                                    a().v().c("Too many error events logged. appId, count", v0.z(str6), Long.valueOf(jVarW0.d));
                                }
                                f0().e0();
                            }
                        }
                        bundleF = tVar.f();
                        r4 r4VarJ3 = j0();
                        String str213 = uVarC.i;
                        r4VarJ3.G(bundleF, "_o", str213);
                        if (j0().R(str6, t4Var.U)) {
                            j0().G(bundleF, "_dbg", 1L);
                            j0().G(bundleF, "_r", 1L);
                        }
                        if ("_s".equals(str26)) {
                            obj2 = p4VarL0.e;
                            if (obj2 instanceof Long) {
                                j0().G(bundleF, "_sno", obj2);
                            }
                        }
                        if (d0().B(null, e0.X0)) {
                            obj = bundleF.get("value");
                            if (obj instanceof String) {
                                double d3 = Double.parseDouble((String) obj);
                                bundleF.remove("value");
                                bundleF.putDouble("value", d3);
                            }
                        }
                        mVarF1 = f0();
                        com.gamericefishpro.space.v8.c0.d(str6);
                        mVarF1.r();
                        mVarF1.s();
                        jDelete = mVarF1.g0().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str6, String.valueOf(Math.max(0, Math.min(1000000, ((r1) mVarF1.d).v.z(str6, e0.q))))});
                        if (jDelete > 0) {
                            a().w().c("Data lost. Too many events stored on disk, deleted. appId", v0.z(str6), Long.valueOf(jDelete));
                        }
                        r1Var = this.E;
                        qVar = new q(r1Var, uVarC.i, str6, uVarC.d, uVarC.v, 0L, bundleF);
                        m mVarF6 = f0();
                        str7 = qVar.b;
                        String str214 = str17;
                        rVarP = mVarF6.P(str214, str6, str7);
                        if (rVarP == null) {
                            jH = f0().H(str6);
                            gVarD0 = d0();
                            gVarD0.getClass();
                            d0Var = e0.W;
                            j4Var2 = j4Var;
                            if (jH >= Math.max(Math.min(gVarD0.z(str6, d0Var), 2000), PermissionsActivity.DELAY_TIME_CALLBACK_CALL)) {
                            }
                            j4Var = j4Var2;
                            rVarA = new r(str6, str7, 0L, 0L, 0L, qVar.d, 0L, null, null, null, null);
                            str6 = str6;
                        } else {
                            qVar = qVar.a(r1Var, rVarP.f);
                            rVarA = rVarP.a(qVar.d);
                        }
                        qVar2 = qVar;
                        f0().Q(str214, rVarA);
                        c().r();
                        k0();
                        String str215 = qVar2.a;
                        com.gamericefishpro.space.v8.c0.d(str215);
                        com.gamericefishpro.space.v8.c0.b(str215.equals(str6));
                        h3VarU = com.gamericefishpro.space.i9.i3.U();
                        h3VarU.y();
                        h3VarU.j();
                        if (!TextUtils.isEmpty(str6)) {
                            h3VarU.p(str6);
                        }
                        if (TextUtils.isEmpty(str3)) {
                            str8 = str3;
                            h3VarU.n(str8);
                        } else {
                            str8 = str3;
                        }
                        if (TextUtils.isEmpty(str2)) {
                            str9 = str2;
                            h3VarU.q(str9);
                        } else {
                            str9 = str2;
                        }
                        if (TextUtils.isEmpty(str)) {
                            str10 = str;
                            h3VarU.R(str10);
                        } else {
                            str10 = str;
                        }
                        if (j7 != -2147483648L) {
                            j = j7;
                            h3VarU.L((int) j);
                        } else {
                            j = j7;
                        }
                        str11 = str8;
                        h3VarU.r(j6);
                        if (TextUtils.isEmpty(str23)) {
                            str12 = str23;
                            h3VarU.H(str12);
                        } else {
                            str12 = str23;
                        }
                        com.gamericefishpro.space.v8.c0.g(str6);
                        str13 = str10;
                        e2VarJ = b(str6).j(e2.c(100, str18));
                        h3VarU.Q(e2VarJ.f());
                        r8.a();
                        zB = d0().B(str6, e0.P0);
                        d2Var = d2.AD_STORAGE;
                        if (zB) {
                            j0();
                            if (r4.N(str6)) {
                                h3VarU.z(t4Var.S);
                                j2 = j;
                                j3 = t4Var.T;
                                if (!e2VarJ.i(d2Var)) {
                                    j3 = (j3 & (-2)) | 32;
                                }
                                if (j3 == 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                h3VarU.T(z);
                                if (j3 != 0) {
                                    com.gamericefishpro.space.i9.p2 p2VarW3 = com.gamericefishpro.space.i9.q2.w();
                                    if ((j3 & 1) != 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    p2VarW3.h(z2);
                                    if ((j3 & 2) != 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    p2VarW3.i(z3);
                                    if ((j3 & 4) != 0) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    p2VarW3.j(z4);
                                    if ((j3 & 8) != 0) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    p2VarW3.k(z5);
                                    if ((j3 & 16) != 0) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    p2VarW3.l(z6);
                                    if ((j3 & 32) != 0) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    p2VarW3.m(z7);
                                    if ((j3 & 64) != 0) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    p2VarW3.n(z8);
                                    h3VarU.A((com.gamericefishpro.space.i9.q2) p2VarW3.e());
                                }
                            } else {
                                j2 = j;
                            }
                        } else {
                            j2 = j;
                        }
                        if (j8 != 0) {
                            h3VarU.w(j8);
                            j8 = j8;
                        }
                        h3VarU.O(j4);
                        z0 z0VarI3 = i0();
                        d4VarA = com.gamericefishpro.space.i9.d4.a(z0VarI3.e.E.d().getContentResolver(), com.gamericefishpro.space.i9.j4.a(), c0.e);
                        if (d4VarA == null) {
                            mapB = Collections.EMPTY_MAP;
                        } else {
                            mapB = d4VarA.b();
                        }
                        if (mapB == null) {
                            str14 = str9;
                            arrayList = null;
                        } else {
                            str14 = str9;
                            arrayList = null;
                        }
                        if (arrayList != null) {
                            h3VarU.N(arrayList);
                        }
                        if (d0().B(null, e0.a1)) {
                            h3VarU.D();
                        }
                        e2VarJ2 = b(str6).j(e2.c(100, str18));
                        if (e2VarJ2.i(d2Var)) {
                            str12 = str12;
                            r1Var2.p().t();
                            String str3110 = Build.MODEL;
                            h3VarU.k();
                            r1Var2.p().t();
                            String str3111 = Build.VERSION.RELEASE;
                            h3VarU.b();
                            ((com.gamericefishpro.space.i9.i3) h3VarU.e).o0(str3111);
                            h3VarU.m((int) r1Var2.p().v());
                            h3VarU.l(r1Var2.p().w());
                            h3VarU.S(t4Var.P);
                            if (r1Var2.b()) {
                                h3VarU.o();
                                if (!TextUtils.isEmpty(null)) {
                                    h3VarU.b();
                                    ((com.gamericefishpro.space.i9.i3) h3VarU.e).R0(null);
                                    throw null;
                                }
                            }
                            a1VarT0 = f0().t0(str6);
                            if (a1VarT0 == null) {
                                a1VarT0 = new a1(r1Var2, str6);
                                m4Var = this;
                                a1VarT0.F(m4Var.o(e2VarJ2));
                                a1VarT0.K(t4Var.D);
                                a1VarT0.H(str12);
                                if (e2VarJ2.i(d2Var)) {
                                    a1VarT0.I(m4Var.B.w(str6, z9));
                                }
                                a1VarT0.e(0L);
                                a1VarT0.L(0L);
                                a1VarT0.M(0L);
                                a1VarT0.O(str14);
                                a1VarT0.Q(j2);
                                a1VarT0.R(str11);
                                a1VarT0.S(j6);
                                a1VarT0.a(j8);
                                a1VarT0.d(z10);
                                a1VarT0.c(j4);
                                i = 0;
                                m4Var.f0().u0(a1VarT0, false);
                            } else {
                                i = 0;
                                m4Var = this;
                            }
                            if (e2VarJ2.i(d2.ANALYTICS_STORAGE)) {
                                String strE6 = a1VarT0.E();
                                com.gamericefishpro.space.v8.c0.g(strE6);
                                h3VarU.v(strE6);
                            }
                            if (!TextUtils.isEmpty(a1VarT0.J())) {
                                String strJ6 = a1VarT0.J();
                                com.gamericefishpro.space.v8.c0.g(strJ6);
                                h3VarU.K(strJ6);
                            }
                            listM0 = m4Var.f0().m0(str6);
                            i2 = i;
                            while (i2 < listM0.size()) {
                                com.gamericefishpro.space.i9.q3 q3VarA6 = com.gamericefishpro.space.i9.r3.A();
                                String str3112 = ((p4) listM0.get(i2)).c;
                                q3VarA6.b();
                                ((com.gamericefishpro.space.i9.r3) q3VarA6.e).C(str3112);
                                long j111 = ((p4) listM0.get(i2)).d;
                                q3VarA6.b();
                                ((com.gamericefishpro.space.i9.r3) q3VarA6.e).B(j111);
                                m4Var.i0().P(q3VarA6, ((p4) listM0.get(i2)).e);
                                h3VarU.Z(q3VarA6);
                                if ("_sid".equals(((p4) listM0.get(i2)).c)) {
                                    p1 p1Var16 = a1VarT0.a.z;
                                    r1.l(p1Var16);
                                    p1Var16.r();
                                    if (a1VarT0.w != 0) {
                                        z0VarI0 = m4Var.i0();
                                        if (TextUtils.isEmpty(str13)) {
                                            str16 = str13;
                                            jC0 = 0;
                                        } else {
                                            str16 = str13;
                                            jC0 = z0VarI0.c0(str16.getBytes(Charset.forName("UTF-8")));
                                        }
                                        p1 p1Var17 = a1VarT0.a.z;
                                        r1.l(p1Var17);
                                        p1Var17.r();
                                        if (jC0 != a1VarT0.w) {
                                            h3VarU.b();
                                            ((com.gamericefishpro.space.i9.i3) h3VarU.e).Z0();
                                        }
                                    } else {
                                        str16 = str13;
                                    }
                                } else {
                                    str16 = str13;
                                }
                                i2++;
                                str13 = str16;
                            }
                            mVarF2 = m4Var.f0();
                            com.gamericefishpro.space.i9.i3 i3Var6 = (com.gamericefishpro.space.i9.i3) h3VarU.e();
                            mVarF2.r();
                            mVarF2.s();
                            com.gamericefishpro.space.v8.c0.d(i3Var6.p());
                            byte[] bArrA11 = i3Var6.a();
                            long jC6 = mVarF2.e.i0().c0(bArrA11);
                            ContentValues contentValues7 = new ContentValues();
                            contentValues7.put("app_id", i3Var6.p());
                            contentValues7.put("metadata_fingerprint", Long.valueOf(jC6));
                            contentValues7.put("metadata", bArrA11);
                            mVarF2.g0().insertWithOnConflict("raw_events_metadata", null, contentValues7, 4);
                            mVarF3 = m4Var.f0();
                            t tVar7 = qVar2.f;
                            Objects.requireNonNull(tVar7);
                            it2 = tVar7.d.keySet().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    l1 l1VarE6 = m4Var.e0();
                                    String str3113 = qVar2.a;
                                    zH = l1VarE6.H(str3113, qVar2.b);
                                    j jVarV5 = m4Var.f0().v0(m4Var.g(), str3113, false, false, false, false);
                                    if (zH) {
                                    }
                                    i3 = i;
                                    break;
                                }
                                if ("_r".equals(it2.next())) {
                                }
                                i3 = 1;
                                break;
                            }
                            mVarF3.r();
                            mVarF3.s();
                            str15 = qVar2.a;
                            com.gamericefishpro.space.v8.c0.d(str15);
                            byte[] bArrA12 = mVarF3.e.i0().T(qVar2).a();
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str15);
                            contentValues.put("name", qVar2.b);
                            contentValues.put("timestamp", Long.valueOf(qVar2.d));
                            contentValues.put("metadata_fingerprint", Long.valueOf(jC6));
                            contentValues.put("data", bArrA12);
                            contentValues.put("realtime", Integer.valueOf(i3));
                            if (mVarF3.g0().insert("raw_events", null, contentValues) == -1) {
                                ((r1) mVarF3.d).a().v().b(v0.z(str15), "Failed to insert raw event (got -1). appId");
                            } else {
                                m4Var.H = 0L;
                            }
                            m4Var.f0().e0();
                            m4Var.f0().f0();
                            m4Var.N();
                            m4Var.a().y().b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                            return;
                        }
                        str12 = str12;
                        r1Var2.p().t();
                        String str3114 = Build.MODEL;
                        h3VarU.k();
                        r1Var2.p().t();
                        String str3115 = Build.VERSION.RELEASE;
                        h3VarU.b();
                        ((com.gamericefishpro.space.i9.i3) h3VarU.e).o0(str3115);
                        h3VarU.m((int) r1Var2.p().v());
                        h3VarU.l(r1Var2.p().w());
                        h3VarU.S(t4Var.P);
                        if (r1Var2.b()) {
                            h3VarU.o();
                            if (!TextUtils.isEmpty(null)) {
                                h3VarU.b();
                                ((com.gamericefishpro.space.i9.i3) h3VarU.e).R0(null);
                                throw null;
                            }
                        }
                        a1VarT0 = f0().t0(str6);
                        if (a1VarT0 == null) {
                            a1VarT0 = new a1(r1Var2, str6);
                            m4Var = this;
                            a1VarT0.F(m4Var.o(e2VarJ2));
                            a1VarT0.K(t4Var.D);
                            a1VarT0.H(str12);
                            if (e2VarJ2.i(d2Var)) {
                                a1VarT0.I(m4Var.B.w(str6, z9));
                            }
                            a1VarT0.e(0L);
                            a1VarT0.L(0L);
                            a1VarT0.M(0L);
                            a1VarT0.O(str14);
                            a1VarT0.Q(j2);
                            a1VarT0.R(str11);
                            a1VarT0.S(j6);
                            a1VarT0.a(j8);
                            a1VarT0.d(z10);
                            a1VarT0.c(j4);
                            i = 0;
                            m4Var.f0().u0(a1VarT0, false);
                        } else {
                            i = 0;
                            m4Var = this;
                        }
                        if (e2VarJ2.i(d2.ANALYTICS_STORAGE)) {
                            String strE7 = a1VarT0.E();
                            com.gamericefishpro.space.v8.c0.g(strE7);
                            h3VarU.v(strE7);
                        }
                        if (!TextUtils.isEmpty(a1VarT0.J())) {
                            String strJ7 = a1VarT0.J();
                            com.gamericefishpro.space.v8.c0.g(strJ7);
                            h3VarU.K(strJ7);
                        }
                        listM0 = m4Var.f0().m0(str6);
                        i2 = i;
                        while (i2 < listM0.size()) {
                            com.gamericefishpro.space.i9.q3 q3VarA7 = com.gamericefishpro.space.i9.r3.A();
                            String str3116 = ((p4) listM0.get(i2)).c;
                            q3VarA7.b();
                            ((com.gamericefishpro.space.i9.r3) q3VarA7.e).C(str3116);
                            long j112 = ((p4) listM0.get(i2)).d;
                            q3VarA7.b();
                            ((com.gamericefishpro.space.i9.r3) q3VarA7.e).B(j112);
                            m4Var.i0().P(q3VarA7, ((p4) listM0.get(i2)).e);
                            h3VarU.Z(q3VarA7);
                            if ("_sid".equals(((p4) listM0.get(i2)).c)) {
                                p1 p1Var18 = a1VarT0.a.z;
                                r1.l(p1Var18);
                                p1Var18.r();
                                if (a1VarT0.w != 0) {
                                    z0VarI0 = m4Var.i0();
                                    if (TextUtils.isEmpty(str13)) {
                                        str16 = str13;
                                        jC0 = 0;
                                    } else {
                                        str16 = str13;
                                        jC0 = z0VarI0.c0(str16.getBytes(Charset.forName("UTF-8")));
                                    }
                                    p1 p1Var19 = a1VarT0.a.z;
                                    r1.l(p1Var19);
                                    p1Var19.r();
                                    if (jC0 != a1VarT0.w) {
                                        h3VarU.b();
                                        ((com.gamericefishpro.space.i9.i3) h3VarU.e).Z0();
                                    }
                                } else {
                                    str16 = str13;
                                }
                            } else {
                                str16 = str13;
                            }
                            i2++;
                            str13 = str16;
                        }
                        mVarF2 = m4Var.f0();
                        com.gamericefishpro.space.i9.i3 i3Var7 = (com.gamericefishpro.space.i9.i3) h3VarU.e();
                        mVarF2.r();
                        mVarF2.s();
                        com.gamericefishpro.space.v8.c0.d(i3Var7.p());
                        byte[] bArrA13 = i3Var7.a();
                        long jC7 = mVarF2.e.i0().c0(bArrA13);
                        ContentValues contentValues8 = new ContentValues();
                        contentValues8.put("app_id", i3Var7.p());
                        contentValues8.put("metadata_fingerprint", Long.valueOf(jC7));
                        contentValues8.put("metadata", bArrA13);
                        mVarF2.g0().insertWithOnConflict("raw_events_metadata", null, contentValues8, 4);
                        mVarF3 = m4Var.f0();
                        t tVar8 = qVar2.f;
                        Objects.requireNonNull(tVar8);
                        it2 = tVar8.d.keySet().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                l1 l1VarE7 = m4Var.e0();
                                String str3117 = qVar2.a;
                                zH = l1VarE7.H(str3117, qVar2.b);
                                j jVarV6 = m4Var.f0().v0(m4Var.g(), str3117, false, false, false, false);
                                if (zH) {
                                }
                                i3 = i;
                                break;
                            }
                            if ("_r".equals(it2.next())) {
                            }
                            i3 = 1;
                            break;
                        }
                        mVarF3.r();
                        mVarF3.s();
                        str15 = qVar2.a;
                        com.gamericefishpro.space.v8.c0.d(str15);
                        byte[] bArrA14 = mVarF3.e.i0().T(qVar2).a();
                        contentValues = new ContentValues();
                        contentValues.put("app_id", str15);
                        contentValues.put("name", qVar2.b);
                        contentValues.put("timestamp", Long.valueOf(qVar2.d));
                        contentValues.put("metadata_fingerprint", Long.valueOf(jC7));
                        contentValues.put("data", bArrA14);
                        contentValues.put("realtime", Integer.valueOf(i3));
                        if (mVarF3.g0().insert("raw_events", null, contentValues) == -1) {
                            ((r1) mVarF3.d).a().v().b(v0.z(str15), "Failed to insert raw event (got -1). appId");
                        } else {
                            m4Var.H = 0L;
                        }
                        m4Var.f0().e0();
                        m4Var.f0().f0();
                        m4Var.N();
                        m4Var.a().y().b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                        return;
                        m4Var.f0().f0();
                        throw th;
                    }
                    if (jIntValue % 1000 == 1) {
                        a().v().c("Data loss. Too many events logged. appId, count", v0.z(str5), Long.valueOf(jVarW0.b));
                    }
                    f0().e0();
                    f0().f0();
                }
                j4Var = j4Var3;
                zP0 = r4.p0(str26);
                zEquals = "_err".equals(str26);
                j0();
                if (tVar == null) {
                    length = 0;
                } else {
                    it = tVar.d.keySet().iterator();
                    length = 0;
                    while (it.hasNext()) {
                        objB = tVar.b(it.next());
                        if (objB instanceof Parcelable[]) {
                            length += (long) ((Parcelable[]) objB).length;
                        }
                    }
                }
                str5 = str4;
                jVarW0 = f0().w0(g(), str5, length + 1, true, zP0, false, zEquals, false, false, false);
                long j113 = jVarW0.b;
                d0();
                jIntValue = j113 - ((long) ((Integer) e0.l.a(null)).intValue());
                if (jIntValue <= 0) {
                    if (zP0) {
                        long j114 = jVarW0.a;
                        d0();
                        jIntValue2 = j114 - ((long) ((Integer) e0.n.a(null)).intValue());
                        if (jIntValue2 > 0) {
                            if (jIntValue2 % 1000 == 1) {
                                a().v().c("Data loss. Too many public events logged. appId, count", v0.z(str5), Long.valueOf(jVarW0.a));
                            }
                            j0();
                            r4.H(j4Var, str5, 16, "_ev", uVarC.d, 0);
                            f0().e0();
                        }
                    }
                    str6 = str5;
                    if (zEquals) {
                        jMax = jVarW0.d - ((long) Math.max(0, Math.min(1000000, d0().z(str6, e0.m))));
                        if (jMax > 0) {
                            if (jMax == 1) {
                                a().v().c("Too many error events logged. appId, count", v0.z(str6), Long.valueOf(jVarW0.d));
                            }
                            f0().e0();
                        }
                    }
                    bundleF = tVar.f();
                    r4 r4VarJ4 = j0();
                    String str216 = uVarC.i;
                    r4VarJ4.G(bundleF, "_o", str216);
                    if (j0().R(str6, t4Var.U)) {
                        j0().G(bundleF, "_dbg", 1L);
                        j0().G(bundleF, "_r", 1L);
                    }
                    if ("_s".equals(str26)) {
                        obj2 = p4VarL0.e;
                        if (obj2 instanceof Long) {
                            j0().G(bundleF, "_sno", obj2);
                        }
                    }
                    if (d0().B(null, e0.X0)) {
                        obj = bundleF.get("value");
                        if (obj instanceof String) {
                            double d4 = Double.parseDouble((String) obj);
                            bundleF.remove("value");
                            bundleF.putDouble("value", d4);
                        }
                    }
                    mVarF1 = f0();
                    com.gamericefishpro.space.v8.c0.d(str6);
                    mVarF1.r();
                    mVarF1.s();
                    jDelete = mVarF1.g0().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str6, String.valueOf(Math.max(0, Math.min(1000000, ((r1) mVarF1.d).v.z(str6, e0.q))))});
                    if (jDelete > 0) {
                        a().w().c("Data lost. Too many events stored on disk, deleted. appId", v0.z(str6), Long.valueOf(jDelete));
                    }
                    r1Var = this.E;
                    qVar = new q(r1Var, uVarC.i, str6, uVarC.d, uVarC.v, 0L, bundleF);
                    m mVarF7 = f0();
                    str7 = qVar.b;
                    String str217 = str17;
                    rVarP = mVarF7.P(str217, str6, str7);
                    if (rVarP == null) {
                        jH = f0().H(str6);
                        gVarD0 = d0();
                        gVarD0.getClass();
                        d0Var = e0.W;
                        j4Var2 = j4Var;
                        if (jH >= Math.max(Math.min(gVarD0.z(str6, d0Var), 2000), PermissionsActivity.DELAY_TIME_CALLBACK_CALL)) {
                        }
                        j4Var = j4Var2;
                        rVarA = new r(str6, str7, 0L, 0L, 0L, qVar.d, 0L, null, null, null, null);
                        str6 = str6;
                    } else {
                        qVar = qVar.a(r1Var, rVarP.f);
                        rVarA = rVarP.a(qVar.d);
                    }
                    qVar2 = qVar;
                    f0().Q(str217, rVarA);
                    c().r();
                    k0();
                    String str218 = qVar2.a;
                    com.gamericefishpro.space.v8.c0.d(str218);
                    com.gamericefishpro.space.v8.c0.b(str218.equals(str6));
                    h3VarU = com.gamericefishpro.space.i9.i3.U();
                    h3VarU.y();
                    h3VarU.j();
                    if (!TextUtils.isEmpty(str6)) {
                        h3VarU.p(str6);
                    }
                    if (TextUtils.isEmpty(str3)) {
                        str8 = str3;
                        h3VarU.n(str8);
                    } else {
                        str8 = str3;
                    }
                    if (TextUtils.isEmpty(str2)) {
                        str9 = str2;
                        h3VarU.q(str9);
                    } else {
                        str9 = str2;
                    }
                    if (TextUtils.isEmpty(str)) {
                        str10 = str;
                        h3VarU.R(str10);
                    } else {
                        str10 = str;
                    }
                    if (j7 != -2147483648L) {
                        j = j7;
                        h3VarU.L((int) j);
                    } else {
                        j = j7;
                    }
                    str11 = str8;
                    h3VarU.r(j6);
                    if (TextUtils.isEmpty(str23)) {
                        str12 = str23;
                        h3VarU.H(str12);
                    } else {
                        str12 = str23;
                    }
                    com.gamericefishpro.space.v8.c0.g(str6);
                    str13 = str10;
                    e2VarJ = b(str6).j(e2.c(100, str18));
                    h3VarU.Q(e2VarJ.f());
                    r8.a();
                    zB = d0().B(str6, e0.P0);
                    d2Var = d2.AD_STORAGE;
                    if (zB) {
                        j0();
                        if (r4.N(str6)) {
                            h3VarU.z(t4Var.S);
                            j2 = j;
                            j3 = t4Var.T;
                            if (!e2VarJ.i(d2Var)) {
                                j3 = (j3 & (-2)) | 32;
                            }
                            if (j3 == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            h3VarU.T(z);
                            if (j3 != 0) {
                                com.gamericefishpro.space.i9.p2 p2VarW4 = com.gamericefishpro.space.i9.q2.w();
                                if ((j3 & 1) != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                p2VarW4.h(z2);
                                if ((j3 & 2) != 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                p2VarW4.i(z3);
                                if ((j3 & 4) != 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                p2VarW4.j(z4);
                                if ((j3 & 8) != 0) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                p2VarW4.k(z5);
                                if ((j3 & 16) != 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                p2VarW4.l(z6);
                                if ((j3 & 32) != 0) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                p2VarW4.m(z7);
                                if ((j3 & 64) != 0) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                p2VarW4.n(z8);
                                h3VarU.A((com.gamericefishpro.space.i9.q2) p2VarW4.e());
                            }
                        } else {
                            j2 = j;
                        }
                    } else {
                        j2 = j;
                    }
                    if (j8 != 0) {
                        h3VarU.w(j8);
                        j8 = j8;
                    }
                    h3VarU.O(j4);
                    z0 z0VarI4 = i0();
                    d4VarA = com.gamericefishpro.space.i9.d4.a(z0VarI4.e.E.d().getContentResolver(), com.gamericefishpro.space.i9.j4.a(), c0.e);
                    if (d4VarA == null) {
                        mapB = Collections.EMPTY_MAP;
                    } else {
                        mapB = d4VarA.b();
                    }
                    if (mapB == null) {
                        str14 = str9;
                        arrayList = null;
                    } else {
                        str14 = str9;
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        h3VarU.N(arrayList);
                    }
                    if (d0().B(null, e0.a1)) {
                        h3VarU.D();
                    }
                    e2VarJ2 = b(str6).j(e2.c(100, str18));
                    if (e2VarJ2.i(d2Var)) {
                        str12 = str12;
                        r1Var2.p().t();
                        String str3118 = Build.MODEL;
                        h3VarU.k();
                        r1Var2.p().t();
                        String str3119 = Build.VERSION.RELEASE;
                        h3VarU.b();
                        ((com.gamericefishpro.space.i9.i3) h3VarU.e).o0(str3119);
                        h3VarU.m((int) r1Var2.p().v());
                        h3VarU.l(r1Var2.p().w());
                        h3VarU.S(t4Var.P);
                        if (r1Var2.b()) {
                            h3VarU.o();
                            if (!TextUtils.isEmpty(null)) {
                                h3VarU.b();
                                ((com.gamericefishpro.space.i9.i3) h3VarU.e).R0(null);
                                throw null;
                            }
                        }
                        a1VarT0 = f0().t0(str6);
                        if (a1VarT0 == null) {
                            a1VarT0 = new a1(r1Var2, str6);
                            m4Var = this;
                            a1VarT0.F(m4Var.o(e2VarJ2));
                            a1VarT0.K(t4Var.D);
                            a1VarT0.H(str12);
                            if (e2VarJ2.i(d2Var)) {
                                a1VarT0.I(m4Var.B.w(str6, z9));
                            }
                            a1VarT0.e(0L);
                            a1VarT0.L(0L);
                            a1VarT0.M(0L);
                            a1VarT0.O(str14);
                            a1VarT0.Q(j2);
                            a1VarT0.R(str11);
                            a1VarT0.S(j6);
                            a1VarT0.a(j8);
                            a1VarT0.d(z10);
                            a1VarT0.c(j4);
                            i = 0;
                            m4Var.f0().u0(a1VarT0, false);
                        } else {
                            i = 0;
                            m4Var = this;
                        }
                        if (e2VarJ2.i(d2.ANALYTICS_STORAGE)) {
                            String strE8 = a1VarT0.E();
                            com.gamericefishpro.space.v8.c0.g(strE8);
                            h3VarU.v(strE8);
                        }
                        if (!TextUtils.isEmpty(a1VarT0.J())) {
                            String strJ8 = a1VarT0.J();
                            com.gamericefishpro.space.v8.c0.g(strJ8);
                            h3VarU.K(strJ8);
                        }
                        listM0 = m4Var.f0().m0(str6);
                        i2 = i;
                        while (i2 < listM0.size()) {
                            com.gamericefishpro.space.i9.q3 q3VarA8 = com.gamericefishpro.space.i9.r3.A();
                            String str31110 = ((p4) listM0.get(i2)).c;
                            q3VarA8.b();
                            ((com.gamericefishpro.space.i9.r3) q3VarA8.e).C(str31110);
                            long j115 = ((p4) listM0.get(i2)).d;
                            q3VarA8.b();
                            ((com.gamericefishpro.space.i9.r3) q3VarA8.e).B(j115);
                            m4Var.i0().P(q3VarA8, ((p4) listM0.get(i2)).e);
                            h3VarU.Z(q3VarA8);
                            if ("_sid".equals(((p4) listM0.get(i2)).c)) {
                                p1 p1Var110 = a1VarT0.a.z;
                                r1.l(p1Var110);
                                p1Var110.r();
                                if (a1VarT0.w != 0) {
                                    z0VarI0 = m4Var.i0();
                                    if (TextUtils.isEmpty(str13)) {
                                        str16 = str13;
                                        jC0 = 0;
                                    } else {
                                        str16 = str13;
                                        jC0 = z0VarI0.c0(str16.getBytes(Charset.forName("UTF-8")));
                                    }
                                    p1 p1Var111 = a1VarT0.a.z;
                                    r1.l(p1Var111);
                                    p1Var111.r();
                                    if (jC0 != a1VarT0.w) {
                                        h3VarU.b();
                                        ((com.gamericefishpro.space.i9.i3) h3VarU.e).Z0();
                                    }
                                } else {
                                    str16 = str13;
                                }
                            } else {
                                str16 = str13;
                            }
                            i2++;
                            str13 = str16;
                        }
                        mVarF2 = m4Var.f0();
                        com.gamericefishpro.space.i9.i3 i3Var8 = (com.gamericefishpro.space.i9.i3) h3VarU.e();
                        mVarF2.r();
                        mVarF2.s();
                        com.gamericefishpro.space.v8.c0.d(i3Var8.p());
                        byte[] bArrA15 = i3Var8.a();
                        long jC8 = mVarF2.e.i0().c0(bArrA15);
                        ContentValues contentValues9 = new ContentValues();
                        contentValues9.put("app_id", i3Var8.p());
                        contentValues9.put("metadata_fingerprint", Long.valueOf(jC8));
                        contentValues9.put("metadata", bArrA15);
                        mVarF2.g0().insertWithOnConflict("raw_events_metadata", null, contentValues9, 4);
                        mVarF3 = m4Var.f0();
                        t tVar9 = qVar2.f;
                        Objects.requireNonNull(tVar9);
                        it2 = tVar9.d.keySet().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                l1 l1VarE8 = m4Var.e0();
                                String str31111 = qVar2.a;
                                zH = l1VarE8.H(str31111, qVar2.b);
                                j jVarV7 = m4Var.f0().v0(m4Var.g(), str31111, false, false, false, false);
                                if (zH) {
                                }
                                i3 = i;
                                break;
                            }
                            if ("_r".equals(it2.next())) {
                            }
                            i3 = 1;
                            break;
                        }
                        mVarF3.r();
                        mVarF3.s();
                        str15 = qVar2.a;
                        com.gamericefishpro.space.v8.c0.d(str15);
                        byte[] bArrA16 = mVarF3.e.i0().T(qVar2).a();
                        contentValues = new ContentValues();
                        contentValues.put("app_id", str15);
                        contentValues.put("name", qVar2.b);
                        contentValues.put("timestamp", Long.valueOf(qVar2.d));
                        contentValues.put("metadata_fingerprint", Long.valueOf(jC8));
                        contentValues.put("data", bArrA16);
                        contentValues.put("realtime", Integer.valueOf(i3));
                        if (mVarF3.g0().insert("raw_events", null, contentValues) == -1) {
                            ((r1) mVarF3.d).a().v().b(v0.z(str15), "Failed to insert raw event (got -1). appId");
                        } else {
                            m4Var.H = 0L;
                        }
                        m4Var.f0().e0();
                        m4Var.f0().f0();
                        m4Var.N();
                        m4Var.a().y().b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                        return;
                    }
                    str12 = str12;
                    r1Var2.p().t();
                    String str31112 = Build.MODEL;
                    h3VarU.k();
                    r1Var2.p().t();
                    String str31113 = Build.VERSION.RELEASE;
                    h3VarU.b();
                    ((com.gamericefishpro.space.i9.i3) h3VarU.e).o0(str31113);
                    h3VarU.m((int) r1Var2.p().v());
                    h3VarU.l(r1Var2.p().w());
                    h3VarU.S(t4Var.P);
                    if (r1Var2.b()) {
                        h3VarU.o();
                        if (!TextUtils.isEmpty(null)) {
                            h3VarU.b();
                            ((com.gamericefishpro.space.i9.i3) h3VarU.e).R0(null);
                            throw null;
                        }
                    }
                    a1VarT0 = f0().t0(str6);
                    if (a1VarT0 == null) {
                        a1VarT0 = new a1(r1Var2, str6);
                        m4Var = this;
                        a1VarT0.F(m4Var.o(e2VarJ2));
                        a1VarT0.K(t4Var.D);
                        a1VarT0.H(str12);
                        if (e2VarJ2.i(d2Var)) {
                            a1VarT0.I(m4Var.B.w(str6, z9));
                        }
                        a1VarT0.e(0L);
                        a1VarT0.L(0L);
                        a1VarT0.M(0L);
                        a1VarT0.O(str14);
                        a1VarT0.Q(j2);
                        a1VarT0.R(str11);
                        a1VarT0.S(j6);
                        a1VarT0.a(j8);
                        a1VarT0.d(z10);
                        a1VarT0.c(j4);
                        i = 0;
                        m4Var.f0().u0(a1VarT0, false);
                    } else {
                        i = 0;
                        m4Var = this;
                    }
                    if (e2VarJ2.i(d2.ANALYTICS_STORAGE)) {
                        String strE9 = a1VarT0.E();
                        com.gamericefishpro.space.v8.c0.g(strE9);
                        h3VarU.v(strE9);
                    }
                    if (!TextUtils.isEmpty(a1VarT0.J())) {
                        String strJ9 = a1VarT0.J();
                        com.gamericefishpro.space.v8.c0.g(strJ9);
                        h3VarU.K(strJ9);
                    }
                    listM0 = m4Var.f0().m0(str6);
                    i2 = i;
                    while (i2 < listM0.size()) {
                        com.gamericefishpro.space.i9.q3 q3VarA9 = com.gamericefishpro.space.i9.r3.A();
                        String str31114 = ((p4) listM0.get(i2)).c;
                        q3VarA9.b();
                        ((com.gamericefishpro.space.i9.r3) q3VarA9.e).C(str31114);
                        long j116 = ((p4) listM0.get(i2)).d;
                        q3VarA9.b();
                        ((com.gamericefishpro.space.i9.r3) q3VarA9.e).B(j116);
                        m4Var.i0().P(q3VarA9, ((p4) listM0.get(i2)).e);
                        h3VarU.Z(q3VarA9);
                        if ("_sid".equals(((p4) listM0.get(i2)).c)) {
                            p1 p1Var112 = a1VarT0.a.z;
                            r1.l(p1Var112);
                            p1Var112.r();
                            if (a1VarT0.w != 0) {
                                z0VarI0 = m4Var.i0();
                                if (TextUtils.isEmpty(str13)) {
                                    str16 = str13;
                                    jC0 = 0;
                                } else {
                                    str16 = str13;
                                    jC0 = z0VarI0.c0(str16.getBytes(Charset.forName("UTF-8")));
                                }
                                p1 p1Var113 = a1VarT0.a.z;
                                r1.l(p1Var113);
                                p1Var113.r();
                                if (jC0 != a1VarT0.w) {
                                    h3VarU.b();
                                    ((com.gamericefishpro.space.i9.i3) h3VarU.e).Z0();
                                }
                            } else {
                                str16 = str13;
                            }
                        } else {
                            str16 = str13;
                        }
                        i2++;
                        str13 = str16;
                    }
                    mVarF2 = m4Var.f0();
                    com.gamericefishpro.space.i9.i3 i3Var9 = (com.gamericefishpro.space.i9.i3) h3VarU.e();
                    mVarF2.r();
                    mVarF2.s();
                    com.gamericefishpro.space.v8.c0.d(i3Var9.p());
                    byte[] bArrA17 = i3Var9.a();
                    long jC9 = mVarF2.e.i0().c0(bArrA17);
                    ContentValues contentValues10 = new ContentValues();
                    contentValues10.put("app_id", i3Var9.p());
                    contentValues10.put("metadata_fingerprint", Long.valueOf(jC9));
                    contentValues10.put("metadata", bArrA17);
                    mVarF2.g0().insertWithOnConflict("raw_events_metadata", null, contentValues10, 4);
                    mVarF3 = m4Var.f0();
                    t tVar10 = qVar2.f;
                    Objects.requireNonNull(tVar10);
                    it2 = tVar10.d.keySet().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            l1 l1VarE9 = m4Var.e0();
                            String str31115 = qVar2.a;
                            zH = l1VarE9.H(str31115, qVar2.b);
                            j jVarV8 = m4Var.f0().v0(m4Var.g(), str31115, false, false, false, false);
                            if (zH) {
                            }
                            i3 = i;
                            break;
                        }
                        if ("_r".equals(it2.next())) {
                        }
                        i3 = 1;
                        break;
                    }
                    mVarF3.r();
                    mVarF3.s();
                    str15 = qVar2.a;
                    com.gamericefishpro.space.v8.c0.d(str15);
                    byte[] bArrA18 = mVarF3.e.i0().T(qVar2).a();
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str15);
                    contentValues.put("name", qVar2.b);
                    contentValues.put("timestamp", Long.valueOf(qVar2.d));
                    contentValues.put("metadata_fingerprint", Long.valueOf(jC9));
                    contentValues.put("data", bArrA18);
                    contentValues.put("realtime", Integer.valueOf(i3));
                    if (mVarF3.g0().insert("raw_events", null, contentValues) == -1) {
                        ((r1) mVarF3.d).a().v().b(v0.z(str15), "Failed to insert raw event (got -1). appId");
                    } else {
                        m4Var.H = 0L;
                    }
                    m4Var.f0().e0();
                    m4Var.f0().f0();
                    m4Var.N();
                    m4Var.a().y().b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                    return;
                    m4Var.f0().f0();
                    throw th;
                }
                if (jIntValue % 1000 == 1) {
                    a().v().c("Data loss. Too many events logged. appId, count", v0.z(str5), Long.valueOf(jVarW0.b));
                }
                f0().e0();
                f0().f0();
            }
            str4 = str22;
            j4Var = j4Var3;
            zP0 = r4.p0(str26);
            zEquals = "_err".equals(str26);
            j0();
            if (tVar == null) {
                length = 0;
            } else {
                it = tVar.d.keySet().iterator();
                length = 0;
                while (it.hasNext()) {
                    objB = tVar.b(it.next());
                    if (objB instanceof Parcelable[]) {
                        length += (long) ((Parcelable[]) objB).length;
                    }
                }
            }
            str5 = str4;
            jVarW0 = f0().w0(g(), str5, length + 1, true, zP0, false, zEquals, false, false, false);
            long j117 = jVarW0.b;
            d0();
            jIntValue = j117 - ((long) ((Integer) e0.l.a(null)).intValue());
            if (jIntValue <= 0) {
                if (zP0) {
                    long j118 = jVarW0.a;
                    d0();
                    jIntValue2 = j118 - ((long) ((Integer) e0.n.a(null)).intValue());
                    if (jIntValue2 > 0) {
                        if (jIntValue2 % 1000 == 1) {
                            a().v().c("Data loss. Too many public events logged. appId, count", v0.z(str5), Long.valueOf(jVarW0.a));
                        }
                        j0();
                        r4.H(j4Var, str5, 16, "_ev", uVarC.d, 0);
                        f0().e0();
                    }
                }
                str6 = str5;
                if (zEquals) {
                    jMax = jVarW0.d - ((long) Math.max(0, Math.min(1000000, d0().z(str6, e0.m))));
                    if (jMax > 0) {
                        if (jMax == 1) {
                            a().v().c("Too many error events logged. appId, count", v0.z(str6), Long.valueOf(jVarW0.d));
                        }
                        f0().e0();
                    }
                }
                bundleF = tVar.f();
                r4 r4VarJ5 = j0();
                String str219 = uVarC.i;
                r4VarJ5.G(bundleF, "_o", str219);
                if (j0().R(str6, t4Var.U)) {
                    j0().G(bundleF, "_dbg", 1L);
                    j0().G(bundleF, "_r", 1L);
                }
                if ("_s".equals(str26)) {
                    obj2 = p4VarL0.e;
                    if (obj2 instanceof Long) {
                        j0().G(bundleF, "_sno", obj2);
                    }
                }
                if (d0().B(null, e0.X0)) {
                    obj = bundleF.get("value");
                    if (obj instanceof String) {
                        double d5 = Double.parseDouble((String) obj);
                        bundleF.remove("value");
                        bundleF.putDouble("value", d5);
                    }
                }
                mVarF1 = f0();
                com.gamericefishpro.space.v8.c0.d(str6);
                mVarF1.r();
                mVarF1.s();
                jDelete = mVarF1.g0().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str6, String.valueOf(Math.max(0, Math.min(1000000, ((r1) mVarF1.d).v.z(str6, e0.q))))});
                if (jDelete > 0) {
                    a().w().c("Data lost. Too many events stored on disk, deleted. appId", v0.z(str6), Long.valueOf(jDelete));
                }
                r1Var = this.E;
                qVar = new q(r1Var, uVarC.i, str6, uVarC.d, uVarC.v, 0L, bundleF);
                m mVarF8 = f0();
                str7 = qVar.b;
                String str2110 = str17;
                rVarP = mVarF8.P(str2110, str6, str7);
                if (rVarP == null) {
                    jH = f0().H(str6);
                    gVarD0 = d0();
                    gVarD0.getClass();
                    d0Var = e0.W;
                    j4Var2 = j4Var;
                    if (jH >= Math.max(Math.min(gVarD0.z(str6, d0Var), 2000), PermissionsActivity.DELAY_TIME_CALLBACK_CALL)) {
                    }
                    j4Var = j4Var2;
                    rVarA = new r(str6, str7, 0L, 0L, 0L, qVar.d, 0L, null, null, null, null);
                    str6 = str6;
                } else {
                    qVar = qVar.a(r1Var, rVarP.f);
                    rVarA = rVarP.a(qVar.d);
                }
                qVar2 = qVar;
                f0().Q(str2110, rVarA);
                c().r();
                k0();
                String str2111 = qVar2.a;
                com.gamericefishpro.space.v8.c0.d(str2111);
                com.gamericefishpro.space.v8.c0.b(str2111.equals(str6));
                h3VarU = com.gamericefishpro.space.i9.i3.U();
                h3VarU.y();
                h3VarU.j();
                if (!TextUtils.isEmpty(str6)) {
                    h3VarU.p(str6);
                }
                if (TextUtils.isEmpty(str3)) {
                    str8 = str3;
                    h3VarU.n(str8);
                } else {
                    str8 = str3;
                }
                if (TextUtils.isEmpty(str2)) {
                    str9 = str2;
                    h3VarU.q(str9);
                } else {
                    str9 = str2;
                }
                if (TextUtils.isEmpty(str)) {
                    str10 = str;
                    h3VarU.R(str10);
                } else {
                    str10 = str;
                }
                if (j7 != -2147483648L) {
                    j = j7;
                    h3VarU.L((int) j);
                } else {
                    j = j7;
                }
                str11 = str8;
                h3VarU.r(j6);
                if (TextUtils.isEmpty(str23)) {
                    str12 = str23;
                    h3VarU.H(str12);
                } else {
                    str12 = str23;
                }
                com.gamericefishpro.space.v8.c0.g(str6);
                str13 = str10;
                e2VarJ = b(str6).j(e2.c(100, str18));
                h3VarU.Q(e2VarJ.f());
                r8.a();
                zB = d0().B(str6, e0.P0);
                d2Var = d2.AD_STORAGE;
                if (zB) {
                    j0();
                    if (r4.N(str6)) {
                        h3VarU.z(t4Var.S);
                        j2 = j;
                        j3 = t4Var.T;
                        if (!e2VarJ.i(d2Var)) {
                            j3 = (j3 & (-2)) | 32;
                        }
                        if (j3 == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        h3VarU.T(z);
                        if (j3 != 0) {
                            com.gamericefishpro.space.i9.p2 p2VarW5 = com.gamericefishpro.space.i9.q2.w();
                            if ((j3 & 1) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            p2VarW5.h(z2);
                            if ((j3 & 2) != 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            p2VarW5.i(z3);
                            if ((j3 & 4) != 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            p2VarW5.j(z4);
                            if ((j3 & 8) != 0) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            p2VarW5.k(z5);
                            if ((j3 & 16) != 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            p2VarW5.l(z6);
                            if ((j3 & 32) != 0) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            p2VarW5.m(z7);
                            if ((j3 & 64) != 0) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            p2VarW5.n(z8);
                            h3VarU.A((com.gamericefishpro.space.i9.q2) p2VarW5.e());
                        }
                    } else {
                        j2 = j;
                    }
                } else {
                    j2 = j;
                }
                if (j8 != 0) {
                    h3VarU.w(j8);
                    j8 = j8;
                }
                h3VarU.O(j4);
                z0 z0VarI5 = i0();
                d4VarA = com.gamericefishpro.space.i9.d4.a(z0VarI5.e.E.d().getContentResolver(), com.gamericefishpro.space.i9.j4.a(), c0.e);
                if (d4VarA == null) {
                    mapB = Collections.EMPTY_MAP;
                } else {
                    mapB = d4VarA.b();
                }
                if (mapB == null) {
                    str14 = str9;
                    arrayList = null;
                } else {
                    str14 = str9;
                    arrayList = null;
                }
                if (arrayList != null) {
                    h3VarU.N(arrayList);
                }
                if (d0().B(null, e0.a1)) {
                    h3VarU.D();
                }
                e2VarJ2 = b(str6).j(e2.c(100, str18));
                if (e2VarJ2.i(d2Var)) {
                    str12 = str12;
                    r1Var2.p().t();
                    String str31116 = Build.MODEL;
                    h3VarU.k();
                    r1Var2.p().t();
                    String str31117 = Build.VERSION.RELEASE;
                    h3VarU.b();
                    ((com.gamericefishpro.space.i9.i3) h3VarU.e).o0(str31117);
                    h3VarU.m((int) r1Var2.p().v());
                    h3VarU.l(r1Var2.p().w());
                    h3VarU.S(t4Var.P);
                    if (r1Var2.b()) {
                        h3VarU.o();
                        if (!TextUtils.isEmpty(null)) {
                            h3VarU.b();
                            ((com.gamericefishpro.space.i9.i3) h3VarU.e).R0(null);
                            throw null;
                        }
                    }
                    a1VarT0 = f0().t0(str6);
                    if (a1VarT0 == null) {
                        a1VarT0 = new a1(r1Var2, str6);
                        m4Var = this;
                        a1VarT0.F(m4Var.o(e2VarJ2));
                        a1VarT0.K(t4Var.D);
                        a1VarT0.H(str12);
                        if (e2VarJ2.i(d2Var)) {
                            a1VarT0.I(m4Var.B.w(str6, z9));
                        }
                        a1VarT0.e(0L);
                        a1VarT0.L(0L);
                        a1VarT0.M(0L);
                        a1VarT0.O(str14);
                        a1VarT0.Q(j2);
                        a1VarT0.R(str11);
                        a1VarT0.S(j6);
                        a1VarT0.a(j8);
                        a1VarT0.d(z10);
                        a1VarT0.c(j4);
                        i = 0;
                        m4Var.f0().u0(a1VarT0, false);
                    } else {
                        i = 0;
                        m4Var = this;
                    }
                    if (e2VarJ2.i(d2.ANALYTICS_STORAGE)) {
                        String strE10 = a1VarT0.E();
                        com.gamericefishpro.space.v8.c0.g(strE10);
                        h3VarU.v(strE10);
                    }
                    if (!TextUtils.isEmpty(a1VarT0.J())) {
                        String strJ10 = a1VarT0.J();
                        com.gamericefishpro.space.v8.c0.g(strJ10);
                        h3VarU.K(strJ10);
                    }
                    listM0 = m4Var.f0().m0(str6);
                    i2 = i;
                    while (i2 < listM0.size()) {
                        com.gamericefishpro.space.i9.q3 q3VarA10 = com.gamericefishpro.space.i9.r3.A();
                        String str31118 = ((p4) listM0.get(i2)).c;
                        q3VarA10.b();
                        ((com.gamericefishpro.space.i9.r3) q3VarA10.e).C(str31118);
                        long j119 = ((p4) listM0.get(i2)).d;
                        q3VarA10.b();
                        ((com.gamericefishpro.space.i9.r3) q3VarA10.e).B(j119);
                        m4Var.i0().P(q3VarA10, ((p4) listM0.get(i2)).e);
                        h3VarU.Z(q3VarA10);
                        if ("_sid".equals(((p4) listM0.get(i2)).c)) {
                            p1 p1Var114 = a1VarT0.a.z;
                            r1.l(p1Var114);
                            p1Var114.r();
                            if (a1VarT0.w != 0) {
                                z0VarI0 = m4Var.i0();
                                if (TextUtils.isEmpty(str13)) {
                                    str16 = str13;
                                    jC0 = 0;
                                } else {
                                    str16 = str13;
                                    jC0 = z0VarI0.c0(str16.getBytes(Charset.forName("UTF-8")));
                                }
                                p1 p1Var115 = a1VarT0.a.z;
                                r1.l(p1Var115);
                                p1Var115.r();
                                if (jC0 != a1VarT0.w) {
                                    h3VarU.b();
                                    ((com.gamericefishpro.space.i9.i3) h3VarU.e).Z0();
                                }
                            } else {
                                str16 = str13;
                            }
                        } else {
                            str16 = str13;
                        }
                        i2++;
                        str13 = str16;
                    }
                    mVarF2 = m4Var.f0();
                    com.gamericefishpro.space.i9.i3 i3Var10 = (com.gamericefishpro.space.i9.i3) h3VarU.e();
                    mVarF2.r();
                    mVarF2.s();
                    com.gamericefishpro.space.v8.c0.d(i3Var10.p());
                    byte[] bArrA19 = i3Var10.a();
                    long jC10 = mVarF2.e.i0().c0(bArrA19);
                    ContentValues contentValues11 = new ContentValues();
                    contentValues11.put("app_id", i3Var10.p());
                    contentValues11.put("metadata_fingerprint", Long.valueOf(jC10));
                    contentValues11.put("metadata", bArrA19);
                    mVarF2.g0().insertWithOnConflict("raw_events_metadata", null, contentValues11, 4);
                    mVarF3 = m4Var.f0();
                    t tVar11 = qVar2.f;
                    Objects.requireNonNull(tVar11);
                    it2 = tVar11.d.keySet().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            l1 l1VarE10 = m4Var.e0();
                            String str31119 = qVar2.a;
                            zH = l1VarE10.H(str31119, qVar2.b);
                            j jVarV9 = m4Var.f0().v0(m4Var.g(), str31119, false, false, false, false);
                            if (zH) {
                            }
                            i3 = i;
                            break;
                        }
                        if ("_r".equals(it2.next())) {
                        }
                        i3 = 1;
                        break;
                    }
                    mVarF3.r();
                    mVarF3.s();
                    str15 = qVar2.a;
                    com.gamericefishpro.space.v8.c0.d(str15);
                    byte[] bArrA110 = mVarF3.e.i0().T(qVar2).a();
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str15);
                    contentValues.put("name", qVar2.b);
                    contentValues.put("timestamp", Long.valueOf(qVar2.d));
                    contentValues.put("metadata_fingerprint", Long.valueOf(jC10));
                    contentValues.put("data", bArrA110);
                    contentValues.put("realtime", Integer.valueOf(i3));
                    if (mVarF3.g0().insert("raw_events", null, contentValues) == -1) {
                        ((r1) mVarF3.d).a().v().b(v0.z(str15), "Failed to insert raw event (got -1). appId");
                    } else {
                        m4Var.H = 0L;
                    }
                    m4Var.f0().e0();
                    m4Var.f0().f0();
                    m4Var.N();
                    m4Var.a().y().b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                    return;
                }
                str12 = str12;
                r1Var2.p().t();
                String str311110 = Build.MODEL;
                h3VarU.k();
                r1Var2.p().t();
                String str311111 = Build.VERSION.RELEASE;
                h3VarU.b();
                ((com.gamericefishpro.space.i9.i3) h3VarU.e).o0(str311111);
                h3VarU.m((int) r1Var2.p().v());
                h3VarU.l(r1Var2.p().w());
                h3VarU.S(t4Var.P);
                if (r1Var2.b()) {
                    h3VarU.o();
                    if (!TextUtils.isEmpty(null)) {
                        h3VarU.b();
                        ((com.gamericefishpro.space.i9.i3) h3VarU.e).R0(null);
                        throw null;
                    }
                }
                a1VarT0 = f0().t0(str6);
                if (a1VarT0 == null) {
                    a1VarT0 = new a1(r1Var2, str6);
                    m4Var = this;
                    a1VarT0.F(m4Var.o(e2VarJ2));
                    a1VarT0.K(t4Var.D);
                    a1VarT0.H(str12);
                    if (e2VarJ2.i(d2Var)) {
                        a1VarT0.I(m4Var.B.w(str6, z9));
                    }
                    a1VarT0.e(0L);
                    a1VarT0.L(0L);
                    a1VarT0.M(0L);
                    a1VarT0.O(str14);
                    a1VarT0.Q(j2);
                    a1VarT0.R(str11);
                    a1VarT0.S(j6);
                    a1VarT0.a(j8);
                    a1VarT0.d(z10);
                    a1VarT0.c(j4);
                    i = 0;
                    m4Var.f0().u0(a1VarT0, false);
                } else {
                    i = 0;
                    m4Var = this;
                }
                if (e2VarJ2.i(d2.ANALYTICS_STORAGE)) {
                    String strE11 = a1VarT0.E();
                    com.gamericefishpro.space.v8.c0.g(strE11);
                    h3VarU.v(strE11);
                }
                if (!TextUtils.isEmpty(a1VarT0.J())) {
                    String strJ11 = a1VarT0.J();
                    com.gamericefishpro.space.v8.c0.g(strJ11);
                    h3VarU.K(strJ11);
                }
                listM0 = m4Var.f0().m0(str6);
                i2 = i;
                while (i2 < listM0.size()) {
                    com.gamericefishpro.space.i9.q3 q3VarA11 = com.gamericefishpro.space.i9.r3.A();
                    String str311112 = ((p4) listM0.get(i2)).c;
                    q3VarA11.b();
                    ((com.gamericefishpro.space.i9.r3) q3VarA11.e).C(str311112);
                    long j1110 = ((p4) listM0.get(i2)).d;
                    q3VarA11.b();
                    ((com.gamericefishpro.space.i9.r3) q3VarA11.e).B(j1110);
                    m4Var.i0().P(q3VarA11, ((p4) listM0.get(i2)).e);
                    h3VarU.Z(q3VarA11);
                    if ("_sid".equals(((p4) listM0.get(i2)).c)) {
                        p1 p1Var116 = a1VarT0.a.z;
                        r1.l(p1Var116);
                        p1Var116.r();
                        if (a1VarT0.w != 0) {
                            z0VarI0 = m4Var.i0();
                            if (TextUtils.isEmpty(str13)) {
                                str16 = str13;
                                jC0 = 0;
                            } else {
                                str16 = str13;
                                jC0 = z0VarI0.c0(str16.getBytes(Charset.forName("UTF-8")));
                            }
                            p1 p1Var117 = a1VarT0.a.z;
                            r1.l(p1Var117);
                            p1Var117.r();
                            if (jC0 != a1VarT0.w) {
                                h3VarU.b();
                                ((com.gamericefishpro.space.i9.i3) h3VarU.e).Z0();
                            }
                        } else {
                            str16 = str13;
                        }
                    } else {
                        str16 = str13;
                    }
                    i2++;
                    str13 = str16;
                }
                mVarF2 = m4Var.f0();
                com.gamericefishpro.space.i9.i3 i3Var11 = (com.gamericefishpro.space.i9.i3) h3VarU.e();
                mVarF2.r();
                mVarF2.s();
                com.gamericefishpro.space.v8.c0.d(i3Var11.p());
                byte[] bArrA111 = i3Var11.a();
                long jC11 = mVarF2.e.i0().c0(bArrA111);
                ContentValues contentValues12 = new ContentValues();
                contentValues12.put("app_id", i3Var11.p());
                contentValues12.put("metadata_fingerprint", Long.valueOf(jC11));
                contentValues12.put("metadata", bArrA111);
                mVarF2.g0().insertWithOnConflict("raw_events_metadata", null, contentValues12, 4);
                mVarF3 = m4Var.f0();
                t tVar12 = qVar2.f;
                Objects.requireNonNull(tVar12);
                it2 = tVar12.d.keySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        l1 l1VarE11 = m4Var.e0();
                        String str311113 = qVar2.a;
                        zH = l1VarE11.H(str311113, qVar2.b);
                        j jVarV10 = m4Var.f0().v0(m4Var.g(), str311113, false, false, false, false);
                        if (zH) {
                        }
                        i3 = i;
                        break;
                    }
                    if ("_r".equals(it2.next())) {
                    }
                    i3 = 1;
                    break;
                }
                mVarF3.r();
                mVarF3.s();
                str15 = qVar2.a;
                com.gamericefishpro.space.v8.c0.d(str15);
                byte[] bArrA112 = mVarF3.e.i0().T(qVar2).a();
                contentValues = new ContentValues();
                contentValues.put("app_id", str15);
                contentValues.put("name", qVar2.b);
                contentValues.put("timestamp", Long.valueOf(qVar2.d));
                contentValues.put("metadata_fingerprint", Long.valueOf(jC11));
                contentValues.put("data", bArrA112);
                contentValues.put("realtime", Integer.valueOf(i3));
                if (mVarF3.g0().insert("raw_events", null, contentValues) == -1) {
                    ((r1) mVarF3.d).a().v().b(v0.z(str15), "Failed to insert raw event (got -1). appId");
                } else {
                    m4Var.H = 0L;
                }
                m4Var.f0().e0();
                m4Var.f0().f0();
                m4Var.N();
                m4Var.a().y().b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                return;
                m4Var.f0().f0();
                throw th;
            }
            if (jIntValue % 1000 == 1) {
                a().v().c("Data loss. Too many events logged. appId, count", v0.z(str5), Long.valueOf(jVarW0.b));
            }
            f0().e0();
            f0().f0();
        } catch (Throwable th3) {
            th = th3;
            m4Var = this;
        }
    }

    public final void l0(t4 t4Var) {
        c().r();
        k0();
        String str = t4Var.d;
        com.gamericefishpro.space.v8.c0.d(str);
        e2 e2VarC = e2.c(t4Var.Q, t4Var.L);
        b(str);
        a().G.c("Setting storage consent for package", str, e2VarC);
        c().r();
        k0();
        this.U.put(str, e2VarC);
        m mVar = this.i;
        T(mVar);
        mVar.M(str, e2VarC);
    }

    public final void m(a1 a1Var, com.gamericefishpro.space.i9.h3 h3Var) {
        com.gamericefishpro.space.m.d dVar;
        com.gamericefishpro.space.i9.r3 r3Var;
        h hVar;
        c().r();
        k0();
        String strB0 = ((com.gamericefishpro.space.i9.i3) h3Var.e).B0();
        EnumMap enumMap = new EnumMap(d2.class);
        int length = strB0.length();
        int length2 = d2.values().length;
        h hVar2 = h.UNSET;
        int i = 0;
        if (length < length2 || strB0.charAt(0) != '1') {
            dVar = new com.gamericefishpro.space.m.d(8);
        } else {
            d2[] d2VarArrValues = d2.values();
            int length3 = d2VarArrValues.length;
            int i2 = 0;
            int i3 = 1;
            while (i2 < length3) {
                d2 d2Var = d2VarArrValues[i2];
                int i4 = i3 + 1;
                char cCharAt = strB0.charAt(i3);
                h[] hVarArrValues = h.values();
                int length4 = hVarArrValues.length;
                int i5 = i;
                while (true) {
                    if (i5 >= length4) {
                        hVar = hVar2;
                        break;
                    }
                    hVar = hVarArrValues[i5];
                    if (hVar.d == cCharAt) {
                        break;
                    } else {
                        i5++;
                    }
                }
                enumMap.put(d2Var, hVar);
                i2++;
                i3 = i4;
                i = 0;
            }
            dVar = new com.gamericefishpro.space.m.d(enumMap);
        }
        String strD = a1Var.D();
        c().r();
        k0();
        e2 e2VarB = b(strD);
        EnumMap enumMap2 = e2VarB.a;
        d2 d2Var2 = d2.AD_STORAGE;
        b2 b2Var = (b2) enumMap2.get(d2Var2);
        b2 b2Var2 = b2.UNINITIALIZED;
        if (b2Var == null) {
            b2Var = b2Var2;
        }
        int i6 = e2VarB.b;
        int iOrdinal = b2Var.ordinal();
        h hVar3 = h.REMOTE_ENFORCED_DEFAULT;
        h hVar4 = h.FAILSAFE;
        if (iOrdinal == 1) {
            dVar.J(d2Var2, hVar3);
        } else if (iOrdinal == 2 || iOrdinal == 3) {
            dVar.G(d2Var2, i6);
        } else {
            dVar.J(d2Var2, hVar4);
        }
        d2 d2Var3 = d2.ANALYTICS_STORAGE;
        b2 b2Var3 = (b2) enumMap2.get(d2Var3);
        if (b2Var3 != null) {
            b2Var2 = b2Var3;
        }
        int iOrdinal2 = b2Var2.ordinal();
        if (iOrdinal2 == 1) {
            dVar.J(d2Var3, hVar3);
        } else if (iOrdinal2 == 2 || iOrdinal2 == 3) {
            dVar.G(d2Var3, i6);
        } else {
            dVar.J(d2Var3, hVar4);
        }
        String strD2 = a1Var.D();
        c().r();
        k0();
        o oVarP0 = p0(strD2, n0(strD2), b(strD2), dVar);
        String str = oVarP0.d;
        Boolean bool = oVarP0.c;
        com.gamericefishpro.space.v8.c0.g(bool);
        boolean zBooleanValue = bool.booleanValue();
        h3Var.b();
        ((com.gamericefishpro.space.i9.i3) h3Var.e).f1(zBooleanValue);
        if (!TextUtils.isEmpty(str)) {
            h3Var.b();
            ((com.gamericefishpro.space.i9.i3) h3Var.e).g1(str);
        }
        c().r();
        k0();
        Iterator it = Collections.unmodifiableList(((com.gamericefishpro.space.i9.i3) h3Var.e).U1()).iterator();
        do {
            if (!it.hasNext()) {
                r3Var = null;
                break;
            }
            r3Var = (com.gamericefishpro.space.i9.r3) it.next();
        } while (!"_npa".equals(r3Var.r()));
        if (r3Var != null) {
            EnumMap enumMap3 = (EnumMap) dVar.e;
            d2 d2Var4 = d2.AD_PERSONALIZATION;
            h hVar5 = (h) enumMap3.get(d2Var4);
            if (hVar5 == null) {
                hVar5 = hVar2;
            }
            if (hVar5 == hVar2) {
                m mVar = this.i;
                T(mVar);
                p4 p4VarL0 = mVar.l0(a1Var.D(), "_npa");
                h hVar6 = h.MANIFEST;
                h hVar7 = h.API;
                if (p4VarL0 != null) {
                    String str2 = p4VarL0.b;
                    if ("tcf".equals(str2)) {
                        dVar.J(d2Var4, h.TCF);
                    } else if ("app".equals(str2)) {
                        dVar.J(d2Var4, hVar7);
                    } else {
                        dVar.J(d2Var4, hVar6);
                    }
                } else {
                    Boolean boolW = a1Var.w();
                    if (boolW == null || ((boolW.booleanValue() && r3Var.v() != 1) || !(boolW.booleanValue() || r3Var.v() == 0))) {
                        dVar.J(d2Var4, hVar7);
                    } else {
                        dVar.J(d2Var4, hVar6);
                    }
                }
            }
        } else {
            int iF = F(a1Var.D(), dVar);
            com.gamericefishpro.space.i9.q3 q3VarA = com.gamericefishpro.space.i9.r3.A();
            q3VarA.b();
            ((com.gamericefishpro.space.i9.r3) q3VarA.e).C("_npa");
            e().getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            q3VarA.b();
            ((com.gamericefishpro.space.i9.r3) q3VarA.e).B(jCurrentTimeMillis);
            q3VarA.b();
            ((com.gamericefishpro.space.i9.r3) q3VarA.e).F(iF);
            com.gamericefishpro.space.i9.r3 r3Var2 = (com.gamericefishpro.space.i9.r3) q3VarA.e();
            h3Var.b();
            ((com.gamericefishpro.space.i9.i3) h3Var.e).d0(r3Var2);
            a().G.c("Setting user property", "non_personalized_ads(_npa)", Integer.valueOf(iF));
        }
        String string = dVar.toString();
        h3Var.b();
        ((com.gamericefishpro.space.i9.i3) h3Var.e).e1(string);
        String strD3 = a1Var.D();
        l1 l1Var = this.d;
        l1Var.r();
        l1Var.x(strD3);
        com.gamericefishpro.space.i9.z1 z1VarM = l1Var.M(strD3);
        boolean z = z1VarM == null || !z1VarM.s() || z1VarM.t();
        List listU = h3Var.U();
        for (int i7 = 0; i7 < listU.size(); i7++) {
            if ("_tcf".equals(((com.gamericefishpro.space.i9.a3) listU.get(i7)).s())) {
                com.gamericefishpro.space.i9.z2 z2Var = (com.gamericefishpro.space.i9.z2) ((com.gamericefishpro.space.i9.a3) listU.get(i7)).i();
                List listH = z2Var.h();
                for (int i8 = 0; i8 < listH.size(); i8++) {
                    if ("_tcfd".equals(((com.gamericefishpro.space.i9.d3) listH.get(i8)).q())) {
                        String strS = ((com.gamericefishpro.space.i9.d3) listH.get(i8)).s();
                        if (z && strS.length() > 4) {
                            char[] charArray = strS.toCharArray();
                            int i9 = 1;
                            while (true) {
                                if (i9 >= 64) {
                                    i9 = 0;
                                    break;
                                } else if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i9)) {
                                    break;
                                } else {
                                    i9++;
                                }
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i9 | 1);
                            strS = String.valueOf(charArray);
                        }
                        com.gamericefishpro.space.i9.c3 c3VarB = com.gamericefishpro.space.i9.d3.B();
                        c3VarB.h("_tcfd");
                        c3VarB.i(strS);
                        z2Var.b();
                        ((com.gamericefishpro.space.i9.a3) z2Var.e).A(i8, (com.gamericefishpro.space.i9.d3) c3VarB.e());
                        break;
                    }
                }
                h3Var.W(i7, z2Var);
                return;
            }
        }
    }

    public final void m0(t4 t4Var) {
        c().r();
        k0();
        String str = t4Var.d;
        com.gamericefishpro.space.v8.c0.d(str);
        o oVarB = o.b(t4Var.R);
        a().G.c("Setting DMA consent for package", str, oVarB);
        c().r();
        k0();
        b2 b2VarA = o.c(o0(str), 100).a();
        this.V.put(str, oVarB);
        m mVar = this.i;
        T(mVar);
        com.gamericefishpro.space.v8.c0.g(str);
        com.gamericefishpro.space.v8.c0.g(oVarB);
        mVar.r();
        mVar.s();
        e2 e2VarK = mVar.K(str);
        e2 e2Var = e2.c;
        if (e2VarK == e2Var) {
            mVar.M(str, e2Var);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", oVarB.b);
        mVar.O(contentValues);
        b2 b2VarA2 = o.c(o0(str), 100).a();
        c().r();
        k0();
        b2 b2Var = b2.GRANTED;
        b2 b2Var2 = b2.DENIED;
        boolean z = b2VarA == b2Var2 && b2VarA2 == b2Var;
        boolean z2 = b2VarA == b2Var && b2VarA2 == b2Var2;
        if (z || z2) {
            a().G.b(str, "Generated _dcu event for");
            Bundle bundle = new Bundle();
            m mVar2 = this.i;
            T(mVar2);
            if (mVar2.v0(g(), str, false, false, false, false).f < d0().z(str, e0.m0)) {
                bundle.putLong("_r", 1L);
                m mVar3 = this.i;
                T(mVar3);
                a().G.c("_dcu realtime event count", str, Long.valueOf(mVar3.v0(g(), str, false, false, true, false).f));
            }
            this.c0.a(str, "_dcu", bundle);
        }
    }

    public final void n(a1 a1Var, com.gamericefishpro.space.i9.h3 h3Var) {
        Serializable serializableG;
        c().r();
        k0();
        com.gamericefishpro.space.i9.k2 k2VarO = com.gamericefishpro.space.i9.n2.O();
        r1 r1Var = a1Var.a;
        p1 p1Var = r1Var.z;
        r1.l(p1Var);
        p1Var.r();
        byte[] bArr = a1Var.H;
        if (bArr != null) {
            try {
                k2VarO = (com.gamericefishpro.space.i9.k2) z0.e0(k2VarO, bArr);
            } catch (p5 unused) {
                a().B.b(v0.z(a1Var.D()), "Failed to parse locally stored ad campaign info. appId");
            }
        }
        Iterator it = h3Var.U().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.gamericefishpro.space.i9.a3 a3Var = (com.gamericefishpro.space.i9.a3) it.next();
            if (a3Var.s().equals("_cmp")) {
                com.gamericefishpro.space.i9.d3 d3VarZ = z0.z(a3Var, "gclid");
                Serializable serializableG2 = d3VarZ == null ? null : z0.G(d3VarZ);
                if (serializableG2 == null) {
                    serializableG2 = "";
                }
                String str = (String) serializableG2;
                com.gamericefishpro.space.i9.d3 d3VarZ2 = z0.z(a3Var, "gbraid");
                Serializable serializableG3 = d3VarZ2 == null ? null : z0.G(d3VarZ2);
                if (serializableG3 == null) {
                    serializableG3 = "";
                }
                String str2 = (String) serializableG3;
                com.gamericefishpro.space.i9.d3 d3VarZ3 = z0.z(a3Var, "gad_source");
                Serializable serializableG4 = d3VarZ3 == null ? null : z0.G(d3VarZ3);
                String str3 = (String) (serializableG4 != null ? serializableG4 : "");
                String[] strArrSplit = ((String) e0.g1.a(null)).split(",");
                i0();
                HashMap map = new HashMap();
                for (com.gamericefishpro.space.i9.d3 d3Var : a3Var.p()) {
                    if (Arrays.asList(strArrSplit).contains(d3Var.q()) && (serializableG = z0.G(d3Var)) != null) {
                        map.put(d3Var.q(), serializableG);
                    }
                }
                if (!map.isEmpty()) {
                    com.gamericefishpro.space.i9.d3 d3VarZ4 = z0.z(a3Var, "click_timestamp");
                    Serializable serializableG5 = d3VarZ4 == null ? null : z0.G(d3VarZ4);
                    long jLongValue = ((Long) (serializableG5 != null ? serializableG5 : 0L)).longValue();
                    if (jLongValue <= 0) {
                        jLongValue = a3Var.u();
                    }
                    com.gamericefishpro.space.i9.d3 d3VarZ5 = z0.z(a3Var, "_cis");
                    if ("referrer API v2".equals(d3VarZ5 != null ? z0.G(d3VarZ5) : null)) {
                        if (jLongValue > ((com.gamericefishpro.space.i9.n2) k2VarO.e).N()) {
                            if (str.isEmpty()) {
                                k2VarO.b();
                                ((com.gamericefishpro.space.i9.n2) k2VarO.e).q();
                            } else {
                                k2VarO.b();
                                ((com.gamericefishpro.space.i9.n2) k2VarO.e).p(str);
                            }
                            if (str2.isEmpty()) {
                                k2VarO.b();
                                ((com.gamericefishpro.space.i9.n2) k2VarO.e).s();
                            } else {
                                k2VarO.b();
                                ((com.gamericefishpro.space.i9.n2) k2VarO.e).r(str2);
                            }
                            if (str3.isEmpty()) {
                                k2VarO.b();
                                ((com.gamericefishpro.space.i9.n2) k2VarO.e).u();
                            } else {
                                k2VarO.b();
                                ((com.gamericefishpro.space.i9.n2) k2VarO.e).t(str3);
                            }
                            k2VarO.b();
                            ((com.gamericefishpro.space.i9.n2) k2VarO.e).v(jLongValue);
                            k2VarO.b();
                            ((com.gamericefishpro.space.i9.n2) k2VarO.e).x().clear();
                            HashMap mapG = G(a3Var);
                            k2VarO.b();
                            ((com.gamericefishpro.space.i9.n2) k2VarO.e).x().putAll(mapG);
                        }
                    } else if (jLongValue > ((com.gamericefishpro.space.i9.n2) k2VarO.e).F()) {
                        if (str.isEmpty()) {
                            k2VarO.b();
                            ((com.gamericefishpro.space.i9.n2) k2VarO.e).R();
                        } else {
                            k2VarO.b();
                            ((com.gamericefishpro.space.i9.n2) k2VarO.e).Q(str);
                        }
                        if (str2.isEmpty()) {
                            k2VarO.b();
                            ((com.gamericefishpro.space.i9.n2) k2VarO.e).T();
                        } else {
                            k2VarO.b();
                            ((com.gamericefishpro.space.i9.n2) k2VarO.e).S(str2);
                        }
                        if (str3.isEmpty()) {
                            k2VarO.b();
                            ((com.gamericefishpro.space.i9.n2) k2VarO.e).V();
                        } else {
                            k2VarO.b();
                            ((com.gamericefishpro.space.i9.n2) k2VarO.e).U(str3);
                        }
                        k2VarO.b();
                        ((com.gamericefishpro.space.i9.n2) k2VarO.e).W(jLongValue);
                        k2VarO.b();
                        ((com.gamericefishpro.space.i9.n2) k2VarO.e).w().clear();
                        HashMap mapG2 = G(a3Var);
                        k2VarO.b();
                        ((com.gamericefishpro.space.i9.n2) k2VarO.e).w().putAll(mapG2);
                    }
                }
            }
        }
        if (!((com.gamericefishpro.space.i9.n2) k2VarO.e()).equals(com.gamericefishpro.space.i9.n2.P())) {
            com.gamericefishpro.space.i9.n2 n2Var = (com.gamericefishpro.space.i9.n2) k2VarO.e();
            h3Var.b();
            ((com.gamericefishpro.space.i9.i3) h3Var.e).k1(n2Var);
        }
        byte[] bArrA = ((com.gamericefishpro.space.i9.n2) k2VarO.e()).a();
        p1 p1Var2 = r1Var.z;
        r1.l(p1Var2);
        p1Var2.r();
        a1Var.Q |= a1Var.H != bArrA;
        a1Var.H = bArrA;
        if (a1Var.o()) {
            m mVar = this.i;
            T(mVar);
            mVar.u0(a1Var, false);
        }
        if (d0().B(null, e0.f1)) {
            m mVar2 = this.i;
            T(mVar2);
            mVar2.j0(a1Var.D(), "_lgclid");
        }
    }

    public final o n0(String str) {
        c().r();
        k0();
        HashMap map = this.V;
        o oVar = (o) map.get(str);
        if (oVar != null) {
            return oVar;
        }
        m mVar = this.i;
        T(mVar);
        com.gamericefishpro.space.v8.c0.g(str);
        mVar.r();
        mVar.s();
        o oVarB = o.b(mVar.N("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}));
        map.put(str, oVarB);
        return oVarB;
    }

    public final String o(e2 e2Var) {
        if (!e2Var.i(d2.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        j0().o0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    public final Bundle o0(String str) {
        c().r();
        k0();
        l1 l1Var = this.d;
        T(l1Var);
        if (l1Var.M(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        e2 e2VarB = b(str);
        Bundle bundle2 = new Bundle();
        Iterator it = e2VarB.a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int iOrdinal = ((b2) entry.getValue()).ordinal();
            String str2 = iOrdinal != 2 ? iOrdinal != 3 ? null : "granted" : "denied";
            if (str2 != null) {
                bundle2.putString(((d2) entry.getKey()).d, str2);
            }
        }
        bundle.putAll(bundle2);
        o oVarP0 = p0(str, n0(str), e2VarB, new com.gamericefishpro.space.m.d(8));
        Bundle bundle3 = new Bundle();
        for (Map.Entry entry2 : oVarP0.e.entrySet()) {
            int iOrdinal2 = ((b2) entry2.getValue()).ordinal();
            String str3 = iOrdinal2 != 2 ? iOrdinal2 != 3 ? null : "granted" : "denied";
            if (str3 != null) {
                bundle3.putString(((d2) entry2.getKey()).d, str3);
            }
        }
        Boolean bool = oVarP0.c;
        if (bool != null) {
            bundle3.putString("is_dma_region", bool.toString());
        }
        String str4 = oVarP0.d;
        if (str4 != null) {
            bundle3.putString("cps_display_str", str4);
        }
        bundle.putAll(bundle3);
        m mVar = this.i;
        T(mVar);
        p4 p4VarL0 = mVar.l0(str, "_npa");
        bundle.putString("ad_personalization", 1 != (p4VarL0 != null ? p4VarL0.e.equals(1L) : F(str, new com.gamericefishpro.space.m.d(8))) ? "granted" : "denied");
        return bundle;
    }

    public final void p(ArrayList arrayList) {
        com.gamericefishpro.space.v8.c0.b(!arrayList.isEmpty());
        if (this.R != null) {
            a().y.a("Set uploading progress before finishing the previous upload");
        } else {
            this.R = new ArrayList(arrayList);
        }
    }

    public final o p0(String str, o oVar, e2 e2Var, com.gamericefishpro.space.m.d dVar) {
        d2 d2VarC;
        b2 b2VarV;
        l1 l1Var = this.d;
        T(l1Var);
        com.gamericefishpro.space.i9.z1 z1VarM = l1Var.M(str);
        int i = 90;
        b2 b2Var = b2.DENIED;
        d2 d2Var = d2.AD_USER_DATA;
        if (z1VarM == null) {
            if (oVar.a() == b2Var) {
                i = oVar.a;
                dVar.G(d2Var, i);
            } else {
                dVar.J(d2Var, h.FAILSAFE);
            }
            return new o(Boolean.FALSE, i, Boolean.TRUE, "-");
        }
        b2 b2VarA = oVar.a();
        b2 b2Var2 = b2.GRANTED;
        if (b2VarA == b2Var2 || b2VarA == b2Var) {
            i = oVar.a;
            dVar.G(d2Var, i);
        } else {
            b2 b2Var3 = b2.POLICY;
            b2 b2Var4 = b2.UNINITIALIZED;
            if (b2VarA != b2Var3 || (b2VarV = l1Var.v(str, d2Var)) == b2Var4) {
                l1Var.r();
                l1Var.x(str);
                com.gamericefishpro.space.i9.z1 z1VarM2 = l1Var.M(str);
                if (z1VarM2 != null) {
                    Iterator it = z1VarM2.q().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            d2VarC = null;
                            break;
                        }
                        com.gamericefishpro.space.i9.x1 x1Var = (com.gamericefishpro.space.i9.x1) it.next();
                        if (d2Var == l1.C(x1Var.p())) {
                            d2VarC = l1.C(x1Var.q());
                            break;
                        }
                    }
                } else {
                    d2VarC = null;
                    break;
                }
                EnumMap enumMap = e2Var.a;
                d2 d2Var2 = d2.AD_STORAGE;
                b2 b2Var5 = (b2) enumMap.get(d2Var2);
                if (b2Var5 != null) {
                    b2Var4 = b2Var5;
                }
                boolean z = b2Var4 == b2Var2 || b2Var4 == b2Var;
                if (d2VarC == d2Var2 && z) {
                    dVar.J(d2Var, h.REMOTE_DELEGATION);
                    b2VarA = b2Var4;
                } else {
                    dVar.J(d2Var, h.REMOTE_DEFAULT);
                    b2VarA = true != l1Var.L(str, d2Var) ? b2Var : b2Var2;
                }
            } else {
                dVar.J(d2Var, h.REMOTE_ENFORCED_DEFAULT);
                b2VarA = b2VarV;
            }
        }
        l1Var.r();
        l1Var.x(str);
        com.gamericefishpro.space.i9.z1 z1VarM3 = l1Var.M(str);
        boolean z2 = z1VarM3 == null || !z1VarM3.s() || z1VarM3.t();
        T(l1Var);
        l1Var.r();
        l1Var.x(str);
        TreeSet treeSet = new TreeSet();
        com.gamericefishpro.space.i9.z1 z1VarM4 = l1Var.M(str);
        if (z1VarM4 != null) {
            Iterator it2 = z1VarM4.r().iterator();
            while (it2.hasNext()) {
                treeSet.add(((com.gamericefishpro.space.i9.y1) it2.next()).p());
            }
        }
        if (b2VarA == b2Var || treeSet.isEmpty()) {
            return new o(Boolean.FALSE, i, Boolean.valueOf(z2), "-");
        }
        return new o(Boolean.TRUE, i, Boolean.valueOf(z2), z2 ? TextUtils.join("", treeSet) : "");
    }

    /* JADX WARN: Code duplicated, block: B:73:0x01ab A[Catch: all -> 0x0028, TryCatch #4 {all -> 0x0028, blocks: (B:3:0x000e, B:5:0x001b, B:8:0x002b, B:10:0x0031, B:11:0x003e, B:13:0x0046, B:14:0x004b, B:16:0x0056, B:17:0x0063, B:19:0x006e, B:20:0x007e, B:22:0x00a8, B:24:0x00ae, B:25:0x00b1, B:27:0x00ca, B:28:0x00df, B:30:0x00f0, B:32:0x00f6, B:35:0x010b, B:45:0x012a, B:47:0x012f, B:48:0x0132, B:49:0x0133, B:50:0x0138, B:55:0x017d, B:71:0x01a5, B:73:0x01ab, B:75:0x01b6, B:79:0x01c1, B:80:0x01c4, B:33:0x00fb, B:37:0x010f, B:42:0x0117), top: B:91:0x000e, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01b6 A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #4 {all -> 0x0028, blocks: (B:3:0x000e, B:5:0x001b, B:8:0x002b, B:10:0x0031, B:11:0x003e, B:13:0x0046, B:14:0x004b, B:16:0x0056, B:17:0x0063, B:19:0x006e, B:20:0x007e, B:22:0x00a8, B:24:0x00ae, B:25:0x00b1, B:27:0x00ca, B:28:0x00df, B:30:0x00f0, B:32:0x00f6, B:35:0x010b, B:45:0x012a, B:47:0x012f, B:48:0x0132, B:49:0x0133, B:50:0x0138, B:55:0x017d, B:71:0x01a5, B:73:0x01ab, B:75:0x01b6, B:79:0x01c1, B:80:0x01c4, B:33:0x00fb, B:37:0x010f, B:42:0x0117), top: B:91:0x000e, inners: #1 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.gamericefishpro.space.n9.m4] */
    /* JADX WARN: Type inference failed for: r1v12, types: [long] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v22, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v25, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void q() {
        SQLiteException e;
        a1 a1VarT0;
        c().r();
        k0();
        this.O = true;
        try {
            r1 r1Var = this.E;
            r1Var.getClass();
            Boolean bool = r1Var.o().w;
            if (bool == null) {
                a().B.a("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                a().y.a("Upload called in the client side when service should be used");
            } else if (this.H > 0) {
                N();
            } else {
                c().r();
                if (this.R != null) {
                    a().G.a("Uploading requested multiple times");
                } else {
                    z0 z0Var = this.e;
                    T(z0Var);
                    if (z0Var.L()) {
                        e().getClass();
                        ?? CurrentTimeMillis = System.currentTimeMillis();
                        ?? r7 = 0;
                        cursorRawQuery = null;
                        Cursor cursorRawQuery = null;
                        string = null;
                        string = null;
                        String string = null;
                        int iZ = d0().z(null, e0.i0);
                        d0();
                        long jLongValue = CurrentTimeMillis - ((Long) e0.e.a(null)).longValue();
                        for (int i = 0; i < iZ && I(null, jLongValue); i++) {
                        }
                        r8.a();
                        c().r();
                        H();
                        long jA = this.B.A.a();
                        if (jA != 0) {
                            a().F.b(Long.valueOf(Math.abs(CurrentTimeMillis - jA)), "Uploading events. Elapsed time since last upload attempt (ms)");
                        }
                        m mVar = this.i;
                        T(mVar);
                        String strZ = mVar.z();
                        long j = -1;
                        if (TextUtils.isEmpty(strZ)) {
                            try {
                                this.T = -1L;
                                m mVar2 = this.i;
                                T(mVar2);
                                d0();
                                long jLongValue2 = CurrentTimeMillis - ((Long) e0.e.a(null)).longValue();
                                mVar2.r();
                                mVar2.s();
                                try {
                                    CurrentTimeMillis = mVar2.g0().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(jLongValue2)});
                                    try {
                                        if (CurrentTimeMillis.moveToFirst()) {
                                            string = CurrentTimeMillis.getString(0);
                                        } else {
                                            v0 v0Var = ((r1) mVar2.d).y;
                                            r1.l(v0Var);
                                            v0Var.G.a("No expired configs for apps with pending events");
                                        }
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        v0 v0Var2 = ((r1) mVar2.d).y;
                                        r1.l(v0Var2);
                                        v0Var2.y.b(e, "Error selecting expired configs");
                                        if (CurrentTimeMillis != 0) {
                                        }
                                        if (!TextUtils.isEmpty(string)) {
                                            m mVar3 = this.i;
                                            T(mVar3);
                                            a1VarT0 = mVar3.t0(string);
                                            if (a1VarT0 != null) {
                                                z(a1VarT0);
                                            }
                                        }
                                        this.O = false;
                                        O();
                                    }
                                } catch (SQLiteException e3) {
                                    e = e3;
                                    CurrentTimeMillis = 0;
                                } catch (Throwable th) {
                                    th = th;
                                    if (r7 != 0) {
                                        r7.close();
                                    }
                                    throw th;
                                }
                                CurrentTimeMillis.close();
                                if (!TextUtils.isEmpty(string)) {
                                    m mVar4 = this.i;
                                    T(mVar4);
                                    a1VarT0 = mVar4.t0(string);
                                    if (a1VarT0 != null) {
                                        z(a1VarT0);
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                r7 = CurrentTimeMillis;
                            }
                        } else {
                            if (this.T == -1) {
                                m mVar5 = this.i;
                                T(mVar5);
                                try {
                                    try {
                                        cursorRawQuery = mVar5.g0().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                        if (cursorRawQuery.moveToFirst()) {
                                            j = cursorRawQuery.getLong(0);
                                        }
                                    } catch (Throwable th3) {
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        throw th3;
                                    }
                                } catch (SQLiteException e4) {
                                    v0 v0Var3 = ((r1) mVar5.d).y;
                                    r1.l(v0Var3);
                                    v0Var3.y.b(e4, "Error querying raw events");
                                    if (cursorRawQuery != null) {
                                    }
                                    this.T = j;
                                    r(strZ, CurrentTimeMillis);
                                    this.O = false;
                                    O();
                                }
                                cursorRawQuery.close();
                                this.T = j;
                            }
                            r(strZ, CurrentTimeMillis);
                        }
                    } else {
                        a().G.a("Network not connected, ignoring upload request");
                        N();
                    }
                }
            }
            this.O = false;
            O();
        } catch (Throwable th4) {
            this.O = false;
            O();
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0231  */
    /* JADX WARN: Code duplicated, block: B:115:0x024a  */
    /* JADX WARN: Code duplicated, block: B:117:0x025a  */
    /* JADX WARN: Code duplicated, block: B:119:0x0266  */
    /* JADX WARN: Code duplicated, block: B:149:0x038c  */
    /* JADX WARN: Code duplicated, block: B:154:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:179:0x0468 A[LOOP:10: B:155:0x03e6->B:179:0x0468, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:17:0x006f A[PHI: r0 r11 r22 r24
      0x006f: PHI (r0v114 java.util.List) = (r0v8 java.util.List), (r0v136 java.util.List) binds: [B:108:0x0225, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x006f: PHI (r11v47 android.database.Cursor) = (r11v5 android.database.Cursor), (r11v49 android.database.Cursor) binds: [B:108:0x0225, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x006f: PHI (r22v27 ??) = (r22v38 ??), (r22v39 ??) binds: [B:108:0x0225, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x006f: PHI (r24v7 long) = (r24v2 long), (r24v8 long) binds: [B:108:0x0225, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:180:0x046e  */
    /* JADX WARN: Code duplicated, block: B:191:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:195:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:197:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:203:0x0504  */
    /* JADX WARN: Code duplicated, block: B:206:0x0512  */
    /* JADX WARN: Code duplicated, block: B:208:0x052b  */
    /* JADX WARN: Code duplicated, block: B:210:0x052e  */
    /* JADX WARN: Code duplicated, block: B:212:0x0534 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:213:0x0536  */
    /* JADX WARN: Code duplicated, block: B:214:0x0538  */
    /* JADX WARN: Code duplicated, block: B:215:0x053a  */
    /* JADX WARN: Code duplicated, block: B:216:0x053c  */
    /* JADX WARN: Code duplicated, block: B:217:0x0541  */
    /* JADX WARN: Code duplicated, block: B:220:0x0551  */
    /* JADX WARN: Code duplicated, block: B:222:0x0554  */
    /* JADX WARN: Code duplicated, block: B:223:0x0556  */
    /* JADX WARN: Code duplicated, block: B:228:0x058f  */
    /* JADX WARN: Code duplicated, block: B:230:0x0593  */
    /* JADX WARN: Code duplicated, block: B:234:0x059c  */
    /* JADX WARN: Code duplicated, block: B:237:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:240:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:245:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:248:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:251:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:255:0x0600 A[EDGE_INSN: B:255:0x0600->B:256:0x0601 BREAK  A[LOOP:3: B:246:0x05d1->B:254:0x05fd]] */
    /* JADX WARN: Code duplicated, block: B:258:0x061c  */
    /* JADX WARN: Code duplicated, block: B:261:0x0628  */
    /* JADX WARN: Code duplicated, block: B:265:0x0657  */
    /* JADX WARN: Code duplicated, block: B:267:0x0698  */
    /* JADX WARN: Code duplicated, block: B:269:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:271:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:274:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:276:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:279:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:282:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:283:0x0702  */
    /* JADX WARN: Code duplicated, block: B:287:0x0721  */
    /* JADX WARN: Code duplicated, block: B:291:0x0749  */
    /* JADX WARN: Code duplicated, block: B:295:0x075e  */
    /* JADX WARN: Code duplicated, block: B:298:0x0771  */
    /* JADX WARN: Code duplicated, block: B:303:0x078f  */
    /* JADX WARN: Code duplicated, block: B:305:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:309:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:311:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:314:0x07db  */
    /* JADX WARN: Code duplicated, block: B:319:0x0808  */
    /* JADX WARN: Code duplicated, block: B:321:0x0816  */
    /* JADX WARN: Code duplicated, block: B:323:0x0827  */
    /* JADX WARN: Code duplicated, block: B:324:0x0829  */
    /* JADX WARN: Code duplicated, block: B:327:0x082e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:328:0x0830  */
    /* JADX WARN: Code duplicated, block: B:329:0x0832  */
    /* JADX WARN: Code duplicated, block: B:331:0x0836 A[PHI: r9
      0x0836: PHI (r9v8 boolean) = (r9v7 boolean), (r9v13 boolean) binds: [B:326:0x082c, B:328:0x0830] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:334:0x084a  */
    /* JADX WARN: Code duplicated, block: B:340:0x087a  */
    /* JADX WARN: Code duplicated, block: B:343:0x0892  */
    /* JADX WARN: Code duplicated, block: B:347:0x08a8 A[LOOP:7: B:345:0x08a2->B:347:0x08a8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:350:0x08e8  */
    /* JADX WARN: Code duplicated, block: B:351:0x08eb  */
    /* JADX WARN: Code duplicated, block: B:354:0x0900  */
    /* JADX WARN: Code duplicated, block: B:357:0x0939 A[LOOP:8: B:355:0x0933->B:357:0x0939, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:360:0x098a  */
    /* JADX WARN: Code duplicated, block: B:362:0x09d8  */
    /* JADX WARN: Code duplicated, block: B:364:0x09e0  */
    /* JADX WARN: Code duplicated, block: B:366:0x09ed  */
    /* JADX WARN: Code duplicated, block: B:369:0x09fb  */
    /* JADX WARN: Code duplicated, block: B:371:0x09fe  */
    /* JADX WARN: Code duplicated, block: B:374:0x0a0b A[LOOP:9: B:372:0x0a05->B:374:0x0a0b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:377:0x0a53  */
    /* JADX WARN: Code duplicated, block: B:379:0x0a77  */
    /* JADX WARN: Code duplicated, block: B:380:0x0a7b  */
    /* JADX WARN: Code duplicated, block: B:381:0x0a8b  */
    /* JADX WARN: Code duplicated, block: B:384:0x0a9b  */
    /* JADX WARN: Code duplicated, block: B:386:0x0aaa  */
    /* JADX WARN: Code duplicated, block: B:387:0x0ab3  */
    /* JADX WARN: Code duplicated, block: B:442:0x05c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:443:0x05cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:444:? A[LOOP:2: B:238:0x05ae->B:444:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:445:0x0600 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:447:0x07fc A[EDGE_INSN: B:447:0x07fc->B:317:0x07fc BREAK  A[LOOP:4: B:263:0x0653->B:316:0x07ee], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:449:0x07ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:450:0x0780 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:452:0x073b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:453:0x0753 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:457:0x085f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:458:0x0856 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:459:? A[LOOP:6: B:332:0x0844->B:459:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:463:0x0427 A[EDGE_INSN: B:463:0x0427->B:168:0x0427 BREAK  A[LOOP:10: B:155:0x03e6->B:179:0x0468], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:467:0x0557 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:484:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:485:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:488:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:489:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v50 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r14v13, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v10 */
    /* JADX WARN: Type inference failed for: r22v18 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v26 */
    /* JADX WARN: Type inference failed for: r22v27 */
    /* JADX WARN: Type inference failed for: r22v29, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r22v30 */
    /* JADX WARN: Type inference failed for: r22v31 */
    /* JADX WARN: Type inference failed for: r22v32 */
    /* JADX WARN: Type inference failed for: r22v33 */
    /* JADX WARN: Type inference failed for: r22v34 */
    /* JADX WARN: Type inference failed for: r22v35 */
    /* JADX WARN: Type inference failed for: r22v36 */
    /* JADX WARN: Type inference failed for: r22v37 */
    /* JADX WARN: Type inference failed for: r22v38 */
    /* JADX WARN: Type inference failed for: r22v39 */
    /* JADX WARN: Type inference failed for: r22v40 */
    /* JADX WARN: Type inference failed for: r22v41 */
    /* JADX WARN: Type inference failed for: r22v42 */
    /* JADX WARN: Type inference failed for: r22v43 */
    /* JADX WARN: Type inference failed for: r22v44 */
    /* JADX WARN: Type inference failed for: r22v45 */
    /* JADX WARN: Type inference failed for: r33v0, types: [com.gamericefishpro.space.n9.m4] */
    /* JADX WARN: Type inference failed for: r8v64, types: [com.gamericefishpro.space.n9.c4] */
    /* JADX WARN: Type inference failed for: r8v65 */
    /* JADX WARN: Type inference failed for: r8v86 */
    public final void r(String str, long j) throws Throwable {
        ?? r14;
        long j2;
        Cursor cursorQuery;
        ?? r22;
        List list;
        ?? r23;
        List<Pair> list2;
        q7 q7Var;
        d0 d0Var;
        boolean zB;
        d2 d2Var;
        int i;
        List list3;
        e2 e2VarB;
        d2 d2Var2;
        int i2;
        List listSubList;
        com.gamericefishpro.space.i9.f3 f3VarW;
        int size;
        ArrayList arrayList;
        int i3;
        boolean zI;
        boolean zI2;
        boolean zB2;
        i4 i4Var;
        h4 h4VarS;
        List list4;
        r1 r1Var;
        com.gamericefishpro.space.i9.g3 g3Var;
        ArrayList arrayList2;
        a3 a3Var;
        boolean z;
        Iterator it;
        String string;
        com.gamericefishpro.space.i9.f3 f3VarX;
        String strE;
        ArrayList arrayList3;
        Iterator it2;
        String strH;
        com.gamericefishpro.space.i9.g3 g3Var2;
        String str2;
        com.gamericefishpro.space.i9.f3 f3Var;
        int i4;
        Intent intent;
        Context contextD;
        com.gamericefishpro.space.i9.f3 f3VarW2;
        String strE2;
        boolean zIsEmpty;
        a3 a3Var2;
        a3 a3Var3;
        h4 h4Var;
        z0 z0Var;
        String strU;
        com.gamericefishpro.space.i9.h3 h3Var;
        String strV;
        int i5;
        ArrayList arrayList4;
        Iterator it3;
        int i6;
        Long lValueOf;
        Long lValueOf2;
        boolean z2;
        boolean z3;
        boolean z4;
        List list5;
        boolean z5;
        com.gamericefishpro.space.i9.a3 a3Var4;
        com.gamericefishpro.space.i9.d3 d3VarZ;
        com.gamericefishpro.space.i9.d3 d3VarZ2;
        com.gamericefishpro.space.i9.p3 p3VarB;
        Iterator it4;
        String strV2;
        int i7;
        com.gamericefishpro.space.i9.i3 i3Var;
        com.gamericefishpro.space.i9.i3 i3Var2;
        List list6;
        boolean zIsEmpty2;
        ArrayList arrayList5;
        r1 r1Var2;
        ArrayList arrayList6;
        ?? r15;
        r1 r1Var3;
        Cursor cursorQuery2;
        List list7;
        Iterator it5;
        boolean z6;
        com.gamericefishpro.space.i9.h3 h3Var2;
        com.gamericefishpro.space.i9.z1 z1VarM;
        ArrayList arrayList7;
        Iterator it6;
        int iP;
        Iterator it7;
        int i8;
        int i9;
        int iR;
        SQLiteDatabase sQLiteDatabaseG0;
        long jCurrentTimeMillis;
        ?? r24;
        ?? r25;
        long jV;
        long jV2;
        String str3 = str;
        int iZ = d0().z(str3, e0.h);
        int i10 = 0;
        int iMax = Math.max(0, d0().z(str3, e0.i));
        m mVarF0 = f0();
        r1 r1Var4 = (r1) mVarF0.d;
        mVarF0.r();
        mVarF0.s();
        int i11 = 1;
        com.gamericefishpro.space.v8.c0.b(iZ > 0);
        ?? r11 = iMax > 0 ? 1 : 0;
        com.gamericefishpro.space.v8.c0.b(r11);
        com.gamericefishpro.space.v8.c0.d(str3);
        try {
            try {
                try {
                    j2 = -1;
                    try {
                        r22 = "rowid";
                        cursorQuery = mVarF0.g0().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str3}, null, null, "rowid", String.valueOf(iZ));
                        try {
                            if (cursorQuery.moveToFirst()) {
                                ArrayList arrayList8 = new ArrayList();
                                int length = 0;
                                ?? r8 = mVarF0;
                                while (true) {
                                    long j3 = cursorQuery.getLong(i10);
                                    try {
                                        byte[] blob = cursorQuery.getBlob(i11);
                                        z0 z0VarI0 = r8.e.i0();
                                        try {
                                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
                                            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                            byte[] bArr = new byte[1024];
                                            r22 = r8;
                                            while (true) {
                                                try {
                                                    int i12 = gZIPInputStream.read(bArr);
                                                    if (i12 <= 0) {
                                                        break;
                                                    }
                                                    r1Var4 = r1Var4;
                                                    try {
                                                        byteArrayOutputStream.write(bArr, 0, i12);
                                                        r1Var4 = r1Var4;
                                                    } catch (IOException e) {
                                                        e = e;
                                                    }
                                                } catch (IOException e2) {
                                                    e = e2;
                                                    r1Var4 = r1Var4;
                                                }
                                                try {
                                                    ((r1) z0VarI0.d).a().v().b(e, "Failed to ungzip content");
                                                    throw e;
                                                } catch (IOException e3) {
                                                    e = e3;
                                                    r1Var4.a().v().c("Failed to unzip queued bundle. appId", v0.z(str3), e);
                                                    r22 = r22;
                                                    try {
                                                        if (cursorQuery.moveToNext()) {
                                                            break;
                                                        } else {
                                                            break;
                                                        }
                                                        cursorQuery.close();
                                                        list2 = arrayList8;
                                                        r23 = r22;
                                                    } catch (SQLiteException e4) {
                                                        e = e4;
                                                        r1Var4.a().v().c("Error querying bundles. appId", v0.z(str3), e);
                                                        list = Collections.EMPTY_LIST;
                                                        r25 = r22;
                                                        r24 = r22;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                            r24 = r25;
                                                        }
                                                        list2 = list;
                                                        r23 = r24;
                                                    }
                                                    if (list2.isEmpty()) {
                                                        return;
                                                    }
                                                    q7Var = q7.e;
                                                    g gVarD0 = d0();
                                                    d0Var = e0.h1;
                                                    zB = gVarD0.B(null, d0Var);
                                                    d2Var = d2.ANALYTICS_STORAGE;
                                                    if (zB) {
                                                        if (!d0().B(null, d0Var)) {
                                                            i = 34;
                                                            list6 = list2;
                                                        } else if (b(str).i(d2Var)) {
                                                            i = 34;
                                                            arrayList5 = new ArrayList(list2.size());
                                                            m mVarF1 = f0();
                                                            r1Var2 = (r1) mVarF1.d;
                                                            com.gamericefishpro.space.v8.c0.d(str3);
                                                            mVarF1.r();
                                                            mVarF1.s();
                                                            arrayList6 = new ArrayList();
                                                            sQLiteDatabaseG0 = mVarF1.g0();
                                                            r1Var2.e().getClass();
                                                            jCurrentTimeMillis = System.currentTimeMillis();
                                                            cursorQuery2 = sQLiteDatabaseG0.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
                                                            if (cursorQuery2.moveToFirst()) {
                                                                r1Var3 = r1Var2;
                                                                while (true) {
                                                                    arrayList6.add((com.gamericefishpro.space.i9.a3) ((com.gamericefishpro.space.i9.z2) z0.e0(com.gamericefishpro.space.i9.a3.z(), cursorQuery2.getBlob(0))).e());
                                                                    if (!cursorQuery2.moveToNext()) {
                                                                        break;
                                                                        break;
                                                                    } else {
                                                                        cursorQuery2 = cursorQuery2;
                                                                        arrayList6 = arrayList6;
                                                                    }
                                                                }
                                                                cursorQuery2.close();
                                                                int iDelete = sQLiteDatabaseG0.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)});
                                                                t0 t0VarY = r1Var3.a().y();
                                                                StringBuilder sb = new StringBuilder(String.valueOf(iDelete).length() + 34);
                                                                sb.append("Pruned ");
                                                                sb.append(iDelete);
                                                                sb.append(" NO_DATA mode events. appId");
                                                                t0VarY.b(str3, sb.toString());
                                                            } else {
                                                                arrayList6 = arrayList6;
                                                                cursorQuery2.close();
                                                            }
                                                            list7 = arrayList6;
                                                            it5 = list2.iterator();
                                                            z6 = true;
                                                            while (it5.hasNext()) {
                                                                Pair pair = (Pair) it5.next();
                                                                h3Var2 = (com.gamericefishpro.space.i9.h3) ((com.gamericefishpro.space.i9.i3) pair.first).i();
                                                                if (z6) {
                                                                    List listU = h3Var2.U();
                                                                    h3Var2.b();
                                                                    ((com.gamericefishpro.space.i9.i3) h3Var2.e).a0();
                                                                    h3Var2.b();
                                                                    ((com.gamericefishpro.space.i9.i3) h3Var2.e).Z(list7);
                                                                    h3Var2.b();
                                                                    ((com.gamericefishpro.space.i9.i3) h3Var2.e).Z(listU);
                                                                    z6 = false;
                                                                }
                                                                com.gamericefishpro.space.i9.t2 t2VarQ = com.gamericefishpro.space.i9.w2.q();
                                                                z1VarM = e0().M(str3);
                                                                arrayList7 = new ArrayList();
                                                                if (z1VarM != null) {
                                                                    it6 = z1VarM.p().iterator();
                                                                    while (it6.hasNext()) {
                                                                        com.gamericefishpro.space.i9.w1 w1Var = (com.gamericefishpro.space.i9.w1) it6.next();
                                                                        Iterator it8 = it5;
                                                                        com.gamericefishpro.space.i9.u2 u2VarP = com.gamericefishpro.space.i9.v2.p();
                                                                        boolean z7 = z6;
                                                                        iP = w1Var.p() - 1;
                                                                        List list8 = list7;
                                                                        if (iP != 1) {
                                                                            it7 = it6;
                                                                            i8 = 3;
                                                                            i9 = 2;
                                                                        } else if (iP != 2) {
                                                                            it7 = it6;
                                                                            i8 = 3;
                                                                            if (iP != 3) {
                                                                                i9 = 4;
                                                                            } else if (iP != 4) {
                                                                                i9 = 1;
                                                                            } else {
                                                                                i9 = 5;
                                                                            }
                                                                        } else {
                                                                            it7 = it6;
                                                                            i8 = 3;
                                                                            i9 = 3;
                                                                        }
                                                                        u2VarP.h(i9);
                                                                        iR = w1Var.r() - 1;
                                                                        if (iR != 1) {
                                                                            i8 = 2;
                                                                        } else if (iR != 2) {
                                                                            i8 = 1;
                                                                        }
                                                                        u2VarP.i(i8);
                                                                        arrayList7.add((com.gamericefishpro.space.i9.v2) u2VarP.e());
                                                                        it5 = it8;
                                                                        list7 = list8;
                                                                        z6 = z7;
                                                                        it6 = it7;
                                                                    }
                                                                }
                                                                Iterator it9 = it5;
                                                                boolean z8 = z6;
                                                                List list9 = list7;
                                                                t2VarQ.h(arrayList7);
                                                                h3Var2.E(t2VarQ);
                                                                arrayList5.add(Pair.create((com.gamericefishpro.space.i9.i3) h3Var2.e(), (Long) pair.second));
                                                                it5 = it9;
                                                                list7 = list9;
                                                                z6 = z8;
                                                            }
                                                            list6 = arrayList5;
                                                        } else {
                                                            i = 34;
                                                            arrayList5 = new ArrayList(list2.size());
                                                            m mVarF2 = f0();
                                                            r1Var2 = (r1) mVarF2.d;
                                                            com.gamericefishpro.space.v8.c0.d(str3);
                                                            mVarF2.r();
                                                            mVarF2.s();
                                                            arrayList6 = new ArrayList();
                                                            try {
                                                                try {
                                                                    try {
                                                                        sQLiteDatabaseG0 = mVarF2.g0();
                                                                        r1Var2.e().getClass();
                                                                        jCurrentTimeMillis = System.currentTimeMillis();
                                                                        cursorQuery2 = sQLiteDatabaseG0.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
                                                                        try {
                                                                            try {
                                                                                if (cursorQuery2.moveToFirst()) {
                                                                                    r1Var3 = r1Var2;
                                                                                    while (true) {
                                                                                        try {
                                                                                            try {
                                                                                                arrayList6.add((com.gamericefishpro.space.i9.a3) ((com.gamericefishpro.space.i9.z2) z0.e0(com.gamericefishpro.space.i9.a3.z(), cursorQuery2.getBlob(0))).e());
                                                                                            } catch (SQLiteException e5) {
                                                                                                e = e5;
                                                                                                cursorQuery2 = cursorQuery2;
                                                                                                r1Var3.a().v().c("Error flushing NO_DATA mode events. appId", v0.z(str3), e);
                                                                                                list7 = Collections.EMPTY_LIST;
                                                                                                if (cursorQuery2 != null) {
                                                                                                    cursorQuery2.close();
                                                                                                }
                                                                                                it5 = list2.iterator();
                                                                                                z6 = true;
                                                                                                while (it5.hasNext()) {
                                                                                                    Pair pair2 = (Pair) it5.next();
                                                                                                    h3Var2 = (com.gamericefishpro.space.i9.h3) ((com.gamericefishpro.space.i9.i3) pair2.first).i();
                                                                                                    if (z6) {
                                                                                                        List listU2 = h3Var2.U();
                                                                                                        h3Var2.b();
                                                                                                        ((com.gamericefishpro.space.i9.i3) h3Var2.e).a0();
                                                                                                        h3Var2.b();
                                                                                                        ((com.gamericefishpro.space.i9.i3) h3Var2.e).Z(list7);
                                                                                                        h3Var2.b();
                                                                                                        ((com.gamericefishpro.space.i9.i3) h3Var2.e).Z(listU2);
                                                                                                        z6 = false;
                                                                                                    }
                                                                                                    com.gamericefishpro.space.i9.t2 t2VarQ2 = com.gamericefishpro.space.i9.w2.q();
                                                                                                    z1VarM = e0().M(str3);
                                                                                                    arrayList7 = new ArrayList();
                                                                                                    if (z1VarM != null) {
                                                                                                        it6 = z1VarM.p().iterator();
                                                                                                        while (it6.hasNext()) {
                                                                                                            com.gamericefishpro.space.i9.w1 w1Var2 = (com.gamericefishpro.space.i9.w1) it6.next();
                                                                                                            Iterator it10 = it5;
                                                                                                            com.gamericefishpro.space.i9.u2 u2VarP2 = com.gamericefishpro.space.i9.v2.p();
                                                                                                            boolean z9 = z6;
                                                                                                            iP = w1Var2.p() - 1;
                                                                                                            List list10 = list7;
                                                                                                            if (iP != 1) {
                                                                                                                it7 = it6;
                                                                                                                i8 = 3;
                                                                                                                i9 = 2;
                                                                                                            } else if (iP != 2) {
                                                                                                                it7 = it6;
                                                                                                                i8 = 3;
                                                                                                                if (iP != 3) {
                                                                                                                    i9 = 4;
                                                                                                                } else if (iP != 4) {
                                                                                                                    i9 = 1;
                                                                                                                } else {
                                                                                                                    i9 = 5;
                                                                                                                }
                                                                                                            } else {
                                                                                                                it7 = it6;
                                                                                                                i8 = 3;
                                                                                                                i9 = 3;
                                                                                                            }
                                                                                                            u2VarP2.h(i9);
                                                                                                            iR = w1Var2.r() - 1;
                                                                                                            if (iR != 1) {
                                                                                                                i8 = 2;
                                                                                                            } else if (iR != 2) {
                                                                                                                i8 = 1;
                                                                                                            }
                                                                                                            u2VarP2.i(i8);
                                                                                                            arrayList7.add((com.gamericefishpro.space.i9.v2) u2VarP2.e());
                                                                                                            it5 = it10;
                                                                                                            list7 = list10;
                                                                                                            z6 = z9;
                                                                                                            it6 = it7;
                                                                                                        }
                                                                                                    }
                                                                                                    Iterator it11 = it5;
                                                                                                    boolean z10 = z6;
                                                                                                    List list11 = list7;
                                                                                                    t2VarQ2.h(arrayList7);
                                                                                                    h3Var2.E(t2VarQ2);
                                                                                                    arrayList5.add(Pair.create((com.gamericefishpro.space.i9.i3) h3Var2.e(), (Long) pair2.second));
                                                                                                    it5 = it11;
                                                                                                    list7 = list11;
                                                                                                    z6 = z10;
                                                                                                }
                                                                                                list6 = arrayList5;
                                                                                                zIsEmpty2 = list6.isEmpty();
                                                                                                list3 = list6;
                                                                                                if (zIsEmpty2) {
                                                                                                    return;
                                                                                                }
                                                                                                e2VarB = b(str);
                                                                                                d2Var2 = d2.AD_STORAGE;
                                                                                                if (e2VarB.i(d2Var2)) {
                                                                                                    i2 = 0;
                                                                                                    listSubList = list3;
                                                                                                    break;
                                                                                                }
                                                                                                it4 = list3.iterator();
                                                                                                while (true) {
                                                                                                    if (it4.hasNext()) {
                                                                                                        strV2 = null;
                                                                                                        break;
                                                                                                    }
                                                                                                    i3Var2 = (com.gamericefishpro.space.i9.i3) ((Pair) it4.next()).first;
                                                                                                    if (!i3Var2.v().isEmpty()) {
                                                                                                        strV2 = i3Var2.v();
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                if (strV2 != null) {
                                                                                                    i2 = 0;
                                                                                                    listSubList = list3;
                                                                                                    break;
                                                                                                }
                                                                                                i7 = 0;
                                                                                                while (true) {
                                                                                                    if (i7 < list3.size()) {
                                                                                                        i2 = 0;
                                                                                                        listSubList = list3;
                                                                                                        break;
                                                                                                    }
                                                                                                    i3Var = (com.gamericefishpro.space.i9.i3) ((Pair) list3.get(i7)).first;
                                                                                                    if (!i3Var.v().isEmpty()) {
                                                                                                        i2 = 0;
                                                                                                        listSubList = list3.subList(0, i7);
                                                                                                        break;
                                                                                                    }
                                                                                                    i7++;
                                                                                                }
                                                                                                f3VarW = com.gamericefishpro.space.i9.g3.w();
                                                                                                size = listSubList.size();
                                                                                                arrayList = new ArrayList(listSubList.size());
                                                                                                if (d0().s(str3)) {
                                                                                                    i3 = i2;
                                                                                                } else {
                                                                                                    i3 = i2;
                                                                                                }
                                                                                                zI = b(str).i(d2Var2);
                                                                                                zI2 = b(str).i(d2Var);
                                                                                                zB2 = d0().B(str3, e0.M0);
                                                                                                i4Var = this.C;
                                                                                                h4VarS = i4Var.s(str3);
                                                                                                list4 = listSubList;
                                                                                                while (true) {
                                                                                                    r1Var = this.E;
                                                                                                    if (i2 < size) {
                                                                                                        break;
                                                                                                    }
                                                                                                    h3Var = (com.gamericefishpro.space.i9.h3) ((com.gamericefishpro.space.i9.i3) ((Pair) list4.get(i2)).first).i();
                                                                                                    int i13 = size;
                                                                                                    arrayList.add((Long) ((Pair) list4.get(i2)).second);
                                                                                                    d0().w();
                                                                                                    h3Var.s();
                                                                                                    h3Var.b();
                                                                                                    ((com.gamericefishpro.space.i9.i3) h3Var.e).f0(j);
                                                                                                    r1Var.getClass();
                                                                                                    h3Var.I();
                                                                                                    if (i3 == 0) {
                                                                                                        h3Var.b();
                                                                                                        ((com.gamericefishpro.space.i9.i3) h3Var.e).S0();
                                                                                                    }
                                                                                                    if (!zI) {
                                                                                                        h3Var.b();
                                                                                                        ((com.gamericefishpro.space.i9.i3) h3Var.e).z1();
                                                                                                        h3Var.b();
                                                                                                        ((com.gamericefishpro.space.i9.i3) h3Var.e).B1();
                                                                                                    }
                                                                                                    if (!zI2) {
                                                                                                        h3Var.b();
                                                                                                        ((com.gamericefishpro.space.i9.i3) h3Var.e).D1();
                                                                                                    }
                                                                                                    v(h3Var, str3);
                                                                                                    if (!zB2) {
                                                                                                        h3Var.b();
                                                                                                        ((com.gamericefishpro.space.i9.i3) h3Var.e).Z0();
                                                                                                    }
                                                                                                    if (!zI2) {
                                                                                                        h3Var.b();
                                                                                                        ((com.gamericefishpro.space.i9.i3) h3Var.e).L1();
                                                                                                    }
                                                                                                    strV = ((com.gamericefishpro.space.i9.i3) h3Var.e).v();
                                                                                                    if (TextUtils.isEmpty(strV)) {
                                                                                                        i5 = i3;
                                                                                                    } else {
                                                                                                        i5 = i3;
                                                                                                        if (strV.equals("00000000-0000-0000-0000-000000000000")) {
                                                                                                            i6 = i2;
                                                                                                            z4 = zI2;
                                                                                                            list5 = list4;
                                                                                                            z5 = zB2;
                                                                                                        }
                                                                                                        if (h3Var.V() != 0) {
                                                                                                            if (d0().B(str3, e0.C0)) {
                                                                                                                h3Var.P(i0().c0(((com.gamericefishpro.space.i9.i3) h3Var.e()).a()));
                                                                                                            }
                                                                                                            p3VarB = h4VarS.b();
                                                                                                            if (p3VarB != null) {
                                                                                                                h3Var.B(p3VarB);
                                                                                                            }
                                                                                                            f3VarW.b();
                                                                                                            ((com.gamericefishpro.space.i9.g3) f3VarW.e).z((com.gamericefishpro.space.i9.i3) h3Var.e());
                                                                                                        }
                                                                                                        i2 = i6 + 1;
                                                                                                        i3 = i5;
                                                                                                        size = i13;
                                                                                                        list4 = list5;
                                                                                                        zI2 = z4;
                                                                                                        zB2 = z5;
                                                                                                    }
                                                                                                    arrayList4 = new ArrayList(h3Var.U());
                                                                                                    it3 = arrayList4.iterator();
                                                                                                    i6 = i2;
                                                                                                    lValueOf = null;
                                                                                                    lValueOf2 = null;
                                                                                                    z2 = false;
                                                                                                    z3 = false;
                                                                                                    while (it3.hasNext()) {
                                                                                                        zI2 = zI2;
                                                                                                        a3Var4 = (com.gamericefishpro.space.i9.a3) it3.next();
                                                                                                        list4 = list4;
                                                                                                        zB2 = zB2;
                                                                                                        if ("_fx".equals(a3Var4.s())) {
                                                                                                            it3.remove();
                                                                                                            z2 = true;
                                                                                                        } else if ("_f".equals(a3Var4.s())) {
                                                                                                            i0();
                                                                                                            d3VarZ = z0.z(a3Var4, "_pfo");
                                                                                                            if (d3VarZ != null) {
                                                                                                                lValueOf = Long.valueOf(d3VarZ.u());
                                                                                                            }
                                                                                                            i0();
                                                                                                            d3VarZ2 = z0.z(a3Var4, "_uwa");
                                                                                                            if (d3VarZ2 != null) {
                                                                                                                lValueOf2 = Long.valueOf(d3VarZ2.u());
                                                                                                            }
                                                                                                        } else {
                                                                                                            list4 = list4;
                                                                                                            zI2 = zI2;
                                                                                                            zB2 = zB2;
                                                                                                        }
                                                                                                        z3 = true;
                                                                                                    }
                                                                                                    z4 = zI2;
                                                                                                    list5 = list4;
                                                                                                    z5 = zB2;
                                                                                                    if (z2) {
                                                                                                        h3Var.b();
                                                                                                        ((com.gamericefishpro.space.i9.i3) h3Var.e).a0();
                                                                                                        h3Var.b();
                                                                                                        ((com.gamericefishpro.space.i9.i3) h3Var.e).Z(arrayList4);
                                                                                                    }
                                                                                                    if (z3) {
                                                                                                        u(h3Var.o(), true, lValueOf, lValueOf2);
                                                                                                    }
                                                                                                    if (h3Var.V() != 0) {
                                                                                                        if (d0().B(str3, e0.C0)) {
                                                                                                            h3Var.P(i0().c0(((com.gamericefishpro.space.i9.i3) h3Var.e()).a()));
                                                                                                        }
                                                                                                        p3VarB = h4VarS.b();
                                                                                                        if (p3VarB != null) {
                                                                                                            h3Var.B(p3VarB);
                                                                                                        }
                                                                                                        f3VarW.b();
                                                                                                        ((com.gamericefishpro.space.i9.g3) f3VarW.e).z((com.gamericefishpro.space.i9.i3) h3Var.e());
                                                                                                    }
                                                                                                    i2 = i6 + 1;
                                                                                                    i3 = i5;
                                                                                                    size = i13;
                                                                                                    list4 = list5;
                                                                                                    zI2 = z4;
                                                                                                    zB2 = z5;
                                                                                                }
                                                                                                if (((com.gamericefishpro.space.i9.g3) f3VarW.e).q() == 0) {
                                                                                                    p(arrayList);
                                                                                                    y(false, 204, null, null, str3, Collections.EMPTY_LIST);
                                                                                                    return;
                                                                                                }
                                                                                                g3Var = (com.gamericefishpro.space.i9.g3) f3VarW.e();
                                                                                                arrayList2 = new ArrayList();
                                                                                                a3Var = h4VarS.c;
                                                                                                if (a3Var == a3.SGTM_CLIENT) {
                                                                                                    z = true;
                                                                                                } else {
                                                                                                    z = false;
                                                                                                }
                                                                                                if (a3Var == a3.SGTM) {
                                                                                                    it = ((com.gamericefishpro.space.i9.g3) f3VarW.e()).p().iterator();
                                                                                                    while (true) {
                                                                                                        if (it.hasNext()) {
                                                                                                            if (((com.gamericefishpro.space.i9.i3) it.next()).N()) {
                                                                                                                string = UUID.randomUUID().toString();
                                                                                                                break;
                                                                                                            }
                                                                                                        } else {
                                                                                                            string = null;
                                                                                                            break;
                                                                                                        }
                                                                                                    }
                                                                                                    com.gamericefishpro.space.i9.g3 g3Var3 = (com.gamericefishpro.space.i9.g3) f3VarW.e();
                                                                                                    c().r();
                                                                                                    k0();
                                                                                                    f3VarX = com.gamericefishpro.space.i9.g3.x(g3Var3);
                                                                                                    if (!TextUtils.isEmpty(string)) {
                                                                                                        f3VarX.b();
                                                                                                        ((com.gamericefishpro.space.i9.g3) f3VarX.e).C(string);
                                                                                                    }
                                                                                                    strE = e0().E(str3);
                                                                                                    if (!TextUtils.isEmpty(strE)) {
                                                                                                        f3VarX.i(strE);
                                                                                                    }
                                                                                                    arrayList3 = new ArrayList();
                                                                                                    it2 = g3Var3.p().iterator();
                                                                                                    while (it2.hasNext()) {
                                                                                                        com.gamericefishpro.space.i9.h3 h3VarV = com.gamericefishpro.space.i9.i3.V((com.gamericefishpro.space.i9.i3) it2.next());
                                                                                                        h3VarV.b();
                                                                                                        ((com.gamericefishpro.space.i9.i3) h3VarV.e).S0();
                                                                                                        arrayList3.add((com.gamericefishpro.space.i9.i3) h3VarV.e());
                                                                                                    }
                                                                                                    f3VarX.b();
                                                                                                    ((com.gamericefishpro.space.i9.g3) f3VarX.e).B();
                                                                                                    f3VarX.b();
                                                                                                    ((com.gamericefishpro.space.i9.g3) f3VarX.e).A(arrayList3);
                                                                                                    t0 t0VarY2 = a().y();
                                                                                                    if (TextUtils.isEmpty(string)) {
                                                                                                        strH = "null";
                                                                                                    } else {
                                                                                                        strH = f3VarX.h();
                                                                                                    }
                                                                                                    t0VarY2.b(strH, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
                                                                                                    g3Var2 = (com.gamericefishpro.space.i9.g3) f3VarX.e();
                                                                                                    if (TextUtils.isEmpty(string)) {
                                                                                                        str2 = null;
                                                                                                    } else {
                                                                                                        com.gamericefishpro.space.i9.g3 g3Var4 = (com.gamericefishpro.space.i9.g3) f3VarW.e();
                                                                                                        c().r();
                                                                                                        k0();
                                                                                                        f3VarW2 = com.gamericefishpro.space.i9.g3.w();
                                                                                                        a().y().b(string, "[sgtm] Processing Google Signal, sgtmJoinId:");
                                                                                                        f3VarW2.b();
                                                                                                        ((com.gamericefishpro.space.i9.g3) f3VarW2.e).C(string);
                                                                                                        for (com.gamericefishpro.space.i9.i3 i3Var3 : g3Var4.p()) {
                                                                                                            com.gamericefishpro.space.i9.h3 h3VarU = com.gamericefishpro.space.i9.i3.U();
                                                                                                            String strO = i3Var3.O();
                                                                                                            h3VarU.b();
                                                                                                            ((com.gamericefishpro.space.i9.i3) h3VarU.e).R0(strO);
                                                                                                            int iK0 = i3Var3.K0();
                                                                                                            h3VarU.b();
                                                                                                            ((com.gamericefishpro.space.i9.i3) h3VarU.e).j1(iK0);
                                                                                                            f3VarW2.b();
                                                                                                            ((com.gamericefishpro.space.i9.g3) f3VarW2.e).z((com.gamericefishpro.space.i9.i3) h3VarU.e());
                                                                                                        }
                                                                                                        com.gamericefishpro.space.i9.g3 g3Var5 = (com.gamericefishpro.space.i9.g3) f3VarW2.e();
                                                                                                        strE2 = i4Var.e.e0().E(str3);
                                                                                                        zIsEmpty = TextUtils.isEmpty(strE2);
                                                                                                        a3Var2 = a3.GOOGLE_SIGNAL;
                                                                                                        a3Var3 = a3.GOOGLE_SIGNAL_PENDING;
                                                                                                        if (zIsEmpty) {
                                                                                                            str2 = null;
                                                                                                            String str4 = (String) e0.s.a(null);
                                                                                                            if (z) {
                                                                                                                a3Var2 = a3Var3;
                                                                                                            }
                                                                                                            h4Var = new h4(str4, Collections.EMPTY_MAP, a3Var2, null);
                                                                                                        } else {
                                                                                                            Uri uri = Uri.parse((String) e0.s.a(null));
                                                                                                            Uri.Builder builderBuildUpon = uri.buildUpon();
                                                                                                            String authority = uri.getAuthority();
                                                                                                            StringBuilder sb2 = new StringBuilder(String.valueOf(strE2).length() + 1 + String.valueOf(authority).length());
                                                                                                            sb2.append(strE2);
                                                                                                            sb2.append(".");
                                                                                                            sb2.append(authority);
                                                                                                            builderBuildUpon.authority(sb2.toString());
                                                                                                            String string2 = builderBuildUpon.build().toString();
                                                                                                            if (z) {
                                                                                                                a3Var2 = a3Var3;
                                                                                                            }
                                                                                                            str2 = null;
                                                                                                            h4Var = new h4(string2, Collections.EMPTY_MAP, a3Var2, null);
                                                                                                        }
                                                                                                        arrayList2.add(Pair.create(g3Var5, h4Var));
                                                                                                    }
                                                                                                    if (z) {
                                                                                                        f3Var = (com.gamericefishpro.space.i9.f3) g3Var2.i();
                                                                                                        for (i4 = 0; i4 < g3Var2.q(); i4++) {
                                                                                                            com.gamericefishpro.space.i9.h3 h3Var3 = (com.gamericefishpro.space.i9.h3) g3Var2.r(i4).i();
                                                                                                            h3Var3.a0();
                                                                                                            h3Var3.C(j);
                                                                                                            f3Var.b();
                                                                                                            ((com.gamericefishpro.space.i9.g3) f3Var.e).y(i4, (com.gamericefishpro.space.i9.i3) h3Var3.e());
                                                                                                        }
                                                                                                        arrayList2.add(Pair.create((com.gamericefishpro.space.i9.g3) f3Var.e(), h4VarS));
                                                                                                        p(arrayList);
                                                                                                        y(false, 204, null, null, str, arrayList2);
                                                                                                        if (s(str, h4VarS.a())) {
                                                                                                            a().y().b(str, "[sgtm] Sending sgtm batches available notification to app");
                                                                                                            intent = new Intent();
                                                                                                            intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                                                                                            intent.setPackage(str);
                                                                                                            contextD = r1Var.d();
                                                                                                            if (Build.VERSION.SDK_INT < i) {
                                                                                                                contextD.sendBroadcast(intent);
                                                                                                                return;
                                                                                                            } else {
                                                                                                                contextD.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                                                                                                return;
                                                                                                            }
                                                                                                        }
                                                                                                        return;
                                                                                                    }
                                                                                                    str3 = str;
                                                                                                    g3Var = g3Var2;
                                                                                                } else if (z) {
                                                                                                    z = true;
                                                                                                    it = ((com.gamericefishpro.space.i9.g3) f3VarW.e()).p().iterator();
                                                                                                    while (true) {
                                                                                                        if (it.hasNext()) {
                                                                                                            if (((com.gamericefishpro.space.i9.i3) it.next()).N()) {
                                                                                                                string = UUID.randomUUID().toString();
                                                                                                                break;
                                                                                                            }
                                                                                                        } else {
                                                                                                            string = null;
                                                                                                            break;
                                                                                                        }
                                                                                                    }
                                                                                                    com.gamericefishpro.space.i9.g3 g3Var6 = (com.gamericefishpro.space.i9.g3) f3VarW.e();
                                                                                                    c().r();
                                                                                                    k0();
                                                                                                    f3VarX = com.gamericefishpro.space.i9.g3.x(g3Var6);
                                                                                                    if (!TextUtils.isEmpty(string)) {
                                                                                                        f3VarX.b();
                                                                                                        ((com.gamericefishpro.space.i9.g3) f3VarX.e).C(string);
                                                                                                    }
                                                                                                    strE = e0().E(str3);
                                                                                                    if (!TextUtils.isEmpty(strE)) {
                                                                                                        f3VarX.i(strE);
                                                                                                    }
                                                                                                    arrayList3 = new ArrayList();
                                                                                                    it2 = g3Var6.p().iterator();
                                                                                                    while (it2.hasNext()) {
                                                                                                        com.gamericefishpro.space.i9.h3 h3VarV2 = com.gamericefishpro.space.i9.i3.V((com.gamericefishpro.space.i9.i3) it2.next());
                                                                                                        h3VarV2.b();
                                                                                                        ((com.gamericefishpro.space.i9.i3) h3VarV2.e).S0();
                                                                                                        arrayList3.add((com.gamericefishpro.space.i9.i3) h3VarV2.e());
                                                                                                    }
                                                                                                    f3VarX.b();
                                                                                                    ((com.gamericefishpro.space.i9.g3) f3VarX.e).B();
                                                                                                    f3VarX.b();
                                                                                                    ((com.gamericefishpro.space.i9.g3) f3VarX.e).A(arrayList3);
                                                                                                    t0 t0VarY3 = a().y();
                                                                                                    if (TextUtils.isEmpty(string)) {
                                                                                                        strH = "null";
                                                                                                    } else {
                                                                                                        strH = f3VarX.h();
                                                                                                    }
                                                                                                    t0VarY3.b(strH, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
                                                                                                    g3Var2 = (com.gamericefishpro.space.i9.g3) f3VarX.e();
                                                                                                    if (TextUtils.isEmpty(string)) {
                                                                                                        com.gamericefishpro.space.i9.g3 g3Var7 = (com.gamericefishpro.space.i9.g3) f3VarW.e();
                                                                                                        c().r();
                                                                                                        k0();
                                                                                                        f3VarW2 = com.gamericefishpro.space.i9.g3.w();
                                                                                                        a().y().b(string, "[sgtm] Processing Google Signal, sgtmJoinId:");
                                                                                                        f3VarW2.b();
                                                                                                        ((com.gamericefishpro.space.i9.g3) f3VarW2.e).C(string);
                                                                                                        while (r0.hasNext()) {
                                                                                                            com.gamericefishpro.space.i9.h3 h3VarU2 = com.gamericefishpro.space.i9.i3.U();
                                                                                                            String strO2 = i3Var3.O();
                                                                                                            h3VarU2.b();
                                                                                                            ((com.gamericefishpro.space.i9.i3) h3VarU2.e).R0(strO2);
                                                                                                            int iK1 = i3Var3.K0();
                                                                                                            h3VarU2.b();
                                                                                                            ((com.gamericefishpro.space.i9.i3) h3VarU2.e).j1(iK1);
                                                                                                            f3VarW2.b();
                                                                                                            ((com.gamericefishpro.space.i9.g3) f3VarW2.e).z((com.gamericefishpro.space.i9.i3) h3VarU2.e());
                                                                                                        }
                                                                                                        com.gamericefishpro.space.i9.g3 g3Var8 = (com.gamericefishpro.space.i9.g3) f3VarW2.e();
                                                                                                        strE2 = i4Var.e.e0().E(str3);
                                                                                                        zIsEmpty = TextUtils.isEmpty(strE2);
                                                                                                        a3Var2 = a3.GOOGLE_SIGNAL;
                                                                                                        a3Var3 = a3.GOOGLE_SIGNAL_PENDING;
                                                                                                        if (zIsEmpty) {
                                                                                                            Uri uri2 = Uri.parse((String) e0.s.a(null));
                                                                                                            Uri.Builder builderBuildUpon2 = uri2.buildUpon();
                                                                                                            String authority2 = uri2.getAuthority();
                                                                                                            StringBuilder sb3 = new StringBuilder(String.valueOf(strE2).length() + 1 + String.valueOf(authority2).length());
                                                                                                            sb3.append(strE2);
                                                                                                            sb3.append(".");
                                                                                                            sb3.append(authority2);
                                                                                                            builderBuildUpon2.authority(sb3.toString());
                                                                                                            String string3 = builderBuildUpon2.build().toString();
                                                                                                            if (z) {
                                                                                                                a3Var2 = a3Var3;
                                                                                                            }
                                                                                                            str2 = null;
                                                                                                            h4Var = new h4(string3, Collections.EMPTY_MAP, a3Var2, null);
                                                                                                        } else {
                                                                                                            str2 = null;
                                                                                                            String str5 = (String) e0.s.a(null);
                                                                                                            if (z) {
                                                                                                                a3Var2 = a3Var3;
                                                                                                            }
                                                                                                            h4Var = new h4(str5, Collections.EMPTY_MAP, a3Var2, null);
                                                                                                        }
                                                                                                        arrayList2.add(Pair.create(g3Var8, h4Var));
                                                                                                    } else {
                                                                                                        str2 = null;
                                                                                                    }
                                                                                                    if (z) {
                                                                                                        f3Var = (com.gamericefishpro.space.i9.f3) g3Var2.i();
                                                                                                        while (i4 < g3Var2.q()) {
                                                                                                            com.gamericefishpro.space.i9.h3 h3Var4 = (com.gamericefishpro.space.i9.h3) g3Var2.r(i4).i();
                                                                                                            h3Var4.a0();
                                                                                                            h3Var4.C(j);
                                                                                                            f3Var.b();
                                                                                                            ((com.gamericefishpro.space.i9.g3) f3Var.e).y(i4, (com.gamericefishpro.space.i9.i3) h3Var4.e());
                                                                                                        }
                                                                                                        arrayList2.add(Pair.create((com.gamericefishpro.space.i9.g3) f3Var.e(), h4VarS));
                                                                                                        p(arrayList);
                                                                                                        y(false, 204, null, null, str, arrayList2);
                                                                                                        if (s(str, h4VarS.a())) {
                                                                                                            a().y().b(str, "[sgtm] Sending sgtm batches available notification to app");
                                                                                                            intent = new Intent();
                                                                                                            intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                                                                                            intent.setPackage(str);
                                                                                                            contextD = r1Var.d();
                                                                                                            if (Build.VERSION.SDK_INT < i) {
                                                                                                                contextD.sendBroadcast(intent);
                                                                                                                return;
                                                                                                            } else {
                                                                                                                contextD.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                                                                                                return;
                                                                                                            }
                                                                                                        }
                                                                                                        return;
                                                                                                    }
                                                                                                    str3 = str;
                                                                                                    g3Var = g3Var2;
                                                                                                } else {
                                                                                                    str2 = null;
                                                                                                }
                                                                                                z0Var = this.e;
                                                                                                T(z0Var);
                                                                                                if (z0Var.L()) {
                                                                                                    if (Log.isLoggable(a().B(), 2)) {
                                                                                                        strU = i0().U(g3Var);
                                                                                                    } else {
                                                                                                        strU = str2;
                                                                                                    }
                                                                                                    i0();
                                                                                                    byte[] bArrA = g3Var.a();
                                                                                                    p(arrayList);
                                                                                                    this.B.B.b(j);
                                                                                                    a().y().d("Uploading data. app, uncompressed size, data", str3, Integer.valueOf(bArrA.length), strU);
                                                                                                    this.N = true;
                                                                                                    T(z0Var);
                                                                                                    z0Var.Q(str3, h4VarS, g3Var, new com.gamericefishpro.space.a8.c((m4) this, str3, (Object) arrayList2, 23));
                                                                                                }
                                                                                            }
                                                                                        } catch (p5 e6) {
                                                                                            r1Var3.a().D.c("Failed to parse stored NO_DATA mode event, appId", v0.z(str3), e6);
                                                                                        }
                                                                                        try {
                                                                                            if (!cursorQuery2.moveToNext()) {
                                                                                                break;
                                                                                            }
                                                                                            cursorQuery2 = cursorQuery2;
                                                                                            arrayList6 = arrayList6;
                                                                                        } catch (SQLiteException e7) {
                                                                                            e = e7;
                                                                                            r1Var3.a().v().c("Error flushing NO_DATA mode events. appId", v0.z(str3), e);
                                                                                            list7 = Collections.EMPTY_LIST;
                                                                                            if (cursorQuery2 != null) {
                                                                                                cursorQuery2.close();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    cursorQuery2.close();
                                                                                    try {
                                                                                        int iDelete2 = sQLiteDatabaseG0.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)});
                                                                                        t0 t0VarY4 = r1Var3.a().y();
                                                                                        StringBuilder sb4 = new StringBuilder(String.valueOf(iDelete2).length() + 34);
                                                                                        sb4.append("Pruned ");
                                                                                        sb4.append(iDelete2);
                                                                                        sb4.append(" NO_DATA mode events. appId");
                                                                                        t0VarY4.b(str3, sb4.toString());
                                                                                    } catch (SQLiteException e8) {
                                                                                        e = e8;
                                                                                        cursorQuery2 = null;
                                                                                        r1Var3.a().v().c("Error flushing NO_DATA mode events. appId", v0.z(str3), e);
                                                                                        list7 = Collections.EMPTY_LIST;
                                                                                        if (cursorQuery2 != null) {
                                                                                            cursorQuery2.close();
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    arrayList6 = arrayList6;
                                                                                    cursorQuery2.close();
                                                                                }
                                                                                list7 = arrayList6;
                                                                            } catch (Throwable th) {
                                                                                th = th;
                                                                                r23 = cursorQuery2;
                                                                                r15 = r23;
                                                                                if (r15 != 0) {
                                                                                    r15.close();
                                                                                }
                                                                                throw th;
                                                                            }
                                                                        } catch (SQLiteException e9) {
                                                                            e = e9;
                                                                            cursorQuery2 = cursorQuery2;
                                                                            r1Var3 = r1Var2;
                                                                        }
                                                                    } catch (Throwable th2) {
                                                                        th = th2;
                                                                        r15 = 0;
                                                                        if (r15 != 0) {
                                                                            r15.close();
                                                                        }
                                                                        throw th;
                                                                    }
                                                                } catch (SQLiteException e10) {
                                                                    e = e10;
                                                                    r1Var3 = r1Var2;
                                                                }
                                                                it5 = list2.iterator();
                                                                z6 = true;
                                                                while (it5.hasNext()) {
                                                                    Pair pair3 = (Pair) it5.next();
                                                                    h3Var2 = (com.gamericefishpro.space.i9.h3) ((com.gamericefishpro.space.i9.i3) pair3.first).i();
                                                                    if (z6) {
                                                                        List listU3 = h3Var2.U();
                                                                        h3Var2.b();
                                                                        ((com.gamericefishpro.space.i9.i3) h3Var2.e).a0();
                                                                        h3Var2.b();
                                                                        ((com.gamericefishpro.space.i9.i3) h3Var2.e).Z(list7);
                                                                        h3Var2.b();
                                                                        ((com.gamericefishpro.space.i9.i3) h3Var2.e).Z(listU3);
                                                                        z6 = false;
                                                                    }
                                                                    com.gamericefishpro.space.i9.t2 t2VarQ3 = com.gamericefishpro.space.i9.w2.q();
                                                                    z1VarM = e0().M(str3);
                                                                    arrayList7 = new ArrayList();
                                                                    if (z1VarM != null) {
                                                                        it6 = z1VarM.p().iterator();
                                                                        while (it6.hasNext()) {
                                                                            com.gamericefishpro.space.i9.w1 w1Var3 = (com.gamericefishpro.space.i9.w1) it6.next();
                                                                            Iterator it12 = it5;
                                                                            com.gamericefishpro.space.i9.u2 u2VarP3 = com.gamericefishpro.space.i9.v2.p();
                                                                            boolean z11 = z6;
                                                                            iP = w1Var3.p() - 1;
                                                                            List list12 = list7;
                                                                            if (iP != 1) {
                                                                                it7 = it6;
                                                                                i8 = 3;
                                                                                i9 = 2;
                                                                            } else if (iP != 2) {
                                                                                it7 = it6;
                                                                                i8 = 3;
                                                                                if (iP != 3) {
                                                                                    i9 = 4;
                                                                                } else if (iP != 4) {
                                                                                    i9 = 1;
                                                                                } else {
                                                                                    i9 = 5;
                                                                                }
                                                                            } else {
                                                                                it7 = it6;
                                                                                i8 = 3;
                                                                                i9 = 3;
                                                                            }
                                                                            u2VarP3.h(i9);
                                                                            iR = w1Var3.r() - 1;
                                                                            if (iR != 1) {
                                                                                i8 = 2;
                                                                            } else if (iR != 2) {
                                                                                i8 = 1;
                                                                            }
                                                                            u2VarP3.i(i8);
                                                                            arrayList7.add((com.gamericefishpro.space.i9.v2) u2VarP3.e());
                                                                            it5 = it12;
                                                                            list7 = list12;
                                                                            z6 = z11;
                                                                            it6 = it7;
                                                                        }
                                                                    }
                                                                    Iterator it13 = it5;
                                                                    boolean z12 = z6;
                                                                    List list13 = list7;
                                                                    t2VarQ3.h(arrayList7);
                                                                    h3Var2.E(t2VarQ3);
                                                                    arrayList5.add(Pair.create((com.gamericefishpro.space.i9.i3) h3Var2.e(), (Long) pair3.second));
                                                                    it5 = it13;
                                                                    list7 = list13;
                                                                    z6 = z12;
                                                                }
                                                                list6 = arrayList5;
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                            }
                                                        }
                                                        zIsEmpty2 = list6.isEmpty();
                                                        list3 = list6;
                                                        if (zIsEmpty2) {
                                                            return;
                                                        }
                                                    } else {
                                                        i = 34;
                                                        list3 = list2;
                                                    }
                                                    e2VarB = b(str);
                                                    d2Var2 = d2.AD_STORAGE;
                                                    if (e2VarB.i(d2Var2)) {
                                                        i2 = 0;
                                                        listSubList = list3;
                                                        break;
                                                    }
                                                    it4 = list3.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            strV2 = null;
                                                            break;
                                                        }
                                                        i3Var2 = (com.gamericefishpro.space.i9.i3) ((Pair) it4.next()).first;
                                                        if (!i3Var2.v().isEmpty()) {
                                                            strV2 = i3Var2.v();
                                                            break;
                                                        }
                                                    }
                                                    if (strV2 != null) {
                                                        i2 = 0;
                                                        listSubList = list3;
                                                        break;
                                                    }
                                                    i7 = 0;
                                                    while (true) {
                                                        if (i7 < list3.size()) {
                                                            i2 = 0;
                                                            listSubList = list3;
                                                            break;
                                                        }
                                                        i3Var = (com.gamericefishpro.space.i9.i3) ((Pair) list3.get(i7)).first;
                                                        if (!i3Var.v().isEmpty()) {
                                                            i2 = 0;
                                                            listSubList = list3.subList(0, i7);
                                                            break;
                                                        }
                                                        i7++;
                                                    }
                                                    f3VarW = com.gamericefishpro.space.i9.g3.w();
                                                    size = listSubList.size();
                                                    arrayList = new ArrayList(listSubList.size());
                                                    if (d0().s(str3)) {
                                                        i3 = i2;
                                                    } else {
                                                        i3 = i2;
                                                    }
                                                    zI = b(str).i(d2Var2);
                                                    zI2 = b(str).i(d2Var);
                                                    zB2 = d0().B(str3, e0.M0);
                                                    i4Var = this.C;
                                                    h4VarS = i4Var.s(str3);
                                                    list4 = listSubList;
                                                    while (true) {
                                                        r1Var = this.E;
                                                        if (i2 < size) {
                                                            break;
                                                            break;
                                                        }
                                                        h3Var = (com.gamericefishpro.space.i9.h3) ((com.gamericefishpro.space.i9.i3) ((Pair) list4.get(i2)).first).i();
                                                        int i14 = size;
                                                        arrayList.add((Long) ((Pair) list4.get(i2)).second);
                                                        d0().w();
                                                        h3Var.s();
                                                        h3Var.b();
                                                        ((com.gamericefishpro.space.i9.i3) h3Var.e).f0(j);
                                                        r1Var.getClass();
                                                        h3Var.I();
                                                        if (i3 == 0) {
                                                            h3Var.b();
                                                            ((com.gamericefishpro.space.i9.i3) h3Var.e).S0();
                                                        }
                                                        if (!zI) {
                                                            h3Var.b();
                                                            ((com.gamericefishpro.space.i9.i3) h3Var.e).z1();
                                                            h3Var.b();
                                                            ((com.gamericefishpro.space.i9.i3) h3Var.e).B1();
                                                        }
                                                        if (!zI2) {
                                                            h3Var.b();
                                                            ((com.gamericefishpro.space.i9.i3) h3Var.e).D1();
                                                        }
                                                        v(h3Var, str3);
                                                        if (!zB2) {
                                                            h3Var.b();
                                                            ((com.gamericefishpro.space.i9.i3) h3Var.e).Z0();
                                                        }
                                                        if (!zI2) {
                                                            h3Var.b();
                                                            ((com.gamericefishpro.space.i9.i3) h3Var.e).L1();
                                                        }
                                                        strV = ((com.gamericefishpro.space.i9.i3) h3Var.e).v();
                                                        if (TextUtils.isEmpty(strV)) {
                                                            i5 = i3;
                                                            if (strV.equals("00000000-0000-0000-0000-000000000000")) {
                                                                i6 = i2;
                                                                z4 = zI2;
                                                                list5 = list4;
                                                                z5 = zB2;
                                                            }
                                                            if (h3Var.V() != 0) {
                                                                if (d0().B(str3, e0.C0)) {
                                                                    h3Var.P(i0().c0(((com.gamericefishpro.space.i9.i3) h3Var.e()).a()));
                                                                }
                                                                p3VarB = h4VarS.b();
                                                                if (p3VarB != null) {
                                                                    h3Var.B(p3VarB);
                                                                }
                                                                f3VarW.b();
                                                                ((com.gamericefishpro.space.i9.g3) f3VarW.e).z((com.gamericefishpro.space.i9.i3) h3Var.e());
                                                            }
                                                            i2 = i6 + 1;
                                                            i3 = i5;
                                                            size = i14;
                                                            list4 = list5;
                                                            zI2 = z4;
                                                            zB2 = z5;
                                                        } else {
                                                            i5 = i3;
                                                        }
                                                        arrayList4 = new ArrayList(h3Var.U());
                                                        it3 = arrayList4.iterator();
                                                        i6 = i2;
                                                        lValueOf = null;
                                                        lValueOf2 = null;
                                                        z2 = false;
                                                        z3 = false;
                                                        while (it3.hasNext()) {
                                                            zI2 = zI2;
                                                            a3Var4 = (com.gamericefishpro.space.i9.a3) it3.next();
                                                            list4 = list4;
                                                            zB2 = zB2;
                                                            if ("_fx".equals(a3Var4.s())) {
                                                                it3.remove();
                                                                z2 = true;
                                                            } else if ("_f".equals(a3Var4.s())) {
                                                                i0();
                                                                d3VarZ = z0.z(a3Var4, "_pfo");
                                                                if (d3VarZ != null) {
                                                                    lValueOf = Long.valueOf(d3VarZ.u());
                                                                }
                                                                i0();
                                                                d3VarZ2 = z0.z(a3Var4, "_uwa");
                                                                if (d3VarZ2 != null) {
                                                                    lValueOf2 = Long.valueOf(d3VarZ2.u());
                                                                }
                                                            } else {
                                                                list4 = list4;
                                                                zI2 = zI2;
                                                                zB2 = zB2;
                                                            }
                                                            z3 = true;
                                                        }
                                                        z4 = zI2;
                                                        list5 = list4;
                                                        z5 = zB2;
                                                        if (z2) {
                                                            h3Var.b();
                                                            ((com.gamericefishpro.space.i9.i3) h3Var.e).a0();
                                                            h3Var.b();
                                                            ((com.gamericefishpro.space.i9.i3) h3Var.e).Z(arrayList4);
                                                        }
                                                        if (z3) {
                                                            u(h3Var.o(), true, lValueOf, lValueOf2);
                                                        }
                                                        if (h3Var.V() != 0) {
                                                            if (d0().B(str3, e0.C0)) {
                                                                h3Var.P(i0().c0(((com.gamericefishpro.space.i9.i3) h3Var.e()).a()));
                                                            }
                                                            p3VarB = h4VarS.b();
                                                            if (p3VarB != null) {
                                                                h3Var.B(p3VarB);
                                                            }
                                                            f3VarW.b();
                                                            ((com.gamericefishpro.space.i9.g3) f3VarW.e).z((com.gamericefishpro.space.i9.i3) h3Var.e());
                                                        }
                                                        i2 = i6 + 1;
                                                        i3 = i5;
                                                        size = i14;
                                                        list4 = list5;
                                                        zI2 = z4;
                                                        zB2 = z5;
                                                    }
                                                    if (((com.gamericefishpro.space.i9.g3) f3VarW.e).q() == 0) {
                                                        p(arrayList);
                                                        y(false, 204, null, null, str3, Collections.EMPTY_LIST);
                                                        return;
                                                    }
                                                    g3Var = (com.gamericefishpro.space.i9.g3) f3VarW.e();
                                                    arrayList2 = new ArrayList();
                                                    a3Var = h4VarS.c;
                                                    if (a3Var == a3.SGTM_CLIENT) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                    if (a3Var == a3.SGTM) {
                                                        it = ((com.gamericefishpro.space.i9.g3) f3VarW.e()).p().iterator();
                                                        while (true) {
                                                            if (it.hasNext()) {
                                                                if (((com.gamericefishpro.space.i9.i3) it.next()).N()) {
                                                                    string = UUID.randomUUID().toString();
                                                                    break;
                                                                }
                                                            } else {
                                                                string = null;
                                                                break;
                                                            }
                                                        }
                                                        com.gamericefishpro.space.i9.g3 g3Var9 = (com.gamericefishpro.space.i9.g3) f3VarW.e();
                                                        c().r();
                                                        k0();
                                                        f3VarX = com.gamericefishpro.space.i9.g3.x(g3Var9);
                                                        if (!TextUtils.isEmpty(string)) {
                                                            f3VarX.b();
                                                            ((com.gamericefishpro.space.i9.g3) f3VarX.e).C(string);
                                                        }
                                                        strE = e0().E(str3);
                                                        if (!TextUtils.isEmpty(strE)) {
                                                            f3VarX.i(strE);
                                                        }
                                                        arrayList3 = new ArrayList();
                                                        it2 = g3Var9.p().iterator();
                                                        while (it2.hasNext()) {
                                                            com.gamericefishpro.space.i9.h3 h3VarV3 = com.gamericefishpro.space.i9.i3.V((com.gamericefishpro.space.i9.i3) it2.next());
                                                            h3VarV3.b();
                                                            ((com.gamericefishpro.space.i9.i3) h3VarV3.e).S0();
                                                            arrayList3.add((com.gamericefishpro.space.i9.i3) h3VarV3.e());
                                                        }
                                                        f3VarX.b();
                                                        ((com.gamericefishpro.space.i9.g3) f3VarX.e).B();
                                                        f3VarX.b();
                                                        ((com.gamericefishpro.space.i9.g3) f3VarX.e).A(arrayList3);
                                                        t0 t0VarY5 = a().y();
                                                        if (TextUtils.isEmpty(string)) {
                                                            strH = "null";
                                                        } else {
                                                            strH = f3VarX.h();
                                                        }
                                                        t0VarY5.b(strH, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
                                                        g3Var2 = (com.gamericefishpro.space.i9.g3) f3VarX.e();
                                                        if (TextUtils.isEmpty(string)) {
                                                            com.gamericefishpro.space.i9.g3 g3Var10 = (com.gamericefishpro.space.i9.g3) f3VarW.e();
                                                            c().r();
                                                            k0();
                                                            f3VarW2 = com.gamericefishpro.space.i9.g3.w();
                                                            a().y().b(string, "[sgtm] Processing Google Signal, sgtmJoinId:");
                                                            f3VarW2.b();
                                                            ((com.gamericefishpro.space.i9.g3) f3VarW2.e).C(string);
                                                            while (r0.hasNext()) {
                                                                com.gamericefishpro.space.i9.h3 h3VarU3 = com.gamericefishpro.space.i9.i3.U();
                                                                String strO3 = i3Var3.O();
                                                                h3VarU3.b();
                                                                ((com.gamericefishpro.space.i9.i3) h3VarU3.e).R0(strO3);
                                                                int iK2 = i3Var3.K0();
                                                                h3VarU3.b();
                                                                ((com.gamericefishpro.space.i9.i3) h3VarU3.e).j1(iK2);
                                                                f3VarW2.b();
                                                                ((com.gamericefishpro.space.i9.g3) f3VarW2.e).z((com.gamericefishpro.space.i9.i3) h3VarU3.e());
                                                            }
                                                            com.gamericefishpro.space.i9.g3 g3Var11 = (com.gamericefishpro.space.i9.g3) f3VarW2.e();
                                                            strE2 = i4Var.e.e0().E(str3);
                                                            zIsEmpty = TextUtils.isEmpty(strE2);
                                                            a3Var2 = a3.GOOGLE_SIGNAL;
                                                            a3Var3 = a3.GOOGLE_SIGNAL_PENDING;
                                                            if (zIsEmpty) {
                                                                Uri uri3 = Uri.parse((String) e0.s.a(null));
                                                                Uri.Builder builderBuildUpon3 = uri3.buildUpon();
                                                                String authority3 = uri3.getAuthority();
                                                                StringBuilder sb5 = new StringBuilder(String.valueOf(strE2).length() + 1 + String.valueOf(authority3).length());
                                                                sb5.append(strE2);
                                                                sb5.append(".");
                                                                sb5.append(authority3);
                                                                builderBuildUpon3.authority(sb5.toString());
                                                                String string4 = builderBuildUpon3.build().toString();
                                                                if (z) {
                                                                    a3Var2 = a3Var3;
                                                                }
                                                                str2 = null;
                                                                h4Var = new h4(string4, Collections.EMPTY_MAP, a3Var2, null);
                                                            } else {
                                                                str2 = null;
                                                                String str6 = (String) e0.s.a(null);
                                                                if (z) {
                                                                    a3Var2 = a3Var3;
                                                                }
                                                                h4Var = new h4(str6, Collections.EMPTY_MAP, a3Var2, null);
                                                            }
                                                            arrayList2.add(Pair.create(g3Var11, h4Var));
                                                        } else {
                                                            str2 = null;
                                                        }
                                                        if (z) {
                                                            f3Var = (com.gamericefishpro.space.i9.f3) g3Var2.i();
                                                            while (i4 < g3Var2.q()) {
                                                                com.gamericefishpro.space.i9.h3 h3Var5 = (com.gamericefishpro.space.i9.h3) g3Var2.r(i4).i();
                                                                h3Var5.a0();
                                                                h3Var5.C(j);
                                                                f3Var.b();
                                                                ((com.gamericefishpro.space.i9.g3) f3Var.e).y(i4, (com.gamericefishpro.space.i9.i3) h3Var5.e());
                                                            }
                                                            arrayList2.add(Pair.create((com.gamericefishpro.space.i9.g3) f3Var.e(), h4VarS));
                                                            p(arrayList);
                                                            y(false, 204, null, null, str, arrayList2);
                                                            if (s(str, h4VarS.a())) {
                                                                a().y().b(str, "[sgtm] Sending sgtm batches available notification to app");
                                                                intent = new Intent();
                                                                intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                                                intent.setPackage(str);
                                                                contextD = r1Var.d();
                                                                if (Build.VERSION.SDK_INT < i) {
                                                                    contextD.sendBroadcast(intent);
                                                                    return;
                                                                } else {
                                                                    contextD.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                                                    return;
                                                                }
                                                            }
                                                            return;
                                                        }
                                                        str3 = str;
                                                        g3Var = g3Var2;
                                                    } else if (z) {
                                                        z = true;
                                                        it = ((com.gamericefishpro.space.i9.g3) f3VarW.e()).p().iterator();
                                                        while (true) {
                                                            if (it.hasNext()) {
                                                                if (((com.gamericefishpro.space.i9.i3) it.next()).N()) {
                                                                    string = UUID.randomUUID().toString();
                                                                    break;
                                                                }
                                                            } else {
                                                                string = null;
                                                                break;
                                                            }
                                                        }
                                                        com.gamericefishpro.space.i9.g3 g3Var12 = (com.gamericefishpro.space.i9.g3) f3VarW.e();
                                                        c().r();
                                                        k0();
                                                        f3VarX = com.gamericefishpro.space.i9.g3.x(g3Var12);
                                                        if (!TextUtils.isEmpty(string)) {
                                                            f3VarX.b();
                                                            ((com.gamericefishpro.space.i9.g3) f3VarX.e).C(string);
                                                        }
                                                        strE = e0().E(str3);
                                                        if (!TextUtils.isEmpty(strE)) {
                                                            f3VarX.i(strE);
                                                        }
                                                        arrayList3 = new ArrayList();
                                                        it2 = g3Var12.p().iterator();
                                                        while (it2.hasNext()) {
                                                            com.gamericefishpro.space.i9.h3 h3VarV4 = com.gamericefishpro.space.i9.i3.V((com.gamericefishpro.space.i9.i3) it2.next());
                                                            h3VarV4.b();
                                                            ((com.gamericefishpro.space.i9.i3) h3VarV4.e).S0();
                                                            arrayList3.add((com.gamericefishpro.space.i9.i3) h3VarV4.e());
                                                        }
                                                        f3VarX.b();
                                                        ((com.gamericefishpro.space.i9.g3) f3VarX.e).B();
                                                        f3VarX.b();
                                                        ((com.gamericefishpro.space.i9.g3) f3VarX.e).A(arrayList3);
                                                        t0 t0VarY6 = a().y();
                                                        if (TextUtils.isEmpty(string)) {
                                                            strH = "null";
                                                        } else {
                                                            strH = f3VarX.h();
                                                        }
                                                        t0VarY6.b(strH, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
                                                        g3Var2 = (com.gamericefishpro.space.i9.g3) f3VarX.e();
                                                        if (TextUtils.isEmpty(string)) {
                                                            com.gamericefishpro.space.i9.g3 g3Var13 = (com.gamericefishpro.space.i9.g3) f3VarW.e();
                                                            c().r();
                                                            k0();
                                                            f3VarW2 = com.gamericefishpro.space.i9.g3.w();
                                                            a().y().b(string, "[sgtm] Processing Google Signal, sgtmJoinId:");
                                                            f3VarW2.b();
                                                            ((com.gamericefishpro.space.i9.g3) f3VarW2.e).C(string);
                                                            while (r0.hasNext()) {
                                                                com.gamericefishpro.space.i9.h3 h3VarU4 = com.gamericefishpro.space.i9.i3.U();
                                                                String strO4 = i3Var3.O();
                                                                h3VarU4.b();
                                                                ((com.gamericefishpro.space.i9.i3) h3VarU4.e).R0(strO4);
                                                                int iK3 = i3Var3.K0();
                                                                h3VarU4.b();
                                                                ((com.gamericefishpro.space.i9.i3) h3VarU4.e).j1(iK3);
                                                                f3VarW2.b();
                                                                ((com.gamericefishpro.space.i9.g3) f3VarW2.e).z((com.gamericefishpro.space.i9.i3) h3VarU4.e());
                                                            }
                                                            com.gamericefishpro.space.i9.g3 g3Var14 = (com.gamericefishpro.space.i9.g3) f3VarW2.e();
                                                            strE2 = i4Var.e.e0().E(str3);
                                                            zIsEmpty = TextUtils.isEmpty(strE2);
                                                            a3Var2 = a3.GOOGLE_SIGNAL;
                                                            a3Var3 = a3.GOOGLE_SIGNAL_PENDING;
                                                            if (zIsEmpty) {
                                                                Uri uri4 = Uri.parse((String) e0.s.a(null));
                                                                Uri.Builder builderBuildUpon4 = uri4.buildUpon();
                                                                String authority4 = uri4.getAuthority();
                                                                StringBuilder sb6 = new StringBuilder(String.valueOf(strE2).length() + 1 + String.valueOf(authority4).length());
                                                                sb6.append(strE2);
                                                                sb6.append(".");
                                                                sb6.append(authority4);
                                                                builderBuildUpon4.authority(sb6.toString());
                                                                String string5 = builderBuildUpon4.build().toString();
                                                                if (z) {
                                                                    a3Var2 = a3Var3;
                                                                }
                                                                str2 = null;
                                                                h4Var = new h4(string5, Collections.EMPTY_MAP, a3Var2, null);
                                                            } else {
                                                                str2 = null;
                                                                String str7 = (String) e0.s.a(null);
                                                                if (z) {
                                                                    a3Var2 = a3Var3;
                                                                }
                                                                h4Var = new h4(str7, Collections.EMPTY_MAP, a3Var2, null);
                                                            }
                                                            arrayList2.add(Pair.create(g3Var14, h4Var));
                                                        } else {
                                                            str2 = null;
                                                        }
                                                        if (z) {
                                                            f3Var = (com.gamericefishpro.space.i9.f3) g3Var2.i();
                                                            while (i4 < g3Var2.q()) {
                                                                com.gamericefishpro.space.i9.h3 h3Var6 = (com.gamericefishpro.space.i9.h3) g3Var2.r(i4).i();
                                                                h3Var6.a0();
                                                                h3Var6.C(j);
                                                                f3Var.b();
                                                                ((com.gamericefishpro.space.i9.g3) f3Var.e).y(i4, (com.gamericefishpro.space.i9.i3) h3Var6.e());
                                                            }
                                                            arrayList2.add(Pair.create((com.gamericefishpro.space.i9.g3) f3Var.e(), h4VarS));
                                                            p(arrayList);
                                                            y(false, 204, null, null, str, arrayList2);
                                                            if (s(str, h4VarS.a())) {
                                                                a().y().b(str, "[sgtm] Sending sgtm batches available notification to app");
                                                                intent = new Intent();
                                                                intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                                                intent.setPackage(str);
                                                                contextD = r1Var.d();
                                                                if (Build.VERSION.SDK_INT < i) {
                                                                    contextD.sendBroadcast(intent);
                                                                    return;
                                                                } else {
                                                                    contextD.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                                                    return;
                                                                }
                                                            }
                                                            return;
                                                        }
                                                        str3 = str;
                                                        g3Var = g3Var2;
                                                    } else {
                                                        str2 = null;
                                                    }
                                                    z0Var = this.e;
                                                    T(z0Var);
                                                    if (z0Var.L()) {
                                                        if (Log.isLoggable(a().B(), 2)) {
                                                            strU = i0().U(g3Var);
                                                        } else {
                                                            strU = str2;
                                                        }
                                                        i0();
                                                        byte[] bArrA2 = g3Var.a();
                                                        p(arrayList);
                                                        this.B.B.b(j);
                                                        a().y().d("Uploading data. app, uncompressed size, data", str3, Integer.valueOf(bArrA2.length), strU);
                                                        this.N = true;
                                                        T(z0Var);
                                                        z0Var.Q(str3, h4VarS, g3Var, new com.gamericefishpro.space.a8.c((m4) this, str3, (Object) arrayList2, 23));
                                                    }
                                                }
                                            }
                                            gZIPInputStream.close();
                                            byteArrayInputStream.close();
                                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                                            if (!arrayList8.isEmpty() && byteArray.length + length > iMax) {
                                                break;
                                            }
                                            try {
                                                com.gamericefishpro.space.i9.h3 h3Var7 = (com.gamericefishpro.space.i9.h3) z0.e0(com.gamericefishpro.space.i9.i3.U(), byteArray);
                                                if (!arrayList8.isEmpty()) {
                                                    com.gamericefishpro.space.i9.i3 i3Var4 = (com.gamericefishpro.space.i9.i3) ((Pair) arrayList8.get(0)).first;
                                                    com.gamericefishpro.space.i9.i3 i3Var5 = (com.gamericefishpro.space.i9.i3) h3Var7.e();
                                                    if (!i3Var4.u0().equals(i3Var5.u0()) || !i3Var4.B0().equals(i3Var5.B0()) || i3Var4.D0() != i3Var5.D0() || !i3Var4.F0().equals(i3Var5.F0())) {
                                                        break;
                                                    }
                                                    Iterator it14 = i3Var4.U1().iterator();
                                                    while (true) {
                                                        if (!it14.hasNext()) {
                                                            jV = -1;
                                                            break;
                                                        }
                                                        com.gamericefishpro.space.i9.r3 r3Var = (com.gamericefishpro.space.i9.r3) it14.next();
                                                        Iterator it15 = it14;
                                                        if ("_npa".equals(r3Var.r())) {
                                                            jV = r3Var.v();
                                                            break;
                                                        }
                                                        it14 = it15;
                                                    }
                                                    Iterator it16 = i3Var5.U1().iterator();
                                                    while (true) {
                                                        if (!it16.hasNext()) {
                                                            jV2 = -1;
                                                            break;
                                                        }
                                                        com.gamericefishpro.space.i9.r3 r3Var2 = (com.gamericefishpro.space.i9.r3) it16.next();
                                                        if ("_npa".equals(r3Var2.r())) {
                                                            jV2 = r3Var2.v();
                                                            break;
                                                        }
                                                    }
                                                    if (jV != jV2) {
                                                        break;
                                                    }
                                                }
                                                if (!cursorQuery.isNull(2)) {
                                                    int i15 = cursorQuery.getInt(2);
                                                    h3Var7.b();
                                                    ((com.gamericefishpro.space.i9.i3) h3Var7.e).T0(i15);
                                                }
                                                length += byteArray.length;
                                                arrayList8.add(Pair.create((com.gamericefishpro.space.i9.i3) h3Var7.e(), Long.valueOf(j3)));
                                            } catch (IOException e11) {
                                                r1Var4.a().v().c("Failed to merge queued bundle. appId", v0.z(str3), e11);
                                            }
                                            r1Var4 = r1Var4;
                                            r22 = r22;
                                            if (cursorQuery.moveToNext() || length > iMax) {
                                                break;
                                                break;
                                            }
                                            r8 = r22;
                                            r1Var4 = r1Var4;
                                            i10 = 0;
                                            i11 = 1;
                                        } catch (IOException e12) {
                                            e = e12;
                                            r22 = r8;
                                        }
                                    } catch (IOException e13) {
                                        e = e13;
                                        r22 = r8;
                                        r1Var4 = r1Var4;
                                    }
                                }
                                cursorQuery.close();
                                list2 = arrayList8;
                                r23 = r22;
                            } else {
                                list = Collections.EMPTY_LIST;
                                r25 = "rowid";
                                cursorQuery.close();
                                r24 = r25;
                                list2 = list;
                                r23 = r24;
                            }
                        } catch (SQLiteException e14) {
                            e = e14;
                            r1Var4 = r1Var4;
                        }
                    } catch (SQLiteException e15) {
                        e = e15;
                        cursorQuery = null;
                        r1Var4.a().v().c("Error querying bundles. appId", v0.z(str3), e);
                        list = Collections.EMPTY_LIST;
                        r25 = r22;
                        r24 = r22;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                            r24 = r25;
                        }
                        list2 = list;
                        r23 = r24;
                        if (list2.isEmpty()) {
                            return;
                        }
                        q7Var = q7.e;
                        g gVarD1 = d0();
                        d0Var = e0.h1;
                        zB = gVarD1.B(null, d0Var);
                        d2Var = d2.ANALYTICS_STORAGE;
                        if (zB) {
                            if (!d0().B(null, d0Var)) {
                                i = 34;
                                list6 = list2;
                            } else if (b(str).i(d2Var)) {
                                i = 34;
                                arrayList5 = new ArrayList(list2.size());
                                m mVarF3 = f0();
                                r1Var2 = (r1) mVarF3.d;
                                com.gamericefishpro.space.v8.c0.d(str3);
                                mVarF3.r();
                                mVarF3.s();
                                arrayList6 = new ArrayList();
                                sQLiteDatabaseG0 = mVarF3.g0();
                                r1Var2.e().getClass();
                                jCurrentTimeMillis = System.currentTimeMillis();
                                cursorQuery2 = sQLiteDatabaseG0.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
                                if (cursorQuery2.moveToFirst()) {
                                    r1Var3 = r1Var2;
                                    while (true) {
                                        arrayList6.add((com.gamericefishpro.space.i9.a3) ((com.gamericefishpro.space.i9.z2) z0.e0(com.gamericefishpro.space.i9.a3.z(), cursorQuery2.getBlob(0))).e());
                                        if (!cursorQuery2.moveToNext()) {
                                            break;
                                            break;
                                        } else {
                                            cursorQuery2 = cursorQuery2;
                                            arrayList6 = arrayList6;
                                        }
                                    }
                                    cursorQuery2.close();
                                    int iDelete3 = sQLiteDatabaseG0.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)});
                                    t0 t0VarY7 = r1Var3.a().y();
                                    StringBuilder sb7 = new StringBuilder(String.valueOf(iDelete3).length() + 34);
                                    sb7.append("Pruned ");
                                    sb7.append(iDelete3);
                                    sb7.append(" NO_DATA mode events. appId");
                                    t0VarY7.b(str3, sb7.toString());
                                } else {
                                    arrayList6 = arrayList6;
                                    cursorQuery2.close();
                                }
                                list7 = arrayList6;
                                it5 = list2.iterator();
                                z6 = true;
                                while (it5.hasNext()) {
                                    Pair pair4 = (Pair) it5.next();
                                    h3Var2 = (com.gamericefishpro.space.i9.h3) ((com.gamericefishpro.space.i9.i3) pair4.first).i();
                                    if (z6) {
                                        List listU4 = h3Var2.U();
                                        h3Var2.b();
                                        ((com.gamericefishpro.space.i9.i3) h3Var2.e).a0();
                                        h3Var2.b();
                                        ((com.gamericefishpro.space.i9.i3) h3Var2.e).Z(list7);
                                        h3Var2.b();
                                        ((com.gamericefishpro.space.i9.i3) h3Var2.e).Z(listU4);
                                        z6 = false;
                                    }
                                    com.gamericefishpro.space.i9.t2 t2VarQ4 = com.gamericefishpro.space.i9.w2.q();
                                    z1VarM = e0().M(str3);
                                    arrayList7 = new ArrayList();
                                    if (z1VarM != null) {
                                        it6 = z1VarM.p().iterator();
                                        while (it6.hasNext()) {
                                            com.gamericefishpro.space.i9.w1 w1Var4 = (com.gamericefishpro.space.i9.w1) it6.next();
                                            Iterator it17 = it5;
                                            com.gamericefishpro.space.i9.u2 u2VarP4 = com.gamericefishpro.space.i9.v2.p();
                                            boolean z13 = z6;
                                            iP = w1Var4.p() - 1;
                                            List list14 = list7;
                                            if (iP != 1) {
                                                it7 = it6;
                                                i8 = 3;
                                                i9 = 2;
                                            } else if (iP != 2) {
                                                it7 = it6;
                                                i8 = 3;
                                                if (iP != 3) {
                                                    i9 = 4;
                                                } else if (iP != 4) {
                                                    i9 = 1;
                                                } else {
                                                    i9 = 5;
                                                }
                                            } else {
                                                it7 = it6;
                                                i8 = 3;
                                                i9 = 3;
                                            }
                                            u2VarP4.h(i9);
                                            iR = w1Var4.r() - 1;
                                            if (iR != 1) {
                                                i8 = 2;
                                            } else if (iR != 2) {
                                                i8 = 1;
                                            }
                                            u2VarP4.i(i8);
                                            arrayList7.add((com.gamericefishpro.space.i9.v2) u2VarP4.e());
                                            it5 = it17;
                                            list7 = list14;
                                            z6 = z13;
                                            it6 = it7;
                                        }
                                    }
                                    Iterator it18 = it5;
                                    boolean z14 = z6;
                                    List list15 = list7;
                                    t2VarQ4.h(arrayList7);
                                    h3Var2.E(t2VarQ4);
                                    arrayList5.add(Pair.create((com.gamericefishpro.space.i9.i3) h3Var2.e(), (Long) pair4.second));
                                    it5 = it18;
                                    list7 = list15;
                                    z6 = z14;
                                }
                                list6 = arrayList5;
                            } else {
                                i = 34;
                                arrayList5 = new ArrayList(list2.size());
                                m mVarF4 = f0();
                                r1Var2 = (r1) mVarF4.d;
                                com.gamericefishpro.space.v8.c0.d(str3);
                                mVarF4.r();
                                mVarF4.s();
                                arrayList6 = new ArrayList();
                                sQLiteDatabaseG0 = mVarF4.g0();
                                r1Var2.e().getClass();
                                jCurrentTimeMillis = System.currentTimeMillis();
                                cursorQuery2 = sQLiteDatabaseG0.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
                                if (cursorQuery2.moveToFirst()) {
                                    r1Var3 = r1Var2;
                                    while (true) {
                                        arrayList6.add((com.gamericefishpro.space.i9.a3) ((com.gamericefishpro.space.i9.z2) z0.e0(com.gamericefishpro.space.i9.a3.z(), cursorQuery2.getBlob(0))).e());
                                        if (!cursorQuery2.moveToNext()) {
                                            break;
                                            break;
                                        } else {
                                            cursorQuery2 = cursorQuery2;
                                            arrayList6 = arrayList6;
                                        }
                                    }
                                    cursorQuery2.close();
                                    int iDelete4 = sQLiteDatabaseG0.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)});
                                    t0 t0VarY8 = r1Var3.a().y();
                                    StringBuilder sb8 = new StringBuilder(String.valueOf(iDelete4).length() + 34);
                                    sb8.append("Pruned ");
                                    sb8.append(iDelete4);
                                    sb8.append(" NO_DATA mode events. appId");
                                    t0VarY8.b(str3, sb8.toString());
                                } else {
                                    arrayList6 = arrayList6;
                                    cursorQuery2.close();
                                }
                                list7 = arrayList6;
                                it5 = list2.iterator();
                                z6 = true;
                                while (it5.hasNext()) {
                                    Pair pair5 = (Pair) it5.next();
                                    h3Var2 = (com.gamericefishpro.space.i9.h3) ((com.gamericefishpro.space.i9.i3) pair5.first).i();
                                    if (z6) {
                                        List listU5 = h3Var2.U();
                                        h3Var2.b();
                                        ((com.gamericefishpro.space.i9.i3) h3Var2.e).a0();
                                        h3Var2.b();
                                        ((com.gamericefishpro.space.i9.i3) h3Var2.e).Z(list7);
                                        h3Var2.b();
                                        ((com.gamericefishpro.space.i9.i3) h3Var2.e).Z(listU5);
                                        z6 = false;
                                    }
                                    com.gamericefishpro.space.i9.t2 t2VarQ5 = com.gamericefishpro.space.i9.w2.q();
                                    z1VarM = e0().M(str3);
                                    arrayList7 = new ArrayList();
                                    if (z1VarM != null) {
                                        it6 = z1VarM.p().iterator();
                                        while (it6.hasNext()) {
                                            com.gamericefishpro.space.i9.w1 w1Var5 = (com.gamericefishpro.space.i9.w1) it6.next();
                                            Iterator it19 = it5;
                                            com.gamericefishpro.space.i9.u2 u2VarP5 = com.gamericefishpro.space.i9.v2.p();
                                            boolean z15 = z6;
                                            iP = w1Var5.p() - 1;
                                            List list16 = list7;
                                            if (iP != 1) {
                                                it7 = it6;
                                                i8 = 3;
                                                i9 = 2;
                                            } else if (iP != 2) {
                                                it7 = it6;
                                                i8 = 3;
                                                if (iP != 3) {
                                                    i9 = 4;
                                                } else if (iP != 4) {
                                                    i9 = 1;
                                                } else {
                                                    i9 = 5;
                                                }
                                            } else {
                                                it7 = it6;
                                                i8 = 3;
                                                i9 = 3;
                                            }
                                            u2VarP5.h(i9);
                                            iR = w1Var5.r() - 1;
                                            if (iR != 1) {
                                                i8 = 2;
                                            } else if (iR != 2) {
                                                i8 = 1;
                                            }
                                            u2VarP5.i(i8);
                                            arrayList7.add((com.gamericefishpro.space.i9.v2) u2VarP5.e());
                                            it5 = it19;
                                            list7 = list16;
                                            z6 = z15;
                                            it6 = it7;
                                        }
                                    }
                                    Iterator it110 = it5;
                                    boolean z16 = z6;
                                    List list17 = list7;
                                    t2VarQ5.h(arrayList7);
                                    h3Var2.E(t2VarQ5);
                                    arrayList5.add(Pair.create((com.gamericefishpro.space.i9.i3) h3Var2.e(), (Long) pair5.second));
                                    it5 = it110;
                                    list7 = list17;
                                    z6 = z16;
                                }
                                list6 = arrayList5;
                            }
                            zIsEmpty2 = list6.isEmpty();
                            list3 = list6;
                            if (zIsEmpty2) {
                                return;
                            }
                        } else {
                            i = 34;
                            list3 = list2;
                        }
                        e2VarB = b(str);
                        d2Var2 = d2.AD_STORAGE;
                        if (e2VarB.i(d2Var2)) {
                            i2 = 0;
                            listSubList = list3;
                            break;
                        }
                        it4 = list3.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                strV2 = null;
                                break;
                            }
                            i3Var2 = (com.gamericefishpro.space.i9.i3) ((Pair) it4.next()).first;
                            if (!i3Var2.v().isEmpty()) {
                                strV2 = i3Var2.v();
                                break;
                            }
                        }
                        if (strV2 != null) {
                            i2 = 0;
                            listSubList = list3;
                            break;
                        }
                        i7 = 0;
                        while (true) {
                            if (i7 < list3.size()) {
                                i2 = 0;
                                listSubList = list3;
                                break;
                            }
                            i3Var = (com.gamericefishpro.space.i9.i3) ((Pair) list3.get(i7)).first;
                            if (!i3Var.v().isEmpty()) {
                                i2 = 0;
                                listSubList = list3.subList(0, i7);
                                break;
                            }
                            i7++;
                        }
                        f3VarW = com.gamericefishpro.space.i9.g3.w();
                        size = listSubList.size();
                        arrayList = new ArrayList(listSubList.size());
                        if (d0().s(str3)) {
                            i3 = i2;
                        } else {
                            i3 = i2;
                        }
                        zI = b(str).i(d2Var2);
                        zI2 = b(str).i(d2Var);
                        zB2 = d0().B(str3, e0.M0);
                        i4Var = this.C;
                        h4VarS = i4Var.s(str3);
                        list4 = listSubList;
                        while (true) {
                            r1Var = this.E;
                            if (i2 < size) {
                                break;
                                break;
                            }
                            h3Var = (com.gamericefishpro.space.i9.h3) ((com.gamericefishpro.space.i9.i3) ((Pair) list4.get(i2)).first).i();
                            int i16 = size;
                            arrayList.add((Long) ((Pair) list4.get(i2)).second);
                            d0().w();
                            h3Var.s();
                            h3Var.b();
                            ((com.gamericefishpro.space.i9.i3) h3Var.e).f0(j);
                            r1Var.getClass();
                            h3Var.I();
                            if (i3 == 0) {
                                h3Var.b();
                                ((com.gamericefishpro.space.i9.i3) h3Var.e).S0();
                            }
                            if (!zI) {
                                h3Var.b();
                                ((com.gamericefishpro.space.i9.i3) h3Var.e).z1();
                                h3Var.b();
                                ((com.gamericefishpro.space.i9.i3) h3Var.e).B1();
                            }
                            if (!zI2) {
                                h3Var.b();
                                ((com.gamericefishpro.space.i9.i3) h3Var.e).D1();
                            }
                            v(h3Var, str3);
                            if (!zB2) {
                                h3Var.b();
                                ((com.gamericefishpro.space.i9.i3) h3Var.e).Z0();
                            }
                            if (!zI2) {
                                h3Var.b();
                                ((com.gamericefishpro.space.i9.i3) h3Var.e).L1();
                            }
                            strV = ((com.gamericefishpro.space.i9.i3) h3Var.e).v();
                            if (TextUtils.isEmpty(strV)) {
                                i5 = i3;
                                if (strV.equals("00000000-0000-0000-0000-000000000000")) {
                                    i6 = i2;
                                    z4 = zI2;
                                    list5 = list4;
                                    z5 = zB2;
                                }
                                if (h3Var.V() != 0) {
                                    if (d0().B(str3, e0.C0)) {
                                        h3Var.P(i0().c0(((com.gamericefishpro.space.i9.i3) h3Var.e()).a()));
                                    }
                                    p3VarB = h4VarS.b();
                                    if (p3VarB != null) {
                                        h3Var.B(p3VarB);
                                    }
                                    f3VarW.b();
                                    ((com.gamericefishpro.space.i9.g3) f3VarW.e).z((com.gamericefishpro.space.i9.i3) h3Var.e());
                                }
                                i2 = i6 + 1;
                                i3 = i5;
                                size = i16;
                                list4 = list5;
                                zI2 = z4;
                                zB2 = z5;
                            } else {
                                i5 = i3;
                            }
                            arrayList4 = new ArrayList(h3Var.U());
                            it3 = arrayList4.iterator();
                            i6 = i2;
                            lValueOf = null;
                            lValueOf2 = null;
                            z2 = false;
                            z3 = false;
                            while (it3.hasNext()) {
                                zI2 = zI2;
                                a3Var4 = (com.gamericefishpro.space.i9.a3) it3.next();
                                list4 = list4;
                                zB2 = zB2;
                                if ("_fx".equals(a3Var4.s())) {
                                    it3.remove();
                                    z2 = true;
                                } else if ("_f".equals(a3Var4.s())) {
                                    i0();
                                    d3VarZ = z0.z(a3Var4, "_pfo");
                                    if (d3VarZ != null) {
                                        lValueOf = Long.valueOf(d3VarZ.u());
                                    }
                                    i0();
                                    d3VarZ2 = z0.z(a3Var4, "_uwa");
                                    if (d3VarZ2 != null) {
                                        lValueOf2 = Long.valueOf(d3VarZ2.u());
                                    }
                                } else {
                                    list4 = list4;
                                    zI2 = zI2;
                                    zB2 = zB2;
                                }
                                z3 = true;
                            }
                            z4 = zI2;
                            list5 = list4;
                            z5 = zB2;
                            if (z2) {
                                h3Var.b();
                                ((com.gamericefishpro.space.i9.i3) h3Var.e).a0();
                                h3Var.b();
                                ((com.gamericefishpro.space.i9.i3) h3Var.e).Z(arrayList4);
                            }
                            if (z3) {
                                u(h3Var.o(), true, lValueOf, lValueOf2);
                            }
                            if (h3Var.V() != 0) {
                                if (d0().B(str3, e0.C0)) {
                                    h3Var.P(i0().c0(((com.gamericefishpro.space.i9.i3) h3Var.e()).a()));
                                }
                                p3VarB = h4VarS.b();
                                if (p3VarB != null) {
                                    h3Var.B(p3VarB);
                                }
                                f3VarW.b();
                                ((com.gamericefishpro.space.i9.g3) f3VarW.e).z((com.gamericefishpro.space.i9.i3) h3Var.e());
                            }
                            i2 = i6 + 1;
                            i3 = i5;
                            size = i16;
                            list4 = list5;
                            zI2 = z4;
                            zB2 = z5;
                        }
                        if (((com.gamericefishpro.space.i9.g3) f3VarW.e).q() == 0) {
                            p(arrayList);
                            y(false, 204, null, null, str3, Collections.EMPTY_LIST);
                            return;
                        }
                        g3Var = (com.gamericefishpro.space.i9.g3) f3VarW.e();
                        arrayList2 = new ArrayList();
                        a3Var = h4VarS.c;
                        if (a3Var == a3.SGTM_CLIENT) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (a3Var == a3.SGTM) {
                            it = ((com.gamericefishpro.space.i9.g3) f3VarW.e()).p().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((com.gamericefishpro.space.i9.i3) it.next()).N()) {
                                        string = UUID.randomUUID().toString();
                                        break;
                                    }
                                } else {
                                    string = null;
                                    break;
                                }
                            }
                            com.gamericefishpro.space.i9.g3 g3Var15 = (com.gamericefishpro.space.i9.g3) f3VarW.e();
                            c().r();
                            k0();
                            f3VarX = com.gamericefishpro.space.i9.g3.x(g3Var15);
                            if (!TextUtils.isEmpty(string)) {
                                f3VarX.b();
                                ((com.gamericefishpro.space.i9.g3) f3VarX.e).C(string);
                            }
                            strE = e0().E(str3);
                            if (!TextUtils.isEmpty(strE)) {
                                f3VarX.i(strE);
                            }
                            arrayList3 = new ArrayList();
                            it2 = g3Var15.p().iterator();
                            while (it2.hasNext()) {
                                com.gamericefishpro.space.i9.h3 h3VarV5 = com.gamericefishpro.space.i9.i3.V((com.gamericefishpro.space.i9.i3) it2.next());
                                h3VarV5.b();
                                ((com.gamericefishpro.space.i9.i3) h3VarV5.e).S0();
                                arrayList3.add((com.gamericefishpro.space.i9.i3) h3VarV5.e());
                            }
                            f3VarX.b();
                            ((com.gamericefishpro.space.i9.g3) f3VarX.e).B();
                            f3VarX.b();
                            ((com.gamericefishpro.space.i9.g3) f3VarX.e).A(arrayList3);
                            t0 t0VarY9 = a().y();
                            if (TextUtils.isEmpty(string)) {
                                strH = "null";
                            } else {
                                strH = f3VarX.h();
                            }
                            t0VarY9.b(strH, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
                            g3Var2 = (com.gamericefishpro.space.i9.g3) f3VarX.e();
                            if (TextUtils.isEmpty(string)) {
                                com.gamericefishpro.space.i9.g3 g3Var16 = (com.gamericefishpro.space.i9.g3) f3VarW.e();
                                c().r();
                                k0();
                                f3VarW2 = com.gamericefishpro.space.i9.g3.w();
                                a().y().b(string, "[sgtm] Processing Google Signal, sgtmJoinId:");
                                f3VarW2.b();
                                ((com.gamericefishpro.space.i9.g3) f3VarW2.e).C(string);
                                while (r0.hasNext()) {
                                    com.gamericefishpro.space.i9.h3 h3VarU5 = com.gamericefishpro.space.i9.i3.U();
                                    String strO5 = i3Var3.O();
                                    h3VarU5.b();
                                    ((com.gamericefishpro.space.i9.i3) h3VarU5.e).R0(strO5);
                                    int iK4 = i3Var3.K0();
                                    h3VarU5.b();
                                    ((com.gamericefishpro.space.i9.i3) h3VarU5.e).j1(iK4);
                                    f3VarW2.b();
                                    ((com.gamericefishpro.space.i9.g3) f3VarW2.e).z((com.gamericefishpro.space.i9.i3) h3VarU5.e());
                                }
                                com.gamericefishpro.space.i9.g3 g3Var17 = (com.gamericefishpro.space.i9.g3) f3VarW2.e();
                                strE2 = i4Var.e.e0().E(str3);
                                zIsEmpty = TextUtils.isEmpty(strE2);
                                a3Var2 = a3.GOOGLE_SIGNAL;
                                a3Var3 = a3.GOOGLE_SIGNAL_PENDING;
                                if (zIsEmpty) {
                                    Uri uri5 = Uri.parse((String) e0.s.a(null));
                                    Uri.Builder builderBuildUpon5 = uri5.buildUpon();
                                    String authority5 = uri5.getAuthority();
                                    StringBuilder sb9 = new StringBuilder(String.valueOf(strE2).length() + 1 + String.valueOf(authority5).length());
                                    sb9.append(strE2);
                                    sb9.append(".");
                                    sb9.append(authority5);
                                    builderBuildUpon5.authority(sb9.toString());
                                    String string6 = builderBuildUpon5.build().toString();
                                    if (z) {
                                        a3Var2 = a3Var3;
                                    }
                                    str2 = null;
                                    h4Var = new h4(string6, Collections.EMPTY_MAP, a3Var2, null);
                                } else {
                                    str2 = null;
                                    String str8 = (String) e0.s.a(null);
                                    if (z) {
                                        a3Var2 = a3Var3;
                                    }
                                    h4Var = new h4(str8, Collections.EMPTY_MAP, a3Var2, null);
                                }
                                arrayList2.add(Pair.create(g3Var17, h4Var));
                            } else {
                                str2 = null;
                            }
                            if (z) {
                                f3Var = (com.gamericefishpro.space.i9.f3) g3Var2.i();
                                while (i4 < g3Var2.q()) {
                                    com.gamericefishpro.space.i9.h3 h3Var8 = (com.gamericefishpro.space.i9.h3) g3Var2.r(i4).i();
                                    h3Var8.a0();
                                    h3Var8.C(j);
                                    f3Var.b();
                                    ((com.gamericefishpro.space.i9.g3) f3Var.e).y(i4, (com.gamericefishpro.space.i9.i3) h3Var8.e());
                                }
                                arrayList2.add(Pair.create((com.gamericefishpro.space.i9.g3) f3Var.e(), h4VarS));
                                p(arrayList);
                                y(false, 204, null, null, str, arrayList2);
                                if (s(str, h4VarS.a())) {
                                    a().y().b(str, "[sgtm] Sending sgtm batches available notification to app");
                                    intent = new Intent();
                                    intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                    intent.setPackage(str);
                                    contextD = r1Var.d();
                                    if (Build.VERSION.SDK_INT < i) {
                                        contextD.sendBroadcast(intent);
                                        return;
                                    } else {
                                        contextD.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                        return;
                                    }
                                }
                                return;
                            }
                            str3 = str;
                            g3Var = g3Var2;
                        } else if (z) {
                            z = true;
                            it = ((com.gamericefishpro.space.i9.g3) f3VarW.e()).p().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((com.gamericefishpro.space.i9.i3) it.next()).N()) {
                                        string = UUID.randomUUID().toString();
                                        break;
                                    }
                                } else {
                                    string = null;
                                    break;
                                }
                            }
                            com.gamericefishpro.space.i9.g3 g3Var18 = (com.gamericefishpro.space.i9.g3) f3VarW.e();
                            c().r();
                            k0();
                            f3VarX = com.gamericefishpro.space.i9.g3.x(g3Var18);
                            if (!TextUtils.isEmpty(string)) {
                                f3VarX.b();
                                ((com.gamericefishpro.space.i9.g3) f3VarX.e).C(string);
                            }
                            strE = e0().E(str3);
                            if (!TextUtils.isEmpty(strE)) {
                                f3VarX.i(strE);
                            }
                            arrayList3 = new ArrayList();
                            it2 = g3Var18.p().iterator();
                            while (it2.hasNext()) {
                                com.gamericefishpro.space.i9.h3 h3VarV6 = com.gamericefishpro.space.i9.i3.V((com.gamericefishpro.space.i9.i3) it2.next());
                                h3VarV6.b();
                                ((com.gamericefishpro.space.i9.i3) h3VarV6.e).S0();
                                arrayList3.add((com.gamericefishpro.space.i9.i3) h3VarV6.e());
                            }
                            f3VarX.b();
                            ((com.gamericefishpro.space.i9.g3) f3VarX.e).B();
                            f3VarX.b();
                            ((com.gamericefishpro.space.i9.g3) f3VarX.e).A(arrayList3);
                            t0 t0VarY10 = a().y();
                            if (TextUtils.isEmpty(string)) {
                                strH = "null";
                            } else {
                                strH = f3VarX.h();
                            }
                            t0VarY10.b(strH, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
                            g3Var2 = (com.gamericefishpro.space.i9.g3) f3VarX.e();
                            if (TextUtils.isEmpty(string)) {
                                com.gamericefishpro.space.i9.g3 g3Var19 = (com.gamericefishpro.space.i9.g3) f3VarW.e();
                                c().r();
                                k0();
                                f3VarW2 = com.gamericefishpro.space.i9.g3.w();
                                a().y().b(string, "[sgtm] Processing Google Signal, sgtmJoinId:");
                                f3VarW2.b();
                                ((com.gamericefishpro.space.i9.g3) f3VarW2.e).C(string);
                                while (r0.hasNext()) {
                                    com.gamericefishpro.space.i9.h3 h3VarU6 = com.gamericefishpro.space.i9.i3.U();
                                    String strO6 = i3Var3.O();
                                    h3VarU6.b();
                                    ((com.gamericefishpro.space.i9.i3) h3VarU6.e).R0(strO6);
                                    int iK5 = i3Var3.K0();
                                    h3VarU6.b();
                                    ((com.gamericefishpro.space.i9.i3) h3VarU6.e).j1(iK5);
                                    f3VarW2.b();
                                    ((com.gamericefishpro.space.i9.g3) f3VarW2.e).z((com.gamericefishpro.space.i9.i3) h3VarU6.e());
                                }
                                com.gamericefishpro.space.i9.g3 g3Var110 = (com.gamericefishpro.space.i9.g3) f3VarW2.e();
                                strE2 = i4Var.e.e0().E(str3);
                                zIsEmpty = TextUtils.isEmpty(strE2);
                                a3Var2 = a3.GOOGLE_SIGNAL;
                                a3Var3 = a3.GOOGLE_SIGNAL_PENDING;
                                if (zIsEmpty) {
                                    Uri uri6 = Uri.parse((String) e0.s.a(null));
                                    Uri.Builder builderBuildUpon6 = uri6.buildUpon();
                                    String authority6 = uri6.getAuthority();
                                    StringBuilder sb10 = new StringBuilder(String.valueOf(strE2).length() + 1 + String.valueOf(authority6).length());
                                    sb10.append(strE2);
                                    sb10.append(".");
                                    sb10.append(authority6);
                                    builderBuildUpon6.authority(sb10.toString());
                                    String string7 = builderBuildUpon6.build().toString();
                                    if (z) {
                                        a3Var2 = a3Var3;
                                    }
                                    str2 = null;
                                    h4Var = new h4(string7, Collections.EMPTY_MAP, a3Var2, null);
                                } else {
                                    str2 = null;
                                    String str9 = (String) e0.s.a(null);
                                    if (z) {
                                        a3Var2 = a3Var3;
                                    }
                                    h4Var = new h4(str9, Collections.EMPTY_MAP, a3Var2, null);
                                }
                                arrayList2.add(Pair.create(g3Var110, h4Var));
                            } else {
                                str2 = null;
                            }
                            if (z) {
                                f3Var = (com.gamericefishpro.space.i9.f3) g3Var2.i();
                                while (i4 < g3Var2.q()) {
                                    com.gamericefishpro.space.i9.h3 h3Var9 = (com.gamericefishpro.space.i9.h3) g3Var2.r(i4).i();
                                    h3Var9.a0();
                                    h3Var9.C(j);
                                    f3Var.b();
                                    ((com.gamericefishpro.space.i9.g3) f3Var.e).y(i4, (com.gamericefishpro.space.i9.i3) h3Var9.e());
                                }
                                arrayList2.add(Pair.create((com.gamericefishpro.space.i9.g3) f3Var.e(), h4VarS));
                                p(arrayList);
                                y(false, 204, null, null, str, arrayList2);
                                if (s(str, h4VarS.a())) {
                                    a().y().b(str, "[sgtm] Sending sgtm batches available notification to app");
                                    intent = new Intent();
                                    intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                    intent.setPackage(str);
                                    contextD = r1Var.d();
                                    if (Build.VERSION.SDK_INT < i) {
                                        contextD.sendBroadcast(intent);
                                        return;
                                    } else {
                                        contextD.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                        return;
                                    }
                                }
                                return;
                            }
                            str3 = str;
                            g3Var = g3Var2;
                        } else {
                            str2 = null;
                        }
                        z0Var = this.e;
                        T(z0Var);
                        if (z0Var.L()) {
                            if (Log.isLoggable(a().B(), 2)) {
                                strU = i0().U(g3Var);
                            } else {
                                strU = str2;
                            }
                            i0();
                            byte[] bArrA3 = g3Var.a();
                            p(arrayList);
                            this.B.B.b(j);
                            a().y().d("Uploading data. app, uncompressed size, data", str3, Integer.valueOf(bArrA3.length), strU);
                            this.N = true;
                            T(z0Var);
                            z0Var.Q(str3, h4VarS, g3Var, new com.gamericefishpro.space.a8.c((m4) this, str3, (Object) arrayList2, 23));
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    r14 = 0;
                    if (r14 != 0) {
                        r14.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e16) {
                e = e16;
                j2 = -1;
            }
            if (list2.isEmpty()) {
                return;
            }
            q7Var = q7.e;
            g gVarD2 = d0();
            d0Var = e0.h1;
            zB = gVarD2.B(null, d0Var);
            d2Var = d2.ANALYTICS_STORAGE;
            if (zB) {
                if (!d0().B(null, d0Var)) {
                    i = 34;
                    list6 = list2;
                } else if (b(str).i(d2Var) || !e0().w(str3)) {
                    i = 34;
                    arrayList5 = new ArrayList(list2.size());
                    m mVarF5 = f0();
                    r1Var2 = (r1) mVarF5.d;
                    com.gamericefishpro.space.v8.c0.d(str3);
                    mVarF5.r();
                    mVarF5.s();
                    arrayList6 = new ArrayList();
                    sQLiteDatabaseG0 = mVarF5.g0();
                    r1Var2.e().getClass();
                    jCurrentTimeMillis = System.currentTimeMillis();
                    cursorQuery2 = sQLiteDatabaseG0.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
                    if (cursorQuery2.moveToFirst()) {
                        r1Var3 = r1Var2;
                        while (true) {
                            arrayList6.add((com.gamericefishpro.space.i9.a3) ((com.gamericefishpro.space.i9.z2) z0.e0(com.gamericefishpro.space.i9.a3.z(), cursorQuery2.getBlob(0))).e());
                            if (!cursorQuery2.moveToNext()) {
                                break;
                                break;
                            } else {
                                cursorQuery2 = cursorQuery2;
                                arrayList6 = arrayList6;
                            }
                        }
                        cursorQuery2.close();
                        int iDelete5 = sQLiteDatabaseG0.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)});
                        t0 t0VarY11 = r1Var3.a().y();
                        StringBuilder sb11 = new StringBuilder(String.valueOf(iDelete5).length() + 34);
                        sb11.append("Pruned ");
                        sb11.append(iDelete5);
                        sb11.append(" NO_DATA mode events. appId");
                        t0VarY11.b(str3, sb11.toString());
                    } else {
                        arrayList6 = arrayList6;
                        cursorQuery2.close();
                    }
                    list7 = arrayList6;
                    it5 = list2.iterator();
                    z6 = true;
                    while (it5.hasNext()) {
                        Pair pair6 = (Pair) it5.next();
                        h3Var2 = (com.gamericefishpro.space.i9.h3) ((com.gamericefishpro.space.i9.i3) pair6.first).i();
                        if (z6 && !list7.isEmpty()) {
                            List listU6 = h3Var2.U();
                            h3Var2.b();
                            ((com.gamericefishpro.space.i9.i3) h3Var2.e).a0();
                            h3Var2.b();
                            ((com.gamericefishpro.space.i9.i3) h3Var2.e).Z(list7);
                            h3Var2.b();
                            ((com.gamericefishpro.space.i9.i3) h3Var2.e).Z(listU6);
                            z6 = false;
                        }
                        com.gamericefishpro.space.i9.t2 t2VarQ6 = com.gamericefishpro.space.i9.w2.q();
                        z1VarM = e0().M(str3);
                        arrayList7 = new ArrayList();
                        if (z1VarM != null) {
                            it6 = z1VarM.p().iterator();
                            while (it6.hasNext()) {
                                com.gamericefishpro.space.i9.w1 w1Var6 = (com.gamericefishpro.space.i9.w1) it6.next();
                                Iterator it111 = it5;
                                com.gamericefishpro.space.i9.u2 u2VarP6 = com.gamericefishpro.space.i9.v2.p();
                                boolean z17 = z6;
                                iP = w1Var6.p() - 1;
                                List list18 = list7;
                                if (iP != 1) {
                                    it7 = it6;
                                    i8 = 3;
                                    i9 = 2;
                                } else if (iP != 2) {
                                    it7 = it6;
                                    i8 = 3;
                                    if (iP != 3) {
                                        i9 = 4;
                                    } else if (iP != 4) {
                                        i9 = 1;
                                    } else {
                                        i9 = 5;
                                    }
                                } else {
                                    it7 = it6;
                                    i8 = 3;
                                    i9 = 3;
                                }
                                u2VarP6.h(i9);
                                iR = w1Var6.r() - 1;
                                if (iR != 1) {
                                    i8 = 2;
                                } else if (iR != 2) {
                                    i8 = 1;
                                }
                                u2VarP6.i(i8);
                                arrayList7.add((com.gamericefishpro.space.i9.v2) u2VarP6.e());
                                it5 = it111;
                                list7 = list18;
                                z6 = z17;
                                it6 = it7;
                            }
                        }
                        Iterator it112 = it5;
                        boolean z18 = z6;
                        List list19 = list7;
                        t2VarQ6.h(arrayList7);
                        h3Var2.E(t2VarQ6);
                        arrayList5.add(Pair.create((com.gamericefishpro.space.i9.i3) h3Var2.e(), (Long) pair6.second));
                        it5 = it112;
                        list7 = list19;
                        z6 = z18;
                    }
                    list6 = arrayList5;
                } else {
                    List listAsList = Arrays.asList(((String) e0.i1.a(null)).split(","));
                    for (Pair pair7 : list2) {
                        try {
                            f0().A(((Long) pair7.second).longValue());
                            for (com.gamericefishpro.space.i9.a3 a3Var5 : ((com.gamericefishpro.space.i9.i3) pair7.first).P1()) {
                                if (listAsList.contains(a3Var5.s())) {
                                    if (a3Var5.s().equals("_f") || a3Var5.s().equals("_v")) {
                                        com.gamericefishpro.space.i9.z2 z2Var = (com.gamericefishpro.space.i9.z2) a3Var5.i();
                                        i0();
                                        z0.x(z2Var, "_dac", 1L);
                                        a3Var5 = (com.gamericefishpro.space.i9.a3) z2Var.e();
                                    }
                                    m mVarF6 = f0();
                                    mVarF6.r();
                                    mVarF6.s();
                                    com.gamericefishpro.space.v8.c0.d(str3);
                                    r1 r1Var5 = (r1) mVarF6.d;
                                    try {
                                        r1Var5.a().y().b(a3Var5, "Caching events in NO_DATA mode");
                                        ContentValues contentValues = new ContentValues();
                                        contentValues.put("app_id", str3);
                                        com.gamericefishpro.space.i9.a3 a3Var6 = a3Var5;
                                        contentValues.put("name", a3Var6.s());
                                        contentValues.put("data", a3Var6.a());
                                        contentValues.put("timestamp_millis", Long.valueOf(a3Var6.u()));
                                        try {
                                            if (mVarF6.g0().insert("no_data_mode_events", null, contentValues) == j2) {
                                                r1Var5.a().v().b(v0.z(str3), "Failed to insert NO_DATA mode event (got -1). appId");
                                            }
                                        } catch (SQLiteException e17) {
                                            ((r1) mVarF6.d).a().v().c("Error storing NO_DATA mode event. appId", v0.z(str3), e17);
                                        }
                                    } catch (SQLiteException unused) {
                                        a().D.b(str3, "Failed handling NO_DATA mode bundles. appId");
                                    }
                                }
                            }
                        } catch (SQLiteException unused2) {
                        }
                    }
                    i = 34;
                    list6 = Collections.EMPTY_LIST;
                }
                zIsEmpty2 = list6.isEmpty();
                list3 = list6;
                if (zIsEmpty2) {
                    return;
                }
            } else {
                i = 34;
                list3 = list2;
            }
            e2VarB = b(str);
            d2Var2 = d2.AD_STORAGE;
            if (e2VarB.i(d2Var2)) {
                i2 = 0;
                listSubList = list3;
                break;
            }
            it4 = list3.iterator();
            while (true) {
                if (it4.hasNext()) {
                    strV2 = null;
                    break;
                }
                i3Var2 = (com.gamericefishpro.space.i9.i3) ((Pair) it4.next()).first;
                if (!i3Var2.v().isEmpty()) {
                    strV2 = i3Var2.v();
                    break;
                }
            }
            if (strV2 != null) {
                i2 = 0;
                listSubList = list3;
                break;
            }
            i7 = 0;
            while (true) {
                if (i7 < list3.size()) {
                    i2 = 0;
                    listSubList = list3;
                    break;
                }
                i3Var = (com.gamericefishpro.space.i9.i3) ((Pair) list3.get(i7)).first;
                if (!i3Var.v().isEmpty() && !i3Var.v().equals(strV2)) {
                    i2 = 0;
                    listSubList = list3.subList(0, i7);
                    break;
                }
                i7++;
            }
            f3VarW = com.gamericefishpro.space.i9.g3.w();
            size = listSubList.size();
            arrayList = new ArrayList(listSubList.size());
            if (d0().s(str3) || !b(str).i(d2Var2)) {
                i3 = i2;
            } else {
                i3 = 1;
            }
            zI = b(str).i(d2Var2);
            zI2 = b(str).i(d2Var);
            zB2 = d0().B(str3, e0.M0);
            i4Var = this.C;
            h4VarS = i4Var.s(str3);
            list4 = listSubList;
            while (true) {
                r1Var = this.E;
                if (i2 < size) {
                    break;
                    break;
                }
                h3Var = (com.gamericefishpro.space.i9.h3) ((com.gamericefishpro.space.i9.i3) ((Pair) list4.get(i2)).first).i();
                int i17 = size;
                arrayList.add((Long) ((Pair) list4.get(i2)).second);
                d0().w();
                h3Var.s();
                h3Var.b();
                ((com.gamericefishpro.space.i9.i3) h3Var.e).f0(j);
                r1Var.getClass();
                h3Var.I();
                if (i3 == 0) {
                    h3Var.b();
                    ((com.gamericefishpro.space.i9.i3) h3Var.e).S0();
                }
                if (!zI) {
                    h3Var.b();
                    ((com.gamericefishpro.space.i9.i3) h3Var.e).z1();
                    h3Var.b();
                    ((com.gamericefishpro.space.i9.i3) h3Var.e).B1();
                }
                if (!zI2) {
                    h3Var.b();
                    ((com.gamericefishpro.space.i9.i3) h3Var.e).D1();
                }
                v(h3Var, str3);
                if (!zB2) {
                    h3Var.b();
                    ((com.gamericefishpro.space.i9.i3) h3Var.e).Z0();
                }
                if (!zI2) {
                    h3Var.b();
                    ((com.gamericefishpro.space.i9.i3) h3Var.e).L1();
                }
                strV = ((com.gamericefishpro.space.i9.i3) h3Var.e).v();
                if (TextUtils.isEmpty(strV)) {
                    i5 = i3;
                    if (strV.equals("00000000-0000-0000-0000-000000000000")) {
                        i6 = i2;
                        z4 = zI2;
                        list5 = list4;
                        z5 = zB2;
                    }
                    if (h3Var.V() != 0) {
                        if (d0().B(str3, e0.C0)) {
                            h3Var.P(i0().c0(((com.gamericefishpro.space.i9.i3) h3Var.e()).a()));
                        }
                        p3VarB = h4VarS.b();
                        if (p3VarB != null) {
                            h3Var.B(p3VarB);
                        }
                        f3VarW.b();
                        ((com.gamericefishpro.space.i9.g3) f3VarW.e).z((com.gamericefishpro.space.i9.i3) h3Var.e());
                    }
                    i2 = i6 + 1;
                    i3 = i5;
                    size = i17;
                    list4 = list5;
                    zI2 = z4;
                    zB2 = z5;
                } else {
                    i5 = i3;
                }
                arrayList4 = new ArrayList(h3Var.U());
                it3 = arrayList4.iterator();
                i6 = i2;
                lValueOf = null;
                lValueOf2 = null;
                z2 = false;
                z3 = false;
                while (it3.hasNext()) {
                    zI2 = zI2;
                    a3Var4 = (com.gamericefishpro.space.i9.a3) it3.next();
                    list4 = list4;
                    zB2 = zB2;
                    if ("_fx".equals(a3Var4.s())) {
                        it3.remove();
                        z2 = true;
                    } else if ("_f".equals(a3Var4.s())) {
                        i0();
                        d3VarZ = z0.z(a3Var4, "_pfo");
                        if (d3VarZ != null) {
                            lValueOf = Long.valueOf(d3VarZ.u());
                        }
                        i0();
                        d3VarZ2 = z0.z(a3Var4, "_uwa");
                        if (d3VarZ2 != null) {
                            lValueOf2 = Long.valueOf(d3VarZ2.u());
                        }
                    } else {
                        list4 = list4;
                        zI2 = zI2;
                        zB2 = zB2;
                    }
                    z3 = true;
                }
                z4 = zI2;
                list5 = list4;
                z5 = zB2;
                if (z2) {
                    h3Var.b();
                    ((com.gamericefishpro.space.i9.i3) h3Var.e).a0();
                    h3Var.b();
                    ((com.gamericefishpro.space.i9.i3) h3Var.e).Z(arrayList4);
                }
                if (z3) {
                    u(h3Var.o(), true, lValueOf, lValueOf2);
                }
                if (h3Var.V() != 0) {
                    if (d0().B(str3, e0.C0)) {
                        h3Var.P(i0().c0(((com.gamericefishpro.space.i9.i3) h3Var.e()).a()));
                    }
                    p3VarB = h4VarS.b();
                    if (p3VarB != null) {
                        h3Var.B(p3VarB);
                    }
                    f3VarW.b();
                    ((com.gamericefishpro.space.i9.g3) f3VarW.e).z((com.gamericefishpro.space.i9.i3) h3Var.e());
                }
                i2 = i6 + 1;
                i3 = i5;
                size = i17;
                list4 = list5;
                zI2 = z4;
                zB2 = z5;
            }
            if (((com.gamericefishpro.space.i9.g3) f3VarW.e).q() == 0) {
                p(arrayList);
                y(false, 204, null, null, str3, Collections.EMPTY_LIST);
                return;
            }
            g3Var = (com.gamericefishpro.space.i9.g3) f3VarW.e();
            arrayList2 = new ArrayList();
            a3Var = h4VarS.c;
            if (a3Var == a3.SGTM_CLIENT) {
                z = true;
            } else {
                z = false;
            }
            if (a3Var == a3.SGTM) {
                it = ((com.gamericefishpro.space.i9.g3) f3VarW.e()).p().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((com.gamericefishpro.space.i9.i3) it.next()).N()) {
                            string = UUID.randomUUID().toString();
                            break;
                        }
                    } else {
                        string = null;
                        break;
                    }
                }
                com.gamericefishpro.space.i9.g3 g3Var111 = (com.gamericefishpro.space.i9.g3) f3VarW.e();
                c().r();
                k0();
                f3VarX = com.gamericefishpro.space.i9.g3.x(g3Var111);
                if (!TextUtils.isEmpty(string)) {
                    f3VarX.b();
                    ((com.gamericefishpro.space.i9.g3) f3VarX.e).C(string);
                }
                strE = e0().E(str3);
                if (!TextUtils.isEmpty(strE)) {
                    f3VarX.i(strE);
                }
                arrayList3 = new ArrayList();
                it2 = g3Var111.p().iterator();
                while (it2.hasNext()) {
                    com.gamericefishpro.space.i9.h3 h3VarV7 = com.gamericefishpro.space.i9.i3.V((com.gamericefishpro.space.i9.i3) it2.next());
                    h3VarV7.b();
                    ((com.gamericefishpro.space.i9.i3) h3VarV7.e).S0();
                    arrayList3.add((com.gamericefishpro.space.i9.i3) h3VarV7.e());
                }
                f3VarX.b();
                ((com.gamericefishpro.space.i9.g3) f3VarX.e).B();
                f3VarX.b();
                ((com.gamericefishpro.space.i9.g3) f3VarX.e).A(arrayList3);
                t0 t0VarY12 = a().y();
                if (TextUtils.isEmpty(string)) {
                    strH = "null";
                } else {
                    strH = f3VarX.h();
                }
                t0VarY12.b(strH, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
                g3Var2 = (com.gamericefishpro.space.i9.g3) f3VarX.e();
                if (TextUtils.isEmpty(string)) {
                    com.gamericefishpro.space.i9.g3 g3Var112 = (com.gamericefishpro.space.i9.g3) f3VarW.e();
                    c().r();
                    k0();
                    f3VarW2 = com.gamericefishpro.space.i9.g3.w();
                    a().y().b(string, "[sgtm] Processing Google Signal, sgtmJoinId:");
                    f3VarW2.b();
                    ((com.gamericefishpro.space.i9.g3) f3VarW2.e).C(string);
                    while (r0.hasNext()) {
                        com.gamericefishpro.space.i9.h3 h3VarU7 = com.gamericefishpro.space.i9.i3.U();
                        String strO7 = i3Var3.O();
                        h3VarU7.b();
                        ((com.gamericefishpro.space.i9.i3) h3VarU7.e).R0(strO7);
                        int iK6 = i3Var3.K0();
                        h3VarU7.b();
                        ((com.gamericefishpro.space.i9.i3) h3VarU7.e).j1(iK6);
                        f3VarW2.b();
                        ((com.gamericefishpro.space.i9.g3) f3VarW2.e).z((com.gamericefishpro.space.i9.i3) h3VarU7.e());
                    }
                    com.gamericefishpro.space.i9.g3 g3Var113 = (com.gamericefishpro.space.i9.g3) f3VarW2.e();
                    strE2 = i4Var.e.e0().E(str3);
                    zIsEmpty = TextUtils.isEmpty(strE2);
                    a3Var2 = a3.GOOGLE_SIGNAL;
                    a3Var3 = a3.GOOGLE_SIGNAL_PENDING;
                    if (zIsEmpty) {
                        Uri uri7 = Uri.parse((String) e0.s.a(null));
                        Uri.Builder builderBuildUpon7 = uri7.buildUpon();
                        String authority7 = uri7.getAuthority();
                        StringBuilder sb12 = new StringBuilder(String.valueOf(strE2).length() + 1 + String.valueOf(authority7).length());
                        sb12.append(strE2);
                        sb12.append(".");
                        sb12.append(authority7);
                        builderBuildUpon7.authority(sb12.toString());
                        String string8 = builderBuildUpon7.build().toString();
                        if (z) {
                            a3Var2 = a3Var3;
                        }
                        str2 = null;
                        h4Var = new h4(string8, Collections.EMPTY_MAP, a3Var2, null);
                    } else {
                        str2 = null;
                        String str10 = (String) e0.s.a(null);
                        if (z) {
                            a3Var2 = a3Var3;
                        }
                        h4Var = new h4(str10, Collections.EMPTY_MAP, a3Var2, null);
                    }
                    arrayList2.add(Pair.create(g3Var113, h4Var));
                } else {
                    str2 = null;
                }
                if (z) {
                    f3Var = (com.gamericefishpro.space.i9.f3) g3Var2.i();
                    while (i4 < g3Var2.q()) {
                        com.gamericefishpro.space.i9.h3 h3Var10 = (com.gamericefishpro.space.i9.h3) g3Var2.r(i4).i();
                        h3Var10.a0();
                        h3Var10.C(j);
                        f3Var.b();
                        ((com.gamericefishpro.space.i9.g3) f3Var.e).y(i4, (com.gamericefishpro.space.i9.i3) h3Var10.e());
                    }
                    arrayList2.add(Pair.create((com.gamericefishpro.space.i9.g3) f3Var.e(), h4VarS));
                    p(arrayList);
                    y(false, 204, null, null, str, arrayList2);
                    if (s(str, h4VarS.a())) {
                        a().y().b(str, "[sgtm] Sending sgtm batches available notification to app");
                        intent = new Intent();
                        intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        intent.setPackage(str);
                        contextD = r1Var.d();
                        if (Build.VERSION.SDK_INT < i) {
                            contextD.sendBroadcast(intent);
                            return;
                        } else {
                            contextD.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                            return;
                        }
                    }
                    return;
                }
                str3 = str;
                g3Var = g3Var2;
            } else if (z) {
                z = true;
                it = ((com.gamericefishpro.space.i9.g3) f3VarW.e()).p().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((com.gamericefishpro.space.i9.i3) it.next()).N()) {
                            string = UUID.randomUUID().toString();
                            break;
                        }
                    } else {
                        string = null;
                        break;
                    }
                }
                com.gamericefishpro.space.i9.g3 g3Var114 = (com.gamericefishpro.space.i9.g3) f3VarW.e();
                c().r();
                k0();
                f3VarX = com.gamericefishpro.space.i9.g3.x(g3Var114);
                if (!TextUtils.isEmpty(string)) {
                    f3VarX.b();
                    ((com.gamericefishpro.space.i9.g3) f3VarX.e).C(string);
                }
                strE = e0().E(str3);
                if (!TextUtils.isEmpty(strE)) {
                    f3VarX.i(strE);
                }
                arrayList3 = new ArrayList();
                it2 = g3Var114.p().iterator();
                while (it2.hasNext()) {
                    com.gamericefishpro.space.i9.h3 h3VarV8 = com.gamericefishpro.space.i9.i3.V((com.gamericefishpro.space.i9.i3) it2.next());
                    h3VarV8.b();
                    ((com.gamericefishpro.space.i9.i3) h3VarV8.e).S0();
                    arrayList3.add((com.gamericefishpro.space.i9.i3) h3VarV8.e());
                }
                f3VarX.b();
                ((com.gamericefishpro.space.i9.g3) f3VarX.e).B();
                f3VarX.b();
                ((com.gamericefishpro.space.i9.g3) f3VarX.e).A(arrayList3);
                t0 t0VarY13 = a().y();
                if (TextUtils.isEmpty(string)) {
                    strH = "null";
                } else {
                    strH = f3VarX.h();
                }
                t0VarY13.b(strH, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
                g3Var2 = (com.gamericefishpro.space.i9.g3) f3VarX.e();
                if (TextUtils.isEmpty(string)) {
                    com.gamericefishpro.space.i9.g3 g3Var115 = (com.gamericefishpro.space.i9.g3) f3VarW.e();
                    c().r();
                    k0();
                    f3VarW2 = com.gamericefishpro.space.i9.g3.w();
                    a().y().b(string, "[sgtm] Processing Google Signal, sgtmJoinId:");
                    f3VarW2.b();
                    ((com.gamericefishpro.space.i9.g3) f3VarW2.e).C(string);
                    while (r0.hasNext()) {
                        com.gamericefishpro.space.i9.h3 h3VarU8 = com.gamericefishpro.space.i9.i3.U();
                        String strO8 = i3Var3.O();
                        h3VarU8.b();
                        ((com.gamericefishpro.space.i9.i3) h3VarU8.e).R0(strO8);
                        int iK7 = i3Var3.K0();
                        h3VarU8.b();
                        ((com.gamericefishpro.space.i9.i3) h3VarU8.e).j1(iK7);
                        f3VarW2.b();
                        ((com.gamericefishpro.space.i9.g3) f3VarW2.e).z((com.gamericefishpro.space.i9.i3) h3VarU8.e());
                    }
                    com.gamericefishpro.space.i9.g3 g3Var116 = (com.gamericefishpro.space.i9.g3) f3VarW2.e();
                    strE2 = i4Var.e.e0().E(str3);
                    zIsEmpty = TextUtils.isEmpty(strE2);
                    a3Var2 = a3.GOOGLE_SIGNAL;
                    a3Var3 = a3.GOOGLE_SIGNAL_PENDING;
                    if (zIsEmpty) {
                        Uri uri8 = Uri.parse((String) e0.s.a(null));
                        Uri.Builder builderBuildUpon8 = uri8.buildUpon();
                        String authority8 = uri8.getAuthority();
                        StringBuilder sb13 = new StringBuilder(String.valueOf(strE2).length() + 1 + String.valueOf(authority8).length());
                        sb13.append(strE2);
                        sb13.append(".");
                        sb13.append(authority8);
                        builderBuildUpon8.authority(sb13.toString());
                        String string9 = builderBuildUpon8.build().toString();
                        if (z) {
                            a3Var2 = a3Var3;
                        }
                        str2 = null;
                        h4Var = new h4(string9, Collections.EMPTY_MAP, a3Var2, null);
                    } else {
                        str2 = null;
                        String str11 = (String) e0.s.a(null);
                        if (z) {
                            a3Var2 = a3Var3;
                        }
                        h4Var = new h4(str11, Collections.EMPTY_MAP, a3Var2, null);
                    }
                    arrayList2.add(Pair.create(g3Var116, h4Var));
                } else {
                    str2 = null;
                }
                if (z) {
                    f3Var = (com.gamericefishpro.space.i9.f3) g3Var2.i();
                    while (i4 < g3Var2.q()) {
                        com.gamericefishpro.space.i9.h3 h3Var11 = (com.gamericefishpro.space.i9.h3) g3Var2.r(i4).i();
                        h3Var11.a0();
                        h3Var11.C(j);
                        f3Var.b();
                        ((com.gamericefishpro.space.i9.g3) f3Var.e).y(i4, (com.gamericefishpro.space.i9.i3) h3Var11.e());
                    }
                    arrayList2.add(Pair.create((com.gamericefishpro.space.i9.g3) f3Var.e(), h4VarS));
                    p(arrayList);
                    y(false, 204, null, null, str, arrayList2);
                    if (s(str, h4VarS.a())) {
                        a().y().b(str, "[sgtm] Sending sgtm batches available notification to app");
                        intent = new Intent();
                        intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        intent.setPackage(str);
                        contextD = r1Var.d();
                        if (Build.VERSION.SDK_INT < i) {
                            contextD.sendBroadcast(intent);
                            return;
                        } else {
                            contextD.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                            return;
                        }
                    }
                    return;
                }
                str3 = str;
                g3Var = g3Var2;
            } else {
                str2 = null;
            }
            z0Var = this.e;
            T(z0Var);
            if (z0Var.L()) {
                if (Log.isLoggable(a().B(), 2)) {
                    strU = i0().U(g3Var);
                } else {
                    strU = str2;
                }
                i0();
                byte[] bArrA4 = g3Var.a();
                p(arrayList);
                this.B.B.b(j);
                a().y().d("Uploading data. app, uncompressed size, data", str3, Integer.valueOf(bArrA4.length), strU);
                this.N = true;
                T(z0Var);
                z0Var.Q(str3, h4VarS, g3Var, new com.gamericefishpro.space.a8.c((m4) this, str3, (Object) arrayList2, 23));
            }
        } catch (Throwable th5) {
            th = th5;
            r14 = r11;
        }
    }

    public final boolean s(String str, String str2) {
        m mVar = this.i;
        T(mVar);
        a1 a1VarT0 = mVar.t0(str);
        HashMap map = this.X;
        if (a1VarT0 != null && j0().R(str, a1VarT0.C())) {
            map.remove(str2);
            return true;
        }
        l4 l4Var = (l4) map.get(str2);
        if (l4Var != null) {
            l4Var.a.e().getClass();
            if (System.currentTimeMillis() < l4Var.c) {
                return false;
            }
        }
        return true;
    }

    public final void t(String str) {
        c().r();
        k0();
        this.O = true;
        try {
            r1 r1Var = this.E;
            r1Var.getClass();
            Boolean bool = r1Var.o().w;
            if (bool == null) {
                a().B.a("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                a().y.a("Upload called in the client side when service should be used");
            } else if (this.H > 0) {
                N();
            } else {
                z0 z0Var = this.e;
                T(z0Var);
                if (z0Var.L()) {
                    m mVar = this.i;
                    T(mVar);
                    if (mVar.x(str)) {
                        m mVar2 = this.i;
                        T(mVar2);
                        com.gamericefishpro.space.v8.c0.d(str);
                        mVar2.r();
                        mVar2.s();
                        List listW = mVar2.w(str, e4.b(a3.GOOGLE_SIGNAL), 1);
                        n4 n4Var = listW.isEmpty() ? null : (n4) listW.get(0);
                        if (n4Var != null) {
                            com.gamericefishpro.space.i9.g3 g3Var = n4Var.b;
                            a().G.d("[sgtm] Uploading data from upload queue. appId, type, url", str, n4Var.e, n4Var.c);
                            byte[] bArrA = g3Var.a();
                            if (Log.isLoggable(a().B(), 2)) {
                                z0 z0Var2 = this.z;
                                T(z0Var2);
                                a().G.d("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(bArrA.length), z0Var2.U(g3Var));
                            }
                            h4 h4Var = new h4(n4Var.c, n4Var.d, n4Var.e, null);
                            this.N = true;
                            z0 z0Var3 = this.e;
                            T(z0Var3);
                            z0Var3.Q(str, h4Var, g3Var, new com.gamericefishpro.space.a8.c(this, str, (Object) n4Var, 24));
                        }
                    } else {
                        a().G.b(str, "[sgtm] Upload queue has no batches for appId");
                    }
                } else {
                    a().G.a("Network not connected, ignoring upload request");
                    N();
                }
            }
        } finally {
            this.O = false;
            O();
        }
    }

    public final void u(String str, boolean z, Long l, Long l2) {
        m mVar = this.i;
        T(mVar);
        a1 a1VarT0 = mVar.t0(str);
        if (a1VarT0 != null) {
            r1 r1Var = a1VarT0.a;
            p1 p1Var = r1Var.z;
            r1.l(p1Var);
            p1Var.r();
            a1VarT0.Q |= a1VarT0.y != z;
            a1VarT0.y = z;
            p1 p1Var2 = r1Var.z;
            r1.l(p1Var2);
            p1Var2.r();
            a1VarT0.Q |= !Objects.equals(a1VarT0.z, l);
            a1VarT0.z = l;
            p1 p1Var3 = r1Var.z;
            r1.l(p1Var3);
            p1Var3.r();
            a1VarT0.Q |= !Objects.equals(a1VarT0.A, l2);
            a1VarT0.A = l2;
            if (a1VarT0.o()) {
                m mVar2 = this.i;
                T(mVar2);
                mVar2.u0(a1VarT0, false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0121  */
    public final void v(com.gamericefishpro.space.i9.h3 h3Var, String str) {
        int iF0;
        int iIndexOf;
        l1 l1Var = this.d;
        T(l1Var);
        l1Var.r();
        l1Var.x(str);
        com.gamericefishpro.space.t.e eVar = l1Var.w;
        Set set = (Set) eVar.get(str);
        if (set != null) {
            h3Var.b();
            ((com.gamericefishpro.space.i9.i3) h3Var.e).a1(set);
        }
        T(l1Var);
        l1Var.r();
        l1Var.x(str);
        if (eVar.get(str) != null && (((Set) eVar.get(str)).contains("device_model") || ((Set) eVar.get(str)).contains("device_info"))) {
            h3Var.b();
            ((com.gamericefishpro.space.i9.i3) h3Var.e).q1();
        }
        T(l1Var);
        if (l1Var.J(str)) {
            String strI2 = ((com.gamericefishpro.space.i9.i3) h3Var.e).i2();
            if (!TextUtils.isEmpty(strI2) && (iIndexOf = strI2.indexOf(".")) != -1) {
                String strSubstring = strI2.substring(0, iIndexOf);
                h3Var.b();
                ((com.gamericefishpro.space.i9.i3) h3Var.e).o0(strSubstring);
            }
        }
        T(l1Var);
        l1Var.r();
        l1Var.x(str);
        if (eVar.get(str) != null && ((Set) eVar.get(str)).contains("user_id") && (iF0 = z0.f0(h3Var, "_id")) != -1) {
            h3Var.b();
            ((com.gamericefishpro.space.i9.i3) h3Var.e).e0(iF0);
        }
        T(l1Var);
        l1Var.r();
        l1Var.x(str);
        if (eVar.get(str) != null && ((Set) eVar.get(str)).contains("google_signals")) {
            h3Var.b();
            ((com.gamericefishpro.space.i9.i3) h3Var.e).S0();
        }
        T(l1Var);
        if (l1Var.K(str)) {
            h3Var.b();
            ((com.gamericefishpro.space.i9.i3) h3Var.e).D1();
            if (b(str).i(d2.ANALYTICS_STORAGE)) {
                HashMap map = this.W;
                k4 k4Var = (k4) map.get(str);
                if (k4Var != null) {
                    long jY = d0().y(str, e0.k0) + k4Var.b;
                    e().getClass();
                    if (jY < SystemClock.elapsedRealtime()) {
                        k4Var = new k4(this, j0().j0());
                        map.put(str, k4Var);
                    }
                } else {
                    k4Var = new k4(this, j0().j0());
                    map.put(str, k4Var);
                }
                String str2 = k4Var.a;
                h3Var.b();
                ((com.gamericefishpro.space.i9.i3) h3Var.e).b1(str2);
            }
        }
        T(l1Var);
        l1Var.r();
        l1Var.x(str);
        if (eVar.get(str) == null || !((Set) eVar.get(str)).contains("enhanced_user_id")) {
            return;
        }
        h3Var.b();
        ((com.gamericefishpro.space.i9.i3) h3Var.e).Z0();
    }

    public final void w(com.gamericefishpro.space.i9.h3 h3Var, e1 e1Var) {
        String strJ0;
        String strJ1;
        for (int i = 0; i < h3Var.V(); i++) {
            com.gamericefishpro.space.i9.z2 z2Var = (com.gamericefishpro.space.i9.z2) ((com.gamericefishpro.space.i9.i3) h3Var.e).T1(i).i();
            Iterator it = z2Var.h().iterator();
            while (it.hasNext()) {
                if ("_c".equals(((com.gamericefishpro.space.i9.d3) it.next()).q())) {
                    if (((com.gamericefishpro.space.i9.i3) e1Var.b).G0() >= d0().z(((com.gamericefishpro.space.i9.i3) e1Var.b).p(), e0.l0)) {
                        int iZ = d0().z(((com.gamericefishpro.space.i9.i3) e1Var.b).p(), e0.y0);
                        LinkedList linkedList = this.J;
                        z0 z0Var = this.z;
                        if (iZ > 0) {
                            m mVar = this.i;
                            T(mVar);
                            if (mVar.v0(g(), ((com.gamericefishpro.space.i9.i3) e1Var.b).p(), false, false, false, true).g > iZ) {
                                com.gamericefishpro.space.i9.c3 c3VarB = com.gamericefishpro.space.i9.d3.B();
                                c3VarB.h("_tnr");
                                c3VarB.j(1L);
                                z2Var.k((com.gamericefishpro.space.i9.d3) c3VarB.e());
                            } else {
                                if (d0().B(((com.gamericefishpro.space.i9.i3) e1Var.b).p(), e0.R0)) {
                                    strJ1 = j0().j0();
                                    com.gamericefishpro.space.i9.c3 c3VarB2 = com.gamericefishpro.space.i9.d3.B();
                                    c3VarB2.h("_tu");
                                    c3VarB2.i(strJ1);
                                    z2Var.k((com.gamericefishpro.space.i9.d3) c3VarB2.e());
                                } else {
                                    strJ1 = null;
                                }
                                com.gamericefishpro.space.i9.c3 c3VarB3 = com.gamericefishpro.space.i9.d3.B();
                                c3VarB3.h("_tr");
                                c3VarB3.j(1L);
                                z2Var.k((com.gamericefishpro.space.i9.d3) c3VarB3.e());
                                T(z0Var);
                                a4 a4VarS = z0Var.S(((com.gamericefishpro.space.i9.i3) e1Var.b).p(), h3Var, z2Var, strJ1);
                                if (a4VarS != null) {
                                    a().G.c("Generated trigger URI. appId, uri", ((com.gamericefishpro.space.i9.i3) e1Var.b).p(), a4VarS.d);
                                    m mVar2 = this.i;
                                    T(mVar2);
                                    mVar2.L(((com.gamericefishpro.space.i9.i3) e1Var.b).p(), a4VarS);
                                    if (!linkedList.contains(((com.gamericefishpro.space.i9.i3) e1Var.b).p())) {
                                        linkedList.add(((com.gamericefishpro.space.i9.i3) e1Var.b).p());
                                    }
                                }
                            }
                        } else {
                            if (d0().B(((com.gamericefishpro.space.i9.i3) e1Var.b).p(), e0.R0)) {
                                strJ0 = j0().j0();
                                com.gamericefishpro.space.i9.c3 c3VarB4 = com.gamericefishpro.space.i9.d3.B();
                                c3VarB4.h("_tu");
                                c3VarB4.i(strJ0);
                                z2Var.k((com.gamericefishpro.space.i9.d3) c3VarB4.e());
                            } else {
                                strJ0 = null;
                            }
                            com.gamericefishpro.space.i9.c3 c3VarB5 = com.gamericefishpro.space.i9.d3.B();
                            c3VarB5.h("_tr");
                            c3VarB5.j(1L);
                            z2Var.k((com.gamericefishpro.space.i9.d3) c3VarB5.e());
                            T(z0Var);
                            a4 a4VarS2 = z0Var.S(((com.gamericefishpro.space.i9.i3) e1Var.b).p(), h3Var, z2Var, strJ0);
                            if (a4VarS2 != null) {
                                a().G.c("Generated trigger URI. appId, uri", ((com.gamericefishpro.space.i9.i3) e1Var.b).p(), a4VarS2.d);
                                m mVar3 = this.i;
                                T(mVar3);
                                mVar3.L(((com.gamericefishpro.space.i9.i3) e1Var.b).p(), a4VarS2);
                                if (!linkedList.contains(((com.gamericefishpro.space.i9.i3) e1Var.b).p())) {
                                    linkedList.add(((com.gamericefishpro.space.i9.i3) e1Var.b).p());
                                }
                            }
                        }
                    }
                    com.gamericefishpro.space.i9.a3 a3Var = (com.gamericefishpro.space.i9.a3) z2Var.e();
                    h3Var.b();
                    ((com.gamericefishpro.space.i9.i3) h3Var.e).X(i, a3Var);
                    break;
                }
            }
        }
    }

    public final void x(String str, com.gamericefishpro.space.i9.c3 c3Var, Bundle bundle, String str2) {
        int iMax;
        List listUnmodifiableList = Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si"));
        if (r4.P(((com.gamericefishpro.space.i9.d3) c3Var.e).q()) || r4.P(str)) {
            g gVarD0 = d0();
            gVarD0.getClass();
            iMax = Math.max(Math.max(Math.min(gVarD0.z(str2, e0.h0), PermissionsActivity.DELAY_TIME_CALLBACK_CALL), 100), 256);
        } else {
            g gVarD1 = d0();
            gVarD1.getClass();
            iMax = Math.max(Math.min(gVarD1.z(str2, e0.h0), PermissionsActivity.DELAY_TIME_CALLBACK_CALL), 100);
        }
        long j = iMax;
        long jCodePointCount = ((com.gamericefishpro.space.i9.d3) c3Var.e).s().codePointCount(0, ((com.gamericefishpro.space.i9.d3) c3Var.e).s().length());
        j0();
        String strQ = ((com.gamericefishpro.space.i9.d3) c3Var.e).q();
        d0();
        String strW = r4.w(strQ, true, 40);
        if (jCodePointCount <= j || listUnmodifiableList.contains(((com.gamericefishpro.space.i9.d3) c3Var.e).q())) {
            return;
        }
        if ("_ev".equals(((com.gamericefishpro.space.i9.d3) c3Var.e).q())) {
            j0();
            String strS = ((com.gamericefishpro.space.i9.d3) c3Var.e).s();
            g gVarD2 = d0();
            gVarD2.getClass();
            bundle.putString("_ev", r4.w(strS, true, Math.max(Math.max(Math.min(gVarD2.z(str2, e0.h0), PermissionsActivity.DELAY_TIME_CALLBACK_CALL), 100), 256)));
            return;
        }
        a().D.c("Param value is too long; discarded. Name, value length", strW, Long.valueOf(jCodePointCount));
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", strW);
                bundle.putLong("_el", jCodePointCount);
            }
        }
        bundle.remove(((com.gamericefishpro.space.i9.d3) c3Var.e).q());
    }

    /* JADX WARN: Code duplicated, block: B:103:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x0153 A[EDGE_INSN: B:105:0x0153->B:52:0x0153 BREAK  A[LOOP:0: B:33:0x00f5->B:107:0x00f5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x008f A[Catch: all -> 0x0018, PHI: r0
      0x008f: PHI (r0v2 int) = (r0v0 int), (r0v36 int) binds: [B:9:0x0025, B:15:0x0030] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {all -> 0x0018, blocks: (B:4:0x0015, B:8:0x001d, B:16:0x0032, B:21:0x0082, B:20:0x0070, B:22:0x008f, B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9, B:95:0x0266), top: B:104:0x0015, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00c8 A[Catch: all -> 0x0018, SQLiteException -> 0x00b7, TryCatch #2 {SQLiteException -> 0x00b7, blocks: (B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9), top: B:103:0x00a4, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00d9 A[Catch: all -> 0x0018, SQLiteException -> 0x00b7, TryCatch #2 {SQLiteException -> 0x00b7, blocks: (B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9), top: B:103:0x00a4, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ff A[Catch: all -> 0x0150, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0150, blocks: (B:32:0x00ec, B:33:0x00f5, B:36:0x00ff, B:39:0x0113, B:41:0x011f, B:42:0x0121, B:46:0x0138, B:48:0x0142, B:52:0x0153, B:53:0x0158, B:55:0x015e, B:57:0x0171, B:59:0x0188, B:60:0x018a, B:62:0x019c, B:64:0x01b8, B:66:0x01dc, B:67:0x01eb, B:69:0x01f2, B:70:0x01fa, B:73:0x0209, B:75:0x020d, B:78:0x0214, B:79:0x0215), top: B:102:0x00ec, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x011f A[Catch: all -> 0x0150, TryCatch #1 {all -> 0x0150, blocks: (B:32:0x00ec, B:33:0x00f5, B:36:0x00ff, B:39:0x0113, B:41:0x011f, B:42:0x0121, B:46:0x0138, B:48:0x0142, B:52:0x0153, B:53:0x0158, B:55:0x015e, B:57:0x0171, B:59:0x0188, B:60:0x018a, B:62:0x019c, B:64:0x01b8, B:66:0x01dc, B:67:0x01eb, B:69:0x01f2, B:70:0x01fa, B:73:0x0209, B:75:0x020d, B:78:0x0214, B:79:0x0215), top: B:102:0x00ec, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0134  */
    /* JADX WARN: Code duplicated, block: B:55:0x015e A[Catch: all -> 0x0150, TryCatch #1 {all -> 0x0150, blocks: (B:32:0x00ec, B:33:0x00f5, B:36:0x00ff, B:39:0x0113, B:41:0x011f, B:42:0x0121, B:46:0x0138, B:48:0x0142, B:52:0x0153, B:53:0x0158, B:55:0x015e, B:57:0x0171, B:59:0x0188, B:60:0x018a, B:62:0x019c, B:64:0x01b8, B:66:0x01dc, B:67:0x01eb, B:69:0x01f2, B:70:0x01fa, B:73:0x0209, B:75:0x020d, B:78:0x0214, B:79:0x0215), top: B:102:0x00ec, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0188 A[Catch: all -> 0x0150, TryCatch #1 {all -> 0x0150, blocks: (B:32:0x00ec, B:33:0x00f5, B:36:0x00ff, B:39:0x0113, B:41:0x011f, B:42:0x0121, B:46:0x0138, B:48:0x0142, B:52:0x0153, B:53:0x0158, B:55:0x015e, B:57:0x0171, B:59:0x0188, B:60:0x018a, B:62:0x019c, B:64:0x01b8, B:66:0x01dc, B:67:0x01eb, B:69:0x01f2, B:70:0x01fa, B:73:0x0209, B:75:0x020d, B:78:0x0214, B:79:0x0215), top: B:102:0x00ec, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x01b8 A[Catch: all -> 0x0150, TryCatch #1 {all -> 0x0150, blocks: (B:32:0x00ec, B:33:0x00f5, B:36:0x00ff, B:39:0x0113, B:41:0x011f, B:42:0x0121, B:46:0x0138, B:48:0x0142, B:52:0x0153, B:53:0x0158, B:55:0x015e, B:57:0x0171, B:59:0x0188, B:60:0x018a, B:62:0x019c, B:64:0x01b8, B:66:0x01dc, B:67:0x01eb, B:69:0x01f2, B:70:0x01fa, B:73:0x0209, B:75:0x020d, B:78:0x0214, B:79:0x0215), top: B:102:0x00ec, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x01dc A[Catch: all -> 0x0150, TryCatch #1 {all -> 0x0150, blocks: (B:32:0x00ec, B:33:0x00f5, B:36:0x00ff, B:39:0x0113, B:41:0x011f, B:42:0x0121, B:46:0x0138, B:48:0x0142, B:52:0x0153, B:53:0x0158, B:55:0x015e, B:57:0x0171, B:59:0x0188, B:60:0x018a, B:62:0x019c, B:64:0x01b8, B:66:0x01dc, B:67:0x01eb, B:69:0x01f2, B:70:0x01fa, B:73:0x0209, B:75:0x020d, B:78:0x0214, B:79:0x0215), top: B:102:0x00ec, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01f2 A[Catch: all -> 0x0150, TRY_LEAVE, TryCatch #1 {all -> 0x0150, blocks: (B:32:0x00ec, B:33:0x00f5, B:36:0x00ff, B:39:0x0113, B:41:0x011f, B:42:0x0121, B:46:0x0138, B:48:0x0142, B:52:0x0153, B:53:0x0158, B:55:0x015e, B:57:0x0171, B:59:0x0188, B:60:0x018a, B:62:0x019c, B:64:0x01b8, B:66:0x01dc, B:67:0x01eb, B:69:0x01f2, B:70:0x01fa, B:73:0x0209, B:75:0x020d, B:78:0x0214, B:79:0x0215), top: B:102:0x00ec, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0230 A[Catch: all -> 0x0018, SQLiteException -> 0x00b7, TryCatch #2 {SQLiteException -> 0x00b7, blocks: (B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9), top: B:103:0x00a4, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x023b A[Catch: all -> 0x0018, SQLiteException -> 0x00b7, TryCatch #2 {SQLiteException -> 0x00b7, blocks: (B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9), top: B:103:0x00a4, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0241 A[Catch: all -> 0x0018, SQLiteException -> 0x00b7, TryCatch #2 {SQLiteException -> 0x00b7, blocks: (B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9), top: B:103:0x00a4, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x024a A[Catch: all -> 0x0018, SQLiteException -> 0x00b7, TryCatch #2 {SQLiteException -> 0x00b7, blocks: (B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9), top: B:103:0x00a4, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0254 A[Catch: all -> 0x0018, SQLiteException -> 0x00b7, TryCatch #2 {SQLiteException -> 0x00b7, blocks: (B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9), top: B:103:0x00a4, outer: #3 }] */
    public final void y(boolean z, int i, Throwable th, byte[] bArr, String str, List list) {
        byte[] bArr2;
        Integer numValueOf;
        HashMap map;
        Iterator it;
        boolean zHasNext;
        a3 a3Var;
        Iterator it2;
        List listW;
        int size;
        int i2;
        m mVar;
        Long l;
        long j;
        com.gamericefishpro.space.i9.g3 g3Var;
        h4 h4Var;
        Map map2;
        com.gamericefishpro.space.i9.g3 g3Var2;
        h4 h4Var2;
        a3 a3Var2;
        a3 a3Var3;
        Map map3;
        long jV;
        int i3 = i;
        z0 z0Var = this.e;
        c().r();
        k0();
        if (bArr == null) {
            try {
                bArr2 = new byte[0];
            } catch (Throwable th2) {
                this.N = false;
                O();
                throw th2;
            }
        } else {
            bArr2 = bArr;
        }
        ArrayList arrayList = this.R;
        com.gamericefishpro.space.v8.c0.g(arrayList);
        this.R = null;
        if (z) {
            if (i3 == 200) {
                if (th != null) {
                    t0 t0Var = a().G;
                    numValueOf = Integer.valueOf(i3);
                    t0Var.c("Network upload successful with code, uploadAttempted", numValueOf, Boolean.valueOf(z));
                    if (z) {
                        d1 d1Var = this.B.A;
                        e().getClass();
                        d1Var.b(System.currentTimeMillis());
                    }
                    this.B.B.b(0L);
                    N();
                    if (z) {
                        a().G.c("Successful upload. Got network response. code, size", numValueOf, Integer.valueOf(bArr2.length));
                    } else {
                        a().G.a("Purged empty bundles");
                    }
                    m mVar2 = this.i;
                    T(mVar2);
                    mVar2.d0();
                    map = new HashMap();
                    it = list.iterator();
                    while (true) {
                        zHasNext = it.hasNext();
                        a3Var = a3.SGTM_CLIENT;
                        if (!zHasNext) {
                            break;
                            break;
                        }
                        Pair pair = (Pair) it.next();
                        g3Var2 = (com.gamericefishpro.space.i9.g3) pair.first;
                        h4Var2 = (h4) pair.second;
                        a3Var2 = h4Var2.c;
                        a3Var3 = h4Var2.c;
                        if (a3Var2 != a3Var) {
                            m mVar3 = this.i;
                            T(mVar3);
                            String str2 = h4Var2.a;
                            map3 = h4Var2.b;
                            if (map3 == null) {
                                map3 = Collections.EMPTY_MAP;
                            }
                            jV = mVar3.v(str, g3Var2, str2, map3, a3Var3, null);
                            if (a3Var3 == a3.GOOGLE_SIGNAL_PENDING) {
                                map.put(g3Var2.t(), Long.valueOf(jV));
                            }
                        }
                    }
                    it2 = list.iterator();
                    while (it2.hasNext()) {
                        Pair pair2 = (Pair) it2.next();
                        g3Var = (com.gamericefishpro.space.i9.g3) pair2.first;
                        h4Var = (h4) pair2.second;
                        if (h4Var.c == a3Var) {
                            Long l2 = (Long) map.get(g3Var.t());
                            m mVar4 = this.i;
                            T(mVar4);
                            a3 a3Var4 = a3Var;
                            String str3 = h4Var.a;
                            map2 = h4Var.b;
                            if (map2 == null) {
                                map2 = Collections.EMPTY_MAP;
                            }
                            mVar4.v(str, g3Var, str3, map2, h4Var.c, l2);
                            a3Var = a3Var4;
                        }
                    }
                    m mVar5 = this.i;
                    T(mVar5);
                    listW = mVar5.w(str, e4.b(a3Var), 1);
                    if (!listW.isEmpty()) {
                        j = ((n4) listW.get(0)).f;
                        e().getClass();
                        if (System.currentTimeMillis() > ((Long) e0.F.a(null)).longValue() + j) {
                            a().B.c("[sgtm] client batches are queued too long. appId, creationTime", str, Long.valueOf(j));
                        }
                    }
                    size = arrayList.size();
                    i2 = 0;
                    while (i2 < size) {
                        int i4 = i2 + 1;
                        l = (Long) arrayList.get(i2);
                        m mVar6 = this.i;
                        T(mVar6);
                        mVar6.A(l.longValue());
                        i2 = i4;
                    }
                    m mVar7 = this.i;
                    T(mVar7);
                    mVar7.e0();
                    m mVar8 = this.i;
                    T(mVar8);
                    mVar8.f0();
                    this.S = null;
                    T(z0Var);
                    if (z0Var.L()) {
                        mVar = this.i;
                        T(mVar);
                        if (mVar.x(str)) {
                            t(str);
                        } else {
                            T(z0Var);
                            if (z0Var.L()) {
                                this.T = -1L;
                                N();
                            } else {
                                this.T = -1L;
                                N();
                            }
                        }
                    } else {
                        T(z0Var);
                        if (z0Var.L()) {
                            this.T = -1L;
                            N();
                        } else {
                            this.T = -1L;
                            N();
                        }
                    }
                    this.H = 0L;
                }
            } else if (i3 == 204) {
                i3 = 204;
                if (th != null) {
                    t0 t0Var2 = a().G;
                    numValueOf = Integer.valueOf(i3);
                    t0Var2.c("Network upload successful with code, uploadAttempted", numValueOf, Boolean.valueOf(z));
                    if (z) {
                        d1 d1Var2 = this.B.A;
                        e().getClass();
                        d1Var2.b(System.currentTimeMillis());
                    }
                    this.B.B.b(0L);
                    N();
                    if (z) {
                        a().G.c("Successful upload. Got network response. code, size", numValueOf, Integer.valueOf(bArr2.length));
                    } else {
                        a().G.a("Purged empty bundles");
                    }
                    m mVar9 = this.i;
                    T(mVar9);
                    mVar9.d0();
                    map = new HashMap();
                    it = list.iterator();
                    while (true) {
                        zHasNext = it.hasNext();
                        a3Var = a3.SGTM_CLIENT;
                        if (!zHasNext) {
                            break;
                            break;
                        }
                        Pair pair3 = (Pair) it.next();
                        g3Var2 = (com.gamericefishpro.space.i9.g3) pair3.first;
                        h4Var2 = (h4) pair3.second;
                        a3Var2 = h4Var2.c;
                        a3Var3 = h4Var2.c;
                        if (a3Var2 != a3Var) {
                            m mVar10 = this.i;
                            T(mVar10);
                            String str4 = h4Var2.a;
                            map3 = h4Var2.b;
                            if (map3 == null) {
                                map3 = Collections.EMPTY_MAP;
                            }
                            jV = mVar10.v(str, g3Var2, str4, map3, a3Var3, null);
                            if (a3Var3 == a3.GOOGLE_SIGNAL_PENDING) {
                                map.put(g3Var2.t(), Long.valueOf(jV));
                            }
                        }
                    }
                    it2 = list.iterator();
                    while (it2.hasNext()) {
                        Pair pair4 = (Pair) it2.next();
                        g3Var = (com.gamericefishpro.space.i9.g3) pair4.first;
                        h4Var = (h4) pair4.second;
                        if (h4Var.c == a3Var) {
                            Long l3 = (Long) map.get(g3Var.t());
                            m mVar11 = this.i;
                            T(mVar11);
                            a3 a3Var5 = a3Var;
                            String str5 = h4Var.a;
                            map2 = h4Var.b;
                            if (map2 == null) {
                                map2 = Collections.EMPTY_MAP;
                            }
                            mVar11.v(str, g3Var, str5, map2, h4Var.c, l3);
                            a3Var = a3Var5;
                        }
                    }
                    m mVar12 = this.i;
                    T(mVar12);
                    listW = mVar12.w(str, e4.b(a3Var), 1);
                    if (!listW.isEmpty()) {
                        j = ((n4) listW.get(0)).f;
                        e().getClass();
                        if (System.currentTimeMillis() > ((Long) e0.F.a(null)).longValue() + j) {
                            a().B.c("[sgtm] client batches are queued too long. appId, creationTime", str, Long.valueOf(j));
                        }
                    }
                    size = arrayList.size();
                    i2 = 0;
                    while (i2 < size) {
                        int i5 = i2 + 1;
                        l = (Long) arrayList.get(i2);
                        m mVar13 = this.i;
                        T(mVar13);
                        mVar13.A(l.longValue());
                        i2 = i5;
                    }
                    m mVar14 = this.i;
                    T(mVar14);
                    mVar14.e0();
                    m mVar15 = this.i;
                    T(mVar15);
                    mVar15.f0();
                    this.S = null;
                    T(z0Var);
                    if (z0Var.L()) {
                        mVar = this.i;
                        T(mVar);
                        if (mVar.x(str)) {
                            t(str);
                        } else {
                            T(z0Var);
                            if (z0Var.L()) {
                                this.T = -1L;
                                N();
                            } else {
                                this.T = -1L;
                                N();
                            }
                        }
                    } else {
                        T(z0Var);
                        if (z0Var.L()) {
                            this.T = -1L;
                            N();
                        } else {
                            this.T = -1L;
                            N();
                        }
                    }
                    this.H = 0L;
                }
            }
            String str6 = new String(bArr2, StandardCharsets.UTF_8);
            a().D.d("Network upload failed. Will retry later. code, error", Integer.valueOf(i3), th, str6.substring(0, Math.min(32, str6.length())));
            d1 d1Var3 = this.B.B;
            e().getClass();
            d1Var3.b(System.currentTimeMillis());
            if (i3 == 503 || i3 == 429) {
                d1 d1Var4 = this.B.z;
                e().getClass();
                d1Var4.b(System.currentTimeMillis());
            }
            m mVar16 = this.i;
            T(mVar16);
            mVar16.C(arrayList);
            N();
        } else {
            t0 t0Var3 = a().G;
            numValueOf = Integer.valueOf(i3);
            t0Var3.c("Network upload successful with code, uploadAttempted", numValueOf, Boolean.valueOf(z));
            if (z) {
                try {
                    d1 d1Var5 = this.B.A;
                    e().getClass();
                    d1Var5.b(System.currentTimeMillis());
                } catch (SQLiteException e) {
                    a().y.b(e, "Database error while trying to delete uploaded bundles");
                    e().getClass();
                    this.H = SystemClock.elapsedRealtime();
                    a().G.b(Long.valueOf(this.H), "Disable upload, time");
                }
            }
            this.B.B.b(0L);
            N();
            if (z) {
                a().G.c("Successful upload. Got network response. code, size", numValueOf, Integer.valueOf(bArr2.length));
            } else {
                a().G.a("Purged empty bundles");
            }
            m mVar17 = this.i;
            T(mVar17);
            mVar17.d0();
            try {
                map = new HashMap();
                it = list.iterator();
                while (true) {
                    zHasNext = it.hasNext();
                    a3Var = a3.SGTM_CLIENT;
                    if (!zHasNext) {
                        break;
                    }
                    Pair pair5 = (Pair) it.next();
                    g3Var2 = (com.gamericefishpro.space.i9.g3) pair5.first;
                    h4Var2 = (h4) pair5.second;
                    a3Var2 = h4Var2.c;
                    a3Var3 = h4Var2.c;
                    if (a3Var2 != a3Var) {
                        m mVar18 = this.i;
                        T(mVar18);
                        String str7 = h4Var2.a;
                        map3 = h4Var2.b;
                        if (map3 == null) {
                            map3 = Collections.EMPTY_MAP;
                        }
                        jV = mVar18.v(str, g3Var2, str7, map3, a3Var3, null);
                        if (a3Var3 == a3.GOOGLE_SIGNAL_PENDING && jV != -1 && !g3Var2.t().isEmpty()) {
                            map.put(g3Var2.t(), Long.valueOf(jV));
                        }
                    }
                }
                it2 = list.iterator();
                while (it2.hasNext()) {
                    Pair pair6 = (Pair) it2.next();
                    g3Var = (com.gamericefishpro.space.i9.g3) pair6.first;
                    h4Var = (h4) pair6.second;
                    if (h4Var.c == a3Var) {
                        Long l4 = (Long) map.get(g3Var.t());
                        m mVar19 = this.i;
                        T(mVar19);
                        a3 a3Var6 = a3Var;
                        String str8 = h4Var.a;
                        map2 = h4Var.b;
                        if (map2 == null) {
                            map2 = Collections.EMPTY_MAP;
                        }
                        mVar19.v(str, g3Var, str8, map2, h4Var.c, l4);
                        a3Var = a3Var6;
                    }
                }
                m mVar110 = this.i;
                T(mVar110);
                listW = mVar110.w(str, e4.b(a3Var), 1);
                if (!listW.isEmpty()) {
                    j = ((n4) listW.get(0)).f;
                    e().getClass();
                    if (System.currentTimeMillis() > ((Long) e0.F.a(null)).longValue() + j) {
                        a().B.c("[sgtm] client batches are queued too long. appId, creationTime", str, Long.valueOf(j));
                    }
                }
                size = arrayList.size();
                i2 = 0;
                while (i2 < size) {
                    int i6 = i2 + 1;
                    l = (Long) arrayList.get(i2);
                    try {
                        m mVar111 = this.i;
                        T(mVar111);
                        mVar111.A(l.longValue());
                    } catch (SQLiteException e2) {
                        ArrayList arrayList2 = this.S;
                        if (arrayList2 == null || !arrayList2.contains(l)) {
                            throw e2;
                        }
                    }
                    i2 = i6;
                }
                m mVar112 = this.i;
                T(mVar112);
                mVar112.e0();
                m mVar113 = this.i;
                T(mVar113);
                mVar113.f0();
                this.S = null;
                T(z0Var);
                if (z0Var.L()) {
                    mVar = this.i;
                    T(mVar);
                    if (mVar.x(str)) {
                        t(str);
                    } else {
                        T(z0Var);
                        if (z0Var.L() || !L()) {
                            this.T = -1L;
                            N();
                        } else {
                            q();
                        }
                    }
                } else {
                    T(z0Var);
                    if (z0Var.L()) {
                        this.T = -1L;
                        N();
                    } else {
                        this.T = -1L;
                        N();
                    }
                }
                this.H = 0L;
            } catch (Throwable th3) {
                m mVar20 = this.i;
                T(mVar20);
                mVar20.f0();
                throw th3;
            }
        }
        this.N = false;
        O();
    }

    public final void z(a1 a1Var) {
        com.gamericefishpro.space.t.e eVar;
        com.gamericefishpro.space.t.e eVar2;
        c().r();
        if (TextUtils.isEmpty(a1Var.G())) {
            String strD = a1Var.D();
            com.gamericefishpro.space.v8.c0.g(strD);
            A(strD, 204, null, null, null);
            return;
        }
        String strD2 = a1Var.D();
        com.gamericefishpro.space.v8.c0.g(strD2);
        a().G.b(strD2, "Fetching remote configuration");
        l1 l1Var = this.d;
        T(l1Var);
        com.gamericefishpro.space.i9.e2 e2VarD = l1Var.D(strD2);
        T(l1Var);
        l1Var.r();
        String str = (String) l1Var.F.get(strD2);
        if (e2VarD != null) {
            if (TextUtils.isEmpty(str)) {
                eVar2 = null;
            } else {
                eVar2 = new com.gamericefishpro.space.t.e(0);
                eVar2.put("If-Modified-Since", str);
            }
            T(l1Var);
            l1Var.r();
            String str2 = (String) l1Var.G.get(strD2);
            if (!TextUtils.isEmpty(str2)) {
                if (eVar2 == null) {
                    eVar2 = new com.gamericefishpro.space.t.e(0);
                }
                eVar2.put("If-None-Match", str2);
            }
            eVar = eVar2;
        } else {
            eVar = null;
        }
        this.M = true;
        z0 z0Var = this.e;
        T(z0Var);
        j4 j4Var = new j4(this);
        r1 r1Var = (r1) z0Var.d;
        z0Var.r();
        z0Var.s();
        i4 i4Var = z0Var.e.C;
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder builderAppendQueryParameter = builder.scheme((String) e0.f.a(null)).encodedAuthority((String) e0.g.a(null)).path("config/app/".concat(String.valueOf(a1Var.G()))).appendQueryParameter("platform", "android");
        ((r1) i4Var.d).v.w();
        builderAppendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(133005L)).appendQueryParameter("runtime_version", "0");
        String string = builder.build().toString();
        try {
            URL url = new URI(string).toURL();
            p1 p1Var = r1Var.z;
            r1.l(p1Var);
            p1Var.D(new y0(z0Var, a1Var.D(), url, (byte[]) null, eVar, j4Var));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            v0 v0Var = r1Var.y;
            r1.l(v0Var);
            v0Var.y.c("Failed to parse config URL. Not fetching. appId", v0.z(a1Var.D()), string);
        }
    }
}
