package defpackage;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.jrb0;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.scer.pdfx.a;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes4.dex */
public interface qrb0 {
    static void a(tt5 tt5Var, final a aVar) {
        rrb0 rrb0Var = rrb0.d;
        Object obj = null;
        m2v m2vVar = new m2v(tt5Var, "dev.flutter.pigeon.PdfxApi.openDocumentData", rrb0Var, obj);
        if (aVar != null) {
            final int i = 0;
            m2vVar.G(new ee5(aVar) { // from class: krb0
                public final /* synthetic */ qrb0 b;

                {
                    this.b = aVar;
                }

                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    jrb0.k kVar;
                    jrb0.c cVar;
                    jrb0.c cVar2;
                    int i2 = i;
                    qrb0 qrb0Var = this.b;
                    switch (i2) {
                        case 0:
                            HashMap hashMap = new HashMap();
                            try {
                                jrb0.d dVar = (jrb0.d) ((ArrayList) obj2).get(0);
                                if (dVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).i(dVar, new lrb0(hashMap, ce5Var));
                                return;
                            } catch (Error | RuntimeException e) {
                                hashMap.put("error", jrb0.a(e));
                                ce5Var.a(hashMap);
                                return;
                            }
                        case 1:
                            HashMap hashMap2 = new HashMap();
                            try {
                                jrb0.j jVar = (jrb0.j) ((ArrayList) obj2).get(0);
                                if (jVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                int longValue = (int) jVar.a.longValue();
                                int longValue2 = (int) jVar.b.longValue();
                                int longValue3 = (int) jVar.c.longValue();
                                TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer = (TextureRegistry$SurfaceProducer) ((a) qrb0Var).d.get(longValue);
                                if (textureRegistry$SurfaceProducer != null) {
                                    textureRegistry$SurfaceProducer.setSize(longValue2, longValue3);
                                }
                                hashMap2.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                                ce5Var.a(hashMap2);
                                return;
                            } catch (Error | RuntimeException e2) {
                                hashMap2.put("error", jrb0.a(e2));
                                ce5Var.a(hashMap2);
                                return;
                            }
                        case 2:
                            HashMap hashMap3 = new HashMap();
                            try {
                                kVar = (jrb0.k) ((ArrayList) obj2).get(0);
                            } catch (Error | RuntimeException e3) {
                                hashMap3.put("error", jrb0.a(e3));
                            }
                            if (kVar == null) {
                                throw new NullPointerException("messageArg unexpectedly null.");
                            }
                            ((a) qrb0Var).n(kVar);
                            hashMap3.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                            ce5Var.a(hashMap3);
                            return;
                        case 3:
                            HashMap hashMap4 = new HashMap();
                            try {
                                jrb0.e eVar = (jrb0.e) ((ArrayList) obj2).get(0);
                                if (eVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).j(eVar, new mrb0(hashMap4, ce5Var));
                                return;
                            } catch (Error | RuntimeException e4) {
                                hashMap4.put("error", jrb0.a(e4));
                                ce5Var.a(hashMap4);
                                return;
                            }
                        case 4:
                            HashMap hashMap5 = new HashMap();
                            try {
                                jrb0.e eVar2 = (jrb0.e) ((ArrayList) obj2).get(0);
                                if (eVar2 == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).h(eVar2, new nrb0(hashMap5, ce5Var));
                                return;
                            } catch (Error | RuntimeException e5) {
                                hashMap5.put("error", jrb0.a(e5));
                                ce5Var.a(hashMap5);
                                return;
                            }
                        case 5:
                            HashMap hashMap6 = new HashMap();
                            try {
                                cVar = (jrb0.c) ((ArrayList) obj2).get(0);
                            } catch (Error | RuntimeException e6) {
                                hashMap6.put("error", jrb0.a(e6));
                            }
                            if (cVar == null) {
                                throw new NullPointerException("messageArg unexpectedly null.");
                            }
                            ((a) qrb0Var).b(cVar);
                            hashMap6.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                            ce5Var.a(hashMap6);
                            return;
                        case 6:
                            HashMap hashMap7 = new HashMap();
                            try {
                                jrb0.a aVar2 = (jrb0.a) ((ArrayList) obj2).get(0);
                                if (aVar2 == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).d(aVar2, new orb0(hashMap7, ce5Var));
                                return;
                            } catch (Error | RuntimeException e7) {
                                hashMap7.put("error", jrb0.a(e7));
                                ce5Var.a(hashMap7);
                                return;
                            }
                        case 7:
                            HashMap hashMap8 = new HashMap();
                            try {
                                jrb0.h hVar = (jrb0.h) ((ArrayList) obj2).get(0);
                                if (hVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).m(hVar, new prb0(hashMap8, ce5Var));
                                return;
                            } catch (Error | RuntimeException e8) {
                                hashMap8.put("error", jrb0.a(e8));
                                ce5Var.a(hashMap8);
                                return;
                            }
                        case 8:
                            HashMap hashMap9 = new HashMap();
                            try {
                                cVar2 = (jrb0.c) ((ArrayList) obj2).get(0);
                            } catch (Error | RuntimeException e9) {
                                hashMap9.put("error", jrb0.a(e9));
                            }
                            if (cVar2 == null) {
                                throw new NullPointerException("messageArg unexpectedly null.");
                            }
                            ((a) qrb0Var).c(cVar2);
                            hashMap9.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                            ce5Var.a(hashMap9);
                            return;
                        case 9:
                            HashMap hashMap10 = new HashMap();
                            try {
                                hashMap10.put(TarifficatorScenarioActivity.RESULT_KEY, ((a) qrb0Var).l());
                            } catch (Error | RuntimeException e10) {
                                hashMap10.put("error", jrb0.a(e10));
                            }
                            ce5Var.a(hashMap10);
                            return;
                        default:
                            HashMap hashMap11 = new HashMap();
                            try {
                                jrb0.l lVar = (jrb0.l) ((ArrayList) obj2).get(0);
                                if (lVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).o(lVar, new oy80(13, hashMap11, ce5Var));
                                return;
                            } catch (Error | RuntimeException e11) {
                                hashMap11.put("error", jrb0.a(e11));
                                ce5Var.a(hashMap11);
                                return;
                            }
                    }
                }
            });
        } else {
            m2vVar.G(null);
        }
        m2v m2vVar2 = new m2v(tt5Var, "dev.flutter.pigeon.PdfxApi.openDocumentFile", rrb0Var, obj);
        if (aVar != null) {
            final int i2 = 3;
            m2vVar2.G(new ee5(aVar) { // from class: krb0
                public final /* synthetic */ qrb0 b;

                {
                    this.b = aVar;
                }

                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    jrb0.k kVar;
                    jrb0.c cVar;
                    jrb0.c cVar2;
                    int i22 = i2;
                    qrb0 qrb0Var = this.b;
                    switch (i22) {
                        case 0:
                            HashMap hashMap = new HashMap();
                            try {
                                jrb0.d dVar = (jrb0.d) ((ArrayList) obj2).get(0);
                                if (dVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).i(dVar, new lrb0(hashMap, ce5Var));
                                return;
                            } catch (Error | RuntimeException e) {
                                hashMap.put("error", jrb0.a(e));
                                ce5Var.a(hashMap);
                                return;
                            }
                        case 1:
                            HashMap hashMap2 = new HashMap();
                            try {
                                jrb0.j jVar = (jrb0.j) ((ArrayList) obj2).get(0);
                                if (jVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                int longValue = (int) jVar.a.longValue();
                                int longValue2 = (int) jVar.b.longValue();
                                int longValue3 = (int) jVar.c.longValue();
                                TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer = (TextureRegistry$SurfaceProducer) ((a) qrb0Var).d.get(longValue);
                                if (textureRegistry$SurfaceProducer != null) {
                                    textureRegistry$SurfaceProducer.setSize(longValue2, longValue3);
                                }
                                hashMap2.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                                ce5Var.a(hashMap2);
                                return;
                            } catch (Error | RuntimeException e2) {
                                hashMap2.put("error", jrb0.a(e2));
                                ce5Var.a(hashMap2);
                                return;
                            }
                        case 2:
                            HashMap hashMap3 = new HashMap();
                            try {
                                kVar = (jrb0.k) ((ArrayList) obj2).get(0);
                            } catch (Error | RuntimeException e3) {
                                hashMap3.put("error", jrb0.a(e3));
                            }
                            if (kVar == null) {
                                throw new NullPointerException("messageArg unexpectedly null.");
                            }
                            ((a) qrb0Var).n(kVar);
                            hashMap3.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                            ce5Var.a(hashMap3);
                            return;
                        case 3:
                            HashMap hashMap4 = new HashMap();
                            try {
                                jrb0.e eVar = (jrb0.e) ((ArrayList) obj2).get(0);
                                if (eVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).j(eVar, new mrb0(hashMap4, ce5Var));
                                return;
                            } catch (Error | RuntimeException e4) {
                                hashMap4.put("error", jrb0.a(e4));
                                ce5Var.a(hashMap4);
                                return;
                            }
                        case 4:
                            HashMap hashMap5 = new HashMap();
                            try {
                                jrb0.e eVar2 = (jrb0.e) ((ArrayList) obj2).get(0);
                                if (eVar2 == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).h(eVar2, new nrb0(hashMap5, ce5Var));
                                return;
                            } catch (Error | RuntimeException e5) {
                                hashMap5.put("error", jrb0.a(e5));
                                ce5Var.a(hashMap5);
                                return;
                            }
                        case 5:
                            HashMap hashMap6 = new HashMap();
                            try {
                                cVar = (jrb0.c) ((ArrayList) obj2).get(0);
                            } catch (Error | RuntimeException e6) {
                                hashMap6.put("error", jrb0.a(e6));
                            }
                            if (cVar == null) {
                                throw new NullPointerException("messageArg unexpectedly null.");
                            }
                            ((a) qrb0Var).b(cVar);
                            hashMap6.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                            ce5Var.a(hashMap6);
                            return;
                        case 6:
                            HashMap hashMap7 = new HashMap();
                            try {
                                jrb0.a aVar2 = (jrb0.a) ((ArrayList) obj2).get(0);
                                if (aVar2 == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).d(aVar2, new orb0(hashMap7, ce5Var));
                                return;
                            } catch (Error | RuntimeException e7) {
                                hashMap7.put("error", jrb0.a(e7));
                                ce5Var.a(hashMap7);
                                return;
                            }
                        case 7:
                            HashMap hashMap8 = new HashMap();
                            try {
                                jrb0.h hVar = (jrb0.h) ((ArrayList) obj2).get(0);
                                if (hVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).m(hVar, new prb0(hashMap8, ce5Var));
                                return;
                            } catch (Error | RuntimeException e8) {
                                hashMap8.put("error", jrb0.a(e8));
                                ce5Var.a(hashMap8);
                                return;
                            }
                        case 8:
                            HashMap hashMap9 = new HashMap();
                            try {
                                cVar2 = (jrb0.c) ((ArrayList) obj2).get(0);
                            } catch (Error | RuntimeException e9) {
                                hashMap9.put("error", jrb0.a(e9));
                            }
                            if (cVar2 == null) {
                                throw new NullPointerException("messageArg unexpectedly null.");
                            }
                            ((a) qrb0Var).c(cVar2);
                            hashMap9.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                            ce5Var.a(hashMap9);
                            return;
                        case 9:
                            HashMap hashMap10 = new HashMap();
                            try {
                                hashMap10.put(TarifficatorScenarioActivity.RESULT_KEY, ((a) qrb0Var).l());
                            } catch (Error | RuntimeException e10) {
                                hashMap10.put("error", jrb0.a(e10));
                            }
                            ce5Var.a(hashMap10);
                            return;
                        default:
                            HashMap hashMap11 = new HashMap();
                            try {
                                jrb0.l lVar = (jrb0.l) ((ArrayList) obj2).get(0);
                                if (lVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).o(lVar, new oy80(13, hashMap11, ce5Var));
                                return;
                            } catch (Error | RuntimeException e11) {
                                hashMap11.put("error", jrb0.a(e11));
                                ce5Var.a(hashMap11);
                                return;
                            }
                    }
                }
            });
        } else {
            m2vVar2.G(null);
        }
        m2v m2vVar3 = new m2v(tt5Var, "dev.flutter.pigeon.PdfxApi.openDocumentAsset", rrb0Var, obj);
        if (aVar != null) {
            final int i3 = 4;
            m2vVar3.G(new ee5(aVar) { // from class: krb0
                public final /* synthetic */ qrb0 b;

                {
                    this.b = aVar;
                }

                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    jrb0.k kVar;
                    jrb0.c cVar;
                    jrb0.c cVar2;
                    int i22 = i3;
                    qrb0 qrb0Var = this.b;
                    switch (i22) {
                        case 0:
                            HashMap hashMap = new HashMap();
                            try {
                                jrb0.d dVar = (jrb0.d) ((ArrayList) obj2).get(0);
                                if (dVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).i(dVar, new lrb0(hashMap, ce5Var));
                                return;
                            } catch (Error | RuntimeException e) {
                                hashMap.put("error", jrb0.a(e));
                                ce5Var.a(hashMap);
                                return;
                            }
                        case 1:
                            HashMap hashMap2 = new HashMap();
                            try {
                                jrb0.j jVar = (jrb0.j) ((ArrayList) obj2).get(0);
                                if (jVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                int longValue = (int) jVar.a.longValue();
                                int longValue2 = (int) jVar.b.longValue();
                                int longValue3 = (int) jVar.c.longValue();
                                TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer = (TextureRegistry$SurfaceProducer) ((a) qrb0Var).d.get(longValue);
                                if (textureRegistry$SurfaceProducer != null) {
                                    textureRegistry$SurfaceProducer.setSize(longValue2, longValue3);
                                }
                                hashMap2.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                                ce5Var.a(hashMap2);
                                return;
                            } catch (Error | RuntimeException e2) {
                                hashMap2.put("error", jrb0.a(e2));
                                ce5Var.a(hashMap2);
                                return;
                            }
                        case 2:
                            HashMap hashMap3 = new HashMap();
                            try {
                                kVar = (jrb0.k) ((ArrayList) obj2).get(0);
                            } catch (Error | RuntimeException e3) {
                                hashMap3.put("error", jrb0.a(e3));
                            }
                            if (kVar == null) {
                                throw new NullPointerException("messageArg unexpectedly null.");
                            }
                            ((a) qrb0Var).n(kVar);
                            hashMap3.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                            ce5Var.a(hashMap3);
                            return;
                        case 3:
                            HashMap hashMap4 = new HashMap();
                            try {
                                jrb0.e eVar = (jrb0.e) ((ArrayList) obj2).get(0);
                                if (eVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).j(eVar, new mrb0(hashMap4, ce5Var));
                                return;
                            } catch (Error | RuntimeException e4) {
                                hashMap4.put("error", jrb0.a(e4));
                                ce5Var.a(hashMap4);
                                return;
                            }
                        case 4:
                            HashMap hashMap5 = new HashMap();
                            try {
                                jrb0.e eVar2 = (jrb0.e) ((ArrayList) obj2).get(0);
                                if (eVar2 == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).h(eVar2, new nrb0(hashMap5, ce5Var));
                                return;
                            } catch (Error | RuntimeException e5) {
                                hashMap5.put("error", jrb0.a(e5));
                                ce5Var.a(hashMap5);
                                return;
                            }
                        case 5:
                            HashMap hashMap6 = new HashMap();
                            try {
                                cVar = (jrb0.c) ((ArrayList) obj2).get(0);
                            } catch (Error | RuntimeException e6) {
                                hashMap6.put("error", jrb0.a(e6));
                            }
                            if (cVar == null) {
                                throw new NullPointerException("messageArg unexpectedly null.");
                            }
                            ((a) qrb0Var).b(cVar);
                            hashMap6.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                            ce5Var.a(hashMap6);
                            return;
                        case 6:
                            HashMap hashMap7 = new HashMap();
                            try {
                                jrb0.a aVar2 = (jrb0.a) ((ArrayList) obj2).get(0);
                                if (aVar2 == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).d(aVar2, new orb0(hashMap7, ce5Var));
                                return;
                            } catch (Error | RuntimeException e7) {
                                hashMap7.put("error", jrb0.a(e7));
                                ce5Var.a(hashMap7);
                                return;
                            }
                        case 7:
                            HashMap hashMap8 = new HashMap();
                            try {
                                jrb0.h hVar = (jrb0.h) ((ArrayList) obj2).get(0);
                                if (hVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).m(hVar, new prb0(hashMap8, ce5Var));
                                return;
                            } catch (Error | RuntimeException e8) {
                                hashMap8.put("error", jrb0.a(e8));
                                ce5Var.a(hashMap8);
                                return;
                            }
                        case 8:
                            HashMap hashMap9 = new HashMap();
                            try {
                                cVar2 = (jrb0.c) ((ArrayList) obj2).get(0);
                            } catch (Error | RuntimeException e9) {
                                hashMap9.put("error", jrb0.a(e9));
                            }
                            if (cVar2 == null) {
                                throw new NullPointerException("messageArg unexpectedly null.");
                            }
                            ((a) qrb0Var).c(cVar2);
                            hashMap9.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                            ce5Var.a(hashMap9);
                            return;
                        case 9:
                            HashMap hashMap10 = new HashMap();
                            try {
                                hashMap10.put(TarifficatorScenarioActivity.RESULT_KEY, ((a) qrb0Var).l());
                            } catch (Error | RuntimeException e10) {
                                hashMap10.put("error", jrb0.a(e10));
                            }
                            ce5Var.a(hashMap10);
                            return;
                        default:
                            HashMap hashMap11 = new HashMap();
                            try {
                                jrb0.l lVar = (jrb0.l) ((ArrayList) obj2).get(0);
                                if (lVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).o(lVar, new oy80(13, hashMap11, ce5Var));
                                return;
                            } catch (Error | RuntimeException e11) {
                                hashMap11.put("error", jrb0.a(e11));
                                ce5Var.a(hashMap11);
                                return;
                            }
                    }
                }
            });
        } else {
            m2vVar3.G(null);
        }
        m2v m2vVar4 = new m2v(tt5Var, "dev.flutter.pigeon.PdfxApi.closeDocument", rrb0Var, obj);
        if (aVar != null) {
            final int i4 = 5;
            m2vVar4.G(new ee5(aVar) { // from class: krb0
                public final /* synthetic */ qrb0 b;

                {
                    this.b = aVar;
                }

                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    jrb0.k kVar;
                    jrb0.c cVar;
                    jrb0.c cVar2;
                    int i22 = i4;
                    qrb0 qrb0Var = this.b;
                    switch (i22) {
                        case 0:
                            HashMap hashMap = new HashMap();
                            try {
                                jrb0.d dVar = (jrb0.d) ((ArrayList) obj2).get(0);
                                if (dVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).i(dVar, new lrb0(hashMap, ce5Var));
                                return;
                            } catch (Error | RuntimeException e) {
                                hashMap.put("error", jrb0.a(e));
                                ce5Var.a(hashMap);
                                return;
                            }
                        case 1:
                            HashMap hashMap2 = new HashMap();
                            try {
                                jrb0.j jVar = (jrb0.j) ((ArrayList) obj2).get(0);
                                if (jVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                int longValue = (int) jVar.a.longValue();
                                int longValue2 = (int) jVar.b.longValue();
                                int longValue3 = (int) jVar.c.longValue();
                                TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer = (TextureRegistry$SurfaceProducer) ((a) qrb0Var).d.get(longValue);
                                if (textureRegistry$SurfaceProducer != null) {
                                    textureRegistry$SurfaceProducer.setSize(longValue2, longValue3);
                                }
                                hashMap2.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                                ce5Var.a(hashMap2);
                                return;
                            } catch (Error | RuntimeException e2) {
                                hashMap2.put("error", jrb0.a(e2));
                                ce5Var.a(hashMap2);
                                return;
                            }
                        case 2:
                            HashMap hashMap3 = new HashMap();
                            try {
                                kVar = (jrb0.k) ((ArrayList) obj2).get(0);
                            } catch (Error | RuntimeException e3) {
                                hashMap3.put("error", jrb0.a(e3));
                            }
                            if (kVar == null) {
                                throw new NullPointerException("messageArg unexpectedly null.");
                            }
                            ((a) qrb0Var).n(kVar);
                            hashMap3.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                            ce5Var.a(hashMap3);
                            return;
                        case 3:
                            HashMap hashMap4 = new HashMap();
                            try {
                                jrb0.e eVar = (jrb0.e) ((ArrayList) obj2).get(0);
                                if (eVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).j(eVar, new mrb0(hashMap4, ce5Var));
                                return;
                            } catch (Error | RuntimeException e4) {
                                hashMap4.put("error", jrb0.a(e4));
                                ce5Var.a(hashMap4);
                                return;
                            }
                        case 4:
                            HashMap hashMap5 = new HashMap();
                            try {
                                jrb0.e eVar2 = (jrb0.e) ((ArrayList) obj2).get(0);
                                if (eVar2 == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).h(eVar2, new nrb0(hashMap5, ce5Var));
                                return;
                            } catch (Error | RuntimeException e5) {
                                hashMap5.put("error", jrb0.a(e5));
                                ce5Var.a(hashMap5);
                                return;
                            }
                        case 5:
                            HashMap hashMap6 = new HashMap();
                            try {
                                cVar = (jrb0.c) ((ArrayList) obj2).get(0);
                            } catch (Error | RuntimeException e6) {
                                hashMap6.put("error", jrb0.a(e6));
                            }
                            if (cVar == null) {
                                throw new NullPointerException("messageArg unexpectedly null.");
                            }
                            ((a) qrb0Var).b(cVar);
                            hashMap6.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                            ce5Var.a(hashMap6);
                            return;
                        case 6:
                            HashMap hashMap7 = new HashMap();
                            try {
                                jrb0.a aVar2 = (jrb0.a) ((ArrayList) obj2).get(0);
                                if (aVar2 == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).d(aVar2, new orb0(hashMap7, ce5Var));
                                return;
                            } catch (Error | RuntimeException e7) {
                                hashMap7.put("error", jrb0.a(e7));
                                ce5Var.a(hashMap7);
                                return;
                            }
                        case 7:
                            HashMap hashMap8 = new HashMap();
                            try {
                                jrb0.h hVar = (jrb0.h) ((ArrayList) obj2).get(0);
                                if (hVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).m(hVar, new prb0(hashMap8, ce5Var));
                                return;
                            } catch (Error | RuntimeException e8) {
                                hashMap8.put("error", jrb0.a(e8));
                                ce5Var.a(hashMap8);
                                return;
                            }
                        case 8:
                            HashMap hashMap9 = new HashMap();
                            try {
                                cVar2 = (jrb0.c) ((ArrayList) obj2).get(0);
                            } catch (Error | RuntimeException e9) {
                                hashMap9.put("error", jrb0.a(e9));
                            }
                            if (cVar2 == null) {
                                throw new NullPointerException("messageArg unexpectedly null.");
                            }
                            ((a) qrb0Var).c(cVar2);
                            hashMap9.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                            ce5Var.a(hashMap9);
                            return;
                        case 9:
                            HashMap hashMap10 = new HashMap();
                            try {
                                hashMap10.put(TarifficatorScenarioActivity.RESULT_KEY, ((a) qrb0Var).l());
                            } catch (Error | RuntimeException e10) {
                                hashMap10.put("error", jrb0.a(e10));
                            }
                            ce5Var.a(hashMap10);
                            return;
                        default:
                            HashMap hashMap11 = new HashMap();
                            try {
                                jrb0.l lVar = (jrb0.l) ((ArrayList) obj2).get(0);
                                if (lVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).o(lVar, new oy80(13, hashMap11, ce5Var));
                                return;
                            } catch (Error | RuntimeException e11) {
                                hashMap11.put("error", jrb0.a(e11));
                                ce5Var.a(hashMap11);
                                return;
                            }
                    }
                }
            });
        } else {
            m2vVar4.G(null);
        }
        m2v m2vVar5 = new m2v(tt5Var, "dev.flutter.pigeon.PdfxApi.getPage", rrb0Var, obj);
        if (aVar != null) {
            final int i5 = 6;
            m2vVar5.G(new ee5(aVar) { // from class: krb0
                public final /* synthetic */ qrb0 b;

                {
                    this.b = aVar;
                }

                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    jrb0.k kVar;
                    jrb0.c cVar;
                    jrb0.c cVar2;
                    int i22 = i5;
                    qrb0 qrb0Var = this.b;
                    switch (i22) {
                        case 0:
                            HashMap hashMap = new HashMap();
                            try {
                                jrb0.d dVar = (jrb0.d) ((ArrayList) obj2).get(0);
                                if (dVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).i(dVar, new lrb0(hashMap, ce5Var));
                                return;
                            } catch (Error | RuntimeException e) {
                                hashMap.put("error", jrb0.a(e));
                                ce5Var.a(hashMap);
                                return;
                            }
                        case 1:
                            HashMap hashMap2 = new HashMap();
                            try {
                                jrb0.j jVar = (jrb0.j) ((ArrayList) obj2).get(0);
                                if (jVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                int longValue = (int) jVar.a.longValue();
                                int longValue2 = (int) jVar.b.longValue();
                                int longValue3 = (int) jVar.c.longValue();
                                TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer = (TextureRegistry$SurfaceProducer) ((a) qrb0Var).d.get(longValue);
                                if (textureRegistry$SurfaceProducer != null) {
                                    textureRegistry$SurfaceProducer.setSize(longValue2, longValue3);
                                }
                                hashMap2.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                                ce5Var.a(hashMap2);
                                return;
                            } catch (Error | RuntimeException e2) {
                                hashMap2.put("error", jrb0.a(e2));
                                ce5Var.a(hashMap2);
                                return;
                            }
                        case 2:
                            HashMap hashMap3 = new HashMap();
                            try {
                                kVar = (jrb0.k) ((ArrayList) obj2).get(0);
                            } catch (Error | RuntimeException e3) {
                                hashMap3.put("error", jrb0.a(e3));
                            }
                            if (kVar == null) {
                                throw new NullPointerException("messageArg unexpectedly null.");
                            }
                            ((a) qrb0Var).n(kVar);
                            hashMap3.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                            ce5Var.a(hashMap3);
                            return;
                        case 3:
                            HashMap hashMap4 = new HashMap();
                            try {
                                jrb0.e eVar = (jrb0.e) ((ArrayList) obj2).get(0);
                                if (eVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).j(eVar, new mrb0(hashMap4, ce5Var));
                                return;
                            } catch (Error | RuntimeException e4) {
                                hashMap4.put("error", jrb0.a(e4));
                                ce5Var.a(hashMap4);
                                return;
                            }
                        case 4:
                            HashMap hashMap5 = new HashMap();
                            try {
                                jrb0.e eVar2 = (jrb0.e) ((ArrayList) obj2).get(0);
                                if (eVar2 == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).h(eVar2, new nrb0(hashMap5, ce5Var));
                                return;
                            } catch (Error | RuntimeException e5) {
                                hashMap5.put("error", jrb0.a(e5));
                                ce5Var.a(hashMap5);
                                return;
                            }
                        case 5:
                            HashMap hashMap6 = new HashMap();
                            try {
                                cVar = (jrb0.c) ((ArrayList) obj2).get(0);
                            } catch (Error | RuntimeException e6) {
                                hashMap6.put("error", jrb0.a(e6));
                            }
                            if (cVar == null) {
                                throw new NullPointerException("messageArg unexpectedly null.");
                            }
                            ((a) qrb0Var).b(cVar);
                            hashMap6.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                            ce5Var.a(hashMap6);
                            return;
                        case 6:
                            HashMap hashMap7 = new HashMap();
                            try {
                                jrb0.a aVar2 = (jrb0.a) ((ArrayList) obj2).get(0);
                                if (aVar2 == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).d(aVar2, new orb0(hashMap7, ce5Var));
                                return;
                            } catch (Error | RuntimeException e7) {
                                hashMap7.put("error", jrb0.a(e7));
                                ce5Var.a(hashMap7);
                                return;
                            }
                        case 7:
                            HashMap hashMap8 = new HashMap();
                            try {
                                jrb0.h hVar = (jrb0.h) ((ArrayList) obj2).get(0);
                                if (hVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).m(hVar, new prb0(hashMap8, ce5Var));
                                return;
                            } catch (Error | RuntimeException e8) {
                                hashMap8.put("error", jrb0.a(e8));
                                ce5Var.a(hashMap8);
                                return;
                            }
                        case 8:
                            HashMap hashMap9 = new HashMap();
                            try {
                                cVar2 = (jrb0.c) ((ArrayList) obj2).get(0);
                            } catch (Error | RuntimeException e9) {
                                hashMap9.put("error", jrb0.a(e9));
                            }
                            if (cVar2 == null) {
                                throw new NullPointerException("messageArg unexpectedly null.");
                            }
                            ((a) qrb0Var).c(cVar2);
                            hashMap9.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                            ce5Var.a(hashMap9);
                            return;
                        case 9:
                            HashMap hashMap10 = new HashMap();
                            try {
                                hashMap10.put(TarifficatorScenarioActivity.RESULT_KEY, ((a) qrb0Var).l());
                            } catch (Error | RuntimeException e10) {
                                hashMap10.put("error", jrb0.a(e10));
                            }
                            ce5Var.a(hashMap10);
                            return;
                        default:
                            HashMap hashMap11 = new HashMap();
                            try {
                                jrb0.l lVar = (jrb0.l) ((ArrayList) obj2).get(0);
                                if (lVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).o(lVar, new oy80(13, hashMap11, ce5Var));
                                return;
                            } catch (Error | RuntimeException e11) {
                                hashMap11.put("error", jrb0.a(e11));
                                ce5Var.a(hashMap11);
                                return;
                            }
                    }
                }
            });
        } else {
            m2vVar5.G(null);
        }
        m2v m2vVar6 = new m2v(tt5Var, "dev.flutter.pigeon.PdfxApi.renderPage", rrb0Var, obj);
        if (aVar != null) {
            final int i6 = 7;
            m2vVar6.G(new ee5(aVar) { // from class: krb0
                public final /* synthetic */ qrb0 b;

                {
                    this.b = aVar;
                }

                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    jrb0.k kVar;
                    jrb0.c cVar;
                    jrb0.c cVar2;
                    int i22 = i6;
                    qrb0 qrb0Var = this.b;
                    switch (i22) {
                        case 0:
                            HashMap hashMap = new HashMap();
                            try {
                                jrb0.d dVar = (jrb0.d) ((ArrayList) obj2).get(0);
                                if (dVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).i(dVar, new lrb0(hashMap, ce5Var));
                                return;
                            } catch (Error | RuntimeException e) {
                                hashMap.put("error", jrb0.a(e));
                                ce5Var.a(hashMap);
                                return;
                            }
                        case 1:
                            HashMap hashMap2 = new HashMap();
                            try {
                                jrb0.j jVar = (jrb0.j) ((ArrayList) obj2).get(0);
                                if (jVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                int longValue = (int) jVar.a.longValue();
                                int longValue2 = (int) jVar.b.longValue();
                                int longValue3 = (int) jVar.c.longValue();
                                TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer = (TextureRegistry$SurfaceProducer) ((a) qrb0Var).d.get(longValue);
                                if (textureRegistry$SurfaceProducer != null) {
                                    textureRegistry$SurfaceProducer.setSize(longValue2, longValue3);
                                }
                                hashMap2.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                                ce5Var.a(hashMap2);
                                return;
                            } catch (Error | RuntimeException e2) {
                                hashMap2.put("error", jrb0.a(e2));
                                ce5Var.a(hashMap2);
                                return;
                            }
                        case 2:
                            HashMap hashMap3 = new HashMap();
                            try {
                                kVar = (jrb0.k) ((ArrayList) obj2).get(0);
                            } catch (Error | RuntimeException e3) {
                                hashMap3.put("error", jrb0.a(e3));
                            }
                            if (kVar == null) {
                                throw new NullPointerException("messageArg unexpectedly null.");
                            }
                            ((a) qrb0Var).n(kVar);
                            hashMap3.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                            ce5Var.a(hashMap3);
                            return;
                        case 3:
                            HashMap hashMap4 = new HashMap();
                            try {
                                jrb0.e eVar = (jrb0.e) ((ArrayList) obj2).get(0);
                                if (eVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).j(eVar, new mrb0(hashMap4, ce5Var));
                                return;
                            } catch (Error | RuntimeException e4) {
                                hashMap4.put("error", jrb0.a(e4));
                                ce5Var.a(hashMap4);
                                return;
                            }
                        case 4:
                            HashMap hashMap5 = new HashMap();
                            try {
                                jrb0.e eVar2 = (jrb0.e) ((ArrayList) obj2).get(0);
                                if (eVar2 == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).h(eVar2, new nrb0(hashMap5, ce5Var));
                                return;
                            } catch (Error | RuntimeException e5) {
                                hashMap5.put("error", jrb0.a(e5));
                                ce5Var.a(hashMap5);
                                return;
                            }
                        case 5:
                            HashMap hashMap6 = new HashMap();
                            try {
                                cVar = (jrb0.c) ((ArrayList) obj2).get(0);
                            } catch (Error | RuntimeException e6) {
                                hashMap6.put("error", jrb0.a(e6));
                            }
                            if (cVar == null) {
                                throw new NullPointerException("messageArg unexpectedly null.");
                            }
                            ((a) qrb0Var).b(cVar);
                            hashMap6.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                            ce5Var.a(hashMap6);
                            return;
                        case 6:
                            HashMap hashMap7 = new HashMap();
                            try {
                                jrb0.a aVar2 = (jrb0.a) ((ArrayList) obj2).get(0);
                                if (aVar2 == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).d(aVar2, new orb0(hashMap7, ce5Var));
                                return;
                            } catch (Error | RuntimeException e7) {
                                hashMap7.put("error", jrb0.a(e7));
                                ce5Var.a(hashMap7);
                                return;
                            }
                        case 7:
                            HashMap hashMap8 = new HashMap();
                            try {
                                jrb0.h hVar = (jrb0.h) ((ArrayList) obj2).get(0);
                                if (hVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).m(hVar, new prb0(hashMap8, ce5Var));
                                return;
                            } catch (Error | RuntimeException e8) {
                                hashMap8.put("error", jrb0.a(e8));
                                ce5Var.a(hashMap8);
                                return;
                            }
                        case 8:
                            HashMap hashMap9 = new HashMap();
                            try {
                                cVar2 = (jrb0.c) ((ArrayList) obj2).get(0);
                            } catch (Error | RuntimeException e9) {
                                hashMap9.put("error", jrb0.a(e9));
                            }
                            if (cVar2 == null) {
                                throw new NullPointerException("messageArg unexpectedly null.");
                            }
                            ((a) qrb0Var).c(cVar2);
                            hashMap9.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                            ce5Var.a(hashMap9);
                            return;
                        case 9:
                            HashMap hashMap10 = new HashMap();
                            try {
                                hashMap10.put(TarifficatorScenarioActivity.RESULT_KEY, ((a) qrb0Var).l());
                            } catch (Error | RuntimeException e10) {
                                hashMap10.put("error", jrb0.a(e10));
                            }
                            ce5Var.a(hashMap10);
                            return;
                        default:
                            HashMap hashMap11 = new HashMap();
                            try {
                                jrb0.l lVar = (jrb0.l) ((ArrayList) obj2).get(0);
                                if (lVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).o(lVar, new oy80(13, hashMap11, ce5Var));
                                return;
                            } catch (Error | RuntimeException e11) {
                                hashMap11.put("error", jrb0.a(e11));
                                ce5Var.a(hashMap11);
                                return;
                            }
                    }
                }
            });
        } else {
            m2vVar6.G(null);
        }
        m2v m2vVar7 = new m2v(tt5Var, "dev.flutter.pigeon.PdfxApi.closePage", rrb0Var, obj);
        if (aVar != null) {
            final int i7 = 8;
            m2vVar7.G(new ee5(aVar) { // from class: krb0
                public final /* synthetic */ qrb0 b;

                {
                    this.b = aVar;
                }

                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    jrb0.k kVar;
                    jrb0.c cVar;
                    jrb0.c cVar2;
                    int i22 = i7;
                    qrb0 qrb0Var = this.b;
                    switch (i22) {
                        case 0:
                            HashMap hashMap = new HashMap();
                            try {
                                jrb0.d dVar = (jrb0.d) ((ArrayList) obj2).get(0);
                                if (dVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).i(dVar, new lrb0(hashMap, ce5Var));
                                return;
                            } catch (Error | RuntimeException e) {
                                hashMap.put("error", jrb0.a(e));
                                ce5Var.a(hashMap);
                                return;
                            }
                        case 1:
                            HashMap hashMap2 = new HashMap();
                            try {
                                jrb0.j jVar = (jrb0.j) ((ArrayList) obj2).get(0);
                                if (jVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                int longValue = (int) jVar.a.longValue();
                                int longValue2 = (int) jVar.b.longValue();
                                int longValue3 = (int) jVar.c.longValue();
                                TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer = (TextureRegistry$SurfaceProducer) ((a) qrb0Var).d.get(longValue);
                                if (textureRegistry$SurfaceProducer != null) {
                                    textureRegistry$SurfaceProducer.setSize(longValue2, longValue3);
                                }
                                hashMap2.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                                ce5Var.a(hashMap2);
                                return;
                            } catch (Error | RuntimeException e2) {
                                hashMap2.put("error", jrb0.a(e2));
                                ce5Var.a(hashMap2);
                                return;
                            }
                        case 2:
                            HashMap hashMap3 = new HashMap();
                            try {
                                kVar = (jrb0.k) ((ArrayList) obj2).get(0);
                            } catch (Error | RuntimeException e3) {
                                hashMap3.put("error", jrb0.a(e3));
                            }
                            if (kVar == null) {
                                throw new NullPointerException("messageArg unexpectedly null.");
                            }
                            ((a) qrb0Var).n(kVar);
                            hashMap3.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                            ce5Var.a(hashMap3);
                            return;
                        case 3:
                            HashMap hashMap4 = new HashMap();
                            try {
                                jrb0.e eVar = (jrb0.e) ((ArrayList) obj2).get(0);
                                if (eVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).j(eVar, new mrb0(hashMap4, ce5Var));
                                return;
                            } catch (Error | RuntimeException e4) {
                                hashMap4.put("error", jrb0.a(e4));
                                ce5Var.a(hashMap4);
                                return;
                            }
                        case 4:
                            HashMap hashMap5 = new HashMap();
                            try {
                                jrb0.e eVar2 = (jrb0.e) ((ArrayList) obj2).get(0);
                                if (eVar2 == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).h(eVar2, new nrb0(hashMap5, ce5Var));
                                return;
                            } catch (Error | RuntimeException e5) {
                                hashMap5.put("error", jrb0.a(e5));
                                ce5Var.a(hashMap5);
                                return;
                            }
                        case 5:
                            HashMap hashMap6 = new HashMap();
                            try {
                                cVar = (jrb0.c) ((ArrayList) obj2).get(0);
                            } catch (Error | RuntimeException e6) {
                                hashMap6.put("error", jrb0.a(e6));
                            }
                            if (cVar == null) {
                                throw new NullPointerException("messageArg unexpectedly null.");
                            }
                            ((a) qrb0Var).b(cVar);
                            hashMap6.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                            ce5Var.a(hashMap6);
                            return;
                        case 6:
                            HashMap hashMap7 = new HashMap();
                            try {
                                jrb0.a aVar2 = (jrb0.a) ((ArrayList) obj2).get(0);
                                if (aVar2 == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).d(aVar2, new orb0(hashMap7, ce5Var));
                                return;
                            } catch (Error | RuntimeException e7) {
                                hashMap7.put("error", jrb0.a(e7));
                                ce5Var.a(hashMap7);
                                return;
                            }
                        case 7:
                            HashMap hashMap8 = new HashMap();
                            try {
                                jrb0.h hVar = (jrb0.h) ((ArrayList) obj2).get(0);
                                if (hVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).m(hVar, new prb0(hashMap8, ce5Var));
                                return;
                            } catch (Error | RuntimeException e8) {
                                hashMap8.put("error", jrb0.a(e8));
                                ce5Var.a(hashMap8);
                                return;
                            }
                        case 8:
                            HashMap hashMap9 = new HashMap();
                            try {
                                cVar2 = (jrb0.c) ((ArrayList) obj2).get(0);
                            } catch (Error | RuntimeException e9) {
                                hashMap9.put("error", jrb0.a(e9));
                            }
                            if (cVar2 == null) {
                                throw new NullPointerException("messageArg unexpectedly null.");
                            }
                            ((a) qrb0Var).c(cVar2);
                            hashMap9.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                            ce5Var.a(hashMap9);
                            return;
                        case 9:
                            HashMap hashMap10 = new HashMap();
                            try {
                                hashMap10.put(TarifficatorScenarioActivity.RESULT_KEY, ((a) qrb0Var).l());
                            } catch (Error | RuntimeException e10) {
                                hashMap10.put("error", jrb0.a(e10));
                            }
                            ce5Var.a(hashMap10);
                            return;
                        default:
                            HashMap hashMap11 = new HashMap();
                            try {
                                jrb0.l lVar = (jrb0.l) ((ArrayList) obj2).get(0);
                                if (lVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).o(lVar, new oy80(13, hashMap11, ce5Var));
                                return;
                            } catch (Error | RuntimeException e11) {
                                hashMap11.put("error", jrb0.a(e11));
                                ce5Var.a(hashMap11);
                                return;
                            }
                    }
                }
            });
        } else {
            m2vVar7.G(null);
        }
        m2v m2vVar8 = new m2v(tt5Var, "dev.flutter.pigeon.PdfxApi.registerTexture", rrb0Var, obj);
        if (aVar != null) {
            final int i8 = 9;
            m2vVar8.G(new ee5(aVar) { // from class: krb0
                public final /* synthetic */ qrb0 b;

                {
                    this.b = aVar;
                }

                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    jrb0.k kVar;
                    jrb0.c cVar;
                    jrb0.c cVar2;
                    int i22 = i8;
                    qrb0 qrb0Var = this.b;
                    switch (i22) {
                        case 0:
                            HashMap hashMap = new HashMap();
                            try {
                                jrb0.d dVar = (jrb0.d) ((ArrayList) obj2).get(0);
                                if (dVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).i(dVar, new lrb0(hashMap, ce5Var));
                                return;
                            } catch (Error | RuntimeException e) {
                                hashMap.put("error", jrb0.a(e));
                                ce5Var.a(hashMap);
                                return;
                            }
                        case 1:
                            HashMap hashMap2 = new HashMap();
                            try {
                                jrb0.j jVar = (jrb0.j) ((ArrayList) obj2).get(0);
                                if (jVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                int longValue = (int) jVar.a.longValue();
                                int longValue2 = (int) jVar.b.longValue();
                                int longValue3 = (int) jVar.c.longValue();
                                TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer = (TextureRegistry$SurfaceProducer) ((a) qrb0Var).d.get(longValue);
                                if (textureRegistry$SurfaceProducer != null) {
                                    textureRegistry$SurfaceProducer.setSize(longValue2, longValue3);
                                }
                                hashMap2.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                                ce5Var.a(hashMap2);
                                return;
                            } catch (Error | RuntimeException e2) {
                                hashMap2.put("error", jrb0.a(e2));
                                ce5Var.a(hashMap2);
                                return;
                            }
                        case 2:
                            HashMap hashMap3 = new HashMap();
                            try {
                                kVar = (jrb0.k) ((ArrayList) obj2).get(0);
                            } catch (Error | RuntimeException e3) {
                                hashMap3.put("error", jrb0.a(e3));
                            }
                            if (kVar == null) {
                                throw new NullPointerException("messageArg unexpectedly null.");
                            }
                            ((a) qrb0Var).n(kVar);
                            hashMap3.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                            ce5Var.a(hashMap3);
                            return;
                        case 3:
                            HashMap hashMap4 = new HashMap();
                            try {
                                jrb0.e eVar = (jrb0.e) ((ArrayList) obj2).get(0);
                                if (eVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).j(eVar, new mrb0(hashMap4, ce5Var));
                                return;
                            } catch (Error | RuntimeException e4) {
                                hashMap4.put("error", jrb0.a(e4));
                                ce5Var.a(hashMap4);
                                return;
                            }
                        case 4:
                            HashMap hashMap5 = new HashMap();
                            try {
                                jrb0.e eVar2 = (jrb0.e) ((ArrayList) obj2).get(0);
                                if (eVar2 == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).h(eVar2, new nrb0(hashMap5, ce5Var));
                                return;
                            } catch (Error | RuntimeException e5) {
                                hashMap5.put("error", jrb0.a(e5));
                                ce5Var.a(hashMap5);
                                return;
                            }
                        case 5:
                            HashMap hashMap6 = new HashMap();
                            try {
                                cVar = (jrb0.c) ((ArrayList) obj2).get(0);
                            } catch (Error | RuntimeException e6) {
                                hashMap6.put("error", jrb0.a(e6));
                            }
                            if (cVar == null) {
                                throw new NullPointerException("messageArg unexpectedly null.");
                            }
                            ((a) qrb0Var).b(cVar);
                            hashMap6.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                            ce5Var.a(hashMap6);
                            return;
                        case 6:
                            HashMap hashMap7 = new HashMap();
                            try {
                                jrb0.a aVar2 = (jrb0.a) ((ArrayList) obj2).get(0);
                                if (aVar2 == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).d(aVar2, new orb0(hashMap7, ce5Var));
                                return;
                            } catch (Error | RuntimeException e7) {
                                hashMap7.put("error", jrb0.a(e7));
                                ce5Var.a(hashMap7);
                                return;
                            }
                        case 7:
                            HashMap hashMap8 = new HashMap();
                            try {
                                jrb0.h hVar = (jrb0.h) ((ArrayList) obj2).get(0);
                                if (hVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).m(hVar, new prb0(hashMap8, ce5Var));
                                return;
                            } catch (Error | RuntimeException e8) {
                                hashMap8.put("error", jrb0.a(e8));
                                ce5Var.a(hashMap8);
                                return;
                            }
                        case 8:
                            HashMap hashMap9 = new HashMap();
                            try {
                                cVar2 = (jrb0.c) ((ArrayList) obj2).get(0);
                            } catch (Error | RuntimeException e9) {
                                hashMap9.put("error", jrb0.a(e9));
                            }
                            if (cVar2 == null) {
                                throw new NullPointerException("messageArg unexpectedly null.");
                            }
                            ((a) qrb0Var).c(cVar2);
                            hashMap9.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                            ce5Var.a(hashMap9);
                            return;
                        case 9:
                            HashMap hashMap10 = new HashMap();
                            try {
                                hashMap10.put(TarifficatorScenarioActivity.RESULT_KEY, ((a) qrb0Var).l());
                            } catch (Error | RuntimeException e10) {
                                hashMap10.put("error", jrb0.a(e10));
                            }
                            ce5Var.a(hashMap10);
                            return;
                        default:
                            HashMap hashMap11 = new HashMap();
                            try {
                                jrb0.l lVar = (jrb0.l) ((ArrayList) obj2).get(0);
                                if (lVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).o(lVar, new oy80(13, hashMap11, ce5Var));
                                return;
                            } catch (Error | RuntimeException e11) {
                                hashMap11.put("error", jrb0.a(e11));
                                ce5Var.a(hashMap11);
                                return;
                            }
                    }
                }
            });
        } else {
            m2vVar8.G(null);
        }
        m2v m2vVar9 = new m2v(tt5Var, "dev.flutter.pigeon.PdfxApi.updateTexture", rrb0Var, obj);
        if (aVar != null) {
            final int i9 = 10;
            m2vVar9.G(new ee5(aVar) { // from class: krb0
                public final /* synthetic */ qrb0 b;

                {
                    this.b = aVar;
                }

                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    jrb0.k kVar;
                    jrb0.c cVar;
                    jrb0.c cVar2;
                    int i22 = i9;
                    qrb0 qrb0Var = this.b;
                    switch (i22) {
                        case 0:
                            HashMap hashMap = new HashMap();
                            try {
                                jrb0.d dVar = (jrb0.d) ((ArrayList) obj2).get(0);
                                if (dVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).i(dVar, new lrb0(hashMap, ce5Var));
                                return;
                            } catch (Error | RuntimeException e) {
                                hashMap.put("error", jrb0.a(e));
                                ce5Var.a(hashMap);
                                return;
                            }
                        case 1:
                            HashMap hashMap2 = new HashMap();
                            try {
                                jrb0.j jVar = (jrb0.j) ((ArrayList) obj2).get(0);
                                if (jVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                int longValue = (int) jVar.a.longValue();
                                int longValue2 = (int) jVar.b.longValue();
                                int longValue3 = (int) jVar.c.longValue();
                                TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer = (TextureRegistry$SurfaceProducer) ((a) qrb0Var).d.get(longValue);
                                if (textureRegistry$SurfaceProducer != null) {
                                    textureRegistry$SurfaceProducer.setSize(longValue2, longValue3);
                                }
                                hashMap2.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                                ce5Var.a(hashMap2);
                                return;
                            } catch (Error | RuntimeException e2) {
                                hashMap2.put("error", jrb0.a(e2));
                                ce5Var.a(hashMap2);
                                return;
                            }
                        case 2:
                            HashMap hashMap3 = new HashMap();
                            try {
                                kVar = (jrb0.k) ((ArrayList) obj2).get(0);
                            } catch (Error | RuntimeException e3) {
                                hashMap3.put("error", jrb0.a(e3));
                            }
                            if (kVar == null) {
                                throw new NullPointerException("messageArg unexpectedly null.");
                            }
                            ((a) qrb0Var).n(kVar);
                            hashMap3.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                            ce5Var.a(hashMap3);
                            return;
                        case 3:
                            HashMap hashMap4 = new HashMap();
                            try {
                                jrb0.e eVar = (jrb0.e) ((ArrayList) obj2).get(0);
                                if (eVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).j(eVar, new mrb0(hashMap4, ce5Var));
                                return;
                            } catch (Error | RuntimeException e4) {
                                hashMap4.put("error", jrb0.a(e4));
                                ce5Var.a(hashMap4);
                                return;
                            }
                        case 4:
                            HashMap hashMap5 = new HashMap();
                            try {
                                jrb0.e eVar2 = (jrb0.e) ((ArrayList) obj2).get(0);
                                if (eVar2 == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).h(eVar2, new nrb0(hashMap5, ce5Var));
                                return;
                            } catch (Error | RuntimeException e5) {
                                hashMap5.put("error", jrb0.a(e5));
                                ce5Var.a(hashMap5);
                                return;
                            }
                        case 5:
                            HashMap hashMap6 = new HashMap();
                            try {
                                cVar = (jrb0.c) ((ArrayList) obj2).get(0);
                            } catch (Error | RuntimeException e6) {
                                hashMap6.put("error", jrb0.a(e6));
                            }
                            if (cVar == null) {
                                throw new NullPointerException("messageArg unexpectedly null.");
                            }
                            ((a) qrb0Var).b(cVar);
                            hashMap6.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                            ce5Var.a(hashMap6);
                            return;
                        case 6:
                            HashMap hashMap7 = new HashMap();
                            try {
                                jrb0.a aVar2 = (jrb0.a) ((ArrayList) obj2).get(0);
                                if (aVar2 == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).d(aVar2, new orb0(hashMap7, ce5Var));
                                return;
                            } catch (Error | RuntimeException e7) {
                                hashMap7.put("error", jrb0.a(e7));
                                ce5Var.a(hashMap7);
                                return;
                            }
                        case 7:
                            HashMap hashMap8 = new HashMap();
                            try {
                                jrb0.h hVar = (jrb0.h) ((ArrayList) obj2).get(0);
                                if (hVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).m(hVar, new prb0(hashMap8, ce5Var));
                                return;
                            } catch (Error | RuntimeException e8) {
                                hashMap8.put("error", jrb0.a(e8));
                                ce5Var.a(hashMap8);
                                return;
                            }
                        case 8:
                            HashMap hashMap9 = new HashMap();
                            try {
                                cVar2 = (jrb0.c) ((ArrayList) obj2).get(0);
                            } catch (Error | RuntimeException e9) {
                                hashMap9.put("error", jrb0.a(e9));
                            }
                            if (cVar2 == null) {
                                throw new NullPointerException("messageArg unexpectedly null.");
                            }
                            ((a) qrb0Var).c(cVar2);
                            hashMap9.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                            ce5Var.a(hashMap9);
                            return;
                        case 9:
                            HashMap hashMap10 = new HashMap();
                            try {
                                hashMap10.put(TarifficatorScenarioActivity.RESULT_KEY, ((a) qrb0Var).l());
                            } catch (Error | RuntimeException e10) {
                                hashMap10.put("error", jrb0.a(e10));
                            }
                            ce5Var.a(hashMap10);
                            return;
                        default:
                            HashMap hashMap11 = new HashMap();
                            try {
                                jrb0.l lVar = (jrb0.l) ((ArrayList) obj2).get(0);
                                if (lVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).o(lVar, new oy80(13, hashMap11, ce5Var));
                                return;
                            } catch (Error | RuntimeException e11) {
                                hashMap11.put("error", jrb0.a(e11));
                                ce5Var.a(hashMap11);
                                return;
                            }
                    }
                }
            });
        } else {
            m2vVar9.G(null);
        }
        m2v m2vVar10 = new m2v(tt5Var, "dev.flutter.pigeon.PdfxApi.resizeTexture", rrb0Var, obj);
        if (aVar != null) {
            final int i10 = 1;
            m2vVar10.G(new ee5(aVar) { // from class: krb0
                public final /* synthetic */ qrb0 b;

                {
                    this.b = aVar;
                }

                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    jrb0.k kVar;
                    jrb0.c cVar;
                    jrb0.c cVar2;
                    int i22 = i10;
                    qrb0 qrb0Var = this.b;
                    switch (i22) {
                        case 0:
                            HashMap hashMap = new HashMap();
                            try {
                                jrb0.d dVar = (jrb0.d) ((ArrayList) obj2).get(0);
                                if (dVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).i(dVar, new lrb0(hashMap, ce5Var));
                                return;
                            } catch (Error | RuntimeException e) {
                                hashMap.put("error", jrb0.a(e));
                                ce5Var.a(hashMap);
                                return;
                            }
                        case 1:
                            HashMap hashMap2 = new HashMap();
                            try {
                                jrb0.j jVar = (jrb0.j) ((ArrayList) obj2).get(0);
                                if (jVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                int longValue = (int) jVar.a.longValue();
                                int longValue2 = (int) jVar.b.longValue();
                                int longValue3 = (int) jVar.c.longValue();
                                TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer = (TextureRegistry$SurfaceProducer) ((a) qrb0Var).d.get(longValue);
                                if (textureRegistry$SurfaceProducer != null) {
                                    textureRegistry$SurfaceProducer.setSize(longValue2, longValue3);
                                }
                                hashMap2.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                                ce5Var.a(hashMap2);
                                return;
                            } catch (Error | RuntimeException e2) {
                                hashMap2.put("error", jrb0.a(e2));
                                ce5Var.a(hashMap2);
                                return;
                            }
                        case 2:
                            HashMap hashMap3 = new HashMap();
                            try {
                                kVar = (jrb0.k) ((ArrayList) obj2).get(0);
                            } catch (Error | RuntimeException e3) {
                                hashMap3.put("error", jrb0.a(e3));
                            }
                            if (kVar == null) {
                                throw new NullPointerException("messageArg unexpectedly null.");
                            }
                            ((a) qrb0Var).n(kVar);
                            hashMap3.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                            ce5Var.a(hashMap3);
                            return;
                        case 3:
                            HashMap hashMap4 = new HashMap();
                            try {
                                jrb0.e eVar = (jrb0.e) ((ArrayList) obj2).get(0);
                                if (eVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).j(eVar, new mrb0(hashMap4, ce5Var));
                                return;
                            } catch (Error | RuntimeException e4) {
                                hashMap4.put("error", jrb0.a(e4));
                                ce5Var.a(hashMap4);
                                return;
                            }
                        case 4:
                            HashMap hashMap5 = new HashMap();
                            try {
                                jrb0.e eVar2 = (jrb0.e) ((ArrayList) obj2).get(0);
                                if (eVar2 == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).h(eVar2, new nrb0(hashMap5, ce5Var));
                                return;
                            } catch (Error | RuntimeException e5) {
                                hashMap5.put("error", jrb0.a(e5));
                                ce5Var.a(hashMap5);
                                return;
                            }
                        case 5:
                            HashMap hashMap6 = new HashMap();
                            try {
                                cVar = (jrb0.c) ((ArrayList) obj2).get(0);
                            } catch (Error | RuntimeException e6) {
                                hashMap6.put("error", jrb0.a(e6));
                            }
                            if (cVar == null) {
                                throw new NullPointerException("messageArg unexpectedly null.");
                            }
                            ((a) qrb0Var).b(cVar);
                            hashMap6.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                            ce5Var.a(hashMap6);
                            return;
                        case 6:
                            HashMap hashMap7 = new HashMap();
                            try {
                                jrb0.a aVar2 = (jrb0.a) ((ArrayList) obj2).get(0);
                                if (aVar2 == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).d(aVar2, new orb0(hashMap7, ce5Var));
                                return;
                            } catch (Error | RuntimeException e7) {
                                hashMap7.put("error", jrb0.a(e7));
                                ce5Var.a(hashMap7);
                                return;
                            }
                        case 7:
                            HashMap hashMap8 = new HashMap();
                            try {
                                jrb0.h hVar = (jrb0.h) ((ArrayList) obj2).get(0);
                                if (hVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).m(hVar, new prb0(hashMap8, ce5Var));
                                return;
                            } catch (Error | RuntimeException e8) {
                                hashMap8.put("error", jrb0.a(e8));
                                ce5Var.a(hashMap8);
                                return;
                            }
                        case 8:
                            HashMap hashMap9 = new HashMap();
                            try {
                                cVar2 = (jrb0.c) ((ArrayList) obj2).get(0);
                            } catch (Error | RuntimeException e9) {
                                hashMap9.put("error", jrb0.a(e9));
                            }
                            if (cVar2 == null) {
                                throw new NullPointerException("messageArg unexpectedly null.");
                            }
                            ((a) qrb0Var).c(cVar2);
                            hashMap9.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                            ce5Var.a(hashMap9);
                            return;
                        case 9:
                            HashMap hashMap10 = new HashMap();
                            try {
                                hashMap10.put(TarifficatorScenarioActivity.RESULT_KEY, ((a) qrb0Var).l());
                            } catch (Error | RuntimeException e10) {
                                hashMap10.put("error", jrb0.a(e10));
                            }
                            ce5Var.a(hashMap10);
                            return;
                        default:
                            HashMap hashMap11 = new HashMap();
                            try {
                                jrb0.l lVar = (jrb0.l) ((ArrayList) obj2).get(0);
                                if (lVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).o(lVar, new oy80(13, hashMap11, ce5Var));
                                return;
                            } catch (Error | RuntimeException e11) {
                                hashMap11.put("error", jrb0.a(e11));
                                ce5Var.a(hashMap11);
                                return;
                            }
                    }
                }
            });
        } else {
            m2vVar10.G(null);
        }
        m2v m2vVar11 = new m2v(tt5Var, "dev.flutter.pigeon.PdfxApi.unregisterTexture", rrb0Var, obj);
        if (aVar == null) {
            m2vVar11.G(null);
        } else {
            final int i11 = 2;
            m2vVar11.G(new ee5(aVar) { // from class: krb0
                public final /* synthetic */ qrb0 b;

                {
                    this.b = aVar;
                }

                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    jrb0.k kVar;
                    jrb0.c cVar;
                    jrb0.c cVar2;
                    int i22 = i11;
                    qrb0 qrb0Var = this.b;
                    switch (i22) {
                        case 0:
                            HashMap hashMap = new HashMap();
                            try {
                                jrb0.d dVar = (jrb0.d) ((ArrayList) obj2).get(0);
                                if (dVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).i(dVar, new lrb0(hashMap, ce5Var));
                                return;
                            } catch (Error | RuntimeException e) {
                                hashMap.put("error", jrb0.a(e));
                                ce5Var.a(hashMap);
                                return;
                            }
                        case 1:
                            HashMap hashMap2 = new HashMap();
                            try {
                                jrb0.j jVar = (jrb0.j) ((ArrayList) obj2).get(0);
                                if (jVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                int longValue = (int) jVar.a.longValue();
                                int longValue2 = (int) jVar.b.longValue();
                                int longValue3 = (int) jVar.c.longValue();
                                TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer = (TextureRegistry$SurfaceProducer) ((a) qrb0Var).d.get(longValue);
                                if (textureRegistry$SurfaceProducer != null) {
                                    textureRegistry$SurfaceProducer.setSize(longValue2, longValue3);
                                }
                                hashMap2.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                                ce5Var.a(hashMap2);
                                return;
                            } catch (Error | RuntimeException e2) {
                                hashMap2.put("error", jrb0.a(e2));
                                ce5Var.a(hashMap2);
                                return;
                            }
                        case 2:
                            HashMap hashMap3 = new HashMap();
                            try {
                                kVar = (jrb0.k) ((ArrayList) obj2).get(0);
                            } catch (Error | RuntimeException e3) {
                                hashMap3.put("error", jrb0.a(e3));
                            }
                            if (kVar == null) {
                                throw new NullPointerException("messageArg unexpectedly null.");
                            }
                            ((a) qrb0Var).n(kVar);
                            hashMap3.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                            ce5Var.a(hashMap3);
                            return;
                        case 3:
                            HashMap hashMap4 = new HashMap();
                            try {
                                jrb0.e eVar = (jrb0.e) ((ArrayList) obj2).get(0);
                                if (eVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).j(eVar, new mrb0(hashMap4, ce5Var));
                                return;
                            } catch (Error | RuntimeException e4) {
                                hashMap4.put("error", jrb0.a(e4));
                                ce5Var.a(hashMap4);
                                return;
                            }
                        case 4:
                            HashMap hashMap5 = new HashMap();
                            try {
                                jrb0.e eVar2 = (jrb0.e) ((ArrayList) obj2).get(0);
                                if (eVar2 == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).h(eVar2, new nrb0(hashMap5, ce5Var));
                                return;
                            } catch (Error | RuntimeException e5) {
                                hashMap5.put("error", jrb0.a(e5));
                                ce5Var.a(hashMap5);
                                return;
                            }
                        case 5:
                            HashMap hashMap6 = new HashMap();
                            try {
                                cVar = (jrb0.c) ((ArrayList) obj2).get(0);
                            } catch (Error | RuntimeException e6) {
                                hashMap6.put("error", jrb0.a(e6));
                            }
                            if (cVar == null) {
                                throw new NullPointerException("messageArg unexpectedly null.");
                            }
                            ((a) qrb0Var).b(cVar);
                            hashMap6.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                            ce5Var.a(hashMap6);
                            return;
                        case 6:
                            HashMap hashMap7 = new HashMap();
                            try {
                                jrb0.a aVar2 = (jrb0.a) ((ArrayList) obj2).get(0);
                                if (aVar2 == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).d(aVar2, new orb0(hashMap7, ce5Var));
                                return;
                            } catch (Error | RuntimeException e7) {
                                hashMap7.put("error", jrb0.a(e7));
                                ce5Var.a(hashMap7);
                                return;
                            }
                        case 7:
                            HashMap hashMap8 = new HashMap();
                            try {
                                jrb0.h hVar = (jrb0.h) ((ArrayList) obj2).get(0);
                                if (hVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).m(hVar, new prb0(hashMap8, ce5Var));
                                return;
                            } catch (Error | RuntimeException e8) {
                                hashMap8.put("error", jrb0.a(e8));
                                ce5Var.a(hashMap8);
                                return;
                            }
                        case 8:
                            HashMap hashMap9 = new HashMap();
                            try {
                                cVar2 = (jrb0.c) ((ArrayList) obj2).get(0);
                            } catch (Error | RuntimeException e9) {
                                hashMap9.put("error", jrb0.a(e9));
                            }
                            if (cVar2 == null) {
                                throw new NullPointerException("messageArg unexpectedly null.");
                            }
                            ((a) qrb0Var).c(cVar2);
                            hashMap9.put(TarifficatorScenarioActivity.RESULT_KEY, null);
                            ce5Var.a(hashMap9);
                            return;
                        case 9:
                            HashMap hashMap10 = new HashMap();
                            try {
                                hashMap10.put(TarifficatorScenarioActivity.RESULT_KEY, ((a) qrb0Var).l());
                            } catch (Error | RuntimeException e10) {
                                hashMap10.put("error", jrb0.a(e10));
                            }
                            ce5Var.a(hashMap10);
                            return;
                        default:
                            HashMap hashMap11 = new HashMap();
                            try {
                                jrb0.l lVar = (jrb0.l) ((ArrayList) obj2).get(0);
                                if (lVar == null) {
                                    throw new NullPointerException("messageArg unexpectedly null.");
                                }
                                ((a) qrb0Var).o(lVar, new oy80(13, hashMap11, ce5Var));
                                return;
                            } catch (Error | RuntimeException e11) {
                                hashMap11.put("error", jrb0.a(e11));
                                ce5Var.a(hashMap11);
                                return;
                            }
                    }
                }
            });
        }
    }
}
