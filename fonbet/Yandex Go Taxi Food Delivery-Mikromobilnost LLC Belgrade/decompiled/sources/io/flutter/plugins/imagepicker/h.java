package io.flutter.plugins.imagepicker;

import android.app.Activity;
import android.content.Intent;
import androidx.core.app.b;
import defpackage.ee5;
import defpackage.m2v;
import defpackage.o501;
import defpackage.st5;
import defpackage.tt5;
import defpackage.zlb0;
import io.flutter.plugins.imagepicker.ImagePickerDelegate$CameraDevice;
import io.flutter.plugins.imagepicker.ImagePickerPlugin;
import io.flutter.plugins.imagepicker.Messages;
import io.flutter.plugins.imagepicker.c;
import io.flutter.plugins.imagepicker.d;
import io.flutter.plugins.imagepicker.e;
import io.flutter.plugins.imagepicker.h;
import io.flutter.plugins.imagepicker.j;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public interface h {
    static void a(tt5 tt5Var, final ImagePickerPlugin imagePickerPlugin) {
        tt5Var.getClass();
        o501 d = tt5Var.d(new st5());
        String concat = "dev.flutter.pigeon.image_picker_android.ImagePickerApi.pickImages".concat("");
        i iVar = i.d;
        m2v m2vVar = new m2v(tt5Var, concat, iVar, d);
        Object obj = null;
        if (imagePickerPlugin != null) {
            final int i = 0;
            m2vVar.G(new ee5(imagePickerPlugin) { // from class: jx10
                public final /* synthetic */ h b;

                {
                    this.b = imagePickerPlugin;
                }

                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    Intent intent;
                    Intent intent2;
                    Intent intent3;
                    Intent intent4;
                    Intent intent5;
                    int i2 = i;
                    h hVar = this.b;
                    switch (i2) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj2;
                            j jVar = (j) arrayList2.get(0);
                            lx10 lx10Var = (lx10) arrayList2.get(1);
                            ix10 ix10Var = (ix10) arrayList2.get(2);
                            kx10 kx10Var = new kx10(arrayList, ce5Var, 0);
                            e eVar = ((ImagePickerPlugin) hVar).b;
                            c cVar = (eVar == null || eVar.b == null) ? null : eVar.c;
                            if (cVar != null) {
                                Activity activity = cVar.b;
                                Messages.SourceCamera sourceCamera = jVar.b;
                                if (sourceCamera != null) {
                                    cVar.B = d.a[sourceCamera.ordinal()] != 1 ? ImagePickerDelegate$CameraDevice.REAR : ImagePickerDelegate$CameraDevice.FRONT;
                                }
                                boolean booleanValue = ix10Var.a.booleanValue();
                                d50 d50Var = d50.a;
                                if (!booleanValue) {
                                    int i3 = d.b[jVar.a.ordinal()];
                                    if (i3 == 1) {
                                        boolean booleanValue2 = ix10Var.b.booleanValue();
                                        if (!cVar.k(lx10Var, null, kx10Var)) {
                                            c.a(kx10Var);
                                            break;
                                        } else {
                                            if (booleanValue2) {
                                                g50 g50Var = new g50();
                                                zlb0.a aVar = new zlb0.a();
                                                aVar.a = d50Var;
                                                intent = g50Var.a(activity, aVar.a());
                                            } else {
                                                intent = new Intent("android.intent.action.GET_CONTENT");
                                                intent.setType("image/*");
                                            }
                                            activity.startActivityForResult(intent, 2342);
                                            break;
                                        }
                                    } else if (i3 == 2) {
                                        ol3 ol3Var = cVar.x;
                                        if (!cVar.k(lx10Var, null, kx10Var)) {
                                            c.a(kx10Var);
                                            break;
                                        } else if (cVar.j() && qke.h(ol3Var.a, "android.permission.CAMERA") != 0) {
                                            b.J(ol3Var.a, new String[]{"android.permission.CAMERA"}, 2345);
                                            break;
                                        } else {
                                            cVar.h();
                                            break;
                                        }
                                    }
                                } else {
                                    int b = a5b1.b(ix10Var);
                                    boolean booleanValue3 = ix10Var.b.booleanValue();
                                    if (!cVar.k(lx10Var, null, kx10Var)) {
                                        c.a(kx10Var);
                                        break;
                                    } else {
                                        if (booleanValue3) {
                                            b50 b50Var = new b50(b);
                                            zlb0.a aVar2 = new zlb0.a();
                                            aVar2.a = d50Var;
                                            intent2 = b50Var.a(activity, aVar2.a());
                                        } else {
                                            intent2 = new Intent("android.intent.action.GET_CONTENT");
                                            intent2.setType("image/*");
                                            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                        }
                                        activity.startActivityForResult(intent2, 2346);
                                        break;
                                    }
                                }
                            } else {
                                kx10Var.g(new Messages.FlutterError("no_activity", "image_picker plugin requires a foreground activity."));
                                break;
                            }
                            break;
                        case 1:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            j jVar2 = (j) arrayList4.get(0);
                            Messages.a aVar3 = (Messages.a) arrayList4.get(1);
                            ix10 ix10Var2 = (ix10) arrayList4.get(2);
                            ht10 ht10Var = new ht10(arrayList3, ce5Var, false, 2);
                            e eVar2 = ((ImagePickerPlugin) hVar).b;
                            c cVar2 = (eVar2 == null || eVar2.b == null) ? null : eVar2.c;
                            if (cVar2 != null) {
                                Activity activity2 = cVar2.b;
                                Messages.SourceCamera sourceCamera2 = jVar2.b;
                                if (sourceCamera2 != null) {
                                    cVar2.B = d.a[sourceCamera2.ordinal()] != 1 ? ImagePickerDelegate$CameraDevice.REAR : ImagePickerDelegate$CameraDevice.FRONT;
                                }
                                boolean booleanValue4 = ix10Var2.a.booleanValue();
                                e50 e50Var = e50.a;
                                if (!booleanValue4) {
                                    int i4 = d.b[jVar2.a.ordinal()];
                                    if (i4 == 1) {
                                        boolean booleanValue5 = ix10Var2.b.booleanValue();
                                        if (!cVar2.k(null, aVar3, ht10Var)) {
                                            c.a(ht10Var);
                                            break;
                                        } else {
                                            if (booleanValue5) {
                                                g50 g50Var2 = new g50();
                                                zlb0.a aVar4 = new zlb0.a();
                                                aVar4.a = e50Var;
                                                intent3 = g50Var2.a(activity2, aVar4.a());
                                            } else {
                                                intent3 = new Intent("android.intent.action.GET_CONTENT");
                                                intent3.setType("video/*");
                                            }
                                            activity2.startActivityForResult(intent3, 2352);
                                            break;
                                        }
                                    } else if (i4 == 2) {
                                        ol3 ol3Var2 = cVar2.x;
                                        if (!cVar2.k(null, aVar3, ht10Var)) {
                                            c.a(ht10Var);
                                            break;
                                        } else if (cVar2.j() && qke.h(ol3Var2.a, "android.permission.CAMERA") != 0) {
                                            b.J(ol3Var2.a, new String[]{"android.permission.CAMERA"}, 2355);
                                            break;
                                        } else {
                                            cVar2.i();
                                            break;
                                        }
                                    }
                                } else {
                                    int b2 = a5b1.b(ix10Var2);
                                    boolean booleanValue6 = ix10Var2.b.booleanValue();
                                    if (!cVar2.k(null, aVar3, ht10Var)) {
                                        c.a(ht10Var);
                                        break;
                                    } else {
                                        if (booleanValue6) {
                                            b50 b50Var2 = new b50(b2);
                                            zlb0.a aVar5 = new zlb0.a();
                                            aVar5.a = e50Var;
                                            intent4 = b50Var2.a(activity2, aVar5.a());
                                        } else {
                                            intent4 = new Intent("android.intent.action.GET_CONTENT");
                                            intent4.setType("video/*");
                                            intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                        }
                                        activity2.startActivityForResult(intent4, 2348);
                                        break;
                                    }
                                }
                            } else {
                                ht10Var.g(new Messages.FlutterError("no_activity", "image_picker plugin requires a foreground activity."));
                                break;
                            }
                            break;
                        case 2:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj2;
                            mx10 mx10Var = (mx10) arrayList6.get(0);
                            ix10 ix10Var3 = (ix10) arrayList6.get(1);
                            kx10 kx10Var2 = new kx10(arrayList5, ce5Var, 1);
                            e eVar3 = ((ImagePickerPlugin) hVar).b;
                            c cVar3 = (eVar3 == null || eVar3.b == null) ? null : eVar3.c;
                            if (cVar3 != null) {
                                if (!cVar3.k(mx10Var.a, null, kx10Var2)) {
                                    c.a(kx10Var2);
                                    break;
                                } else {
                                    Activity activity3 = cVar3.b;
                                    if (ix10Var3.b.booleanValue()) {
                                        boolean booleanValue7 = ix10Var3.a.booleanValue();
                                        c50 c50Var = c50.a;
                                        if (booleanValue7) {
                                            b50 b50Var3 = new b50(a5b1.b(ix10Var3));
                                            zlb0.a aVar6 = new zlb0.a();
                                            aVar6.a = c50Var;
                                            intent5 = b50Var3.a(activity3, aVar6.a());
                                        } else {
                                            g50 g50Var3 = new g50();
                                            zlb0.a aVar7 = new zlb0.a();
                                            aVar7.a = c50Var;
                                            intent5 = g50Var3.a(activity3, aVar7.a());
                                        }
                                    } else {
                                        intent5 = new Intent("android.intent.action.GET_CONTENT");
                                        intent5.setType("*/*");
                                        intent5.putExtra("CONTENT_TYPE", new String[]{"video/*", "image/*"});
                                        intent5.putExtra("android.intent.extra.ALLOW_MULTIPLE", ix10Var3.a);
                                    }
                                    activity3.startActivityForResult(intent5, 2347);
                                    break;
                                }
                            } else {
                                kx10Var2.g(new Messages.FlutterError("no_activity", "image_picker plugin requires a foreground activity."));
                                break;
                            }
                        default:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, ((ImagePickerPlugin) hVar).b());
                            } catch (Throwable th) {
                                arrayList7 = Messages.a(th);
                            }
                            ce5Var.a(arrayList7);
                            break;
                    }
                }
            });
        } else {
            m2vVar.G(null);
        }
        m2v m2vVar2 = new m2v(tt5Var, "dev.flutter.pigeon.image_picker_android.ImagePickerApi.pickVideos".concat(""), iVar, d);
        if (imagePickerPlugin != null) {
            final int i2 = 1;
            m2vVar2.G(new ee5(imagePickerPlugin) { // from class: jx10
                public final /* synthetic */ h b;

                {
                    this.b = imagePickerPlugin;
                }

                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    Intent intent;
                    Intent intent2;
                    Intent intent3;
                    Intent intent4;
                    Intent intent5;
                    int i22 = i2;
                    h hVar = this.b;
                    switch (i22) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj2;
                            j jVar = (j) arrayList2.get(0);
                            lx10 lx10Var = (lx10) arrayList2.get(1);
                            ix10 ix10Var = (ix10) arrayList2.get(2);
                            kx10 kx10Var = new kx10(arrayList, ce5Var, 0);
                            e eVar = ((ImagePickerPlugin) hVar).b;
                            c cVar = (eVar == null || eVar.b == null) ? null : eVar.c;
                            if (cVar != null) {
                                Activity activity = cVar.b;
                                Messages.SourceCamera sourceCamera = jVar.b;
                                if (sourceCamera != null) {
                                    cVar.B = d.a[sourceCamera.ordinal()] != 1 ? ImagePickerDelegate$CameraDevice.REAR : ImagePickerDelegate$CameraDevice.FRONT;
                                }
                                boolean booleanValue = ix10Var.a.booleanValue();
                                d50 d50Var = d50.a;
                                if (!booleanValue) {
                                    int i3 = d.b[jVar.a.ordinal()];
                                    if (i3 == 1) {
                                        boolean booleanValue2 = ix10Var.b.booleanValue();
                                        if (!cVar.k(lx10Var, null, kx10Var)) {
                                            c.a(kx10Var);
                                            break;
                                        } else {
                                            if (booleanValue2) {
                                                g50 g50Var = new g50();
                                                zlb0.a aVar = new zlb0.a();
                                                aVar.a = d50Var;
                                                intent = g50Var.a(activity, aVar.a());
                                            } else {
                                                intent = new Intent("android.intent.action.GET_CONTENT");
                                                intent.setType("image/*");
                                            }
                                            activity.startActivityForResult(intent, 2342);
                                            break;
                                        }
                                    } else if (i3 == 2) {
                                        ol3 ol3Var = cVar.x;
                                        if (!cVar.k(lx10Var, null, kx10Var)) {
                                            c.a(kx10Var);
                                            break;
                                        } else if (cVar.j() && qke.h(ol3Var.a, "android.permission.CAMERA") != 0) {
                                            b.J(ol3Var.a, new String[]{"android.permission.CAMERA"}, 2345);
                                            break;
                                        } else {
                                            cVar.h();
                                            break;
                                        }
                                    }
                                } else {
                                    int b = a5b1.b(ix10Var);
                                    boolean booleanValue3 = ix10Var.b.booleanValue();
                                    if (!cVar.k(lx10Var, null, kx10Var)) {
                                        c.a(kx10Var);
                                        break;
                                    } else {
                                        if (booleanValue3) {
                                            b50 b50Var = new b50(b);
                                            zlb0.a aVar2 = new zlb0.a();
                                            aVar2.a = d50Var;
                                            intent2 = b50Var.a(activity, aVar2.a());
                                        } else {
                                            intent2 = new Intent("android.intent.action.GET_CONTENT");
                                            intent2.setType("image/*");
                                            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                        }
                                        activity.startActivityForResult(intent2, 2346);
                                        break;
                                    }
                                }
                            } else {
                                kx10Var.g(new Messages.FlutterError("no_activity", "image_picker plugin requires a foreground activity."));
                                break;
                            }
                            break;
                        case 1:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            j jVar2 = (j) arrayList4.get(0);
                            Messages.a aVar3 = (Messages.a) arrayList4.get(1);
                            ix10 ix10Var2 = (ix10) arrayList4.get(2);
                            ht10 ht10Var = new ht10(arrayList3, ce5Var, false, 2);
                            e eVar2 = ((ImagePickerPlugin) hVar).b;
                            c cVar2 = (eVar2 == null || eVar2.b == null) ? null : eVar2.c;
                            if (cVar2 != null) {
                                Activity activity2 = cVar2.b;
                                Messages.SourceCamera sourceCamera2 = jVar2.b;
                                if (sourceCamera2 != null) {
                                    cVar2.B = d.a[sourceCamera2.ordinal()] != 1 ? ImagePickerDelegate$CameraDevice.REAR : ImagePickerDelegate$CameraDevice.FRONT;
                                }
                                boolean booleanValue4 = ix10Var2.a.booleanValue();
                                e50 e50Var = e50.a;
                                if (!booleanValue4) {
                                    int i4 = d.b[jVar2.a.ordinal()];
                                    if (i4 == 1) {
                                        boolean booleanValue5 = ix10Var2.b.booleanValue();
                                        if (!cVar2.k(null, aVar3, ht10Var)) {
                                            c.a(ht10Var);
                                            break;
                                        } else {
                                            if (booleanValue5) {
                                                g50 g50Var2 = new g50();
                                                zlb0.a aVar4 = new zlb0.a();
                                                aVar4.a = e50Var;
                                                intent3 = g50Var2.a(activity2, aVar4.a());
                                            } else {
                                                intent3 = new Intent("android.intent.action.GET_CONTENT");
                                                intent3.setType("video/*");
                                            }
                                            activity2.startActivityForResult(intent3, 2352);
                                            break;
                                        }
                                    } else if (i4 == 2) {
                                        ol3 ol3Var2 = cVar2.x;
                                        if (!cVar2.k(null, aVar3, ht10Var)) {
                                            c.a(ht10Var);
                                            break;
                                        } else if (cVar2.j() && qke.h(ol3Var2.a, "android.permission.CAMERA") != 0) {
                                            b.J(ol3Var2.a, new String[]{"android.permission.CAMERA"}, 2355);
                                            break;
                                        } else {
                                            cVar2.i();
                                            break;
                                        }
                                    }
                                } else {
                                    int b2 = a5b1.b(ix10Var2);
                                    boolean booleanValue6 = ix10Var2.b.booleanValue();
                                    if (!cVar2.k(null, aVar3, ht10Var)) {
                                        c.a(ht10Var);
                                        break;
                                    } else {
                                        if (booleanValue6) {
                                            b50 b50Var2 = new b50(b2);
                                            zlb0.a aVar5 = new zlb0.a();
                                            aVar5.a = e50Var;
                                            intent4 = b50Var2.a(activity2, aVar5.a());
                                        } else {
                                            intent4 = new Intent("android.intent.action.GET_CONTENT");
                                            intent4.setType("video/*");
                                            intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                        }
                                        activity2.startActivityForResult(intent4, 2348);
                                        break;
                                    }
                                }
                            } else {
                                ht10Var.g(new Messages.FlutterError("no_activity", "image_picker plugin requires a foreground activity."));
                                break;
                            }
                            break;
                        case 2:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj2;
                            mx10 mx10Var = (mx10) arrayList6.get(0);
                            ix10 ix10Var3 = (ix10) arrayList6.get(1);
                            kx10 kx10Var2 = new kx10(arrayList5, ce5Var, 1);
                            e eVar3 = ((ImagePickerPlugin) hVar).b;
                            c cVar3 = (eVar3 == null || eVar3.b == null) ? null : eVar3.c;
                            if (cVar3 != null) {
                                if (!cVar3.k(mx10Var.a, null, kx10Var2)) {
                                    c.a(kx10Var2);
                                    break;
                                } else {
                                    Activity activity3 = cVar3.b;
                                    if (ix10Var3.b.booleanValue()) {
                                        boolean booleanValue7 = ix10Var3.a.booleanValue();
                                        c50 c50Var = c50.a;
                                        if (booleanValue7) {
                                            b50 b50Var3 = new b50(a5b1.b(ix10Var3));
                                            zlb0.a aVar6 = new zlb0.a();
                                            aVar6.a = c50Var;
                                            intent5 = b50Var3.a(activity3, aVar6.a());
                                        } else {
                                            g50 g50Var3 = new g50();
                                            zlb0.a aVar7 = new zlb0.a();
                                            aVar7.a = c50Var;
                                            intent5 = g50Var3.a(activity3, aVar7.a());
                                        }
                                    } else {
                                        intent5 = new Intent("android.intent.action.GET_CONTENT");
                                        intent5.setType("*/*");
                                        intent5.putExtra("CONTENT_TYPE", new String[]{"video/*", "image/*"});
                                        intent5.putExtra("android.intent.extra.ALLOW_MULTIPLE", ix10Var3.a);
                                    }
                                    activity3.startActivityForResult(intent5, 2347);
                                    break;
                                }
                            } else {
                                kx10Var2.g(new Messages.FlutterError("no_activity", "image_picker plugin requires a foreground activity."));
                                break;
                            }
                        default:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, ((ImagePickerPlugin) hVar).b());
                            } catch (Throwable th) {
                                arrayList7 = Messages.a(th);
                            }
                            ce5Var.a(arrayList7);
                            break;
                    }
                }
            });
        } else {
            m2vVar2.G(null);
        }
        m2v m2vVar3 = new m2v(tt5Var, "dev.flutter.pigeon.image_picker_android.ImagePickerApi.pickMedia".concat(""), iVar, obj);
        if (imagePickerPlugin != null) {
            final int i3 = 2;
            m2vVar3.G(new ee5(imagePickerPlugin) { // from class: jx10
                public final /* synthetic */ h b;

                {
                    this.b = imagePickerPlugin;
                }

                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    Intent intent;
                    Intent intent2;
                    Intent intent3;
                    Intent intent4;
                    Intent intent5;
                    int i22 = i3;
                    h hVar = this.b;
                    switch (i22) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj2;
                            j jVar = (j) arrayList2.get(0);
                            lx10 lx10Var = (lx10) arrayList2.get(1);
                            ix10 ix10Var = (ix10) arrayList2.get(2);
                            kx10 kx10Var = new kx10(arrayList, ce5Var, 0);
                            e eVar = ((ImagePickerPlugin) hVar).b;
                            c cVar = (eVar == null || eVar.b == null) ? null : eVar.c;
                            if (cVar != null) {
                                Activity activity = cVar.b;
                                Messages.SourceCamera sourceCamera = jVar.b;
                                if (sourceCamera != null) {
                                    cVar.B = d.a[sourceCamera.ordinal()] != 1 ? ImagePickerDelegate$CameraDevice.REAR : ImagePickerDelegate$CameraDevice.FRONT;
                                }
                                boolean booleanValue = ix10Var.a.booleanValue();
                                d50 d50Var = d50.a;
                                if (!booleanValue) {
                                    int i32 = d.b[jVar.a.ordinal()];
                                    if (i32 == 1) {
                                        boolean booleanValue2 = ix10Var.b.booleanValue();
                                        if (!cVar.k(lx10Var, null, kx10Var)) {
                                            c.a(kx10Var);
                                            break;
                                        } else {
                                            if (booleanValue2) {
                                                g50 g50Var = new g50();
                                                zlb0.a aVar = new zlb0.a();
                                                aVar.a = d50Var;
                                                intent = g50Var.a(activity, aVar.a());
                                            } else {
                                                intent = new Intent("android.intent.action.GET_CONTENT");
                                                intent.setType("image/*");
                                            }
                                            activity.startActivityForResult(intent, 2342);
                                            break;
                                        }
                                    } else if (i32 == 2) {
                                        ol3 ol3Var = cVar.x;
                                        if (!cVar.k(lx10Var, null, kx10Var)) {
                                            c.a(kx10Var);
                                            break;
                                        } else if (cVar.j() && qke.h(ol3Var.a, "android.permission.CAMERA") != 0) {
                                            b.J(ol3Var.a, new String[]{"android.permission.CAMERA"}, 2345);
                                            break;
                                        } else {
                                            cVar.h();
                                            break;
                                        }
                                    }
                                } else {
                                    int b = a5b1.b(ix10Var);
                                    boolean booleanValue3 = ix10Var.b.booleanValue();
                                    if (!cVar.k(lx10Var, null, kx10Var)) {
                                        c.a(kx10Var);
                                        break;
                                    } else {
                                        if (booleanValue3) {
                                            b50 b50Var = new b50(b);
                                            zlb0.a aVar2 = new zlb0.a();
                                            aVar2.a = d50Var;
                                            intent2 = b50Var.a(activity, aVar2.a());
                                        } else {
                                            intent2 = new Intent("android.intent.action.GET_CONTENT");
                                            intent2.setType("image/*");
                                            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                        }
                                        activity.startActivityForResult(intent2, 2346);
                                        break;
                                    }
                                }
                            } else {
                                kx10Var.g(new Messages.FlutterError("no_activity", "image_picker plugin requires a foreground activity."));
                                break;
                            }
                            break;
                        case 1:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            j jVar2 = (j) arrayList4.get(0);
                            Messages.a aVar3 = (Messages.a) arrayList4.get(1);
                            ix10 ix10Var2 = (ix10) arrayList4.get(2);
                            ht10 ht10Var = new ht10(arrayList3, ce5Var, false, 2);
                            e eVar2 = ((ImagePickerPlugin) hVar).b;
                            c cVar2 = (eVar2 == null || eVar2.b == null) ? null : eVar2.c;
                            if (cVar2 != null) {
                                Activity activity2 = cVar2.b;
                                Messages.SourceCamera sourceCamera2 = jVar2.b;
                                if (sourceCamera2 != null) {
                                    cVar2.B = d.a[sourceCamera2.ordinal()] != 1 ? ImagePickerDelegate$CameraDevice.REAR : ImagePickerDelegate$CameraDevice.FRONT;
                                }
                                boolean booleanValue4 = ix10Var2.a.booleanValue();
                                e50 e50Var = e50.a;
                                if (!booleanValue4) {
                                    int i4 = d.b[jVar2.a.ordinal()];
                                    if (i4 == 1) {
                                        boolean booleanValue5 = ix10Var2.b.booleanValue();
                                        if (!cVar2.k(null, aVar3, ht10Var)) {
                                            c.a(ht10Var);
                                            break;
                                        } else {
                                            if (booleanValue5) {
                                                g50 g50Var2 = new g50();
                                                zlb0.a aVar4 = new zlb0.a();
                                                aVar4.a = e50Var;
                                                intent3 = g50Var2.a(activity2, aVar4.a());
                                            } else {
                                                intent3 = new Intent("android.intent.action.GET_CONTENT");
                                                intent3.setType("video/*");
                                            }
                                            activity2.startActivityForResult(intent3, 2352);
                                            break;
                                        }
                                    } else if (i4 == 2) {
                                        ol3 ol3Var2 = cVar2.x;
                                        if (!cVar2.k(null, aVar3, ht10Var)) {
                                            c.a(ht10Var);
                                            break;
                                        } else if (cVar2.j() && qke.h(ol3Var2.a, "android.permission.CAMERA") != 0) {
                                            b.J(ol3Var2.a, new String[]{"android.permission.CAMERA"}, 2355);
                                            break;
                                        } else {
                                            cVar2.i();
                                            break;
                                        }
                                    }
                                } else {
                                    int b2 = a5b1.b(ix10Var2);
                                    boolean booleanValue6 = ix10Var2.b.booleanValue();
                                    if (!cVar2.k(null, aVar3, ht10Var)) {
                                        c.a(ht10Var);
                                        break;
                                    } else {
                                        if (booleanValue6) {
                                            b50 b50Var2 = new b50(b2);
                                            zlb0.a aVar5 = new zlb0.a();
                                            aVar5.a = e50Var;
                                            intent4 = b50Var2.a(activity2, aVar5.a());
                                        } else {
                                            intent4 = new Intent("android.intent.action.GET_CONTENT");
                                            intent4.setType("video/*");
                                            intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                        }
                                        activity2.startActivityForResult(intent4, 2348);
                                        break;
                                    }
                                }
                            } else {
                                ht10Var.g(new Messages.FlutterError("no_activity", "image_picker plugin requires a foreground activity."));
                                break;
                            }
                            break;
                        case 2:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj2;
                            mx10 mx10Var = (mx10) arrayList6.get(0);
                            ix10 ix10Var3 = (ix10) arrayList6.get(1);
                            kx10 kx10Var2 = new kx10(arrayList5, ce5Var, 1);
                            e eVar3 = ((ImagePickerPlugin) hVar).b;
                            c cVar3 = (eVar3 == null || eVar3.b == null) ? null : eVar3.c;
                            if (cVar3 != null) {
                                if (!cVar3.k(mx10Var.a, null, kx10Var2)) {
                                    c.a(kx10Var2);
                                    break;
                                } else {
                                    Activity activity3 = cVar3.b;
                                    if (ix10Var3.b.booleanValue()) {
                                        boolean booleanValue7 = ix10Var3.a.booleanValue();
                                        c50 c50Var = c50.a;
                                        if (booleanValue7) {
                                            b50 b50Var3 = new b50(a5b1.b(ix10Var3));
                                            zlb0.a aVar6 = new zlb0.a();
                                            aVar6.a = c50Var;
                                            intent5 = b50Var3.a(activity3, aVar6.a());
                                        } else {
                                            g50 g50Var3 = new g50();
                                            zlb0.a aVar7 = new zlb0.a();
                                            aVar7.a = c50Var;
                                            intent5 = g50Var3.a(activity3, aVar7.a());
                                        }
                                    } else {
                                        intent5 = new Intent("android.intent.action.GET_CONTENT");
                                        intent5.setType("*/*");
                                        intent5.putExtra("CONTENT_TYPE", new String[]{"video/*", "image/*"});
                                        intent5.putExtra("android.intent.extra.ALLOW_MULTIPLE", ix10Var3.a);
                                    }
                                    activity3.startActivityForResult(intent5, 2347);
                                    break;
                                }
                            } else {
                                kx10Var2.g(new Messages.FlutterError("no_activity", "image_picker plugin requires a foreground activity."));
                                break;
                            }
                        default:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, ((ImagePickerPlugin) hVar).b());
                            } catch (Throwable th) {
                                arrayList7 = Messages.a(th);
                            }
                            ce5Var.a(arrayList7);
                            break;
                    }
                }
            });
        } else {
            m2vVar3.G(null);
        }
        m2v m2vVar4 = new m2v(tt5Var, "dev.flutter.pigeon.image_picker_android.ImagePickerApi.retrieveLostResults".concat(""), iVar, d);
        if (imagePickerPlugin == null) {
            m2vVar4.G(null);
        } else {
            final int i4 = 3;
            m2vVar4.G(new ee5(imagePickerPlugin) { // from class: jx10
                public final /* synthetic */ h b;

                {
                    this.b = imagePickerPlugin;
                }

                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    Intent intent;
                    Intent intent2;
                    Intent intent3;
                    Intent intent4;
                    Intent intent5;
                    int i22 = i4;
                    h hVar = this.b;
                    switch (i22) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj2;
                            j jVar = (j) arrayList2.get(0);
                            lx10 lx10Var = (lx10) arrayList2.get(1);
                            ix10 ix10Var = (ix10) arrayList2.get(2);
                            kx10 kx10Var = new kx10(arrayList, ce5Var, 0);
                            e eVar = ((ImagePickerPlugin) hVar).b;
                            c cVar = (eVar == null || eVar.b == null) ? null : eVar.c;
                            if (cVar != null) {
                                Activity activity = cVar.b;
                                Messages.SourceCamera sourceCamera = jVar.b;
                                if (sourceCamera != null) {
                                    cVar.B = d.a[sourceCamera.ordinal()] != 1 ? ImagePickerDelegate$CameraDevice.REAR : ImagePickerDelegate$CameraDevice.FRONT;
                                }
                                boolean booleanValue = ix10Var.a.booleanValue();
                                d50 d50Var = d50.a;
                                if (!booleanValue) {
                                    int i32 = d.b[jVar.a.ordinal()];
                                    if (i32 == 1) {
                                        boolean booleanValue2 = ix10Var.b.booleanValue();
                                        if (!cVar.k(lx10Var, null, kx10Var)) {
                                            c.a(kx10Var);
                                            break;
                                        } else {
                                            if (booleanValue2) {
                                                g50 g50Var = new g50();
                                                zlb0.a aVar = new zlb0.a();
                                                aVar.a = d50Var;
                                                intent = g50Var.a(activity, aVar.a());
                                            } else {
                                                intent = new Intent("android.intent.action.GET_CONTENT");
                                                intent.setType("image/*");
                                            }
                                            activity.startActivityForResult(intent, 2342);
                                            break;
                                        }
                                    } else if (i32 == 2) {
                                        ol3 ol3Var = cVar.x;
                                        if (!cVar.k(lx10Var, null, kx10Var)) {
                                            c.a(kx10Var);
                                            break;
                                        } else if (cVar.j() && qke.h(ol3Var.a, "android.permission.CAMERA") != 0) {
                                            b.J(ol3Var.a, new String[]{"android.permission.CAMERA"}, 2345);
                                            break;
                                        } else {
                                            cVar.h();
                                            break;
                                        }
                                    }
                                } else {
                                    int b = a5b1.b(ix10Var);
                                    boolean booleanValue3 = ix10Var.b.booleanValue();
                                    if (!cVar.k(lx10Var, null, kx10Var)) {
                                        c.a(kx10Var);
                                        break;
                                    } else {
                                        if (booleanValue3) {
                                            b50 b50Var = new b50(b);
                                            zlb0.a aVar2 = new zlb0.a();
                                            aVar2.a = d50Var;
                                            intent2 = b50Var.a(activity, aVar2.a());
                                        } else {
                                            intent2 = new Intent("android.intent.action.GET_CONTENT");
                                            intent2.setType("image/*");
                                            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                        }
                                        activity.startActivityForResult(intent2, 2346);
                                        break;
                                    }
                                }
                            } else {
                                kx10Var.g(new Messages.FlutterError("no_activity", "image_picker plugin requires a foreground activity."));
                                break;
                            }
                            break;
                        case 1:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            j jVar2 = (j) arrayList4.get(0);
                            Messages.a aVar3 = (Messages.a) arrayList4.get(1);
                            ix10 ix10Var2 = (ix10) arrayList4.get(2);
                            ht10 ht10Var = new ht10(arrayList3, ce5Var, false, 2);
                            e eVar2 = ((ImagePickerPlugin) hVar).b;
                            c cVar2 = (eVar2 == null || eVar2.b == null) ? null : eVar2.c;
                            if (cVar2 != null) {
                                Activity activity2 = cVar2.b;
                                Messages.SourceCamera sourceCamera2 = jVar2.b;
                                if (sourceCamera2 != null) {
                                    cVar2.B = d.a[sourceCamera2.ordinal()] != 1 ? ImagePickerDelegate$CameraDevice.REAR : ImagePickerDelegate$CameraDevice.FRONT;
                                }
                                boolean booleanValue4 = ix10Var2.a.booleanValue();
                                e50 e50Var = e50.a;
                                if (!booleanValue4) {
                                    int i42 = d.b[jVar2.a.ordinal()];
                                    if (i42 == 1) {
                                        boolean booleanValue5 = ix10Var2.b.booleanValue();
                                        if (!cVar2.k(null, aVar3, ht10Var)) {
                                            c.a(ht10Var);
                                            break;
                                        } else {
                                            if (booleanValue5) {
                                                g50 g50Var2 = new g50();
                                                zlb0.a aVar4 = new zlb0.a();
                                                aVar4.a = e50Var;
                                                intent3 = g50Var2.a(activity2, aVar4.a());
                                            } else {
                                                intent3 = new Intent("android.intent.action.GET_CONTENT");
                                                intent3.setType("video/*");
                                            }
                                            activity2.startActivityForResult(intent3, 2352);
                                            break;
                                        }
                                    } else if (i42 == 2) {
                                        ol3 ol3Var2 = cVar2.x;
                                        if (!cVar2.k(null, aVar3, ht10Var)) {
                                            c.a(ht10Var);
                                            break;
                                        } else if (cVar2.j() && qke.h(ol3Var2.a, "android.permission.CAMERA") != 0) {
                                            b.J(ol3Var2.a, new String[]{"android.permission.CAMERA"}, 2355);
                                            break;
                                        } else {
                                            cVar2.i();
                                            break;
                                        }
                                    }
                                } else {
                                    int b2 = a5b1.b(ix10Var2);
                                    boolean booleanValue6 = ix10Var2.b.booleanValue();
                                    if (!cVar2.k(null, aVar3, ht10Var)) {
                                        c.a(ht10Var);
                                        break;
                                    } else {
                                        if (booleanValue6) {
                                            b50 b50Var2 = new b50(b2);
                                            zlb0.a aVar5 = new zlb0.a();
                                            aVar5.a = e50Var;
                                            intent4 = b50Var2.a(activity2, aVar5.a());
                                        } else {
                                            intent4 = new Intent("android.intent.action.GET_CONTENT");
                                            intent4.setType("video/*");
                                            intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                        }
                                        activity2.startActivityForResult(intent4, 2348);
                                        break;
                                    }
                                }
                            } else {
                                ht10Var.g(new Messages.FlutterError("no_activity", "image_picker plugin requires a foreground activity."));
                                break;
                            }
                            break;
                        case 2:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj2;
                            mx10 mx10Var = (mx10) arrayList6.get(0);
                            ix10 ix10Var3 = (ix10) arrayList6.get(1);
                            kx10 kx10Var2 = new kx10(arrayList5, ce5Var, 1);
                            e eVar3 = ((ImagePickerPlugin) hVar).b;
                            c cVar3 = (eVar3 == null || eVar3.b == null) ? null : eVar3.c;
                            if (cVar3 != null) {
                                if (!cVar3.k(mx10Var.a, null, kx10Var2)) {
                                    c.a(kx10Var2);
                                    break;
                                } else {
                                    Activity activity3 = cVar3.b;
                                    if (ix10Var3.b.booleanValue()) {
                                        boolean booleanValue7 = ix10Var3.a.booleanValue();
                                        c50 c50Var = c50.a;
                                        if (booleanValue7) {
                                            b50 b50Var3 = new b50(a5b1.b(ix10Var3));
                                            zlb0.a aVar6 = new zlb0.a();
                                            aVar6.a = c50Var;
                                            intent5 = b50Var3.a(activity3, aVar6.a());
                                        } else {
                                            g50 g50Var3 = new g50();
                                            zlb0.a aVar7 = new zlb0.a();
                                            aVar7.a = c50Var;
                                            intent5 = g50Var3.a(activity3, aVar7.a());
                                        }
                                    } else {
                                        intent5 = new Intent("android.intent.action.GET_CONTENT");
                                        intent5.setType("*/*");
                                        intent5.putExtra("CONTENT_TYPE", new String[]{"video/*", "image/*"});
                                        intent5.putExtra("android.intent.extra.ALLOW_MULTIPLE", ix10Var3.a);
                                    }
                                    activity3.startActivityForResult(intent5, 2347);
                                    break;
                                }
                            } else {
                                kx10Var2.g(new Messages.FlutterError("no_activity", "image_picker plugin requires a foreground activity."));
                                break;
                            }
                        default:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, ((ImagePickerPlugin) hVar).b());
                            } catch (Throwable th) {
                                arrayList7 = Messages.a(th);
                            }
                            ce5Var.a(arrayList7);
                            break;
                    }
                }
            });
        }
    }
}
