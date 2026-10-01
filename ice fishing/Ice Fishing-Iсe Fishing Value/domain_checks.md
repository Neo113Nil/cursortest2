# Проверка подозрительных доменов

`config.ru` в APK — это split языка Android (`splits0.xml` key="ru" split="config.ru"), не домен.

## Проверка домена: bluefarets.space

| Параметр / движок | Значение / вердикт |
|---|---|
| Домен | bluefarets.space |
| VirusTotal URL | https://www.virustotal.com/gui/domain/bluefarets.space |
| Детекции | нет |
| Security vendors' analysis | нет |
| Куда редиректит | нет |
| Что выводит (кратко) | GET https://bluefarets.space/status/ping/ без uuid: {"status":"bad_request","code":400,"reason":"invalid_client"} (HTTP 404, application/json, Cloudflare). Корень https://bluefarets.space/: {"error":"Not Found"} |
| Где припаркован | нет (Cloudflare: 104.21.80.40, 172.67.174.15) |
