package io.flutter.plugins.pathprovider;

import android.content.Context;
import defpackage.ee5;
import defpackage.m2v;
import defpackage.o501;
import defpackage.st5;
import defpackage.tt5;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.flutter.plugins.pathprovider.Messages;
import io.flutter.plugins.pathprovider.a;
import io.flutter.plugins.pathprovider.d;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public interface a {
    static void a(tt5 tt5Var, final d dVar) {
        tt5Var.getClass();
        o501 d = tt5Var.d(new st5());
        String concat = "dev.flutter.pigeon.path_provider_android.PathProviderApi.getTemporaryPath".concat("");
        b bVar = b.d;
        m2v m2vVar = new m2v(tt5Var, concat, bVar, d);
        if (dVar != null) {
            final int i = 0;
            m2vVar.G(new ee5(dVar) { // from class: nx10
                public final /* synthetic */ a b;

                {
                    this.b = dVar;
                }

                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    int i2 = i;
                    a aVar = this.b;
                    switch (i2) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, ((d) aVar).a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = Messages.a(th);
                            }
                            ce5Var.a(arrayList);
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = ((d) aVar).a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = Messages.a(th2);
                            }
                            ce5Var.a(arrayList2);
                            break;
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = ((d) aVar).a;
                                File dir = context2.getDir(PluginErrorDetails.Platform.FLUTTER, 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = Messages.a(th3);
                            }
                            ce5Var.a(arrayList3);
                            break;
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, ((d) aVar).a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = Messages.a(th4);
                            }
                            ce5Var.a(arrayList4);
                            break;
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = ((d) aVar).a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = Messages.a(th5);
                            }
                            ce5Var.a(arrayList5);
                            break;
                        case 5:
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                d dVar2 = (d) aVar;
                                dVar2.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar2.a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = Messages.a(th6);
                            }
                            ce5Var.a(arrayList6);
                            break;
                        default:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, ((d) aVar).b((Messages.StorageDirectory) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = Messages.a(th7);
                            }
                            ce5Var.a(arrayList8);
                            break;
                    }
                }
            });
        } else {
            m2vVar.G(null);
        }
        m2v m2vVar2 = new m2v(tt5Var, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationSupportPath".concat(""), bVar, d);
        if (dVar != null) {
            final int i2 = 1;
            m2vVar2.G(new ee5(dVar) { // from class: nx10
                public final /* synthetic */ a b;

                {
                    this.b = dVar;
                }

                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    int i22 = i2;
                    a aVar = this.b;
                    switch (i22) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, ((d) aVar).a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = Messages.a(th);
                            }
                            ce5Var.a(arrayList);
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = ((d) aVar).a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = Messages.a(th2);
                            }
                            ce5Var.a(arrayList2);
                            break;
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = ((d) aVar).a;
                                File dir = context2.getDir(PluginErrorDetails.Platform.FLUTTER, 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = Messages.a(th3);
                            }
                            ce5Var.a(arrayList3);
                            break;
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, ((d) aVar).a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = Messages.a(th4);
                            }
                            ce5Var.a(arrayList4);
                            break;
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = ((d) aVar).a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = Messages.a(th5);
                            }
                            ce5Var.a(arrayList5);
                            break;
                        case 5:
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                d dVar2 = (d) aVar;
                                dVar2.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar2.a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = Messages.a(th6);
                            }
                            ce5Var.a(arrayList6);
                            break;
                        default:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, ((d) aVar).b((Messages.StorageDirectory) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = Messages.a(th7);
                            }
                            ce5Var.a(arrayList8);
                            break;
                    }
                }
            });
        } else {
            m2vVar2.G(null);
        }
        m2v m2vVar3 = new m2v(tt5Var, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationDocumentsPath".concat(""), bVar, d);
        if (dVar != null) {
            final int i3 = 2;
            m2vVar3.G(new ee5(dVar) { // from class: nx10
                public final /* synthetic */ a b;

                {
                    this.b = dVar;
                }

                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    int i22 = i3;
                    a aVar = this.b;
                    switch (i22) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, ((d) aVar).a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = Messages.a(th);
                            }
                            ce5Var.a(arrayList);
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = ((d) aVar).a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = Messages.a(th2);
                            }
                            ce5Var.a(arrayList2);
                            break;
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = ((d) aVar).a;
                                File dir = context2.getDir(PluginErrorDetails.Platform.FLUTTER, 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = Messages.a(th3);
                            }
                            ce5Var.a(arrayList3);
                            break;
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, ((d) aVar).a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = Messages.a(th4);
                            }
                            ce5Var.a(arrayList4);
                            break;
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = ((d) aVar).a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = Messages.a(th5);
                            }
                            ce5Var.a(arrayList5);
                            break;
                        case 5:
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                d dVar2 = (d) aVar;
                                dVar2.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar2.a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = Messages.a(th6);
                            }
                            ce5Var.a(arrayList6);
                            break;
                        default:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, ((d) aVar).b((Messages.StorageDirectory) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = Messages.a(th7);
                            }
                            ce5Var.a(arrayList8);
                            break;
                    }
                }
            });
        } else {
            m2vVar3.G(null);
        }
        m2v m2vVar4 = new m2v(tt5Var, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationCachePath".concat(""), bVar, d);
        if (dVar != null) {
            final int i4 = 3;
            m2vVar4.G(new ee5(dVar) { // from class: nx10
                public final /* synthetic */ a b;

                {
                    this.b = dVar;
                }

                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    int i22 = i4;
                    a aVar = this.b;
                    switch (i22) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, ((d) aVar).a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = Messages.a(th);
                            }
                            ce5Var.a(arrayList);
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = ((d) aVar).a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = Messages.a(th2);
                            }
                            ce5Var.a(arrayList2);
                            break;
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = ((d) aVar).a;
                                File dir = context2.getDir(PluginErrorDetails.Platform.FLUTTER, 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = Messages.a(th3);
                            }
                            ce5Var.a(arrayList3);
                            break;
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, ((d) aVar).a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = Messages.a(th4);
                            }
                            ce5Var.a(arrayList4);
                            break;
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = ((d) aVar).a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = Messages.a(th5);
                            }
                            ce5Var.a(arrayList5);
                            break;
                        case 5:
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                d dVar2 = (d) aVar;
                                dVar2.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar2.a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = Messages.a(th6);
                            }
                            ce5Var.a(arrayList6);
                            break;
                        default:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, ((d) aVar).b((Messages.StorageDirectory) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = Messages.a(th7);
                            }
                            ce5Var.a(arrayList8);
                            break;
                    }
                }
            });
        } else {
            m2vVar4.G(null);
        }
        m2v m2vVar5 = new m2v(tt5Var, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePath".concat(""), bVar, d);
        if (dVar != null) {
            final int i5 = 4;
            m2vVar5.G(new ee5(dVar) { // from class: nx10
                public final /* synthetic */ a b;

                {
                    this.b = dVar;
                }

                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    int i22 = i5;
                    a aVar = this.b;
                    switch (i22) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, ((d) aVar).a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = Messages.a(th);
                            }
                            ce5Var.a(arrayList);
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = ((d) aVar).a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = Messages.a(th2);
                            }
                            ce5Var.a(arrayList2);
                            break;
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = ((d) aVar).a;
                                File dir = context2.getDir(PluginErrorDetails.Platform.FLUTTER, 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = Messages.a(th3);
                            }
                            ce5Var.a(arrayList3);
                            break;
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, ((d) aVar).a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = Messages.a(th4);
                            }
                            ce5Var.a(arrayList4);
                            break;
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = ((d) aVar).a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = Messages.a(th5);
                            }
                            ce5Var.a(arrayList5);
                            break;
                        case 5:
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                d dVar2 = (d) aVar;
                                dVar2.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar2.a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = Messages.a(th6);
                            }
                            ce5Var.a(arrayList6);
                            break;
                        default:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, ((d) aVar).b((Messages.StorageDirectory) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = Messages.a(th7);
                            }
                            ce5Var.a(arrayList8);
                            break;
                    }
                }
            });
        } else {
            m2vVar5.G(null);
        }
        m2v m2vVar6 = new m2v(tt5Var, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalCachePaths".concat(""), bVar, d);
        if (dVar != null) {
            final int i6 = 5;
            m2vVar6.G(new ee5(dVar) { // from class: nx10
                public final /* synthetic */ a b;

                {
                    this.b = dVar;
                }

                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    int i22 = i6;
                    a aVar = this.b;
                    switch (i22) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, ((d) aVar).a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = Messages.a(th);
                            }
                            ce5Var.a(arrayList);
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = ((d) aVar).a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = Messages.a(th2);
                            }
                            ce5Var.a(arrayList2);
                            break;
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = ((d) aVar).a;
                                File dir = context2.getDir(PluginErrorDetails.Platform.FLUTTER, 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = Messages.a(th3);
                            }
                            ce5Var.a(arrayList3);
                            break;
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, ((d) aVar).a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = Messages.a(th4);
                            }
                            ce5Var.a(arrayList4);
                            break;
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = ((d) aVar).a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = Messages.a(th5);
                            }
                            ce5Var.a(arrayList5);
                            break;
                        case 5:
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                d dVar2 = (d) aVar;
                                dVar2.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar2.a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = Messages.a(th6);
                            }
                            ce5Var.a(arrayList6);
                            break;
                        default:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, ((d) aVar).b((Messages.StorageDirectory) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = Messages.a(th7);
                            }
                            ce5Var.a(arrayList8);
                            break;
                    }
                }
            });
        } else {
            m2vVar6.G(null);
        }
        m2v m2vVar7 = new m2v(tt5Var, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePaths".concat(""), bVar, d);
        if (dVar == null) {
            m2vVar7.G(null);
        } else {
            final int i7 = 6;
            m2vVar7.G(new ee5(dVar) { // from class: nx10
                public final /* synthetic */ a b;

                {
                    this.b = dVar;
                }

                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    int i22 = i7;
                    a aVar = this.b;
                    switch (i22) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, ((d) aVar).a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = Messages.a(th);
                            }
                            ce5Var.a(arrayList);
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = ((d) aVar).a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = Messages.a(th2);
                            }
                            ce5Var.a(arrayList2);
                            break;
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = ((d) aVar).a;
                                File dir = context2.getDir(PluginErrorDetails.Platform.FLUTTER, 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = Messages.a(th3);
                            }
                            ce5Var.a(arrayList3);
                            break;
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, ((d) aVar).a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = Messages.a(th4);
                            }
                            ce5Var.a(arrayList4);
                            break;
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = ((d) aVar).a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = Messages.a(th5);
                            }
                            ce5Var.a(arrayList5);
                            break;
                        case 5:
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                d dVar2 = (d) aVar;
                                dVar2.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar2.a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = Messages.a(th6);
                            }
                            ce5Var.a(arrayList6);
                            break;
                        default:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, ((d) aVar).b((Messages.StorageDirectory) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = Messages.a(th7);
                            }
                            ce5Var.a(arrayList8);
                            break;
                    }
                }
            });
        }
    }
}
