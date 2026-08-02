package ru.CryptoPro.JCSP.tools.common.window;

import java.util.concurrent.CountDownLatch;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

/* loaded from: classes4.dex */
public class DialogTransport implements IDialogId {
    private final CountDownLatch latch;
    private String password;
    private int result = 1;

    public DialogTransport(CountDownLatch countDownLatch) {
        this.latch = countDownLatch;
    }

    public CountDownLatch getLatch() {
        return this.latch;
    }

    public String getPassword() {
        return this.password;
    }

    public int getResult() {
        return this.result;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public void setResult(int i) {
        this.result = i;
    }
}
