package defpackage;

import com.yandex.messaging.auth.AuthEnvironment;

/* loaded from: classes15.dex */
public final class ym3 extends bn3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ ym3(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.cn3
    public cn3 h(String str, AuthEnvironment authEnvironment) {
        switch (this.a) {
            case 0:
                if (authEnvironment != AuthEnvironment.TeamProduction) {
                    return new an3(this.b, str);
                }
                ny61.k();
                return null;
            default:
                return super.h(str, authEnvironment);
        }
    }

    @Override // defpackage.bn3
    public final String j() {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                return "YAMBAUTH " + str;
            default:
                return "OAuthTeam " + str;
        }
    }

    @Override // defpackage.bn3
    public final String k() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // defpackage.bn3
    public boolean l() {
        switch (this.a) {
            case 1:
                return true;
            default:
                return super.l();
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "YAMBAUTH token";
            default:
                return "OAuthTeam token";
        }
    }
}
