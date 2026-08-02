package defpackage;

import android.content.Intent;
import androidx.browser.customtabs.g;
import io.flutter.plugins.urllauncher.Messages;
import io.flutter.plugins.urllauncher.WebViewActivity;
import io.flutter.plugins.urllauncher.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes4.dex */
public interface tx10 {
    static void a(tt5 tt5Var, final a aVar) {
        String concat = "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.canLaunchUrl".concat("");
        ox10 ox10Var = ox10.d;
        Object obj = null;
        m2v m2vVar = new m2v(tt5Var, concat, ox10Var, obj);
        if (aVar != null) {
            final int i = 0;
            m2vVar.G(new ee5(aVar) { // from class: sx10
                public final /* synthetic */ tx10 b;

                {
                    this.b = aVar;
                }

                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    int i2 = i;
                    boolean z = true;
                    tx10 tx10Var = this.b;
                    switch (i2) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, ((a) tx10Var).b((String) ((ArrayList) obj2).get(0)));
                            } catch (Throwable th) {
                                arrayList = Messages.a(th);
                            }
                            ce5Var.a(arrayList);
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj2;
                            try {
                                arrayList2.add(0, ((a) tx10Var).d((Map) arrayList3.get(1), (String) arrayList3.get(0), (Boolean) arrayList3.get(2)));
                            } catch (Throwable th2) {
                                arrayList2 = Messages.a(th2);
                            }
                            ce5Var.a(arrayList2);
                            break;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj2;
                            try {
                                arrayList4.add(0, ((a) tx10Var).e((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (ux10) arrayList5.get(2), (fx10) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = Messages.a(th3);
                            }
                            ce5Var.a(arrayList4);
                            break;
                        case 3:
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                if (g.a(((a) tx10Var).a, Collections.EMPTY_LIST, false) == null) {
                                    z = false;
                                }
                                arrayList6.add(0, Boolean.valueOf(z));
                            } catch (Throwable th4) {
                                arrayList6 = Messages.a(th4);
                            }
                            ce5Var.a(arrayList6);
                            break;
                        default:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                ((a) tx10Var).a.sendBroadcast(new Intent(WebViewActivity.ACTION_CLOSE));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = Messages.a(th5);
                            }
                            ce5Var.a(arrayList7);
                            break;
                    }
                }
            });
        } else {
            m2vVar.G(null);
        }
        m2v m2vVar2 = new m2v(tt5Var, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.launchUrl".concat(""), ox10Var, obj);
        if (aVar != null) {
            final int i2 = 1;
            m2vVar2.G(new ee5(aVar) { // from class: sx10
                public final /* synthetic */ tx10 b;

                {
                    this.b = aVar;
                }

                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    int i22 = i2;
                    boolean z = true;
                    tx10 tx10Var = this.b;
                    switch (i22) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, ((a) tx10Var).b((String) ((ArrayList) obj2).get(0)));
                            } catch (Throwable th) {
                                arrayList = Messages.a(th);
                            }
                            ce5Var.a(arrayList);
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj2;
                            try {
                                arrayList2.add(0, ((a) tx10Var).d((Map) arrayList3.get(1), (String) arrayList3.get(0), (Boolean) arrayList3.get(2)));
                            } catch (Throwable th2) {
                                arrayList2 = Messages.a(th2);
                            }
                            ce5Var.a(arrayList2);
                            break;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj2;
                            try {
                                arrayList4.add(0, ((a) tx10Var).e((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (ux10) arrayList5.get(2), (fx10) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = Messages.a(th3);
                            }
                            ce5Var.a(arrayList4);
                            break;
                        case 3:
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                if (g.a(((a) tx10Var).a, Collections.EMPTY_LIST, false) == null) {
                                    z = false;
                                }
                                arrayList6.add(0, Boolean.valueOf(z));
                            } catch (Throwable th4) {
                                arrayList6 = Messages.a(th4);
                            }
                            ce5Var.a(arrayList6);
                            break;
                        default:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                ((a) tx10Var).a.sendBroadcast(new Intent(WebViewActivity.ACTION_CLOSE));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = Messages.a(th5);
                            }
                            ce5Var.a(arrayList7);
                            break;
                    }
                }
            });
        } else {
            m2vVar2.G(null);
        }
        m2v m2vVar3 = new m2v(tt5Var, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.openUrlInApp".concat(""), ox10Var, obj);
        if (aVar != null) {
            final int i3 = 2;
            m2vVar3.G(new ee5(aVar) { // from class: sx10
                public final /* synthetic */ tx10 b;

                {
                    this.b = aVar;
                }

                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    int i22 = i3;
                    boolean z = true;
                    tx10 tx10Var = this.b;
                    switch (i22) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, ((a) tx10Var).b((String) ((ArrayList) obj2).get(0)));
                            } catch (Throwable th) {
                                arrayList = Messages.a(th);
                            }
                            ce5Var.a(arrayList);
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj2;
                            try {
                                arrayList2.add(0, ((a) tx10Var).d((Map) arrayList3.get(1), (String) arrayList3.get(0), (Boolean) arrayList3.get(2)));
                            } catch (Throwable th2) {
                                arrayList2 = Messages.a(th2);
                            }
                            ce5Var.a(arrayList2);
                            break;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj2;
                            try {
                                arrayList4.add(0, ((a) tx10Var).e((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (ux10) arrayList5.get(2), (fx10) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = Messages.a(th3);
                            }
                            ce5Var.a(arrayList4);
                            break;
                        case 3:
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                if (g.a(((a) tx10Var).a, Collections.EMPTY_LIST, false) == null) {
                                    z = false;
                                }
                                arrayList6.add(0, Boolean.valueOf(z));
                            } catch (Throwable th4) {
                                arrayList6 = Messages.a(th4);
                            }
                            ce5Var.a(arrayList6);
                            break;
                        default:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                ((a) tx10Var).a.sendBroadcast(new Intent(WebViewActivity.ACTION_CLOSE));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = Messages.a(th5);
                            }
                            ce5Var.a(arrayList7);
                            break;
                    }
                }
            });
        } else {
            m2vVar3.G(null);
        }
        m2v m2vVar4 = new m2v(tt5Var, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.supportsCustomTabs".concat(""), ox10Var, obj);
        if (aVar != null) {
            final int i4 = 3;
            m2vVar4.G(new ee5(aVar) { // from class: sx10
                public final /* synthetic */ tx10 b;

                {
                    this.b = aVar;
                }

                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    int i22 = i4;
                    boolean z = true;
                    tx10 tx10Var = this.b;
                    switch (i22) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, ((a) tx10Var).b((String) ((ArrayList) obj2).get(0)));
                            } catch (Throwable th) {
                                arrayList = Messages.a(th);
                            }
                            ce5Var.a(arrayList);
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj2;
                            try {
                                arrayList2.add(0, ((a) tx10Var).d((Map) arrayList3.get(1), (String) arrayList3.get(0), (Boolean) arrayList3.get(2)));
                            } catch (Throwable th2) {
                                arrayList2 = Messages.a(th2);
                            }
                            ce5Var.a(arrayList2);
                            break;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj2;
                            try {
                                arrayList4.add(0, ((a) tx10Var).e((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (ux10) arrayList5.get(2), (fx10) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = Messages.a(th3);
                            }
                            ce5Var.a(arrayList4);
                            break;
                        case 3:
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                if (g.a(((a) tx10Var).a, Collections.EMPTY_LIST, false) == null) {
                                    z = false;
                                }
                                arrayList6.add(0, Boolean.valueOf(z));
                            } catch (Throwable th4) {
                                arrayList6 = Messages.a(th4);
                            }
                            ce5Var.a(arrayList6);
                            break;
                        default:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                ((a) tx10Var).a.sendBroadcast(new Intent(WebViewActivity.ACTION_CLOSE));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = Messages.a(th5);
                            }
                            ce5Var.a(arrayList7);
                            break;
                    }
                }
            });
        } else {
            m2vVar4.G(null);
        }
        m2v m2vVar5 = new m2v(tt5Var, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.closeWebView".concat(""), ox10Var, obj);
        if (aVar == null) {
            m2vVar5.G(null);
        } else {
            final int i5 = 4;
            m2vVar5.G(new ee5(aVar) { // from class: sx10
                public final /* synthetic */ tx10 b;

                {
                    this.b = aVar;
                }

                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    int i22 = i5;
                    boolean z = true;
                    tx10 tx10Var = this.b;
                    switch (i22) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, ((a) tx10Var).b((String) ((ArrayList) obj2).get(0)));
                            } catch (Throwable th) {
                                arrayList = Messages.a(th);
                            }
                            ce5Var.a(arrayList);
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj2;
                            try {
                                arrayList2.add(0, ((a) tx10Var).d((Map) arrayList3.get(1), (String) arrayList3.get(0), (Boolean) arrayList3.get(2)));
                            } catch (Throwable th2) {
                                arrayList2 = Messages.a(th2);
                            }
                            ce5Var.a(arrayList2);
                            break;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj2;
                            try {
                                arrayList4.add(0, ((a) tx10Var).e((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (ux10) arrayList5.get(2), (fx10) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = Messages.a(th3);
                            }
                            ce5Var.a(arrayList4);
                            break;
                        case 3:
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                if (g.a(((a) tx10Var).a, Collections.EMPTY_LIST, false) == null) {
                                    z = false;
                                }
                                arrayList6.add(0, Boolean.valueOf(z));
                            } catch (Throwable th4) {
                                arrayList6 = Messages.a(th4);
                            }
                            ce5Var.a(arrayList6);
                            break;
                        default:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                ((a) tx10Var).a.sendBroadcast(new Intent(WebViewActivity.ACTION_CLOSE));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = Messages.a(th5);
                            }
                            ce5Var.a(arrayList7);
                            break;
                    }
                }
            });
        }
    }
}
