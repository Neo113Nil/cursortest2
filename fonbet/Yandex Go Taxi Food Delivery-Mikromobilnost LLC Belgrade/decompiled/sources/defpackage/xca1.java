package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.plus.core.graphql.exception.GraphQLException;
import com.yandex.plus.core.graphql.exception.GraphQLHttpException;
import com.yandex.plus.core.graphql.exception.GraphQLNetworkException;
import com.yandex.plus.core.graphql.exception.GraphQLParseException;
import com.yandex.plus.core.graphql.exception.GraphQLUnknownException;
import com.yandex.plus.pay.api.exception.PlusPayApiException;
import com.yandex.plus.pay.api.exception.PlusPayException;
import com.yandex.plus.pay.api.exception.PlusPayNetworkException;
import com.yandex.plus.pay.api.exception.PlusPayParseException;
import com.yandex.plus.pay.api.exception.PlusPayUnauthorizedException;
import com.yandex.plus.pay.api.exception.PlusPayUnexpectedException;
import java.io.IOException;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes2.dex */
public abstract class xca1 {
    public static final int[] a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, Constants.MINIMAL_ERROR_STATUS_CODE, Constants.MINIMAL_ERROR_STATUS_CODE, 2048};

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0086, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008b, code lost:
    
        if (r9 != 8) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static kb a(uh81 uh81Var) {
        int i;
        int i2;
        int a2 = uh81Var.a(16);
        int a3 = uh81Var.a(16);
        if (a3 == 65535) {
            a3 = uh81Var.a(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = a3 + i;
        if (a2 == 44097) {
            i3 += 2;
        }
        if (uh81Var.a(2) == 3) {
            do {
                uh81Var.a(2);
            } while (uh81Var.k());
        }
        int a4 = uh81Var.a(10);
        if (uh81Var.k() && uh81Var.a(3) > 0) {
            uh81Var.h(2);
        }
        int i4 = uh81Var.k() ? 48000 : 44100;
        int a5 = uh81Var.a(4);
        int[] iArr = a;
        if (i4 == 44100 && a5 == 13) {
            i2 = iArr[a5];
        } else if (i4 != 48000 || a5 >= 14) {
            i2 = 0;
        } else {
            int i5 = iArr[a5];
            int i6 = a4 % 5;
            if (i6 != 1) {
                if (i6 == 2) {
                    if (a5 != 8) {
                    }
                    i2 = i5 + 1;
                } else if (i6 != 3) {
                    if (i6 == 4) {
                        if (a5 != 3) {
                            if (a5 != 8) {
                            }
                        }
                        i2 = i5 + 1;
                    }
                    i2 = i5;
                }
            }
            if (a5 != 3) {
            }
            i2 = i5 + 1;
        }
        return new kb(i4, i3, i2);
    }

    public static void b(int i, dl81 dl81Var) {
        dl81Var.i(7);
        byte[] bArr = dl81Var.a;
        bArr[0] = -84;
        bArr[1] = DerValue.TAG_APPLICATION;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    public static void c(u871 u871Var) {
        if (u871Var != null) {
            try {
                u871Var.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final lum d(v8g0 v8g0Var) {
        return new lum(new g990(24), rbg0.a, new qbg0(v8g0Var, 0), sbg0.a);
    }

    public static final PlusPayException e(Throwable th) {
        if (th instanceof PlusPayException) {
            return (PlusPayException) th;
        }
        if (!(th instanceof GraphQLException)) {
            return new PlusPayUnexpectedException(th);
        }
        GraphQLException graphQLException = (GraphQLException) th;
        if (graphQLException instanceof GraphQLHttpException) {
            GraphQLHttpException graphQLHttpException = (GraphQLHttpException) graphQLException;
            if (graphQLHttpException.getCode() == 401) {
                int code = graphQLHttpException.getCode();
                String message = graphQLHttpException.getMessage();
                return new PlusPayUnauthorizedException(new izj0(code, message != null ? message : ""));
            }
            int code2 = graphQLHttpException.getCode();
            String message2 = graphQLHttpException.getMessage();
            return new PlusPayApiException(new ezj0(code2, message2 != null ? message2 : ""));
        }
        if (graphQLException instanceof GraphQLNetworkException) {
            return new PlusPayNetworkException(new fzj0(graphQLException));
        }
        if (graphQLException instanceof GraphQLParseException) {
            return new PlusPayParseException(new gzj0(graphQLException));
        }
        if (graphQLException instanceof GraphQLUnknownException) {
            return new PlusPayNetworkException(new jzj0(graphQLException));
        }
        w511.b();
        return null;
    }
}
