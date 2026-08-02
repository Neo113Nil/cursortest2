package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.o;
import androidx.fragment.app.t;
import com.connectsdk.service.command.ServiceCommand;
import com.facebook.CustomTabMainActivity;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public class ftg extends o {
    public String g;
    public ctg h;
    public atg i;

    @Override // androidx.fragment.app.o
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ctg ctgVar = this.h;
        ctgVar.k++;
        if (ctgVar.g != null) {
            if (intent != null) {
                int i3 = CustomTabMainActivity.c;
                if (intent.getBooleanExtra("CustomTabMainActivity.no_activity_exception", false)) {
                    ctgVar.k();
                    return;
                }
            }
            ytg g = ctgVar.g();
            g.getClass();
            if ((g instanceof y9f) && intent == null && ctgVar.k < ctgVar.l) {
                return;
            }
            ctgVar.g().l(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        Bundle bundleExtra;
        super.onCreate(bundle);
        if (bundle != null) {
            ctg ctgVar = (ctg) bundle.getParcelable("loginClient");
            this.h = ctgVar;
            if (ctgVar.c != null) {
                throw new c3c("Can't set fragment once it is already set.");
            }
            ctgVar.c = this;
        } else {
            ctg ctgVar2 = new ctg();
            ctgVar2.b = -1;
            ctgVar2.k = 0;
            ctgVar2.l = 0;
            ctgVar2.c = this;
            this.h = ctgVar2;
        }
        this.h.d = new g8c(this);
        t l = l();
        if (l == null) {
            return;
        }
        ComponentName callingActivity = l.getCallingActivity();
        if (callingActivity != null) {
            this.g = callingActivity.getPackageName();
        }
        Intent intent = l.getIntent();
        if (intent == null || (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) == null) {
            return;
        }
        this.i = (atg) bundleExtra.getParcelable(ServiceCommand.TYPE_REQ);
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.com_facebook_login_fragment, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.com_facebook_login_fragment_progress_bar);
        this.h.e = new qzc(10, findViewById);
        return inflate;
    }

    @Override // androidx.fragment.app.o
    public final void onDestroy() {
        ctg ctgVar = this.h;
        if (ctgVar.b >= 0) {
            ctgVar.g().d();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.o
    public final void onPause() {
        super.onPause();
        View findViewById = getView() == null ? null : getView().findViewById(R.id.com_facebook_login_fragment_progress_bar);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.o
    public final void onResume() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        super.onResume();
        if (this.g == null) {
            Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            l().finish();
            return;
        }
        ctg ctgVar = this.h;
        atg atgVar = this.i;
        atg atgVar2 = ctgVar.g;
        if ((atgVar2 == null || ctgVar.b < 0) && atgVar != null) {
            int i = atgVar.l;
            if (atgVar2 != null) {
                throw new c3c("Attempted to authorize while a request is pending.");
            }
            Date date = ja.l;
            if (!n7w.P() || ctgVar.d()) {
                ctgVar.g = atgVar;
                ArrayList arrayList = new ArrayList();
                int i2 = atgVar.a;
                boolean z6 = true;
                if (i != 2) {
                    switch (i2) {
                        case 1:
                        case 2:
                            z = true;
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            z = false;
                            break;
                        default:
                            throw null;
                    }
                    if (z) {
                        dcd dcdVar = new dcd();
                        dcdVar.b = ctgVar;
                        arrayList.add(dcdVar);
                    }
                    if (!j3c.m) {
                        switch (i2) {
                            case 1:
                            case 2:
                            case 3:
                            case 6:
                                z3 = true;
                                break;
                            case 4:
                            case 5:
                            case 7:
                                z3 = false;
                                break;
                            default:
                                throw null;
                        }
                        if (z3) {
                            y9f y9fVar = new y9f();
                            y9fVar.b = ctgVar;
                            arrayList.add(y9fVar);
                        }
                    }
                    if (!j3c.m) {
                        switch (i2) {
                            case 1:
                            case 2:
                            case 6:
                                z2 = true;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 7:
                                z2 = false;
                                break;
                            default:
                                throw null;
                        }
                        if (z2) {
                            e3c e3cVar = new e3c();
                            e3cVar.b = ctgVar;
                            arrayList.add(e3cVar);
                        }
                    }
                } else if (!j3c.m) {
                    switch (i2) {
                        case 1:
                        case 2:
                        case 6:
                            z5 = true;
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 7:
                            z5 = false;
                            break;
                        default:
                            throw null;
                    }
                    if (z5) {
                        moe moeVar = new moe();
                        moeVar.b = ctgVar;
                        arrayList.add(moeVar);
                    }
                }
                if (hrg.c(i2)) {
                    ctgVar.getClass();
                    jx6 jx6Var = new jx6();
                    jx6Var.b = ctgVar;
                    jx6Var.f = "";
                    String bigInteger = new BigInteger(100, new Random()).toString(32);
                    bigInteger.getClass();
                    jx6Var.e = bigInteger;
                    jx6.g = false;
                    jx6Var.f = ox6.H("fb" + j3c.c() + "://authorize/");
                    arrayList.add(jx6Var);
                }
                switch (i2) {
                    case 1:
                    case 4:
                    case 5:
                    case 6:
                        z4 = true;
                        break;
                    case 2:
                    case 3:
                    case 7:
                        z4 = false;
                        break;
                    default:
                        throw null;
                }
                if (z4) {
                    pev pevVar = new pev();
                    pevVar.b = ctgVar;
                    arrayList.add(pevVar);
                }
                if (i != 2) {
                    switch (i2) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            z6 = false;
                        case 7:
                            if (z6) {
                                c08 c08Var = new c08();
                                c08Var.b = ctgVar;
                                arrayList.add(c08Var);
                                break;
                            }
                            break;
                        default:
                            throw null;
                    }
                }
                ytg[] ytgVarArr = new ytg[arrayList.size()];
                arrayList.toArray(ytgVarArr);
                ctgVar.a = ytgVarArr;
                ctgVar.k();
            }
        }
    }

    @Override // androidx.fragment.app.o
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("loginClient", this.h);
    }
}
